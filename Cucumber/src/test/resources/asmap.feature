@tag
Feature: To validate the telecom App

  @tag1
  Scenario: To validate the add the customer function
    Given launch chrome and open the application
    When click add to button enter the customer details
      | fname | yedhu              |
      | sname | devyani            |
      | email | monyedhu@gmail.com |
      | aadr  | kanikudiyil        |
      | ph    |          651321321 |
    And click the submit button now
    Then check uid is generated correct
