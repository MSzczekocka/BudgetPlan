package com.example.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import pl.budgetplan.BudgetTypeRestController;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BudgetTypeGetStepdefs {
    @Autowired
    private BudgetTypeRestController controller;

    @Given("User perform GET operation for \\/budgettypes")
    public void userPerformGETOperationForBudgettypes() {
        assertThat(controller).isNotNull();
    }


    @Then("User should get all budget types")
    public void userShouldGetAllBudgetTypes() {
    }
}
