package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Driver;

import java.io.ByteArrayInputStream;

public class Hooks {


    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
            Driver.closeDriver();
        }

    }
}
