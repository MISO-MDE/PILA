import { Injectable } from '@angular/core';
import { Http, Response} from '@angular/http';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Rx';

import { ISuperEntity } from '../sharedresources/interfaces'

@Injectable()
export class IntermediaryApiService {
    private url: string = 'PilaPayments/api/superentities';

    constructor(private http: Http) {
    }

     getSuperEntityData(userId: String ): Observable<ISuperEntity> {
        var urlGet;
        if (userId === '*') {
            urlGet = this.url;
        }
        else {
            urlGet = this.url + "?" + userId;
        }


        console.log("getSuperEntityData: " + urlGet);
        return this.http.get(urlGet).map(this.extractData);
    }

    saveSuperEntity(superEntity: ISuperEntity) {
      return this.http.post(this.url, superEntity)
            .map(this.extractData)
            .catch(this.handleError);
    }

    deleteSuperEntity(id: string) {
      let options = {id: id};
      return this.http.delete(this.url+"/"+id)
        .map(this.extractData)
        .catch(this.handleError);
    }


    getEconnActivities (){
      let url ="PilaPayments/api/superentities/eactivities";
      return this.http.get(url).map(this.extractData);
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
