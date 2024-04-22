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

public class EditLMPVital extends AppiumServerStart{
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
			 MobileNumber1.sendKeys("1000000014");
			



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
			 //confirmPopup.click();
			
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
			 FirstName.sendKeys("LMP12Add");
			


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
		public void Age() throws InterruptedException {
			/*
			 * WebElement BirthCalender =
			 * driver.findElement(By.xpath("//*[@text='DD/MM/YYYY']"));
			 * BirthCalender.click();
			 */
		


		
			
		  WebElement Age = driver.findElement(By.xpath("//*[@text='Age in Years']"));
		  Age.sendKeys("9");

			

		}

		/*
		 * @Test(priority = 17) public void Birthok() throws InterruptedException {
		 * Thread.sleep(2000);
		 * 
		 * 
		 * 
		 * WebElement Birthok = driver.findElement(By.xpath("//*[@text='Ok']"));
		 * Birthok.click();
		 * 
		 * 
		 * 
		 * Thread.sleep(2000);
		 * 
		 * }
		 */
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
				

				

				 WebElement PinCode = driver.findElement(By.xpath("//*[@text='Pincode']"));
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
	  @Test(priority = 24)
		public void AddVital() throws InterruptedException {
		 
			/*
			 * WebElement AddVital =
			 * driver.findElement(By.xpath("//*[@text='Add Vitals']")); AddVital.click();
			 */
	  
	  WebElement Done = driver.findElement(By.xpath("//*[@text='Done']"));
	  Done.click();
	  Thread.sleep(5000);

}
	  @Test(priority = 25)
		public void Continue() throws InterruptedException {
		 
	  WebElement Continue = driver.findElement(By.xpath("//*[@text='Continue']"));
	  Continue.click();
	  Thread.sleep(5000);
	  
		List<WebElement> EditVital = driver
	  			.findElements(By.xpath("//*[@text='']"));
	  	//EditVital.get(6).click();
		EditVital.get(0).click();
	  	//EditVital.get(25).click();
	  	//EditVital.get(26).click();
	  	//EditVital.get(27).click();
	  	// Working code for prescription
	  	// List<io.appium.java_client.MobileElement> els2 =
	  	// driver.findElements(By.className("android.widget.TextView"));
	  	// els2.get(8).click();
		Thread.sleep(5000);

}
	  @Test(priority = 26)
			public void weight() throws InterruptedException {
			 
			
		  
		  List<WebElement> weight =  driver.findElements(By.className("android.widget.EditText"));
		  weight.get(0).sendKeys("2");
		  

	}
	  @Test(priority = 27)
		public void Height() throws InterruptedException {
		 
		  List<WebElement> Height =  driver.findElements(By.className("android.widget.EditText"));
		  Height.get(1).sendKeys("100");
	  Thread.sleep(5000);

}

/*
* @Test(priority = 29) public void HC() throws InterruptedException {
* 
* List<WebElement> HC =
* driver.findElements(By.className("android.widget.EditText"));
* HC.get(2).sendKeys("45"); Thread.sleep(5000);
* 
* }
* 
* @Test(priority = 30) public void CC() throws InterruptedException {
* 
* List<WebElement> CC =
* driver.findElements(By.className("android.widget.EditText"));
* CC.get(3).sendKeys("100"); Thread.sleep(5000);
* 
* }
*/
	  @Test(priority = 28)
		public void Temperature() throws InterruptedException {
		 
		  List<WebElement> Temperature =  driver.findElements(By.className("android.widget.EditText"));
		  Temperature.get(4).sendKeys("77");
	  Thread.sleep(5000);

}
	  @Test(priority = 29)
		public void SPO2() throws InterruptedException {
		 
		  List<WebElement> SPO2 =  driver.findElements(By.className("android.widget.EditText"));
		  SPO2.get(5).sendKeys("12");
	  Thread.sleep(5000);

}
	  
	  @Test(priority = 30)
		public void LMPDate() throws InterruptedException {
		 
		  WebElement LMPDate = driver.findElement(By.xpath("//*[@text='DD-MM-YYYY']"));
		  LMPDate.click();
	  Thread.sleep(5000);
	  
	  List<WebElement> DateDropdown =  driver.findElements(By.className("android.widget.EditText"));
	  DateDropdown.get(0).click();
	  Thread.sleep(5000);
	  List<WebElement> DateSelect =  driver.findElements(By.className("android.view.ViewGroup"));
	  DateSelect.get(2).click();
	  
	  Thread.sleep(5000);
	  WebElement LMPDateOk = driver.findElement(By.xpath("//*[@text='Ok']"));
	  LMPDateOk.click();
	  Thread.sleep(5000);
}
	  @Test(priority = 33)
		public void UpArrow() throws InterruptedException {
		 
	
	  
	  List<WebElement> UpArrow =  driver.findElements(By.className("android.widget.TextView"));
	  UpArrow.get(14).click();
	  
	  Thread.sleep(5000);
	  
	  List<WebElement> BPArrow =  driver.findElements(By.className("android.widget.TextView"));
	  BPArrow.get(19).click();
	  Thread.sleep(5000);
}
	  @Test(priority = 34)
		public void BPSYS() throws InterruptedException {
		 
		  List<WebElement> BPSYS =  driver.findElements(By.className("android.widget.EditText"));
		  BPSYS.get(0).sendKeys("12");
	  Thread.sleep(5000);

}

