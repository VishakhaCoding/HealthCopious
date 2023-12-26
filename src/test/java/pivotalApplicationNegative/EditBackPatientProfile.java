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
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pivotalApplication.AppiumServerStart;

public class EditBackPatientProfile extends AppiumServerStart{
	
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
	dc.setCapability(MobileCapabilityType.APP, "D:\\pivotalapp-20-june.apk");
	URL url = new URL("http://0.0.0.0:4723/");
	dc.setCapability("appPackage", "com.calculator_apps");
	dc.setCapability("appActivity", "com.calculator_apps.MainActivity");
	// AndroidDriver driver = new AndroidDriver(new
	// URL("http://127.0.0.1:4723/wd/hub"), dc); //Create driver object
	driver = new AppiumDriver(url, dc);

	Thread.sleep(5000);

}

@Test(priority = 0)
public void NumberField() throws MalformedURLException, InterruptedException {
	WebElement Number =  driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
	Number.sendKeys("9665002440");
}

@Test(priority = 1)
public void IAgree() throws MalformedURLException, InterruptedException {
	WebElement Agree =  driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
	Agree.click();
	Thread.sleep(1000);
}

@Test(priority = 2)
public void proceedButton() throws MalformedURLException, InterruptedException {
	WebElement proceed =  driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"));
	proceed.click();
	Thread.sleep(5000);
}

@Test(priority = 3)
public void OTP() throws MalformedURLException, InterruptedException {
	WebElement otp =  driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"));
	otp.sendKeys("140520");

	Thread.sleep(10000);
}

@Test(priority = 4)
public void submit() throws MalformedURLException, InterruptedException {
	WebElement submit =  driver.findElement(By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView"));
	submit.click();

	//Thread.sleep(2000);
	  Thread.sleep(2000);
	  List<WebElement> WhatsNewClose =  driver.findElements(By.className("android.widget.TextView"));
	  WhatsNewClose.get(1).click();

}

@Test(priority = 5)
public void Search() throws InterruptedException {
	Thread.sleep(2000);
	WebElement SearchIcon =  driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
	SearchIcon.click();

	Thread.sleep(2000);

	WebElement SearchBar =  driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_bar\"]"));
	SearchBar.sendKeys("PivoTotal34Automation");

	Thread.sleep(2000);
	WebElement SearchIcon1 =  driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
	SearchIcon1.click();
	Thread.sleep(2000);
	//ET

}

@Test(priority = 6)
public void close() throws InterruptedException {
	Thread.sleep(2000);
	WebElement close =  driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_close\"]"));
	close.click();

	Thread.sleep(2000);

}

@Test(priority = 7)
public void ClickPatient() throws InterruptedException, IndexOutOfBoundsException {
	Thread.sleep(2000);
	List<WebElement> Clickpatient = driver
			.findElements(By.className("android.widget.TextView"));
	Clickpatient.get(5).click();
	Thread.sleep(5000);
	
	List<WebElement> els1 =  driver.findElements(By.xpath("//*[@text='PT']"));
	els1.get(0).click();
	
	Thread.sleep(5000);
}
@Ignore
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

/*
 * @Test(priority = 9) public void MobileNumber1() throws InterruptedException {
 * Thread.sleep(2000);
 * 
 * 
 * 
 * WebElement MobileNumber1 =
 * driver.findElement(By.xpath("//*[@text='Mobile Number']"));
 * MobileNumber1.sendKeys("1000000015");
 * 
 * 
 * 
 * 
 * }
 * 
 * @Test(priority = 10) public void confirm() throws InterruptedException {
 * Thread.sleep(2000);
 * 
 * 
 * 
 * WebElement confirm = driver.findElement(By.xpath("//*[@text='Confirm']"));
 * confirm.click();
 * 
 * 
 * 
 * Thread.sleep(2000);
 * 
 * }
 * 
 * @Test(priority = 11) public void confirmPopup() throws InterruptedException {
 * Thread.sleep(2000);
 * 
 * 
 * 
 * //WebElement confirmPopup =
 * driver.findElement(By.xpath("//*[@text='Confirm']")); //
 * confirmPopup.click();
 * 
 * WebElement ProceedWithSameRMN
 * =driver.findElement(By.xpath("//*[@text='Proceed with same RMN']"));
 * ProceedWithSameRMN.click();
 * 
 * 
 * //Thread.sleep(2000);
 * 
 * Thread.sleep(2000);}
 * 
 * 
 * 
 * 
 * @Test(priority = 12) public void AdditionalNumber1() throws
 * InterruptedException { Thread.sleep(2000);
 * 
 * 
 * 
 * 
 * WebElement AdditionalNumber1 =
 * driver.findElement(By.xpath("//*[@text='Additional Mobile Number']"));
 * AdditionalNumber1.sendKeys("1234567892");
 * 
 * 
 * 
 * }
 * 
 */
