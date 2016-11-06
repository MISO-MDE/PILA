import {Component, OnInit} from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";
import {IntermediaryFormComponent} from "../intermediary-form/intermediary-form.component";


@Component({
  selector: 'app-intermediary',
  templateUrl: './intermediary.component.html',
  styleUrls: ['./intermediary.component.less']
})
export class IntermediaryComponent implements OnInit {
  constructor(private asideService: PAsideService) {
  }

  ngOnInit() {
    this.asideService.showAside(IntermediaryFormComponent);
  }
}
