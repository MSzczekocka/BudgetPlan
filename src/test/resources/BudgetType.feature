Feature: Add Budget Type
  Given User is on Budget Type page
  When User enters following operation details
    | "Basic Account" |
    | "Savings" |
    | "Savings for an Apartment" |
  Then Budget Type should be added

Feature: Show Budget Type Details
  Given User is on Budget Type page
  When User click on Budget Type with ID 1
  Then Budget Type Details page should be open

Feature: Delete Budget Type
  Given User is on Budget Type Details page
  When User picking Budget Type with ID
    | 3 |
  Then Budget Type should be deleted