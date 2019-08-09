package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.HomePage;
import pages.LoginPage;
import utilities.Config;
import utilities.Driver;

public class Hooks {
    @Before
    public void logIn() {
        Driver.getDriver().get(Config.getProperty("baseUrl"));
        LoginPage lp = new LoginPage();
        HomePage hp = new HomePage();
        lp.inputEmailBox.sendKeys(Config.getProperty("username"));
        lp.inputPasswordBox.sendKeys(Config.getProperty("password"));
        lp.logInButton.click();
        hp.calendarHeaderLink.click();
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println(scenario.getName());
        System.out.println(scenario.getStatus());

        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs((OutputType.BYTES));
            scenario.embed(screenShot, "image/png");
        }
        Driver.quitDriver();
    }
}
