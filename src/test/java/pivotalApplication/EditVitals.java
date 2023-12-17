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
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class EditVitals {
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
	

	  @Test(priority = 5)
	  public void Search() throws InterruptedException {

	  	WebElement myElement1 =  driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
	  	myElement1.click();

	  	Thread.sleep(2000);

	  	WebElement myElement2 =  driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_bar\"]"));
	  	myElement2.sendKeys("pedi56Automation");

	  	Thread.sleep(2000);
	  	WebElement myElement3 = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
	  	myElement3.click();
	  	Thread.sleep(2000);

	  }

	  @Test(priority = 6)
	  public void close() throws InterruptedException {
	  	Thread.sleep(2000);
	  	WebElement myElement4 =  driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_close\"]"));
	  	myElement4.click();

	  	Thread.sleep(2000);

	  }

	  @Test(priority = 7)
	  public void ClickPatient() throws InterruptedException, IndexOutOfBoundsException {
	  	Thread.sleep(2000);
	  	List<WebElement> Clickpatient = driver
	  			.findElements(By.className("android.widget.TextView"));
	  	Clickpatient.get(5).click();

	  	// Working code for prescription
	  	// List<io.appium.java_client.MobileElement> els2 =
	  	// driver.findElements(By.className("android.widget.TextView"));
	  	// els2.get(8).click();
		Thread.sleep(000);
	  }
	  @Test(priority = 8)
	  public void EditVital() throws InterruptedException, IndexOutOfBoundsException {
	  	Thread.sleep(2000);
	  	List<WebElement> EditVital = driver
	  			.findElements(By.className("android.widget.TextView"));
	  	//EditVital.get(6).click();
		EditVital.get(23).click();
	  	//EditVital.get(25).click();
	  	//EditVital.get(26).click();
	  	EditVital.get(27).click();
	  	// Working code for prescription
	  	// List<io.appium.java_client.MobileElement> els2 =
	  	// driver.findElements(By.className("android.widget.TextView"));
	  	// els2.get(8).click();
		Thread.sleep(5000);

	  }
	  @Test(priority = 9)
			public void weight() throws InterruptedException {
			 
			
		  
		  List<WebElement> weight =  driver.findElements(By.className("android.widget.EditText"));
		  weight.get(0).clear();
		  weight.get(0).sendKeys("2");
		  

	}
	  @Test(priority = 10)
		public void Height() throws InterruptedException {
		 
		  List<WebElement> Height =  driver.findElements(By.className("android.widget.EditText"));
		  Height.get(1).clear();
		  Height.get(1).sendKeys("100");
	  Thread.sleep(5000);

}
	  @Test(priority = 11)
		public void HC() throws InterruptedException {
		 
		  List<WebElement> HC =  driver.findElements(By.className("android.widget.EditText"));
		  HC.get(2).clear();
		  HC.get(2).sendKeys("45");
	  Thread.sleep(5000);

}
	  @Test(priority = 12)
		public void CC() throws InterruptedException {
		 
		  List<WebElement> CC =  driver.findElements(By.className("android.widget.EditText"));
		  CC.get(3).clear();
		  CC.get(3).sendKeys("100");
	  Thread.sleep(5000);

}
	  @Test(priority = 13)
		public void Temperature() throws InterruptedException {
		 
		  List<WebElement> Temperature =  driver.findElements(By.className("android.widget.EditText"));
		  Temperature.get(4).clear();
		  Temperature.get(4).sendKeys("77");
	  Thread.sleep(5000);

}
	  @Test(priority = 14)
		public void SPO2() throws InterruptedException {
		 
		  List<WebElement> SPO2 =  driver.findElements(By.className("android.widget.EditText"));
		  SPO2.get(5).clear();
		  SPO2.get(5).sendKeys("12");
	  Thread.sleep(5000);
	  List<WebElement> Haemoglobin =  driver.findElements(By.className("android.widget.EditText"));
	  Haemoglobin.get(6).sendKeys("11");
  Thread.sleep(5000);

}
	  @Test(priority = 15)
		public void UpArrow() throws InterruptedException {
		 
	
	  
	  List<WebElement> UpArrow =  driver.findElements(By.className("android.widget.TextView"));
	  UpArrow.get(14).click();
	  
	  Thread.sleep(5000);
	  
	  List<WebElement> BPArrow =  driver.findElements(By.className("android.widget.TextView"));
	  BPArrow.get(19).click();
	  Thread.sleep(5000);
}
	  @Test(priority = 16)
		public void BPSYS() throws InterruptedException {
		 
		  List<WebElement> BPSYS =  driver.findElements(By.className("android.widget.EditText"));
		  BPSYS.get(0).clear();
		  BPSYS.get(0).sendKeys("12");
	  Thread.sleep(5000);

}

	  @Test(priority = 17)
	  public void BPDIA() throws InterruptedException {
			 
		  List<WebElement> BPDIA =  driver.findElements(By.className("android.widget.EditText"));
		  BPDIA.get(1).clear();
		  BPDIA.get(1).sendKeys("12");
	  Thread.sleep(5000);

}
	  @Test(priority = 18)
	  public void HeartRate() throws InterruptedException {
			 
		  List<WebElement> HeartRate = driver.findElements(By.className("android.widget.EditText"));
		  HeartRate.get(2).clear();
		  HeartRate.get(2).sendKeys("12");
		  
		  driver.findElements(By.className("android.widget.EditText"));
		  String a=HeartRate.get(2).getText();
		  System.out.println(a);
		  String Actualmsge="12";
		  Assert.assertEquals(a, Actualmsge);
		 
	  Thread.sleep(5000);

}
	  @Test(priority = 19)
	  public void Pulse() throws InterruptedException {
			 
		  List<WebElement> Pulse =  driver.findElements(By.className("android.widget.EditText"));
		  Pulse.get(3).clear();
		  Pulse.get(3).sendKeys("12");
	  Thread.sleep(5000);
	  
	  List<WebElement> BPArrowUP =  driver.findElements(By.className("android.widget.TextView"));
	  BPArrowUP.get(19).click();
	
	  Thread.sleep(5000);
	  
	  List<WebElement> BAArrowDown =  driver.findElements(By.className("android.widget.TextView"));
	  BAArrowDown.get(24).click();
	 
}

