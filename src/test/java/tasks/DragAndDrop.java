package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Drag;

import static userinterfaces.DragAndDropUI.*;

public class DragAndDrop implements Task {

    public static DragAndDrop realizado(){
        return Tasks.instrumented(DragAndDrop.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Drag.from(BOTON_DRAGGABLE).to(BOTON_DROPPABLE)
        );

    }
}
