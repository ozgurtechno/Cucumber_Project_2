package StepDefinitions;

import pages.AccountServices;
import pages.NewAccountPage;
import utilities.BaseDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class NewAccountSteps extends NewAccountPage {
    AccountServices as = new AccountServices();
    NewAccountPage nap = new NewAccountPage();

    @Given("Click open new account button from account services menu")
    public void clickOpenNewAccountButtonFromAccountServicesMenu() {
        nap.clickFunction(as.getOpenNewAccount());
    }

    @And("Verify the page, account types existing in the options")
    public void verifyThePageAccountTypesExistingInTheOptions() {
        Assert.assertTrue(BaseDriver.getDriver().getCurrentUrl().toLowerCase().contains("https://parabank.parasoft.com/parabank/openaccount.htm"));
        nap.verifyContainsText(nap.getAccountTypes().get(0), "CHECKING");
        nap.verifyContainsText(nap.getAccountTypes().get(1), "SAVINGS");
    }

    @And("Select one of the account types in the options")
    public void selectOneOfTheAccountTypesInTheOptions() {
        int random = (int) (Math.random() * nap.getAccountTypes().size());
        new Select(nap.getAccountTypeDropbox()).selectByIndex(random);
    }

    @And("Verify the message of minimum deposit amount for the account at time of opening")
    public void verifyTheMessageOfMinimumDepositAmountForTheAccountAtTimeOfOpening() {
        Assert.assertTrue(nap.getMinimumDepositMessage().getText().contains("must be deposited into this account at time of opening. Please choose an existing account to transfer funds into the new account."));
    }

    @And("Select one of the account from the options")
    public void selectOneOfTheAccountFromTheOptions() {
        int rendom = (int) (Math.random() * nap.getAccountIDs().size());
        new Select(nap.getAccountIDdropbox()).selectByIndex(rendom);
    }

    @Then("Click open new account button")
    public void clickOpenNewAccountButton() {
        nap.clickFunction(nap.getOpenNewAccount());
    }

    @And("Verify confirmation message and new account number")
    public void verifyConfirmationMessageAndNewAccountNumber() {
        nap.verifyContainsText(nap.getNewAccountOpenedMessage(), "Account Opened!");
        String newAccoundId= nap.getNewAccountID().getText();
        System.out.println("newAccoundId = " + newAccoundId);
        Assert.assertTrue(nap.getNewAccountID().isDisplayed());
    }
}
