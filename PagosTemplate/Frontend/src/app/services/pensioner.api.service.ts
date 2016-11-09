import { Injectable } from '@angular/core';
import { Http, Response} from '@angular/http';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Rx';

import { IEntity } from '../sharedresources/interfaces'

@Injectable()
export class PensionerApiService {
    private url: string = 'PilaPayments/api/entities';

    constructor(private http: Http) {
    }

     getPensioners(userId: String ): Observable<IEntity> {
        var urlGet;
        if (userId === '*') {
            urlGet = this.url;
        }
        else {
            urlGet = this.url + "?" + userId;
        }
        console.log("Entidad URL:" + urlGet); 
        return this.http.get(urlGet).map(this.extractData);
    }

    getPensionersByLegalId(legalIdCard: String ): Observable<IEntity> {
        var urlGet;
        urlGet = this.url + "?legalIdCard=" + legalIdCard;
        return this.http.get(urlGet).map(this.extractData);
    }
    
    saveEntity(entity: IEntity) {
      console.log("Salvando Entidad:" +  JSON.stringify(entity));  
      return this.http.post(this.url, entity)
            .map(this.extractData)
            .catch(this.handleError);
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
    
    getMultiLov(lovAddr: string) {
        console.log("getMultiLov:" + lovAddr);
        let url = this.url + lovAddr;
        console.log("MultiLov Addr:" + url);
        return this.http.get(url).map(this.extractData);
    }

}
