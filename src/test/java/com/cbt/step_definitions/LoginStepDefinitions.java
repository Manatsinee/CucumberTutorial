package com.cbt.step_definitions;

import com.cbt.pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginStepDefinitions {
    private final LoginPage loginPage;

    public LoginStepDefinitions(LoginPage loginPage){
        this.loginPage = loginPage;
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        System.out.println("I am on the login page");
    }

    @When("user logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {

        System.out.println("Trying to login as store manager");
    }

    @Then("user should be able to see Dashboard page title")
    public void user_should_be_able_to_see_Dashboard_page_title() {
        System.out.println("I see that page title is a Dashboard");
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        System.out.printf("Enter username %s, and password %s to login\n\n", username, password);

    }


}
