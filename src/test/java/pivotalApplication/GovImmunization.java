package pivotalApplication;

import static org.testng.Assert.assertEquals;

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

public class GovImmunization {
	AppiumDriver driver;
	public Object MobileElement;
	public static String mobileNumber = "//android.widget.TextView[@text='Cancel']";

	@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
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

		Thread.sleep(2000);
		 List<WebElement> WhatsNewClose =  driver.findElements(By.className("android.widget.TextView"));
		  WhatsNewClose.get(1).click();
		  Thread.sleep(2000);

	}

	@Test(priority = 5)
	public void Search() throws InterruptedException {

		WebElement SearchIcon = driver.findElement(
				By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
		SearchIcon.click();

		Thread.sleep(2000);

		WebElement SearchBar = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_bar\"]"));
		SearchBar.sendKeys("check1                                                                                                                                                                                                                                                                      ");

		Thread.sleep(2000);
		WebElement SearchIcon1 = driver.findElement(
				By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
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
		List<WebElement> Clickpatient = driver.findElements(By.className("android.widget.TextView"));
		Clickpatient.get(5).click();

	}

	@Test(priority = 8)
	public void ImmunizationGovClick() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement ImmunizationGovClick = driver.findElement(By.xpath("//*[@text='Immunization - Govt']"));
		ImmunizationGovClick.click();

	}
	
	  @Test(priority = 10) public void BulkCancel() throws InterruptedException,
				IndexOutOfBoundsException {
			Thread.sleep(5000);/*
								 * WebElement BulkCancel = driver.findElement(By.xpath("//*[@text='Cancel']"));
								 * BulkCancel.click();
								 */
	  
			String bname1 = driver.findElement(By.xpath("//*[@text='Cancel']")).getText();
			System.out.println(bname1);
			  Assert.assertEquals(bname1,"Cancel");	
			  //System.out.println(bname1);
String x="Cancel";
	  if(bname1.equals(x))	{  
	/* // WebElement BulkCancel =
	  driver.findElement(By.xpath("//*[@text='Cancel']")); 
		  mobileNumber.click();}else {
		  WebElement opvO = driver.findElement(By.xpath("//*[@text='OPV-0']"));
			opvO.click();
	  }*/
	  
		
	  // WebElement BulkCancel =
	  driver.findElement(By.xpath("//*[@text='Cancel']")).click();}
	  
	  else if (!bname1.equals(x)){
		  System.out.println("Cancel not found");
	  }
	  }
	 
	 


		
		  @Test(priority = 11) public void opvO() throws InterruptedException,
		  IndexOutOfBoundsException { Thread.sleep(2000); WebElement opvO =
		  driver.findElement(By.xpath("//*[@text='OPV-0']")); opvO.click();
		  
		  }
		 
	@Test(priority = 12)
	public void SaveVaccine() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement SaveVaccine = driver.findElement(By.xpath("//*[@text='SAVE VACCINE']"));
		SaveVaccine.click();

	}
	@Test(priority = 13)
	public void IPV1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement IPV1 = driver.findElement(By.xpath("//*[@text='IPV-1']"));
		IPV1.click();

	}
	@Test(priority = 14)
	public void SaveVaccine1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement SaveVaccine = driver.findElement(By.xpath("//*[@text='SAVE VACCINE']"));
		SaveVaccine.click();

	}
	@Test(priority = 15)
	public void HepB() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement HepB = driver.findElement(By.xpath("//*[@text='Hep-B']"));
		HepB.click();

	}
	@Test(priority = 16)
	public void SaveVaccine2() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement SaveVaccine = driver.findElement(By.xpath("//*[@text='SAVE VACCINE']"));
		SaveVaccine.click();

	}
	@Test(priority = 17)
	public void Transscript() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Transscript = driver.findElement(By.xpath("//*[@text='+Transcript']"));
		Transscript.click();

	}
	@Test(priority = 18)
	public void CreatedBy() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement CreatedBy
		  = driver.findElement(By.xpath("//*[@text='Created By']"));
		  CreatedBy.sendKeys("GovVcc");

		

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
		WebElement Transscript = driver.findElement(By.xpath("//*[@text='+Transcript']"));
		Transscript.click();

	}
	@Test(priority = 25)
	public void CreatedBy1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement CreatedBy
		  = driver.findElement(By.xpath("//*[@text='Created By']"));
		  CreatedBy.sendKeys("GovVcc");

		

	}
	@Test(priority = 26)
	public void DocumentOn1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> DocumentOn =  driver.findElements(By.className("android.widget.TextView"));
		DocumentOn.get(5).click();

		

	}
	@Test(priority = 27)
	public void popUpOk1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement popUpOk
		  = driver.findElement(By.xpath("//*[@text='Ok']"));
		  popUpOk.click();

		

	}
	@Test(priority = 28)
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
	@Test(priority = 29)
	public void photo() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(10000);
	 driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Screenshot_20230921-114316_Gallery.jpg, 704 kB, 21 Sep\"]")).click();

		

	}
	@Test(priority = 30)
	public void Upload() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Upload
		  = driver.findElement(By.xpath("//*[@text='Upload']"));
		 Upload.click();

		

	}
	@Test(priority = 31)
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
