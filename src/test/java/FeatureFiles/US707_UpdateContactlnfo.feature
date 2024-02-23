Feature: Login Functionality

  Background: Login To Web Site
    Given Navigate to Para Bank Website
    And Fill in the Login Username input as "janesmith76"
    And Fill in the Login Password input as "Qwerty12"
    When Click to Log in button

    @Accounts @Regression
  Scenario: Update with Success Msg
    And Click the buttons UpdateContactInfo
      | clickButton |
    And Clear user informations before UpdateContactlnfo
      | firstName   |
      | lastName    |
      | address     |
      | city        |
      | state       |
      | zipcode     |
      | phoneNumber |
    And Write send keys user informations UpdateContactlnfo
      | firstName   | Jane            |
      | lastName    | Smith           |
      | address     | 123 Main Street |
      | city        | New York        |
      | state       | NY              |
      | zipcode     | 90245           |
      | phoneNumber | 555-987-5543    |
    And Click the buttons UpdateContactInfo
      | updateButton |
    Then  Success message profile updated
    And Click the buttons UpdateContactInfo
      | logout |

      @Regression
  Scenario: Negative Update with some null fields
    And Click the buttons UpdateContactInfo
      | clickButton |
    And Clear user informations before UpdateContactlnfo
      | address     |
      | city        |
      | state       |
      | zipcode     |
      | phoneNumber |
    Then Warning Message required fields
    And Click the buttons UpdateContactInfo
      | updateButton |
    Then  Empty message profile not updated
