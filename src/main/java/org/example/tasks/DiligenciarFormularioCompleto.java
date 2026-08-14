package org.example.tasks;

import org.example.interactions.SeleccionarFechaNacimiento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.userinterfaces.FormularioUI.*;

public class DiligenciarFormularioCompleto implements Task {

    // 0. Declara Variables
    private Map<String, String> datosFormulario;

    //1. Constructor que recibe las variables
    public DiligenciarFormularioCompleto (Map<String, String> datosFormulario){
        this.datosFormulario = datosFormulario;
    }

    //2. Metodo para naturalizar la accion en el stepdefinition
    public static DiligenciarFormularioCompleto conDatos(Map<String, String> datosFormulario){
        return instrumented(DiligenciarFormularioCompleto.class, datosFormulario);
    }

    //3. Acciones dejecutadas por el actor
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosFormulario.get("nombre")).into(CAMPO_NOMBRE),
                Enter.theValue(datosFormulario.get("apellido")).into(CAMPO_APELLIDO),
                Enter.theValue(datosFormulario.get("email")).into(CAMPO_EMAIL),
                Click.on(BOTON_SEXO_MASCULINO),
                Enter.theValue(datosFormulario.get("telefono")).into(CAMPO_TELEFENO),
                SeleccionarFechaNacimiento.conFecha("May","1976","9"),
                Scroll.to(CAMPO_TEMAS),
                Click.on(BOTON_HOBBIES_SPORTS),
                Enter.theValue("Calle Falsa 123").into(CAMPO_DIRECCION_ACTUAL),
                Scroll.to(BOTON_SUBMIT),
                Click.on(BOTON_SUBMIT),
                Scroll.to(BOTON_CLOSE),
                Click.on(BOTON_CLOSE)
        );

    }
}
