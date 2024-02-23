Feature: Bill Pay Functionality

  Background:
    Given Navigate to Para Bank Website
    And Fill in the Login Username input as "janesmith76"
    And Fill in the Login Password input as "Qwerty12"
    When Click to Log in button

    @Payment @Smoke @Regression
  Scenario Outline: Bill Payment Process
    When Click to Bill Pay button
    And Fill in the Payee Name input as "<payeeName>"
    And Fill in the Bill Address input as "<address>"
    And Fill in the Bill City input as "<city>"
    And Fill in the Bill State input as "<state>"
    And Fill in the Bill Zip Code input as "<zipcode>"
    And Fill in the Bill Phone input as "<phone>"
    And Fill in the Account input as "<account>"
    And Fill in the Verify Account input as "<verifyAccount>"
    And Fill in the Amount input as "<amount>"
    When Click to Send Payement button
    Then Bill Payment Complete message should be displayed
    And Click to Log out button

    Examples:
      | payeeName     | address          | city        | state | zipcode | phone        | account    | verifyAccount | amount |
      | Electric Inc. | 123 Main Street  | Anytown     | NY    | 10001   | 555-123-4567 | 1234567890 | 1234567890    | 30.00  |
      | Water Co.     | 456 Elm Street   | Anothercity | CA    | 90001   | 555-987-6543 | 0987654321 | 0987654321    | 50.00  |
      | Gas LLC       | 101 Pine Street  | Yourcity    | TX    | 77002   | 555-876-5432 | 1357924680 | 1357924680    | 70.00  |
#     | Internet Co.  | 789 Oak Street   | Somecity    | IL    | 60601   | 555-321-9876 | 9876543210 | 9876543210    | 75.00  |
#     | Phone Co.     | 202 Cedar Street | Mycity      | FL    | 33101   | 555-234-5678 | 2468013579 | 2468013579    | 60.00  |

