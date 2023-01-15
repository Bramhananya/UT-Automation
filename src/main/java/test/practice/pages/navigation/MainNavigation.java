package test.practice.pages.navigation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import test.practice.base.DriverManager;

public class MainNavigation {

  public MainNavigation() {
    PageFactory.initElements(DriverManager.getDriver(), this);
  }

  @FindAll({@FindBy(xpath = "//span[@class='slds-p-right_small' and contains(text(),'Logout')]"),
      @FindBy(css = ".doLogout.cc_do_logout")})
  WebElement logout;


  public void clickLogout() {
    logout.click();
    DriverManager.getWrapperClass().waitForTimeOutInSec(10);
    ExtentCucumberAdapter.addTestStepLog("Clicked on Logout Link");
  }

}