@Test(priority = 9)
public void FirstName() throws InterruptedException {
	Thread.sleep(2000);

	List<WebElement> FirstName1 = driver.findElements(By.className("android.widget.EditText"));
	 FirstName1.get(2).clear();

	
	 FirstName1.get(2).sendKeys("EditNew");
	


	Thread.sleep(2000);

}
@Test(priority = 10)
public void MiddleName() throws InterruptedException {
	Thread.sleep(2000);

	List<WebElement> MiddleName1 = driver.findElements(By.className("android.widget.EditText"));
	 MiddleName1.get(3).clear();


	 MiddleName1.get(3).sendKeys("test1");
	


	Thread.sleep(2000);

}
@Test(priority = 11)
public void LastName() throws InterruptedException {
	Thread.sleep(2000);

	List<WebElement> LastName1 = driver.findElements(By.className("android.widget.EditText"));
	 LastName1.get(4).clear();

	
	 LastName1.get(4).sendKeys("test1");
	


	Thread.sleep(2000);
	
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Pincode\").instance(0))"));
	Thread.sleep(10000);

}

/*
 * @Test(priority = 16) public void BirthCalender() throws InterruptedException
 * { WebElement BirthCalender =
 * driver.findElement(By.xpath("//*[@text='DD/MM/YYYY']"));
 * BirthCalender.click();
 * 
 * 
 * Thread.sleep(2000);
 * 
 * WebElement YearDropdown = driver.findElement(By.xpath("//*[@text='2023']"));
 * YearDropdown.click();
 * 
 * Thread.sleep(2000); WebElement Year=
 * driver.findElement(By.xpath("//*[@text='2021']")); Year.click();
 * 
 * }
 * 
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
 * 
 * @Test(priority = 18) public void GenFemale() throws InterruptedException {
 * Thread.sleep(2000);
 * 
 * 
 * 
 * WebElement GenFemale = driver.findElement(By.xpath("//*[@text='Female']"));
 * GenFemale.click();
 * 
 * 
 * 
 * Thread.sleep(2000);
 * 
 * }
 */
@Test(priority = 12)
public void Address() throws InterruptedException {
	
	List<WebElement> Address1 = driver.findElements(By.className("android.widget.EditText"));
	 Address1.get(4).clear();
	

 
	 Address1.get(4).sendKeys("Pune1");
	


	Thread.sleep(2000);

}
@Test(priority = 13)
public void Area() throws InterruptedException {
	

	List<WebElement> Area1 = driver.findElements(By.className("android.widget.EditText"));
	 Area1.get(5).clear();

 
	 Area1.get(5).sendKeys("Pune1");
	


	Thread.sleep(2000);

}
@Test(priority = 14)
public void City() throws InterruptedException {
	
	List<WebElement> City1 = driver.findElements(By.className("android.widget.EditText"));
	 City1.get(6).clear();
	

 
	 City1.get(6).sendKeys("kothrud1");
	


	Thread.sleep(2000);

}
@Test(priority = 15)
	public void PinCode() throws InterruptedException {
		
	List<WebElement> PinCode1 =driver.findElements(By.className("android.widget.EditText"));
	 PinCode1.get(7).clear();
		

 
		 PinCode1.get(7).sendKeys("222222");
		


		Thread.sleep(2000);

	}
	
	  @Test(priority = 16) public void Next() throws InterruptedException {
	  
	  WebElement Next = driver.findElement(By.xpath("//*[@text='Next']"));
	  Next.click();
	  
	  Thread.sleep(15000); }
	 

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
/*
 * @Test(priority = 17) public void ContinueProfile() throws
 * InterruptedException {
 * 
 * WebElement ContinueProfile = driver.findElement(By.
 * xpath("//*[@text='Continue to complete detail profile']"));
 * ContinueProfile.click(); Thread.sleep(10000); }
 */



