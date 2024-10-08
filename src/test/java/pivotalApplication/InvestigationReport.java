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
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InvestigationReport extends AppiumServerStart{
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
				"//*[@text='Mobile Number']"));
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
				"//android.widget.TextView[@text=\"\"]"));
		proceed.click();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void OTP() throws MalformedURLException, InterruptedException {
		List<WebElement> otp =  driver.findElements(By.xpath(
				"//*[@text='Enter OTP']"));
		otp.get(1).sendKeys("140520");
		
		
		
	//	List<WebElement >otp = driver.findElements(By.xpath("//*[@text='Enter OTP']"));
		//otp.get(0).sendKeys("140520");

		Thread.sleep(10000);
	}

	@Test(priority = 4)
	public void submit() throws MalformedURLException, InterruptedException {
		
		
		
		WebElement submit = driver.findElement(By.xpath(
				"//*[@text='Submit']"));
		submit.click();
		Thread.sleep(5000);
		List<WebElement> WhatsNewClose = driver.findElements(By.className("android.widget.TextView"));
		WhatsNewClose.get(1).click();
		Thread.sleep(2000);

	}
@Test(priority = 5)
public void Search() throws InterruptedException {

	WebElement SearchIcon =  driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
	SearchIcon.click();

	Thread.sleep(2000);

	WebElement SearchBar =  driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_bar\"]"));
	SearchBar.sendKeys("Pivotal16Aug");

	Thread.sleep(2000);
	WebElement SearchIcon1 =  driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
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
	Clickpatient.get(5).click();
	Clickpatient.get(5).click();
	

}
@Test(priority = 8)
public void InvestigationClick() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(10000);
	WebElement InvestigationClick
	  =  driver.findElement(By.xpath("//*[@text='Investigations']"));
	  InvestigationClick.click();

	

}
@Test(priority = 9)
public void ReportClick() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(15000);
	WebElement ReportClick
	  =  driver.findElement(By.xpath("//*[@text='Report']"));
	ReportClick.click();

	

}
@Test(priority = 10)
public void UploadReport() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement UploadReport
	  =  driver.findElement(By.xpath("//*[@text='Upload Report']"));
	UploadReport.click();

	

}
@Test(priority = 18)
public void CreatedBy() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement CreatedBy
	  = driver.findElement(By.xpath("//*[@text='Created By']"));
	  CreatedBy.sendKeys("Investigation");

	

}
@Test(priority = 19)
public void DocumentOn() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DocumentOn =  driver.findElements(By.className("android.widget.TextView"));
	DocumentOn.get(5).click();

	

}
@Test(priority = 20)
public void popUpOk() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement popUpOk
	  = driver.findElement(By.xpath("//*[@text='Ok']"));
	  popUpOk.click();

	

}
@Test(priority = 21)
public void Camera() throws InterruptedException, IndexOutOfBoundsException {
	
	Thread.sleep(5000);
	WebElement Camera
	
	  = driver.findElement(By.xpath("//*[@text='Camera']"));
	Camera.click();
	Thread.sleep(2000);
	WebElement allow
	
	  = driver.findElement(By.xpath("//*[@text='While using the app']"));
	allow.click();
	
	/*
	 * WebElement allow1
	 * 
	 * = driver.findElement(By.xpath("//*[@text='Allow']")); allow1.click();
	 */
	Thread.sleep(2000);
	;
	
	Thread.sleep(2000);
	WebElement CameraClick
	  = driver.findElement(By.xpath("//android.view.View[@resource-id=\"com.sec.android.app.camera:id/bottom_background\"]"));
	CameraClick.click();

	Thread.sleep(5000);
	
	WebElement UploadOk
	  =driver.findElement(By.xpath("//*[@text='OK']"));
	 UploadOk.click();
	
	
	
	

	

}
@Test(priority = 22)
public void UploadCam() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Upload
	  = driver.findElement(By.xpath("//*[@text='Upload']"));
	 Upload.click();}

@Test(priority = 23)
public void UploadCamOk() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement UploadOk
	  =driver.findElement(By.xpath("//*[@text='OK']"));
	 UploadOk.click();

	

}
@Test(priority = 24)
public void Transscript1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Transscript = driver.findElement(By.xpath("//*[@text='Upload Report']"));
	Transscript.click();

}
@Test(priority = 25)
public void DocumentsDropDown() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	List<WebElement> DocumentsDropDown = driver.findElements(By.className("android.widget.TextView"));
	DocumentsDropDown.get(2).click();

	

}
@Ignore
@Test(priority = 26)
public void LabReport() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement LabReport
	  = driver.findElement(By.xpath("//*[@text='Lab Report']"));
	LabReport.click();

	

}
@Test(priority = 27)
public void CreatedBy1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement CreatedBy
	  = driver.findElement(By.xpath("//*[@text='Created By']"));
	  CreatedBy.sendKeys("Investigation");

	

}
@Test(priority = 28)
public void DocumentOn1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DocumentOn =  driver.findElements(By.className("android.widget.TextView"));
	DocumentOn.get(5).click();

	

}
@Test(priority = 29)
public void popUpOk1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement popUpOk
	  = driver.findElement(By.xpath("//*[@text='Ok']"));
	  popUpOk.click();

	

}
@Test(priority = 30)
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
@Test(priority = 31)
public void photo() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(10000);
 driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.google.android.documentsui:id/icon_thumb\"]")).click();

	

}
@Test(priority = 32)
public void Upload() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Upload
	  = driver.findElement(By.xpath("//*[@text='Upload']"));
	 Upload.click();

	

}
@Test(priority = 33)
public void UploadOk() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement UploadOk
	  =driver.findElement(By.xpath("//*[@text='OK']"));
	 UploadOk.click();

	
}
@Test(priority = 34)
public void Transscript2() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Transscript = driver.findElement(By.xpath("//*[@text='Upload Report']"));
	Transscript.click();

}
@Test(priority = 35)
public void DocumentsDropDown1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(5000);
	List<WebElement> DocumentsDropDown = driver.findElements(By.className("android.widget.TextView"));
	DocumentsDropDown.get(2).click();

	

}
@Ignore
@Test(priority = 36)
public void LabReport1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement LabReport
	  = driver.findElement(By.xpath("//*[@text='Lab Report']"));
	LabReport.click();

	

}
@Test(priority = 37)
public void CreatedBy2() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement CreatedBy
	  = driver.findElement(By.xpath("//*[@text='Created By']"));
	  CreatedBy.sendKeys("Investigation");

	

}
@Test(priority = 38)
public void DocumentOn2() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> DocumentOn =  driver.findElements(By.className("android.widget.TextView"));
	DocumentOn.get(5).click();

	

}
@Test(priority = 39)
public void popUpOk2() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement popUpOk
	  = driver.findElement(By.xpath("//*[@text='Ok']"));
	  popUpOk.click();

	

}
@Test(priority = 40)
public void Files() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Files
	  = driver.findElement(By.xpath("//*[@text='Files']"));
	Files.click();

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
@Test(priority = 41)
public void DocPdf() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(10000);
	List<WebElement> docPdf=driver.findElements(By.className("android.widget.TextView"));
	docPdf.get(11).click();
	

}
@Test(priority = 42)
public void Upload1() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	WebElement Upload
	  = driver.findElement(By.xpath("//*[@text='Upload']"));
	 Upload.click();

	

}
@Test(priority = 43)
public void UploadOk1() throws InterruptedException, IndexOutOfBoundsException {
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
