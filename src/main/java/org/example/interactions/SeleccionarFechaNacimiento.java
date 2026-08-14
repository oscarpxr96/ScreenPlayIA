package org.example.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.userinterfaces.FormularioUI.*;

public class SeleccionarFechaNacimiento implements Interaction {
    private String mes;
    private String anio;
    private String dia;

    public SeleccionarFechaNacimiento(String mes, String anio, String dia) {
        this.mes = mes;
        this.anio = anio;
        this.dia = dia;
    }

    public static SeleccionarFechaNacimiento conFecha(String mes, String anio, String dia) {
        return instrumented(SeleccionarFechaNacimiento.class, mes, anio, dia);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // 1. Clic en el campo de texto para abrir el calendario
                Click.on(CAMPO_FECHA_NACIMIENTO),

                // 2. Seleccionar el mes en el desplegable (<select>)
                SelectFromOptions.byVisibleText(mes).from(DESPLEGABLE_MES),

                // 3. Seleccionar el año en el desplegable (<select>)
                SelectFromOptions.byVisibleText(anio).from(DESPLEGABLE_ANIO),

                // 4. Clic en el día específico dentro del calendario
                Click.on(OPCION_DIA.of(dia))
        );
    }
}
