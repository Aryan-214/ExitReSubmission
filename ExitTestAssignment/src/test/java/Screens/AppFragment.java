package Screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseClass;
import Reusable.TouchActionTN;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppFragment extends BaseClass {
    public AppiumDriver<MobileElement>driver;
	
	//App button xpath
	public By App_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]"));
	//fragment button xpath
	public By Fragment_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[6]"));
	//receive result button xpath
	public By RecieveResult_Tap = (By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[11]"));
	//id of Get Result tab button
	public By GetResult_Tap = (By.id("com.hmh.api:id/get"));
	//id of Color tab button
	public By Color_Tap = (By.id("com.hmh.api:id/corky"));
	//id of color tab button
	public By Color1_Tap = (By.id("com.hmh.api:id/violet"));
	
	public AppFragment(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
	}
	public String verify_AppFragment_action(By locator) {
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
