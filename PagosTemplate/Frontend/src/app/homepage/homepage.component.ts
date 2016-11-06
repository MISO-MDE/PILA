import {Component, OnInit} from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.less']
})
export class HomepageComponent implements OnInit {

  public menuOptions : Array<any> = [
    {
      name:"Pensionados",
      icon:"glyphicon-user",
    },
    {
      name:"Novedades",
      icon:"glyphicon-fire"
    },
    {
      name:"Pagos",
      icon:"glyphicon-usd"
    }
  ];
  constructor(private asideService: PAsideService) {

  }

  ngOnInit() {
    //this.asideService.showAside(HomepageComponent);
  }

}
