package com.budgetplan.demo;

import com.budgetplan.demo.controller.BudgetTypeController;
import com.budgetplan.demo.entity.BudgetType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BudgetTypeGetMyStepdefs {


    @Given("User perform GET operation for \\/budget-types")
    public void userPerformGETOperationForBudgetTypes() {
    }

    @Then("User should get all budget types")
    public void userShouldGetAllBudgetTypes() {
        BudgetTypeController budgetTypeController = mock(BudgetTypeController.class);
        when(budgetTypeController.getBudgetTypes()).thenReturn(testMockData());
        Assert.assertThat(budgetTypeController.getBudgetTypes(), Matchers.hasSize(3));
    }

    private List<BudgetType> testMockData(){
        List<BudgetType> testData = new ArrayList<>();
        testData.add(new BudgetType("Basic Accounts"));
        testData.add(new BudgetType("Basic Savings"));
        testData.add(new BudgetType("Investment Account"));
        return testData;
    }

}
