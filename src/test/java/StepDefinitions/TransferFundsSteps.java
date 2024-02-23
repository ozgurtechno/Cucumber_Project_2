package StepDefinitions;

import pages.AccountServices;
import pages.TransferFundsPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import static pages.Parent.select;
import static pages.Parent.waitForList;
import static utilities.BaseDriver.getDriver;

public class TransferFundsSteps {
    AccountServices as = new AccountServices();
    TransferFundsPage tfp = new TransferFundsPage();

    @Given("The user must come to the transfer Funds transaction page")
    public void theUserMustComeToTheTransferFundsTransactionPage() {
        tfp.clickFunction(as.getTransferFunds());
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("body")));
    }

    @When("The user must complete the Transfer Fund transaction")
    public void theUserMustCompleteTheTransferFundTransaction() {

        select(tfp.getFromAccount()).selectByIndex(0);
        select(tfp.getToAccount()).selectByIndex(1);
        tfp.sendKeysFunction(tfp.getAmount(), "15");
        tfp.clickFunction(tfp.getTransferButton());
        tfp.verifyContainsText(tfp.getTitle(), "Transfer Complete!");

    }

    @Then("User must verify Transfer Fund transaction")
    public void userMustVerifyTransferFundTransaction() {

        tfp.clickFunction(as.getAccountsOverview());
        tfp.clickFunction(tfp.getSentAccount());
        List<WebElement> debitElements = waitForList(tfp.getListOfDebit());
        System.out.println("debitElements.size() = " + debitElements.size());
        boolean isThere = false;

        for (WebElement we : debitElements) {
            if (we.getText().equals("$15.00"))
                isThere = true;
        }
        Assert.assertTrue(isThere, "No $15 transfer found in the transaction history.");
    }

    @And("The user must check that the account sent from the account appears as credit")
    public void theUserMustCheckThatTheAccountSentFromTheAccountAppearsAsCredit() {

        tfp.clickFunction(as.getAccountsOverview());
        tfp.clickFunction(tfp.getReceiveAccount());
        List<WebElement> creditElements = waitForList(tfp.getListOfCredit());
        System.out.println("creditElements.size() = " + creditElements.size());
        boolean isThere = false;

        for (WebElement we : creditElements) {
            if (we.getText().equals("$15.00"))
                isThere = true;
        }
        Assert.assertTrue(isThere, "No $15 transfer received found in the transaction history.");
    }

}
