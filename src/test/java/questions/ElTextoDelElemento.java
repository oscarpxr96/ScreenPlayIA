package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static userinterfaces.FormularioUI.TITULO_MODAL;

public class ElTextoDelElemento implements Question {
    private Target titulo;

    // Instaciar asi misma la clase
    public ElTextoDelElemento(Target titulo) {
        this.titulo = titulo;
    }
    // Instaciar asi misma la clase
    public static ElTextoDelElemento es(Target titulo) {
        return new ElTextoDelElemento(titulo);
    }

    @Override
    public String answeredBy(Actor actor){
        // Resuelve el Target en pantalla y extrae su texto visual para responder la pregunta
        return Text.of(titulo).answeredBy(actor);
    }
}
