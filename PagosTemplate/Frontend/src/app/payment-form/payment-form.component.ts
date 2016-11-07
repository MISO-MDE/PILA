import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-payment-form',
  templateUrl: './payment-form.component.html',
  styleUrls: ['./payment-form.component.less']
})
export class PaymentFormComponent implements OnInit {
  public legalIdCard: string;

  constructor() { }

  ngOnInit() {
  }
  
  getEntity() {
    console.log("Evento llamando datos de la entidad:" + this.legalIdCard);
  }
}
