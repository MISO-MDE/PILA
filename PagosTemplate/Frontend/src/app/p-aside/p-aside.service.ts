import {Injectable} from '@angular/core';

@Injectable()
export class PAsideService {
  private collapsed: boolean = true;

  constructor() {
  }

  public setCollapsed(newValue) {
    this.collapsed = newValue;
  }

  public isCollapsed() {
    return this.collapsed;
  }

}
