package healthApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pivotalApplication.AppiumServerStart;

public class TinyUrl extends AppiumServerStart {
	
	static AppiumDriver driver;

	public Object MobileElement;
//CertificateValid

	@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		dc.setCapability("–session-override",true);
		dc.setCapability("noReset", false) ;
		//dc.setCapability("FullReset", false) ;
		dc.setCapability(MobileCapabilityType.APP, "C:\\healthapp-release-23-apr.apk");
		URL url = new URL("http://0.0.0.0:4723/");
		dc.setCapability("appPackage", "com.calculator_parent_apps");
		dc.setCapability("appActivity", "com.calculator_parent_apps.MainActivity");
		// AndroidDriver driver = new AndroidDriver(new
		// URL("http://127.0.0.1:4723/wd/hub"), dc); //Create driver object
		driver = new AppiumDriver(url, dc);

		Thread.sleep(5000);

	}

	@Test(priority = 0)
	public void NumberField() throws MalformedURLException, InterruptedException {
		Thread.sleep(5000);
		List<WebElement> EnglishSelect = driver.findElements(By.className("android.widget.TextView"));
		EnglishSelect.get(10).click();

		Thread.sleep(10000);
		// highlightElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));

		WebElement Number = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
		Number.sendKeys("9665002440");
		// highlightElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
	}

	@Test(priority = 1)
	public void IAgree() throws MalformedURLException, InterruptedException {
		WebElement Agree = driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
		Agree.click();
		Thread.sleep(1000);
	}

	@Test(priority = 2)
	public void proceedButton() throws MalformedURLException, InterruptedException {
		List<WebElement> proceed = driver.findElements(By.className("android.widget.TextView"));
		proceed.get(6).click();
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void OTP() throws MalformedURLException, InterruptedException {
		List<WebElement> otp1 = driver.findElements(By.className("android.widget.TextView"));
		otp1.get(7).click();

		Thread.sleep(1000);

		List<WebElement> otp2 = driver.findElements(By.xpath("//*[@text='4']"));
		otp2.get(0).click();

		Thread.sleep(1000);

		List<WebElement> otp3 = driver.findElements(By.xpath("//*[@text='0']"));
		otp3.get(1).click();

		Thread.sleep(1000);

		List<WebElement> otp4 = driver.findElements(By.xpath("//*[@text='5']"));
		otp4.get(0).click();

		Thread.sleep(1000);

		List<WebElement> otp5 = driver.findElements(By.xpath("//*[@text='2']"));
		otp5.get(0).click();

		Thread.sleep(1000);

		List<WebElement> otp6 = driver.findElements(By.xpath("//*[@text='0']"));
		otp6.get(2).click();

		Thread.sleep(5000);
	}

	@Test(priority = 4)
	public void Verify() throws MalformedURLException, InterruptedException {
		List<WebElement> verify = driver.findElements(By.xpath("//*[@text='Verify and Proceed']"));
		verify.get(0).click();

		Thread.sleep(15000);

	}

	@Test(priority = 5)
	public void precriptionClick() throws MalformedURLException, InterruptedException {
		List<WebElement> precriptionClick = driver.findElements(By.xpath("//*[@text='Prescription']"));
		precriptionClick.get(0).click();

		Thread.sleep(5000);

	}
	 
}


