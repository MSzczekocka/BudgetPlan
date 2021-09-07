Feature: Test GET method
  Scenario: Get date with ID = 1 from budget_type table
    Given User perform GET operation for /budgettypes
    Then User should get all budget types