/*
 * @Test(priority = 18) public void TypeOfDelivery() throws InterruptedException
 * { Thread.sleep(2000); List<WebElement> TypeOfDelivery =
 * driver.findElements(By.className("android.widget.TextView"));
 * TypeOfDelivery.get(5).click();}
 * 
 * @Test(priority = 19) public void TypeOfDeliveryNormal() throws
 * InterruptedException { Thread.sleep(2000); List<WebElement>
 * TypeOfDeliveryNormal =
 * driver.findElements(By.className("android.view.ViewGroup"));
 * TypeOfDeliveryNormal.get(0).click(); }
 */


@Test(priority = 20)
	public void weightl() throws InterruptedException {
	  Thread.sleep(2000);
	  
	  List<WebElement> weight2 = driver.findElements(By.className("android.widget.EditText"));
	  weight2.get(5).clear();
	  List<WebElement> weightl = driver.findElements(By.className("android.widget.EditText"));
	  weightl.get(5).sendKeys("5");
}  
  @Test(priority = 21)
	public void Heightl() throws InterruptedException {
	  Thread.sleep(2000);
	  List<WebElement> Height2 = driver.findElements(By.className("android.widget.EditText"));
	  Height2.get(6).clear();
	  
	  List<WebElement> Heightl = driver.findElements(By.className("android.widget.EditText"));
	  Heightl.get(6).sendKeys("101");
}  
  @Test(priority = 22)
	public void HC() throws InterruptedException {
	  Thread.sleep(2000);
	  
	  
	  List<WebElement> HC1 = driver.findElements(By.className("android.widget.EditText"));
	  HC1.get(7).clear();
	  
	  
	  List<WebElement> HC = driver.findElements(By.className("android.widget.EditText"));
	  HC.get(7).sendKeys("26");
}  
  @Test(priority = 23)
	public void CC() throws InterruptedException {
	  Thread.sleep(2000);
	  List<WebElement> CC1 = driver.findElements(By.className("android.widget.EditText"));
	  CC1.get(8).clear();
	  
	  
	  List<WebElement> CC = driver.findElements(By.className("android.widget.EditText"));
	  CC.get(8).sendKeys("31");
}  
  @Test(priority = 24)
	public void BPSYS() throws InterruptedException {
	  Thread.sleep(2000);
	  
	  List<WebElement> BPSYS1 = driver.findElements(By.className("android.widget.EditText"));
	  BPSYS1.get(9).clear();
	  
	  
	  
	  List<WebElement> BPSYS = driver.findElements(By.className("android.widget.EditText"));
	  BPSYS.get(9).sendKeys("81");
}  
  @Test(priority = 25)
	public void BPDia() throws InterruptedException {
	  Thread.sleep(2000);
	  List<WebElement> BPDia1 = driver.findElements(By.className("android.widget.EditText"));
	  BPDia1.get(10).clear();
	  
	  
	  List<WebElement> BPDia = driver.findElements(By.className("android.widget.EditText"));
	  BPDia.get(10).sendKeys("121");
}  


