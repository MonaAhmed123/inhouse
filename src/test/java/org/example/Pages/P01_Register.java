package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_Register {
    WebDriver driver;

    @FindBy(id = "firstname")
    private WebElement firstNameField;

    @FindBy(id = "lastname")
    private WebElement lastNameField;

    @FindBy(id = "email_address")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "password-confirmation")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//button[@title='Create an Account']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//span[contains(text(),'Thank you for registering with Inhouse.sa.')]")
    private WebElement successMessage;

    public P01_Register() {

        PageFactory.initElements(Hooks.driver, this);
    }

}
