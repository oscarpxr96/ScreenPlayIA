Feature: Manipulacion IFrame

  Scenario: Extraer informacion de un IFrame especifico
    Given que el usuario navega a la pagina de Frames en DemoQA
    When accede al IFrame1 y al IFrame2
    Then deberia ver el titulo "bla1" en el IFrame1
    And deberia ver el titulo "bla2" en el IFrame2