package com.example.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.assertj.core.api.BDDAssertions.then;

public class BudgetTypeGetStepdefs {

    @Given("User perform GET operation for {string}")
    public void userPerformGETOperationFor(String url) {
        given().contentType(ContentType.JSON);
    }

    @And("User perform GET for the post number {string}")
    public void userPerformGETForThePostNumber(String idBudgetType) {
        when().get(String.format("http://localhost:8080/budgettype/%s", idBudgetType));
        then().body()
    }

    @Then("User should get {string}")
    public void userShouldGet(String nameBudgetType) {
    }
}
