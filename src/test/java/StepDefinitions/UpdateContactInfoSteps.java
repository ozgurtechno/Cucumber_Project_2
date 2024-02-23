package StepDefinitions;

import pages.ContactPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static utilities.BaseDriver.getDriver;

public class UpdateContactInfoSteps {
    ContactPage elements = new ContactPage();

    @And("Click the buttons UpdateContactInfo")
    public void clickTheButtonsUpdateContactInfo(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement linkWebElement = elements.getWebelement(strButtonsList.get(i));
            elements.clickFunction(linkWebElement);
        }
    }

    @And("Clear user informations before UpdateContactlnfo")
    public void clearUserInformationsBeforeUpdateContactlnfo(DataTable clear) {

        List<String> strFieldsList = clear.asList(String.class);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input")));

        for (String s : strFieldsList) {

            WebElement field = elements.getWebelement(s);
            if (field != null) {
                wait.until(ExpectedConditions.elementToBeClickable(field));
                field.clear();
            } else {
                System.out.println("WebElement not found: " + s);
            }
        }
    }

    @And("Write send keys user informations UpdateContactlnfo")
    public void writeSendkeysUserInformationsUpdateContactlnfo(DataTable keys) {
        List<List<String>> items = keys.asLists(String.class);

        for (List<String> item : items) {
            WebElement e = elements.getWebelement(item.get(0));
            String cellInfo = item.get(1);
            elements.sendKeysFunction(e, cellInfo);
        }
    }

    @Then("Success message profile updated")
    public void successMessageProfileUpdated() {
        elements.verifyContainsText(elements.getWebelement("successMessage"), "Profile Updated");
    }

    @Then("Success message update verification")
    public void successMessageUpdateVerification() {
        elements.verifyContainsText(elements.getWebelement("smallText"), "Jane");
    }

    @Then("Warning Message required fields")
    public void warningMessageRequiredFields() {
        elements.verifyContainsText(elements.getWebelement("errorMessage"), "is required.");
    }

    @Then("Empty message profile not updated")
    public void emptyMessageProfileNotUpdated() {
        elements.verifyContainsText(elements.getWebelement("successMessage"), "");
    }

}