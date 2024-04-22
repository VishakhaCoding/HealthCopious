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

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pivotalApplication.AppiumServerStart;

public class NReceipt extends AppiumServerStart{
	private AppiumDriver driver;
	//public Object MobileElement;
		//AndroidDriver driver;

		@BeforeClass
		public void setup1() throws InterruptedException, MalformedURLException {

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
			// AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc); //Create driver object
			driver = new AppiumDriver(url, dc);

			Thread.sleep(5000);

		}

		@Test(priority = 0)
		public void NumberField() throws MalformedURLException, InterruptedException {
			WebElement Number =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
			/*
			 * WebElement Number = driver.findElementByXPath(
			 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"
			 * ); Number.sendKeys("9665002440");
			 */
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

			Thread.sleep(10000);
			 List<WebElement> WhatsNewClose =  driver.findElements(By.className("android.widget.TextView"));
			  WhatsNewClose.get(1).click();
			  Thread.sleep(2000);
		}

		@Test(priority = 5)
		public void Search() throws InterruptedException {

			WebElement SearchIcon = 
					driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
			SearchIcon.click();

			Thread.sleep(2000);

			WebElement SearchBar = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_bar\"]"));
			SearchBar.sendKeys("Pivotal");

			Thread.sleep(2000);
			WebElement SearchIcon1 = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
			SearchIcon1.click();
			Thread.sleep(5000);
		}

		@Test(priority = 6)
		public void ClickPatient() throws InterruptedException, IndexOutOfBoundsException {
			Thread.sleep(2000);
			List<WebElement> Clickpatient = driver
					.findElements(By.className("android.widget.TextView"));
			Clickpatient.get(5).click();
			Clickpatient.get(5).click();

			System.out.println("Before scrolling ....");
			//try {
//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView(new UiSelector().text(\"Link Patient to Doctor")).click();
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Link Patient to Doctor\").instance(0))"));
				Thread.sleep(10000);
	}
		@Test(priority = 7)
		public void Reciept() throws InterruptedException, IndexOutOfBoundsException {
			Thread.sleep(2000);
			List<WebElement> Reciept =  driver.findElements(By.xpath("//*[@text='Receipt']"));
			
			Reciept.get(1).click();
			
			Thread.sleep(5000);
		}
		@Test(priority = 8)
		public void AddNewReceipt() throws InterruptedException, IndexOutOfBoundsException {
			Thread.sleep(5000);
			WebElement AddNewReceipt =  driver.findElement(By.xpath("//*[@text='Add New Receipt']"));
			
			AddNewReceipt.click();
			
			Thread.sleep(5000);
			
			
			WebElement Preview =  driver.findElement(By.xpath("//*[@text='Preview']"));
			
			Preview.click();
			
			Thread.sleep(2000);
			WebElement Error = driver.findElement(By.xpath(
					"//*[@text='Please enter amount']"));
			//submit.click();
			
			
			
			
			String b=Error.getText();
			  System.out.println(b);
			  String Actualmsge="Please enter amount";
			  Assert.assertEquals(b, Actualmsge);
		}
		@Test(priority = 9)
		public void ReceiptNo() throws InterruptedException, IndexOutOfBoundsException {
			Thread.sleep(5000);
			List<WebElement> ReceiptNo =  driver.findElements(By.xpath("//*[@text='Enter receipt no. ']"));
			
			ReceiptNo.get(0).sendKeys("123456");
			
			Thread.sleep(2000);
		}
		@Test(priority = 10)
		public void Consultation() throws InterruptedException, IndexOutOfBoundsException {
			Thread.sleep(2000);
			List<WebElement> Consultation =  driver.findElements(By.className("android.widget.EditText"));
			
			Consultation.get(1).sendKeys("123.5");
			
			Thread.sleep(2000);
		}

		
		  @Test(priority = 11) public void Vaccination() throws InterruptedException,
		  IndexOutOfBoundsException { Thread.sleep(2000); List<WebElement> Vaccination
		  = driver.findElements(By.className("android.widget.EditText"));
		  
		  Vaccination.get(3).sendKeys("100.5");
		  
		  Thread.sleep(2000); }
		  
		  @Test(priority = 12) public void OtherReasons() throws InterruptedException,
		  IndexOutOfBoundsException { Thread.sleep(2000); List<WebElement> OtherReasons
		  = driver.findElements(By.className("android.widget.EditText"));
		  
		  OtherReasons.get(8).sendKeys("100.5");
		  
		  Thread.sleep(2000); }
		  
		  @Test(priority = 13) public void Addmore() throws InterruptedException,
		  IndexOutOfBoundsException { Thread.sleep(2000); WebElement Addmore =
		  driver.findElement(By.xpath("//*[@text='Add More']"));
		  
		  Addmore.click();
		  
		  Thread.sleep(2000); }
		  
		/*
		 * @Test(priority = 14) public void OtherReasons1() throws InterruptedException,
		 * IndexOutOfBoundsException { Thread.sleep(5000); List<WebElement>
		 * OtherReasons1 = driver.findElements(By.className("android.widget.EditText"));
		 * 
		 * OtherReasons1.get(10).sendKeys("100.5");
		 * 
		 * Thread.sleep(2000); }
		 */
		 
			@Test(priority = 15)
			public void Preview() throws InterruptedException, IndexOutOfBoundsException {
				//Thread.sleep(5000);
				WebElement Preview =  driver.findElement(By.xpath("//*[@text='Preview']"));
				
				Preview.click();
				
				Thread.sleep(35000);
			}
			
			  @Test(priority = 16) public void PayerName() throws InterruptedException,
			  IndexOutOfBoundsException { Thread.sleep(2000); List<WebElement> PayerName =
			  driver.findElements(By.className("android.widget.EditText"));
			  
			  PayerName.get(0).sendKeys("abc");
			  
			  }
			  @Test(priority = 17)
				public void CreateReceipt() throws InterruptedException, IndexOutOfBoundsException {
					Thread.sleep(1000);
					List<WebElement> CreateReceipt =  driver.findElements(By.xpath("//*[@text='Create Receipt']"));
					
					CreateReceipt.get(1).click();
					
					Thread.sleep(50000);
					List<WebElement> Download=driver.findElements(By.className("android.widget.TextView"));
					  
					Download.get(1).click();
					
					
					//WebElement Download =  driver.findElement(By.xpath("//*[@text='Download']"));
					//Download.click();
					
				}
				/*
				 * @Test(priority = 18) public void Download() throws InterruptedException,
				 * IndexOutOfBoundsException { //Thread.sleep(30000); WebElement Download =
				 * driver.findElement(By.xpath("//*[@text='Download']"));
				 * 
				 * Download.click();
				 * 
				 * Thread.sleep(20000);
				 * 
				 * 
				 * }
				 */
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
