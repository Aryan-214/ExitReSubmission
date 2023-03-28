package Screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseClass;
import Reusable.TouchActionTN;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Animation extends BaseClass {
	public AppiumDriver<MobileElement> driver;
	//Bouncing ball button xpath
	public  By Bouncing_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]"));
	//Animation button xpath
	public By Animation_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]"));
	//Screen tap xpath
	public By Screen_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.View"));
	//Cloning button xpath
	public By Cloning_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]"));
	//Run button id
	public By RunButton_Tap = (By.id("com.hmh.api:id/startButton"));
	
	public Animation(AppiumDriver<MobileElement>driver) {
		this.driver=driver;
	}
	public String verify_Animation_action(By locator) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		return driver.findElement(locator).getText();
		}
	
	public void tap_Options(By locator) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(locator);
		TouchActionTN.tap1(driver, ele);
		}
	
	public WebElement webele(By locator) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		return driver.findElement(locator);
		}
}
