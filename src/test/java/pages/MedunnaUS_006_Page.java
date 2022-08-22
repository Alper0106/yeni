package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaUS_006_Page {
    public MedunnaUS_006_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisIkonu;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement SignInButonu;

    @FindBy(xpath = "//input[@placeholder='Your username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement kullaniciSignInButonu;

    @FindBy(xpath = "//a[@href='/account/settings']")

    //a[@href='/account/settings']
    public WebElement settings;

    @FindBy(xpath = "//input[@placeholder='Your first name']")
    public WebElement firstNameButonu;

    @FindBy(xpath = "//input[@placeholder='Your last name']")
    public WebElement lastNameButonu;

    @FindBy(xpath = "//input[@placeholder='Your email']")
    public WebElement emailButonu;



}
