package StepDefinitions;
import pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @And("Fill in the Login Username input as {string}")
    public void fillInTheLoginUsernameInputAs(String arg0) {
        loginPage.findAndSend("username", arg0);

    }

    @And("Fill in the Login Password input as {string}")
    public void fillInTheLoginPasswordInputAs(String arg0) {
        loginPage.findAndSend("passwordLogin", arg0);
    }

    @When("Click to Log in button")
    public void clickToLogInButton() {
        loginPage.findAndClick("loginBtn");
    }

    @Then("Verify that you are logged in")
    public void verifyThatYouAreLoggedIn() {
        loginPage.findAndContainsText("successMessage", "Welcome");
    }

//    @Then("Error message should be displayed")
//    public void errorMessageShouldBeDisplayed() {
//        loginPage.findAndContainsText("errorMessage", "Please enter a username and password.");
//    }

    @Then("Error message should be displayed")
    public void internalErrorMessageShouldBeDisplayed() {
        loginPage.findAndContainsText("errorMessage", "Please enter a ");
//        loginPage.findAndContainsText("errorMessage", "An internal error has occurred and has been logged.");
    }

    @And("Click to Log out button")
    public void clickToLogOutButton() {
        loginPage.findAndClick("LogOutBtn");
    }


}
