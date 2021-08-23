Feature: Add Budget Type
  Given User is on Operation page
  When User enters following operation details
    | 123.45 | "Electricity Bill March" | 15.04.21 | 1 | 1 | 1 |
    | 26.99 | "Lunch 26.04" | 26.04.21 | 1 | 1 | 1 |
    | 123.45 | "Monthly Savings March" | 10.04.21 | 2 | 2 | 3 |
    | 1000.00 | "Salary March" | 9.04.21 | 4 | 4 | 2 |
  Then Operation should be added

Feature: Delete Operation
  Given User is on Operation details page
  When User picking operation with ID
    | 1 |
  Then Operation should be deleted






