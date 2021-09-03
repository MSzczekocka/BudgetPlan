Feature: Say hello to something/someone
  Scenario: Greetings for World
    Given I want to say hello to "World"
    When I start program
    Then I should be told "Hello World"

  Scenario: Greetings for X
    Given I want to say hello to "X"
    When I start program
    Then I should be told "Hello X"