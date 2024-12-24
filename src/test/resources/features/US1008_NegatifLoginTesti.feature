Feature: US1008 Kullanici yanlis bilgilerle giris yapamaz

  Scenario: TC12 kullanici yanlis password ile giris yapamamali

    Given kullanici testotomasyonu anasayfaya gider
    Then account butonuna basar
    And email olarak "toGecerliEmail" girer
    And password olarak "toGecersizPassword" girer
    Then signIn butonuna basar
    And sisteme giris yapamadigini test eder
    And 3 saniye bekler
    And sayfayi kapatir