import {Component, OnInit} from '@angular/core';
import {PAsideService} from "../../commons/p-aside/p-aside.service";
import {IntermediaryBusinessService} from "../business.service";
import {IntermediaryFormComponent} from "../form/form.component";

@Component({
  selector: 'app-intermediarys',
  templateUrl: './grid.component.html',
  styleUrls: ['./grid.component.less']
})

export class IntermediaryGridComponent implements OnInit {
	
	public rows: Array<any>;
	
	public columns: Array<any> = [
	]
}