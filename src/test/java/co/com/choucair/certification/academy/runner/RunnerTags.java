package co.com.choucair.certification.academy.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/academy_choucair.feature",
        tags = "@Scenario1",
        glue = "co.com.choucair.certification.academy.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
