package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features=".\\Example\\Login.feature",
		glue="Steps",
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)
public class Test{

}
