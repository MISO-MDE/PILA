import {Injectable} from '@angular/core';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {PensionerApiService} from "../services/pensioner.api.service";
@Injectable()
export class PensionersService {
  public rows: Array<any>; //Toma los datos en el On Init de esta clase

  public columns: Array<any> = [
    {title: 'Nombre', className: 'text-warning', name: 'firstName'},
    {title: 'Apellido', className: 'text-warning', name: 'lastName'},
    {title: 'Identificación', name: 'cedula'}
  ];
  public selectedRow = {};

  constructor(private pensionerApiService: PensionerApiService) {
  }

  public selectRow(row) {
    this.selectedRow = row;
  }

  public loadPensioners(): any {
    this.pensionerApiService.getPensioners('*')
      .subscribe((response: any) => {
        this.rows = response.results;
      });
  }

}
