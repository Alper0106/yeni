package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaUS_005_Page {
    public MedunnaUS_005_Page() { PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameButonu;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement SSNButonu;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameButonu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement mailButonu;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement telefonButonu;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement SendanAppointmentRequestButonu;

    @FindBy(xpath = "(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[1]")
    public WebElement MyPagesButonu;

    @FindBy(xpath = "(//a[@role='menuitem'])[1]")
    public WebElement MyAppointmentButonu;








}