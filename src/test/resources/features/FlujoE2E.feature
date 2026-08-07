Feature: Flujo End To End en DemoQA

  @E2E
  Scenario: Recorrido completo de funcionalidades en DemoQA

    # 1. Parte de DragAndDrop
    Given que el usuario navega a la pagina de droppable en DemoQA
    When lleva el objeto drag a la zona de drop
    Then deberia ver el titulo "Dropped!" en la zona de drop

    # 2.1 Parte de Formularios Basico
    Given que "Oscar" navega a la pagina de formulario de DemoQA
    When ingresa sus datos personales "Oscar", "Piñeros", "3223402050" y "pruebas@hotmail.com"
    Then deberia ver el titulo "Thanks for submitting the form" en la pantalla

    # 2.1 Parte de Formularios Completo
    Given que "Oscar" navega a la pagina de formulario de DemoQA
    When diligencia el formulario completo con la siguiente informacion:
      | nombre | apellido | email          | telefono   | direccion        |
      | Óscar  | Pérez    | oscar@test.com | 3001234567 | Calle 123 #45-67 |
    Then deberia ver el titulo de confirmacion "Thanks for submitting the form" en la pantalla

    # 3. Parte de IFrames
    Given que el usuario navega a la pagina de Frames en DemoQA
    When accede al IFrame1
    Then deberia ver el titulo "This is a sample page" en el IFrame1



