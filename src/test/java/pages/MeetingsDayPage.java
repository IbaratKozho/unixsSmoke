package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MeetingsDayPage {

    WebDriver driver;

    public MeetingsDayPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[.='9:00']/../../td[2]")
    public WebElement clickOn9am;

    @FindBy(xpath = "//input[@class='o_input']")
    public WebElement summaryInputBox;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement createButton;

    @FindBy(xpath = "//div[contains(text(),'09:00')]/../div[2]")
    public WebElement createdEvent;

    @FindBy(xpath = "//span[.='Ok']")
    public  WebElement okButton;


    @FindBy(xpath = "//button[@class='btn btn-sm btn-default']")
    public WebElement verificationWindow;

}
