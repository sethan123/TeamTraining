package stepdefin;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


// runner class

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/featurefiles",
		glue="StepDefinition", 
		plugin = {"pretty", "html:target/cucumber-reports"}
		)
public class testRunner {
	
	
	
	
	
}
