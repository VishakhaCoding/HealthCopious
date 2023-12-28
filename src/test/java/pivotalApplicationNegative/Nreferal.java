package pivotalApplicationNegative;

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
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pivotalApplication.AppiumServerStart;

public class Nreferal extends AppiumServerStart{
	
	AppiumDriver driver;
	public Object MobileElement;
//CertificateValid
	@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {

	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
	dc.setCapability("–session-override",true);
	  dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120000);
	  dc.setCapability("noReset", false) ;
	dc.setCapability(MobileCapabilityType.APP, "D:\\pivotalapp-20-june.apk");
	URL url = new URL("http://0.0.0.0:4723/");
	dc.setCapability("appPackage", "com.calculator_apps");
	dc.setCapability("appActivity", "com.calculator_apps.MainActivity");
	// AndroidDriver driver = new AndroidDriver(new
	// URL("http://127.0.0.1:4723/wd/hub"), dc); //Create driver object
	driver = new AppiumDriver(url, dc);

	Thread.sleep(5000);

}

@Test(priority = 0)
public void NumberField() throws MalformedURLException, InterruptedException {
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
	WebElement proceed = driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"));
	proceed.click();
	Thread.sleep(2000);
}

@Test(priority = 3)
public void OTP() throws MalformedURLException, InterruptedException {
	WebElement otp =driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"));
	otp.sendKeys("140520");

	Thread.sleep(10000);
}

@Test(priority = 4)
public void submit() throws MalformedURLException, InterruptedException {
	WebElement submit = driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView"));
	submit.click();

	Thread.sleep(10000);
	 List<WebElement> WhatsNewClose =  driver.findElements(By.className("android.widget.TextView"));
	  WhatsNewClose.get(1).click();
	  Thread.sleep(2000);

}

@Test(priority = 5)
public void Search() throws InterruptedException {

	WebElement SearchIcon = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
	SearchIcon.click();

	Thread.sleep(2000);

	WebElement SearchBar = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_bar\"]"));
	SearchBar.sendKeys("PivoTotal7Automation");

	Thread.sleep(2000);
	WebElement SearchIcon1 = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
	SearchIcon1.click();
	Thread.sleep(2000);

}

@Test(priority = 6)
public void close() throws InterruptedException {
	Thread.sleep(2000);
	WebElement close = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_close\"]"));
	close.click();

	Thread.sleep(2000);

}

@Test(priority = 7)
public void ClickPatient() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> Clickpatient = driver
			.findElements(By.className("android.widget.TextView"));
	Clickpatient.get(5).click();

	

}
@Test(priority = 8)
public void RffralCreation() throws InterruptedException, IndexOutOfBoundsException {
	
	Thread.sleep(2000);
	WebElement RffralCreation
	  = driver.findElement(By.xpath("//*[@text='Referral']"));
	  RffralCreation.click();

		/*
		 * Thread.sleep(2000);
		 * 
		 * 
		 * WebElement preview1 = driver.findElement(By.xpath("//*[@text='Preview']"));
		 * preview1.click();
		 * 
		 * 
		 * Thread.sleep(2000); WebElement Error = driver.findElement(By.xpath(
		 * "//*[@text='Please enter referring Doctor's name']")); //submit.click();
		 * 
		 * 
		 * 
		 * 
		 * String b=Error.getText(); System.out.println(b); String
		 * Actualmsge="Please enter referring Doctor's name"; Assert.assertEquals(b,
		 * Actualmsge);
		 */
}
@Test(priority = 9)
public void DrName() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DrName = driver
			.findElements(By.className("android.widget.EditText"));
	DrName.get(0).sendKeys("Refer");
}
	


@Test(priority = 10)
public void DrEmail() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DrEmail = driver
			.findElements(By.className("android.widget.EditText"));
	DrEmail.get(1).sendKeys("abc@gmail.com");}

@Test(priority = 11)
public void DrMobNumber() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DrMobNumber = driver
			.findElements(By.className("android.widget.EditText"));
	DrMobNumber.get(2).sendKeys("1234567891");
}
@Test(priority = 12)
public void HealthCondition() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> HealthCondition = driver
			.findElements(By.className("android.widget.EditText"));
	HealthCondition.get(3).sendKeys("Critical");

}
@Test(priority = 13)
public void Duration() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> Duration = driver
			.findElements(By.className("android.widget.EditText"));
	Duration.get(4).sendKeys("2");
	
Thread.sleep(2000);
	
	WebElement preview
	  = driver.findElement(By.xpath("//*[@text='Preview']"));
	  preview.click();
	  Thread.sleep(3000);
		WebElement Error = driver.findElement(By.xpath(
				"//*[@text='Please select template type before proceeding']"));
		//submit.click();
		
		
		
		
		String c=Error.getText();
		  System.out.println(c);
		  String Actualmsge="Please select template type before proceeding";
		  Assert.assertEquals(c, Actualmsge);
}
@Test(priority = 14)
public void Speciality() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	
	WebElement Speciality11
	  = driver.findElement(By.xpath("//*[@text='Speciality']"));
	 Speciality11.click();
	 Thread.sleep(5000);
	 WebElement Speciality12
	  =driver.findElement(By.xpath("//*[@text='default.v3']"));
	 Speciality12.click();
		/*
		 * List<io.appium.java_client.MobileElement> Speciality = driver
		 * .findElements(By.className("android.view.ViewGroup"));
		 * Speciality.get(4).click();
		 */
	
		/*
		 * Thread.sleep(2000); List<io.appium.java_client.MobileElement> speciality1 =
		 * driver .findElements(By.className("android.view.ViewGroup"));
		 * speciality1.get(0).click();
		 */

}
@Test(priority = 15)
public void preview() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	
	WebElement preview
	  = driver.findElement(By.xpath("//*[@text='Preview']"));
	  preview.click();


}
@Test(priority = 16)
public void Save() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	WebElement Save
	  = driver.findElement(By.xpath("//*[@text='Save']"));
	 Save.click();

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
