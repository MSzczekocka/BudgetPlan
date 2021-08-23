Feature: Add Budget
  Given User is on Budget page
  When User enters following operation details
    | "Spending Money" | 1 |
    | "Basic Savings" | 2 |
    | "Bills" | 1 |
    | "Regular Incomes" | 1 |
  Then Budget should be added

Feature: Delete Budget
  Given User is on Budget Details page
  When User picking Budget with ID
    | 3 |
  Then Budget should be deleted