import { Component, OnInit } from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";
import {PensionerFormComponent} from "../pensioner-form/pensioner-form.component";

@Component({
  selector: 'app-pensioners',
  templateUrl: './pensioners.component.html',
  styleUrls: ['./pensioners.component.less']
})
export class PensionersComponent implements OnInit {

  constructor(private asideService: PAsideService) { }

  ngOnInit() {
    this.asideService.showAside(PensionerFormComponent);
  }


}
