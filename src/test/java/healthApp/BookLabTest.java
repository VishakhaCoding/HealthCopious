package healthApp;

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
import pivotalApplication.AppiumServerStart;

public class BookLabTest extends AppiumServerStart{
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
		List<WebElement> EnglishSelect = driver.findElements(By.xpath("//*[@text='Select']"));
		EnglishSelect.get(0).click();

		Thread.sleep(10000);
		// highlightElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));

		WebElement Number = driver.findElement(By.xpath(
				"//android.widget.EditText[@text=\"Mobile Number\"]"));
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


	
	  Thread.sleep(5000);

}
@Test(priority = 5)
public void SelectFamilyMember() throws MalformedURLException, InterruptedException {


	 Thread.sleep(5000);
	 List<WebElement> SelectFamilyMember = driver.findElements(By.xpath("//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView"));
		SelectFamilyMember.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 6)
public void AddButton() throws MalformedURLException, InterruptedException {
	

	List<WebElement> AddButton =driver.findElements(By.className(
			"android.widget.TextView"));
	AddButton.get(62).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 7)
public void BookLabTest11() throws MalformedURLException, InterruptedException {
	

	List<WebElement> BookLabTest =driver.findElements(By.xpath(
			"//*[@text='Book Lab Test']"));
	BookLabTest.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 8)
public void SelectLab() throws MalformedURLException, InterruptedException {
	

	List<WebElement> SelectLab =driver.findElements(By.xpath(
			"//*[@text='Select Lab']"));
	SelectLab.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 9)
public void ClickLab() throws MalformedURLException, InterruptedException {
	

	List<WebElement> ClickLab =driver.findElements(By.xpath(
			"//*[@text='Uday_P_Labs']"));
	ClickLab.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 10)
public void Comments() throws MalformedURLException, InterruptedException {
	

	List<WebElement> Comments =driver.findElements(By.xpath(
			"//*[@text='Enter Comments']"));
	Comments.get(0).sendKeys("Test");

	
	  Thread.sleep(5000);

}
@Test(priority = 11)
public void VaccineLabel() throws InterruptedException, IndexOutOfBoundsException {

	Thread.sleep(5000);
	WebElement VaccineLabel = driver.findElement(By.xpath("//*[@text='Upload test requisition from your doctor']"));
	VaccineLabel.click();
	Thread.sleep(2000);
	// driver.findElement(By.xpath("//*[@text='Ok']")).click();

	Thread.sleep(2000);
	WebElement allow

			= driver.findElement(By.xpath("//*[@text='While using the app']"));
	allow.click();

	/*
	 * WebElement allow1
	 * 
	 * = driver.findElement(By.xpath("//*[@text='Allow']")); allow1.click();
	 * Thread.sleep(2000); ;
	 */

	Thread.sleep(2000);
	WebElement CameraClick = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Take picture\"]"));
	CameraClick.click();

	Thread.sleep(5000);

	WebElement UploadOk = driver.findElement(By.xpath("//*[@text='OK']"));
	UploadOk.click();

	Thread.sleep(2000);

	/*
	 * WebElement Submit = driver.findElement(By.xpath("//*[@text='Submit']"));
	 * Submit.click();
	 */

}


  @Test(priority = 12) public void BookLabTest1() throws MalformedURLException,
  InterruptedException {
  
  
  List<WebElement> BookLabTest1 =driver.findElements(By.xpath(
  "//*[@text='Book Lab Test']")); BookLabTest1.get(1).click();
  
  
  Thread.sleep(5000);
  
  }
 
@Test(priority = 13)
public void Done() throws MalformedURLException, InterruptedException {
	

	List<WebElement> Done =driver.findElements(By.xpath(
			"//*[@text='Done']"));
	Done.get(0).click();

	
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
