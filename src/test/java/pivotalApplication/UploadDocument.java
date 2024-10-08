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

public class UploadDocument extends AppiumServerStart{
	
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

		WebElement SearchIcon = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
		SearchIcon.click();

		Thread.sleep(2000);

		WebElement SearchBar = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_bar\"]"));
		SearchBar.sendKeys("Pivotal16Aug");

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
		Clickpatient.get(5).click();
		Clickpatient.get(5).click();

		

	}
	@Test(priority = 8)
	public void UploadDocuments() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(20000);
		WebElement UploadDocuments
		  =driver.findElement(By.xpath("//*[@text='Upload Documents']"));
		  UploadDocuments.click();

		

	}
	@Test(priority = 9)
	public void DocumentsDropDown() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(10000);
		List<WebElement> DocumentsDropDown = driver.findElements(By.xpath("//android.widget.TextView[@text=\"\"]"));
		DocumentsDropDown.get(0).click();

		

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
		  CreatedBy.sendKeys("DisSum");

		

	}
	@Test(priority = 12)
	public void DocumentOn() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> DocumentOn =  driver.findElements(By.className("android.widget.TextView"));
		DocumentOn.get(5).click();

		

	}
	@Test(priority = 13)
	public void popUpOk() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(7000);
		WebElement popUpOk
		  = driver.findElement(By.xpath("//*[@text='Ok']"));
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
		
		  = driver.findElement(By.xpath("//*[@text='While using the app']"));
		allow.click();
		
		/*
		 * WebElement allow1
		 * 
		 * = driver.findElement(By.xpath("//*[@text='Allow']")); allow1.click();
		 * Thread.sleep(2000); ;
		 */
		
		Thread.sleep(2000);
		WebElement CameraClick
		  = driver.findElement(By.xpath("//android.view.View[@resource-id=\"com.sec.android.app.camera:id/bottom_background\"]"));
		CameraClick.click();

		Thread.sleep(10000);
		
		WebElement UploadOk
		  =driver.findElement(By.xpath("//*[@text='OK']"));
		 UploadOk.click();
		
		
		
		

		

	}
	@Test(priority = 15)
	public void UploadCam() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Upload
		  = driver.findElement(By.xpath("//*[@text='Upload']"));
		 Upload.click();}
	
	@Test(priority = 16)
	public void UploadCamOk() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(10000);
		WebElement UploadOk
		  =driver.findElement(By.xpath("//*[@text='OK']"));
		 UploadOk.click();

		

	}
	@Test(priority = 17)
	public void UploadDocuments1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement UploadDocuments
		  =driver.findElement(By.xpath("//*[@text='Upload Documents']"));
		  UploadDocuments.click();

		

	}
	@Test(priority = 18)
	public void DocumentsDropDown1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		List<WebElement> DocumentsDropDown = driver.findElements(By.xpath("//android.widget.TextView[@text=\"\"]"));
		DocumentsDropDown.get(0).click();

		

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
		  CreatedBy.sendKeys("DisSum");

		

	}
	@Test(priority = 21)
	public void DocumentOn1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> DocumentOn =  driver.findElements(By.className("android.widget.TextView"));
		DocumentOn.get(5).click();

		

	}
	@Test(priority = 22)
	public void popUpOk1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(10000);
		WebElement popUpOk
		  = driver.findElement(By.xpath("//*[@text='Ok']"));
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
	 driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.google.android.documentsui:id/icon_thumb\"])[1]")).click();

		

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
		Thread.sleep(10000);
		WebElement UploadOk
		  =driver.findElement(By.xpath("//*[@text='OK']"));
		 UploadOk.click();

		
	}
	@Test(priority = 28)
	public void UploadDocuments2() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement UploadDocuments2
		  =driver.findElement(By.xpath("//*[@text='Upload Documents']"));
		UploadDocuments2.click();

		

	}
	@Test(priority = 29)
	public void DocumentsDropDown2() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		List<WebElement> DocumentsDropDown2 = driver.findElements(By.xpath("//android.widget.TextView[@text=\"\"]"));
		DocumentsDropDown2.get(0).click();

		

	}
	@Test(priority = 30)
	public void LabReport2() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement LabReport2
		  = driver.findElement(By.xpath("//*[@text='Lab Report']"));
		LabReport2.click();

		

	}
	@Test(priority = 31)
	public void CreatedBy2() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement CreatedBy2
		  = driver.findElement(By.xpath("//*[@text='Created By']"));
		CreatedBy2.sendKeys("DisSum");

		

	}
	@Test(priority = 32)
	public void DocumentOn2() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> DocumentOn2 =  driver.findElements(By.className("android.widget.TextView"));
		DocumentOn2.get(5).click();

		

	}
	@Test(priority = 33)
	public void popUpOk2() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(10000);
		WebElement popUpOk2
		  = driver.findElement(By.xpath("//*[@text='Ok']"));
		popUpOk2.click();

		

	}
	@Test(priority = 34)
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
	@Test(priority = 35)
	public void docPdf() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(10000);
		List<WebElement> docPdf=driver.findElements(By.className("android.widget.TextView"));
		docPdf.get(11).click();

		

	}
	@Test(priority = 36)
	public void Upload1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Upload
		  = driver.findElement(By.xpath("//*[@text='Upload']"));
		 Upload.click();

		

	}
	@Test(priority = 37)
	public void UploadOk1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(10000);
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

	


