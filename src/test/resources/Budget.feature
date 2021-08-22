Feature: Add Budget
  Given User is on adding Budget page
  When User enters following operation details
    | "Eating Out" | 1 |
    | "Basic Savings" | 2|
    | "Clothes" | 1 |
    | "Incomes" | 1 |
  Then Budget should be added

Feature: Delete Budget
  Given User is on deleting Budget page
  When User picking Budget with ID
    | 3 |
  Then Budget should be deleted