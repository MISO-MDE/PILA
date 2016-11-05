import { Component, OnInit, ViewContainerRef, ViewEncapsulation} from '@angular/core';

import { Overlay } from 'angular2-modal';
import { Modal } from 'angular2-modal/plugins/bootstrap';
import { Router } from '@angular/router';

import { AngularFire, FirebaseRef } from 'angularfire2';
import { UserService } from '../user.service';



@Component({
  selector: 'app-fire-login',
  templateUrl: './fire-login.component.html',
  styleUrls: ['./fire-login.component.css']
})
export class FireLoginComponent implements OnInit {
  
  public login: string;
  public password: string;
  
  constructor(private userService : UserService, overlay: Overlay, vcRef: ViewContainerRef, public modal: Modal,
              private router: Router, // Variable para que angular sepa donde navegar
            ) { 
    overlay.defaultViewContainer = vcRef;
  }

  ngOnInit() {
  }

  logInUser(): void {
    var res: any;
    console.log ("**Login User " + this.login + ' PWD ' + this.password);  
     
    this.userService.loginFirebaseAuth(this.login, this.password).then((res: any) => {
            if(res.uid) {
              let link = ['/homepage']; // Link con los detalles
              this.router.navigate(link); // Permite navegar a los detalles con la variable link
            }
    }, (error: any) => {
            console.log ("Error Login ");  
     });
  }
  
  saveUser(): void {
    this.userService.saveUser().subscribe((status: boolean) => {
                if (status) {
                   console.log("REST OK");
                } else {
                    console.log("Problema");
                }
    });
  }
}
