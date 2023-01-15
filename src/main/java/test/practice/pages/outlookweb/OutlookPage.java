package test.practice.pages.outlookweb;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import test.practice.base.DriverManager;
import test.practice.utils.PropertyStorage;

public class OutlookPage {

  public OutlookPage() {
    PageFactory.initElements(DriverManager.getDriver(), this);
  }

  private static final String EMAIL_SUBJECT = "//span[text()='%s']";

  @FindBy(xpath = "//nav[@aria-label='Quick links']/descendant::a[@data-task='signin']")
  private WebElement signInButton;

  @FindBy(name = "loginfmt")
  private WebElement usernameTxtBox;

  @FindBy(name = "passwd")
  private WebElement passwordTxtBox;

  @FindBy(xpath = "//span[contains(text(),'Sandbox: Thank you For Your Order')]")
  private List<WebElement> email;

  By nextOrSignInButton = By.id("idSIButton9");
  By noButton = By.id("idBtn_Back");

  public void openOutlookLoginPage() {
    DriverManager.getDriver().get(PropertyStorage.getOutlokUrl());
    ExtentCucumberAdapter
        .addTestStepLog("Opened Outlook URL As: " + PropertyStorage.getOutlokUrl());
  }

  public void loginInToOutlook(String username, String password) {
    DriverManager.getWrapperClass().waitForTimeOutInSec(10);
    if (signInButton.isDisplayed()) {
      signInButton.click();
    }
    usernameTxtBox.sendKeys(username);
    DriverManager.getWrapperClass().click(nextOrSignInButton);
    passwordTxtBox.sendKeys(password);
    DriverManager.getWrapperClass().click(nextOrSignInButton);
    if (DriverManager.getWrapperClass().isElementPresent(nextOrSignInButton)) {
      DriverManager.getWrapperClass().click(nextOrSignInButton);
    }
    if (DriverManager.getWrapperClass().isElementPresent(noButton)) {
      DriverManager.getWrapperClass().click(noButton);
    }
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    Assert.assertTrue(DriverManager.getDriver().getTitle().contains("Mail"));
    ExtentCucumberAdapter.addTestStepLog(
        "Outlook Login successfull using username: " + username + " And Password: " + password);
  }

  public void shouldSeeEmail(String subject) {
    DriverManager.getWrapperClass()
        .waitTillElementDisplyed(By.xpath(String.format(EMAIL_SUBJECT, subject)));
    Assert.assertTrue(
        DriverManager.getWrapperClass()
            .isElementDisplayed(By.xpath(String.format(EMAIL_SUBJECT, subject))),
        "Email :" + subject + " Is Not Available In Outlook");
    ExtentCucumberAdapter
        .addTestStepLog("Verified email with subject " + subject + " is available inside Outlook");
  }

  public void selectTheEmail() {
    try {
      DriverManager.getWrapperClass().click(email.get(0));
    } catch (Exception e) {
      ExtentCucumberAdapter.addTestStepLog("Email Not Found In Outlook" + e.getLocalizedMessage());
    }
  }

}
