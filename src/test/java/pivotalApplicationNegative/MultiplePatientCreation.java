package pivotalApplicationNegative;

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

public class MultiplePatientCreation {
	public class CreatePediatricPatient extends AppiumServerStart{
		AppiumDriver driver;
		 public Object MobileElement;
		 
		
		
		

		
	@BeforeClass
		public void setup1() throws MalformedURLException, InterruptedException {
			
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
		dc.setCapability("udid", "RZ8M5181Y3M");
		dc.setCapability("–session-override",true);
		  dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120000);
		  dc.setCapability("noReset", false) ;
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
		  Thread.sleep(5000);}
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
				  Thread.sleep(2000);
				  
		  }
		  @Test(priority = 5)
			public void Createptient() throws InterruptedException {
				Thread.sleep(2000);

				

				List<WebElement> Createptient = driver.findElements(By.className("android.widget.TextView"));
				Createptient.get(36).click();

				Thread.sleep(2000);

			}
		
		  @Test(priority = 7)
			public void Neweptient() throws InterruptedException {
				Thread.sleep(10000);

				

				 WebElement Neweptient = driver.findElement(By.xpath("//*[@text='New Patient']"));
				 Neweptient.click();
				


				Thread.sleep(2000);

			}
		  @Test(priority = 8)
			public void Close() throws InterruptedException {
				Thread.sleep(2000);

				

				
				  List<WebElement> Close =
				  driver.findElements(By.className("android.widget.TextView"));
				 
	Close.get(5).click();
	Close.get(6).click();			  
				 


	Thread.sleep(2000);
	List<WebElement> Close1 =
			  driver.findElements(By.className("android.widget.TextView"));
			 
	Close1.get(7).click();
	Close1.get(8).click();	

				
					/*
					 * MobileElement Close = driver
					 * .findElementByXPath("//android.widget.TextView[@index='5']"); Close.click();
					 */
				 
			}
		  @Test(priority = 9)
			public void MobileNumber1() throws InterruptedException {
				Thread.sleep(2000);

				

				WebElement MobileNumber1 = driver.findElement(By.xpath("//*[@text='Mobile Number']"));
				 MobileNumber1.sendKeys("1000000018");
				



			}
		  @Test(priority = 10)
			public void confirm() throws InterruptedException {
				Thread.sleep(2000);

				

				WebElement confirm = driver.findElement(By.xpath("//*[@text='Confirm']"));
				 confirm.click();
				


				Thread.sleep(5000);

			}
		  @Test(priority = 11)
			public void confirmPopup() throws InterruptedException {
				Thread.sleep(2000);

				

				//WebElement confirmPopup = driver.findElement(By.xpath("//*[@text='Confirm']"));
				// confirmPopup.click();
				
				 WebElement ProceedWithSameRMN =driver.findElement(By.xpath("//*[@text='Proceed with same RMN']"));
				 ProceedWithSameRMN.click();


		//Thread.sleep(2000);

				Thread.sleep(5000);}
				
				

			
		  @Test(priority = 12)
				public void AdditionalNumber1() throws InterruptedException {
					Thread.sleep(2000);

					

					
					WebElement AdditionalNumber1 = driver.findElement(By.xpath("//*[@text='Additional Mobile Number']"));
					  AdditionalNumber1.sendKeys("1234567892");
					 
					

		  }
					
		  
		  @Test(priority = 13)
			public void FirstName() throws InterruptedException {
				Thread.sleep(2000);

				

				WebElement FirstName = driver.findElement(By.xpath("//*[@text='First Name']"));
				 FirstName.sendKeys("multiplePatientd1");
				


				Thread.sleep(2000);

			}
		  @Test(priority = 14)
			public void MiddleName() throws InterruptedException {
				Thread.sleep(2000);

				

				WebElement MiddleName = driver.findElement(By.xpath("//*[@text='Middle Name']"));
				 MiddleName.sendKeys("test");
				


				Thread.sleep(2000);

			}
		  @Test(priority = 15)
			public void LastName() throws InterruptedException {
				Thread.sleep(2000);

				

				WebElement LastName = driver.findElement(By.xpath("//*[@text='Last Name']"));
				 LastName.sendKeys("test");
				


				Thread.sleep(2000);

			}
		  @Test(priority = 16)
			public void BirthCalender() throws InterruptedException {
			  WebElement BirthCalender = driver.findElement(By.xpath("//*[@text='DD/MM/YYYY']"));
			  BirthCalender.click();
			

			  Thread.sleep(2000);
			
			  WebElement YearDropdown = driver.findElement(By.xpath("//*[@text='2023']"));
			  YearDropdown.click();

			  Thread.sleep(2000);
			  WebElement Year= driver.findElement(By.xpath("//*[@text='2021']"));
			  Year.click();

			}
		  @Test(priority = 17)
			public void Birthok() throws InterruptedException {
				Thread.sleep(2000);

				

				WebElement Birthok = driver.findElement(By.xpath("//*[@text='Ok']"));
				 Birthok.click();
				


				Thread.sleep(2000);

			}
		  @Test(priority = 18)
			public void GenFemale() throws InterruptedException {
				Thread.sleep(2000);

				

				WebElement GenFemale = driver.findElement(By.xpath("//*[@text='Female']"));
				 GenFemale.click();
				


				Thread.sleep(2000);

			}
		  @Test(priority = 19)
			public void Address() throws InterruptedException {
				

				

			  WebElement Address = driver.findElement(By.xpath("//*[@text='Address']"));
				 Address.sendKeys("Pune");
				


				Thread.sleep(2000);

			}
		  @Test(priority = 20)
			public void Area() throws InterruptedException {
				

				

			  WebElement Area = driver.findElement(By.xpath("//*[@text='Area']"));
				 Area.sendKeys("Pune");
				


				Thread.sleep(2000);

			}
		  @Test(priority = 21)
			public void City() throws InterruptedException {
				

				

			  WebElement City = driver.findElement(By.xpath("//*[@text='City']"));
				 City.sendKeys("kothrud");
				


				Thread.sleep(2000);

			}
		  @Test(priority = 22)
				public void PinCode() throws InterruptedException {
					

					

			  WebElement PinCode =driver.findElement(By.xpath("//*[@text='Pincode']"));
					 PinCode.sendKeys("111111");
					


					Thread.sleep(2000);

				}
		
		  @Test(priority = 23)
			public void Next() throws InterruptedException {
			  WebElement Next = driver.findElement(By.xpath("//*[@text='Next']"));
			  Next.click();
			  Next.click(); Next.click(); Next.click(); Next.click(); Next.click(); Next.click();
		  
			 
		 
				 
		  
		  Thread.sleep(30000);
		  
		  WebElement successDone
		  = driver.findElement(By.xpath("//*[@text='Done']"));
		  successDone.click();
		  Thread.sleep(5000);
	}

}}
