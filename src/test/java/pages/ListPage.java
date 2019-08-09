package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ListPage {

    WebDriver driver;

    public ListPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//td[text()='Birthday party!!!']/../td[1]")
    public WebElement eventSubjectCheckBox;

    @FindBy(xpath = "//button[contains(text(),'Action')]")
    public WebElement actionLink;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[4]/li[5]/a")
    public WebElement sendSMSToAtendeesLink;

    @FindBy(xpath = "//input[@name='recipients']")
    public WebElement recepientsField;

    @FindBy(xpath = "//div[@name='message']/textarea")
    public WebElement messageField;

    @FindBy(xpath = "//button[@name='action_send_sms']")
    public WebElement sendButton;

    @FindBy(xpath = "(//h4[@class='modal-title'])[2]")
    public WebElement confirmationMessage;

    @FindBy (xpath = "//button[contains(text(),'Create')]")
    public  WebElement createButton;



}
