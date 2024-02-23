package StepDefinitions;

import utilities.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void before() {
        System.out.println(">>> Starting Automation <<<");
    }

    @After
    public void after(Scenario scenario) {
        // Keep the extent report's plugin open while it is active
        if (scenario.isFailed()) {
            TakesScreenshot screenshot = ((TakesScreenshot) BaseDriver.getDriver());
            byte[] stateInMemory = screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(stateInMemory, "image/png", "screenshot name");
        }
        System.out.println("::: Ending Automation :::");
        BaseDriver.quitDriver();
    }
}