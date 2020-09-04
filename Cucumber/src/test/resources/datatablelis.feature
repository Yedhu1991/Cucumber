@tag
Feature: To validate the telecom Applicatiom

  @tag1
  Scenario: To validate the add the customer functionality
    Given launch chrome and open the app
    When click add to button enter the details
      | yedhu | anjitha | monyedhu@gmail.com | kanikudiyil | 9020465722 |
    And click the submit button
    Then check uid is generated
