package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.FormularioUI.TITULO_MODAL;

public class ElTituloDelModal implements Question {
    // Instaciar asi misma la clase
    public static ElTituloDelModal es() {
        return new ElTituloDelModal();
    }

    @Override
    public String answeredBy(Actor actor){
        // Resuelve el Target en pantalla y extrae su texto visual para responder la pregunta
        return TITULO_MODAL.resolveFor(actor).getText();
    }
}
