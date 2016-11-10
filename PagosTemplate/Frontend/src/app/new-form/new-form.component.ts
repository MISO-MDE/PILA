import { Component, OnInit } from '@angular/core';

import {PensionerApiService} from '../services/pensioner.api.service';
import {PensionersService} from "../pensioners/pensioners.service";
import {NewsService} from "../news/news.service";
import { INews } from "../sharedresources/interfaces"

@Component({
  selector: 'app-new-form',
  templateUrl: './new-form.component.html',
  styleUrls: ['./new-form.component.less']
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
              private newsService: NewsService) { }

  ngOnInit() {
  }

  getEntity() {
    console.log("Evento llamando datos de la entidad:" + this.cedula);
    this.pensionerService.getPensionersByLegalId(this.cedula).subscribe((entityObj:any) => {
      console.log("Evento llamando datos de la entidad:" + JSON.stringify(entityObj));
      this.firstName = entityObj.firstName;
      this.lastName = entityObj.lastName;
      this.entityid = entityObj.id;
    });
  }

  public saveNews() {
    console.log(JSON.stringify("Novedades A Salvar:" + <INews>this.newsService.selectedRow));
    this.newsService.saveNews(<INews>this.newsService.selectedRow);
  }

}
