package com.example.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;


public class BudgetTypeStepdefs {

    @Given("User is on Budget Type page")
    public void userIsOnBudgetTypePage() {

    }

    @When("User enters following operation details")
    public void userEntersFollowingOperationDetails(List<BudgetType> budgetTypes) {
        String SQL = "INSERT INTO budgetTypes(budgetTypeName) "
                + "VALUES(?,?)";
        try (
                Connection conn = connect();
                PreparedStatement statement = conn.prepareStatement(SQL);) {
            int count = 0;

            for (BudgetType budgetType : budgetTypes) {
                statement.setString(1, budgetTypes.getBudgetTypeName());

                statement.addBatch();
                count++;
                // execute every 100 rows or less
                if (count % 100 == 0 || count == list.size()) {
                    statement.executeBatch();
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Then("Budget Type should be added")
    public void budgetTypeShouldBeAdded() {
        List list = pRepo.findAll();
        assertThat(list).size().isGreaterThan(0);
    }

    @When("User click on Budget Type with ID {int}")
    public void userClickOnBudgetTypeWithID(int arg0) {
    }

    @Then("Budget Type Details page should be open")
    public void budgetTypeDetailsPageShouldBeOpen() {
    }

    @Given("User is on Budget Type Details page")
    public void userIsOnBudgetTypeDetailsPage() {
    }

    @Then("Budget Type should be deleted")
    public void budgetTypeShouldBeDeleted() {
    }
}
