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

public class PDeletePatient extends AppiumServerStart{
	
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
	dc.setCapability(MobileCapabilityType.APP, "C:\\pivotalapp-stage-vishakha.apk");
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
			 MobileNumber1.sendKeys("1000000015");
			



		}
	  @Test(priority = 10)
		public void confirm() throws InterruptedException {
			Thread.sleep(2000);

			

			WebElement confirm = driver.findElement(By.xpath("//*[@text='Confirm']"));
			 confirm.click();
			


			Thread.sleep(2000);

		}
	  @Test(priority = 11)
		public void confirmPopup() throws InterruptedException {
			Thread.sleep(2000);

			

			//WebElement confirmPopup = driver.findElement(By.xpath("//*[@text='Confirm']"));
			// confirmPopup.click();
			
			 WebElement ProceedWithSameRMN =driver.findElement(By.xpath("//*[@text='Proceed with same RMN']"));
			 ProceedWithSameRMN.click();


	//Thread.sleep(2000);

			Thread.sleep(2000);}
			
			

		
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
			 FirstName.sendKeys("Pivotal");
			


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
		
		  WebElement YearDropdown = driver.findElement(By.xpath("//*[@text='2024']"));
		  YearDropdown.click();

		  Thread.sleep(2000);
		  WebElement Year= driver.findElement(By.xpath("//*[@text='2022']"));
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
	  
	  Thread.sleep(15000);
}
	 
/*
* @Test(priority = 24) public void ProceedWithSameRMN() throws
* InterruptedException {
* 
* 
* MobileElement ProceedWithSameRMN = driver
* .findElementByXPath("//*[@text='Proceed with same RMN']");
* ProceedWithSameRMN.click();
* 
* Thread.sleep(20000);
* 
* //List<io.appium.java_client.MobileElement> ProceedWithSameRMN =
* driver.findElements(By.className("ndroid.view.ViewGroup"));
* //ProceedWithSameRMN.get(18).click(); }
*/
	  @Test(priority = 25)
		public void ContinueProfile() throws InterruptedException {
		 
		  WebElement ContinueProfile = driver.findElement(By.xpath("//*[@text='Continue to complete detail profile']"));
	  ContinueProfile.click();
	  Thread.sleep(10000);
}



 @Test(priority = 26) public void TypeOfDelivery() throws InterruptedException
 { Thread.sleep(2000); List<WebElement>
 TypeOfDelivery =
 driver.findElements(By.className("android.widget.TextView"));
 TypeOfDelivery.get(5).click();}
 
 @Test(priority = 27) public void TypeOfDeliveryNormal() throws
 InterruptedException { Thread.sleep(2000); List<WebElement>
 TypeOfDeliveryNormal =
 driver.findElements(By.className("android.view.ViewGroup"));
 TypeOfDeliveryNormal.get(0).click(); }


	  @Test(priority = 28)
			public void weightl() throws InterruptedException {
			  Thread.sleep(2000);
			  List<WebElement> weightl = driver.findElements(By.className("android.widget.EditText"));
			  weightl.get(5).sendKeys("4");
	}  
		  @Test(priority = 29)
			public void Heightl() throws InterruptedException {
			  Thread.sleep(2000);
			  List<WebElement> Heightl = driver.findElements(By.className("android.widget.EditText"));
			  Heightl.get(6).sendKeys("100");
	}  
		  @Test(priority = 30)
			public void HC() throws InterruptedException {
			  Thread.sleep(2000);
			  List<WebElement> HC = driver.findElements(By.className("android.widget.EditText"));
			  HC.get(7).sendKeys("25");
	}  
		  @Test(priority = 31)
			public void CC() throws InterruptedException {
			  Thread.sleep(2000);
			  List<WebElement> CC = driver.findElements(By.className("android.widget.EditText"));
			  CC.get(8).sendKeys("30");
	}  
		  @Test(priority = 32)
			public void BPSYS() throws InterruptedException {
			  Thread.sleep(2000);
			  List<WebElement> BPSYS = driver.findElements(By.className("android.widget.EditText"));
			  BPSYS.get(9).sendKeys("80");
	}  
		  @Test(priority = 33)
			public void BPDia() throws InterruptedException {
			  Thread.sleep(2000);
			  List<WebElement> BPDia = driver.findElements(By.className("android.widget.EditText"));
			  BPDia.get(10).sendKeys("120");
	}  
	
	
	  @Test(priority = 34) public void BloodGroup() throws InterruptedException {
	  Thread.sleep(2000); List<WebElement> BloodGroup =
	  driver.findElements(By.className("android.widget.TextView"));
	  BloodGroup.get(23).click(); }
	  
	  
	  
	  @Test(priority = 35) public void BloodGroupA() throws InterruptedException {
		  Thread.sleep(2000); List<WebElement> BloodGroupA =
				  driver.findElements(By.className("android.view.ViewGroup"));
		  BloodGroupA.get(2).click(); 
	  
	  }
	 
	 
		  @Test(priority = 36)
			public void BirthHistoryNext() throws InterruptedException {
			  Thread.sleep(2000);
			  WebElement BirthHistoryNext
			  = driver.findElement(By.xpath("//*[@text='Next']"));
			  BirthHistoryNext.click();
			  Thread.sleep(5000);
	}  
		  @Test(priority = 37)
			public void MedicalConditionAdd() throws InterruptedException {
			  Thread.sleep(2000);
			  List<WebElement> MedicalConditionAdd = driver.findElements(By.className("android.widget.TextView"));
			  MedicalConditionAdd.get(2).click();
	}  
		  @Test(priority = 38)
			public void MedicalConditionSelect() throws InterruptedException {
			  Thread.sleep(2000);
			  WebElement MedicalConditionSelect
			  =driver.findElement(By.xpath("//*[@text='Diabetes']"));
			  MedicalConditionSelect.click();
			  
			  WebElement MedicalConditionSelect1
			  =driver.findElement(By.xpath("//*[@text='Hypertension']"));
			  MedicalConditionSelect1.click();
	}  
		  @Test(priority = 39)
			public void AddMedicalCondition() throws InterruptedException {
			  Thread.sleep(2000);
			  WebElement MedicalConditionSelect
			  = driver.findElement(By.xpath("//*[@text='Add Medical Conditions']"));
			  MedicalConditionSelect.click();}

