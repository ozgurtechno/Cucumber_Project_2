Feature:Login Functionality

  Scenario:Login process with valid information
    Given Navigate to Para Bank Website
    And Fill in the Login Username input as "Techno_Study3"
    And Fill in the Login Password input as "Techno123453"
    When Click to Log in button
    Then Verify that you are logged in
    And Click to Log out button


  Scenario Outline:
    Given Navigate to Para Bank Website
    And Fill in the Login Username input as "<username>"
    And Fill in the Login Password input as "<password>"
    When Click to Log in button
    Then error message should be displayed

    Examples:
      | username     | password    |
      | Techno_Study3 | 1234        |
      | Techno       | Techno12345 |
      | asdfg        | 12345       |