Feature: Add Budget Type
  Given User is on adding operation page
  When User enters following operation details
    | 123.45 | "Electricity Bill March" | 1 | 1 | 1 |
    | 26.99 | "Lunch 26.04" | 1 | 1 | 1 |
    | 123.45 | "Monthly Savings March" | 2 | 2 | 3 |
    | 1000.00 | "Income X" | 4 | 4 | 2 |
  Then Operation should be added

Feature: Delete Operation
  Given User is on deleting operation page
  When User picking operation with ID
    | 1 |
  Then Operation should be deleted






