package Screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Reusable.TouchActionTN;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Text {
	public AppiumDriver<MobileElement>driver;
	
	//Text tap button xpath
	public By Text_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[10]\r\n"));
    //Linkify tap button xpath
	public By Linkify_tab = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]"));
    //LogTextBox tap button xpath
	public By LogTextBox = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]\r\n"));
    //id of Add tap button
	public By Add_tab = (By.id("com.hmh.api:id/add"));
	
	public Text(AppiumDriver<MobileElement> driver){
		this.driver=driver;
	}
	public String verify_Text_actions(By locator) {
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		return driver.findElement(locator).getText();
	}
	
	public void tap_Options(By locator) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele=driver.findElement(locator);
		TouchActionTN.tap1(driver,ele);
	}
	public WebElement webele(By locator) {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		return driver.findElement(locator);
	}
}
