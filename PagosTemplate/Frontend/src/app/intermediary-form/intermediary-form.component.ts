import {Component, OnInit} from '@angular/core';
import {UserApiService} from "../services/user.api.service";
import {IntermediaryApiService} from "../services/intermediary.api.service";
import {SuperEntity, User} from "../sharedresources/classes";
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
  }

  public saveSuperEntity() {
    this.intermediaryService.saveSuperEntity(<ISuperEntity>this.intermediaryService.selectedRow, this.userAdmin);
  }

}
