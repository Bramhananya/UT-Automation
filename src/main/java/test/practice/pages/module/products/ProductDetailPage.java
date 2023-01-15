package test.practice.pages.module.products;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import test.practice.base.DriverManager;

public class ProductDetailPage {

  public ProductDetailPage() {
    PageFactory.initElements(DriverManager.getDriver(), this);
  }

  private static final String test = "";

  @FindBy(xpath = "Test")
  WebElement productDetailsTab;

  @FindBy(css = "Test")
  WebElement quickListButton;

  @FindBy(css = "Test")
  WebElement quickListButtonImage;

  @FindBy(css = "Test")
  WebElement quickListButtonText;

  @FindBy(xpath = "test")
  WebElement documentsTab;

  @FindBy(xpath = "test")
  List<WebElement> documentHyperLinkList;

  public void shouldSeeNavigatedToProductDetailsPage() {
    Assert.assertTrue(productDetailsTab.isDisplayed(),
        "Page is Not navigated to Product Details Page");
    ExtentCucumberAdapter.addTestStepLog("Verified Page is navigated to Product Details Page");
  }

  public void shouldBeAbleToOpenHyperLinksInDocumentTab() {
    for (WebElement documentLink : documentHyperLinkList) {
      DriverManager.getWrapperClass().scrollIntoCenterView(documentLink);
      DriverManager.getWrapperClass().clickOnElementAndWaitForPopUp(documentLink, 10);
      DriverManager.getWrapperClass().closeActivePageAndSwitchToPreviousPage();
    }
    ExtentCucumberAdapter.addTestStepLog("Verified Document is loaded Sucessfully");
  }
}
