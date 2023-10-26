package linkedlearning.CucumberEssT.testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/linkedlearning/CucumberEssT/features"},
		glue = {
				"linkedlearning.CucumberEssT.stepDefinitions",
				"linkedlearning.CucumberEssT.hooks"},
		tags = "@ScenarioOutlineExample",
		plugin = {
				"pretty",
				"html:target/MenuTestReports/report.html",
				"json:target/MenuTestReports/report.json",
				"junit:target/MenuTestReports/report.xml"},
		dryRun = false // check scenario-stepDef mapping,
		)
public class MenuManagementTest {

}
