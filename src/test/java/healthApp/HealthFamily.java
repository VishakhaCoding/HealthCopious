package healthApp;

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
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pivotalApplication.AppiumServerStart;

public class HealthFamily extends AppiumServerStart {
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
	dc.setCapability(MobileCapabilityType.APP, "D:\\healthapp-release-16-Aug.apk");
	URL url = new URL("http://0.0.0.0:4723/");
	dc.setCapability("appPackage", "com.calculator_parent_apps");
	dc.setCapability("appActivity", "com.calculator_parent_apps.MainActivity");
	// AndroidDriver driver = new AndroidDriver(new
	// URL("http://127.0.0.1:4723/wd/hub"), dc); //Create driver object
	driver = new AppiumDriver(url, dc);

	Thread.sleep(10000);

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


	
	  Thread.sleep(5000);

}
@Test(priority = 5)
public void Family() throws MalformedURLException, InterruptedException {
	List<WebElement> Family =driver.findElements(By.xpath(
			"//*[@text='Family']"));
	Family.get(0).click();


	
	  Thread.sleep(5000);

}
@Test(priority = 6)
public void AddFamilyMember() throws MalformedURLException, InterruptedException {
	List<WebElement> AddFamilyMember =driver.findElements(By.xpath(
			"//*[@text='+']"));
	AddFamilyMember.get(0).click();


	
	  Thread.sleep(5000);

}
@Test(priority = 7)
public void FirstName() throws MalformedURLException, InterruptedException {
	List<WebElement> FirstName =driver.findElements(By.xpath(
			"//*[@text='Your First Name']"));
	FirstName.get(0).sendKeys("test");


	
	  Thread.sleep(5000);

}
@Test(priority = 8)
public void MiddleName() throws MalformedURLException, InterruptedException {
	List<WebElement> MiddleName =driver.findElements(By.xpath(
			"//*[@text='Your Middle Name']"));
	MiddleName.get(0).sendKeys("test");


	
	  Thread.sleep(5000);

}
@Test(priority = 9)
public void Birthdate() throws MalformedURLException, InterruptedException {
	List<WebElement> Birthdate =driver.findElements(By.className(
			"android.widget.TextView"));
	Birthdate.get(6).click();


	
	  Thread.sleep(5000);
	  
	  List<WebElement> Okay =driver.findElements(By.xpath(
				"//*[@text='Okay']"));
	  Okay.get(0).click();


		
		  Thread.sleep(5000);

}
@Test(priority = 10)
public void Male() throws MalformedURLException, InterruptedException {
	List<WebElement> Male =driver.findElements(By.xpath(
			"//*[@text='Male']"));
	Male.get(0).click();


	
	  Thread.sleep(5000);

}
@Test(priority = 11)
public void SaveAndNext() throws MalformedURLException, InterruptedException {
	List<WebElement> SaveAndNext =driver.findElements(By.xpath(
			"//*[@text='Save & Next']"));
	SaveAndNext.get(0).click();


	
	  Thread.sleep(5000);
	  List<WebElement> Okay =driver.findElements(By.xpath(
				"//*[@text='OKAY']"));
	  Okay.get(0).click();


		
		  Thread.sleep(5000);

}
@Test(priority = 12)
public void SelectClick() throws MalformedURLException, InterruptedException {
	List<WebElement> SelectClick =driver.findElements(By.xpath(
			"//*[@text='Select']"));
	SelectClick.get(0).click();
	 Thread.sleep(5000);
}
@Test(priority = 13)
public void SelectOther() throws MalformedURLException, InterruptedException {
	List<WebElement> SelectOther =driver.findElements(By.xpath(
			"//*[@text='Other']"));
	SelectOther.get(0).click();
	 Thread.sleep(5000);
}
@Test(priority = 14)
public void Next() throws MalformedURLException, InterruptedException {
	List<WebElement> Next =driver.findElements(By.xpath(
			"//*[@text='Next']"));
	Next.get(0).click();
	 Thread.sleep(5000);
}
@Test(priority = 15)
public void LinkDr() throws MalformedURLException, InterruptedException {
	List<WebElement> LinkDr =driver.findElements(By.xpath(
			"//*[@text='Dr. Vishakha  Nawale  ']"));
	LinkDr.get(0).click();
	
	List<WebElement> Next =driver.findElements(By.xpath(
			"//*[@text='Next']"));
	Next.get(0).click();
}
@Test(priority = 16)
public void AddtionalInformation() throws MalformedURLException, InterruptedException {
	List<WebElement> AddtionalInformation =driver.findElements(By.xpath(
			"//*[@text='Proceed for additional information']"));
	AddtionalInformation.get(0).click();
	
	
}
@Test(priority = 17)
public void MedicalConditionAdd() throws InterruptedException {
  Thread.sleep(2000);
  List<WebElement> MedicalConditionAdd = driver.findElements(By.className("android.widget.TextView"));
  MedicalConditionAdd.get(2).click();
}  
@Test(priority = 18)
public void MedicalConditionSelect() throws InterruptedException {
  Thread.sleep(2000);
  WebElement MedicalConditionSelect
  =driver.findElement(By.xpath("//*[@text='Diabetes']"));
  MedicalConditionSelect.click();
  
  WebElement MedicalConditionSelect1
  =driver.findElement(By.xpath("//*[@text='Hypertension']"));
  MedicalConditionSelect1.click();
}  
@Test(priority = 19)
public void AddMedicalCondition() throws InterruptedException {
  Thread.sleep(2000);
  WebElement MedicalConditionSelect
  = driver.findElement(By.xpath("//*[@text='Add Medical Conditions']"));
  MedicalConditionSelect.click();}

