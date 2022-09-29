package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/com/features",
		glue="stepdefination",
		plugin="html:target",
		dryRun = false,
		monochrome=true,
		tags="@dash1"
		)

public class Testrunner {

}
