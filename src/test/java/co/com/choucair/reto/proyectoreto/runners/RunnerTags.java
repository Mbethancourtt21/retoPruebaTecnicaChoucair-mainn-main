package co.com.choucair.reto.proyectoreto.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/signUpUtest.feature",
        tags = "@stories",
        glue = "co.com.choucair.reto.proyectoreto.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
