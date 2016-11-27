import {Component, OnInit} from '@angular/core';
import {IntermediaryBusinessService} from "../business.service";
import {ISuperEntity, IUser} from "../../commons/sharedresources/interfaces";

@Component({
  selector: 'app-intermediary-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.less']
})
export class IntermediaryFormComponent implements OnInit {
  public userAdmin: any = <IUser>{};
  public parameters: any = [];

  constructor(private businessService: IntermediaryBusinessService) {
  }

  ngOnInit() {
    //this.superEntity = () => this.intermediaryService.selectedRow;
    this.businessService.loadEconnActivities();
    this.businessService.getParameters('/parameters/tipopagador')
      .subscribe((response: any) => {
        this.parameters = response;
      });
  }

  public saveSuperEntity() {
    this.businessService.saveSuperEntity(<ISuperEntity>this.businessService.selectedRow, this.userAdmin);
  }

  public updateSuperEntity() {
    this.businessService.updateSuperEntity(<ISuperEntity>this.businessService.selectedRow);
  }

  public cancel() {
    this.businessService.resetSelectedRow();
  }
}
