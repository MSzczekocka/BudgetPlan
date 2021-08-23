Feature: Add Category
  Given User is on adding Category page
  When User enters following operation details
    | "Eating Out" | "Yellow" |
    | "Basic Savings" | "Green" |
    | "Clothes" | "Red" |
    | "Salary" | "Blue" |
  Then Category should be added

Feature: Delete Category
  Given User is on deleting Category page
  When User picking Category with ID
    | 3 |
  Then Category should be deleted