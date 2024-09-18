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

public class NLogin extends AppiumServerStart{
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
	//dc.setCapability("orientation", "LANDSCAPE");
	// AndroidDriver driver = new AndroidDriver(new
	// URL("http://127.0.0.1:4723/wd/hub"), dc); //Create driver object
	driver = new AppiumDriver(url, dc);

	Thread.sleep(5000);
	//dc.setCapability("orientation", "LANDSCAPE");
}

/*
 * @Test(priority = 0) public void Case1EmptyNumberField() throws
 * MalformedURLException, InterruptedException { DesiredCapabilities dc = new
 * DesiredCapabilities(); dc.setCapability("deviceorientation", "LANDSCAPE");
 * 
 * WebElement Number = driver.findElement(By.xpath(
 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"
 * )); Number.sendKeys(""); }
 */
	@Test(priority = 1)
	public void Case2RandomNUmber() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceorientation", "LANDSCAPE");
		Thread.sleep(5000);
		WebElement Number = driver.findElement(By.xpath(
				"//*[@text='Mobile Number']"));
		Number.sendKeys("9662440000");
		
		Thread.sleep(1000);
		WebElement Agree = driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
		Agree.click();
		Thread.sleep(1000);
		
		
		WebElement proceed = driver.findElement(By.xpath(
				"//android.widget.TextView[@text=\"\"]"));
		proceed.click();
		
		Thread.sleep(2000);
		WebElement Error = driver.findElement(By.xpath(
				"//*[@text='Doctor not signed up, please sign up']"));
		//submit.click();
		
		
		
		
		String b=Error.getText();
		  System.out.println(b);
		  String Actualmsge="Doctor not signed up, please sign up";
		  Assert.assertEquals(b, Actualmsge);
	}

	
	  @Test(priority = 2) public void Case3NumberLessThanTen() throws
	  MalformedURLException, InterruptedException { DesiredCapabilities dc = new
	  DesiredCapabilities(); dc.setCapability("deviceorientation", "LANDSCAPE");
	  
	  List<WebElement> Backward = driver.findElements(By.className(
			  "android.widget.TextView"
			  )); Backward.get(0).click();
	  
	  Thread.sleep(5000);
	  List<WebElement> Number1 = driver.findElements(By.className(
			  "android.widget.EditText"
			  )); Number1.get(0).clear();
			  
			  Thread.sleep(1000);
	  List<WebElement> Number = driver.findElements(By.className(
	  "android.widget.EditText"
	  )); Number.get(0).sendKeys("966500244");
	  
	  
	  
		Thread.sleep(5000);
		/*
		 * WebElement Agree =
		 * driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
		 * Agree.click(); Thread.sleep(1000);
		 */
		
		
		WebElement proceed = driver.findElement(By.xpath(
				"//android.widget.TextView[@text=\"\"]"));
		proceed.click();
	  
		Thread.sleep(2000);
		WebElement Error = driver.findElement(By.xpath(
				"//*[@text='Doctor not signed up, please sign up']"));
		//submit.click();
		
		
		
		
		String c=Error.getText();
		  System.out.println(c);
		  String Actualmsge="Doctor not signed up, please sign up";
		  Assert.assertEquals(c, Actualmsge);
	  
	  
	  }
	
@Test(priority = 4)
public void NumberField() throws MalformedURLException, InterruptedException {
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability("deviceorientation", "LANDSCAPE");
	
	  List<WebElement> Backward = driver.findElements(By.className(
			  "android.widget.TextView"
			  )); Backward.get(0).click();
			  Thread.sleep(5000);
			  List<WebElement> Number1 = driver.findElements(By.xpath(
						"//android.widget.EditText"));
				Number1.get(0).clear();
				System.out.println("number1 working");
			  Thread.sleep(1000);
	List<WebElement> Number = driver.findElements(By.xpath(
			"//android.widget.EditText"));
	Number.get(0).sendKeys("9665002440");
	
	System.out.println("number working");
}

/*
 * @Test(priority = 5) public void IAgree() throws MalformedURLException,
 * InterruptedException { WebElement Agree =
 * driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
 * Agree.click(); Thread.sleep(1000); }
 */

@Test(priority = 6)
public void proceedButton() throws MalformedURLException, InterruptedException {
	WebElement proceed = driver.findElement(By.xpath(
			"//android.widget.TextView[@text=\"\"]"));
	proceed.click();
	Thread.sleep(2000);
}

@Test(priority = 7)
public void OTP() throws MalformedURLException, InterruptedException {
	List<WebElement> otp = driver.findElements(By.xpath(
			"//*[@text='Enter OTP']"));
	otp.get(1).sendKeys("140521");

	Thread.sleep(10000);
}

@Test(priority = 8)
public void submit() throws MalformedURLException, InterruptedException {
	WebElement submit = driver.findElement(By.xpath(
			"//*[@text='Submit']"));
	submit.click();
	Thread.sleep(5000);
	
	WebElement Error = driver.findElement(By.xpath(
			"//*[@text=' Invalid OTP, Please enter Correct OTP']"));
	//submit.click();
	
	
	
	
	String a=Error.getText();
	  System.out.println(a);
	  String Actualmsge=" Invalid OTP, Please enter Correct OTP";
	  Assert.assertEquals(a, Actualmsge);
	  
	  Thread.sleep(40000);
	  
	  WebElement otp = driver.findElement(By.xpath(
				"//*[@text='Enter OTP']"));
		otp.clear();
		 Thread.sleep(25000);
}
@Test(priority = 9)
public void ResendOTP() throws MalformedURLException, InterruptedException {
	
	
	WebElement ResendOTP = driver.findElement(By.xpath(
			"//*[@text='Resend OTP']"));
	ResendOTP.click();
	
	Thread.sleep(5000);
	
	WebElement otp = driver.findElement(By.className(
			"android.widget.EditText"));
	otp.clear();
	Thread.sleep(2000);
	otp.sendKeys("140520");
	Thread.sleep(2000);
	WebElement submit = driver.findElement(By.xpath(
			"//*[@text='Submit']"));
	submit.click();
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


