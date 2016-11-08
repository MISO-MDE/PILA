export interface IUser {
    idDb: number;
    userId: string;
    superEntityId: number;
    email: string;
    password:string;
    name: string;
    roleName: string;   

    getUserId():string;
    getRoleName():string;
}

export interface ISuperEntity {
    id: number;
    name: string;
    nit: string;
    ciiuCode: string;
    econActivity: string;
}

export interface IEntity {
    id: number;
    legalIdCard: string;
    firstName: string;
    lastName: string;
    pensionType: string;
	pensionerType: string;
	residence: string;
	familyResidence: string;
	proffesion: string;
	salary: number;
}

export interface IPayment {
    id: number;
	supetrEntityId: number;
	entityId: number;
	paymentDate: Date;
    subTotal1: number;
	subTotal2: number;
	subTotal3: number;
	status: string;
	amount: number;
    errorCondition: IValidation[];

}

export interface IValidation {
    validation: string;
    value1: string;
    value2: string;
}