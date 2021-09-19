Feature: Test GET method
  Scenario: Get date all date form budget-type table
    Given User perform GET operation for /budget-types
    Then User should get all budget types

