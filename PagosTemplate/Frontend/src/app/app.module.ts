import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule }   from '@angular/router';

import { UserService } from './user.service';

import { ModalModule } from 'angular2-modal';
import { BootstrapModalModule } from 'angular2-modal/plugins/bootstrap';

import { AngularFireModule, AuthMethods, AuthProviders } from 'angularfire2';

export const firebaseConfig = {
    apiKey: "AIzaSyBum3m_3TdfiQnWHchNdd2mrWK4ql2A7lc",
    authDomain: "angularcli-firebase.firebaseapp.com",
    databaseURL: "https://angularcli-firebase.firebaseio.com",
    storageBucket: "",
    messagingSenderId: "611830520627"
};

const myFirebaseAuthConfig = {
  provider: AuthProviders.Password,
  method: AuthMethods.Password
};

import { AppComponent } from './app.component';
import { FireLoginComponent } from './fire-login/fire-login.component';
import { HomepageComponent } from './homepage/homepage.component';

@NgModule({
  declarations: [
    AppComponent,
    FireLoginComponent,
    HomepageComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      {
        path: '',
        redirectTo: '/login',
        pathMatch: 'full'
      },
      {
        path: 'login',
        component: FireLoginComponent
      },
      {
        path: 'homepage',
        component: HomepageComponent
      }
    ]),
    HttpModule,
    ModalModule.forRoot(),
    BootstrapModalModule,
    AngularFireModule.initializeApp(firebaseConfig, myFirebaseAuthConfig)
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
