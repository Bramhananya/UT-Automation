package test.practice.stepdefinition.outlookweb;

import io.cucumber.java.en.Given;
import test.practice.base.BaseTest;
import test.practice.pages.outlookweb.OutlookPage;
import test.practice.utils.PropertyStorage;

public class OutlookLoginPageSteps extends BaseTest {

  OutlookPage outlookLoginPage = new OutlookPage();
  private String outlookUsername = PropertyStorage.getOutlookUsername();
  private String outlookPassword = PropertyStorage.getOutlookPassword();

  @Given("^Login into Outlook Web$")
  public void login_into_email_Account() {
    outlookLoginPage.openOutlookLoginPage();
    outlookLoginPage.loginInToOutlook(outlookUsername, outlookPassword);
  }
}
