Feature: New Account Functionality
  Background:
    Given Navigate to Para Bank Website
    And Fill in the Login Username input as "janesmith76"
    And Fill in the Login Password input as "Qwerty12"
    When Click to Log in button

    @Accounts @Regression
    Scenario: Creating a new account
      Given Click open new account button from account services menu
      And Verify the page, account types existing in the options
      And Select one of the account types in the options
      And Verify the message of minimum deposit amount for the account at time of opening
      And Select one of the account from the options
      Then Click open new account button
      And Verify confirmation message and new account number
