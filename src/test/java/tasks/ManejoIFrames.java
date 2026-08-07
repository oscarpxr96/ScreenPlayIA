package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.IFrameUI;



import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

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
        actor.attemptsTo(Switch.toDefaultContext());
        System.out.println("el titulo 1 es: "+titulo1);

        // ESPERA EXPLÍCITA: Darle tiempo a Serenity de reubicar el contexto principal
        actor.attemptsTo(
                WaitUntil.the(IFrameUI.TITULO_PAGINA_FRAME, isVisible()).forNoMoreThan(5).seconds()
        );
        String titulo2 = actor.asksFor(Text.of(IFrameUI.TITULO_PAGINA_FRAME));
        // Guarda el texto en la sesión del actor con una clave
        actor.remember("TITULO_PAGINA_FRAME", titulo2);
        System.out.println("el titulo 2 es: "+titulo2);

    }
}
