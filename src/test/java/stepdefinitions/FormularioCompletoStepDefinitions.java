package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ElTituloDelModal;
import tasks.DiligenciarFormularioCompleto;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class FormularioCompletoStepDefinitions {
    @Before
    public void prepararEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given( "que {string} navega a la pagina de formulario de DemoQA")
    public void navegarAPagina(String nombreActor){
        theActorCalled(nombreActor).attemptsTo(Open.url("https://demoqa.com/automation-practice-form"));
    }
    @When("ingresa la totalidad de la informacion del formulario")
    public void ingresaTodosLosDatos(DataTable dataTable){
        // Convierte la fila de la tabla en un Mapa Clave -> Valor
        Map<String, String> datos = dataTable.asMaps(String.class, String.class).get(0);

        theActorInTheSpotlight().attemptsTo(DiligenciarFormularioCompleto.conDatos(datos));
    }
    @Then("deberia ver el titulo {string} en la pantalla")
    public void verificarTitulo(String tituloEsperado){
        theActorInTheSpotlight().should(seeThat(ElTituloDelModal.es(), equalTo(tituloEsperado)));
        //theActorInTheSpotlight().should(seeThat());
    }
}
