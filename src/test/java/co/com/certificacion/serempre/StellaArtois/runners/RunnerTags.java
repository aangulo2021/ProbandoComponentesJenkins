package co.com.certificacion.serempre.StellaArtois.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/ProbandoStellaArtois.feature",
        //tags = {""},
        glue = {"co.com.certificacion.serempre.StellaArtois.stepdefinitions"},
        snippets = SnippetType.CAMELCASE)
public class RunnerTags
{
}
