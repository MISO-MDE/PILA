import {Injectable} from '@angular/core';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {PaymentApiService} from "./rest.api.service";
@Injectable()
export class PaymentsBusinessService {
  public rows: Array<any>; //Toma los datos en el On Init de esta clase

  public columns: Array<any> = [
    {title: 'Nombre', name: 'firstName'},
    {title: 'Apellido', name: 'lastName'},
    {title: 'Monto', name: 'amount'},
    {title: 'Fecha', name: 'paymentDate'},
    {title: 'Estado', name: 'status'}
  ];

  public selectedRow = {};

  constructor(private paymentApiService: PaymentApiService) {
  }

  public loadPayments(): any {
    this.paymentApiService.getPayments('*')
      .subscribe((response: any) => {
        this.rows = response.results;
      });
  }

}
