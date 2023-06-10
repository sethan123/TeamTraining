package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)				
@CucumberOptions(
					features="src/test/resources/Features",
					glue="StepDefinition", 
					plugin = {"pretty", "html:target/cucumber-reports"}
					)

public class Runner {

	
	
}


//@RunWith(Cucumber.class)
//@CucumberOptions(
//    features = "src/test/resources/Features",
//    glue = "stepdefinitions",
//    plugin = {"pretty", "html:target/cucumber-reports"}
//)
//public class Runner {
//}