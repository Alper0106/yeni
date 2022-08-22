package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MedunnaUS_005_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class MedunnaUS_005_StepDefinitions {
   MedunnaUS_005_Page medunnaPage005= new MedunnaUS_005_Page();


    @Given("Hasta url sayfasina gider")
    public void hasta_url_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }

    @Then("Hasta herhangi bir karakter içeren {string} yazar")
    public void hasta_herhangi_bir_karakter_içeren_yazar(String string) {
     medunnaPage005.firstNameButonu.sendKeys(ConfigReader.getProperty("mdnFirstNameHasta"));

    }

    @Then("Hasta kayıtlı {string} numarasini yazar")
    public void hasta_kayıtlı_numarasini_yazar(String string) {
     medunnaPage005.SSNButonu.sendKeys(ConfigReader.getProperty("MdnSsnHasta"));

    }

   @And("Hasta herhangi bir karakter iceren {string} yazar")
   public void hastaHerhangiBirKarakterIcerenYazar(String arg0) {
     medunnaPage005.lastNameButonu.sendKeys(ConfigReader.getProperty("mdnLastNameHasta"));
    }

    @Then("Hasta . ve @ içeren {string} adresi yazar")
    public void hasta_ve_içeren_adresi_yazar(String string) {
     medunnaPage005.mailButonu.sendKeys(ConfigReader.getProperty("MdnEmailHasta"));


    }

    @And("Hasta ucuncu ve altinci rakamdan sonra - olan on rakamlı {string} yazar")
    public void hastaUcuncuVeAltinciRakamdanSonraOlanOnRakamlıYazar(String arg0) {
     medunnaPage005.telefonButonu.sendKeys(ConfigReader.getProperty("tlfnNoHasta"));
    }

    @Then("Hasta Send an Appointment Request butonuna tiklar")
    public void hasta_send_an_appointment_request_butonuna_tiklar() {
     medunnaPage005.SendanAppointmentRequestButonu.click();

    }

 @And("Kullanici MyPages butonuna tiklar")
 public void kullaniciMyPagesButonunaTiklar() {
  medunnaPage005.MyPagesButonu.click();
 }


 @And("Hasta {string} butonuna tiklar randevularini gorur")
 public void hastaButonunaTiklarRandevulariniGorur(String arg0) {
  medunnaPage005.MyAppointmentButonu.click();
 }

 @And("Hasta randevu satirinda kendi ad soyadina tiklar profilini gorur")
 public void hastaRandevuSatirindaKendiAdSoyadinaTiklarProfiliniGorur() {
 }



}
