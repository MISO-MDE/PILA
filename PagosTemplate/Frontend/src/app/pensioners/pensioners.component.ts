import {Component, OnInit} from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";
import {PensionerFormComponent} from "../pensioner-form/pensioner-form.component";
import {PensionerApiService} from "../services/pensioner.api.service";

@Component({
  selector: 'app-pensioners',
  templateUrl: './pensioners.component.html',
  styleUrls: ['./pensioners.component.less']
})
export class PensionersComponent implements OnInit {
  public rows: Array<any>; //Toma los datos en el On Init de esta clase

  public columns: Array<any> = [
    {title: 'Nombre empresa', className: 'text-warning', name: 'name'},
    {title: 'NIT', name: 'nit'}
  ];

  constructor(private asideService: PAsideService,
              private pensionerApiService: PensionerApiService) {
  }

  ngOnInit() {
    this.asideService.showAside(PensionerFormComponent);
    this.getPensioners();
  }


  public getPensioners() {
    this.pensionerApiService.getPensioners('*')
      .subscribe((response: any) => {
        this.rows = response.results;
      });
  }

}
