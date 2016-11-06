import {Component, OnInit} from '@angular/core';
import {UserService} from "../services/user.service";
import {IntermediaryService} from "../services/intermediary.service";
import {SuperEntity, User} from "../sharedresources/classes";

@Component({
  selector: 'app-intermediary-form',
  templateUrl: './intermediary-form.component.html',
  styleUrls: ['./intermediary-form.component.less']
})
export class IntermediaryFormComponent implements OnInit {
  public nit: string;
  public name: string;
  public ciiuCode: string;
  public econActivity: string;

  public email: string;
  public password: string;
  public admiName: string;

  private superEntity: SuperEntity;
  private userAdmin: User;

  constructor(private intermediaryService: IntermediaryService,
              private userService: UserService) {
  }

  ngOnInit() {
  }

  //Crea la superentidad y crea el administrador quien podra entrar a como admin de superentidad
  public saveSuperEntity(): void {
    var res: any;
    this.superEntity = new SuperEntity();
    this.superEntity.nit = this.nit;
    this.superEntity.name = this.name;
    this.superEntity.ciiuCode = this.ciiuCode;

    console.log("**Intermediary:Save Superentity " + this.name + ' NIT ' + this.nit);
    this.intermediaryService.saveSuperEntity(this.superEntity).subscribe((response: any) => {
      if (response) {
        //Salva ahora el administrador luego de que la superentidad quedo guardada
        console.log("**SUCCESS: Se guardo la superentidad" + JSON.stringify(response));
        //Crea objeto tipo usuario para salvar
        this.userAdmin = new User(null, response.id, null, this.admiName, this.email, this.password, 'SuperEntity');
        //Crea el usuario en FireBase email y login
        this.userService.saveUserFirebase(this.userAdmin.email, this.userAdmin.password).then((result: any) => {
          this.userAdmin.userId = result.uid;
          console.log("Creando Usuario en Base de Datos" + JSON.stringify(this.userAdmin));
          //Luego de que se creo en Firebase se crea en la base de datos
          this.userService.saveUser(this.userAdmin).subscribe((status: boolean) => {
            if (status) {
              console.log("**SUCCESS: Se guardo Administrador" + JSON.stringify(status));
            } else {
              console.log("**ERORR: No se guardo el Administradior revisar Logs");
            }
          });
        });
      } else {
        console.log("**ERORR: No se guardo la superentidad revisar Logs");
      }
    });
  }

}
