package test.practice.stepdefinition.module.product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import test.practice.base.BaseTest;
import test.practice.pages.module.products.ProductsListPage;

public class ProductListSteps extends BaseTest {

  ProductsListPage productsListPage = new ProductsListPage();

  @And("Click on a product present in the product list page")
  public void click_on_a_product_present_in_the_product_list_page() {
//    productsListPage.clickProduct(nalcoProduct.getProductName());
  }


  @Then("Verify the Product search bar and place holder name")
  public void verify_the_product_search_bar_and_place_holder_name() {
    //    productsListPage.shouldSeeProductSearchBarEnabled();
  }

}

