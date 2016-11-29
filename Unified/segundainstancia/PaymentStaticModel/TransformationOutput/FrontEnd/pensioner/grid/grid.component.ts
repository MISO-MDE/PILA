import {Component, OnInit} from '@angular/core';
import {PAsideService} from "../../commons/p-aside/p-aside.service";
import {PensionerBusinessService} from "../business.service";
import {PensionerFormComponent} from "../form/form.component";

@Component({
  selector: 'app-pensioners',
  templateUrl: './grid.component.html',
  styleUrls: ['./grid.component.less']
})

export class PensionerGridComponent implements OnInit {
	
	public rows: Array<any>;
	
	public columns: Array<any> = [
		
	]
}