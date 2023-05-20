
Feature: login feature
  As a user
  I want to Login
  So I can access website

  Scenario: Validate Login page
    Given I am on the home page
    When I click on the Log in
    Then I should see "Welcome, Please Sign In!" text on "login" page
    And the url should contain with "/login"

  Scenario: Successful Login with valid credentials
    Given I am on the home page
    When I click on the Log in
    And I enter emailId "molyp@gmail.com" and password "890890"
    And I click on login button
    Then I should see Log out on header

  @Login1
  Scenario Outline: Login with more than one Emails and Passwords
    Given I am on the home page
    When I click on the Log in
    And I enter emailId "<Email>" and password "<Password>"
    And I click on login button
    Then I should see Log out on header

    Examples:
      | Email              | Password    |
      | molyp@gmail.com    | 890890      |
      | sa@sa.com          | 87654321    |
      | kotadia@gmail.com  | Samit@0304  |
      | samitk@gmail.co.uk | Kotadia@123 |
      | samit@samit.com    | 12345678    |



