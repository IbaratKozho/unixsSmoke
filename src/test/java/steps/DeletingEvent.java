package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CalendarPage;
import pages.MeetingsDayPage;

public class DeletingEvent {

    CalendarPage cp = new CalendarPage();
    MeetingsDayPage mdp = new MeetingsDayPage();

    @When("User creates an event for {int} st of July")
    public void user_creates_an_event_for_st_of_July(Integer int1) throws InterruptedException {
        Thread.sleep(2000);
        cp.clickOn31thOfJuly.click();
        Thread.sleep(3000);
        mdp.clickOn9am.click();
        Thread.sleep(3000);
        mdp.summaryInputBox.sendKeys("DoctorAppointment");
        Thread.sleep(3000);
        mdp.createButton.click();
        Thread.sleep(3000);
        mdp.createdEvent.click();
    }

    @When("User clicks on delete button")
    public void user_clicks_on_delete_button() throws InterruptedException {
        mdp.verificationWindow.click();
        Thread.sleep(3000);
        mdp.okButton.click();
    }

    @Then("Event is deleted")
    public void event_is_deleted() {
        String actualText = mdp.createdEvent.getText();
        String expectedText = "DoctorAppoitment";
        Assert.assertFalse( "Verification of creating calendar event FAILED!", (actualText.contains(expectedText)));
    }

}
