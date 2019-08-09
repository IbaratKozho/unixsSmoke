package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CalendarPage;
import utilities.Driver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MonthButtonVerification {

    CalendarPage cp = new CalendarPage();

    @When("User press on month button")
    public void user_press_on_month_button() throws InterruptedException {
        Thread.sleep(2000);
        cp.monthButton.click();
    }

    @Then("User should be able to see month events")
    public void user_should_be_able_to_see_month_events() {
        Date now = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E");
        String date = simpleDateformat.format(now);

        WebElement day = Driver.getDriver().findElement(By.xpath("(//span[.='" + date + "'])[1]"));

        String str = day.getText();
        boolean checkIfContainsDigits = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                checkIfContainsDigits = true;
            }
        }
        Assert.assertFalse(checkIfContainsDigits);
    }
}
