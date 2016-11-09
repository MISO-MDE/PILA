import {Component, OnInit} from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";
import {PensionerFormComponent} from "../pensioner-form/pensioner-form.component";
import {PensionerApiService} from "../services/pensioner.api.service";
import {PensionersService} from "./pensioners.service";
import {IEntity} from "../sharedresources/interfaces";

@Component({
  selector: 'app-pensioners',
  templateUrl: './pensioners.component.html',
  styleUrls: ['./pensioners.component.less']
})
export class PensionersComponent implements OnInit {
  public rows: Array<any>; //Toma los datos en el On Init de esta clase

  public columns: Array<any> = [
    {title: 'Nombre', className: 'text-warning', name: 'firstName'},
    {title: 'Apellido', className: 'text-warning', name: 'lastName'},
    {title: 'Identificación', name: 'legalIdCard'}
  ];

  constructor(private asideService: PAsideService,
              public pensionersService: PensionersService) {
  }

  ngOnInit() {
    this.asideService.showAside(PensionerFormComponent);
    this.pensionersService.loadPensioners();
  }

  public editRow(row: any) {
    this.pensionersService.selectRow(row);
  }

  public deleteRow(row: any) {
    console.log(row);
  }

  public getRowData(row, data) {
    return row [data];
  }

  public saveSuperEntity() {
    this.pensionersService.saveEntity(<IEntity>this.pensionersService.selectedRow);
  }

}
