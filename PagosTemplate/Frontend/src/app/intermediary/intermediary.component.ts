import {Component, OnInit} from '@angular/core';
import {PAsideService} from "../p-aside/p-aside.service";
import {IntermediaryApiService} from "../services/intermediary.api.service";
import {IntermediaryFormComponent} from "../intermediary-form/intermediary-form.component";
import {ISuperEntity} from '../sharedresources/interfaces'
import {IntermediaryService} from "./intermediary.service";


@Component({
  selector: 'app-intermediary',
  templateUrl: './intermediary.component.html',
  styleUrls: ['./intermediary.component.less']
})
export class IntermediaryComponent implements OnInit {
  constructor(private asideService: PAsideService,
              public intermediaryService: IntermediaryService) {
  }

  public editRow(row: any) {
    this.intermediaryService.selectRow(row);
  }

  public deleteRow(row: any) {
    this.intermediaryService.deleteSuperEntity(row.id);
  }

  public getRowData(row, data) {
    let value = row [data];
    if (typeof value === 'object') {
      return value.name;
    }
    return value;
  }

  ngOnInit() {
    this.asideService.showAside(IntermediaryFormComponent);
    this.intermediaryService.loadSuperEntity();
  }
}
