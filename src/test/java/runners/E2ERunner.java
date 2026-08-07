package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/FlujoE2E.feature",
        glue = "stepdefinitions",
        tags = "@E2E",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class E2ERunner {
}