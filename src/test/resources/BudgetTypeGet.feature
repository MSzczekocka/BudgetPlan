Feature: Test GET method
  Scenario: Get date with ID = 1 from budget_type table
    Given User perform GET operation for "/budgettypes"
    And User perform GET for the post number "1"
    Then User should get "Basic Accounts"




#      | 1 | "Basic Accounts"     |
#      | 2 | "Basic Savings"      |
#      | 3 | "Investment Account" |