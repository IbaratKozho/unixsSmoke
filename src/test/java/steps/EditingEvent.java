package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CalendarPage;
import utilities.Driver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EditingEvent {

    CalendarPage cp = new CalendarPage();

    @When("User creates an event for tomorrow")
    public void user_creates_an_event_for_tomorrow() throws InterruptedException {
        Driver.getDriver().findElement(By.xpath("(//td[@data-date='"+ LocalDate.now().plusDays(1).toString()+"'])[1]")).click();
        Thread.sleep(1000);
        cp.createEventInput.sendKeys("Scrum meeting");
        Thread.sleep(1000);
        cp.createButton.click();
    }

    @When("User edits this event with Start date later than End date")
    public void user_edits_this_event_with_Start_date_later_than_End_date() throws InterruptedException {
        cp.event.click();
        Thread.sleep(1000);
        cp.editButton.click();
        cp.startDateButton.click();
        String date = LocalDate.now().plusDays(2).format(DateTimeFormatter.ofPattern("MM/d/uuuu"));
        String path = "//td[@data-day='"+date+"']";
        Driver.getDriver().findElement(By.xpath(path)).click();
        cp.saveButton.click();
    }

    @Then("System is displaying error message")
    public void system_is_displaying_error_message() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue("System did not display error message",cp.errorMessage.isDisplayed());
    }

    @Then("We delete the event")
    public void we_delete_the_event() throws InterruptedException {
        Thread.sleep(2000);
        cp.okButton.click();
        cp.closeButton.click();
        cp.event.click();
        cp.deleteButton.click();
        cp.okButton.click();
    }
}
