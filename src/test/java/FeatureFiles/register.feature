Feature: Register Functionality

  Scenario:Register Create
    Given Navigate to Para Bank Website
    And Click to Register Menu button
    And Fill in the First Name input as "Techno"
    And Fill in the Last Name input as "Study"
    And Fill in the Address input as "USA"
    And Fill in the City input as "Newyork"
    And Fill in the State input as "Newyork"
    And Fill in the Zip Code input as "1024"
    And Fill in the Phone input as "12546396"
    And Fill in the SSN input as "1234"
    And Fill in the Username input as "Techno_Study3"
    And Fill in the Password input as "Techno123453"
    And Fill in the Confirm input as "Techno123453"
    When Click to Register button
    Then Successfully message should be displayed