/*
 * @Test(priority = 26) public void BloodGroup() throws InterruptedException {
 * Thread.sleep(2000);
 * 
 * 
 * 
 * List<WebElement> BloodGroup =
 * driver.findElements(By.className("android.widget.TextView"));
 * BloodGroup.get(23).click(); }
 * 
 * 
 * 
 * @Test(priority = 27) public void BloodGroupA() throws InterruptedException {
 * Thread.sleep(2000); List<WebElement> BloodGroupA =
 * driver.findElements(By.className("android.view.ViewGroup"));
 * BloodGroupA.get(2).click();
 * 
 * }
 */

  @Test(priority = 28)
	public void BirthHistoryNext() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement BirthHistoryNext
	  = driver.findElement(By.xpath("//*[@text='Next']"));
	  BirthHistoryNext.click();
	  Thread.sleep(5000);
}  
/*
 * @Test(priority = 29) public void MedicalConditionAdd() throws
 * InterruptedException { Thread.sleep(2000); List<WebElement>
 * MedicalConditionAdd =
 * driver.findElements(By.className("android.widget.TextView"));
 * MedicalConditionAdd.get(2).click(); }
 * 
 * @Test(priority = 30) public void MedicalConditionSelect() throws
 * InterruptedException { Thread.sleep(2000); WebElement MedicalConditionSelect
 * =driver.findElement(By.xpath("//*[@text='Diabetes']"));
 * MedicalConditionSelect.click();
 * 
 * WebElement MedicalConditionSelect1
 * =driver.findElement(By.xpath("//*[@text='Hypertension']"));
 * MedicalConditionSelect1.click(); }
 * 
 * @Test(priority = 31) public void AddMedicalCondition() throws
 * InterruptedException { Thread.sleep(2000); WebElement MedicalConditionSelect
 * = driver.findElement(By.xpath("//*[@text='Add Medical Conditions']"));
 * MedicalConditionSelect.click();}
 */

@Test(priority = 32)
public void Allergies() throws InterruptedException {
Thread.sleep(2000);

List<WebElement> Allergies1
=driver.findElements(By.className("android.widget.EditText"));
Allergies1.get(1).clear();



Allergies1.get(1).sendKeys("Dust1");}

@Test(priority = 33)
public void Reactions() throws InterruptedException {
Thread.sleep(2000);


List<WebElement> Reactions1
= driver.findElements(By.className("android.widget.EditText"));
Reactions1.get(2).clear();



Reactions1.get(2).sendKeys("yes1");;}

@Test(priority = 34)
public void RecurringComplaints() throws InterruptedException {
Thread.sleep(2000);

List<WebElement> RecurringComplaints1
= driver.findElements(By.className("android.widget.EditText"));
RecurringComplaints1.get(3).clear();




RecurringComplaints1.get(3).sendKeys("yes1");}
@Test(priority = 35)
public void HospitalizationHistory() throws InterruptedException {
Thread.sleep(2000);
List<WebElement> HospitalizationHistory1
= driver.findElements(By.className("android.widget.EditText"));
HospitalizationHistory1.get(4).clear();




HospitalizationHistory1.get(4).sendKeys("yes1");}
@Test(priority = 36)
public void HealthHistory() throws InterruptedException {
Thread.sleep(2000);

List<WebElement> HealthHistory1
= driver.findElements(By.className("android.widget.EditText"));
HealthHistory1.get(5).clear();



HealthHistory1.get(5).sendKeys("yes1");}

/*
 * @Test(priority = 37) public void GeneticdisoredrAdd() throws
 * InterruptedException { Thread.sleep(2000); List<WebElement>
 * GeneticdisoredrAdd =
 * driver.findElements(By.className("android.widget.TextView"));
 * GeneticdisoredrAdd.get(9).click();}
 * 
 * @Test(priority = 38) public void GeneticdisoredrSelect() throws
 * InterruptedException { Thread.sleep(10000); List<WebElement>
 * GeneticdisoredrSelect =
 * driver.findElements(By.className("android.widget.TextView"));
 * GeneticdisoredrSelect.get(3).click(); Thread.sleep(2000); List<WebElement>
 * GeneticdisoredrSelect1 =
 * driver.findElements(By.className("android.widget.TextView"));
 * GeneticdisoredrSelect1.get(19).click();
 * 
 * 
 * 
 * }
 * 
 * @Test(priority = 39) public void AddGeneticdisoredr() throws
 * InterruptedException { Thread.sleep(2000); WebElement AddGeneticdisoredr
 * =driver.findElement(By.xpath("//*[@text='Add Genetic Disorders']"));
 * AddGeneticdisoredr.click();}
 */
@Test(priority = 40)
public void OtherEmailId() throws InterruptedException {
Thread.sleep(2000);

List<WebElement> OtherEmailId1
=driver.findElements(By.className("android.widget.EditText"));
OtherEmailId1.get(8).clear();



OtherEmailId1.get(8).sendKeys("xyz@gmail.com");}

