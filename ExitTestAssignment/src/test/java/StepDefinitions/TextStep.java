package StepDefinitions;

import org.testng.Assert;

import Base.BaseClass;
import Base.Logger1;
import Screens.Text;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TextStep extends BaseClass {
	public AppiumDriver<MobileElement>driver;
	
	public TextStep(BaseClass base) {
		this.driver=base.driver;
	}
	
	Text screen=new Text(driver);
	
	@Given("^User click to the Text$")
	public void user_click_to_the_Text() {
		Text screen=new Text(driver);
		screen.tap_Options(screen.Text_Tap);
		Assert.assertTrue(screen.webele(screen.Linkify_tab).isDisplayed());
		Logger1.info("user has successefully clicked to the Text Button");
	}

	
	@When("^Click to linkify$")
	public void click_to_linkify() {
		Text screen=new Text(driver);
		screen.tap_Options(screen.Linkify_tab);
		Assert.assertTrue(screen.webele(screen.LogTextBox).isDisplayed());
		Logger1.info("user has successefully clicked to the check box");

	}

	@When("^Click to logTextBox$")
	public void click_to_logTextBox() {
		Text screen=new Text(driver);
		screen.tap_Options(screen.LogTextBox);
		Assert.assertTrue(screen.webele(screen.Add_tab).isDisplayed());
		Logger1.info("user has successefully clicked to the Log Text box");
	}

	@Then("^Click to add submit button$")
	public void click_to_add_submit_button() {
		Text screen=new Text(driver);
		screen.tap_Options(screen.Add_tab);
		Logger1.info("user has successefully clicked to the Add Tab");
	}

}
