Feature: Register Feature
  As a user
  I want to register
  So I can login to website

  Scenario Outline: Successful Registration
    Given I am on the home page
    And I click on the register
    And I select "gender"
    And I enter "<firstname>"
    And I enter "last name"
    And I enter "<email>"
    And I enter "Password"
    And I enter "Confirm Password"
    When I click on Register Button
    Then I should see "Your Registration Completed" text on "registration" page
    And I should see My account on header
    And I should see Log out on header
    And the url should contain with "/registerresult"
    Examples:
    |firstname | email |
    |Nisha     | nisha@gmaill.com|
    |Nirav     | nirav@goyani.com|


  Scenario: Registration with Data Table
    Given I am on the home page
    And I click on the register
    And I enter following details to register
      | gender | firstName | lastName | date of birth | email                | password | confirmPassword |
      | male   | yogesh    | patil    | 2/2/1989      | yogpatil22@gmail.com | 898922   | hello@123       |
      | female | pinkal    | patel    | 25/5/1999     | pinkpatel@gmail.com  | 999925   | hello@123       |
      | male   | vatsal    | patel    | 16/4/2002     | patelvats@gmail.com  | 2162     | hello@123       |
    When I click on Register Button
    Then I should see "was" text on "registration" page
    And I should see My account on header
    And I should see Log out on header
    And the url should contain with "/registerresult"
