package StepDefinitions;

import pages.LoanPage;
import utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoanSteps {

    LoanPage loanPage = new LoanPage();

    @When("The User click Request Loan and landing Loan Page")
    public void theUserClickRequestLoanAndLandingLoanPage() {
        loanPage.clickFunction(loanPage.getRequestLoanLink());
    }

    @And("Fill in the Loan Amount as {string}")
    public void fillInTheLoanAmountAs(String arg0) {
        loanPage.sendKeysFunction(loanPage.getLoanAmountField(),arg0);;
    }

    @And("Fill in the Down Payment as {string}")
    public void fillInTheDownPaymentAs(String arg0) {
        loanPage.sendKeysFunction(loanPage.getDownPaymentField(),arg0);;
    }

    @And("The User click on the Apply Now button")
    public void theUserClickOnTheButton() {
//        select(loanPage.getAccountSelect()).selectByIndex(0);
        loanPage.clickFunction(loanPage.getApplyButton());
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("body")));
    }

    @Then("And The user should be seen the following {string} and {string}")
    public void andTheUserShouldBeSeenTheFollowingAnd(String arg0, String arg1) {

        loanPage.verifyContainsText(loanPage.getStatus(), arg0);
        loanPage.verifyContainsText(loanPage.getMessage(), arg1);
        Assert.assertEquals(arg0, loanPage.getStatus().getText(), "Undefined status!");
        Assert.assertEquals(arg1, loanPage.getMessage().getText(), "Message not found!");
    }


}
