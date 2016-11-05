import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import { AngularFire, FirebaseRef, AuthMethods, AuthProviders } from 'angularfire2';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import { Observable } from 'rxjs/Rx';

@Injectable()
export class UserService {

    private url: string = 'http://localhost:8080/PilaPayments/user/users';    

  constructor(private http: Http, public angularFire: AngularFire) {
    }

    loginFirebaseAuth(email: string, password: string) {
        console.log ("EN lloginFirebaseAuth " + email + ' PWD ' + password);  
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

    saveUser() {
      var body = ''; //'userId=998&name=GBCON&isSuperEntity=Entity';
      var headers = new Headers();
      
      
      //headers.append('Access-Control-Allow-Headers', "Cache-Control, Pragma, Origin, Authorization, Content-Type, X-Requested-With");
      //headers.append('Access-Control-Allow-Methods', 'GET, PUT, POST');
      //headers.append('Content-Type', 'application/x-www-form-urlencoded');
      //headers.append('Access-Control-Allow-Origin', "*");
      

      
      return this.http.post(this.url, body, {
            headers: headers
            }).map(this.extractData);

           
        /*return this.http.post(this.url, body, {
            headers: headers
            })
            .map(res => res.text())
            .catch(this.handleError);*/

/*
            return this.http.post(this.url, body, {
            headers: headers
            })
            .map(res => res.text() this.extractData)
            .catch(this.handleError);
*/
    }

    private extractData(res: Response) {
        let body;
         console.log("RETORNO SERVICIO");
        // check if empty, before call json
        if (res.text()) {
            console.log("RETORNO SERVICIO" + res.text());
            //body = res.json();
        }

        return body || {};
    }

    handleError(error: any): any {
        console.error("ERROR REST: " + error);
        return Observable.throw(error || 'Server error');
    }

}
