Feature: Diligenciamiento de drag and drop

  Scenario: Realizar drag and drop exitoso
    Given que el usuario navega a la pagina de droppable en DemoQA
    When lleva el objeto drag a la zona de drop
    Then deberia ver el titulo "Dropped!" en la zona de drop