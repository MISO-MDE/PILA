import {Injectable} from '@angular/core';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable()
export class FireLoginService {
  private userData: any = {};

  constructor() {
  }

  public setUserData(data) {
    this.userData = data;
  }

  public getUserData() {
    return this.userData;
  }
}
