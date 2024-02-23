package pages;

import utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TransferFundsPage extends Parent {
    public TransferFundsPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "amount")
    private WebElement amount;
    @FindBy(css = "select[id='fromAccountId'")
    private WebElement fromAccount;
    @FindBy(css = "select[id='toAccountId'")
    private WebElement toAccount;
    @FindBy(xpath = "//input[@value='Transfer']")
    private WebElement transferButton;
    @FindBy(xpath = "(//table[@id='accountTable']//tr)[3]//a")
    private WebElement receiveAccount;
    @FindBy(xpath = "(//table[@id='accountTable']//tr)[2]//a")
    private WebElement sentAccount;

    @FindBy(xpath = "//table[@id=\"transactionTable\"]/tbody//td[4]")
    private List<WebElement> listOfCredit;

    @FindBy(xpath = "//table[@id=\"transactionTable\"]/tbody//td[3]")
    private List<WebElement> listOfDebit;
    @FindBy(css = "h1.title")
    private WebElement title;

    @FindBy(css = "//p/span[@id='amount']")
    private WebElement msgAmount;

    @FindBy(css = "//p/span[@id='fromAccountId']")
    private WebElement msgFromAccountId;

    @FindBy(css = "//p/span[@id='toAccountId']")
    private WebElement msgToAccountId;

    public WebElement getAmount() {
        return amount;
    }

    public WebElement getFromAccount() {
        return fromAccount;
    }

    public WebElement getToAccount() {
        return toAccount;
    }

    public WebElement getTransferButton() {
        return transferButton;
    }

    public WebElement getReceiveAccount() {
        return receiveAccount;
    }

    public WebElement getSentAccount() {
        return sentAccount;
    }

    public List<WebElement> getListOfCredit() {
        return listOfCredit;
    }

    public List<WebElement> getListOfDebit() {
        return listOfDebit;
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getMsgAmount() {
        return msgAmount;
    }

    public WebElement getMsgFromAccountId() {
        return msgFromAccountId;
    }

    public WebElement getMsgToAccountId() {
        return msgToAccountId;
    }
}
