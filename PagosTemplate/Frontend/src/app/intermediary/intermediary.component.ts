import {Component, OnInit} from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";
import {IntermediaryApiService} from "../services/intermediary.api.service";
import {IntermediaryFormComponent} from "../intermediary-form/intermediary-form.component";
import {ISuperEntity} from '../sharedresources/interfaces'


@Component({
  selector: 'app-intermediary',
  templateUrl: './intermediary.component.html',
  styleUrls: ['./intermediary.component.less']
})
export class IntermediaryComponent implements OnInit {

  public rows: Array<any>; //Toma los datos en el On Init de esta clase
  
  public columns: Array<any> = [
    {title: 'Nombre empresa', className: 'text-warning', name: 'name'},
    {title: 'NIT', name: 'nit'}
  ];

  constructor(private asideService: PAsideService,
              private intermediaryApiService: IntermediaryApiService) {
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

  ngOnInit() {
    this.asideService.showAside(IntermediaryFormComponent);
    this.getSuperEntity();
  }

  getSuperEntity(): any {
    this.intermediaryApiService.getSuperEntityData('*').subscribe((superEntity:any) => {
      console.log("Retorno:" + JSON.stringify(superEntity));
      this.rows =  superEntity.results;
    });
  }

}
