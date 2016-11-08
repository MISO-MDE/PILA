import { Injectable } from '@angular/core';
import { Http, Response} from '@angular/http';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Rx';

import {IPayment} from '../sharedresources/interfaces';

@Injectable()
export class PaymentApiService {
    private url: string = 'PilaPayments/api/';

    constructor(private http: Http) {
    }

     getPayments(userId: String ): Observable<any> {
        var urlGet;
        
        if (userId === '*') {
            urlGet = this.url + 'payment';
        }
        else {
            urlGet = this.url + "payment?" + userId;
        }
        return this.http.get(urlGet).map(this.extractData);
    }

    getPaymentCalculation(): Observable<IPayment> {
        var urlGet;
        urlGet = this.url + "calculation";
        console.log("getCalculatinData: " + urlGet);
        return this.http.get(urlGet).map(this.extractData);
    }


    private extractData(res: Response) {
        let body;
        // check if empty, before call json
        if (res.text()) {
            console.error("retorno" + JSON.stringify(res));
            body = res.json();
        }
        return body || {};
    }

    handleError(error: any): any {
        console.error("ERROR REST: " + error);
        return Observable.throw(error || 'Server error');
    }
}
