Feature: End to End Functionality
  As a user
  I want to register
  So I can buy products

  @EndToEnd
  Scenario: Buy One Product
    Given I am on the home page
    And I click on the register
    And I enter following details to register
      | gender | firstName | lastName | email               | password | confirmPassword |
      | female | moly      | patel    | patelmoly@gmail.com | 106@494  | 106@494         |
    And I click on Register Button
    And I click on "jewelry"
    And I click on ADD TO CART button for Flower Girl Bracelet
    And I click on shopping cart
    And I select "Yes" for Gift Wrapping
    And I select terms and conditions
    And I click on checkout button

