import {Component, OnInit} from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";
import {NewFormComponent} from "../new-form/new-form.component";
import {EventApiService} from "../services/event.api.service";
import {NewsService} from "./news.service";

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.less']
})
export class NewsComponent implements OnInit {


  constructor(private asideService: PAsideService,
              public newsService: NewsService) {
  }

  ngOnInit() {
    this.asideService.showAside(NewFormComponent);
    this.newsService.loadEvents();
  }

  public editRow(row: any) {
     this.newsService.selectRow(row);
  }

  public deleteRow(row: any) {
    console.log(row);
  }

  public getRowData(row, data) {
    return row [data];
  }
}
