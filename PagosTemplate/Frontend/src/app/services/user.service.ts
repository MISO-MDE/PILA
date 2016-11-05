import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import { AngularFire, FirebaseRef, AuthMethods, AuthProviders } from 'angularfire2';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Rx';

import { IUser } from '../sharedresources/interfaces'

@Injectable()
export class UserService {

    private url: string = 'http://localhost:8080/PilaPayments/user/users';    

  constructor(private http: Http, public angularFire: AngularFire) {
    }

    loginFirebaseAuth(email: string, password: string) {
        console.log ("EN loginFirebaseAuth " + email + ' PWD ' + password);  
        var creds: any = { email: email, password: password };
        
        var res: Promise<boolean> = new Promise((resolve, reject) => {
            this.angularFire.auth.login(creds, 4).then(result => {
                console.log("THEN angularFire.auth.login " + JSON.stringify(result));
                resolve(result);
            }).catch((error => {
                console.log("CATCH ERROR angularFire.auth.login " + JSON.stringify(error));
                //reject(error);
            }));
        });
        return res;
    }

    getUserData(userId: String): Observable<IUser> {
        let urlGet = this.url + "?" + userId;
        console.log("User Data Exec: " + urlGet);
        return this.http.get(urlGet).map(this.extractData);
    }

    saveUser() {
      var body = '{"userId":"998","roleName":"SuperEntidad"}'
      
      var headers = new Headers();
      headers.append('Content-Type', 'application/json');
      
      return this.http.post(this.url, body, {
            headers: headers
            })
            .map(this.extractData)
            .catch(this.handleError);

    }

    private extractData(res: Response) {
        let body;
        // check if empty, before call json
        if (res.text()) {
            console.log("RETORNO SERVICIO" + JSON.stringify(res));
            body = res.json();
        }

        return body || {};
    }

    handleError(error: any): any {
        console.error("ERROR REST: " + error);
        return Observable.throw(error || 'Server error');
    }

}
