package com.example.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BudgetTypeGetStepdefs {
//    @Autowired
//    private BudgetTypeRestController controller;

    @Given("User perform GET operation for budgettypes")
    public void userPerformGETOperationForBudgettypes() {
//        assertNotNull(controller);
    }


    @Then("User should get all budget types")
    public void userShouldGetAllBudgetTypes() {
    }
}
