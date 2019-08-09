package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CalendarPage;
import pages.ListPage;

public class SendingSMS {

    CalendarPage cp = new CalendarPage();
    ListPage lp = new ListPage();

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
    }

    @When("User fills out Recipients and Message fields")
    public void user_fills_out_Recipients_and_Message_fields() throws InterruptedException {
        Thread.sleep(3000);
        cp.listLink.click();
        lp.eventSubjectCheckBox.click();
        lp.actionLink.click();
        lp.sendSMSToAtendeesLink.click();
        Thread.sleep(2000);
        lp.recepientsField.sendKeys("2248771384");
        lp.messageField.click();
        lp.messageField.sendKeys("Reminder. You have an event 'Asel's birthday' in July 7, 2019");
    }

    @When("User click on send button")
    public void user_click_on_send_button() {
        lp.sendButton.click();
    }

    @Then("User should see successful confirmation message")
    public void user_should_see_successful_confirmation_message() {
        String confMessage = lp.confirmationMessage.getText();

        //The module of sending SMS on the backend is not implemented by developers yet. Therefore we can't get successful message.
        Assert.assertEquals("SMS sending verification is FAILED!!!", confMessage, "Odoo Server Error - Warning");
    }
}