@Test(priority = 40)
public void Allergies() throws InterruptedException {
 Thread.sleep(2000);
 WebElement Allergies
 =driver.findElement(By.xpath("//*[@text='Your Allergies']"));
 Allergies.sendKeys("Dust");}

@Test(priority = 41)
public void Reactions() throws InterruptedException {
 Thread.sleep(2000);
 WebElement Reactions
 = driver.findElement(By.xpath("//*[@text='Your Reactions']"));
 Reactions.sendKeys("yes");;}

@Test(priority = 42)
public void RecurringComplaints() throws InterruptedException {
 Thread.sleep(2000);
 WebElement RecurringComplaints
 = driver.findElement(By.xpath("//*[@text='Your Recurring Complaints']"));
 RecurringComplaints.sendKeys("yes");}
@Test(priority = 43)
public void HospitalizationHistory() throws InterruptedException {
 Thread.sleep(2000);
 WebElement HospitalizationHistory
 = driver.findElement(By.xpath("//*[@text='Your Hospitalization History']"));
 HospitalizationHistory.sendKeys("yes");}
@Test(priority = 44)
public void HealthHistory() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement HealthHistory
	  = driver.findElement(By.xpath("//*[@text='Your Health History']"));
	  HealthHistory.sendKeys("yes");}
	
@Test(priority = 45)
public void GeneticdisoredrAdd() throws InterruptedException {
	  Thread.sleep(2000);
	  List<WebElement> GeneticdisoredrAdd = driver.findElements(By.className("android.widget.TextView"));
	  GeneticdisoredrAdd.get(9).click();}
@Test(priority = 46)
public void GeneticdisoredrSelect() throws InterruptedException {
	  Thread.sleep(10000);
	  List<WebElement> GeneticdisoredrSelect = driver.findElements(By.className("android.widget.TextView"));
	  GeneticdisoredrSelect.get(3).click();
	  Thread.sleep(2000);
	  List<WebElement> GeneticdisoredrSelect1 = driver.findElements(By.className("android.widget.TextView"));
	  GeneticdisoredrSelect1.get(19).click();



}
@Test(priority = 47)
public void AddGeneticdisoredr() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement AddGeneticdisoredr
	  =driver.findElement(By.xpath("//*[@text='Add Genetic Disorders']"));
	  AddGeneticdisoredr.click();}
@Test(priority = 48)
public void OtherEmailId() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement OtherEmailId
	  =driver.findElement(By.xpath("//*[@text='Enter Other Id']"));
	  OtherEmailId.sendKeys("abc@gmail.com");}
	
