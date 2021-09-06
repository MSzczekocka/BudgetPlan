package com.example.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.assertj.core.api.BDDAssertions.then;
import static org.hamcrest.Matchers.*;

public class BudgetTypeGetStepdefs {
    public static final String BASE_URI = "http://localhost:8080/budgettypes";


    @Given("User perform GET operation for {string}")
    public void userPerformGETOperationFor(String url) {
        given().contentType(ContentType.JSON);
    }


    @Then("User should get budget types")
    public void userShouldGetBudgetTypes() {

        when().get(BASE_URI).
                then().body("nameBudgetType", arrayContaining("Basic Accounts","Basic Savings","Investment Account"));
//                then().body("id", containsInAnyOrder("Basic Accounts","Basic Savings" , "Investment Account"));
    }
}