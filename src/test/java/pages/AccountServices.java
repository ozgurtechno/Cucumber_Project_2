package pages;

import utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountServices {
    public AccountServices() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Open New Account']")
    private WebElement openNewAccount;

    @FindBy(xpath = "//a[text()='Accounts Overview']")
    private WebElement accountsOverview;

    @FindBy(xpath = "//a[text()='Transfer Funds']")
    private WebElement transferFunds;

    @FindBy(xpath = "//a[text()='Bill Pay']")
    private WebElement billPay;

    @FindBy(xpath = "//a[text()='Find Transactions']")
    private WebElement findTransactions;

    @FindBy(xpath = "//a[text()='Update Contact Info']")
    private WebElement updateContactInfo;

    @FindBy(xpath = "//a[text()='Log Out']")
    private WebElement logout;

    public WebElement getOpenNewAccount() {
        return openNewAccount;
    }

    public WebElement getAccountsOverview() {
        return accountsOverview;
    }

    public WebElement getTransferFunds() {
        return transferFunds;
    }

    public WebElement getBillPay() {
        return billPay;
    }

    public WebElement getFindTransactions() {
        return findTransactions;
    }

    public WebElement getUpdateContactInfo() {
        return updateContactInfo;
    }

    public WebElement getLogout() {
        return logout;
    }
}
