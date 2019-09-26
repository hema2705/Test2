package HelloFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = "pretty", features = "src/test/resources/HelloFeature"

)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

	
}