/*
 * @Test(priority = 20) public void Haemoglobin() throws InterruptedException {
 * 
 * List<WebElement> Haemoglobin =
 * driver.findElements(By.className("android.widget.EditText"));
 * Haemoglobin.get(0).clear(); Haemoglobin.get(0).sendKeys("12");
 * Thread.sleep(5000);
 * 
 * }
 */
	  @Test(priority = 21)
			public void BloodSugar() throws InterruptedException {
			 
		  List<WebElement> BloodSugar =  driver.findElements(By.className("android.widget.EditText"));
		  BloodSugar.get(0).clear();
		  BloodSugar.get(0).sendKeys("120");
		  Thread.sleep(5000);

	}
	  @Test(priority = 22)
		public void BloodSugarf() throws InterruptedException {
		 
		  List<WebElement> BloodSugarf =  driver.findElements(By.className("android.widget.EditText"));
		  BloodSugarf.get(1).clear();
		  BloodSugarf.get(1).sendKeys("120");
		  Thread.sleep(5000);

}
	  @Test(priority = 23)
		public void BloodSugarPP() throws InterruptedException {
		 
		  List<WebElement> BloodSugarHB =  driver.findElements(By.className("android.widget.EditText"));
		  BloodSugarHB.get(2).clear();
		  BloodSugarHB.get(2).sendKeys("10");
		  Thread.sleep(5000);
	 
} 

	  @Test(priority = 24)
		public void BloodSugarHB() throws InterruptedException {
		 
		  List<WebElement> BloodSugarHB =  driver.findElements(By.className("android.widget.EditText"));
		  BloodSugarHB.get(3).clear();
		  BloodSugarHB.get(3).sendKeys("10");
		 
	  Thread.sleep(5000);
	  List<WebElement> BPArrowDown =  driver.findElements(By.className("android.widget.TextView"));
	  BPArrowDown.get(24).click();
	 
	  
	  Thread.sleep(5000);
	  
	  List<WebElement> LipidArrowDown =  driver.findElements(By.className("android.widget.TextView"));
	  LipidArrowDown.get(29).click();
	  
} 
	  @Test(priority = 25)
			public void CholesterolHDL() throws InterruptedException {
			 
		  List<WebElement> CholesterolHDL =  driver.findElements(By.className("android.widget.EditText"));
		  CholesterolHDL.get(0).clear();
		  CholesterolHDL.get(0).sendKeys("10");
			  Thread.sleep(5000);
		 
	} 
	  @Test(priority = 26)
		public void CholesterolLDL() throws InterruptedException {
		 
		  List<WebElement> CholesterolLDL =  driver.findElements(By.className("android.widget.EditText"));
		  CholesterolLDL.get(1).clear();
		  CholesterolLDL.get(1).sendKeys("10");
		  Thread.sleep(5000);
	 
} 
	  @Test(priority = 27)
		public void TotalCholesterol() throws InterruptedException {
		 
		  List<WebElement> TotalCholesterol =  driver.findElements(By.className("android.widget.EditText"));
		  TotalCholesterol.get(2).clear();
		  TotalCholesterol.get(2).sendKeys("101");
		  Thread.sleep(5000);
	 
} 
	  @Test(priority = 28)
		public void Triglycerides() throws InterruptedException {
		 
		  List<WebElement> Triglycerides =  driver.findElements(By.className("android.widget.EditText"));
		  Triglycerides.get(3).clear();
		  Triglycerides.get(3).sendKeys("125");
		  Thread.sleep(5000);
	 
} 
	  @Test(priority = 29)
		public void Save() throws InterruptedException {
		  WebElement Save = driver.findElement(By.xpath("//*[@text='Save']"));
		  Save.click();
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
