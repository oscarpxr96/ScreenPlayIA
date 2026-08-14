package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;


public class ElTextoDelElemento implements Question {
    private final Target titulo;
    private Target tituloIFrame;

    // Constructor estándar (elementos normales)
    public ElTextoDelElemento(Target titulo) {
        this.titulo = titulo;
    }

    // Constructor avanzado (elementos dentro de un iFrame)
    public ElTextoDelElemento(Target titulo, Target tituloIFrame) {
        this.titulo = titulo;
        this.tituloIFrame = tituloIFrame;
    }
    // Método de fábrica estándar
    public static ElTextoDelElemento es(Target titulo) {
        return new ElTextoDelElemento(titulo);
    }

    // Método de fábrica para iFrames
    public static ElTextoDelElemento dentroDelIFrame(Target titulo, Target tituloIFrame) {
        return new ElTextoDelElemento(titulo, tituloIFrame);
    }

    @Override
    public String answeredBy(Actor actor){
        // 1. Verificamos la variable correcta 'tituloIFrame'
        if (tituloIFrame != null) {
            actor.attemptsTo(Switch.toFrame(tituloIFrame.resolveFor(actor)));
        }

        // 2. Extraemos el texto del Target interno
        String texto = Text.of(titulo).answeredBy(actor);

        // 3. Regresamos al DOM principal
        if (tituloIFrame != null) {
            actor.attemptsTo(Switch.toDefaultContext());
        }

        return texto;
    }
}
