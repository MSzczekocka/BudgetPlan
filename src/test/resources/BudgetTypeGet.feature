Feature: Test GET method
  Scenario: Get date from budget_type table
    Given User perform GET operation for budgettypes
    Then User should get all budget types


