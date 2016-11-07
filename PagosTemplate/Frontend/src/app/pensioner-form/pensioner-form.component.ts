import {Component, OnInit} from '@angular/core';

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
      'id':"13",
      'name':"Pension tipo 2"
    }
  ];

  public pensionerTypeOptions : Array<any> = [
    {
      'id':"12",
      'name':"Pensionado  tipo 1"
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
  constructor() {
  }

  ngOnInit() {
  }

}
