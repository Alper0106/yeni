Feature:Hastalar (patients), hastahaneden randevu (Appointment) oluşturabilmelidir

  Scenario:TC01 Hastalar (patients), hastahaneden randevu (Appointment) oluşturabilmelidir
    Given Hasta url sayfasina gider
    Then Hasta herhangi bir karakter içeren "First Name" yazar
    And Hasta kayıtlı "SSN" numarasini yazar
    And Hasta herhangi bir karakter iceren "Last Name" yazar
    And Hasta . ve @ içeren "e-mail" adresi yazar
    And Hasta ucuncu ve altinci rakamdan sonra - olan on rakamlı "telefon numarasını" yazar
    And Hasta Send an Appointment Request butonuna tiklar


 Scenario: TC02 Hastalar (patients), hastahaneden randevu (Appointment) randevu alıp kaydolduğunda, profillerini görebilir ve uygulamada oturum açabilir
   Given Hasta url sayfasina gider
   Then Kullanici giris ikon'una tiklar
   And Kullanıcı Signin butonuna tiklar
   And Kullanıcı gecerli User name girer
   And Kullanıcı gecerli Password girer
   And Kullanıcı Signin butonuna tiklar ve oturum acar
   And Kullanici MyPages butonuna tiklar
   And Hasta "My Appointment" butonuna tiklar randevularini gorur
   And Hasta randevu satirinda kendi ad soyadina tiklar profilini gorur


