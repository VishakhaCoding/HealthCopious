package HealthNegative;

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

public class NegativeHealthLogin extends AppiumServerStart{
static AppiumDriver driver;
	
	public Object MobileElement;
//CertificateValid
	
	@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {

	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
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
	public void NumberFieldCase1() throws MalformedURLException, InterruptedException {
		Thread.sleep(2000);
		  List<WebElement> EnglishSelect = driver.findElements(By.className(
		  "android.widget.TextView"
		  )); EnglishSelect.get(10).click();
		 
		
		
		Thread.sleep(10000);
		//highlightElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
		
		WebElement Number = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
		Number.sendKeys("9665002441");
		//highlightElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
		WebElement Agree = driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
		Agree.click();
		Thread.sleep(1000);
		
		List<WebElement> proceed = driver.findElements(By.className(
				"android.widget.TextView"));
		proceed.get(6).click();
		Thread.sleep(5000);
		
		WebElement Error = driver.findElement(By.xpath(
				"//*[@text='This mobile number is not registered with us, Kindly register.']"));
		
		String b=Error.getText();
		  System.out.println(b);
		  String Actualmsge="This mobile number is not registered with us, Kindly register.";
		  Assert.assertEquals(b, Actualmsge);
		  
		  
		  Thread.sleep(1000);
			
			List<WebElement> Backward = driver.findElements(By.className(
					"android.widget.TextView"));
			Backward.get(0).click();
			
			Thread.sleep(5000);
			
			WebElement Exit = driver.findElement(By.xpath(
					"//*[@text='EXIT']"));
			Exit.click();
			
			
			Thread.sleep(5000);
	}


@Test(priority = 1)
public void NumberField() throws MalformedURLException, InterruptedException {
	
	  List<WebElement> EnglishSelect = driver.findElements(By.className(
	  "android.widget.TextView"
	  )); EnglishSelect.get(10).click();
	 
	
	
	Thread.sleep(10000);
	//highlightElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
	
	WebElement Number = driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
	Number.sendKeys("9665002440");
	//highlightElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
}

@Test(priority = 2)
public void IAgree() throws MalformedURLException, InterruptedException {
	WebElement Agree = driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
	Agree.click();
	Thread.sleep(1000);
}

@Test(priority = 3)
public void proceedButton() throws MalformedURLException, InterruptedException {
	List<WebElement> proceed = driver.findElements(By.className(
			"android.widget.TextView"));
	proceed.get(6).click();
	Thread.sleep(5000);
	
	List<WebElement> verify =driver.findElements(By.xpath(
			"//*[@text='Verify and Proceed']"));
	verify.get(0).click();


	
	  Thread.sleep(2000);
	  
	  List<WebElement> ok =driver.findElements(By.xpath(
				"//*[@text='OK']"));
	  ok.get(0).click();
	  
	  Thread.sleep(5000);
}
@Test(priority = 4)
public void OTPCase1() throws MalformedURLException, InterruptedException {
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
			"//*[@text='1']"));
	otp6.get(1).click();

	Thread.sleep(5000);
}

@Test(priority = 5)
public void Verify1() throws MalformedURLException, InterruptedException {
	List<WebElement> verify =driver.findElements(By.xpath(
			"//*[@text='Verify and Proceed']"));
	verify.get(0).click();


	
	  Thread.sleep(2000);
	  
	  List<WebElement> ok =driver.findElements(By.xpath(
				"//*[@text='OK']"));
	  ok.get(0).click();
	  
	  Thread.sleep(2000);


}
@Test(priority = 6)
public void OTPCase2() throws MalformedURLException, InterruptedException {
	/*
	 * List<WebElement> otp1 =driver.findElements(By.className(
	 * "android.widget.TextView")); otp1.get(7).click();
	 * 
	 * Thread.sleep(1000);
	 * 
	 * List<WebElement> otp2 =driver.findElements(By.xpath( "//*[@text='4']"));
	 * otp2.get(0).click();
	 * 
	 * 
	 * Thread.sleep(1000);
	 * 
	 * List<WebElement> otp3 =driver.findElements(By.xpath( "//*[@text='0']"));
	 * otp3.get(1).click();
	 * 
	 * 
	 * Thread.sleep(1000);
	 * 
	 * List<WebElement> otp4 =driver.findElements(By.xpath( "//*[@text='5']"));
	 * otp4.get(0).click();
	 */

	/*
	 * Thread.sleep(1000);
	 * 
	 * List<WebElement> otp5 =driver.findElements(By.xpath( "//*[@text='2']"));
	 * otp5.get(0).click();
	 * 
	 * 
	 * Thread.sleep(1000);
	 */
	
	List<WebElement> otpclear6 =driver.findElements(By.className(
			"android.widget.TextView"));
	otpclear6.get(24).click();

	Thread.sleep(5000);
}

@Test(priority = 7)
public void Verify2() throws MalformedURLException, InterruptedException {
	List<WebElement> verify =driver.findElements(By.xpath(
			"//*[@text='Verify and Proceed']"));
	verify.get(0).click();


	
	  Thread.sleep(2000);
	  
	  List<WebElement> ok =driver.findElements(By.xpath(
				"//*[@text='OK']"));
	  ok.get(0).click();
	  Thread.sleep(40000);
	  
	  List<WebElement> ResendOtp =driver.findElements(By.xpath(
				"//*[@text='Did not receive OTP?  Resend OTP']"));
	  ResendOtp.get(0).click();
	  
	  List<WebElement> proceed = driver.findElements(By.className(
				"android.widget.TextView"));
		proceed.get(6).click();
		Thread.sleep(1000);
		
		WebElement Error = driver.findElement(By.xpath(
				"//*[@text='New OTP sent']"));
		
		String c=Error.getText();
		  System.out.println(c);
		  String Actualmsge="New OTP sent";
		  Assert.assertEquals(c, Actualmsge);
		  
		  
		  Thread.sleep(1000);


}
@Test(priority = 8)
public void OTP() throws MalformedURLException, InterruptedException {
	/*
	 * List<WebElement> otp1 =driver.findElements(By.className(
	 * "android.widget.TextView")); otp1.get(7).click();
	 * 
	 * Thread.sleep(1000);
	 * 
	 * List<WebElement> otp2 =driver.findElements(By.xpath( "//*[@text='4']"));
	 * otp2.get(0).click();
	 * 
	 * 
	 * Thread.sleep(1000);
	 * 
	 * List<WebElement> otp3 =driver.findElements(By.xpath( "//*[@text='0']"));
	 * otp3.get(1).click();
	 * 
	 * 
	 * Thread.sleep(1000);
	 * 
	 * List<WebElement> otp4 =driver.findElements(By.xpath( "//*[@text='5']"));
	 * otp4.get(0).click();
	 * 
	 * Thread.sleep(1000);
	 * 
	 * List<WebElement> otp5 =driver.findElements(By.xpath( "//*[@text='2']"));
	 * otp5.get(0).click();
	 * 
	 */
	Thread.sleep(1000);
	
	List<WebElement> otp6 =driver.findElements(By.xpath(
			"//*[@text='0']"));
	otp6.get(2).click();

	Thread.sleep(5000);
}

@Test(priority = 9)
public void Verify() throws MalformedURLException, InterruptedException {
	List<WebElement> verify =driver.findElements(By.xpath(
			"//*[@text='Verify and Proceed']"));
	verify.get(0).click();


	
	  Thread.sleep(2000);
	  
	 
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
