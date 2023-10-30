package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver=null;
    @Before
    public static   void  openBrowser()
    {

        // Set system property for chromedriver executable
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver(options);

        // Maximize the browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // 4- navigate to url
        driver.get("https://staging.inhouse.sa/");
    }

    @After
    public   void  quitBrowser() throws InterruptedException {
        // Quit the driver
        Thread.sleep(3000);
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

}
