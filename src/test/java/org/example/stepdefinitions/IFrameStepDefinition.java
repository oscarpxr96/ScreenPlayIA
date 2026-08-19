package org.example.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.questions.ElTextoDelElemento;
import org.example.tasks.ManejoIFrames;
import org.example.userinterfaces.IFrameUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.example.userinterfaces.IFrameUI.*;
import static org.hamcrest.Matchers.equalTo;


public class IFrameStepDefinition {

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario navega a la pagina de Frames en DemoQA")
    public void que_el_usuario_navega_a_la_pagina_de_frames_en_demo_qa() {
        OnStage.theActorCalled("usuario").attemptsTo(Open.url("https://demoqa.com/frames"));
    }
    @When("accede al IFrame1")
    public void accede_al_i_frame1() {
        theActorInTheSpotlight().attemptsTo(ManejoIFrames.realizado());
    }

    @Then("deberia ver el titulo {string} en el IFrame1")
    public void deberia_ver_el_titulo_en_el_i_frame1(String titulo1) {
        OnStage.theActorInTheSpotlight().should(seeThat(
                        ElTextoDelElemento.dentroDelIFrame(IFrameUI.TITULO_FRAME_1, IFrameUI.FRAME_1),
                        equalTo(titulo1)
                )
        );
        theActorInTheSpotlight().should(seeThat(ElTextoDelElemento.es(TITULO_PAGINA_FRAME), equalTo("Frames")));

    }
    @After
    public static void reiniciarNavegador() {
        Serenity.getWebdriverManager().closeDriver();
    }
}
