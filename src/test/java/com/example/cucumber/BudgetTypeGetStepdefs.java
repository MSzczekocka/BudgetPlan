package com.example.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import pl.budgetplan.BudgetTypeRestController;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@AllArgsConstructor
@NoArgsConstructor
public class BudgetTypeGetStepdefs {
    @Autowired
    private BudgetTypeRestController controller;

    @Given("User perform GET operation for budgettypes")
    public void userPerformGETOperationForBudgettypes() {
        assertNotNull(controller);
    }


    @Then("User should get all budget types")
    public void userShouldGetAllBudgetTypes() {
    }
}
