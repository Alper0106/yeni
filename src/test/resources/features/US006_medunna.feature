Feature: US_006 Kullanıcı bilgisi sekmesi (Setting) Ana Sayfada düzenlenebilir olmalıdır.


  Scenario: Tc01 Kullanıcı bilgileri "firstname, lastname, email" girerken doldurulan kullanıcı bilgileri olmalıdır.

    Given Kullanıcı  Medunna url sayfasina gider
    Then Kullanici giris ikon'una tiklar
    And Kullanıcı Signin butonuna tiklar
    And Kullanıcı gecerli User name girer
    And Kullanıcı gecerli Password girer
    And Kullanıcı Signin butonuna tiklar ve oturum acar
    And Kullanici kullanici giris ikon'una tiklar
    And Kullanıcı Settings butonuna tiklar
    Then Kullanıcı firstname bilgilerinin, girerken doldurulan firstname oldugunu dogrular
    And  Kullanıcı lastname bilgilerinin, girerken doldurulan lastname oldugunu dogrular
    And Kullanıcı e-mail bilgilerinin, girerken doldurulan e-mail oldugunu dogrular


  Scenario:Tc02 Kullanıcı bilgileri Ana Sayfasinda "Firstname", "Lastname", "E-mail" güncelleme seçeneği olmalıdır
    Given Kullanıcı  Medunna url sayfasina gider
    Then Kullanici giris ikon'una tiklar
    And Kullanıcı Signin butonuna tiklar
    And Kullanıcı gecerli User name girer
    And Kullanıcı gecerli Password girer
    And Kullanıcı Signin butonuna tiklar ve oturum acar
    And Kullanici kullanici giris ikon'una tiklar
    And Kullanıcı Settings butonuna tiklar
    Then Kullanıcı firstname guncelleme secenegini kontrol eder
    And Kullanıcı lastname guncelleme secenegini kontrol eder
    And Kullanıcı e-mail guncelleme secenegini kontrol eder

  Feature:TC02 Hastalar (patients), hastahaneden randevu (Appointment) randevu alıp kaydolduğunda, profillerini görebilir ve uygulamada oturum açabilir.

