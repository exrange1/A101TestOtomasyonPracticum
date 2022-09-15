Feature: Purchasing feature


  @Regression
  Scenario:
    When Navigate to Site
    And  Find product and verify
    And  go to cart and proceed to checkout
    And  fill the informations and go to payment
    Then complete the order
