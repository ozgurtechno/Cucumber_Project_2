Feature: Bill Pay Functionality

  Background:
    Given Navigate to Para Bank Website
    And Fill in the Login Username input as "Techno_Study3"
    And Fill in the Login Password input as "Techno123453"
    When Click to Log in button

  Scenario Outline: Bill Payment Process
    And Click to Bill Pay button
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
      | payeeName | address                            | city     | state    | zipcode | phone      | account | verifyAccount | amount |
      | Electric  | Ataturk Caddesi 20                 | Istanbul | Istanbul | 1425    | 5328759663 | 123456  | 123456        | 85     |
      | Water     | Galatasaray Sampiyonluk Caddesi 25 | Ankara   | Ankara   | 2563    | 5328759661 | 74123   | 74123         | 42     |
      | Telephone | Fenerbahce sokak 63                | Adana    | Adana    | 9685    | 5328759664 | 14563   | 14563         | 23     |
#      | Gas         | Besiktas bulvari 85                | Izmir      | Izmir      | 7896    | 5328759665 | 78963   | 78963         | 120    |
#      | Garbage Tax | Trabzon sokak 61                   | Diyarbakir | Diyarbakir | 4153    | 5328759668 | 71365   | 71365         | 50     |