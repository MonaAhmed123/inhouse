package org.example.Pages;
import org.example.StepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class P2_SignIn {
    public P2_SignIn()
    {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(xpath = "//a[@class='account-width' " +
            "and @href='https://staging.inhouse.sa/ar/customer/account/login/']")
    public WebElement loginPage;
    @FindBy(xpath = "//input[@name='login[username]' and @id='email']")
    public WebElement emailField;
    @FindBy(xpath = "//input[@name='login[password]' and @id='pass']")
    public WebElement passwordField;

    @FindBy(xpath ="//button[@type='submit' and contains(@class, 'login') and " +
            "contains(@class, 'primary') and @name='send' and @id='send2']")
    public WebElement loginButton;

    @FindBy(xpath ="//a[@href='https://staging.inhouse.sa/en/customer/account/']")
    public WebElement AccountPage;
}
