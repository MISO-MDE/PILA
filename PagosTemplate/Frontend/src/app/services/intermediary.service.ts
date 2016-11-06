import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Rx';

import { ISuperEntity } from '../sharedresources/interfaces'

@Injectable()
export class IntermediaryService {
    private url: string = 'http://localhost:8080/PilaPayments/intermediary/superentities';

    constructor(private http: Http) {
    }
    
    saveSuperEntity(superEntity: ISuperEntity) {
      return this.http.post(this.url, superEntity)
            .map(this.extractData)
            .catch(this.handleError);
    }

    private extractData(res: Response) {
        let body;
        // check if empty, before call json
        if (res.text()) {
            console.log("RETORNO SERVICIO" + JSON.stringify(res));
            body = res.json();
            console.log("Entity Id:" + body.id);
        }

        return body || {};
    }

    handleError(error: any): any {
        console.error("ERROR REST: " + error);
        return Observable.throw(error || 'Server error');
    }    
}