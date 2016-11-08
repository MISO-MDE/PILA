import { Injectable } from '@angular/core';
import { Http, Response} from '@angular/http';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Rx';

@Injectable()
export class PaymentApiService {
    private url: string = 'PilaPayments/api/payment';

    constructor(private http: Http) {
    }

     getPayments(userId: String ): Observable<any> {
        var urlGet;
        if (userId === '*') {
            urlGet = this.url;
        }
        else {
            urlGet = this.url + "?" + userId;
        }
        return this.http.get(urlGet).map(this.extractData);
    }


    private extractData(res: Response) {
        let body;
        // check if empty, before call json
        if (res.text()) {
            body = res.json();
        }
        return body || {};
    }

    handleError(error: any): any {
        console.error("ERROR REST: " + error);
        return Observable.throw(error || 'Server error');
    }
}
