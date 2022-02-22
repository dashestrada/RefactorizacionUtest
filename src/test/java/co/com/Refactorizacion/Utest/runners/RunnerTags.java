package co.com.Refactorizacion.Utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register_successful.feature",
        tags = "@stories",
        glue = "co.com.Refactorizacion.Utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
