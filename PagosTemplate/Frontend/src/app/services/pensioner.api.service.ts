import { Injectable } from '@angular/core';
import { Http, Response} from '@angular/http';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Rx';

import { ISuperEntity } from '../sharedresources/interfaces'

@Injectable()
export class PensionerApiService {
    private url: string = 'PilaPayments/api/pensioners';

    constructor(private http: Http) {
    }

     getPensioners(userId: String ): Observable<ISuperEntity> {
        var urlGet;
        if (userId === '*') {
            urlGet = this.url;
        }
        else {
            urlGet = this.url + "?" + userId;
        }
        return this.http.get(urlGet).map(this.extractData);
    }

    getPensionersByLegalId(legalIdCard: String ): Observable<ISuperEntity> {
        var urlGet;
        urlGet = this.url + "?legalIdCard=" + legalIdCard;
        return this.http.get(urlGet).map(this.extractData);
    }


    private extractData(res: Response) {
        let body;
        // check if empty, before call json
        if (res.text()) {
            console.log("RETORNO SERVICIO" + JSON.stringify(res));
            body = res.json();
            console.log("Entity Return:" + JSON.stringify(body));
        }
        return body || {};
    }

    handleError(error: any): any {
        console.error("ERROR REST: " + error);
        return Observable.throw(error || 'Server error');
    }
}
