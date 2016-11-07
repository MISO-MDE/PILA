import { Component, OnInit } from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";
import {PaymentFormComponent} from "../payment-form/payment-form.component";

@Component({
  selector: 'app-payments',
  templateUrl: './payments.component.html',
  styleUrls: ['./payments.component.less']
})
export class PaymentsComponent implements OnInit {

  constructor(private asideService: PAsideService) { }

  ngOnInit() {
    this.asideService.showAside(PaymentFormComponent);
  }

}
