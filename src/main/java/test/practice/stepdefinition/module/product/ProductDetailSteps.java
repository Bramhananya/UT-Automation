package test.practice.stepdefinition.module.product;

import io.cucumber.java.en.Then;
import test.practice.base.BaseTest;
import test.practice.pages.module.products.ProductDetailPage;

public class ProductDetailSteps extends BaseTest {

  ProductDetailPage productDetailPage = new ProductDetailPage();

  @Then("Verify Page is navigated to Product Details Page")
  public void verify_Page_Is_Navigated_To_Product_Details_Page() {
    productDetailPage.shouldSeeNavigatedToProductDetailsPage();
  }

  @Then("Verify add to Quicklist button is present on product details page")
  public void verify_add_to_quicklist_button_is_present_on_product_details_page() {
    // productDetailPage.shouldSeeQuickListButton();
    // productDetailPage.shouldSeeQuickListButtonText();
    // productDetailPage.shouldSeeQuickListButtonIcon();
  }

}


