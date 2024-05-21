package healthApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pivotalApplication.AppiumServerStart;

public class NewAppoitnment extends AppiumServerStart {
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
	dc.setCapability("–session-override",true);
	  dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120000);
	  dc.setCapability("noReset", false) ;
	//dc.setCapability(MobileCapabilityType.APP, "D:\\healthapp-release-16-Aug.apk");
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


	
	  Thread.sleep(10000);

}
@Test(priority = 5)
public void BookAppointment() throws MalformedURLException, InterruptedException {
	/*
	 * List<WebElement> AddFamilyMember =driver.findElements(By.className(
	 * "android.widget.TextView")); AddFamilyMember.get(34).click();
	 */

	List<WebElement> BookAppointment =driver.findElements(By.xpath(
			"//*[@text='Book Appointment']"));
	BookAppointment.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 6)
public void SelectFamilyMember() throws MalformedURLException, InterruptedException {
	
	/*
	 * List<WebElement> SelectFamilyMember =driver.findElements(By.className(
	 * "android.view.ViewGroup")); SelectFamilyMember.get(15).click();
	 */
	List<WebElement> els1 = driver.findElements(By.xpath("//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView"));
	els1.get(0).click();
	  Thread.sleep(2000);

}
@Test(priority = 7)
public void SelectDoctor() throws MalformedURLException, InterruptedException {
	
	List<WebElement> SelectDoctor =driver.findElements(By.xpath(
			"//*[@text='Select Doctor']"));
	SelectDoctor.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 8)
public void Doctor() throws MalformedURLException, InterruptedException {
	

	List<WebElement> Doctor =driver.findElements(By.xpath(
			"//*[@text='Dr. vishakha Nawale']"));
	Doctor.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 9)
public void DateClick() throws MalformedURLException, InterruptedException {


	List<WebElement> DateClick =driver.findElements(By.xpath(
			"//*[@text='DD/MM/YYYY']"));
	DateClick.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 10)
public void Time() throws MalformedURLException, InterruptedException {
	

	List<WebElement> Time =driver.findElements(By.xpath("//*[@text='05:30 pm']"
			));
	Time.get(0).click();

	
	  Thread.sleep(5000);

}
@Test(priority = 11)
public void PurposeVisit() throws MalformedURLException, InterruptedException {
	
	
	List<WebElement> els1 = driver.findElements(By.xpath("(//android.widget.TextView[@text=\"󰐙\"])[1]"));
	els1.get(0).click();
	
	/*
	 * Thread.sleep(5000); List<WebElement> ScheduledVisit
	 * =driver.findElements(By.xpath( "//*[@text='Scheduled Visit']"));
	 * ScheduledVisit.get(0).clear();
	 * 
	 * Thread.sleep(2000);
	 */
		/*
		 * List<WebElement> AddVisit =driver.findElements(By.xpath( "//*[@text='󰐙']"));
		 * AddVisit.get(0).click();
		 */
	 Thread.sleep(2000);
	 
	 List<WebElement> Followup =driver.findElements(By.xpath(
				"//*[@text='Follow Up']"));
	 Followup.get(0).click();
		 Thread.sleep(2000); 
		 
		 List<WebElement> CfAdd =driver.findElements(By.xpath(
					"//*[@text='󰐙']"));
		 CfAdd.get(1).click();
			 Thread.sleep(2000); 
			 
			 List<WebElement> CfFever =driver.findElements(By.xpath(
						"//*[@text='Fever']"));
			 CfFever.get(0).click();
				 Thread.sleep(2000); 
				 
				 List<WebElement> CfSince =driver.findElements(By.className(
							"android.widget.EditText"));
				 CfSince.get(1).sendKeys("1");
					 Thread.sleep(2000);
					 
					 List<WebElement> CfMild =driver.findElements(By.xpath(
								"(//android.widget.TextView[@text='󰄳'])[3]"));
					 CfMild.get(0).click();
					 
						 Thread.sleep(2000);
						 
						 List<WebElement> CfVomitting =driver.findElements(By.xpath(
									"//*[@text='Vomitting']"));
						 CfVomitting.get(0).click();
							 Thread.sleep(2000);
							 
							 
							 List<WebElement> CfSince1 =driver.findElements(By.className(
										"android.widget.EditText"));
							 CfSince1.get(1).sendKeys("1");
								 Thread.sleep(2000);
							 
							 List<WebElement> CfAddComplains =driver.findElements(By.xpath(
										"//*[@text='Add Complaints']"));
							 CfAddComplains.get(0).click();
								 Thread.sleep(2000);
		 
		 
	 
	 
	 
	 
	

	

	
	  Thread.sleep(5000);

}


  @Test(priority = 12) public void CreateAppointment() throws
  MalformedURLException, InterruptedException {
  
  
  List<WebElement> CreateAppointment =driver.findElements(By.xpath(
  "//*[@text='Create Appointment']")); CreateAppointment.get(1).click();
  
  
  Thread.sleep(5000);
  
  }
 
@Test(priority = 13)
public void Done() throws MalformedURLException, InterruptedException {
	
	List<WebElement> Done =driver.findElements(By.xpath(
			"//*[@text='Done']"));
	Done.get(0).click();

	
	  Thread.sleep(5000);

}

}
