package com.example.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pl.budgetplan.Main;

import static org.junit.Assert.assertEquals;

public class HelloWorldStepdefs {
    private String name;
    private String greetings;

    @Given("I want to say hello to {string}")
    public void iWantToSayHelloTo(String arg0) {
        name = arg0;
    }

    @When("I start program")
    public void iStartProgram() {
        Main main = new Main();
        greetings =main.helloWorld(name);
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String arg0) {
        assertEquals(arg0,greetings);
    }
}
