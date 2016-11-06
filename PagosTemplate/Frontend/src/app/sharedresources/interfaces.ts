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