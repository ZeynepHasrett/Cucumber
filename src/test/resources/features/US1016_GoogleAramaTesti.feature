Feature: US1016 Kullanıcı arama sonuclarini yazdirir

  Scenario: TC22 Kullanici ilk 10 arama sonucunu yazdirir

    Given kullanici google anasayfaya gider
    When google'da "keyword" icin arama yapar
    And ilk 10 sonucu yazdirir