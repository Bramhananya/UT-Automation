package test.practice.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import test.practice.base.BaseTest;
import test.practice.base.DriverManager;

public class GuestLoginPage {

  public GuestLoginPage() {
    PageFactory.initElements(DriverManager.getDriver(), this);
  }
  private static final String SELECT_REGISTRAION_TYPE =
      "//h6[contains(text(),'%s')]/parent::div/parent::li/preceding-sibling::li/span/input";
  
  @FindBy(xpath = "//a[contains(text(),'Sign in')]")
  WebElement signInLink;

  @FindBy(xpath = "//input[@name='username']")
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

  @FindBy(xpath = "//input[@placeholder='Search for events']")
  WebElement serchEventInputField;

  @FindBy(xpath = "//button[@class='filter-button']")
  WebElement clickSerchButton;

  @FindBy(xpath = "//button[@class='register-button default-padding hover']")
  WebElement clickOnRegisterButton;

  @FindBy(xpath = "//input[@id='physical']")
  WebElement selectInperson;

  @FindBy(xpath = "//input[@id='Individual']")
  WebElement selectIndividual;

  @FindBy(xpath = "//button[@id='attendeesListing']") // mistake
  WebElement clickOnAddAttendes;

  @FindBy(xpath = "//div[@class='acc-body']")
  WebElement allAddAttendesBodyInputFieldPage; // mistake

  @FindBy(xpath = "//input[@name='emailId']")
  WebElement enterAttEmailAddress;

  @FindBy(xpath = "//input[@formcontrolname='firstName']")
  WebElement enterAttFirstNameInputField;

  @FindBy(xpath = "//input[@formcontrolname='lastName']")
  WebElement enterAttLastNameInputField;

  @FindBy(xpath = "//input[@formcontrolname='phone']")
  WebElement enterAttPhonenumber;

  @FindBy(xpath = "//span[contains(text(),'Continue to Payment ')]")
  WebElement clickContinuePaymentButton;

  @FindBy(xpath = "//button[@id='paymentBilling']")
  WebElement clickOnPaymentBilling;
  
  @FindBy(xpath = "//input[@id='credit-card-number']")
  WebElement inputCreditCardNumber;
  
  @FindBy(id = "braintree-hosted-field-number")
  WebElement ccNumberFrame;
 
  @FindBy(xpath = "//input[@aria-describedby='field-description-cvv']")
  WebElement enterCvvNumber;
  
  @FindBy(id = "braintree-hosted-field-cvv")
  WebElement cvvNumberFrame;
  
  @FindBy(xpath = "//input[@id='expiration']")
  WebElement enterExpiryDate;
   
  @FindBy(id = "braintree-hosted-field-expirationDate")
  WebElement expirationDateFrame;
  
  @FindBy(xpath = "//input[@name='billingAddress']")
  WebElement enterBillingAddress ;
  
