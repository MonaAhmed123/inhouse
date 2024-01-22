package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_Register;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

import static org.example.StepDefs.Hooks.driver;

public class D01_Register {

    P01_Register p01_register=new P01_Register();

    @Given("The user is on the signup page")
    public void theUserIsOnTheWebsiteSHomepage() {
        p01_register.RegisterPage.click();
    }

    @When("The user enters {string}, {string}, {string},{string},{string}, and {string}")
    public void theUserEntersAnd(String firstname , String lastname, String email, String mobile, String pass, String confirmPass) {
        p01_register.firstNameField.sendKeys(firstname);
        p01_register.lastNameField.sendKeys(lastname);
        p01_register.emailField.sendKeys(email);
        p01_register.mobileField.sendKeys(mobile);
        p01_register.passwordField.sendKeys(pass);
        p01_register.confirmPasswordField.sendKeys(confirmPass);


        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(p01_register.showwPass));
        p01_register.showwPass.submit();

    }

    @And("click the create account button")
    public void clickTheCreateAccountButton() {
        boolean ISDisplay=p01_register.createAccountButton.isDisplayed();
        System.out.println("is button displayed?"+ISDisplay);
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(p01_register.createAccountButton));
        p01_register.createAccountButton.submit();
    }

    @Then("signup must be successful.")
    public void signupMustBeSuccessful() {
        boolean isDisplay=p01_register.RegisterSuccessfulMessage.isDisplayed();
        System.out.println("Is Registeration Successful MessageDisplayed"+isDisplay);
    }

    @Then("An error message {string} should be displayed")
    public void anErrorMessageShouldBeDisplayed(String error_message) {

    }
}
