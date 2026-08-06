package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/dragAndDrop.feature",
        glue = "stepdefinitions",
        //tags = "@formularioCompleto",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class DragAndDropRunner {
}

