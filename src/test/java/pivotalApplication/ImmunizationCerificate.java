package pivotalApplication;

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
//import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ImmunizationCerificate extends AppiumServerStart {
	AppiumDriver driver;
	public Object MobileElement;

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
	dc.setCapability(MobileCapabilityType.APP, "C:\\pivotalapp-stage-vishakha.apk");
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
	WebElement proceed =driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"));
	proceed.click();
	Thread.sleep(2000);
}

@Test(priority = 3)
public void OTP() throws MalformedURLException, InterruptedException {
	WebElement otp = driver.findElement(By.xpath(
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

	Thread.sleep(5000);

	WebElement SearchBar =driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_bar\"]"));
	SearchBar.sendKeys("Pivo1Automation");

	Thread.sleep(2000);
	WebElement SearchIcon1 = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
	SearchIcon1.click();
	Thread.sleep(2000);

}

/*
 * @Test(priority = 6) public void close() throws InterruptedException {
 * Thread.sleep(2000); WebElement close = driver.findElement(By.xpath(
 * "//android.view.ViewGroup[@content-desc=\"search_close\"]")); close.click();
 * 
 * Thread.sleep(2000);
 * 
 * }
 */
@Test(priority = 7)
public void ClickPatient() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> Clickpatient = driver
			.findElements(By.className("android.widget.TextView"));
	Clickpatient.get(4).click();
	Clickpatient.get(4).click();

	

}
@Test(priority = 8)
public void ImmunizationClick() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement ImmunizationClick
	  = driver.findElement(By.xpath("//*[@text='Immunization']"));
	  ImmunizationClick.click();

	

}
@Test(priority = 9)
public void Records() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	WebElement Records
	  = driver.findElement(By.xpath("//*[@text='Records']"));
	  Records.click();

	

}
@Test(priority = 10)
public void Certificates() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	WebElement Certificates
	  = driver.findElement(By.xpath("//*[@text='Certificates']"));
	  Certificates.click();

	

}
@Test(priority = 11)
public void SelectVaciines() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	List<WebElement> SelectVaciines = driver.findElements(By.className("android.widget.EditText"));
	SelectVaciines.get(1).click();
	
	

}
@Test(priority = 12)
public void Proceed() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	WebElement Proceed
	  = driver.findElement(By.xpath("//*[@text='Proceed']"));
	  Proceed.click();

	

}
@Test(priority = 13)
public void SpecialityDropdown() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	WebElement SpecialityDropdown
	  = driver.findElement(By.xpath("//*[@text='Speciality']"));
	  SpecialityDropdown.click();

	

}
@Test(priority = 14)
public void DefaultV3() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	WebElement DefaultV3
	  = driver.findElement(By.xpath("//*[@text='default.v3']"));
	  DefaultV3.click();

	

}
@Test(priority = 15)
public void Preview() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	WebElement Preview
	  =driver.findElement(By.xpath("//*[@text='Preview']"));
	 Preview.click();
	

}
@Test(priority = 16)
public void Print() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	/*
	 * WebElement Print = driver.findElement(By.xpath("//*[@text='Print']"));
	 * Print.click();
	 */
	


	   List<WebElement> close =
	  driver.findElements(By.className("android.widget.TextView"));
	  close.get(0).click(); Thread.sleep(5000);
	  
	  List<WebElement> ClickBack =
	  driver.findElements(By.className("android.widget.TextView"));
	  ClickBack.get(0).click();
	  
	  Thread.sleep(5000);
	  
	  List< WebElement> ClickBack1 =
				/*
				 * driver.findElements(By.className("android.view.ViewGroup"));
				 * ClickBack1.get(2).click();
				 */
	  
	  driver.findElements(By.className("android.widget.TextView"));
	  ClickBack1.get(10).click();
	  
	  Thread.sleep(5000);
	  
	  List< WebElement> ClickBack2 =
			  driver.findElements(By.className("android.widget.TextView"));
			  ClickBack2.get(13).click();
			  
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
