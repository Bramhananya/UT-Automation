Feature: Product Details Page(PDP) Module TestCases

  @RegressionTest @PDPTest
  Scenario: ProductDetailsPage TC-121322: Verify Add to Quicklist button with (+) sign is present on PDP page and clicking it will add the product to Quicklist
    Given Login As Default User
    And Search FnB product by entering value inside product search input box
    And Click product link on product list page
    Then Verify add to Quicklist button is present on product details page
    And Click on Quicklist button in product catalog
    Then Verify product is added to the Quicklist