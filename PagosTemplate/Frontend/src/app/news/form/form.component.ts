import { Component, OnInit } from '@angular/core';
import {PensionerApiService} from '../../pensioner/rest.api.service';
import {NewsBusinessService} from "../business.service";
import { INews } from "../../commons/sharedresources/interfaces"

@Component({
  selector: 'app-new-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.less']
})
export class NewFormComponent implements OnInit {

  public newTypeOptions: Array<any> = [
                          {'id':"REG",'name':"Traslado"},
                          {'id':"REG",'name': "Variacion Transitoria del Salario"},
                          {'id':"SLN",'name':"SLN-Suspension Temporal"},
                          {'id':"SLN",'name':"SLN-Licencia No Remunerada"},
                          {'id':"SLN",'name':"SLN-Comision de Servicios"}


  ];

  public cedula: string;
  public firstName: string;
  public lastName: string;
  public entityid:number;

  constructor(private pensionerService: PensionerApiService,
              private businessService: NewsBusinessService) { }

  ngOnInit() {
  }

  getEntity() {
    console.log("Evento llamando datos de la entidad:" + this.cedula);
    this.pensionerService.loadById(this.cedula).subscribe((entityObj:any) => {
      console.log("Evento llamando datos de la entidad:" + JSON.stringify(entityObj));
      this.firstName = entityObj.firstName;
      this.lastName = entityObj.lastName;
      this.entityid = entityObj.id;
    });
  }

  public saveNews() {
    this.businessService.selectedRow.entityId = this.entityid;
    this.businessService.selectedRow.entityId = this.entityid;
    this.businessService.selectedRow.fechaCreacion = new Date();
    this.businessService.saveNews(<INews>this.businessService.selectedRow);
  }

}
