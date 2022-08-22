Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar

  @Nutella  @ikisi
  Scenario: Tc01 kulanici amazonda Nutella aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

    @Java  @ikisi
  Scenario:  Tc02 kulanici amazonda Java aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Java icin arama yapar
    And sonuclarin Java icerdigini test eder
    And sayfayi kapatir

    @iphone
  Scenario:  Tc03 kulanici amazonda iphone aratir
    When kullanici amazon anasayfasinda
    And kullanici iphone icin arama yapar
    Then sonuclarin iphone icerdigini test eder
    Then sayfayi kapatir