@Test(priority = 49)
public void helathNext() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement helathNext
	  =driver.findElement(By.xpath("//*[@text='Next']"));
	  helathNext.click();}
	
@Test(priority = 50)
public void FathersName() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement FathersName
	  =driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
	  FathersName.sendKeys("Father");}
	
	
	  @Test(priority = 51) public void MothersName() throws InterruptedException {
	  Thread.sleep(2000); 
	  List<WebElement> MothersName = driver.findElements(By.className("android.widget.EditText"));
	  MothersName.get(1).sendKeys("Mother");}
	 
	
@Test(priority = 52)
public void Fatherheight() throws InterruptedException {
	  Thread.sleep(2000);
	  Thread.sleep(2000);
	  List<WebElement> Fatherheight = driver.findElements(By.className("android.widget.EditText"));
	  Fatherheight.get(2).sendKeys("5");
	  Thread.sleep(2000);
	  List<WebElement> Fatherheightnch = driver.findElements(By.className("android.widget.EditText"));
	  Fatherheightnch.get(3).sendKeys("5");



}
@Test(priority = 53)
public void Mothersheight() throws InterruptedException {
	  Thread.sleep(2000);
	  List<WebElement> Mothersheight = driver.findElements(By.className("android.widget.EditText"));
	  Mothersheight.get(5).sendKeys("5");
	  
	  Thread.sleep(2000);
	  List<WebElement> Mothersheightinch = driver.findElements(By.className("android.widget.EditText"));
	  Mothersheightinch.get(6).sendKeys("2");



}
@Test(priority = 54)
public void FamailyNedicalHistory() throws InterruptedException {
	  Thread.sleep(2000);
	  List<WebElement> FamailyNedicalHistory = driver.findElements(By.className("android.widget.TextView"));
	  FamailyNedicalHistory.get(8).click();
	  
	  Thread.sleep(2000);
	  WebElement FamailyNedicalHistoryselect
	  = driver.findElement(By.xpath("//*[@text='Diabetes']"));
	  FamailyNedicalHistoryselect.click();


	  Thread.sleep(2000);
	  WebElement AddFamailyNedical	  = driver.findElement(By.xpath("//*[@text='Add Family Conditions']"));
	  AddFamailyNedical.click();
}
@Test(priority = 55)
public void EnterDisorders() throws InterruptedException {
	  Thread.sleep(2000);
	  List<WebElement> EnterDisorders = driver.findElements(By.className("android.widget.TextView"));
	  EnterDisorders.get(10).click();
	  
	  Thread.sleep(2000);
	  WebElement EnterDisordersselect
	  =driver.findElement(By.xpath("//*[@text='Mentally challenged']"));
	  EnterDisordersselect.click();


	  Thread.sleep(2000);
	  WebElement AddFamailyGeneticDisorder	  = driver.findElement(By.xpath("//*[@text='Add Family Genetic Disorders']"));
	  AddFamailyGeneticDisorder.click();
	  
	  Thread.sleep(2000);
	  WebElement FamilyNext
	  =driver.findElement(By.xpath("//*[@text='Next']"));
	  FamilyNext.click();
	  Thread.sleep(5000);
	  
	 
	  WebElement successDone
	  = driver.findElement(By.xpath("//*[@text='Done']"));
	  successDone.click();
	  Thread.sleep(5000);}
	  
	  
	  @Test(priority = 56)
		public void DeleteOption() throws InterruptedException, IndexOutOfBoundsException {  
		
			Thread.sleep(2000);	  
	  System.out.println("Before scrolling ....");
		//try {
//			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView(new UiSelector().text(\"Link Patient to Doctor")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Link Patient to Doctor\").instance(0))"));
			Thread.sleep(10000);

	
		Thread.sleep(2000);
		List<WebElement> DeleteOption =  driver.findElements(By.xpath("//*[@text='Delete Patient']"));
		
		DeleteOption.get(1).click();
		
		Thread.sleep(5000);
WebElement DeleteYes =  driver.findElement(By.xpath("//*[@text='YES']"));
		
		DeleteYes.click();
	
	  
	  Thread.sleep(2000);
	  WebElement Error = driver.findElement(By.xpath(
				"//*[@text='Patient deleted successfully']"));
		//submit.click();
		
		
		
		
		String a=Error.getText();
		  System.out.println(a);
		  String Actualmsge="Patient deleted successfully";
		  Assert.assertEquals(a, Actualmsge);
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
