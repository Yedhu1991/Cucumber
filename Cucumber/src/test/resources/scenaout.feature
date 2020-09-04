@tag
Feature: To validate facebook application

  @tag2
  Scenario Outline: To validate the login functionality
    Given launch chrome and open facebook app
    When user enters the username and password "<username>","<password>"
    Then user enters to the home page

    Examples: 
      | username           | password   |
      | monyedhu@gmail.com |   94531231 |
      | monyedhu           | 9020465722 |
      | monyedhu           |   94531231 |
      | monyedhu@gmail.com | 9020465722 |
