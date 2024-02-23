package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@Login",
        features = {
                "src/test/java/cucumber2Parabank/featureFiles/",
        },
        glue = {"cucumber2Parabank.stepDefinitions"}

)
public class RunLogin extends AbstractTestNGCucumberTests {

}