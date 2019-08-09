package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.CalendarPage;
import utilities.Driver;


public class AttendeesModification {

    CalendarPage cp = new CalendarPage();
    Actions action = new Actions(Driver.getDriver());
    String valueBefore;
    String valueAfter;

    @When("User clicks on checkbox at attendee list")
    public void user_clicks_on_checkbox_at_attendee_list() throws InterruptedException {
        cp.firstCheckbox.click();
        Thread.sleep(1000);
    }

    @Then("User clicks on dropdown menu")
    public void user_clicks_on_dropdown_menu() throws InterruptedException {
        action.moveToElement(cp.dropdown).perform();
        cp.dropdown.click();
        Thread.sleep(2000);
    }

    @Then("Selects first element")
    public void selects_first_element() throws InterruptedException {
        valueBefore = cp.dropdown1.getText();
        System.out.println(valueBefore);
        Thread.sleep(2000);
        cp.dropdown1.click();
        Thread.sleep(3000);
    }

    @Then("User deletes second element from Attendees")
    public void user_deletes_second_element_from_Attendees() throws InterruptedException {
        action.moveToElement(cp.secondBoxToDelete).perform();
        Thread.sleep(3000);
        cp.deleteAttendee.click();
        Thread.sleep(1000);
        cp.confirmation.click();
    }

    @Then("One attendee should disappear from the list")
    public void one_attendee_should_disappear_from_the_list() throws InterruptedException {
        Thread.sleep(2000);
        valueAfter = cp.getAttendee.getText();
        Assert.assertTrue("deleting Attendee verification DIDN'T PASS", !valueBefore.equalsIgnoreCase(valueAfter));
    }
}