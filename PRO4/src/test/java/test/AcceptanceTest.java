package test;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "use_cases",
plugin = {"html:target/cucmber/wikipidia.html"},
snippets = SnippetType.CAMELCASE ,
glue= {"test"},
strict=true)
public class AcceptanceTest {

}
