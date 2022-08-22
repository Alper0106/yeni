package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaUS_006_Page;
import utilities.ConfigReader;
import utilities.Driver;


public class MedunnaUS_006_StepDefinitions {

    MedunnaUS_006_Page medunnaPage= new MedunnaUS_006_Page();
    Actions actions= new Actions(Driver.getDriver());


    @Given("Kullanıcı  Medunna url sayfasina gider")
    public void kullanıcı_medunna_url_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));


    }

    @Then("Kullanici giris ikon'una tiklar")
    public void kullanici_giris_ikon_una_tiklar() {
        medunnaPage.girisIkonu.click();

    }

    @Then("Kullanıcı Signin butonuna tiklar")
    public void kullanıcı_signin_butonuna_tiklar() {
        medunnaPage.SignInButonu.click();


    }

    @Then("Kullanıcı gecerli User name girer")
    public void kullanıcı_gecerli_user_name_girer() {
        medunnaPage.userName.sendKeys("HastaOnur65");

    }

    @Then("Kullanıcı gecerli Password girer")
    public void kullanıcı_gecerli_password_girer() {
        medunnaPage.password.sendKeys("HastaOnur.65");

    }

        @Then("Kullanıcı Signin butonuna tiklar ve oturum acar")
        public void kullanıcı_signin_butonuna_tiklar_ve_oturum_acar() {
        medunnaPage.kullaniciSignInButonu.click();

        }

    @Then("Kullanici kullanici giris ikon'una tiklar")
    public void kullanici_kullanici_giris_ikon_una_tiklar() {
        medunnaPage.girisIkonu.click();

    }

    @Then("Kullanıcı Settings butonuna tiklar")
    public void kullanıcı_settings_butonuna_tiklar() {
        medunnaPage.settings.click();

    }


    @Then("Kullanıcı firstname guncelleme secenegini kontrol eder")
    public void kullanıcı_firstname_guncelleme_secenegini_kontrol_eder() {
        medunnaPage.firstNameButonu.isDisplayed();
        actions.doubleClick(medunnaPage.firstNameButonu).perform();
        medunnaPage.firstNameButonu.sendKeys("denemeFirstName");

        //Assert.assertEquals("denemeFirstName",actualFirstName);

    }

    @Then("Kullanıcı lastname guncelleme secenegini kontrol eder")
    public void kullanıcı_lastname_guncelleme_secenegini_kontrol_eder() {
        actions.doubleClick(medunnaPage.lastNameButonu).perform();

        medunnaPage.lastNameButonu.sendKeys("denemeLastName");


       //Assert.assertEquals(actualLastName,"denemeLastName");

    }

    @Then("Kullanıcı e-mail guncelleme secenegini kontrol eder")
    public void kullanıcı_e_mail_guncelleme_secenegini_kontrol_eder() {
        actions.doubleClick(medunnaPage.emailButonu).perform();
        medunnaPage.emailButonu.sendKeys("denemeEmail");
        System.out.println(medunnaPage.emailButonu.getText());
       // Assert.assertEquals("denemeEmail",medunnaPage.emailButonu.getText());

    }

    @Then("Kullanıcı firstname bilgilerinin, girerken doldurulan firstname oldugunu dogrular")
    public void kullanıcıFirstnameBilgilerininGirerkenDoldurulanFirstnameOldugunuDogrular() {
       String kayitliFirstName= ConfigReader.getProperty("mdnFirstNameHasta");
        Assert.assertTrue(kayitliFirstName.contains(medunnaPage.firstNameButonu.getText()));
    }

    @And("Kullanıcı lastname bilgilerinin, girerken doldurulan lastname oldugunu dogrular")
    public void kullanıcıLastnameBilgilerininGirerkenDoldurulanLastnameOldugunuDogrular() {
        String kayitliLastName= ConfigReader.getProperty("mdnLastNameHasta");
        Assert.assertTrue(kayitliLastName.contains(medunnaPage.firstNameButonu.getText()));
    }

    @And("Kullanıcı e-mail bilgilerinin, girerken doldurulan e-mail oldugunu dogrular")
    public void kullanıcıEMailBilgilerininGirerkenDoldurulanEMailOldugunuDogrular() {
        String kayitliEmail= ConfigReader.getProperty("MdnEmailHasta");
        Assert.assertTrue(kayitliEmail.contains(medunnaPage.firstNameButonu.getText()));
    }



    /*
    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstname) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstname));
    }
     */


}
