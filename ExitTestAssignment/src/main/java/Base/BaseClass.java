package Base;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Utils.DeviceCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	// initialize drivers
	public AppiumDriver<MobileElement> driver; 
	private static DesiredCapabilities capabilities = new DesiredCapabilities();
	//protected AppiumDriverLocalService service;

	//Starting the appium server
//	@BeforeSuite
//	public void start() {
//		service = AppiumDriverLocalService.buildDefaultService();
//		service.start();
//		Logger1.info("Appium Server Started");
//		}

	@BeforeTest
	// Desire capabilities for app
	public void setup() {
		capabilities.setCapability("platformVersion", DeviceCapabilities.getCapabilities("platformVersion"));
		capabilities.setCapability("platformName",DeviceCapabilities.getCapabilities ("platformName"));
		capabilities.setCapability("deviceName", DeviceCapabilities.getCapabilities("deviceName"));
		capabilities.setCapability("appPackage",DeviceCapabilities.getCapabilities ("com.hmh.api"));
		capabilities.setCapability("appActivity", DeviceCapabilities.getCapabilities("appActivity"));
		capabilities.setCapability("app",DeviceCapabilities.getCapabilities("app"));
		// capabilities.setCapability("isHeadless", true);
		// server path
		try {
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void stopAppium() throws InterruptedException {
		driver.quit();
		Logger1.info("Test Case Successfully Completed");
	}
//	@After public void addScreenshot(Scenario scenario){
//		if(scenario.isFailed()) {
//			final byte[] screenshot = ((TakesScreenshot)wd).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenshot,"image/png","image");
//			}
//		
//	}

			
}
