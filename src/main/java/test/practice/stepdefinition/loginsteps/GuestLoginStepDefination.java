package test.practice.stepdefinition.loginsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.practice.base.BaseTest;
import test.practice.base.DriverManager;
import test.practice.pages.login.GuestLoginPage;
import test.practice.utils.RandomUtils;

public class GuestLoginStepDefination extends BaseTest {

  GuestLoginPage loginpage = new GuestLoginPage();
  static String text = RandomUtils.generateText();

  private String username = "shivanand@infoglen.com";
  private String password = "Shiva@5566";
  private String attEmail = text + "@mailinator.com";
  private String attfirstName = text + "- FirstName";
  private String attlastName = text + " - LastName";
  private String attphoneNumber = String.valueOf(RandomUtils.generateTenDigitNumber());
  
  private String creditCardNumber = "4111111111111111";
  private String cvvnumber = "123";
  private String expirationDate = "02/23";
  private String enterBillingAddres = "Pune Hinjawadi";
  
  @Given("^Register as a Default User$")
  public void login_As_Default_User() {
    loginpage.enterName(username);
    loginpage.enterPassword(password);
    loginpage.clickLogInButton();
    loginpage.shouldSeeLoginPage();
  }

  @When("^Select Registrating as guest$")
  public void Select_Registrating_as_guest(String regType) {
    loginpage.selectRegistrationTypeAs(regType);
  }

  @And("^Click on the continue as a guest$")
  public void Click_on_the_continue_as_a_guest() {
    loginpage.clickOnContinueAsGuest();
  }

  @Then("^Search for an Event (.*)$")
  public void Search_for_an_Events(String emailValidationTesting) {
    loginpage.searchEvents(emailValidationTesting);
  }

  @Then("^Click On search Events$")
  public void click_On_search_Events() {
    loginpage.clickOnsearchEvents();
  }

  @Then("^Click on Register button$")
  public void Click_on_Register_button() {
    loginpage.clickOnRegisterButton();
  }

  @Then("^Select Attendance Type as Inperson$")
  public void Select_Attendance_Type_as() {
    loginpage.selectAttendanceTypeAsInperson();
  }

  @And("^Select Registering for Individual$")
  public void Select_Registering_for_Individual() {
    loginpage.selctRegisteringForIndividual();
  }

  @Then("^Click on the Add Attendees button(.*)$")
  public void Click_On_the_Add_Attendees_button() {
    loginpage.clickOnAddAttendeeButton();
  }

  @And("^Enter Email address$")
  public void Enter_Email_address_as() {
    loginpage.enterEmail(attEmail);
  }

  @And("^Enter First Name$")
  public void Enter_First_Name_as() {
    loginpage.enterFirstName(attfirstName);
  }

  @And("^Enter LastName$")
  public void Enter_LastName_as() {
    loginpage.enterLastname(attlastName);
  }

  @And("^Enter Phone number$")
  public void Enter_Phone_number_as() {
    loginpage.enterPhoneNumber(attphoneNumber);
  }

  @And("^Click on Continue to Payment button$")
  public void Click_on_Continue_to_Payment_button() {
    loginpage.clickContinuetoPayment();
  }
  
  @And("^Click on the payment billing button$")
  public void Click_on_the_payment_billing_button() {
    loginpage.clickOnPaymentBillingButton();
  }
  
  @And("^Enter credit card details number$")
  public void Enter_credit_card_details_number() {

    loginpage.inputCrditCardNumber(creditCardNumber);    
  }
  @And("^Enter cvv detail$")
  public void Ente_cvv_detail() {     
    loginpage.enterCvvDetails(cvvnumber);
  }
  @And("^Enter Expiration Date$")
  public void Enter_Expiration_Date () {     
    loginpage.enterExpDate(expirationDate);
  }
  @And("^Enter Billing address Details$")
  public void Enter_Billing_address_Details () {     
    loginpage. enterBillAddress(enterBillingAddres);
  }
  @And("^Click on Submit and Register button$")
  public void Click_on_Submit_and_Register_button () {     
    loginpage.clickOnSubmitAndRegisterButton();
  }
}
