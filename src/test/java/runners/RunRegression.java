package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@Regression",
        features = {
                "src/test/java/cucumber2Parabank/featureFiles/",
        },
        glue = {"cucumber2Parabank.stepDefinitions"}

)
public class RunRegression extends AbstractTestNGCucumberTests {

}