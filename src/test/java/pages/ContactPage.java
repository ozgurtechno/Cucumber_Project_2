package pages;

import utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends Parent {
    public ContactPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = "input[id='customer.firstName']")
    private WebElement firstName;
    @FindBy(css = "input[id='customer.lastName']")
    private WebElement lastName;
    @FindBy(css = "input[id='customer.address.street']")
    private WebElement address;
    @FindBy(css = "input[id='customer.address.city']")
    private WebElement city;
    @FindBy(css = "input[id='customer.address.state']")
    private WebElement state;
    @FindBy(css = "input[id='customer.address.zipCode']")
    private WebElement zipCode;
    @FindBy(css = "input[id='customer.phoneNumber']")
    private WebElement phoneNumber;
    @FindBy(xpath = "//input[@class='button']")
    private WebElement updateButton;
    @FindBy(css = "p[class='smallText']")
    private WebElement smallText;
    @FindBy(xpath = "//div[@class='ng-scope']")
    private WebElement successMessage;
    @FindBy(xpath = "//a[text()='Update Contact Info']")
    private WebElement updateContactInfo;
    @FindBy(xpath = "//a[text()='Log Out']")
    private WebElement logout;
    @FindBy(css = "[class='error ng-scope']")
    private WebElement errorMessage;

    public WebElement getWebelement(String strElement) {
        switch (strElement) {
            case "clickButton":
                return this.updateContactInfo;
            case "firstName":
                return this.firstName;
            case "lastName":
                return this.lastName;
            case "address":
                return this.address;
            case "city":
                return this.city;
            case "state":
                return this.state;
            case "zipcode":
                return this.zipCode;
            case "phoneNumber":
                return this.phoneNumber;
            case "updateButton":
                return this.updateButton;
            case "successMessage":
                return this.successMessage;
            case "errorMessage":
                return this.errorMessage;
            case "smallText":
                return this.smallText;
            case "logout":
                return this.logout;
        }

        return null;
    }
}
