import {Injectable} from '@angular/core';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {IntermediaryApiService} from "../services/intermediary.api.service";
import {EventApiService} from "../services/event.api.service";
import {News} from "../sharedresources/classes";

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
  
  public selectRow(row) {
    this.selectedRow = row;
  
  }


  public loadEvents(): any {
    this.eventApiService.getEvents('*')
      .subscribe((response: any) => {
        this.rows = response.results;
      });
  }

   public saveNews(news: News): void {
    console.log("**Saving:Save Entity " + JSON.stringify(news));
    this.eventApiService.saveNews(news).subscribe((response: any) => {
      if (response) {
        this.loadEvents();
        //Salva ahora el administrador luego de que la superentidad quedo guardada
        console.log("**SUCCESS: Se guardo la Novedad" + JSON.stringify(response));
      } else {
        console.log("**ERORR: No se guardo la Novedad revisar Logs");
      }
    });
  }

}
