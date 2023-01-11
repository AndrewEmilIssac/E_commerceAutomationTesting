@smoke
Feature: F02_Login | users could use login functionality to use their accounts

  Background:user open login page
    Given user go to login page

  Scenario: user could login with valid email and password
  When user login with  "test@example.com" and "P@ssw0rd"
  And  user press on login button
  Then user login to the system successfully

  Scenario: user could login with Invalid email and password
    When user login with  "wrong@exampleeee.com" and "P@ssw0rd"
    And  user press on login button
    Then user could not login to the system
