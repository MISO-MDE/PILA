import {Component, OnInit} from '@angular/core';
import {PensionersService} from "../pensioners/pensioners.service";
import {IEntity} from "../sharedresources/interfaces";

@Component({
  selector: 'app-pensioner-form',
  templateUrl: './pensioner-form.component.html',
  styleUrls: ['./pensioner-form.component.less']
})
export class PensionerFormComponent implements OnInit {
  public pensionTypeOptions: Array<any> = [
    {
      'id':"12",
      'name':"Pension tipo 1"
    },
    {
      'id':"VEJEZ",
      'name':"Vejez"
    }
  ];

  public pensionerTypeOptions : Array<any> = [
    {
      'id':"REGIMEN_PRIMA_MEDIA",
      'name':"Pensionado de régimen de prima media. Tope máximo de pensión 25 smlmv"
    },
    {
      'id':"13",
      'name':"Pensionado tipo 2"
    }
  ];

  public countryOptions : Array<any> = [
    {
      'id':"12",
      'name':"Colombia"
    },
    {
      'id':"13",
      'name':"Argentina"
    }
  ];
  constructor(public pensionersService: PensionersService) {
  }

  ngOnInit() {
  }

  public saveEntity() {
    console.log(JSON.stringify("Peunsionado a Salvar:" + <IEntity>this.pensionersService.selectedRow));
    this.pensionersService.saveEntity(<IEntity>this.pensionersService.selectedRow);
  }

}
