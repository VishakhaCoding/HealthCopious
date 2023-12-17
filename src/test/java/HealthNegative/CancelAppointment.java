package HealthNegative;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CancelAppointment {
	AppiumDriver driver;
	public Object MobileElement;
//CertificateValid
	@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {

	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
	dc.setCapability(MobileCapabilityType.APP, "D:\\healthapp-release-16-Aug.apk");
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
	
	  List<WebElement> EnglishSelect = driver.findElements(By.className(
	  "android.widget.TextView"
	  )); EnglishSelect.get(10).click();
	 
	
	
	Thread.sleep(10000);
	
	WebElement Number = driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
	Number.sendKeys("9665002440");
}

@Test(priority = 1)
public void IAgree() throws MalformedURLException, InterruptedException {
	WebElement Agree = driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
	Agree.click();
	Thread.sleep(1000);
}

@Test(priority = 2)
public void proceedButton() throws MalformedURLException, InterruptedException {
	List<WebElement> proceed = driver.findElements(By.className(
			"android.widget.TextView"));
	proceed.get(6).click();
	Thread.sleep(5000);
}

@Test(priority = 3)
public void OTP() throws MalformedURLException, InterruptedException {
	List<WebElement> otp1 =driver.findElements(By.className(
			"android.widget.TextView"));
	otp1.get(7).click();

	Thread.sleep(1000);
	
	List<WebElement> otp2 =driver.findElements(By.xpath(
			"//*[@text='4']"));
	otp2.get(0).click();


	Thread.sleep(1000);
	
	List<WebElement> otp3 =driver.findElements(By.xpath(
			"//*[@text='0']"));
	otp3.get(1).click();


	Thread.sleep(1000);
	
	List<WebElement> otp4 =driver.findElements(By.xpath(
			"//*[@text='5']"));
	otp4.get(0).click();

	Thread.sleep(1000);
	
	List<WebElement> otp5 =driver.findElements(By.xpath(
			"//*[@text='2']"));
	otp5.get(0).click();


	Thread.sleep(1000);
	
	List<WebElement> otp6 =driver.findElements(By.xpath(
			"//*[@text='0']"));
	otp6.get(2).click();

	Thread.sleep(5000);
}

@Test(priority = 4)
public void Verify() throws MalformedURLException, InterruptedException {
	List<WebElement> verify =driver.findElements(By.xpath(
			"//*[@text='Verify and Proceed']"));
	verify.get(0).click();


	
	  Thread.sleep(2000);

}
@Test(priority = 5)
public void BookAppointment() throws MalformedURLException, InterruptedException {
	/*
	 * List<WebElement> AddFamilyMember =driver.findElements(By.className(
	 * "android.widget.TextView")); AddFamilyMember.get(34).click();
	 */

	List<WebElement> BookAppointment =driver.findElements(By.xpath(
			"//*[@text='Book Appointment']"));
	BookAppointment.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 6)
public void SelectFamilyMember() throws MalformedURLException, InterruptedException {
	
	List<WebElement> SelectFamilyMember =driver.findElements(By.className(
			"android.view.ViewGroup"));
	SelectFamilyMember.get(15).click();

	
	  Thread.sleep(2000);

}
@Test(priority = 7)
public void SelectDoctor() throws MalformedURLException, InterruptedException {
	
	List<WebElement> SelectDoctor =driver.findElements(By.xpath(
			"//*[@text='Select Doctor']"));
	SelectDoctor.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 8)
public void Doctor() throws MalformedURLException, InterruptedException {
	

	List<WebElement> Doctor =driver.findElements(By.xpath(
			"//*[@text='Dr. Vishakha  Nawale ']"));
	Doctor.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 9)
public void DateClick() throws MalformedURLException, InterruptedException {


	List<WebElement> DateClick =driver.findElements(By.xpath(
			"//*[@text='DD/MM/YYYY']"));
	DateClick.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 10)
public void Time() throws MalformedURLException, InterruptedException {
	

	List<WebElement> Time =driver.findElements(By.xpath("//*[@text='06:00 pm']"
			));
	Time.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 11)
public void PurposeVisit() throws MalformedURLException, InterruptedException {
	

	List<WebElement> PurposeVisit =driver.findElements(By.xpath(
			"//*[@text='Enter purpose of visit']"));
	PurposeVisit.get(0).sendKeys("Test");

	
	  Thread.sleep(5000);

}
@Test(priority = 12)
public void CreateAppointment() throws MalformedURLException, InterruptedException {
	

	List<WebElement> CreateAppointment =driver.findElements(By.xpath(
			"//*[@text='Create Appointment']"));
	CreateAppointment.get(1).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 13)
public void Done() throws MalformedURLException, InterruptedException {
	
	List<WebElement> Done =driver.findElements(By.xpath(
			"//*[@text='Done']"));
	Done.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 14)
public void Change() throws MalformedURLException, InterruptedException {
	
	List<WebElement> Change =driver.findElements(By.xpath(
			"//*[@text='Change']"));
	Change.get(0).click();

	
	  Thread.sleep(5000);

}

@Test(priority = 15)
public void CancelAppointments() throws MalformedURLException, InterruptedException {
	
	List<WebElement> CancelAppointments =driver.findElements(By.xpath(
			"//*[@text='Cancel Appointment']"));
	CancelAppointments.get(0).click();

	
	  Thread.sleep(10000);

}
@Test(priority = 16)
public void CancelYes() throws MalformedURLException, InterruptedException {
	
	List<WebElement> CancelYes =driver.findElements(By.xpath(
			"//*[@text='YES']"));
	CancelYes.get(0).click();

	
	  Thread.sleep(10000);

}
@Test(priority = 17)
public void CancelOk() throws MalformedURLException, InterruptedException {
	
	List<WebElement> CancelOk =driver.findElements(By.xpath(
			"//*[@text='OK']"));
	CancelOk.get(0).click();

	
	  Thread.sleep(5000);

}
//@AfterClass public void close() throws IOException {
	@AfterMethod
	public void screenShot(ITestResult result) { // using ITestResult.FAILURE is equals to result.getStatus then it
		// enter into if condition
		if (ITestResult.FAILURE == result.getStatus()) {
			try { // To create reference of TakesScreenshot
				EventFiringWebDriver edriver = new EventFiringWebDriver(driver); // Call method to capture screenshot
				File src = edriver.getScreenshotAs(OutputType.FILE); // Copy files to specific location
				// result.getName() will return name of test case so that screenshot name will
				// be same as test case name
				FileUtils.copyFile(src, new File("C:\\ScreenShotFolder\\" + result.getName() + ".png"));
				System.out.println("Successfully captured a screenshot"); // driver.quit();
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());

				// driver.quit();
				// Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T"); }

			}
		}
	}

}
