package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.PracticePage;
import utils.ConfigReader;
import utils.Driver;

public class Step_Defs {
    PracticePage practicePage = new PracticePage();


    @Given("User visits the automation exercise page")
    public void userVisitsTheAutomationExercisePage() {

        Driver.getDriver().get(ConfigReader.getProperty("homeURL"));
    }

    @And("User clicks the practice link")
    public void userClicksThePracticeLink() {
        practicePage.getPracticeLinkHeadBar().click();

    }

    @And("User clicks the Test Login Page button")
    public void userClicksTheTestLoginPageButton() {
        practicePage.getTestLoginPageLink().click();
    }

    @When("User tries to log in with {string} and {string}")
    public void userTriesToLogInWithAnd(String username, String password) {
        practicePage.getUsernameTextBox().sendKeys(ConfigReader.getProperty(username));
        practicePage.getPasswordTextBox().sendKeys(ConfigReader.getProperty(password));
        practicePage.getSubmitButton().click();
    }

    @Then("User confirms that login is succesful")
    public void userConfirmsThatLoginIsSuccesful() {
        Assert.assertTrue(practicePage.getLogOutButton().isDisplayed());
        practicePage.getLogOutButton().click();
    }

    @And("User quits the browser")
    public void userQuitsTheBrowser() {
        Driver.quitDriver();
    }

    @Then("User confirms that login is unsuccesful")
    public void userConfirmsThatLoginIsUnsuccesful() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(practicePage.getErrorText().isDisplayed());
    }

    @Then("User confirms that login is not succesful")
    public void userConfirmsThatLoginIsNotSuccesful() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertFalse(practicePage.getErrorText().isDisplayed());
    }
}
