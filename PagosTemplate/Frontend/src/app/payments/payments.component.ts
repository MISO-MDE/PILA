import {Component, OnInit} from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";
import {PaymentFormComponent} from "../payment-form/payment-form.component";
import {PaymentApiService} from "../services/payment.api.service";

@Component({
  selector: 'app-payments',
  templateUrl: './payments.component.html',
  styleUrls: ['./payments.component.less']
})
export class PaymentsComponent implements OnInit {
  public rows: Array<any>; //Toma los datos en el On Init de esta clase

  public columns: Array<any> = [
    {title: 'Nombre', name: 'firstName'},
    {title: 'Apellido', name: 'lastName'},
    {title: 'Fecha', name: 'date'},
    {title: 'Estado', name: 'status'}
  ];

  constructor(private asideService: PAsideService,
              private paymentApiService: PaymentApiService) {
  }

  ngOnInit() {
    this.asideService.showAside(PaymentFormComponent);
    this.getPayments();
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

  public getPayments(): any {
    this.paymentApiService.getPayments('*')
      .subscribe((response: any) => {
        this.rows = response.results;
      });
  }

}
