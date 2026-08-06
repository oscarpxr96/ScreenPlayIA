package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ElTextoDelElemento;
import tasks.DragAndDrop;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static userinterfaces.DragAndDropUI.TITULO_DROPPABLE;

public class DragAndDropStepDefinition {

    @Before
    public void preparaEscenario(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario navega a la pagina de droppable en DemoQA")
    public void que_el_usuario_navega_a_la_pagina_de_droppable_en_demo_qa() {
        theActorCalled("Pruebas").attemptsTo(Open.url("https://demoqa.com/droppable"));

    }
    @When("lleva el objeto drag a la zona de drop")
    public void lleva_el_objeto_drag_a_la_zona_de_drop() {
        theActorInTheSpotlight().attemptsTo(DragAndDrop.realizado());

    }
    @Then("deberia ver el titulo {string} en la zona de drop")
    public void deberia_ver_el_titulo_en_la_zona_de_drop(String tituloEsperado) {
        theActorInTheSpotlight().should(seeThat(ElTextoDelElemento.es(TITULO_DROPPABLE), equalTo(tituloEsperado)));

    }
}
