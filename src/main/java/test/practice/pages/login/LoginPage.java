package test.practice.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import test.practice.base.DriverManager;

public class LoginPage {

  public LoginPage() {
    PageFactory.initElements(DriverManager.getDriver(), this);
  }

  private static final String SELECT_REGISTRAION_TYPE = "//h6[contains(text(),'%s')]/parent::div/parent::li/preceding-sibling::li/span/input";

  @FindBy(xpath = "//a[contains(text(),'Sign in')]")
  WebElement signInLink;

  @FindBy(id = "username")
  WebElement usernameInputField;

  @FindBy(id = "password")
  WebElement passwordInputField;

  @FindBy(id = "kc-login")
  WebElement loginButton;

  @FindBy(xpath = "//img[@alt='profile-icon']")
  WebElement profileIcon;

  @FindBy(xpath = "//h3[contains(text(),'Today ')]")
  WebElement popupModelTitle;

  @FindBy(xpath = "//button[@class='btn btn-yes']/a")
  WebElement submitButton;

  public void enterName(String username) {
    DriverManager.getWrapperClass().waitTillElementClickable(signInLink);
    DriverManager.getWrapperClass().click(signInLink);
    DriverManager.getWrapperClass().waitTillElementClickable(usernameInputField);
    DriverManager.getWrapperClass().enterText(usernameInputField, username);
    ExtentCucumberAdapter.addTestStepLog("Entered Email Id as: " + username + " in email field");
  }

  public void enterPassword(String password) {
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    passwordInputField.sendKeys(password);
    ExtentCucumberAdapter.addTestStepLog("Entered in password field");
  }

  public void clickLogInButton() {
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    DriverManager.getWrapperClass().click(loginButton);
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    ExtentCucumberAdapter.addTestStepLog("Clicked on Log In button");
  }

  public void shouldSeeLoginPage() {
    Assert.assertTrue(DriverManager.getWrapperClass().isPresent(profileIcon),
        "User is not able to See login Page");
  }

  public void selectRegistrationTypeAs(String regType) {
    if (DriverManager.getWrapperClass().isElementDisplayed(popupModelTitle)) {
      DriverManager.getWrapperClass()
          .click(By.xpath(String.format(SELECT_REGISTRAION_TYPE, regType)));
      DriverManager.getWrapperClass().click(submitButton);
    }
  }

  public void clickOnContinueAsGuest() {
    if (DriverManager.getWrapperClass().isElementDisplayed(popupModelTitle)) {
      DriverManager.getWrapperClass().click(submitButton);
    }
  }

}
