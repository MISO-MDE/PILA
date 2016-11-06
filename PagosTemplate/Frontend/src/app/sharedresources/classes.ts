import { IUser } from './interfaces'
import { ISuperEntity } from './interfaces'

export class User implements IUser {
    constructor(public idDb: number, public superEntityId: number, public userId: string, public name: string, public email: string,
    public password: string, public roleName: string) {
        this.idDb = idDb;
        this.userId = userId;
        this.superEntityId = superEntityId;
        this.roleName = roleName;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    getUserId():string {
        return this.userId;
    }
    
    getRoleName():string {
        return this.roleName;
    }
        
}

export class SuperEntity implements ISuperEntity {
    public id: number;
    public name: string;
    public nit: string;
    public ciiuCode: string;
    public econActivity: string;
}