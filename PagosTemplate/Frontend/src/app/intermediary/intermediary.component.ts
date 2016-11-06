import {Component, OnInit} from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";
import {IntermediaryFormComponent} from "../intermediary-form/intermediary-form.component";


@Component({
  selector: 'app-intermediary',
  templateUrl: './intermediary.component.html',
  styleUrls: ['./intermediary.component.less']
})
export class IntermediaryComponent implements OnInit {

  public rows: Array<any> = [
    {
      'companyName': 'Oracle',
      'nit': '5454454454545454'
    }, {
      'companyName': 'Universidad de los Andes',
      'nit': '8778787878877777'
    }
  ];
  public columns: Array<any> = [
    {title: 'Nombre empresa', className: 'text-warning', name: 'companyName'},
    {title: 'NIT', name: 'nit'}
  ];

  constructor(private asideService: PAsideService) {
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
  }
}
