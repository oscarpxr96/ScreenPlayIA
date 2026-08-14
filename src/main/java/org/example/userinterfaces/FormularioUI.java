package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioUI {

    // Target reemplaza al tradicional "By".
    // El metodo .the("...") asigna un nombre legible que Serenity usará en el reporte visual.

    public static final Target TITULO_FORMULARIO = Target.the("Titulo inicial del formulario")
            .located(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h1"));

    public static final Target CAMPO_NOMBRE = Target.the("Campo para ingresar el nombre")
            .located(By.id("firstName"));

    public static final Target CAMPO_APELLIDO = Target.the("Campo para ingresar el apellido")
            .located(By.id("lastName"));

    public static final Target CAMPO_EMAIL = Target.the("Campos para ingresar el correo electronico")
            .located(By.id("userEmail"));

    public static final Target BOTON_SEXO_MASCULINO = Target.the("Boton de seleccion de sexo con opcion masculina")
            .located(By.xpath("//*[@id='genterWrapper']/div[2]/div[1]/label"));

    public static final Target CAMPO_TELEFENO = Target.the("Campo de telefono")
            .located(By.id("userNumber"));

    public static final Target CAMPO_FECHA_NACIMIENTO = Target.the("Campo fecha de nacimiento")
            .located(By.id("dateOfBirthInput"));

    public static final Target DESPLEGABLE_MES = Target.the("Desplegable de mes")
            .located(By.className("react-datepicker__month-select"));

    public static final Target DESPLEGABLE_ANIO = Target.the("Desplegable de año")
            .located(By.className("react-datepicker__year-select"));

    // Selector dinámico para encontrar el día exacto en el calendario
    public static final Target OPCION_DIA = Target.the("Día del calendario {0}")
            .locatedBy("//div[contains(@class,'react-datepicker__day') and not(contains(@class,'outside-month')) and text()='{0}']");

    public static final Target CAMPO_TEMAS = Target.the("Campo de temas")
            .located(By.xpath("//*[@id='genterWrapper']/div[2]/div[1]/label"));

    public static final Target BOTON_HOBBIES_SPORTS = Target.the("Opcion de deportes en Hobbies")
            .located(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[1]/label"));

    public static final Target BOTON_FOTO = Target.the("Boton para cargar fotos")
            .located(By.id("uploadPicture"));

    public static final Target CAMPO_DIRECCION_ACTUAL = Target.the("Campo de direccion actual")
            .located(By.id("currentAddress"));

    public static final Target BOTON_ESTADO = Target.the("Boton para seleccionar el estado en el que esta ubicado")
            .located(By.id("state"));

    public static final Target BOTON_CIUDAD =  Target.the("Boton para seleccionar la ciudad en la que esta ubicado")
            .located(By.id("city"));

    public static final Target BOTON_SUBMIT = Target.the("Boton para enviar el formulario")
            .located(By.id("submit"));

    public static final Target TITULO_MODAL = Target.the("Titulo de confirmacion del modal")
            .located(By.id("example-modal-sizes-title-lg"));

    public static final Target BOTON_CLOSE = Target.the("Boton para cerrar la confirmacion de envio de formulario correcta")
            .located(By.id("closeLargeModal"));
}
