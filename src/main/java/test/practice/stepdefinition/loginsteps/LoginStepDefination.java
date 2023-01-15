package test.practice.stepdefinition.loginsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import test.practice.base.BaseTest;
import test.practice.base.DriverManager;
import test.practice.pages.login.LoginPage;
import test.practice.utils.PropertyStorage;

public class LoginStepDefination extends BaseTest {

  LoginPage loginpage = new LoginPage();

//  private String username = PropertyStorage.getUsername();
//  private String password = PropertyStorage.getPassword();

  private String username = "shivanand@infoglen.com";
  private String password = "Shiva@5566";

  
  @Given("^Login as a Default User$")
  public void login_As_Default_User() {
    loginpage.enterName(username);
    loginpage.enterPassword(password);
    loginpage.clickLogInButton();
    loginpage.shouldSeeLoginPage();
  }

  @Given("^Register as a Guest User$")
  public void contiue_As_A_Guest_User() {
    
  }
  
  @Then("^Select Registrating as(.*)$")
  public void verify_user_should_redirect_to_login_page(String regType) {
    loginpage.selectRegistrationTypeAs(regType);
  }

  @And("^Open Base Url$")
  public void open_base_url() {
    DriverManager.getWrapperClass().waitForTimeOutInSec(3);
    DriverManager.getDriver().get(PropertyStorage.getBaseUrl());
  }

}
