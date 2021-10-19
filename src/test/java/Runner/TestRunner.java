package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features", 
		glue= {"StepDefinitions"},
		plugin= {
				"pretty", 
				//"html:target/cucumber-reports",
				"json:target/reporteJson.json"				},
		monochrome=true,
		tags=("")
		)


public class TestRunner {

	
}
