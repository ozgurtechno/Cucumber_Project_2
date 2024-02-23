package pages;

import utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Parent {

    public RegisterPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()=\"Register\"]")
    private WebElement registerMenuBtn;

    @FindBy(id = "customer.firstName")
    private WebElement firstName;

    @FindBy(id = "customer.lastName")
    private WebElement lastName;

    @FindBy(id = "customer.address.street")
    private WebElement address;

    @FindBy(id = "customer.address.city")
    private WebElement city;

    @FindBy(id = "customer.address.state")
    private WebElement state;

    @FindBy(id = "customer.address.zipCode")
    private WebElement zipcode;

    @FindBy(id = "customer.phoneNumber")
    private WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    private WebElement ssn;

    @FindBy(id = "customer.username")
    private WebElement customerUsername;

    @FindBy(id = "customer.password")
    private WebElement customerPassword;

    @FindBy(id = "repeatedPassword")
    private WebElement customerPasswordConfirm;

    @FindBy(css = "input[value=\"Register\"]")
    private WebElement registerBtn;

    @FindBy(css = "div[id=\"rightPanel\"]>p")
    private WebElement successMessage;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "firstName":
                myElement = firstName;
                break;
            case "lastName":
                myElement = lastName;
                break;
            case "city":
                myElement = city;
                break;
            case "zipcode":
                myElement = zipcode;
                break;
            case "ssn":
                myElement = ssn;
                break;
            case "state":
                myElement = state;
                break;
            case "address":
                myElement = address;
                break;
            case "phoneNumber":
                myElement = phoneNumber;
                break;
            case "customerUsername":
                myElement = customerUsername;
                break;
            case "customerPassword":
                myElement = customerPassword;
                break;
            case "customerPasswordConfirm":
                myElement = customerPasswordConfirm;
                break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "registerMenuBtn":
                myElement = registerMenuBtn;
                break;
            case "registerBtn":
                myElement = registerBtn;
                break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {
            case "successMessage":
                myElement = successMessage;
                break;
        }
        verifyContainsText(myElement, text);
    }
}
