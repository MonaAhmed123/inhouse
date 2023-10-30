package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_Register;

import static org.example.StepDefs.Hooks.driver;

public class D01_Register {
    P01_Register  register=new P01_Register();

    @Given("The user is on the website's homepage")
    public void theUserIsOnTheWebsiteSHomepage() {
        driver.get("https://staging.inhouse.sa/ar/");
    }

    @When("The user clicks on the Sign Up button in the top right corner of the page.")
    public void theUserClicksOnTheButtonInTheTopRightCornerOfThePage() {

    }

    @Then("The user is redirected to the Sign Up page")
    public void theUserIsRedirectedToTheSignUpPage() {
    }

    @When("The user enters {string}, {string}, {string}, {string}, and {string}")
    public void theUserEntersAnd(String arg0, String arg1, String arg2, String arg3, String arg4) {
    }


    @And("click the create account button")
    public void clickTheCreateAccountButton() {
    }

    @Then("signup must be successful.")
    public void signupMustBeSuccessful() {
    }
}
