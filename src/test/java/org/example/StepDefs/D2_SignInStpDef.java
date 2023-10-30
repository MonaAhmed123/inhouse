package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P2_SignIn;
import org.testng.Assert;

import static org.example.StepDefs.Hooks.driver;
import static org.testng.Assert.assertEquals;

public class D2_SignInStpDef {
     P2_SignIn p2_signIn=new  P2_SignIn();

    @Given("User is on the login page")
    public void Userisontheloginpage() {

         p2_signIn.loginPage.click();

       }

    @When("User enters valid {string} and {string}")
    public void userEntersValidAnd(String email, String password) {
         p2_signIn.emailField.sendKeys(email);
         p2_signIn.passwordField.sendKeys(password);
    }

    @And("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
            p2_signIn.loginButton.click();
        }


    @Then("user go to my account page")
    public void userGoToMyAccountPage() {
      /* String expectedURL="{https://staging.inhouse.sa/en/customer/account/}";
        String redirectURL=driver.getCurrentUrl();
        Assert.assertEquals(redirectURL,expectedURL);*/

       /* String actualTitle = driver.getTitle();
        String expectedTitle = "حسابي";
        Assert.assertEquals(expectedTitle,actualTitle);*/

        p2_signIn.AccountPage.click();


    }
}
