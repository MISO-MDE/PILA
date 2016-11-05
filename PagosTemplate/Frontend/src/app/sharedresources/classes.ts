import { IUser } from './interfaces'

export class User implements IUser {
    constructor(public idDb: number, public userId: string, public roleName: string) {
        this.idDb = idDb;
        this.userId = userId;
        this.roleName = roleName;
    }

    getUserId():string {
        return this.userId;
    }
    
    getRoleName():string {
        return this.roleName;
    }
        
}