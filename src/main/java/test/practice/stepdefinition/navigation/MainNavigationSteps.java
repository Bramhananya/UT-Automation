package test.practice.stepdefinition.navigation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import test.practice.base.BaseTest;
import test.practice.base.DriverManager;
import test.practice.pages.navigation.MainNavigation;

public class MainNavigationSteps extends BaseTest {

  private MainNavigation mainNavigation = new MainNavigation();

  @And("^Click on logout button$")
  public void click_on_logout_button() {
    mainNavigation.clickLogout();
  }

  @When("^Click on Cart link$")
  public void click_on_cart_link() {
    DriverManager.getWrapperClass().waitForPageLoaderToDisappear();
    // mainNavigation.clickCart();
  }

}
