import { IUser } from './interfaces'
import { ISuperEntity } from './interfaces'
import { IEntity } from './interfaces';
import { IPayment } from './interfaces';
import { IValidation } from './interfaces';

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

export class Entity implements IEntity {
    public id: number;
    public legalIdCard: string;
    public firstName: string;
    public lastName: string;
    public pensionType: string;
	public pensionerType: string;
	public residence: string;
	public familyResidence: string;
	public proffesion: string;
	public salary: number;
}

export class Payment implements IPayment {
    public id: number;
	public supetrEntityId: number;
	public entityId: number;
	public paymentDate: Date;
    public subTotal1: number;
	public subTotal2: number;
	public subTotal3: number;
	public status: string;
	public amount: number;
    public errorCondition: Validation[];
}

class Validation implements IValidation {
    public validation: string;
    public value1: string;
    public value2: string;

}