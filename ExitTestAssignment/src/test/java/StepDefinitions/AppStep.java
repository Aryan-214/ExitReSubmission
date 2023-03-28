package StepDefinitions;

import org.testng.Assert;

import Base.BaseClass;
import Base.Logger1;
import Screens.App;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AppStep extends BaseClass{
public AppiumDriver<MobileElement>driver;
	
	public AppStep(BaseClass base) {
		this.driver=base.driver;
	}
	
	App screen = new App (driver);
    
	@Given("^User click to the App$")
	public void user_click_to_the_App() {
		App screen = new App (driver);
		Assert.assertEquals(screen.verify_App_action(screen.App_Tap), "Animation");
	    Logger1.info("user has successefully clicked to the App button");
	}
	
	@Then("^click to the Action Bar$")
	public void click_to_the_Action_Bar() {
		App screen = new App (driver);
		screen.tap_Options(screen.ActionBar_Tap);
	    Logger1.info("user has successefully clicked to the Action Bar button");
	}
	
	@Then("^click to the Action Bar Tabs$")
	public void click_to_the_Action_Bar_Tabs(){
		App screen = new App (driver);
		screen.tap_Options(screen.ActionBarTabs_Tap);
	    Logger1.info("user has successefully clicked to the Action Bar Tabs");
	}
	
	@Then("^click to the Toggle Tab Mode$")
	public void click_to_the_Toggle_Tab_Mode(){
		App screen = new App (driver);
		screen.tap_Options(screen.Toggle_Tap);
	    Logger1.info("user has successefully clicked to the Toggle Tab Mode");
	}
	
	@Then("^click to the Add New Tab$")
	public void click_to_the_Add_New_Tab() {
		App screen = new App (driver);
		screen.tap_Options(screen.AddTab_Tap);
	    Logger1.info("user has successefully clicked to the Add New Tab");
	}
	
	
	@Then("^click to the Remove Last Tab$")
	public void click_to_the_Remove_Last_Tab(){
		App screen = new App (driver);
		screen.tap_Options(screen.RemoveTab_Tap);
	    Logger1.info("user has successefully clicked to the Remove Last Tab");
	}
	
	@Then("^click to the Remove All Tab$")
	public void click_to_the_Remove_All_Tab() {
		App screen = new App (driver);
		screen.tap_Options(screen.RemoveAllTab_Tap);
	    Logger1.info("user has successefully clicked to the Remove All Tabs");
	}

}
