package Runner;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Listeners({ExtentITestListenerClassAdapter.class})	
@CucumberOptions(
		features= {"src/test/java/Feature"},
		glue= {"StepDefinitions"},
		tags= {"@tag4"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {
		
}