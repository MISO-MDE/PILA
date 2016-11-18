import {Injectable} from '@angular/core';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

import {Entity} from "../sharedresources/classes";


import {PensionerApiService} from "../services/pensioner.api.service";

@Injectable()
export class PensionersService {

  public rows: Array<any>; //Toma los datos en el On Init de esta clase

  public columns: Array<any> = [
    {title: 'Nombre', className: 'text-warning', name: 'nombre'},
    {title: 'Apellido', className: 'text-warning', name: 'apellido'},
    {title: 'Identificación', name: 'cedula'}
  ];
  public selectedRow:any = {};

  constructor(private pensionerApiService: PensionerApiService) {
  }

  public selectRow(row) {
    this.selectedRow = JSON.parse(JSON.stringify(row)); //clona el objeto
      //this.selectedRow.ciiuCode = parseInt(row.econActivity.id);
    this.selectedRow.pensionType = row.pensionType.name;
    this.selectedRow.pensionerType = row.pensionerType.name;
    this.selectedRow.profession = row.profession.id;
    this.selectedRow.residenceCountry = row.residence.id+"";
    this.selectedRow.familyResidenceCountry = row.familyResidence.id+"";

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
        this.loadPensioners();
        //Salva ahora el administrador luego de que la superentidad quedo guardada
        console.log("**SUCCESS: Se guardo la entidad" + JSON.stringify(response));
      } else {
        console.log("**ERORR: No se guardo la superentidad revisar Logs");
      }
    });
  }

  public loadMultiLov(lovAddr:string) {
    console.log("Respuesta LOV loadMultiLov:" + lovAddr);
    return this.pensionerApiService.getMultiLov(lovAddr);
  }

/*
  public loadMultiLov(lovAddr:string) {
    this.pensionerApiService.getMultiLov(lovAddr)
      .subscribe((response: any) => {
        this.pensionTypeOptions = response;
      });
  }
*/
}
