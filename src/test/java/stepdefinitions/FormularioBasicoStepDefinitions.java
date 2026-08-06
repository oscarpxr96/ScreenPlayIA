package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ElTituloDelModal;
import tasks.DiligenciarFormularioBasico;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class FormularioBasicoStepDefinitions {
    @Before
    public void prepararEscenario(){
        // Prepara el escenario de pruebas para que existan los actores en Serenity
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que {string} navega a la pagina de formulario de DemoQA")
    public void navegarAPagina(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(Open.url("https://demoqa.com/automation-practice-form"));
    }
    @When("ingresa sus datos personales {string}, {string}, {string} y {string}")
    public void ingresaDatosBasicos(String nombre, String apellido, String telefono, String correo) {
        theActorInTheSpotlight().attemptsTo(DiligenciarFormularioBasico.conDatos(nombre, apellido, telefono, correo));
    }
    @Then("deberia ver el titulo {string} en la pantalla")
    public void verificarTituloFormularioBasico(String tituloEsperado) {
        theActorInTheSpotlight().should(seeThat(ElTituloDelModal.es(), equalTo(tituloEsperado)));
    }

}
