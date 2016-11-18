import {Component, OnInit} from '@angular/core';
import {PensionerBusinessService} from "../business.service";

@Component({
  selector: 'app-pensioner-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.less']
})
export class PensionerFormComponent implements OnInit {

  public pensionTypeOptions = [];
  public pensionerTypeOptions = [];
  public profession = [];

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

  constructor(public businessService: PensionerBusinessService) {
  }

  ngOnInit() {
      this.businessService.loadMultiLov('/epensions').subscribe((response: any) => {
        this.pensionTypeOptions = response;
      });
      this.businessService.loadMultiLov('/epensioners').subscribe((response: any) => {
        this.pensionerTypeOptions = response;
      });
      this.businessService.loadMultiLov('/eactivities').subscribe((response: any) => {
        this.profession = response;
      });
  }

  public save() {
    this.businessService.save(this.businessService.selectedRow);
  }
  public update(){
    this.businessService.update(this.businessService.selectedRow);
  }
  public delete(){
    this.businessService.delete(this.businessService.selectedRow);
  }

}
