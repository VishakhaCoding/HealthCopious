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

public class DashBoard extends AppiumServerStart{
	
	
	static AppiumDriver driver;
	 public Object MobileElement;
	 
	
	
	

	
@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {
		
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
	dc.setCapability("–session-override",true);
	  dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120000);
	  dc.setCapability("noReset", false) ;
	//dc.setCapability(MobileCapabilityType.APP, "D:\\pivotalapp-release-31-Oct.apk");
	dc.setCapability(MobileCapabilityType.APP, "D:\\pivotalapp-2-nov-production.apk");
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
			
			
			  Thread.sleep(10000);
			  List<WebElement> WhatsNewClose =  driver.findElements(By.className("android.widget.TextView"));
			  WhatsNewClose.get(1).click();
			  Thread.sleep(5000);
			  
	  }
	
	  @Test(priority=5) public void PatientList() throws MalformedURLException,
	  InterruptedException { WebElement PatientList = driver.findElement(By.xpath(
			  "//*[@text='Patients']"
			 )); PatientList.click();
			 
			 
			 Thread.sleep(10000);
			 
			 WebElement SearchPatient = driver.findElement(By.xpath(
					  "//*[@text='Search Records']"
					 )); SearchPatient.sendKeys("Pivo");
					 
					 WebElement SearchClear = driver.findElement(By.xpath(
							  "//*[@text='Pivo']"
							 )); SearchClear.clear();
					 
						
								/*
								 * WebElement Backward = driver.findElement(By.xpath( "android.widget.TextView"
								 * )); Backward.click();
								 */
								System.out.println("Patient Data"); 
							 Thread.sleep(5000);	 
							 
				List<WebElement> Date1= driver.findElements(By.className(
									  "android.widget.TextView"
									 ));
				String Date11=Date1.get(2).getText();
				System.out.println(Date11);
									 
			List<WebElement> time1= driver.findElements(By.className(
											  "android.widget.TextView"
											 )); 
			String Time11=time1.get(3).getText();
		 System.out.println(Time11);
		 
		 Thread.sleep(1000);
		 
		 
		List<WebElement> Date2= driver.findElements(By.className(
							  "android.widget.TextView"
							 ));
		String Date22=Date2.get(6).getText();
		System.out.println(Date22);
							 
	List<WebElement> time2= driver.findElements(By.className(
									  "android.widget.TextView"
									 )); 
	String Time22=time2.get(7).getText();
 System.out.println(Time22);
 
 Thread.sleep(1000);
		 
 List<WebElement> Date3= driver.findElements(By.className(
		  "android.widget.TextView"
		 ));
String Date33=Date3.get(10).getText();
System.out.println(Date33);
		 
List<WebElement> time3= driver.findElements(By.className(
				  "android.widget.TextView"
				 )); 
String Time33=time3.get(11).getText();
System.out.println(Time33);
		 
			 
							 Thread.sleep(5000); 
							 
								 List<WebElement> Backward5 = driver.findElements(By.className( "android.widget.TextView"
								 )); Backward5.get(1).click();

								 Thread.sleep(5000); 		 
			
			
	 }
	
	  @Test(priority=7) public void Appointments() throws MalformedURLException,
	  InterruptedException { WebElement Appointments = driver.findElement(By.xpath(
			  "//*[@text='Appointments']"
			 )); Appointments.click();
			 
			 Thread.sleep(5000); 
			 
			 WebElement Backward = driver.findElement(By.className( "android.widget.TextView"
			 )); Backward.click();
			 Thread.sleep(5000); 
	  }
	 
	  @Test(priority=8) public void Prescription() throws MalformedURLException,
	  InterruptedException { 
		  
		  
		  WebElement Prescription = driver.findElement(By.xpath(
			  "//*[@text='Prescriptions']"
			 )); Prescription.click();
			 
			 Thread.sleep(5000); 
			 
			 
			 
			 WebElement SearchPatient = driver.findElement(By.xpath(
					  "//*[@text='Search Records']"
					 )); SearchPatient.sendKeys("Pivo");
					 
					 WebElement SearchClear = driver.findElement(By.xpath(
							  "//*[@text='Pivo']"
							 )); SearchClear.clear();
					 
						
								/*
								 * WebElement Backward = driver.findElement(By.xpath( "android.widget.TextView"
								 * )); Backward.click();
								 */
							 System.out.println("Prescription");
							 Thread.sleep(5000);	 
							 
				List<WebElement> PDate1= driver.findElements(By.className(
									  "android.widget.TextView"
									 ));
				String PDate11=PDate1.get(5).getText();
				System.out.println(PDate11);
									 
			List<WebElement> Ptime1= driver.findElements(By.className(
											  "android.widget.TextView"
											 )); 
			String PTime11=Ptime1.get(6).getText();
		 System.out.println(PTime11);
		 
		 Thread.sleep(1000);
		 
		 
		List<WebElement> PDate2= driver.findElements(By.className(
							  "android.widget.TextView"
							 ));
		String PDate22=PDate2.get(10).getText();
		System.out.println(PDate22);
							 
	List<WebElement> Ptime2= driver.findElements(By.className(
									  "android.widget.TextView"
									 )); 
	String PTime22=Ptime2.get(11).getText();
System.out.println(PTime22);

Thread.sleep(2000);

WebElement View1 = driver.findElement(By.xpath(
		  "//*[@text='View']"
		 )); View1.click();
		 
		 Thread.sleep(5000);
		 
		 WebElement close1 = driver.findElement(By.xpath(
				  "//*[@text='']"
				 )); close1.click();
				 
				 Thread.sleep(5000);
		 WebElement View2 = driver.findElement(By.xpath(
				  "//*[@text='View']"
				 )); View2.click();
				 
				 Thread.sleep(5000);
				 
				 WebElement close2 = driver.findElement(By.xpath(
						  "//*[@text='']"
						 )); close2.click();
		 

		 
			 
							 Thread.sleep(5000); 
							 
								 List<WebElement> Backward5 = driver.findElements(By.className( "android.widget.TextView"
								 )); Backward5.get(1).click();

								 Thread.sleep(5000); 		  
			 
			 
			 
			 WebElement Backward = driver.findElement(By.className( "android.widget.TextView"
			 )); Backward.click();
	  }
	 
	  @Test(priority=9) public void Reports() throws MalformedURLException,
	  InterruptedException { 
		  
		  
		  WebElement Prescription = driver.findElement(By.xpath(
			  "//*[@text='Lab Reports']"
			 )); Prescription.click();
			 
			 Thread.sleep(5000); 
			 
			 
			 
			 WebElement SearchPatient = driver.findElement(By.xpath(
					  "//*[@text='Search Records']"
					 )); SearchPatient.sendKeys("Pivo");
					 
					 WebElement SearchClear = driver.findElement(By.xpath(
							  "//*[@text='Pivo']"
							 )); SearchClear.clear();
					 
							 System.out.println("Reports");
								/*
								 * WebElement Backward = driver.findElement(By.xpath( "android.widget.TextView"
								 * )); Backward.click();
								 */
						 
							 Thread.sleep(5000);	 
							 
				List<WebElement> RDate1= driver.findElements(By.className(
									  "android.widget.TextView"
									 ));
				String RDate11=RDate1.get(5).getText();
				System.out.println(RDate11);
									 
			List<WebElement> Ptime1= driver.findElements(By.className(
											  "android.widget.TextView"
											 )); 
			String PTime11=Ptime1.get(6).getText();
		 System.out.println(PTime11);
		 
		 Thread.sleep(1000);
		 
		 
		List<WebElement> RDate2= driver.findElements(By.className(
							  "android.widget.TextView"
							 ));
		String RDate22=RDate2.get(10).getText();
		System.out.println(RDate22);
							 
	List<WebElement> Rtime2= driver.findElements(By.className(
									  "android.widget.TextView"
									 )); 
	String RTime22=Rtime2.get(11).getText();
System.out.println(RTime22);

Thread.sleep(2000);

WebElement View1 = driver.findElement(By.xpath(
		  "//*[@text='View']"
		 )); View1.click();
		 
		 Thread.sleep(5000);
		 
		 WebElement close1 = driver.findElement(By.xpath(
				  "//*[@text='']"
				 )); close1.click();
				 
				 Thread.sleep(5000);
		  List<WebElement> View2 = driver.findElements(By.xpath(
				  "//*[@text='View']"
				 )); View2.get(1).click();
				 
				 Thread.sleep(5000);
				 
				 WebElement close2 = driver.findElement(By.xpath(
						  "//*[@text='']"
						 )); close2.click();
		 

		 
			 
							 Thread.sleep(5000); 
							 
								 List<WebElement> Backward5 = driver.findElements(By.className( "android.widget.TextView"
								 )); Backward5.get(1).click();

								 Thread.sleep(5000); 		  
			 
			 
			  WebElement Backward = driver.findElement(By.className( "android.widget.TextView"
			 )); Backward.click();
			 Thread.sleep(5000); 		  
			 
	  }
	@Ignore
	  @Test(priority=10) public void HealthApp() throws MalformedURLException,
	  InterruptedException { WebElement HealthApp = driver.findElement(By.xpath(
			  "//*[@text='HealthApp']"
			 )); HealthApp.click();
			 
			 
			 Thread.sleep(10000);
			 
			 WebElement SearchPatient = driver.findElement(By.xpath(
					  "//*[@text='Search Records']"
					 )); SearchPatient.sendKeys("Vishakha");
					 
					 WebElement SearchClear = driver.findElement(By.xpath(
							  "//*[@text='Vishakha']"
							 )); SearchClear.clear();
					 
						
								/*
								 * WebElement Backward = driver.findElement(By.xpath( "android.widget.TextView"
								 * )); Backward.click();
								 */
								System.out.println("Health Data"); 
							 Thread.sleep(5000);	 
							 
				List<WebElement> Date1= driver.findElements(By.className(
									  "android.widget.TextView"
									 ));
				String Date11=Date1.get(2).getText();
				System.out.println(Date11);
									 
			List<WebElement> time1= driver.findElements(By.className(
											  "android.widget.TextView"
											 )); 
			String Time11=time1.get(3).getText();
		 System.out.println(Time11);
		 
		 Thread.sleep(1000);
		 
		 
		
		 
			 
							 Thread.sleep(5000); 
							 
								 List<WebElement> Backward5 = driver.findElements(By.className( "android.widget.TextView"
								 )); Backward5.get(1).click();

								 Thread.sleep(5000); 		 
			
			
	 }
	
	  @Test(priority=11) public void Referrals() throws MalformedURLException,
	  InterruptedException { WebElement PatientList = driver.findElement(By.xpath(
			  "//*[@text='Referrals']"
			 )); PatientList.click();
			 
			 
			 Thread.sleep(10000);
			 
			 WebElement SearchPatient = driver.findElement(By.xpath(
					  "//*[@text='Search Records']"
					 )); SearchPatient.sendKeys("Pivo");
					 
					 WebElement SearchClear = driver.findElement(By.xpath(
							  "//*[@text='Pivo']"
							 )); SearchClear.clear();
					 
						
								/*
								 * WebElement Backward = driver.findElement(By.xpath( "android.widget.TextView"
								 * )); Backward.click();
								 */
								System.out.println("Referral Data"); 
							 Thread.sleep(5000);	 
							 
				List<WebElement> Date1= driver.findElements(By.className(
									  "android.widget.TextView"
									 ));
				String Date11=Date1.get(2).getText();
				System.out.println(Date11);
									 
			List<WebElement> time1= driver.findElements(By.className(
											  "android.widget.TextView"
											 )); 
			String Time11=time1.get(3).getText();
		 System.out.println(Time11);
		 
		 Thread.sleep(1000);
		 
		 
		List<WebElement> Date2= driver.findElements(By.className(
							  "android.widget.TextView"
							 ));
		String Date22=Date2.get(7).getText();
		System.out.println(Date22);
							 
	List<WebElement> time2= driver.findElements(By.className(
									  "android.widget.TextView"
									 )); 
	String Time22=time2.get(8).getText();
 System.out.println(Time22);
 
 Thread.sleep(1000);
 WebElement View1 = driver.findElement(By.xpath(
		  "//*[@text='View']"
		 )); View1.click();
		 
		 Thread.sleep(5000);
		 
		 WebElement close1 = driver.findElement(By.xpath(
				  "//*[@text='']"
				 )); close1.click();
				 
				 Thread.sleep(5000);
		  List<WebElement> View2 = driver.findElements(By.xpath(
				  "//*[@text='View']"
				 )); View2.get(1).click();
				 
				 Thread.sleep(5000);
				 
				 WebElement close2 = driver.findElement(By.xpath(
						  "//*[@text='']"
						 )); close2.click();
		 

		 
		 
 
			 
							 Thread.sleep(5000); 
							 
								 List<WebElement> Backward5 = driver.findElements(By.className( "android.widget.TextView"
								 )); Backward5.get(1).click();

								 Thread.sleep(5000); 		 
			
			
	 }
	
	  @Test(priority=12) public void VaccineInStore() throws MalformedURLException,
	  InterruptedException { 
		  List<WebElement> VaccineInStore = driver.findElements(By.className(
			  "android.widget.TextView")); 
	  VaccineInStore.get(22).click();
			 
			 
			 Thread.sleep(10000);
			 
			 WebElement SearchPatient = driver.findElement(By.xpath(
					  "//*[@text='Search by brand or company']"
					 )); SearchPatient.sendKeys("M Vac");
					 
					 WebElement SearchClear = driver.findElement(By.xpath(
							  "//*[@text='M Vac']"
							 )); SearchClear.clear();
							 
							 Thread.sleep(5000); 
							 
							 List<WebElement> Backward5 = driver.findElements(By.className( "android.widget.TextView"
							 )); Backward5.get(0).click();

							 Thread.sleep(5000);
	  
	  
}
	  @Test(priority=13) public void ViewReports() throws MalformedURLException,
	  InterruptedException { 
		  
		  List<WebElement> ViewReports = driver.findElements(By.className(
				  "android.widget.TextView")); 
		  ViewReports.get(23).click();
			 
			 Thread.sleep(5000); 
			 
			 
			 
			 WebElement SearchPatient = driver.findElement(By.xpath(
					  "//*[@text='Search Records']"
					 )); SearchPatient.sendKeys("Pivo");
					 
					 WebElement SearchClear = driver.findElement(By.xpath(
							  "//*[@text='Pivo']"
							 )); SearchClear.clear();
					 
						
								/*
								 * WebElement Backward = driver.findElement(By.xpath( "android.widget.TextView"
								 * )); Backward.click();
								 */
							 System.out.println("Reports");
							 Thread.sleep(5000);	 
							 
				List<WebElement> PDate1= driver.findElements(By.className(
									  "android.widget.TextView"
									 ));
				String PDate11=PDate1.get(5).getText();
				System.out.println(PDate11);
									 
			List<WebElement> Ptime1= driver.findElements(By.className(
											  "android.widget.TextView"
											 )); 
			String PTime11=Ptime1.get(6).getText();
		 System.out.println(PTime11);
		 
		 Thread.sleep(1000);
		 
		 
		List<WebElement> PDate2= driver.findElements(By.className(
							  "android.widget.TextView"
							 ));
		String PDate22=PDate2.get(10).getText();
		System.out.println(PDate22);
							 
	List<WebElement> Ptime2= driver.findElements(By.className(
									  "android.widget.TextView"
									 )); 
	String PTime22=Ptime2.get(11).getText();
System.out.println(PTime22);

Thread.sleep(2000);

WebElement View1 = driver.findElement(By.xpath(
		  "//*[@text='View']"
		 )); View1.click();
		 
		 Thread.sleep(5000);
		 
		 WebElement close1 = driver.findElement(By.xpath(
				  "//*[@text='']"
				 )); close1.click();
				 
				 Thread.sleep(5000);
		 WebElement View2 = driver.findElement(By.xpath(
				  "//*[@text='View']"
				 )); View2.click();
				 
				 Thread.sleep(5000);
				 
				 WebElement close2 = driver.findElement(By.xpath(
						  "//*[@text='']"
						 )); close2.click();
		 

		 
			 
							 Thread.sleep(5000); 
							 
								 List<WebElement> Backward5 = driver.findElements(By.className( "android.widget.TextView"
								 )); Backward5.get(1).click();

								 Thread.sleep(5000); 		  
			 
			 
			 
			 WebElement Backward = driver.findElement(By.className( "android.widget.TextView"
			 )); Backward.click();
			 Thread.sleep(5000); 		  
			 
	  }
	 
	  @Test(priority=14) public void MyNotes() throws MalformedURLException,
	  InterruptedException { 
		  
		  
		  List<WebElement> MyNotes = driver.findElements(By.className(
				  "android.widget.TextView")); 
		  MyNotes.get(24).click();
			 
			 Thread.sleep(5000); 
			 
			 
			 
			 WebElement SearchPatient = driver.findElement(By.xpath(
					  "//*[@text='Search Records']"
					 )); SearchPatient.sendKeys("Pivo");
					 
					 WebElement SearchClear = driver.findElement(By.xpath(
							  "//*[@text='Pivo']"
							 )); SearchClear.clear();
					 
						
								/*
								 * WebElement Backward = driver.findElement(By.xpath( "android.widget.TextView"
								 * )); Backward.click();
								 */
							 System.out.println("My Notes");
							 Thread.sleep(5000);	 
							 
				List<WebElement> PDate1= driver.findElements(By.className(
									  "android.widget.TextView"
									 ));
				String PDate11=PDate1.get(4).getText();
				System.out.println(PDate11);
									 
			List<WebElement> Notes1= driver.findElements(By.className(
											  "android.widget.TextView"
											 )); 
			String Notes11=Notes1.get(5).getText();
		 System.out.println(Notes11);
		 
		 Thread.sleep(1000);
		 
		 
		List<WebElement> PDate2= driver.findElements(By.className(
							  "android.widget.TextView"
							 ));
		String PDate22=PDate2.get(8).getText();
		System.out.println(PDate22);
							 
	List<WebElement> Notes2= driver.findElements(By.className(
									  "android.widget.TextView"
									 )); 
	String Notes22=Notes2.get(9).getText();
System.out.println(Notes22);

Thread.sleep(2000);



  Thread.sleep(5000);
  
  List<WebElement> Backward5 = driver.findElements(By.className(
  "android.widget.TextView" )); Backward5.get(1).click();
  
  Thread.sleep(5000);
 	  
			 
			 
			 
	/*
	 * WebElement Backward = driver.findElement(By.className(
	 * "android.widget.TextView" )); Backward.click(); Thread.sleep(5000);
	 */ 		  
			 
	  }
	  @Test(priority=15) public void ShareHealth() throws MalformedURLException,
	  InterruptedException { 
		  
		  
		  List<WebElement> ShareHealth = driver.findElements(By.className(
				  "android.widget.TextView")); 
		  ShareHealth.get(25).click();
			 
			 Thread.sleep(5000); 
			 
			 WebElement PatientNo = driver.findElement(By.xpath(
					  "//*[@text='XXXXX-XXXXX']"
					 )); PatientNo.sendKeys("9665002440");
					 
					 WebElement Send = driver.findElement(By.xpath(
							  "//*[@text='Send']"
							 )); Send.click();
							 
							 Thread.sleep(5000);
}
	  @Test(priority=16) public void WhatsNew() throws MalformedURLException,
	  InterruptedException {
		  
		  List<WebElement> WhatsNew = driver.findElements(By.className(
				  "android.widget.TextView")); 
		  WhatsNew.get(27).click();
			 
			 Thread.sleep(5000); 
			 List<WebElement> WhatsNewClose =  driver.findElements(By.className("android.widget.TextView"));
			  WhatsNewClose.get(1).click();
			  Thread.sleep(5000);
}
	  @Test(priority=17) public void DashboardData() throws MalformedURLException,
	  InterruptedException {
		  System.out.println("Dashboard Data");
		  List<WebElement> PatientData= driver.findElements(By.className(
				  "android.widget.TextView"
				 )); 
String PatientData1=PatientData.get(5).getText();
System.out.println("Patient Data="+PatientData1);


Thread.sleep(1000);
		  
List<WebElement> Appointments= driver.findElements(By.className(
		  "android.widget.TextView"
		 )); 
String Appointments1=Appointments.get(8).getText();
System.out.println("Appointments Data="+Appointments1);

Thread.sleep(1000);

List<WebElement> PrescriptionData= driver.findElements(By.className(
		  "android.widget.TextView"
		 )); 
String PrescriptionData1=PrescriptionData.get(11).getText();
System.out.println("Prescription Data="+PrescriptionData1);
		  
Thread.sleep(1000);

List<WebElement> LabReports= driver.findElements(By.className(
		  "android.widget.TextView"
		 )); 
String LabReports1=LabReports.get(14).getText();
System.out.println("Lab Reports Data="+LabReports1);

Thread.sleep(1000);

List<WebElement> HealthApp= driver.findElements(By.className(
		  "android.widget.TextView"
		 )); 
String HealthApp1=HealthApp.get(17).getText();
System.out.println("Health Data="+HealthApp1);

Thread.sleep(1000);

List<WebElement> ReferrakData= driver.findElements(By.className(
		  "android.widget.TextView"
		 )); 
String ReferrakData1=ReferrakData.get(20).getText();
System.out.println("Referal Data="+ReferrakData1);
		  
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
	  
	  

