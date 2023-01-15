package test.practice.pages.navigation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import test.practice.base.BaseTest;
import test.practice.base.DriverManager;

public class MenuNavigation extends BaseTest {

  public MenuNavigation() {
    PageFactory.initElements(DriverManager.getDriver(), this);
  }

  @FindAll({@FindBy(xpath = "//li[@class='dropdown cc_dropdown Home']/a"), @FindBy(
      xpath = "//ul[@class='slds-list_horizontal slds-show_medium']/li/a[contains(text(),'Home')]")})
  WebElement homeMenu;

  public void clickHome() {
    DriverManager.getWrapperClass().click(homeMenu);
    ExtentCucumberAdapter.addTestStepLog("Clicked on Home Tab");
  }

}
