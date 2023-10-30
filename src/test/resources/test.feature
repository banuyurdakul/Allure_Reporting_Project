@test
Feature: User should be able to log in to website

  Scenario : User enters valid username and valid password to log in (Positive Test Case)

    Given User visits the automation exercise page
    And   User clicks the practice link
    And   User clicks the Test Login Page button
    When  User tries to log in with "validUsername" and "validPassword"
    Then  User confirms that login is succesful
    And   User quits the browser

   Scenario: User enters valid username and unvalid password to log in (Negative Test Case)
     Given User visits the automation exercise page
     And   User clicks the practice link
     And   User clicks the Test Login Page button
     When  User tries to log in with "validUsername" and "unvalidPassword"
     Then  User confirms that login is unsuccesful
     And   User quits the browser

  Scenario: User enters valid username and unvalid password to log in (Negative Test Case Designed to Fail)
    Given User visits the automation exercise page
    And   User clicks the practice link
    And   User clicks the Test Login Page button
    When  User tries to log in with "unvalidUsername" and "validPassword"
    Then  User confirms that login is not succesful
    And   User quits the browser




