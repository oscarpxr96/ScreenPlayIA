package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class IFrameStepDefinition {

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario navega a la pagina de Frames en DemoQA")
    public void que_el_usuario_navega_a_la_pagina_de_frames_en_demo_qa() {
        theActorCalled("Pruebas").attemptsTo(Open.url("https://demoqa.com/frames"));
    }
    @When("accede al IFrame1 y al IFrame2")
    public void accede_al_i_frame1() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("deberia ver el titulo {string} en el IFrame1")
    public void deberia_ver_el_titulo_en_el_i_frame1(String titulo1) {
        // Recupera la variable guardada
        String tituloObtenido1 = OnStage.theActorInTheSpotlight().recall("TITULO_IFRAME_1");
        // Asertar
        org.hamcrest.MatcherAssert.assertThat(tituloObtenido1, org.hamcrest.Matchers.equalTo(titulo1));
    }
    @Then("deberia ver el titulo {string} en el IFrame2")
    public void deberia_ver_el_titulo_en_el_i_frame2(String titulo2) {
        // Recupera la variable guardada
        String tituloObtenido2 = OnStage.theActorInTheSpotlight().recall("TITULO_IFRAME_2");
        // Asertar
        org.hamcrest.MatcherAssert.assertThat(tituloObtenido2, org.hamcrest.Matchers.equalTo(titulo2));
    }
}
