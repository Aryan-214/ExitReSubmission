package Screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseClass;
import Reusable.TouchActionTN;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class App {
	public AppiumDriver<MobileElement>driver;
	
	//App button tap xpath
	public By App_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]"));
	//Action Bar button xpath
	public By ActionBar_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]"));
	//Action Bar tabs xapth
	public By ActionBarTabs_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]"));
	//id of tohhle tab mode
	public By Toggle_Tap = (By.id("com.hmh.api:id/btn_toggle_tabs"));
	//id of Add new tab
	public By AddTab_Tap = (By.id("com.hmh.api:id/btn_add_tab"));
	//xpath of Remove last tab
	public By RemoveTab_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]"));
	//id of Remove all tab
	public By RemoveAllTab_Tap = (By.id("com.hmh.api:id/btn_remove_all_tabs"));
	
	public App(AppiumDriver<MobileElement> driver){
		this.driver=driver;
	}
	
	public String verify_App_action(By locator) {
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
