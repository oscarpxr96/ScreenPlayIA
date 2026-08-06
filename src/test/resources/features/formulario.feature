Feature: Diligenciamiento de Formulario de Estudiantes

  Scenario: Registro exitoso de datos básicos
    Given que "Oscar" navega a la pagina de formulario de DemoQA
    When ingresa sus datos personales "Oscar", "Piñeros", "3223402050" y "pruebas@hotmail.com"
    Then deberia ver el titulo "Thanks for submitting the form" en la pantalla

  Scenario: Registro exitoso de datos completo
    Given que "Oscar" navega a la pagina de formulario de DemoQA
    When ingresa la totalidad de la informacion del formulario
    Then deberia ver el titulo "Thanks for submitting the form" en la pantalla