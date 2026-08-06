Feature: Diligenciamiento de Formulario

  Background:
    Given que "Oscar" navega a la pagina de formulario de DemoQA

  @formularioBasico
  Scenario: Registro exitoso de datos básicos
    When ingresa sus datos personales "Oscar", "Piñeros", "3223402050" y "pruebas@hotmail.com"
    Then deberia ver el titulo "Thanks for submitting the form" en la pantalla

  @formularioCompleto
  Scenario: Registro exitoso de datos completo
    When diligencia el formulario completo con la siguiente informacion:
      | nombre | apellido | email          | telefono   | direccion        |
      | Óscar  | Pérez    | oscar@test.com | 3001234567 | Calle 123 #45-67 |
    Then deberia ver el titulo de confirmacion "Thanks for submitting the form" en la pantalla