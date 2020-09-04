@tag
Feature: To validate the telecom App

  @tag1
  Scenario: To validate the add the customer function
    Given launch chrome and open the application
    When click add to button enter the customer details
      | yedhu   | anjitha  | monyedhu@gmail.com  | kanikudiyil       | 9020465722 |
      | vijayan | Devayani | clanyedhu@gmail.com | kanikudiyil house | 9020465714 |
    And click the submit button now
    Then check uid is generated correct
