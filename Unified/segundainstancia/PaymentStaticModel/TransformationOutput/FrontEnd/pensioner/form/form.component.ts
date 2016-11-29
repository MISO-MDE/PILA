import {Component, OnInit} from '@angular/core';
import {PensionerBusinessService} from "../business.service";

@Component({
	selector: 'app-pensioner-form',
	templateUrl: './form.component.html',
	styleUrls: ['./form.component.less']
})
export class PensionerFormComponent implements OnInit {
	
	public tipo_pensionOptions = [];
	public tipo_pensionadoOptions = [];
	public país_de_residenciaOptions = [];
	public residencia_grupo_familiarOptions = [];
	
	constructor(public businessService: PensionerBusinessService){
	}
	
	ngOnInit(){
		this.businessService.loadMultiLov('/etipo_pension').subscribe((response: any) => {
			this.tipo_pensionOptions = response;
		});
		this.businessService.loadMultiLov('/etipo_pensionado').subscribe((response: any) => {
			this.tipo_pensionadoOptions = response;
		});
		this.businessService.loadMultiLov('/epaís_de_residencia').subscribe((response: any) => {
			this.país_de_residenciaOptions = response;
		});
		this.businessService.loadMultiLov('/eresidencia_grupo_familiar').subscribe((response: any) => {
			this.residencia_grupo_familiarOptions = response;
		});
	}
	
	public save(){
		this.businessService.save(this.businessService.selectedRow);
	}
	public update(){
		this.businessService.update(this.businessService.selectedRow);
	}
}