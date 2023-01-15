package test.practice.pages.module;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import test.practice.base.DriverManager;

public class HomePage {

  public HomePage() {
    PageFactory.initElements(DriverManager.getDriver(), this);
  }

  @FindBy(xpath = "//input[@placeholder='Search for events']")
  WebElement searchForEventsPlaceholder;


  @FindBy(xpath = "//button[contains(text(),'Register')]")
  WebElement clickRegister; 


  @FindBy(xpath = "(//button[@class='submit-regis-button'])[2]")
  WebElement ClickoncontinuePaymentbutton; 


  public void searchForAnEvent(String eventName) {
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    searchForEventsPlaceholder.sendKeys(eventName);
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    searchForEventsPlaceholder.sendKeys(Keys.ENTER);
    DriverManager.getWrapperClass().waitForTimeOutInSec(3);
    ExtentCucumberAdapter.addTestStepLog("Entered in Event Name as: " + eventName);
       
  }
  public void searchForanEventName(String eventName) {
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    searchForEventsPlaceholder.sendKeys(eventName);
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    searchForEventsPlaceholder.sendKeys(Keys.ENTER);
    DriverManager.getWrapperClass().waitForTimeOutInSec(3);
    ExtentCucumberAdapter.addTestStepLog("Entered in Event Name as: " + eventName);
    
 }
  public void clickOnRegisterButton() {
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    DriverManager.getWrapperClass().click(clickRegister);
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    ExtentCucumberAdapter.addTestStepLog("Clicked on Register button");
    
    }
  public void clickOnContinuePaymentButton() {
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    DriverManager.getWrapperClass().click(ClickoncontinuePaymentbutton);
    ExtentCucumberAdapter.addTestStepLog("ClickoncontinuePaymentbutton");
    
  }
}
