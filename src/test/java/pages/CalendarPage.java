package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CalendarPage {

    WebDriver driver;

    public CalendarPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@class='navbar-collapse collapse']/ul/li[2])[1]")
    public WebElement calendarPageStatus;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']/button[2]")
    public WebElement listLink;

    @FindBy(xpath = "//a[.='31']")
    public  WebElement clickOn31thOfJuly;

    @FindBy(name="name")
    public WebElement createEventInput;

    @FindBy(xpath="//span[.='Create']")
    public WebElement createButton;

    @FindBy(xpath="//div[contains(text(),'Scrum')]")
    public WebElement event;

    @FindBy(xpath = "//span[.='Edit']")
    public WebElement editButton;

    @FindBy(name ="start_date" )
    public WebElement startDateButton;

    @FindBy(xpath="//span[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath="//*[contains(text(),'Ending date cannot')]")
    public WebElement errorMessage;

    @FindBy(xpath = "//span[.='Ok']")
    public WebElement okButton;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement closeButton;

    @FindBy(xpath= "//span[.='Delete']")
    public WebElement deleteButton;

    @FindBy (xpath = "//button[.='Month']")
    public WebElement monthButton;

    @FindBy (xpath = "//td/a[text()='31']")
    public WebElement date31;

    @FindBy(xpath = "//button[@class ='o_calendar_button_week btn btn-sm btn-default active']")
    public WebElement weekButton;

    @FindBy(xpath = "//span[@class ='o_searchview_more fa fa-search-plus']")
    public WebElement searchButton;

    @FindBy(xpath = "(//button[@class = 'o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[1]")
    public WebElement filterButton;

    @FindBy(xpath = "//ul/li/a[text()='My Events']")
    public WebElement myEventsButton;

    @FindBy(xpath = "(//a[@class ='fc-time-grid-event fc-v-event fc-event fc-start fc-end fc-draggable fc-resizable o_calendar_color_6 fc-short'])[1]")
    public WebElement eventToCheck;

    @FindBy(xpath = "//span[@class='o_badge_text']")
    public WebElement attendies;

    @FindBy(xpath = "//span[@title='Advanced Search...']")
    public  WebElement clickSearch;

    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[2]")
    public  WebElement clickGroupBy;

    @FindBy(xpath = "//a[.='Responsible']")
    public  WebElement  clickResponsible;

    @FindBy(className = "o_facet_values")
    public  WebElement verifySearch;

    @FindBy (linkText = "Add custom group")
    public  WebElement addCustomGroup;
    @FindBy (xpath = "//select[@style='display: block;']")
    public  WebElement selectCustom;

    @FindBy (xpath = "(//div[@class='o_calendar_filter_item'][1]/div[@class='o_checkbox'])[1]/input")
    public WebElement firstCheckbox;

    @FindBy (xpath = "//div[@class='o_input_dropdown']/input")
    public WebElement dropdown;

    @FindBy (xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[1]")
    public WebElement dropdown1;

    @FindBy(xpath = "//h3[.='Attendees']/following-sibling::div/div[2]")
    public WebElement secondBoxToDelete;

    @FindBy(xpath = "//h3[.='Attendees']/following-sibling::div/div[2]/span[2]")
    public WebElement deleteAttendee;

    @FindBy(xpath = "//h3[.='Attendees']/following-sibling::div/div[2]/span[1]")
    public WebElement  getAttendee;

    @FindBy(xpath = "//div[@class='modal-footer']/button[1]")
    public WebElement confirmation;
}
