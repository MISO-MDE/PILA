import { Component, OnInit } from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";
import {NewFormComponent} from "../new-form/new-form.component";

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.less']
})
export class NewsComponent implements OnInit {

  constructor(private asideService: PAsideService) { }

  ngOnInit() {
    this.asideService.showAside(NewFormComponent);
  }

}
