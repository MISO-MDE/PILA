import {Injectable} from '@angular/core';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

import {Entity} from "../sharedresources/classes";


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
        console.log("PENSIONERS:" + JSON.stringify(response));
        this.rows = response;
      });
  }

  public saveEntity(entity: Entity): void {
    console.log("**Saving:Save Entity " + JSON.stringify(entity));
    this.pensionerApiService.saveEntity(entity).subscribe((response: any) => {
      if (response) {
        //Salva ahora el administrador luego de que la superentidad quedo guardada
        console.log("**SUCCESS: Se guardo la entidad" + JSON.stringify(response));
      } else {
        console.log("**ERORR: No se guardo la superentidad revisar Logs");
      }
    });
  }

}
