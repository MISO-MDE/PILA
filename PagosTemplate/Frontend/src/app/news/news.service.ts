import {Injectable} from '@angular/core';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {IntermediaryApiService} from "../services/intermediary.api.service";
import {EventApiService} from "../services/event.api.service";
@Injectable()
export class NewsService {
  public rows: Array<any>; //Toma los datos en el On Init de esta clase

  public columns: Array<any> = [
    {title: 'Tipo', className: 'text-warning', name: 'type'},
    {title: 'Fecha inicial', className: 'text-warning', name: 'fromDate'},
    {title: 'Fecha final', className: 'text-warning', name: 'toDate'},
    {title: 'Estado', name: 'status'}
  ];
  public selectedRow = {};

  constructor(private eventApiService: EventApiService) {
  }
  public loadEvents(): any {
    this.eventApiService.getEvents('*')
      .subscribe((response: any) => {
        this.rows = response.results;
      });
  }

}
