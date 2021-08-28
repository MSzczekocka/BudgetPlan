package com.example.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.Connection;
import java.util.List;

import static org.junit.Assert.*;


public class BudgetTypeStepdefs {

    @Given("User is on Budget Type page")
    public void userIsOnBudgetTypePage() {
        Connection connection = budgetType.openConnection();
        assertNotNull(connection);
    }

    @When("User enters following operation details")
    public void userEntersFollowingOperationDetails(List<BudgetType> budgetTypes) {
        for (BudgetType budgetType: budgetTypes){
            budgetType.addBudgetType();
        }
    }

    @Then("Budget Type should be added")
    public void budgetTypeShouldBeAdded(List<BudgetType> budgetTypes) {
        for (BudgetType budgetType: budgetTypes){
            assertEquals(budgetType.getName(), budgetType.searchBudgetType(budgetTypeID));
        }
    }


    @Given("User is on Budget Type Details page")
    public void userIsOnBudgetTypeDetailsPage() {
        Connection connection = budgetType.openConnection();
    }

    @When("User picking Budget Type with ID")
    public void userPickingBudgetTypeWithID(int budgetTypeID) {
        budgetType.deleteBudgetType(budgetTypeID);
    }

    @Then("Budget Type should be deleted")
    public void budgetTypeShouldBeDeleted(int budgetTypeID) {
        assertEquals(budgetType.searchBudgetType(budgetTypeID)==null);
    }

}
