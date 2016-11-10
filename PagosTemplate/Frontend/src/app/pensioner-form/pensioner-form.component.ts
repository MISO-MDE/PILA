import {Component, OnInit} from '@angular/core';
import {PensionersService} from "../pensioners/pensioners.service";
import {IEntity} from "../sharedresources/interfaces";

@Component({
  selector: 'app-pensioner-form',
  templateUrl: './pensioner-form.component.html',
  styleUrls: ['./pensioner-form.component.less']
})
export class PensionerFormComponent implements OnInit {
  
  public pensionTypeOptions = [];
  public pensionerTypeOptions = [];
  public profession = [];
  //public countryOptions = [];
  
  public countryOptions : Array<any> = [
    {
      'id':"12",
      'name':"Colombia"
    },
    {
      'id':"13",
      'name':"Extetior"
    }
  ];
  
  constructor(public pensionersService: PensionersService) {
  }

  ngOnInit() {
      this.pensionersService.loadMultiLov('/epensions').subscribe((response: any) => {
        this.pensionTypeOptions = response;
      });
      this.pensionersService.loadMultiLov('/epensioners').subscribe((response: any) => {
        this.pensionerTypeOptions = response;
      });
      this.pensionersService.loadMultiLov('/eactivities').subscribe((response: any) => {
        this.profession = response;
      });
      /*
      this.pensionersService.loadMultiLov('/epensions').subscribe((response: any) => {
        this.countryOptions = response;
      });
      */
  }

  public saveEntity() {
    console.log(JSON.stringify("Peunsionado a Salvar:" + <IEntity>this.pensionersService.selectedRow));
    this.pensionersService.saveEntity(<IEntity>this.pensionersService.selectedRow);
  }

}
