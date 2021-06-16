package runner;



import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.Definitions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "steps"
		)

public class RunnerTeste{
	
}