package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CalendarPage;
import utilities.Driver;

import java.time.Clock;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchingByGroups {

    CalendarPage cp = new CalendarPage();

    @When("User clicks on Group By button")
    public void user_clicks_on_Group_By_button() throws InterruptedException {
        if (!cp.clickGroupBy.isDisplayed()) {
            cp.clickSearch.click();
        }

        Thread.sleep(2000);

        cp.clickGroupBy.click();
      Thread.sleep(2000);

    }

    @When("User clicks on Responsible option")
    public void user_clicks_on_Responsible_option() throws InterruptedException {
        WebElement responsible =cp.clickResponsible;


        Thread.sleep(1000);
        responsible.click();

        WebElement verifyText=cp.verifySearch;

        String actualResult = responsible.getText();
        String expectedResult =  verifyText.getText();
        Assert.assertTrue(actualResult.equals(expectedResult));
    }

    @When("User selects Add custom Group option")
    public void user_selects_Add_custom_Group_option() {
        cp.addCustomGroup.click();
        cp.selectCustom.click();

        Select select = new Select(cp.selectCustom );

        List<WebElement> options = select.getOptions();
//        System.out.println(options.size());
        int ExpectedelementsSize=options.size();
        int actualElementsSize=40;

        Assert.assertEquals("Options size does not match", actualElementsSize,ExpectedelementsSize);
    }

    @Then("User sees By Day in the list")
    public void user_sees_By_Day_in_the_list() {
        cp.selectCustom.click();

        Select select = new Select(cp.selectCustom );
        List<WebElement> options = select.getOptions();

        boolean found= false;

        for(WebElement option:options){
//            System.out.println(option.getText());

            if(option.getText().equals("By day")) {

                found=true;
                break;
            }
        }
        Assert.assertTrue(found);
    }
}
