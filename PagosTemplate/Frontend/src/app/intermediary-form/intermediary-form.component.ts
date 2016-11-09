import {Component, OnInit} from '@angular/core';
import {IntermediaryService} from "../intermediary/intermediary.service";
import {ISuperEntity, IUser} from "../sharedresources/interfaces";

@Component({
  selector: 'app-intermediary-form',
  templateUrl: './intermediary-form.component.html',
  styleUrls: ['./intermediary-form.component.less']
})
export class IntermediaryFormComponent implements OnInit {
   public userAdmin: any = <IUser>{};
  constructor(private intermediaryService: IntermediaryService) {
  }

  ngOnInit() {
    //this.superEntity = () => this.intermediaryService.selectedRow;
    this.intermediaryService.loadEconnActivities();
  }

  public saveSuperEntity() {
    this.intermediaryService.saveSuperEntity(<ISuperEntity>this.intermediaryService.selectedRow, this.userAdmin);
  }

  public updateSuperEntity(){
    this.intermediaryService.updateSuperEntity(<ISuperEntity>this.intermediaryService.selectedRow);
  }
  public cancel(){
    this.intermediaryService.resetSelectedRow();
  }
}
