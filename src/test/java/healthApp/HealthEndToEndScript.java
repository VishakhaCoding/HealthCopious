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

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pivotalApplication.AppiumServerStart;

public class HealthEndToEndScript extends AppiumServerStart  {
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
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
		dc.setCapability("–session-override",true);
		dc.setCapability("noReset", false) ;
		//dc.setCapability("FullReset", false) ;
		dc.setCapability(MobileCapabilityType.APP, "D:\\healthapp-release-16-Aug.apk");
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
		Thread.sleep(5000);
		List<WebElement> EnglishSelect = driver.findElements(By.className("android.widget.TextView"));
		EnglishSelect.get(10).click();

		Thread.sleep(10000);
		// highlightElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));

		WebElement Number = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
		Number.sendKeys("9665002440");
		// highlightElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
	}

	@Test(priority = 1)
	public void IAgree() throws MalformedURLException, InterruptedException {
		WebElement Agree = driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
		Agree.click();
		Thread.sleep(1000);
	}

	@Test(priority = 2)
	public void proceedButton() throws MalformedURLException, InterruptedException {
		List<WebElement> proceed = driver.findElements(By.className("android.widget.TextView"));
		proceed.get(6).click();
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void OTP() throws MalformedURLException, InterruptedException {
		List<WebElement> otp1 = driver.findElements(By.className("android.widget.TextView"));
		otp1.get(7).click();

		Thread.sleep(1000);

		List<WebElement> otp2 = driver.findElements(By.xpath("//*[@text='4']"));
		otp2.get(0).click();

		Thread.sleep(1000);

		List<WebElement> otp3 = driver.findElements(By.xpath("//*[@text='0']"));
		otp3.get(1).click();

		Thread.sleep(1000);

		List<WebElement> otp4 = driver.findElements(By.xpath("//*[@text='5']"));
		otp4.get(0).click();

		Thread.sleep(1000);

		List<WebElement> otp5 = driver.findElements(By.xpath("//*[@text='2']"));
		otp5.get(0).click();

		Thread.sleep(1000);

		List<WebElement> otp6 = driver.findElements(By.xpath("//*[@text='0']"));
		otp6.get(2).click();

		Thread.sleep(5000);
	}

	@Test(priority = 4)
	public void Verify() throws MalformedURLException, InterruptedException {
		List<WebElement> verify = driver.findElements(By.xpath("//*[@text='Verify and Proceed']"));
		verify.get(0).click();

		Thread.sleep(15000);

	}

	@Test(priority = 5)
	public void Family() throws MalformedURLException, InterruptedException {
		List<WebElement> Family = driver.findElements(By.xpath("//*[@text='Family']"));
		Family.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 6)
	public void AddFamilyMember() throws MalformedURLException, InterruptedException {
		List<WebElement> AddFamilyMember = driver.findElements(By.xpath("//*[@text='+']"));
		AddFamilyMember.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 7)
	public void FirstName() throws MalformedURLException, InterruptedException {
		List<WebElement> FirstName = driver.findElements(By.xpath("//*[@text='Your First Name']"));
		FirstName.get(0).sendKeys("PMHealth");

		Thread.sleep(5000);

	}

	@Test(priority = 8)
	public void MiddleName() throws MalformedURLException, InterruptedException {
		List<WebElement> MiddleName = driver.findElements(By.xpath("//*[@text='Your Middle Name']"));
		MiddleName.get(0).sendKeys("Test");

		Thread.sleep(5000);

	}

	@Test(priority = 9)
	public void Birthdate() throws MalformedURLException, InterruptedException {
		List<WebElement> Birthdate = driver.findElements(By.className("android.widget.TextView"));
		Birthdate.get(6).click();

		Thread.sleep(5000);

		List<WebElement> Okay = driver.findElements(By.xpath("//*[@text='Okay']"));
		Okay.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 10)
	public void Male() throws MalformedURLException, InterruptedException {
		List<WebElement> Male = driver.findElements(By.xpath("//*[@text='Male']"));
		Male.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 11)
	public void SaveAndNext() throws MalformedURLException, InterruptedException {
		List<WebElement> SaveAndNext = driver.findElements(By.xpath("//*[@text='Save & Next']"));
		SaveAndNext.get(0).click();

		Thread.sleep(5000);
		List<WebElement> Okay = driver.findElements(By.xpath("//*[@text='OKAY']"));
		Okay.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 12)
	public void SelectClick() throws MalformedURLException, InterruptedException {
		List<WebElement> SelectClick = driver.findElements(By.xpath("//*[@text='Select']"));
		SelectClick.get(0).click();
		Thread.sleep(5000);
	}

	@Test(priority = 13)
	public void SelectOther() throws MalformedURLException, InterruptedException {
		List<WebElement> SelectOther = driver.findElements(By.xpath("//*[@text='Other']"));
		SelectOther.get(0).click();
		Thread.sleep(5000);
	}

	@Test(priority = 14)
	public void Next() throws MalformedURLException, InterruptedException {
		List<WebElement> Next = driver.findElements(By.xpath("//*[@text='Next']"));
		Next.get(0).click();
		Thread.sleep(5000);
	}

	@Test(priority = 15)
	public void LinkDr() throws MalformedURLException, InterruptedException {
		List<WebElement> LinkDr = driver.findElements(By.xpath("//*[@text='Dr. Vishakha  Nawale  ']"));
		LinkDr.get(0).click();
		Thread.sleep(2000);
		List<WebElement> Next = driver.findElements(By.xpath("//*[@text='Next']"));
		Next.get(0).click();
	}

	@Test(priority = 16)
	public void AddtionalInformation() throws MalformedURLException, InterruptedException {
		List<WebElement> AddtionalInformation = driver
				.findElements(By.xpath("//*[@text='Proceed for additional information']"));
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
		WebElement MedicalConditionSelect = driver.findElement(By.xpath("//*[@text='Diabetes']"));
		MedicalConditionSelect.click();

		WebElement MedicalConditionSelect1 = driver.findElement(By.xpath("//*[@text='Hypertension']"));
		MedicalConditionSelect1.click();
	}

	@Test(priority = 19)
	public void AddMedicalCondition() throws InterruptedException {
		Thread.sleep(2000);
		WebElement MedicalConditionSelect = driver.findElement(By.xpath("//*[@text='Add Medical Conditions']"));
		MedicalConditionSelect.click();
	}

	@Test(priority = 20)
	public void Allergies() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Allergies = driver.findElement(By.xpath("//*[@text='Your Allergies']"));
		Allergies.sendKeys("Dust");
	}

	@Test(priority = 21)
	public void Reactions() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Reactions = driver.findElement(By.xpath("//*[@text='Your Reactions']"));
		Reactions.sendKeys("yes");
		;
	}

	@Test(priority = 22)
	public void RecurringComplaints() throws InterruptedException {
		Thread.sleep(2000);
		WebElement RecurringComplaints = driver.findElement(By.xpath("//*[@text='Your Recurring Complaints']"));
		RecurringComplaints.sendKeys("yes");
	}

	@Test(priority = 23)
	public void HospitalizationHistory() throws InterruptedException {
		Thread.sleep(2000);
		WebElement HospitalizationHistory = driver.findElement(By.xpath("//*[@text='Your Hospitalization History']"));
		HospitalizationHistory.sendKeys("yes");
	}

	@Test(priority = 24)
	public void HealthHistory() throws InterruptedException {
		Thread.sleep(2000);
		WebElement HealthHistory = driver.findElement(By.xpath("//*[@text='Your Health History']"));
		HealthHistory.sendKeys("yes");
	}

	@Test(priority = 25)
	public void GeneticdisoredrAdd() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> GeneticdisoredrAdd = driver.findElements(By.className("android.widget.TextView"));
		GeneticdisoredrAdd.get(9).click();
	}

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
		WebElement AddGeneticdisoredr = driver.findElement(By.xpath("//*[@text='Add Genetic Disorders']"));
		AddGeneticdisoredr.click();
	}
	/*
	 * @Test(priority = 28) public void OtherEmailId() throws InterruptedException {
	 * Thread.sleep(2000); WebElement OtherEmailId
	 * =driver.findElement(By.xpath("//*[@text='Enter Other Id']"));
	 * OtherEmailId.sendKeys("abc@gmail.com");}
	 */

	@Test(priority = 29)
	public void helathNext() throws InterruptedException {
		Thread.sleep(2000);
		WebElement helathNext = driver.findElement(By.xpath("//*[@text='Next']"));
		helathNext.click();
	}

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
		WebElement FamailyNedicalHistoryselect = driver.findElement(By.xpath("//*[@text='Diabetes']"));
		FamailyNedicalHistoryselect.click();

		Thread.sleep(2000);
		WebElement AddFamailyNedical = driver.findElement(By.xpath("//*[@text='Add Family Conditions']"));
		AddFamailyNedical.click();
	}

	@Test(priority = 31)
	public void EnterDisorders() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> EnterDisorders = driver.findElements(By.className("android.widget.TextView"));
		EnterDisorders.get(4).click();

		Thread.sleep(2000);
		WebElement EnterDisordersselect = driver.findElement(By.xpath("//*[@text='Mentally challenged']"));
		EnterDisordersselect.click();

		Thread.sleep(2000);
		WebElement AddFamailyGeneticDisorder = driver
				.findElement(By.xpath("//*[@text='Add Family Genetic Disorders']"));
		AddFamailyGeneticDisorder.click();

		Thread.sleep(2000);
	}

	@Test(priority = 32)
	public void FathersName() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> Fathersheight = driver.findElements(By.className("android.widget.EditText"));
		Fathersheight.get(2).sendKeys("5");

		List<WebElement> FathersheightInch = driver.findElements(By.className("android.widget.EditText"));
		FathersheightInch.get(3).sendKeys("8");

	}

	@Test(priority = 33)
	public void MothersName() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> Mothersheight = driver.findElements(By.className("android.widget.EditText"));
		Mothersheight.get(5).sendKeys("5");

		List<WebElement> MothersheightInch = driver.findElements(By.className("android.widget.EditText"));
		MothersheightInch.get(6).sendKeys("2");

		WebElement FamilyNext = driver.findElement(By.xpath("//*[@text='Next']"));
		FamilyNext.click();
		Thread.sleep(10000);

		WebElement Proceed = driver.findElement(By.xpath("//*[@text='PROCEED']"));
		Proceed.click();
		Thread.sleep(5000);
	}
	/*
	 * @Test(priority = 34) public void BookAppointment() throws
	 * MalformedURLException, InterruptedException {
	 * 
	 * List<WebElement> AddFamilyMember =driver.findElements(By.className(
	 * "android.widget.TextView")); AddFamilyMember.get(34).click();
	 * 
	 * 
	 * List<WebElement> BookAppointment =driver.findElements(By.xpath(
	 * "//*[@text='Book Appointment']")); BookAppointment.get(0).click();
	 * 
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 */
	/*
	 * @Test(priority = 35) public void SelectFamilyMember() throws
	 * MalformedURLException, InterruptedException {
	 * 
	 * List<WebElement> SelectFamilyMember =driver.findElements(By.className(
	 * "android.view.ViewGroup")); SelectFamilyMember.get(15).click();
	 * 
	 * 
	 * Thread.sleep(2000);
	 * 
	 * }
	 * 
	 * @Test(priority = 36) public void SelectDoctor() throws MalformedURLException,
	 * InterruptedException {
	 * 
	 * List<WebElement> SelectDoctor =driver.findElements(By.xpath(
	 * "//*[@text='Select Doctor']")); SelectDoctor.get(0).click();
	 * 
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * @Test(priority = 37) public void Doctor() throws MalformedURLException,
	 * InterruptedException {
	 * 
	 * 
	 * List<WebElement> Doctor =driver.findElements(By.xpath(
	 * "//*[@text='Dr. Vishakha  Nawale ']")); Doctor.get(0).click();
	 * 
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * @Test(priority = 38) public void DateClick() throws MalformedURLException,
	 * InterruptedException {
	 * 
	 * 
	 * List<WebElement> DateClick =driver.findElements(By.xpath(
	 * "//*[@text='DD/MM/YYYY']")); DateClick.get(0).click();
	 * 
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * @Test(priority = 39) public void Time() throws MalformedURLException,
	 * InterruptedException {
	 * 
	 * 
	 * List<WebElement> Time =driver.findElements(By.xpath("//*[@text='12:10 pm']"
	 * )); Time.get(0).click();
	 * 
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * @Test(priority = 40) public void PurposeVisit() throws MalformedURLException,
	 * InterruptedException {
	 * 
	 * 
	 * List<WebElement> PurposeVisit =driver.findElements(By.xpath(
	 * "//*[@text='Enter purpose of visit']"));
	 * PurposeVisit.get(0).sendKeys("Test");
	 * 
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * @Test(priority = 41) public void CreateAppointment() throws
	 * MalformedURLException, InterruptedException {
	 * 
	 * 
	 * List<WebElement> CreateAppointment =driver.findElements(By.xpath(
	 * "//*[@text='Create Appointment']")); CreateAppointment.get(1).click();
	 * 
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * @Test(priority = 42) public void Done() throws MalformedURLException,
	 * InterruptedException {
	 * 
	 * List<WebElement> Done =driver.findElements(By.xpath( "//*[@text='Done']"));
	 * Done.get(0).click();
	 * 
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 */

	@Test(priority = 34)
	public void BookAppointment() throws MalformedURLException, InterruptedException {
		/*
		 * List<WebElement> AddFamilyMember =driver.findElements(By.className(
		 * "android.widget.TextView")); AddFamilyMember.get(34).click();
		 */

		List<WebElement> BookAppointment = driver.findElements(By.xpath("//*[@text='Book Appointment']"));
		BookAppointment.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 35)
	public void SelectFamilyMember() throws MalformedURLException, InterruptedException {

		List<WebElement> SelectFamilyMember = driver.findElements(By.className("android.view.ViewGroup"));
		SelectFamilyMember.get(15).click();

		Thread.sleep(2000);

	}

	@Test(priority = 36)
	public void SelectDoctor() throws MalformedURLException, InterruptedException {

		List<WebElement> SelectDoctor = driver.findElements(By.xpath("//*[@text='Select Doctor']"));
		SelectDoctor.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 37)
	public void Doctor() throws MalformedURLException, InterruptedException {

		List<WebElement> Doctor = driver.findElements(By.xpath("//*[@text='Dr. Vishakha  Nawale ']"));
		Doctor.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 38)
	public void DateClick() throws MalformedURLException, InterruptedException {

		List<WebElement> DateClick = driver.findElements(By.xpath("//*[@text='DD/MM/YYYY']"));
		DateClick.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 39)
	public void Time() throws MalformedURLException, InterruptedException {

		List<WebElement> Time = driver.findElements(By.xpath("//*[@text='03:20 pm']"));
		Time.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 40)
	public void PurposeVisit() throws MalformedURLException, InterruptedException {
		//List<WebElement> NewVisit = driver.findElements(By.className("//*[@text='New Visit']"));
		//NewVisit.get(0).clear();

		Thread.sleep(2000);
		List<WebElement> AddVisit = driver.findElements(By.xpath("//*[@text='󰐙']"));
		AddVisit.get(0).click();
		Thread.sleep(2000);

		List<WebElement> Followup = driver.findElements(By.xpath("//*[@text='Follow Up']"));
		Followup.get(0).click();
		Thread.sleep(2000);

		List<WebElement> CfAdd = driver.findElements(By.xpath("//*[@text='󰐙']"));
		CfAdd.get(1).click();
		Thread.sleep(2000);

		List<WebElement> CfFever = driver.findElements(By.xpath("//*[@text='Fever']"));
		CfFever.get(0).click();
		Thread.sleep(2000);

		
		  List<WebElement> CfSince =
		  driver.findElements(By.className("android.widget.EditText"));
		  CfSince.get(1).sendKeys("1"); Thread.sleep(2000);
		  
		  List<WebElement> CfMild = driver.findElements(By.xpath("//*[@text='Mild']"));
		  CfMild.get(0).click(); 
		  CfMild.get(0).click();
		  
		  Thread.sleep(2000);
		  
		  List<WebElement> CfVomitting =
		  driver.findElements(By.xpath("//*[@text='Vomitting']"));
		  CfVomitting.get(0).click(); Thread.sleep(2000);
		  
		  List<WebElement> CfSince1 =
		  driver.findElements(By.className("android.widget.EditText"));
		  CfSince1.get(1).sendKeys("1"); Thread.sleep(2000);
		 
		List<WebElement> CfAddComplains = driver.findElements(By.xpath("//*[@text='Add Complaints']"));
		CfAddComplains.get(0).click();
		Thread.sleep(2000);

		Thread.sleep(5000);

	}

	@Test(priority = 41)
	public void CreateAppointment() throws MalformedURLException, InterruptedException {

		List<WebElement> CreateAppointment = driver.findElements(By.xpath("//*[@text='Create Appointment']"));
		CreateAppointment.get(1).click();

		Thread.sleep(5000);

	}

	@Test(priority = 42)
	public void Done() throws MalformedURLException, InterruptedException {

		List<WebElement> Done = driver.findElements(By.xpath("//*[@text='Done']"));
		Done.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 43)
	public void SelectFamilyMember2() throws MalformedURLException, InterruptedException {

		Thread.sleep(5000);
		/*
		 * List<WebElement> SelectFamilyMember =driver.findElements(By.xpath(
		 * "//android.view.ViewGroup[@index='4']")); SelectFamilyMember.get(0).click();
		 */

		List<WebElement> SelectFamilyMember = driver.findElements(By.xpath("//android.view.ViewGroup[@index='3']"));
		SelectFamilyMember.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 44)
	public void AddButton1() throws MalformedURLException, InterruptedException {

		List<WebElement> AddButton1 = driver.findElements(By.className("android.widget.TextView"));
		AddButton1.get(62).click();

		Thread.sleep(5000);

	}

	@Test(priority = 45)
	public void GrowthRecord1() throws MalformedURLException, InterruptedException {

		List<WebElement> GrowthRecord1 = driver.findElements(By.xpath("//*[@text='New Growth Record']"));
		GrowthRecord1.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 46)
	public void Vital() throws MalformedURLException, InterruptedException {

		List<WebElement> weight = driver.findElements(By.className("android.widget.EditText"));
		weight.get(0).sendKeys("3");

		List<WebElement> Height = driver.findElements(By.className("android.widget.EditText"));
		Height.get(1).sendKeys("50");

		List<WebElement> HC = driver.findElements(By.className("android.widget.EditText"));
		HC.get(2).sendKeys("35");

		List<WebElement> CC = driver.findElements(By.className("android.widget.EditText"));
		CC.get(3).sendKeys("1");

		List<WebElement> Save = driver.findElements(By.xpath("//*[@text='Save']"));
		Save.get(0).click();

		Thread.sleep(10000);

	}

	/*
	 * @Test(priority = 47) public void AddButton2() throws MalformedURLException,
	 * InterruptedException {
	 * 
	 * 
	 * List<WebElement> AddButton =driver.findElements(By.className(
	 * "android.widget.TextView")); AddButton.get(62).click();
	 * 
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * @Test(priority = 48) public void AllVisits() throws MalformedURLException,
	 * InterruptedException {
	 * 
	 * 
	 * List<WebElement> AllVisits =driver.findElements(By.xpath(
	 * "//*[@text='All Visits']")); AllVisits.get(0).click();
	 * 
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * @Test(priority = 49) public void AddVitalsClick() throws
	 * MalformedURLException, InterruptedException {
	 * 
	 * 
	 * List<WebElement> AddVitalsClick =driver.findElements(By.xpath(
	 * "//*[@text='Add Vitals']")); AddVitalsClick.get(0).click();
	 * 
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * @Test(priority = 50) public void AddVitals() throws MalformedURLException,
	 * InterruptedException {
	 * 
	 * 
	 * List<WebElement> Weight =driver.findElements(By.xpath(
	 * "//*[@text='WT. (kg)']")); Weight.get(0).sendKeys("5");
	 * 
	 * 
	 * List<WebElement> height =driver.findElements(By.xpath(
	 * "//*[@text='HT. (cm)']")); height.get(0).sendKeys("100");
	 * 
	 * List<WebElement> Temperature =driver.findElements(By.xpath(
	 * "//*[@text='Temp. (F)']")); Temperature.get(0).sendKeys("98");
	 * 
	 * 
	 * 
	 * List<WebElement> SPO2 =driver.findElements(By.xpath( "//*[@text='SPO2']"));
	 * SPO2.get(1).sendKeys("100");
	 * 
	 * 
	 * List<WebElement> Haemoglobin =driver.findElements(By.xpath(
	 * "//*[@text='Haemoglobin']")); Haemoglobin.get(1).sendKeys("12");
	 * 
	 * List<WebElement> BPSys =driver.findElements(By.xpath(
	 * "//*[@text='BP (Sys)']")); BPSys.get(1).sendKeys("70");
	 * 
	 * List<WebElement> BPDia =driver.findElements(By.xpath(
	 * "//*[@text='BP (Dia)']")); BPDia.get(1).sendKeys("70");
	 * 
	 * List<WebElement> HeartRate =driver.findElements(By.xpath(
	 * "//*[@text='Heart Rate']")); HeartRate.get(1).sendKeys("72");
	 * 
	 * 
	 * System.out.println("Before scrolling ...."); driver.findElement(AppiumBy.
	 * androidUIAutomator("new UiScrollable(new UiSelector().scrollable(false).instance(0)).scrollIntoView(new UiSelector().textContains(\"Save\").instance(0))"
	 * )); //Thread.sleep(10000); //driver.findElement(AppiumBy.
	 * androidUIAutomator("new UiScrollable(new UiSelector().scrollable(false).instance(0)).scrollIntoView(new UiSelector().textContains(\"Lipid Profile\").instance(0))"
	 * )); Thread.sleep(10000);
	 * 
	 * List<WebElement> Pulse =driver.findElements(By.xpath( "//*[@text='Pulse']"));
	 * Pulse.get(1).sendKeys("78");
	 * 
	 * List<WebElement> BloodSugarR =driver.findElements(By.xpath(
	 * "//*[@text='Blood Sugar (Random)']")); BloodSugarR.get(1).sendKeys("300");
	 * 
	 * List<WebElement> BloodSugarf =driver.findElements(By.xpath(
	 * "//*[@text='Bloodsugar (F)']")); BloodSugarf.get(1).sendKeys("200");
	 * 
	 * List<WebElement> BloodSugarPP =driver.findElements(By.xpath(
	 * "//*[@text='Bloodsugar (PP)']")); BloodSugarPP.get(1).sendKeys("250");
	 * 
	 * List<WebElement> BloodSugarHB =driver.findElements(By.xpath(
	 * "//*[@text='Blood (HbA1c)']")); BloodSugarHB.get(1).sendKeys("250");
	 * 
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * @Test(priority = 51) public void LipidProfile() throws MalformedURLException,
	 * InterruptedException {
	 * 
	 * 
	 * List<WebElement> LipidArrow =driver.findElements(By.xpath(
	 * "//*[@text='Lipid Profile']")); LipidArrow.get(0).click();
	 * 
	 * List<WebElement> CholestrolHDL =driver.findElements(By.xpath(
	 * "//*[@text='Cholesterol (HDL)']")); CholestrolHDL.get(1).sendKeys("110");
	 * 
	 * List<WebElement> CholestrolLDL =driver.findElements(By.xpath(
	 * "//*[@text='Cholesterol (LDL)']")); CholestrolLDL.get(1).sendKeys("120");
	 * 
	 * System.out.println("Before scrolling ...."); driver.findElement(AppiumBy.
	 * androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Total Cholesterol\").instance(0))"
	 * )); Thread.sleep(10000);
	 * 
	 * List<WebElement> TotalCholesterol =driver.findElements(By.xpath(
	 * "//*[@text='Total Cholesterol']")); TotalCholesterol.get(1).sendKeys("140");
	 * 
	 * List<WebElement> Tryglycerides =driver.findElements(By.xpath(
	 * "//*[@text='Triglycerides']")); Tryglycerides.get(1).sendKeys("140");
	 * 
	 * List<WebElement> Save =driver.findElements(By.xpath( "//*[@text='Save']"));
	 * Save.get(0).click();
	 * 
	 * Thread.sleep(5000); }
	 */
	@Test(priority = 52)
	public void UploadDoc() throws MalformedURLException, InterruptedException {

		/*
		 * List<WebElement> BackArrow =driver.findElements(By.className(
		 * "android.widget.TextView")); BackArrow.get(0).click();
		 */

		Thread.sleep(5000);
		List<WebElement> AddButton2 = driver.findElements(By.className("android.widget.TextView"));
		AddButton2.get(62).click();

		Thread.sleep(5000);

		List<WebElement> UploadDoc = driver.findElements(By.xpath("//*[@text='Upload Documents']"));
		UploadDoc.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 53)
	public void DocumentsDropDown() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		List<WebElement> DocumentsDropDown = driver.findElements(By.className("android.widget.TextView"));
		DocumentsDropDown.get(2).click();

	}

	@Test(priority = 54)
	public void DischargeSummary() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement DischargeSummary = driver.findElement(By.xpath("//*[@text='Discharge Summary']"));
		DischargeSummary.click();

	}

	@Test(priority = 55)
	public void CreatedBy() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement CreatedBy = driver.findElement(By.xpath("//*[@text='Created By']"));
		CreatedBy.sendKeys("Doc");

	}

	@Test(priority = 56)
	public void DocumentOn() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> DocumentOn = driver.findElements(By.className("android.widget.TextView"));
		DocumentOn.get(4).click();

	}

	@Test(priority = 57)
	public void popUpOk() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement popUpOk = driver.findElement(By.xpath("//*[@text='Okay']"));
		popUpOk.click();
		Thread.sleep(2000);

	}

	@Test(priority = 58)
	public void Camera() throws InterruptedException, IndexOutOfBoundsException {
		WebElement Camera
		
		  = driver.findElement(By.xpath("//*[@text='Camera']"));
		Camera.click();
		Thread.sleep(2000);

		Thread.sleep(5000);
		WebElement Camera1

				= driver.findElement(By.xpath("//*[@text='While using the app']"));
		Camera1.click();
		Thread.sleep(2000);
		/*
		 * WebElement allow
		 * 
		 * = driver.findElement(By.xpath("//*[@text='Allow']")); allow.click();
		 */
		//WebElement allow1

	/*			= driver.findElement(By.xpath("//*[@text='Allow']"));
		allow1.click();
		Thread.sleep(2000);
		;*/

		Thread.sleep(2000);
		WebElement CameraClick = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Take picture\"]"));
		CameraClick.click();

		Thread.sleep(5000);

		WebElement UploadOk = driver.findElement(By.xpath("//*[@text='OK']"));
		UploadOk.click();

	}

	@Test(priority = 59)
	public void UploadCam() throws InterruptedException, IndexOutOfBoundsException {

		Thread.sleep(5000);
		Thread.sleep(2000);
		WebElement Upload = driver.findElement(By.xpath("//*[@text='Upload']"));
		Upload.click();
	}

	@Test(priority = 60)
	public void UploadCamOk() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		WebElement UploadOk = driver.findElement(By.xpath("//*[@text='OK']"));
		UploadOk.click();

		Thread.sleep(5000);
	}

	@Test(priority = 61)
	public void UploadDocuments1() throws InterruptedException, IndexOutOfBoundsException {
		List<WebElement> AddButton = driver.findElements(By.className("android.widget.TextView"));
		AddButton.get(62).click();
		Thread.sleep(2000);
		WebElement UploadDocuments = driver.findElement(By.xpath("//*[@text='Upload Documents']"));
		UploadDocuments.click();

	}

	@Test(priority = 62)
	public void DocumentsDropDown1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		List<WebElement> DocumentsDropDown = driver.findElements(By.className("android.widget.TextView"));
		DocumentsDropDown.get(2).click();

	}

	@Test(priority = 63)
	public void DischargeSummary1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement DischargeSummary1 = driver.findElement(By.xpath("//*[@text='Discharge Summary']"));
		DischargeSummary1.click();

	}

	@Test(priority = 64)
	public void CreatedBy1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement CreatedBy1 = driver.findElement(By.xpath("//*[@text='Created By']"));
		CreatedBy1.sendKeys("Doc1");

	}

	@Test(priority = 65)
	public void DocumentOn1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> DocumentOn = driver.findElements(By.className("android.widget.TextView"));
		DocumentOn.get(4).click();

	}

	@Test(priority = 66)
	public void popUpOk1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement popUpOk = driver.findElement(By.xpath("//*[@text='Okay']"));
		popUpOk.click();

	}

	@Test(priority = 67)
	public void Gallery() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Gallary = driver.findElement(By.xpath("//*[@text='Gallery']"));
		Gallary.click();

	}

	/*
	 * @Test(priority = 24) public void CameraAllow() throws InterruptedException,
	 * IndexOutOfBoundsException { Thread.sleep(2000); WebElement CameraAllow =
	 * driver.findElement(By.xpath("//*[@text='Allow']")); CameraAllow.click();
	 * 
	 * 
	 * 
	 * }
	 */
	@Test(priority = 68)
	public void photo() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"//android.widget.LinearLayout[@content-desc=\"Screenshot_20231214-124051_Gallery.jpg, 829 kB, 14 Dec 2023\"]"))
				.click();

	}

	@Test(priority = 69)
	public void Upload() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Upload = driver.findElement(By.xpath("//*[@text='Upload']"));
		Upload.click();

	}

	@Test(priority = 70)
	public void UploadOk() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement UploadOk = driver.findElement(By.xpath("//*[@text='OK']"));
		UploadOk.click();

		Thread.sleep(10000);
	}

	@Test(priority = 71)
	public void AddButton4() throws MalformedURLException, InterruptedException {

		Thread.sleep(5000);
		List<WebElement> AddButton2 = driver.findElements(By.className("android.widget.TextView"));
		AddButton2.get(62).click();

		Thread.sleep(5000);

	}

	@Test(priority = 72)
	public void BookLabTest11() throws MalformedURLException, InterruptedException {

		List<WebElement> BookLabTest = driver.findElements(By.xpath("//*[@text='Book Lab Test']"));
		BookLabTest.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 73)
	public void SelectLab() throws MalformedURLException, InterruptedException {

		List<WebElement> SelectLab = driver.findElements(By.xpath("//*[@text='Select Lab']"));
		SelectLab.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 74)
	public void ClickLab() throws MalformedURLException, InterruptedException {

		List<WebElement> ClickLab = driver.findElements(By.xpath("//*[@text='Uday_P_Labs']"));
		ClickLab.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 75)
	public void Comments() throws MalformedURLException, InterruptedException {

		List<WebElement> Comments = driver.findElements(By.xpath("//*[@text='Enter Comments']"));
		Comments.get(0).sendKeys("Test");

		Thread.sleep(5000);

	}

	@Test(priority = 76)
	public void VaccineLabel() throws InterruptedException, IndexOutOfBoundsException {

		Thread.sleep(5000);
		WebElement VaccineLabel = driver.findElement(By.xpath("//*[@text='Upload test requisition from your doctor']"));
		VaccineLabel.click();
		Thread.sleep(2000);
		
		
		/*
		 * WebElement Camera1
		 * 
		 * = driver.findElement(By.xpath("//*[@text='While using the app']"));
		 * Camera1.click(); Thread.sleep(2000);
		 */
		// driver.findElement(By.xpath("//*[@text='Ok']")).click();

		/*
		 * Thread.sleep(2000); WebElement allow
		 * 
		 * = driver.findElement(By.xpath("//*[@text='Allow']")); allow.click();
		 * 
		 * WebElement allow1
		 * 
		 * = driver.findElement(By.xpath("//*[@text='Allow']")); allow1.click();
		 * Thread.sleep(2000); ;
		 */

		Thread.sleep(2000);
		WebElement CameraClick = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Take picture\"]"));
		CameraClick.click();

		Thread.sleep(5000);

		WebElement UploadOk = driver.findElement(By.xpath("//*[@text='OK']"));
		UploadOk.click();

		Thread.sleep(2000);

		/*
		 * WebElement Submit = driver.findElement(By.xpath("//*[@text='Submit']"));
		 * Submit.click();
		 */

	}

	@Test(priority = 77)
	public void BookLabTest1() throws MalformedURLException, InterruptedException {

		List<WebElement> BookLabTest1 = driver.findElements(By.xpath("//*[@text='Book Lab Test']"));
		BookLabTest1.get(1).click();

		Thread.sleep(5000);

	}

	@Test(priority = 78)
	public void Done2() throws MalformedURLException, InterruptedException {

		List<WebElement> Done = driver.findElements(By.xpath("//*[@text='Done']"));
		Done.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 79)
	public void SelectFamilyMember3() throws MalformedURLException, InterruptedException {

		Thread.sleep(5000);
		List<WebElement> SelectFamilyMember = driver.findElements(By.xpath("//android.view.ViewGroup[@index='3']"));
		SelectFamilyMember.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 80)
	public void Immunization() throws MalformedURLException, InterruptedException {

		List<WebElement> Immunization = driver.findElements(By.xpath("//*[@text='Immunization']"));
		Immunization.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 81)
	public void Birth() throws MalformedURLException, InterruptedException {

		List<WebElement> Birth = driver.findElements(By.xpath("//*[@text='At Birth']"));
		Birth.get(0).click();

		Thread.sleep(5000);

		List<WebElement> BCG = driver.findElements(By.xpath("//*[@text='BCG']"));
		BCG.get(0).click();

		List<WebElement> Addvaccine = driver.findElements(By.xpath("//*[@text='Add Vaccine']"));
		Addvaccine.get(0).click();

		Thread.sleep(5000);
		List<WebElement> SelectBrand = driver.findElements(By.xpath("//*[@text='Tubaervac BCG']"));
		SelectBrand.get(0).click();

		Thread.sleep(5000);
		WebElement VaccineLabel = driver.findElement(By.xpath("//*[@text='Upload Photo of Vaccine Label']"));
		VaccineLabel.click();
		Thread.sleep(2000);
		
		/*
		 * WebElement Camera
		 * 
		 * = driver.findElement(By.xpath("//*[@text='While using the app']"));
		 * Camera.click(); Thread.sleep(2000);
		 */
		// driver.findElement(By.xpath("//*[@text='Ok']")).click();

		Thread.sleep(2000);
		/*
		 * WebElement allow
		 * 
		 * = driver.findElement(By.xpath("//*[@text='Allow']")); allow.click();
		 * 
		 * WebElement allow1
		 * 
		 * = driver.findElement(By.xpath("//*[@text='Allow']")); allow1.click();
		 * Thread.sleep(2000); ;
		 * 
		 * Thread.sleep(2000);
		 */
		WebElement CameraClick = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Take picture\"]"));
		CameraClick.click();

		Thread.sleep(5000);

		WebElement UploadOk = driver.findElement(By.xpath("//*[@text='OK']"));
		UploadOk.click();

		Thread.sleep(2000);

		WebElement Submit = driver.findElement(By.xpath("//*[@text='Submit']"));
		Submit.click();

	}

	@Test(priority = 82)
	public void PopUpOk() throws InterruptedException, IndexOutOfBoundsException {
		/*
		 * Thread.sleep(2000); WebElement PopUpOk1 =
		 * driver.findElement(By.xpath("//*[@text='OK']")); PopUpOk1.click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement Submit =driver.findElement(By.xpath("//*[@text='Submit']"));
		 * Submit.click(); Thread.sleep(2000);
		 */
		Thread.sleep(5000);
		WebElement VaccineOk = driver.findElement(By.xpath("//*[@text='OK']"));
		VaccineOk.click();

		Thread.sleep(10000);

	}

	@Test(priority = 83)
	public void AddButton2() throws MalformedURLException, InterruptedException {
		List<WebElement> BackArrow = driver.findElements(By.className("android.widget.TextView"));
		BackArrow.get(0).click();

		Thread.sleep(10000);
		List<WebElement> SelectFamilyMember = driver.findElements(By.className("android.view.ViewGroup"));
		SelectFamilyMember.get(8).click();

		Thread.sleep(5000);

		List<WebElement> AddButton = driver.findElements(By.className("android.widget.TextView"));
		AddButton.get(78).click();

		Thread.sleep(5000);

	}

	@Test(priority = 84)
	public void AllVisits() throws MalformedURLException, InterruptedException {

		List<WebElement> AllVisits = driver.findElements(By.xpath("//*[@text='All Visits']"));
		AllVisits.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 85)
	public void AddVitalsClick() throws MalformedURLException, InterruptedException {

		List<WebElement> AddVitalsClick = driver.findElements(By.xpath("//*[@text='Add Vitals']"));
		AddVitalsClick.get(0).click();

		Thread.sleep(5000);

	}

	@Test(priority = 86)
	public void AddVitals() throws MalformedURLException, InterruptedException {

		List<WebElement> Weight = driver.findElements(By.xpath("//*[@text='WT. (kg)']"));
		Weight.get(0).sendKeys("5");

		List<WebElement> height = driver.findElements(By.xpath("//*[@text='HT. (cm)']"));
		height.get(0).sendKeys("100");

		List<WebElement> Temperature = driver.findElements(By.xpath("//*[@text='Temp. (F)']"));
		Temperature.get(0).sendKeys("98");

		List<WebElement> SPO2 = driver.findElements(By.xpath("//*[@text='SPO2']"));
		SPO2.get(1).sendKeys("100");

		List<WebElement> Haemoglobin = driver.findElements(By.xpath("//*[@text='Haemoglobin']"));
		Haemoglobin.get(1).sendKeys("12");

		List<WebElement> BPSys = driver.findElements(By.xpath("//*[@text='BP (Sys)']"));
		BPSys.get(1).sendKeys("70");

		List<WebElement> BPDia = driver.findElements(By.xpath("//*[@text='BP (Dia)']"));
		BPDia.get(1).sendKeys("70");

		List<WebElement> HeartRate = driver.findElements(By.xpath("//*[@text='Heart Rate']"));
		HeartRate.get(1).sendKeys("72");

		System.out.println("Before scrolling ....");
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(false).instance(0)).scrollIntoView(new UiSelector().textContains(\"Save\").instance(0))"));
		// Thread.sleep(10000);
		// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new
		// UiSelector().scrollable(false).instance(0)).scrollIntoView(new
		// UiSelector().textContains(\"Lipid Profile\").instance(0))"));
		Thread.sleep(10000);

		List<WebElement> Pulse = driver.findElements(By.xpath("//*[@text='Pulse']"));
		Pulse.get(1).sendKeys("78");

		List<WebElement> BloodSugarR = driver.findElements(By.xpath("//*[@text='Blood Sugar (Random)']"));
		BloodSugarR.get(1).sendKeys("300");

		List<WebElement> BloodSugarf = driver.findElements(By.xpath("//*[@text='Bloodsugar (F)']"));
		BloodSugarf.get(1).sendKeys("200");

		List<WebElement> BloodSugarPP = driver.findElements(By.xpath("//*[@text='Bloodsugar (PP)']"));
		BloodSugarPP.get(1).sendKeys("250");

		List<WebElement> BloodSugarHB = driver.findElements(By.xpath("//*[@text='Blood (HbA1c)']"));
		BloodSugarHB.get(1).sendKeys("250");

		Thread.sleep(5000);

	}

	@Test(priority = 87)
	public void LipidProfile() throws MalformedURLException, InterruptedException {

		List<WebElement> LipidArrow = driver.findElements(By.xpath("//*[@text='Lipid Profile']"));
		LipidArrow.get(0).click();

		List<WebElement> CholestrolHDL = driver.findElements(By.xpath("//*[@text='Cholesterol (HDL)']"));
		CholestrolHDL.get(1).sendKeys("110");

		List<WebElement> CholestrolLDL = driver.findElements(By.xpath("//*[@text='Cholesterol (LDL)']"));
		CholestrolLDL.get(1).sendKeys("120");

		System.out.println("Before scrolling ....");
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Total Cholesterol\").instance(0))"));
		Thread.sleep(10000);

		List<WebElement> TotalCholesterol = driver.findElements(By.xpath("//*[@text='Total Cholesterol']"));
		TotalCholesterol.get(1).sendKeys("140");

		List<WebElement> Tryglycerides = driver.findElements(By.xpath("//*[@text='Triglycerides']"));
		Tryglycerides.get(1).sendKeys("140");

		List<WebElement> Save = driver.findElements(By.xpath("//*[@text='Save']"));
		Save.get(0).click();

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
