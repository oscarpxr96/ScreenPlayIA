package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DragAndDropUI {

    public static final Target TITULO_DRAGGABLE_PAGINA = Target.the("Titulo Pagina")
            .located(By.xpath("//h1[text()='Droppable']"));
    public static final Target BOTON_DRAGGABLE = Target.the("Boton de draggable")
            .located(By.id("draggable"));

    public static final Target BOTON_DROPPABLE = Target.the("Boton de droppable")
            .located(By.id("droppable"));

    public static final Target TITULO_DROPPABLE = Target.the("Titulo del cuadro de droppable")
            .located(By.xpath("//*[text()='Dropped!']"));

}
