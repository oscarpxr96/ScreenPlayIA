package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.IFrameUI;

public class ManejoIFrames implements Task {

    public static ManejoIFrames realizado(){

        return Tasks.instrumented(ManejoIFrames.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Switch.toFrame(IFrameUI.FRAME_1.resolveFor(actor)));
        // Obtiene el texto
        String titulo1 = Text.of(IFrameUI.TITULO_FRAME_1).answeredBy(actor);
        // Guarda el texto en la sesión del actor con una clave
        actor.remember("TITULO_IFRAME_1", titulo1);

        actor.attemptsTo(
                Switch.toDefaultContext(),
                Switch.toFrame(IFrameUI.FRAME_2.resolveFor(actor)));
        // Obtiene el texto
        String titulo2 = Text.of(IFrameUI.TITULO_FRAME_2).answeredBy(actor);
        // Guarda el texto en la sesión del actor con una clave
        actor.remember("TITULO_IFRAME_2", titulo2);

    }
}
