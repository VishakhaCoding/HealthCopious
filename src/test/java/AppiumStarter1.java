import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumStarter1 {
	 AppiumDriver driver;
	 public Object MobileElement;
	// public static AppiumDriverLocalService Server;
	 
	
	// node path: C:\ Program Files\nodejs\node.exe
	 //appium main.js path: C:\Users\Lenovo\AppData\Roaming\npm\node_modules\appium\build\lib\main.js
	

	
private static AppiumDriverLocalService Server;
@BeforeSuite()
public void BfSuite()
{
	Server= getAppiumServiceDefault();
	Server.start();
}
/*
 * @org.testng.annotations.AfterSuite() public void AfterSuite() {
 * 
 * Server.stop(); }
 */
/*
 * public void Bf1Suite() { Server= getApp(); Server.start(); }
 */

public AppiumDriverLocalService getAppiumServiceDefault() {
	return AppiumDriverLocalService.buildDefaultService();
}
@BeforeClass
public void setup() throws MalformedURLException, InterruptedException {

	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
	dc.setCapability(MobileCapabilityType.APP, "D:\\z");
	dc.setCapability(MobileCapabilityType.APP, "D:\\pivoapp-prod-16-nov.apk");
	URL url = new URL("http://0.0.0.0:4723/");
	dc.setCapability("appPackage", "com.calculator_apps");
	dc.setCapability("appActivity", "com.calculator_apps.MainActivity");
	// AndroidDriver driver = new AndroidDriver(new
	// URL("http://127.0.0.1:4723/wd/hub"), dc); //Create driver object
	driver = new AppiumDriver(url, dc);

	Thread.sleep(5000);

}

		
/*
 * @Test(priority=0) public void NumberField() throws MalformedURLException,
 * InterruptedException { WebElement Number = driver.findElement(By.xpath(
 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"
 * )); Number.sendKeys("9665002440");}
 * 
 * }
 */
}
