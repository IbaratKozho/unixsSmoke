package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CalendarPage;

public class SearchingByFilters {

    CalendarPage cp = new CalendarPage();

    @When("User is on selected date")
    public void user_is_on_selected_date() {
        cp.date31.click();
        cp.weekButton.click();
    }

    @When("User filtering the events by My events")
    public void user_filtering_the_events_by_My_events() {
        if (!cp.filterButton.isDisplayed()) {
            cp.searchButton.click();
        }
        cp.filterButton.click();
        cp.myEventsButton.click();
    }

    @Then("User should see his username in field with attendees for this event")
    public void user_should_see_his_username_in_field_with_attendees_for_this_event() {
        cp.eventToCheck.click();
        String attendantName = "ExpensesManager4";
        Assert.assertTrue("Filter working not properly", cp.attendies.getText().contains(attendantName));
    }
}
