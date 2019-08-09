package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CalendarPage;
import pages.ListPage;
import pages.MeetingsNewPage;

public class CreatingEvent {

    CalendarPage cp = new CalendarPage();
    ListPage lp = new ListPage();
    MeetingsNewPage mnp = new MeetingsNewPage();

    @When("User opens list option")
    public void user_opens_list_option() throws InterruptedException{
        Thread.sleep(3000);
        cp.listLink.click();
    }

    @When("User creates event with all information in it")
    public void user_creates_event_with_all_information_in_it() throws InterruptedException {
        lp.createButton.click();
        mnp.meetingName.sendKeys("Unix Demo");
        mnp.startDate.click();
        Thread.sleep(3000);
        mnp.startDate1.click();
        mnp.startDate1.sendKeys("07/30/2019 10:00:00");
        mnp.duration.clear();
        mnp.duration.sendKeys("01:00");
        mnp.typeOfMeeting.click();
        mnp.meetingType.click();
        Thread.sleep(3000);
        mnp.waitingChoice.click();
        mnp.minOption.click();
        mnp.location.click();
        mnp.location.sendKeys("Cybertek");
        mnp.saveButton.click();
    }

    @Then("Event is created")
    public void event_is_created() {
        String expectedText = mnp.text.getText();
        Assert.assertTrue(expectedText.contains("Event created"));
    }

}
