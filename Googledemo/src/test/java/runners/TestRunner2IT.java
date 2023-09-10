package runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
plugin= {"html:target"},
glue= {"stepdefinition",
"json:target/jsonReport.json",
"junit:target/xmlReport.xml"}
)

public class TestRunner2IT {

}