@Test(priority = 41)
public void helathNext() throws InterruptedException {
Thread.sleep(2000);
WebElement helathNext
=driver.findElement(By.xpath("//*[@text='Next']"));
helathNext.click();}

@Test(priority = 42)
public void FathersName() throws InterruptedException {
Thread.sleep(2000);
WebElement FathersName
=driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
FathersName.clear();
FathersName.sendKeys("FatherE");}


@Test(priority = 43) public void MothersName() throws InterruptedException {
Thread.sleep(2000); 
List<WebElement> MothersName = driver.findElements(By.className("android.widget.EditText"));

MothersName.get(1).clear();
MothersName.get(1).sendKeys("MotherE");}


@Test(priority = 44)
public void Fatherheight() throws InterruptedException {

Thread.sleep(2000);
List<WebElement> Fatherheight = driver.findElements(By.className("android.widget.EditText"));
Fatherheight.get(2).clear();
Fatherheight.get(2).sendKeys("6");
Thread.sleep(2000);
List<WebElement> Fatherheightnch = driver.findElements(By.className("android.widget.EditText"));
Fatherheightnch.get(3).clear();
Fatherheightnch.get(3).sendKeys("0");



}
@Test(priority = 45)
public void Mothersheight() throws InterruptedException {
Thread.sleep(2000);
List<WebElement> Mothersheight = driver.findElements(By.className("android.widget.EditText"));
Mothersheight.get(5).clear();
Mothersheight.get(5).sendKeys("5");

Thread.sleep(2000);
List<WebElement> Mothersheightinch = driver.findElements(By.className("android.widget.EditText"));
Mothersheightinch.get(6).clear();
Mothersheightinch.get(6).sendKeys("5");



}
/*
 * @Test(priority = 46) public void FamailyNedicalHistory() throws
 * InterruptedException { Thread.sleep(2000); List<WebElement>
 * FamailyNedicalHistory =
 * driver.findElements(By.className("android.widget.TextView"));
 * FamailyNedicalHistory.get(8).click();
 * 
 * Thread.sleep(2000); WebElement FamailyNedicalHistoryselect =
 * driver.findElement(By.xpath("//*[@text='Diabetes']"));
 * FamailyNedicalHistoryselect.click();
 * 
 * 
 * Thread.sleep(2000); WebElement AddFamailyNedical =
 * driver.findElement(By.xpath("//*[@text='Add Family Conditions']"));
 * AddFamailyNedical.click(); }
 * 
 * @Test(priority = 47) public void EnterDisorders() throws InterruptedException
 * { Thread.sleep(2000); List<WebElement> EnterDisorders =
 * driver.findElements(By.className("android.widget.TextView"));
 * EnterDisorders.get(10).click();
 * 
 * Thread.sleep(2000); WebElement EnterDisordersselect
 * =driver.findElement(By.xpath("//*[@text='Mentally challenged']"));
 * EnterDisordersselect.click();
 * 
 * 
 * Thread.sleep(2000); WebElement AddFamailyGeneticDisorder =
 * driver.findElement(By.xpath("//*[@text='Add Family Genetic Disorders']"));
 * AddFamailyGeneticDisorder.click();
 */
/*
 * @Test(priority = 46) public void FamailyNedicalHistory() throws
 * InterruptedException { Thread.sleep(2000); WebElement FamilyNext
 * =driver.findElement(By.xpath("//*[@text='Next']")); FamilyNext.click();
 * Thread.sleep(5000);
 * 
 * 
 * WebElement successDone = driver.findElement(By.xpath("//*[@text='Done']"));
 * successDone.click(); Thread.sleep(5000); }
 */
