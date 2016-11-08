import {Component, OnInit} from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";
import {NewFormComponent} from "../new-form/new-form.component";
import {EventApiService} from "../services/event.api.service";

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.less']
})
export class NewsComponent implements OnInit {
  public rows: Array<any>; //Toma los datos en el On Init de esta clase

  public columns: Array<any> = [
    {title: 'Tipo', className: 'text-warning', name: 'type'},
    {title: 'Fecha inicial', className: 'text-warning', name: 'fromDate'},
    {title: 'Fecha final', className: 'text-warning', name: 'toDate'},
    {title: 'Estado', name: 'status'}
  ];

  constructor(private asideService: PAsideService,
              private eventApiService: EventApiService) {
  }

  ngOnInit() {
    this.asideService.showAside(NewFormComponent);
    this.getEvents();
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

  public getEvents(): any {
    this.eventApiService.getEvents('*')
      .subscribe((response: any) => {
        this.rows = response.results;
      });
  }
}
