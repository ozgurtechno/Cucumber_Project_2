Feature: Register Functionality

  @Register @Accounts @Smoke @Regression
  Scenario:Register Create
    Given Navigate to Para Bank Website
    When Click to Register Menu button
    And Fill in the First Name input as "Jane"
    And Fill in the Last Name input as "Smith"
    And Fill in the Address input as "123 Elm Street"
    And Fill in the City input as "New York"
    And Fill in the State input as "NY"
    And Fill in the Zip Code input as "90001"
    And Fill in the Phone input as "555-987-6543"
    And Fill in the SSN input as "987-65-4321"
    And Fill in the Username input as "janesmith77"
    And Fill in the Password input as "Qwerty12"
    And Fill in the Confirm input as "Qwerty12"
    And Click to Register button
    Then Successfully message should be displayed
