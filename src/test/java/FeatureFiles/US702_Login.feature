Feature: Login Functionality

  @Accounts @Smoke @Regression
  Scenario: Login process with valid information
    Given Navigate to Para Bank Website
    And Fill in the Login Username input as "janesmit77"
    And Fill in the Login Password input as "Qwerty12"
    When Click to Log in button
    Then Verify that you are logged in
    And Click to Log out button

  @Login @Accounts @Smoke @Regression
  Scenario Outline: Negative Login
    Given Navigate to Para Bank Website
    And Fill in the Login Username input as "<username>"
    And Fill in the Login Password input as "<password>"
    When Click to Log in button
    Then Error message should be displayed

    Examples:
      | username    | password |
      |             | Qwerty12 |
      | janesmith77 |          |
      |             |          |