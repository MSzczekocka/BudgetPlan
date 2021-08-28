Feature: Add Operation Type
  Given User is on Operation Type page
  When User enters following Operation Type details
    | "Outcome" |
    | "Income" |
    | "Savings" |
    | "Credit" |
  Then Operation should be added

Feature: Show Operation Type Details
  Given User is on Operation Type page
  When User click on Operation Type with ID 1
  Then Budget Operation Type page should be open

Feature: Delete Operation Type
  Given User is on Operation Type Details page
  When User picking Operation Type with ID
    | 4 |
  Then Operation Type should be deleted