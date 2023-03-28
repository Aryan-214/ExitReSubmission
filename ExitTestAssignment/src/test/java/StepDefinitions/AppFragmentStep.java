package StepDefinitions;


import org.testng.Assert;

import Base.BaseClass;
import Base.Logger1;
import Screens.AppFragment;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class AppFragmentStep extends BaseClass {
public AppiumDriver<MobileElement>driver;
	
	public AppFragmentStep(BaseClass base) {
		this.driver=base.driver;
	}
	
	AppFragment screen = new AppFragment (driver);
	
	@Given("^User click to the App1$")
	public void user_click_to_the_App1() throws Throwable {
		AppFragment screen = new AppFragment (driver);
		Assert.assertEquals(screen.verify_AppFragment_action(screen.App_Tap), "AppFragment");
	    Logger1.info("user has successefully clicked to the App button");
	    
	}
  
	@Then("^Click to the Fragment button$")
	public void click_to_the_Fragment_button() throws Throwable {
		AppFragment screen = new AppFragment (driver);
		screen.tap_Options(screen.Fragment_Tap);
	    Logger1.info("user has successefully clicked to the Fragment button");
	    
	}

	@Then("^Click to the Recieve Result$")
	public void click_to_the_Recieve_Result() throws Throwable {
		AppFragment screen = new AppFragment (driver);
		screen.tap_Options(screen.RecieveResult_Tap);
	    Logger1.info("user has successefully clicked to the Receive Result button");
	    
	}

	@Then("^Click to the Get Result$")
	public void click_to_the_Get_Result() throws Throwable {
		AppFragment screen = new AppFragment (driver);
		screen.tap_Options(screen.GetResult_Tap);
	    Logger1.info("user has successefully clicked to the Get Result button");
			    
	}

	@Then("^Select the Color$")
	public void select_the_Color() throws Throwable {
		AppFragment screen = new AppFragment (driver);
		screen.tap_Options(screen.Color_Tap);
	    Logger1.info("user has successefully clicked to the Color button");
	    
	}

	@Then("^Again Click to the Recieve Result$")
	public void again_Click_to_the_Recieve_Result() throws Throwable {
		AppFragment screen = new AppFragment (driver);
		screen.tap_Options(screen.RecieveResult_Tap);
	    Logger1.info("user has successefully clicked to the Receive button");
	    
	}

	@Then("^Select the color$")
	public void select_the_color() throws Throwable {
		AppFragment screen = new AppFragment (driver);
		screen.tap_Options(screen.Color1_Tap);
	    Logger1.info("user has successefully clicked to the color button");
	    
	}

}
