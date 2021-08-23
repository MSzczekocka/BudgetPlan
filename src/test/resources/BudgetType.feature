Feature: Add Budget Type
  Given User is on Budget Type page
  When User enters following operation details
    | "Basic Account" |
    | "Savings" |
    | "Savings for an Apartment" |
  Then Budget Type should be added

Feature: Delete Budget Type
  Given User is on Budget Type Details page
  When User picking Budget Type with ID
    | 3 |
  Then Budget Type should be deleted