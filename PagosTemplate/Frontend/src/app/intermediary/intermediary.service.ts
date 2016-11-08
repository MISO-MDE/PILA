import {Injectable} from '@angular/core';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {IntermediaryApiService} from "../services/intermediary.api.service";
import {SuperEntity, User} from "../sharedresources/classes";
import {UserApiService} from "../services/user.api.service";
@Injectable()
export class IntermediaryService {
  public rows: Array<any>; //Toma los datos en el On Init de esta clase
  public columns: Array<any> = [
    {title: 'Nombre empresa', className: 'text-warning', name: 'name'},
    {title: 'NIT', name: 'nit'}
  ];
  public selectedRow = { nit:'234234324', id:234, name:"sdjdjd"};

  constructor(private intermediaryApiService: IntermediaryApiService,
              private userApiService: UserApiService) {
  }

  public selectRow(row) {
    this.selectedRow = row;
  }

  public loadSuperEntity(): any {
    this.intermediaryApiService.getSuperEntityData('*').subscribe((superEntity: any) => {
      console.log("Retorno:" + JSON.stringify(superEntity));
      this.rows = superEntity.results;
    });
  }

  //Crea la superentidad y crea el administrador quien podra entrar a como admin de superentidad
  public saveSuperEntity(superEntity: SuperEntity, user: User): void {
    console.log("**Intermediary:Save Superentity " + superEntity.name + ' NIT ' + superEntity.nit);
    this.intermediaryApiService.saveSuperEntity(superEntity).subscribe((response: any) => {
      if (response) {
        //Salva ahora el administrador luego de que la superentidad quedo guardada
        console.log("**SUCCESS: Se guardo la superentidad" + JSON.stringify(response));
        //Crea objeto tipo usuario para salvar
        let userAdmin = new User(null, response.id, null, user.name, user.email, user.password, 'SuperEntity');
        //Crea el usuario en FireBase email y login
        this.userApiService.saveUserFirebase(userAdmin.email, userAdmin.password).then((result: any) => {
          userAdmin.userId = result.uid;
          console.log("Creando Usuario en Base de Datos" + JSON.stringify(userAdmin));
          //Luego de que se creo en Firebase se crea en la base de datos
          this.userApiService.saveUser(userAdmin).subscribe((status: boolean) => {
            if (status) {
              console.log("**SUCCESS: Se guardo Administrador" + JSON.stringify(status));
            } else {
              console.log("**ERROR: No se guardo el Administradior revisar Logs");
            }
          });
        });
      } else {
        console.log("**ERORR: No se guardo la superentidad revisar Logs");
      }
    });
  }
}
