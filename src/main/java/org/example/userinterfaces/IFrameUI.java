package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IFrameUI extends PageObject {

    public static final Target TITULO_PAGINA_FRAME = Target.the("Titulo pagina princial")
            .located(By.xpath("//*[@id='framesWrapper']/h1"));

    public static final Target FRAME_1 = Target.the("IFrame 1 princial")
            .located(By.id("frame1"));

    public static final Target TITULO_FRAME_1 = Target.the("Titulo delIFrame 1 princial")
            .located(By.id("sampleHeading"))
            .inIFrame(By.id("frame1"));

    public static final Target FRAME_2 = Target.the("IFrame 2 princial")
            .located(By.id("frame2"));

    public static final Target TITULO_FRAME_2 = Target.the("Titulo delIFrame 2 princial")
            .located(By.xpath("//*[@id='sampleHeading']"))
            .inIFrame(By.id("frame2"));
}
