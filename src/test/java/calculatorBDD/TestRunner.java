package calculatorBDD;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources",
    glue = "calculatorBDD.steps",
    plugin = {"pretty", "html:target/cucumber-reports"},
    tags = "@test1"
)
public class TestRunner {

}
