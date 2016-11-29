import {Component, OnInit} from '@angular/core';
import {IntermediaryBusinessService} from "../business.service";

@Component({
	selector: 'app-intermediary-form',
	templateUrl: './form.component.html',
	styleUrls: ['./form.component.less']
})
export class IntermediaryFormComponent implements OnInit {
	
	public actividad_economicaOptions = [];
	public tipo_de_pagadorOptions = [];
	
	constructor(public businessService: IntermediaryBusinessService){
	}
	
	ngOnInit(){
		this.businessService.loadMultiLov('/eactividad_economica').subscribe((response: any) => {
			this.actividad_economicaOptions = response;
		});
		this.businessService.loadMultiLov('/etipo_de_pagador').subscribe((response: any) => {
			this.tipo_de_pagadorOptions = response;
		});
	}
	
	public create(){
		this.businessService.create(this.businessService.selectedRow);
	}
	public update(){
		this.businessService.update(this.businessService.selectedRow);
	}
	public cancel(){
		this.businessService.cancel(this.businessService.selectedRow);
	}
}