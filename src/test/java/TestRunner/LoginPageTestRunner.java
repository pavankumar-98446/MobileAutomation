package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = true, features = "Feature", glue = { "StepDefLoginPage" }, monochrome = true, format = {
		"html:Results" })

public class LoginPageTestRunner {

}
