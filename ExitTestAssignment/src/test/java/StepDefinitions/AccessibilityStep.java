package StepDefinitions;

import org.testng.Assert;

import Base.BaseClass;
import Base.Logger1;
import Screens.Accessibility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccessibilityStep extends BaseClass {
	
	public AppiumDriver<MobileElement>driver;
	
	public AccessibilityStep(BaseClass base) {
		this.driver=base.driver;
	}
	Accessibility screen=new Accessibility(driver);
	
	@Given("^User click to the Accessibility$")
	public void user_click_to_the_Accessibility() {
		Accessibility screen=new Accessibility(driver);
		Assert.assertEquals(screen.verify_Accessibility_action(screen.Accessibility_Tap),"Accessibility");
		Logger1.info("user has successefully clicked to the Accessibility");
	}
	
	@Then("^Click to Accessibility Node Querying$")
	public void click_to_Accessibility_Node_Querying() {
		Accessibility screen=new Accessibility(driver);
		screen.tap_Options(screen.AccessibilityNQ_Tap);
	    Logger1.info("user has successefully clicked to the Accessibility Node Querying");
	}
	@And("^Click to the check box$")
	public void click_to_the_check_box() {
		Accessibility screen=new Accessibility(driver);
		screen.tap_Options(screen.AccessibilityClick_Tap);
	    Logger1.info("user has successefully clicked to the check box");
	}
	
	@And("^Click to the check bok$")
	public void click_to_the_check_bok() {
		Accessibility screen=new Accessibility(driver);
		screen.tap_Options(screen.AccessibilityClick1_Tap);
	    Logger1.info("user has successefully clicked to the check box");
	    
	}
	
	@And("^Again Click to the check box$")
	public void again_Click_to_the_check_box() {
		Accessibility screen=new Accessibility(driver);
		screen.tap_Options(screen.AccessibilityClick2_Tap);
	    Logger1.info("user has successefully clicked to the check box");
	    
	}
	
}
