import { AngularCliFirebasePage } from './app.po';

describe('angular-cli-firebase App', function() {
  let page: AngularCliFirebasePage;

  beforeEach(() => {
    page = new AngularCliFirebasePage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
