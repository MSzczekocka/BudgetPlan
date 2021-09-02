Feature: Test GET method
  Scenario: Get dates added to budget_type table
    Given User perform operation from "http://localhost:8080/budgettypes"
    Then User should get
      | 1 | "Basic Accounts"     |
      | 2 | "Basic Savings"      |
      | 3 | "Investment Account" |