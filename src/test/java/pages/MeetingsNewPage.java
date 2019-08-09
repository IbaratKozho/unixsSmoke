package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MeetingsNewPage {

    WebDriver driver;

    public MeetingsNewPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='name']")
    public WebElement meetingName;

    @FindBy(xpath = "//input[@name='start_datetime']")
    public WebElement startDate;

    @FindBy(xpath = "//input[@name='start_datetime']")
    public WebElement startDate1;

    @FindBy(xpath = "//input[@name='duration']")
    public WebElement duration;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[2]")
    public WebElement typeOfMeeting;

    @FindBy(linkText = "Internal Meeting")
    public WebElement meetingType;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[3]")
    public WebElement waitingChoice;

    @FindBy(partialLinkText = "15 Minute")
    public WebElement minOption;

    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input'])")
    public WebElement location;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "(//div[@class='o_thread_message_content'])[2]")
    public WebElement text;
}