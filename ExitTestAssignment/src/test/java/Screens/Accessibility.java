package Screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Reusable.TouchActionTN;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Accessibility {
	public  AppiumDriver<MobileElement> driver;
	//Accessibility tap button xpath
	public By Accessibility_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]"));
	//Accessibility Node Quriying tap button xpath
	public By AccessibilityNQ_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]"));
	//Check box xpath
	public By AccessibilityClick_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.CheckBox"));
	//Check box xapth
	public By AccessibilityClick1_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.CheckBox"));
	//check box xpath
	public By AccessibilityClick2_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.CheckBox"));

	public Accessibility(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
	}
	public String verify_Accessibility_action(By locator) {
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

