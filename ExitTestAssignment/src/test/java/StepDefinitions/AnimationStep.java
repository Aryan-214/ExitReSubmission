package StepDefinitions;


import org.testng.Assert;

import Base.BaseClass;
import Base.Logger1;
import Screens.Animation;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class AnimationStep extends BaseClass {
	public AppiumDriver<MobileElement>driver;
	
	public AnimationStep(BaseClass base) {
		this.driver=base.driver;
	}
	
	Animation screen = new Animation (driver);
	
	@Given("^User click to the Animation$")
	public void user_click_to_the_Animation() {
		Animation screen = new Animation (driver);
		Assert.assertEquals(screen.verify_Animation_action(screen.Animation_Tap), "Animation");
		Logger1.info("user has successefully clicked to the Animation Button");
	}

	
	@Then("^Click to the Bouncing Balls$")
	public void click_to_the_Bouncing_Balls() {
		Animation screen = new Animation (driver);
		screen.tap_Options(screen.Bouncing_Tap);
		Logger1.info("user has successefully clicked to the Bouncing Balls");

	}
	
	@Then("^Tap on the Screen$")
	public void tap_on_the_Screen() {
		Animation screen = new Animation (driver);
		screen.tap_Options(screen.Screen_Tap);
		Logger1.info("user has successefully clicked to the Screen");

	}

	
	@Then("^Click to the Cloning$")
	public void click_to_the_Cloning() {
		Animation screen = new Animation (driver);
		screen.tap_Options(screen.Cloning_Tap);
		Logger1.error("Failed to click to the Cloning button");

	}

	
	@Then("^Click to the Run Button$")
	public void click_to_the_Run_Button() {
		Animation screen = new Animation (driver);
		screen.tap_Options(screen.RunButton_Tap);
		Logger1.info("User successfully clicked to the Run Button");

	}

}
