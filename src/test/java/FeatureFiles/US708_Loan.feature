Feature: Loan Application

  Background:
    Given Navigate to Para Bank Website
    And Fill in the Login Username input as "janesmith76"
    And Fill in the Login Password input as "Qwerty12"
    When Click to Log in button

  @Payment @Regression
  Scenario Outline: Request credit
    When The User click Request Loan and landing Loan Page
    And Fill in the Loan Amount as "<loanAmount>"
    And Fill in the Down Payment as "<downPayment>"
    And The User click on the Apply Now button
    Then  And The user should be seen the following "<status>" and "<messages>"
    Examples:
      | loanAmount | downPayment | status   | messages                                                                          |
      | 200        | 40          | Approved | Congratulations, your loan has been approved.                                     |
      | 1000000    | 10000       | Denied   | You do not have sufficient funds for the given down payment.                      |
      | 10         | 100         | Denied   | We cannot grant a loan in that amount with your available funds and down payment. |