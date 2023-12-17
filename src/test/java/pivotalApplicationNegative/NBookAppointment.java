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

public class NBookAppointment {
	
	static AppiumDriver driver;
	 public Object MobileElement;
	 
	
	
	

	
@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {
		
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
	dc.setCapability(MobileCapabilityType.APP, "D:\\pivotalapp-20-june.apk");
	URL url = new URL("http://0.0.0.0:4723/");
	dc.setCapability("appPackage","com.calculator_apps");
	dc.setCapability("appActivity","com.calculator_apps.MainActivity");
	
	driver=new AppiumDriver(url,dc);
	
	
	Thread.sleep(5000);
	
}
	
	
		
	@Test(priority=0)	
		public void NumberField() throws MalformedURLException, InterruptedException {	
		WebElement Number = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
		Number.sendKeys("9665002440");}

	
	  @Test(priority=1) public void IAgree() throws MalformedURLException,
	  InterruptedException { WebElement Agree =
			  driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
	  Agree.click(); Thread.sleep(1000);}
	
	  @Test(priority=2) public void proceedButton() throws MalformedURLException,
	  InterruptedException { WebElement proceed = driver.findElement(By.xpath(
	  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"
	  )); proceed.click();
	  Thread.sleep(2000);}
	  @Test(priority=3) public void OTP() throws MalformedURLException,
	  InterruptedException { WebElement otp = driver.findElement(By.xpath(
			  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"
			  )); otp.sendKeys("140520");
	 
	  Thread.sleep(10000);
	  }
	  @Test(priority=4) public void submit() throws MalformedURLException,
	  InterruptedException { WebElement submit = driver.findElement(By.xpath(
			  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView"
			 )); submit.click();
			
			
			  
			  Thread.sleep(2000);
				 List<WebElement> WhatsNewClose =  driver.findElements(By.className("android.widget.TextView"));
				  WhatsNewClose.get(1).click();
				  Thread.sleep(2000);
			  
	  }
@Test(priority=5) public void Search() throws InterruptedException {
		  
		  
	 WebElement myElement1 = driver.findElement(By.xpath(
		  "//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"
		  )); myElement1.click();
		  
		  Thread.sleep(2000);
		  
		  WebElement myElement2 = driver.findElement(By.xpath(
		  "//android.widget.EditText[@content-desc=\"search_bar\"]"));
		  myElement2.sendKeys("pedi39Automation");
		  
		  Thread.sleep(2000); WebElement myElement3=driver.findElement(By.xpath(
		  "//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"
		  )); myElement3.click(); Thread.sleep(2000); 
		  
		  
		  
		  
		  
		  
		  
		  }
		 

	  @Test(priority=6) public void close() throws InterruptedException {
		  Thread.sleep(2000);
		  WebElement myElement4= driver.findElement(By.xpath(
	  "//android.view.ViewGroup[@content-desc=\"search_close\"]" ));
	  myElement4.click();
	  
	  Thread.sleep(2000);
	  
	  }
	  @Test(priority=7) public void Appointment() throws InterruptedException, IndexOutOfBoundsException{
		  Thread.sleep(2000);
		  List<WebElement> els2 = driver.findElements(By.className("android.widget.TextView"));
		  els2.get(7).click();	
		
			//Working code for prescription 
		 // List<io.appium.java_client.MobileElement> els2 = driver.findElements(By.className("android.widget.TextView"));
		 // els2.get(8).click();	
		  
		  Thread.sleep(5000);
		  List<WebElement> BookAp = driver.findElements(By.xpath("//*[@text='Book Appointment']"));
		  BookAp.get(0).click();	
		  
		  Thread.sleep(2000);
		  WebElement Error = driver.findElement(By.xpath(
					"//*[@text='No slot selected']"));
			//submit.click();
			
			
			
			
			String a=Error.getText();
			  System.out.println(a);
			  String Actualmsge="No slot selected";
			  Assert.assertEquals(a, Actualmsge);
		
	  
	  }
		
		  @Test(priority=8) public void SlotTime() throws InterruptedException {
		  Thread.sleep(5000); List<WebElement> els3 =
		  driver.findElements(By.className("android.widget.EditText"));
		  
		  
		  els3.get(2).click();
		  
		  
		  
		  
		  
		  }
		  @Test(priority=9) public void Time() throws InterruptedException {
			  Thread.sleep(2000); List<WebElement> els31 =
			  driver.findElements(By.className("android.widget.TextView"));
			  
			  
			  els31.get(10).click();
			  
			  
			  
			  
			  
			  }
		  @Test(priority=10) public void SlotBook() throws InterruptedException {
			  Thread.sleep(2000); List<WebElement> els41 =
			  driver.findElements(By.className("android.widget.TextView"));
			  
			  
			  els41.get(36).click();
			  
			  
			  
			  
			  
			  }
		  @Test(priority=11) public void Book() throws InterruptedException {
			  Thread.sleep(2000);
			  
					  
					//working code for vdo call checkbox
					  
					  List<WebElement> els51 =driver.findElements(By.className("android.widget.TextView"));
			   els51.get(13).click();
			  
			  
				  //List<io.appium.java_client.MobileElement> els51 =driver.findElements(By.className("android.view.ViewGroup"));
			  // els51.get(6).click();  
			  Thread.sleep(5000);
			  
			  }
		  
		  @Test(priority=12) public void AppointmentBookedPopup() throws InterruptedException {
			  Thread.sleep(2000);
			  
					  
					//working code for vdo call checkbox
					  
					  List<WebElement> els61 =driver.findElements(By.className("android.widget.TextView"));
			   els61.get(2).click();
			  
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
