
package test.practice.pages.module.products;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import test.practice.base.DriverManager;

public class ProductsListPage {

  public ProductsListPage() {
    PageFactory.initElements(DriverManager.getDriver(), this);
  }

  private static final String QUICKLIST_BUTTON_WITH_PLUS_SIGN = "Test";

  @FindBy(xpath = "Test25")
  WebElement productSearchBarInputField;


  public void clickProduct(String name) {
    DriverManager.getWrapperClass().scrollToTop();
    DriverManager.getWrapperClass().waitForPageLoaderToDisappear();
    ExtentCucumberAdapter.addTestStepLog("Clicked on Product: " + name);
  }

}
