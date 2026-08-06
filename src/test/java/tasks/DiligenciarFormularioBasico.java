package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static userinterfaces.FormularioUI.*;

public class DiligenciarFormularioBasico implements Task {
    // 0. Declarar variables
    private final String nombre;
    private final String apellido;
    private final String telefono;
    private final String eMail;

    // 1. Constructor que recibe las variables
    public DiligenciarFormularioBasico(String nombre, String apellido, String telefono, String eMail){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.eMail = eMail;
    }

    // 2. Método estático Fluent (builder) para que el código se lea natural en el StepDefinition
    public static DiligenciarFormularioBasico conDatos (String nombre, String apellido, String telefono, String eMail){
        return Tasks.instrumented(DiligenciarFormularioBasico.class, nombre, apellido, telefono, eMail);
    }

    // 3. performAs: Aquí el Actor ejecuta las acciones dentro de la UI
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(apellido).into(CAMPO_APELLIDO),
                Enter.theValue(telefono).into(CAMPO_TELEFENO),
                Enter.theValue(eMail).into(CAMPO_EMAIL),
                Click.on(BOTON_SEXO_MASCULINO),
                Scroll.to(BOTON_SUBMIT),
                Click.on(BOTON_SUBMIT)
        );
    }
}
