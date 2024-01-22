package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/Features", // Path to your feature files
        glue = "org/example/StepDefs",      // Package where your step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@smoke"  // Optional: Specify a tag to run scenarios with specific tags
)
public class runner {
    // This class will not have any code. It's just a placeholder for the annotations.
}
