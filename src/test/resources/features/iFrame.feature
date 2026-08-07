Feature: Manipulacion IFrame

  Scenario: Extraer informacion de un IFrame especifico
    Given que el usuario navega a la pagina de Frames en DemoQA
    When accede al IFrame1
    Then deberia ver el titulo "This is a sample page" en el IFrame1