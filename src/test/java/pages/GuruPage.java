package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruPage {
    public GuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Tout accepter']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> baslikListesi;

    @FindBy(id="gdpr-consent-notice")
    public WebElement cookiesIframe;


}