import { Component, OnInit } from '@angular/core';
import {PensionerApiService} from '../services/pensioner.api.service';
import {PaymentApiService} from '../services/payment.api.service';

import {Entity} from '../sharedresources/classes';

@Component({
  selector: 'app-payment-form',
  templateUrl: './payment-form.component.html',
  styleUrls: ['./payment-form.component.less']
})
export class PaymentFormComponent implements OnInit {

  public cedula: string;
  public firstName: string;
  public lastName: string;
  public subTotal1: number;
  public subTotal2: number;
  public subTotal3: number;
  public total: number;
  public showValidations:boolean = false;

  public rows: Array<any>;

  public columns: Array<any> = [
    {title: 'Validacion', name: 'Validacion'},
    {title: 'Valor1', name: 'valor1'},
    {title: 'Valor2', name: 'valor2'}
  ];


  constructor(private pensionerService: PensionerApiService,
              private paymentApiService: PaymentApiService) { }

  ngOnInit() {
  }

  public getRowData(row, data) {
    return row [data];
  }

  getEntity() {
    console.log("Evento llamando datos de la entidad:" + this.cedula);
    this.pensionerService.getPensionersByLegalId(this.cedula).subscribe((entityObj:any) => {
      console.log("Evento llamando datos de la entidad:" + JSON.stringify(entityObj));
      this.cedula = entityObj.cedula;
      this.firstName = entityObj.firstName;
      this.lastName = entityObj.lastName;
    });
  }

  calculatePayment() {
      console.log("Calculando total de pago:");
      this.paymentApiService.getPaymentCalculation(this.cedula).subscribe((paymentObj:any) => {
        console.log("Retorno de pago:" + JSON.stringify(paymentObj));
        if (paymentObj.errorCondition != null) {
          this.rows = paymentObj.errorCondition;
          this.showValidations = true;
        }
        else {
          this.subTotal1 = paymentObj.subTotal1;
          this.subTotal2 = paymentObj.subTotal2;
          this.subTotal3 = paymentObj.subTotal3;
          this.total = paymentObj.amount;
        }
      });
  }
}