@Test(priority = 47) public void FamailyBackward() throws
InterruptedException {
Thread.sleep(2000);
List<WebElement> FamilyBack
=driver.findElements(By.className("android.widget.TextView"));
FamilyBack.get(0).click();
Thread.sleep(5000);

List<WebElement> HealthBack
=driver.findElements(By.className("android.widget.TextView"));
HealthBack.get(0).click();
Thread.sleep(5000);

List<WebElement> BirthHistoryBack
=driver.findElements(By.className("android.widget.TextView"));
BirthHistoryBack.get(0).click();
Thread.sleep(5000);

/*
 * List<WebElement> ProfileBack =driver.findElements(By.className("android.widget.TextView"));
 * ProfileBack.get(0).click(); Thread.sleep(5000);
 */

}
@Test(priority = 48) public void GetData() throws
InterruptedException {
	List<WebElement> Mobile1 = driver.findElements(By.className("android.widget.EditText"));
	String Mob1= Mobile1.get(0).getText();
	 System.out.println("Mobile No1= "+Mob1);
	
	
	 List<WebElement> Mobile2 = driver.findElements(By.className("android.widget.EditText"));
		String Mob2= Mobile2.get(1).getText();
		 System.out.println("Mobile No2= "+Mob2);
	
	
	
	
	List<WebElement> FirstName1 = driver.findElements(By.className("android.widget.EditText"));
	String a= FirstName1.get(2).getText();
	 System.out.println("FirstName="+a);
	 
	 List<WebElement> MiddleName1 = driver.findElements(By.className("android.widget.EditText"));
	 String b=MiddleName1.get(3).getText();
	 System.out.println("MiddleName="+b);
	 
	 
	 List<WebElement> LastName1 = driver.findElements(By.className("android.widget.EditText"));
	 String c=LastName1.get(4).getText();
	 System.out.println("Lastname="+c);
	 
	 Thread.sleep(2000);
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Pincode\").instance(0))"));
		Thread.sleep(10000);
		
		List<WebElement> Address1 = driver.findElements(By.className("android.widget.EditText"));
		String d= Address1.get(4).getText();
		 System.out.println("Address="+d);
		 
		 List<WebElement> Area1 = driver.findElements(By.className("android.widget.EditText"));
		 String e=Area1.get(5).getText();
		 System.out.println("Area="+e);
		 
			List<WebElement> City1 = driver.findElements(By.className("android.widget.EditText"));
			String f=City1.get(6).getText();
			 System.out.println("City="+f);
			 
			 List<WebElement> PinCode1 =driver.findElements(By.className("android.widget.EditText"));
			 String g=PinCode1.get(7).getText();
			 System.out.println("PonCode="+g);
			 
			  WebElement Next = driver.findElement(By.xpath("//*[@text='Next']"));
			  Next.click();
			  
			  Thread.sleep(15000); 
			  
			  List<WebElement> Dob = driver.findElements(By.className("android.widget.EditText"));
				String Dob1= Dob.get(0).getText();
				 System.out.println("Dob="+Dob1);
				 
				 List<WebElement> ExpectedDob = driver.findElements(By.className("android.widget.EditText"));
					String EDob1= ExpectedDob.get(1).getText();
					 System.out.println("ExpectedDob="+EDob1);
					 
					 List<WebElement> TypeOfDelevery= driver.findElements(By.className("android.widget.EditText"));
						String TOD= TypeOfDelevery.get(2).getText();
						 System.out.println("TypeOfDelevery="+TOD);	 
			  
			  List<WebElement> weight2 = driver.findElements(By.className("android.widget.EditText"));
			  String h= weight2.get(5).getText();
			  System.out.println("weight="+h);
			  
			  List<WebElement> Height2 = driver.findElements(By.className("android.widget.EditText"));
			  String i= Height2.get(6).getText();
			  System.out.println("Height="+i);
			  
			  List<WebElement> HC1 = driver.findElements(By.className("android.widget.EditText"));
			  String j=HC1.get(7).getText();
			  System.out.println("HC="+j);
			  
			  List<WebElement> CC1 = driver.findElements(By.className("android.widget.EditText"));
			  String k=CC1.get(8).getText();
			  System.out.println("CC="+k);
			  
			  List<WebElement> BPSYS1 = driver.findElements(By.className("android.widget.EditText"));
			  String l= BPSYS1.get(9).getText();
			  System.out.println("BPSYS="+l);
			  
			  
			  List<WebElement> BPDia1 = driver.findElements(By.className("android.widget.EditText"));
			  String m=BPDia1.get(10).getText();
			  System.out.println("BPDia="+m);
			  
			  List<WebElement> BloodGrp = driver.findElements(By.className("android.widget.EditText"));
				String BGrp= BloodGrp.get(11).getText();
				 System.out.println("BloodGrp="+BGrp);
				 
				 
				  List<WebElement> VaccStartDate = driver.findElements(By.className("android.widget.EditText"));
					String Vcc= VaccStartDate.get(12).getText();
					 System.out.println("VaccStartDate="+Vcc);
			  
			  Thread.sleep(2000);
			  WebElement BirthHistoryNext
			  = driver.findElement(By.xpath("//*[@text='Next']"));
			  BirthHistoryNext.click();
			  Thread.sleep(5000);
			  
			  List<WebElement> MedicalCondition
			  =driver.findElements(By.className("android.widget.EditText"));
			  String MC=MedicalCondition.get(0).getText();
			  System.out.println("MC="+MC);
			  
			  List<WebElement> Allergies1
			  =driver.findElements(By.className("android.widget.EditText"));
			  String n=Allergies1.get(1).getText();
			  System.out.println("Allergies="+n);
			  
			  
			  List<WebElement> Reactions1
			  = driver.findElements(By.className("android.widget.EditText"));
			  String o=Reactions1.get(2).getText();
			  System.out.println("Reactions1="+o);
			  
			  List<WebElement> RecurringComplaints1
			  = driver.findElements(By.className("android.widget.EditText"));
			  String p=RecurringComplaints1.get(3).getText();
			  System.out.println("RecurringComplaints="+p);
			  
			  List<WebElement> HospitalizationHistory1
			  = driver.findElements(By.className("android.widget.EditText"));
			  String q=HospitalizationHistory1.get(4).getText();
			  System.out.println("RecurringComplaints="+q);
			  
			  
			  List<WebElement> HealthHistory1
			  = driver.findElements(By.className("android.widget.EditText"));
			  String r=HealthHistory1.get(5).getText();
			  System.out.println("HealthHistory="+r);
			  
			  List<WebElement> GeneticDisorder
			  = driver.findElements(By.className("android.widget.EditText"));
			  String Gc=GeneticDisorder.get(6).getText();
			  System.out.println("GeneticDisorder="+Gc);
			  
			  List<WebElement> OtherEmailId1
			  =driver.findElements(By.className("android.widget.EditText"));
			  String s=OtherEmailId1.get(8).getText();
			  System.out.println("OtherEmailId1="+s);
			  
			  WebElement helathNext
			  =driver.findElement(By.xpath("//*[@text='Next']"));
			  helathNext.click();
			  Thread.sleep(5000);
			  
			  WebElement FathersName
			  =driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
			  String t =FathersName.getText();
			  System.out.println("FathersName="+t);
			  
			  List<WebElement> MothersName = driver.findElements(By.className("android.widget.EditText"));

			  String u=MothersName.get(1).getText();
			  System.out.println("MothersName="+u);
			  
			  
			  List<WebElement> Fatherheight = driver.findElements(By.className("android.widget.EditText"));
			  String v=Fatherheight.get(2).getText();
			  System.out.println("Fatherheight="+v);
			  
			  List<WebElement> Fatherheightnch = driver.findElements(By.className("android.widget.EditText"));
			  String w= Fatherheightnch.get(3).getText();
			  System.out.println("Fatherheightnch="+w);
			  
			  List<WebElement> Mothersheight = driver.findElements(By.className("android.widget.EditText"));
			  String x=Mothersheight.get(5).getText();
			  System.out.println("Mothersheight="+x);
			  
			  List<WebElement> Mothersheightinch = driver.findElements(By.className("android.widget.EditText"));
			  String y=Mothersheightinch.get(6).getText();
			  System.out.println("Mothersheightinch="+y);
			  
			  List<WebElement> FMedicalHistory = driver.findElements(By.className("android.widget.EditText"));
			  String FMedicalHistory1=FMedicalHistory.get(8).getText();
			  System.out.println("FMedicalHistory="+FMedicalHistory1);
			  
			  List<WebElement> EnterDisorder = driver.findElements(By.className("android.widget.EditText"));
			  String EnterDisorder1=EnterDisorder.get(9).getText();
			  System.out.println("EnterDisorder="+EnterDisorder1);


	
	
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
