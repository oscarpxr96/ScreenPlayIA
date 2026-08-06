package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormularioCompletoStepDefinitions {
    @Before
    public void prepararEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given( "que {string} navega a la pagina de formulario de DemoQA")
    public void navegarApagina(String nombreActor){
        theActorCalled(nombreActor).attemptsTo(Open.url("https://demoqa.com/automation-practice-form"));
    }
    @When("ingresa la totalidad de la informacion del formulario")
    public void ingresaTodosLosDatos(){
        theActorInTheSpotlight().attemptsTo();
    }
    @Then("deberia ver el titulo {string} en la pantalla")
    public void navegarApagina(String nombreActor){
        theActorInTheSpotlight().should(seeThat());
    }
}
