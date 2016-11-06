import {Component, OnInit} from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  constructor(private asideService: PAsideService) {

  }

  ngOnInit() {
    this.asideService.showAside(HomepageComponent);
  }

}
