package pages;

import utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanPage extends Parent {

    public LoanPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(linkText = "Request Loan")
    private WebElement requestLoanLink;

    @FindBy(css = "input#amount")
    private WebElement loanAmountField;

    @FindBy(css = "input#downPayment")
    private WebElement downPaymentField;

    @FindBy(css = "select#fromAccountId")
    private WebElement accountSelect;

    @FindBy(css = "input[type='submit']")
    private WebElement applyButton;

    @FindBy(css = "td[id='loanStatus']")
    private WebElement status;

    @FindBy(xpath = "(//div/p)[3]")
    private WebElement message;

    @FindBy(css = "(h1.title")
    private WebElement title;


    public WebElement getRequestLoanLink() {
        return requestLoanLink;
    }

    public WebElement getLoanAmountField() {
        return loanAmountField;
    }

    public WebElement getDownPaymentField() {
        return downPaymentField;
    }

    public WebElement getAccountSelect() {
        return accountSelect;
    }

    public WebElement getApplyButton() {
        return applyButton;
    }

    public WebElement getStatus() {
        return status;
    }

    public WebElement getMessage() {
        return message;
    }

    public WebElement getTitle() {
        return title;
    }
}