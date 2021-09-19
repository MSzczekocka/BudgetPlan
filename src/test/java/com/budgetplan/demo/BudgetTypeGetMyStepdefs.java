package com.budgetplan.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class BudgetTypeGetMyStepdefs {

    @Given("User perform GET operation for \\/budget-types")
    public void userPerformGETOperationForBudgetTypes() {

    }

    @Then("User should get all budget types")
    public void userShouldGetAllBudgetTypes() {
    }
}
