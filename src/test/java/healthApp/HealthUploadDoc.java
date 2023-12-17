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

public class HealthUploadDoc  extends AppiumServerStart{
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
	dc.setCapability(MobileCapabilityType.APP, "D:\\healthapp-release-16-Aug.apk");
	dc.setCapability("–session-override",true);
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


	
	  Thread.sleep(5000);

}
@Test(priority = 5)
public void SelectFamilyMember() throws MalformedURLException, InterruptedException {


	List<WebElement> SelectFamilyMember =driver.findElements(By.className(
			"android.view.ViewGroup"));
	SelectFamilyMember.get(8).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 6)
public void AddButton() throws MalformedURLException, InterruptedException {
	

	List<WebElement> AddButton =driver.findElements(By.className(
			"android.widget.TextView"));
	AddButton.get(78).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 7)
public void UploadDoc() throws MalformedURLException, InterruptedException {
	

	List<WebElement> UploadDoc =driver.findElements(By.xpath(
			"//*[@text='Upload Documents']"));
	UploadDoc.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 9)
public void DocumentsDropDown() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	List<WebElement> DocumentsDropDown = driver.findElements(By.className("android.widget.TextView"));
	DocumentsDropDown.get(2).click();

	

}
@Test(priority = 10)
public void DischargeSummary() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement DischargeSummary
	  = driver.findElement(By.xpath("//*[@text='Discharge Summary']"));
	  DischargeSummary.click();

	

}
@Test(priority = 11)
public void CreatedBy() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement CreatedBy
	  = driver.findElement(By.xpath("//*[@text='Created By']"));
	  CreatedBy.sendKeys("Doc");

	

}
@Test(priority = 12)
public void DocumentOn() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DocumentOn =  driver.findElements(By.className("android.widget.TextView"));
	DocumentOn.get(4).click();

	

}
@Test(priority = 13)
public void popUpOk() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement popUpOk
	  = driver.findElement(By.xpath("//*[@text='Okay']"));
	  popUpOk.click();

	

}
@Test(priority = 14)
public void Camera() throws InterruptedException, IndexOutOfBoundsException {
	
	Thread.sleep(5000);
	WebElement Camera
	
	  = driver.findElement(By.xpath("//*[@text='Camera']"));
	Camera.click();
	Thread.sleep(2000);
	WebElement allow
	
	  = driver.findElement(By.xpath("//*[@text='Allow']"));
	allow.click();
	
	WebElement allow1
	
	  = driver.findElement(By.xpath("//*[@text='Allow']"));
	allow1.click();
	Thread.sleep(2000);
	;
	
	Thread.sleep(2000);
	WebElement CameraClick
	  = driver.findElement(By.xpath("//CenterButtonGroup[@content-desc=\"NONE\"]"));
	CameraClick.click();

	Thread.sleep(5000);
	
	WebElement UploadOk
	  =driver.findElement(By.xpath("//*[@text='OK']"));
	 UploadOk.click();
	
	
	
	

	

}
@Test(priority = 15)
public void UploadCam() throws InterruptedException, IndexOutOfBoundsException {
	

	
	  Thread.sleep(5000);
	Thread.sleep(2000);
	WebElement Upload
	  = driver.findElement(By.xpath("//*[@text='Upload']"));
	 Upload.click();}

@Test(priority = 16)
public void UploadCamOk() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	WebElement UploadOk
	  =driver.findElement(By.xpath("//*[@text='OK']"));
	 UploadOk.click();

	
	 Thread.sleep(5000);
}
@Test(priority = 17)
public void UploadDocuments1() throws InterruptedException, IndexOutOfBoundsException {
	List<WebElement> AddButton =driver.findElements(By.className(
			"android.widget.TextView"));
	AddButton.get(78).click();
	Thread.sleep(2000);
	WebElement UploadDocuments
	  =driver.findElement(By.xpath("//*[@text='Upload Documents']"));
	  UploadDocuments.click();

	

}
@Test(priority = 18)
public void DocumentsDropDown1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	List<WebElement> DocumentsDropDown = driver.findElements(By.className("android.widget.TextView"));
	DocumentsDropDown.get(2).click();

	

}
@Test(priority = 19)
public void DischargeSummary1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement DischargeSummary
	  = driver.findElement(By.xpath("//*[@text='Discharge Summary']"));
	  DischargeSummary.click();

	

}
@Test(priority = 20)
public void CreatedBy1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement CreatedBy
	  = driver.findElement(By.xpath("//*[@text='Created By']"));
	  CreatedBy.sendKeys("Doc1");

	

}
@Test(priority = 21)
public void DocumentOn1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DocumentOn =  driver.findElements(By.className("android.widget.TextView"));
	DocumentOn.get(4).click();

	

}
@Test(priority = 22)
public void popUpOk1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement popUpOk
	  = driver.findElement(By.xpath("//*[@text='Okay']"));
	  popUpOk.click();

	

}
@Test(priority = 23)
public void Gallery() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Gallary
	  = driver.findElement(By.xpath("//*[@text='Gallery']"));
	  Gallary.click();

}

/*
 * @Test(priority = 24) public void CameraAllow() throws InterruptedException,
 * IndexOutOfBoundsException { Thread.sleep(2000); WebElement CameraAllow =
 * driver.findElement(By.xpath("//*[@text='Allow']")); CameraAllow.click();
 * 
 * 
 * 
 * }
 */
@Test(priority = 25)
public void photo() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(10000);
 driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Screenshot_20230807-103653_Gallery.jpg, 680 kB, 7 Aug\"]")).click();

	

}
@Test(priority = 26)
public void Upload() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Upload
	  = driver.findElement(By.xpath("//*[@text='Upload']"));
	 Upload.click();

	

}
@Test(priority = 27)
public void UploadOk() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement UploadOk
	  =driver.findElement(By.xpath("//*[@text='OK']"));
	 UploadOk.click();

	
}
// @AfterClass public void close() throws IOException {
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
