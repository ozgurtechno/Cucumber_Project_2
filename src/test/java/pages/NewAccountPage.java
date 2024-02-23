package pages;

import utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NewAccountPage extends Parent {
    public NewAccountPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='type']/option")
    private List<WebElement> accountTypes;

    @FindBy(xpath = "//*[@id='type']")
    private WebElement accountTypeDropbox;

    @FindBy(xpath = "(//*[@ng-submit='submit()']//p)[2]")
    private WebElement minimumDepositMessage;

    @FindBy(xpath = "//*[@id='fromAccountId']/option")
    private List<WebElement> accountIDs;

    @FindBy(xpath = "//*[@id='fromAccountId']")
    private WebElement accountIDdropbox;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement openNewAccount;

    @FindBy(xpath = "//*[@id='rightPanel']//h1")
    private WebElement newAccountOpenedMessage;

    @FindBy(xpath = "//*[@id='newAccountId']")
    private WebElement newAccountID;

    public List<WebElement> getAccountTypes() {
        return accountTypes;
    }

    public WebElement getAccountTypeDropbox() {
        return accountTypeDropbox;
    }

    public WebElement getMinimumDepositMessage() {
        return minimumDepositMessage;
    }

    public List<WebElement> getAccountIDs() {
        return accountIDs;
    }

    public WebElement getAccountIDdropbox() {
        return accountIDdropbox;
    }

    public WebElement getOpenNewAccount() {
        return openNewAccount;
    }

    public WebElement getNewAccountOpenedMessage() {
        return newAccountOpenedMessage;
    }

    public WebElement getNewAccountID() {
        return newAccountID;
    }
}