	  @Test(priority = 35)
	  public void BPDIA() throws InterruptedException {
			 
		  List<WebElement> BPDIA =  driver.findElements(By.className("android.widget.EditText"));
		  BPDIA.get(1).sendKeys("12");
	  Thread.sleep(5000);

}
	  @Test(priority = 36)
	  public void HeartRate() throws InterruptedException {
			 
		  List<WebElement> HeartRate = driver.findElements(By.className("android.widget.EditText"));
		  HeartRate.get(2).sendKeys("12");
		  
		  driver.findElements(By.className("android.widget.EditText"));
		  String a=HeartRate.get(2).getText();
		  System.out.println(a);
		  String Actualmsge="12";
		  Assert.assertEquals(a, Actualmsge);
		 
	  Thread.sleep(5000);

}
	  @Test(priority = 37)
	  public void Pulse() throws InterruptedException {
			 
		  List<WebElement> Pulse =  driver.findElements(By.className("android.widget.EditText"));
		  Pulse.get(3).sendKeys("12");
	  Thread.sleep(5000);
	  
	  List<WebElement> BPArrowUP =  driver.findElements(By.className("android.widget.TextView"));
	  BPArrowUP.get(19).click();
	  
	  Thread.sleep(5000);
	  
	  List<WebElement> BAArrowDown =  driver.findElements(By.className("android.widget.TextView"));
	  BAArrowDown.get(24).click();
}
	  @Test(priority = 38)
		public void Haemoglobin() throws InterruptedException {
		 
		  List<WebElement> Haemoglobin =  driver.findElements(By.className("android.widget.EditText"));
		  Haemoglobin.get(0).sendKeys("12");
	  Thread.sleep(5000);

}
	  @Test(priority = 39)
			public void BloodSugar() throws InterruptedException {
			 
		  List<WebElement> BloodSugar =  driver.findElements(By.className("android.widget.EditText"));
		  BloodSugar.get(0).sendKeys("120");
		  Thread.sleep(5000);

	}
	  @Test(priority = 40)
		public void BloodSugarf() throws InterruptedException {
		 
		  List<WebElement> BloodSugarf =  driver.findElements(By.className("android.widget.EditText"));
		  BloodSugarf.get(1).sendKeys("120");
		  Thread.sleep(5000);

}
	  @Test(priority = 41)
		public void BloodSugarPP() throws InterruptedException {
		 
		  List<WebElement> BloodSugarPP =  driver.findElements(By.className("android.widget.EditText"));
		  BloodSugarPP.get(2).sendKeys("10");
		  Thread.sleep(5000);
	 
} 

	  @Test(priority = 42)
		public void BloodSugarHB() throws InterruptedException {
		 
		  List<WebElement> BloodSugarHB =  driver.findElements(By.className("android.widget.EditText"));
		  BloodSugarHB.get(3).sendKeys("10");
		 
	  Thread.sleep(5000);
	  List<WebElement> BPArrowDown =  driver.findElements(By.className("android.widget.TextView"));
	  BPArrowDown.get(24).click();
	  
	  Thread.sleep(5000);
	  
	  List<WebElement> LipidArrowDown =  driver.findElements(By.className("android.widget.TextView"));
	  LipidArrowDown.get(29).click();
} 
	  @Test(priority = 43)
			public void CholesterolHDL() throws InterruptedException {
			 
		  List<WebElement> CholesterolHDL =  driver.findElements(By.className("android.widget.EditText"));
		  CholesterolHDL.get(0).sendKeys("10");
			  Thread.sleep(5000);
		 
	} 
	  @Test(priority = 44)
		public void CholesterolLDL() throws InterruptedException {
		 
		  List<WebElement> CholesterolLDL =  driver.findElements(By.className("android.widget.EditText"));
		  CholesterolLDL.get(1).sendKeys("10");
		  Thread.sleep(5000);
	 
} 
	  @Test(priority = 45)
		public void TotalCholesterol() throws InterruptedException {
		 
		  List<WebElement> TotalCholesterol =  driver.findElements(By.className("android.widget.EditText"));
		  TotalCholesterol.get(2).sendKeys("101");
		  Thread.sleep(5000);
	 
} 
	  @Test(priority = 46)
		public void Triglycerides() throws InterruptedException {
		 
		  List<WebElement> Triglycerides =  driver.findElements(By.className("android.widget.EditText"));
		  Triglycerides.get(3).sendKeys("125");
		  Thread.sleep(5000);
	 
} 
	  @Test(priority = 47)
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