  @FindBy(xpath = "(//button[@class='submit-regis-button'])[2]")
  WebElement clickOnSubmit;
  
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
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    if (DriverManager.getWrapperClass()
        .isElementDisplayed(By.xpath("//a[text()='Continue as a Guest']"))) {
      DriverManager.getWrapperClass().click(By.xpath("//a[text()='Continue as a Guest']"));
      DriverManager.getWrapperClass().waitForTimeOutInSec(2);
      ExtentCucumberAdapter.addTestStepLog("Clicked on Continue as a Guest button");
    }
  }

  public void searchEvents(String emailValidationTesting) {
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    DriverManager.getWrapperClass().enterText(serchEventInputField, emailValidationTesting);
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    serchEventInputField.sendKeys(Keys.ENTER);
    DriverManager.getWrapperClass().waitForTimeOutInSec(3);
  }

  public void clickOnsearchEvents() {
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    DriverManager.getWrapperClass().waitTillElementClickable(serchEventInputField);
    DriverManager.getWrapperClass().click(clickSerchButton);
  }

  public void selectAttendanceTypeAsInperson() {
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    DriverManager.getWrapperClass().scrollIntoCenterView(selectInperson);
    try {
      DriverManager.getWrapperClass().click(By.xpath("//input[@id='physical']"));
    } catch (Exception e) {
     
    }
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    ExtentCucumberAdapter.addTestStepLog("Clicked on select AttendanceType AsInperson button");
  }

  public void clickOnRegisterButton() {
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    DriverManager.getWrapperClass().click(clickOnRegisterButton);
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
  }

  public void selctRegisteringForIndividual() {
    DriverManager.getWrapperClass().waitForTimeOutInSec(3);
    try {
      DriverManager.getWrapperClass().click(selectIndividual);
    } catch (Exception e) {
    }
  }

  public void clickOnAddAttendeeButton() {
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    DriverManager.getWrapperClass().click(clickOnAddAttendes);
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
  }

  public void ShouldSeeAllInputFields() {
    Assert.assertTrue(DriverManager.getWrapperClass().isPresent(allAddAttendesBodyInputFieldPage),
        "Guest user is not able to see the all Attendee Input Field Page");
  }
  public void enterEmail(String attemail) {
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    DriverManager.getWrapperClass().scrollIntoCenterView(enterAttEmailAddress);
    DriverManager.getWrapperClass().enterText(enterAttEmailAddress, attemail);
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    ExtentCucumberAdapter.addTestStepLog("Entered in email field");
  }

  public void enterFirstName(String attfirstName) {
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    DriverManager.getWrapperClass().enterText(enterAttFirstNameInputField, attfirstName);
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    ExtentCucumberAdapter.addTestStepLog("Entered enterFirstName field");
  }

  public void enterLastname(String attlastname) {
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    DriverManager.getWrapperClass().enterText(enterAttLastNameInputField, attlastname);
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    ExtentCucumberAdapter.addTestStepLog("Entered enterLastNameInputField ");

  }

  public void enterPhoneNumber(String attphoneNumber) {
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    DriverManager.getWrapperClass().enterText(enterAttPhonenumber, attphoneNumber);
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    ExtentCucumberAdapter.addTestStepLog("Entered enterPhoneNumber succefully ");
  }

    public void clickContinuetoPayment() {
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    DriverManager.getWrapperClass().scrollIntoView(clickContinuePaymentButton);
    DriverManager.getWrapperClass().click(clickContinuePaymentButton);
    System.out.println("successfully clicked on the button");
  }
    public void clickOnPaymentBillingButton() {
      DriverManager.getWrapperClass().waitForTimeOutInSec(1);
      DriverManager.getWrapperClass().click(clickOnPaymentBilling);
    }
    
    
  public void inputCrditCardNumber(String creditCardNumber) {
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    DriverManager.getWrapperClass().switchToFrame(ccNumberFrame);
    DriverManager.getWrapperClass().enterText(inputCreditCardNumber, creditCardNumber);
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    DriverManager.getDriver().switchTo().defaultContent();
    ExtentCucumberAdapter.addTestStepLog("Entered CC number ");
    
  }
  public void enterCvvDetails(String cvvnumber) {
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    DriverManager.getWrapperClass().switchToFrame(cvvNumberFrame);
    DriverManager.getWrapperClass().enterText(enterCvvNumber, cvvnumber);
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    DriverManager.getDriver().switchTo().defaultContent();
    ExtentCucumberAdapter.addTestStepLog("Entered cvvnumber ");
    
  }
/*  public void inputCreditCardNumber(){
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    inputCreditCardNumber.sendKeys("987548654");
    ExtentCucumberAdapter.addTestStepLog("Entered credit card number succefully ");
  }*/

  public void enterExpDate(String expirationDate) {
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    DriverManager.getWrapperClass().switchToFrame(expirationDateFrame);
    DriverManager.getWrapperClass().enterText(enterExpiryDate, expirationDate);
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    DriverManager.getDriver().switchTo().defaultContent();
    ExtentCucumberAdapter.addTestStepLog("Entered exp date ");  
  }

  public void enterBillAddress(String enterBillingAddres) {  
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    DriverManager.getWrapperClass().scrollIntoView(enterBillingAddress);
    DriverManager.getWrapperClass().enterText(enterBillingAddress, enterBillingAddres);
    DriverManager.getWrapperClass().waitForTimeOutInSec(2);
    ExtentCucumberAdapter.addTestStepLog("Entered exp date ");   
  }
  public void clickOnSubmitAndRegisterButton() {
    DriverManager.getWrapperClass().waitForTimeOutInSec(1);
    DriverManager.getWrapperClass().scrollIntoView(clickOnSubmit);
    DriverManager.getWrapperClass().click(clickOnSubmit);
    System.out.println("successfully clicked on the button");
  }
}
