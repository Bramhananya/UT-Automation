Feature: Product List Page(PLP) Module TestCases

  @RegressionTest @PLPTest
  Scenario: ProductListPage TC-118866: Verify whether the user is able to configure product search on Products Listing Page by Product Name
    Given Login As Default User
    Then Verify the Product search bar and place holder name
