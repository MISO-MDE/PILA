import {Component, OnInit} from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";
import {PaymentFormComponent} from "../payment-form/payment-form.component";
import {PaymentApiService} from "../services/payment.api.service";
import {PaymentsService} from "./payments.service";

@Component({
  selector: 'app-payments',
  templateUrl: './payments.component.html',
  styleUrls: ['./payments.component.less']
})
export class PaymentsComponent implements OnInit {

  constructor(private asideService: PAsideService,
              private paymentsService: PaymentsService) {
  }

  ngOnInit() {
    this.asideService.showAside(PaymentFormComponent);
    this.paymentsService.loadPayments();
  }

  public editRow(row: any) {
    console.log(row);
  }

  public deleteRow(row: any) {
    console.log(row);
  }

  public getRowData(row, data) {
    return row [data];
  }

}
