import {Injectable} from '@angular/core';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {PensionerApiService} from "./rest.api.service";

@Injectable()
export class PensionerBusinessService {

  public rows: Array<any>;

  public columns: Array<any> = [
    {title: 'Nombre', className: 'text-warning', name: 'nombre'},
    {title: 'Apellido', className: 'text-warning', name: 'apellido'},
    {title: 'Identificación', name: 'cedula'}
  ];
  public selectedRow: any = {};

  constructor(private restApiService: PensionerApiService) {
  }

  /********************************* Crud operations  *************************************/
  public loadList(): any {
    this.restApiService.loadList('*')
      .subscribe((response: any) => {
        this.rows = response;
      });
  }

  public save(entity: any): void {
    this.restApiService.save(entity).subscribe((response: any) => {
      if (response) {
        this.loadList();
      }
    });
  }

  public update(entity: any): void {
    this.restApiService.update(entity)
      .subscribe((response: any) => {
        this.loadList();
      });
  }

  public delete(entity: any): void {
    this.restApiService.delete(entity)
      .subscribe((response: any) => {
        this.loadList();
      });
  }

  /***************************************--************************************************/

  public loadMultiLov(lovAddr: string) {
    console.log("Respuesta LOV loadMultiLov:" + lovAddr);
    return this.restApiService.getMultiLov(lovAddr);
  }

  public isEditingRow() {
    if (this.selectedRow && this.selectedRow.id) {
      return true
    }
    return false;
  }

  public selectRow(row) {
    this.selectedRow = JSON.parse(JSON.stringify(row)); //clona el objeto
    //this.selectedRow.ciiuCode = parseInt(row.econActivity.id);
    this.selectedRow.pensionType = row.pensionType.name;
    this.selectedRow.pensionerType = row.pensionerType.name;
    this.selectedRow.profession = row.profession.id;
    this.selectedRow.residenceCountry = row.residence.id + "";
    this.selectedRow.familyResidenceCountry = row.familyResidence.id + "";
  }
}
