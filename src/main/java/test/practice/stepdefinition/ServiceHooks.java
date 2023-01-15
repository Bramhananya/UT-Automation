package test.practice.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import test.practice.base.DriverManager;
import test.practice.base.WrapperClass;

public class ServiceHooks {

  @Before
  public void beforeSenario(Scenario scenario) {
    DriverManager.setScenario(scenario);
  }

  @After
  public void afterSenario(Scenario scenario) {
    WrapperClass.topEmbedScreenshot();
    WrapperClass.bottomEmbedScreenshot();
  }
}



