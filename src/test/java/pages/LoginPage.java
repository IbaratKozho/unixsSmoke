package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    WebDriver driver;
    public LoginPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login")
    public WebElement inputEmailBox;

    @FindBy(id = "password")
    public WebElement inputPasswordBox;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement logInButton;

}
