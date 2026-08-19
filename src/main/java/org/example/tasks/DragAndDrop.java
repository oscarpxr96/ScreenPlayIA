package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Drag;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.userinterfaces.DragAndDropUI.*;

public class DragAndDrop implements Task {

    public static DragAndDrop realizado(){

        return Tasks.instrumented(DragAndDrop.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TITULO_DRAGGABLE_PAGINA,isVisible()).forNoMoreThan(10).seconds()
        );
        actor.attemptsTo(
                Scroll.to(BOTON_DRAGGABLE),
                Scroll.to(BOTON_DROPPABLE),

                // 3. Esperar a que el elemento draggable esté interactuable
                WaitUntil.the(BOTON_DRAGGABLE, isVisible()),
                Drag.from(BOTON_DRAGGABLE).to(BOTON_DROPPABLE)
        );

    }
}
