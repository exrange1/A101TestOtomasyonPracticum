package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles/Purchase.feature"},
        glue = {"StepDefinitions"},
        plugin = {"html:target//cucumber-reports.html"}

)


public class Runner1 extends AbstractTestNGCucumberTests {

}
