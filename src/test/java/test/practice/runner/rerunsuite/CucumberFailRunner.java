package test.practice.runner.rerunsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import test.practice.base.BrowserFactory;
import test.practice.base.WrapperClass;
import test.practice.utils.PropertyStorage;

@CucumberOptions(features = "@target/rerun.txt", extraGlue = {"ecolab\\connect\\stepdefinition",},
    monochrome = true,
    plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/CucumberTestReport.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "rerun:target/rerun.txt"})

public class CucumberFailRunner<CucumberFeatureWrapper> {
  private TestNGCucumberRunner testNGCucumberRunner;
  private BrowserFactory browserfactory;

  @BeforeClass
  public void beforeClass() {
    testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
  }

  @BeforeMethod
  public void openBrowser() {
    browserfactory = new BrowserFactory();
    browserfactory.openBrowser(PropertyStorage.getBrowser());
    browserfactory.navigateToUrl();
  }

  @AfterMethod
  public void closeBrowser() {
    browserfactory.closeTest();
  }

  @Test(dataProvider = "scenarios", description = "Scenario Name: ")
  public void runScenario(PickleWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) {
    testNGCucumberRunner.runScenario(pickleEvent.getPickle());
  }

  @DataProvider(parallel = true)
  public Object[][] scenarios() {
    return testNGCucumberRunner.provideScenarios();
  }

  @AfterClass
  public void afterClass() {
    testNGCucumberRunner.finish();
    WrapperClass.copyRerunReport();
  }
}
