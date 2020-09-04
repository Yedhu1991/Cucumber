@tag
Feature: To validate the telecom App

  @tag1
  Scenario: To validate the add the customer function
    Given launch chrome and open the application
    When click add to button enter the customer details
      | fname   | sname   | email              | addr        | ph         |
      | yedhu   | anjitha | monyedhu@gmail.com | kanikudiyil | 1321321313 |
      | vijayan | devyani | vijiyan@gmail.com  | kanikudiyil |  213213213 |
    And click the submit button now
    Then check uid is generated correct