@Test(priority = 20)
public void Allergies() throws InterruptedException {
Thread.sleep(2000);
WebElement Allergies
=driver.findElement(By.xpath("//*[@text='Your Allergies']"));
Allergies.sendKeys("Dust");}

@Test(priority = 21)
public void Reactions() throws InterruptedException {
Thread.sleep(2000);
WebElement Reactions
= driver.findElement(By.xpath("//*[@text='Your Reactions']"));
Reactions.sendKeys("yes");;}

@Test(priority = 22)
public void RecurringComplaints() throws InterruptedException {
Thread.sleep(2000);
WebElement RecurringComplaints
= driver.findElement(By.xpath("//*[@text='Your Recurring Complaints']"));
RecurringComplaints.sendKeys("yes");}
@Test(priority = 23)
public void HospitalizationHistory() throws InterruptedException {
Thread.sleep(2000);
WebElement HospitalizationHistory
= driver.findElement(By.xpath("//*[@text='Your Hospitalization History']"));
HospitalizationHistory.sendKeys("yes");}
@Test(priority = 24)
public void HealthHistory() throws InterruptedException {
Thread.sleep(2000);
WebElement HealthHistory
= driver.findElement(By.xpath("//*[@text='Your Health History']"));
HealthHistory.sendKeys("yes");}

@Test(priority = 25)
public void GeneticdisoredrAdd() throws InterruptedException {
Thread.sleep(2000);
List<WebElement> GeneticdisoredrAdd = driver.findElements(By.className("android.widget.TextView"));
GeneticdisoredrAdd.get(9).click();}
@Test(priority = 26)
public void GeneticdisoredrSelect() throws InterruptedException {
Thread.sleep(10000);
List<WebElement> GeneticdisoredrSelect = driver.findElements(By.className("android.widget.TextView"));
GeneticdisoredrSelect.get(3).click();
Thread.sleep(2000);
List<WebElement> GeneticdisoredrSelect1 = driver.findElements(By.className("android.widget.TextView"));
GeneticdisoredrSelect1.get(19).click();



}
@Test(priority = 27)
public void AddGeneticdisoredr() throws InterruptedException {
Thread.sleep(2000);
WebElement AddGeneticdisoredr
=driver.findElement(By.xpath("//*[@text='Add Genetic Disorders']"));
AddGeneticdisoredr.click();}
/*
 * @Test(priority = 28) public void OtherEmailId() throws InterruptedException {
 * Thread.sleep(2000); WebElement OtherEmailId
 * =driver.findElement(By.xpath("//*[@text='Enter Other Id']"));
 * OtherEmailId.sendKeys("abc@gmail.com");}
 */

@Test(priority = 29)
public void helathNext() throws InterruptedException {
Thread.sleep(2000);
WebElement helathNext
=driver.findElement(By.xpath("//*[@text='Next']"));
helathNext.click();}

/*
 * @Test(priority = 30) public void FathersName() throws InterruptedException {
 * Thread.sleep(2000); WebElement FathersName
 * =driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
 * FathersName.sendKeys("Father");}
 */


/*
 * @Test(priority = 31) public void MothersName() throws InterruptedException {
 * Thread.sleep(2000); List<WebElement> MothersName =
 * driver.findElements(By.className("android.widget.EditText"));
 * MothersName.get(1).sendKeys("Mother");}
 */



@Test(priority = 30)
public void FamailyNedicalHistory() throws InterruptedException {
Thread.sleep(2000);
List<WebElement> FamailyNedicalHistory = driver.findElements(By.className("android.widget.TextView"));
FamailyNedicalHistory.get(2).click();

Thread.sleep(2000);
WebElement FamailyNedicalHistoryselect
= driver.findElement(By.xpath("//*[@text='Diabetes']"));
FamailyNedicalHistoryselect.click();


Thread.sleep(2000);
WebElement AddFamailyNedical	  = driver.findElement(By.xpath("//*[@text='Add Family Conditions']"));
AddFamailyNedical.click();
}
@Test(priority = 31)
public void EnterDisorders() throws InterruptedException {
Thread.sleep(2000);
List<WebElement> EnterDisorders = driver.findElements(By.className("android.widget.TextView"));
EnterDisorders.get(4).click();

Thread.sleep(2000);
WebElement EnterDisordersselect
=driver.findElement(By.xpath("//*[@text='Mentally challenged']"));
EnterDisordersselect.click();


Thread.sleep(2000);
WebElement AddFamailyGeneticDisorder	  = driver.findElement(By.xpath("//*[@text='Add Family Genetic Disorders']"));
AddFamailyGeneticDisorder.click();

Thread.sleep(2000);
}
  @Test(priority = 32) public void FathersName() throws InterruptedException {
  Thread.sleep(2000); List<WebElement> Fathersheight
  =driver.findElements(By.className("android.widget.EditText"));
  Fathersheight.get(2).sendKeys("5");
  
  
 List< WebElement> FathersheightInch
  =driver.findElements(By.className("android.widget.EditText"));
  FathersheightInch.get(3).sendKeys("8");
  
  
  
  }
 



  @Test(priority = 33) public void MothersName() throws InterruptedException {
  Thread.sleep(2000); List<WebElement> Mothersheight =
  driver.findElements(By.className("android.widget.EditText"));
  Mothersheight.get(5).sendKeys("5");
  
  List<WebElement> MothersheightInch =
		  driver.findElements(By.className("android.widget.EditText"));
  MothersheightInch.get(6).sendKeys("2");
 
WebElement FamilyNext
=driver.findElement(By.xpath("//*[@text='Next']"));
FamilyNext.click();
Thread.sleep(5000);

WebElement Proceed
= driver.findElement(By.xpath("//*[@text='PROCEED']"));
Proceed.click();
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
