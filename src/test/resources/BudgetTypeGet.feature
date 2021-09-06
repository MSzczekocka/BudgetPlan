Feature: Test GET method
  Scenario: Get data from budget_type table
    Given User perform GET operation for "/budgettypes"
    Then User should get all budget types




#      | 1 | "Basic Accounts"     |
#      | 2 | "Basic Savings"      |
#      | 3 | "Investment Account" |