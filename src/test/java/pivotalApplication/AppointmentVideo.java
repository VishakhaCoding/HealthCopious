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

	import io.appium.java_client.remote.MobileCapabilityType;

	public class AppointmentVideo extends AppiumServerStart {
		static AppiumDriver driver;
		public Object MobileElement;

		@BeforeClass
		public void setup1() throws MalformedURLException, InterruptedException {

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

			WebElement SerachIcon = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
			SerachIcon.click();

			Thread.sleep(2000);

			WebElement SearchBar = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_bar\"]"));
			SearchBar.sendKeys("Pivotal29Aug");

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
		public void Appointment() throws InterruptedException, IndexOutOfBoundsException {
			Thread.sleep(2000);
			List<WebElement> Appointment = driver.findElements(By.className("android.widget.TextView"));
			Appointment.get(7).click();
			Appointment.get(7).click();
			Thread.sleep(10000);
			
		}

		
		  @Test(priority=8) public void SlotTime() throws InterruptedException {
		  Thread.sleep(10000); List<WebElement> SlotTime =
		  driver.findElements(By.xpath("//android.widget.EditText[@text=\"From\"]"));
		  
		  
		  SlotTime.get(0).click();
		  
		  
		  
		  
		  
		  }
		  
		  @Test(priority=9) public void EveningTime() throws InterruptedException {
		  Thread.sleep(20000); List<WebElement> Time =
		  driver.findElements(By.xpath("//android.widget.ImageView"));
		  
		  
		  Time.get(0).click();
		  
		  
		  
		  
		  
		  }
		  
		  @Test(priority=10) public void SlotBook() throws InterruptedException {
		  Thread.sleep(10000); List<WebElement>  SlotBook =
		  driver.findElements(By.xpath("//*[@text='02:20 pm']"));
		  
		  
		  //SlotBook.get(36).click();//11;40
		  SlotBook.get(0).click(); //11:10
		  
		  
		  
		  
		  }
		 
		@Test(priority = 11)
		public void VideoCheckBox() throws InterruptedException {
			Thread.sleep(10000);
			

			List<WebElement> VideoCheckBox = driver.findElements(By.className("android.widget.TextView"));
			VideoCheckBox.get(11).click();

		}

		@Test(priority = 12)
		public void Book() throws InterruptedException {
			Thread.sleep(5000);

			 WebElement BookAP = driver.findElement(By.xpath("//*[@text='Book Appointment']"));
			 BookAP.click();
			Thread.sleep(5000);

		}

		@Test(priority = 13)
		public void AppointmentBookedPopup() throws InterruptedException {
			Thread.sleep(30000);

			

			List<WebElement> AppointmentBookedPopup = driver.findElements(By.className("android.widget.TextView"));
			AppointmentBookedPopup.get(2).click();

			Thread.sleep(5000);

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



