export interface IUser {
    idDb: number;
    userId: string;
    roleName: string;   

    getUserId():string;
    getRoleName():string;
}