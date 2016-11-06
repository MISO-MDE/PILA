import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule }   from '@angular/router';

import { UserApiService } from './services/user.api.service';
import { IntermediaryApiService } from './services/intermediary.api.service';

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
import { IntermediaryComponent } from './intermediary/intermediary.component';
import { PAsideComponent } from './p-aside/p-aside.component';
import { PHeaderComponent } from './p-header/p-header.component';
import {PAsideService} from "./p-aside/p-aside.service";
import { PDynamicComponent } from './p-dynamic/p-dynamic.component';
import { IntermediaryFormComponent } from './intermediary-form/intermediary-form.component';
import { PaymentFormComponent } from './payment-form/payment-form.component';
import { PaymentsComponent } from './payments/payments.component';
import { NewsComponent } from './news/news.component';
import { NewFormComponent } from './new-form/new-form.component';
import { PensionersComponent } from './pensioners/pensioners.component';
import { PensionerFormComponent } from './pensioner-form/pensioner-form.component';

@NgModule({
  declarations: [
    AppComponent,
    FireLoginComponent,
    HomepageComponent,
    IntermediaryComponent,
    PAsideComponent,
    PHeaderComponent,
    PDynamicComponent,
    IntermediaryFormComponent,
    PaymentFormComponent,
    PaymentsComponent,
    NewsComponent,
    NewFormComponent,
    PensionersComponent,
    PensionerFormComponent
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
      },
      {
        path: 'intermediary/homepage',
        component: IntermediaryComponent
      }
    ]),
    HttpModule,
    ModalModule.forRoot(),
    BootstrapModalModule,
    AngularFireModule.initializeApp(firebaseConfig, myFirebaseAuthConfig)
  ],
  providers: [
    UserApiService,
    PAsideService,
    IntermediaryApiService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
