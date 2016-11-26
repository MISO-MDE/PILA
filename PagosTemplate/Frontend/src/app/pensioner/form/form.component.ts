import {Component, OnInit} from '@angular/core';
import {PensionerBusinessService} from "../business.service";

@Component({
  selector: 'app-pensioner-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.less']
})
export class PensionerFormComponent implements OnInit {

  public parameters: any = {};
  public profession = [];

  public countryOptions: Array<any> = [
    {
      'id': "12",
      'name': "Colombia"
    },
    {
      'id': "13",
      'name': "Extetior"
    }
  ];

  constructor(public businessService: PensionerBusinessService) {
  }

  ngOnInit() {
    this.businessService.getParameters('/parameters/tipopagador/2/opciones').subscribe((response: any) => {
      this.parameters = response;
    });
  }

  public getPensionerOptions() {
    var key = this.businessService.selectedRow.tipoPension || "0";
    if (this.parameters.values) {
      return this.parameters.values.pensionPensionado[key];
    }
    return [];
  }

  public getPensionOptions() {
    var key = this.businessService.selectedRow.tipoPensionado || "0";
    if (this.parameters.values) {
      return this.parameters.values.pensionadoPension[key];
    }
    return [];
  }

  public save() {
    this.businessService.save(this.businessService.selectedRow);
  }

  public update() {
    this.businessService.update(this.businessService.selectedRow);
  }

  public delete() {
    this.businessService.delete(this.businessService.selectedRow);
  }

}
