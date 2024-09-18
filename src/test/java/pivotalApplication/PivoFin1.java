package pivotalApplication;

import java.io.File;
import pivotalApplication.AppiumServerStart;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PivoFin1 extends AppiumServerStart {
	AppiumDriver driver;
	public Object MobileElement;
	

	
	  @BeforeClass public void setup1() throws MalformedURLException,
	  InterruptedException {
	  
	  DesiredCapabilities dc = new DesiredCapabilities();
	  dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	  dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	  dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	  dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
	  
	  dc.setCapability("–session-override",true);
	  dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120000);
	  dc.setCapability("noReset", false) ;
	  dc.setCapability(MobileCapabilityType.APP, "C:\\pivotalapp-stage-vishakha.apk");
	  URL url = new
	  URL("http://0.0.0.0:4723/"); dc.setCapability("appPackage",
	  "com.calculator_apps"); dc.setCapability("appActivity",
	  "com.calculator_apps.MainActivity"); 
	  driver = new AppiumDriver(url, dc);
	  
	  Thread.sleep(10000);
	  
	  }
	 
	
	@Test(priority = 0)
	public void NumberField() throws MalformedURLException, InterruptedException {
		WebElement Number = driver.findElement(By.xpath(
				"//*[@text='Mobile Number']"));
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
		WebElement proceed = driver.findElement(By.xpath(
				"//android.widget.TextView[@text=\"\"]"));
		proceed.click();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void OTP() throws MalformedURLException, InterruptedException {
		List<WebElement> otp =  driver.findElements(By.xpath(
				"//*[@text='Enter OTP']"));
		otp.get(1).sendKeys("140520");
		
		
		
	//	List<WebElement >otp = driver.findElements(By.xpath("//*[@text='Enter OTP']"));
		//otp.get(0).sendKeys("140520");

		Thread.sleep(10000);
	}

	@Test(priority = 4)
	public void submit() throws MalformedURLException, InterruptedException {
		
		
		
		WebElement submit = driver.findElement(By.xpath(
				"//*[@text='Submit']"));
		submit.click();
		Thread.sleep(5000);
		List<WebElement> WhatsNewClose = driver.findElements(By.className("android.widget.TextView"));
		WhatsNewClose.get(1).click();
		Thread.sleep(2000);

	}

	@Test(priority = 5)
	public void Createptient() throws InterruptedException {
		Thread.sleep(2000);

		List<WebElement> Createptient = driver.findElements(By.className("android.widget.TextView"));
		//Createptient.get(14).click();
		Createptient.get(36).click();

		Thread.sleep(2000);

	}
@Ignore
	@Test(priority = 7)
	public void Neweptient() throws InterruptedException {
		Thread.sleep(10000);

		WebElement Neweptient = driver.findElement(By.xpath("//*[@text='New Patient']"));
		Neweptient.click();

		Thread.sleep(2000);

	}
@Ignore
	@Test(priority = 8)
	public void Close() throws InterruptedException {
		Thread.sleep(2000);

		List<WebElement> Close = driver.findElements(By.className("android.widget.TextView"));

		Close.get(5).click();
		Close.get(6).click();

		Thread.sleep(2000);
		List<WebElement> Close1 = driver.findElements(By.className("android.widget.TextView"));

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

		WebElement MobileNumber1 = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]"));
		MobileNumber1.sendKeys("1000000035");
		//MobileNumber1.sendKeys("9665002440");
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
		Thread.sleep(20000);

		// WebElement confirmPopup =
		// driver.findElement(By.xpath("//*[@text='Confirm']"));
		// confirmPopup.click();

		WebElement ProceedWithSameRMN = driver.findElement(By.xpath("//*[@text='Proceed with same RMN']"));
		ProceedWithSameRMN.click();

		// Thread.sleep(2000);

		Thread.sleep(2000);
	}

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
		FirstName.sendKeys("Pivotal18septBuild");
		//FirstName.sendKeys("abhaPatient1Dec");
		Thread.sleep(2000);

	}

	@Test(priority = 14)
	public void MiddleName() throws InterruptedException {
		Thread.sleep(2000);

		WebElement MiddleName = driver.findElement(By.xpath("//*[@text='Middle Name']"));
		MiddleName.sendKeys("Automation");

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
		WebElement Year = driver.findElement(By.xpath("//*[@text='2022']"));
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
	@Test(priority = 25)
	public void ContinueProfile() throws InterruptedException {

		WebElement ContinueProfile = driver.findElement(By.xpath("//*[@text='Continue to complete detail profile']"));
		ContinueProfile.click();
		Thread.sleep(10000);
	}

	@Test(priority = 26)
	public void TypeOfDelivery() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> TypeOfDelivery = driver.findElements(By.xpath("(//android.widget.TextView[@text=\"\"])[1]"));
		TypeOfDelivery.get(0).click();
	}

	@Test(priority = 27)
	public void TypeOfDeliveryNormal() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> TypeOfDeliveryNormal = driver.findElements(By.xpath("//*[@text='Normal']"));
		TypeOfDeliveryNormal.get(0).click();
	}

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

	@Test(priority = 34)
	public void BloodGroup() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> BloodGroup = driver.findElements(By.xpath("(//android.widget.TextView[@text=\"\"])[2]"));
		BloodGroup.get(0).click();
	}

	@Test(priority = 35)
	public void BloodGroupO() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> BloodGroupO = driver.findElements(By.xpath("//*[@text='O +']"));
		BloodGroupO.get(0).click();

	}

	@Test(priority = 36)
	public void BirthHistoryNext() throws InterruptedException {
		Thread.sleep(2000);
		WebElement BirthHistoryNext = driver.findElement(By.xpath("//*[@text='Next']"));
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
		WebElement MedicalConditionSelect = driver.findElement(By.xpath("//*[@text='Diabetes']"));
		MedicalConditionSelect.click();

		WebElement MedicalConditionSelect1 = driver.findElement(By.xpath("//*[@text='Hypertension']"));
		MedicalConditionSelect1.click();
	}

	@Test(priority = 39)
	public void AddMedicalCondition() throws InterruptedException {
		Thread.sleep(2000);
		WebElement MedicalConditionSelect = driver.findElement(By.xpath("//*[@text='Add Medical Conditions']"));
		MedicalConditionSelect.click();
	}

	@Test(priority = 40)
	public void Allergies() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Allergies = driver.findElement(By.xpath("//*[@text='Your Allergies']"));
		Allergies.sendKeys("Dust");
	}

	@Test(priority = 41)
	public void Reactions() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Reactions = driver.findElement(By.xpath("//*[@text='Your Reactions']"));
		Reactions.sendKeys("Test");
		;
	}

	@Test(priority = 42)
	public void RecurringComplaints() throws InterruptedException {
		Thread.sleep(2000);
		WebElement RecurringComplaints = driver.findElement(By.xpath("//*[@text='Your Recurring Complaints']"));
		RecurringComplaints.sendKeys("Test");
	}

	@Test(priority = 43)
	public void HospitalizationHistory() throws InterruptedException {
		Thread.sleep(2000);
		WebElement HospitalizationHistory = driver.findElement(By.xpath("//*[@text='Your Hospitalization History']"));
		HospitalizationHistory.sendKeys("Test");
	}

	@Test(priority = 44)
	public void HealthHistory() throws InterruptedException {
		Thread.sleep(2000);
		WebElement HealthHistory = driver.findElement(By.xpath("//*[@text='Your Health History']"));
		HealthHistory.sendKeys("Test");
	}

	@Test(priority = 45)
	public void GeneticdisoredrAdd() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> GeneticdisoredrAdd = driver.findElements(By.className("android.widget.TextView"));
		GeneticdisoredrAdd.get(9).click();
	}

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
		WebElement AddGeneticdisoredr = driver.findElement(By.xpath("//*[@text='Add Genetic Disorders']"));
		AddGeneticdisoredr.click();
	}

	@Test(priority = 48)
	public void OtherEmailId() throws InterruptedException {
		Thread.sleep(2000);
		WebElement OtherEmailId = driver.findElement(By.xpath("//*[@text='Enter Other Id']"));
		OtherEmailId.sendKeys("abc@gmail.com");
	}

	@Test(priority = 49)
	public void helathNext() throws InterruptedException {
		Thread.sleep(2000);
		WebElement helathNext = driver.findElement(By.xpath("//*[@text='Next']"));
		helathNext.click();
	}

	@Test(priority = 50)
	public void FathersName() throws InterruptedException {
		Thread.sleep(2000);
		WebElement FathersName = driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
		FathersName.sendKeys("Father");
	}

	@Test(priority = 51)
	public void MothersName() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> MothersName = driver.findElements(By.className("android.widget.EditText"));
		MothersName.get(1).sendKeys("Mother");
	}

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
	public void FamailyMedicalHistory() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> FamailyMedicalHistory = driver.findElements(By.xpath("(//android.widget.TextView[@text=\"󰐙\"])[1]"));
		FamailyMedicalHistory.get(0).click();

		Thread.sleep(5000);
		WebElement FamailyNedicalHistoryselect = driver.findElement(By.xpath("//*[@text='Diabetes']"));
		FamailyNedicalHistoryselect.click();

		Thread.sleep(2000);
		WebElement AddFamailyNedical = driver.findElement(By.xpath("//*[@text='Add Family Conditions']"));
		AddFamailyNedical.click();
	}

	@Test(priority = 55)
	public void EnterDisorders() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> EnterDisorders = driver.findElements(By.xpath("(//android.widget.TextView[@text=\"󰐙\"])[2]"));
		EnterDisorders.get(0).click();

		Thread.sleep(2000);
		WebElement EnterDisordersselect = driver.findElement(By.xpath("//*[@text='Mentally challenged']"));
		EnterDisordersselect.click();

		Thread.sleep(2000);
		WebElement AddFamailyGeneticDisorder = driver
				.findElement(By.xpath("//*[@text='Add Family Genetic Disorders']"));
		AddFamailyGeneticDisorder.click();

		Thread.sleep(2000);
		WebElement FamilyNext = driver.findElement(By.xpath("//*[@text='Next']"));
		FamilyNext.click();
		Thread.sleep(5000);

		/*
		 * WebElement successDone = driver.findElement(By.xpath("//*[@text='Done']"));
		 * successDone.click(); Thread.sleep(5000);
		 */
	}

	@Test(priority = 56)
	public void AddVital() throws InterruptedException {

		WebElement AddVital = driver.findElement(By.xpath("//*[@text='Add Vitals']"));
		AddVital.click();
		Thread.sleep(5000);

	}

	/*
	 * @Test(priority = 57) public void Continue() throws InterruptedException {
	 * 
	 * WebElement Continue = driver.findElement(By.xpath("//*[@text='Continue']"));
	 * Continue.click(); Thread.sleep(5000);
	 * 
	 * }
	 */
	@Test(priority = 58)
	public void weight() throws InterruptedException {

		List<WebElement> weight = driver.findElements(By.className("android.widget.EditText"));
		weight.get(0).sendKeys("2");

	}

	@Test(priority = 59)
	public void Height() throws InterruptedException {

		List<WebElement> Height = driver.findElements(By.className("android.widget.EditText"));
		Height.get(1).sendKeys("100");
		Thread.sleep(5000);

	}

	@Test(priority = 60)
	public void HC1() throws InterruptedException {

		List<WebElement> HC = driver.findElements(By.className("android.widget.EditText"));
		HC.get(2).sendKeys("45");
		Thread.sleep(5000);

	}

	/*
	 * @Test(priority = 61) public void CC1() throws InterruptedException {
	 * 
	 * List<WebElement> CC =
	 * driver.findElements(By.className("android.widget.EditText"));
	 * CC.get(3).sendKeys("100"); Thread.sleep(5000);
	 * 
	 * }
	 */

	@Test(priority = 62)
	public void Temperature() throws InterruptedException {

		List<WebElement> Temperature = driver.findElements(By.className("android.widget.EditText"));
		Temperature.get(4).sendKeys("77");
		Thread.sleep(5000);

	}

	@Test(priority = 63)
	public void SPO2() throws InterruptedException {

		List<WebElement> SPO2 = driver.findElements(By.className("android.widget.EditText"));
		SPO2.get(5).sendKeys("12");
		Thread.sleep(5000);
		List<WebElement> Haemoglobin = driver.findElements(By.className("android.widget.EditText"));
		Haemoglobin.get(6).sendKeys("12");
		Thread.sleep(5000);

	}

	@Test(priority = 64)
	public void UpArrow() throws InterruptedException {

		List<WebElement> UpArrow = driver.findElements(By.className("android.widget.TextView"));
		UpArrow.get(14).click();

		Thread.sleep(5000);

		List<WebElement> BPArrow = driver.findElements(By.className("android.widget.TextView"));
		BPArrow.get(19).click();
		Thread.sleep(5000);
	}

	@Test(priority = 65)
	public void BPSYS1() throws InterruptedException {

		List<WebElement> BPSYS = driver.findElements(By.className("android.widget.EditText"));
		BPSYS.get(0).sendKeys("12");
		Thread.sleep(5000);

	}

	@Test(priority = 66)
	public void BPDIA() throws InterruptedException {

		List<WebElement> BPDIA = driver.findElements(By.className("android.widget.EditText"));
		BPDIA.get(1).sendKeys("12");
		Thread.sleep(5000);

	}

	@Test(priority = 67)
	public void HeartRate() throws InterruptedException {

		List<WebElement> HeartRate = driver.findElements(By.className("android.widget.EditText"));
		HeartRate.get(2).sendKeys("12");

		driver.findElements(By.className("android.widget.EditText"));
		String a = HeartRate.get(2).getText();
		System.out.println(a);
		String Actualmsge = "12";
		Assert.assertEquals(a, Actualmsge);

		Thread.sleep(5000);

	}

	@Test(priority = 68)
	public void Pulse() throws InterruptedException {

		List<WebElement> Pulse = driver.findElements(By.className("android.widget.EditText"));
		Pulse.get(3).sendKeys("12");
		Thread.sleep(5000);

		List<WebElement> BPArrowUP = driver.findElements(By.className("android.widget.TextView"));
		BPArrowUP.get(19).click();

		Thread.sleep(5000);

		List<WebElement> BAArrowDown = driver.findElements(By.className("android.widget.TextView"));
		BAArrowDown.get(24).click();
	}

	/*
	 * @Test(priority = 69) public void Haemoglobin() throws InterruptedException {
	 * 
	 * List<WebElement> Haemoglobin =
	 * driver.findElements(By.className("android.widget.EditText"));
	 * Haemoglobin.get(0).sendKeys("12"); Thread.sleep(5000);
	 * 
	 * }
	 */
	@Test(priority = 70)
	public void BloodSugar() throws InterruptedException {
		Thread.sleep(5000);

		List<WebElement> BloodSugar = driver.findElements(By.className("android.widget.EditText"));
		BloodSugar.get(0).sendKeys("120");
		Thread.sleep(5000);

	}

	@Test(priority = 71)
	public void BloodSugarf() throws InterruptedException {

		List<WebElement> BloodSugarf = driver.findElements(By.className("android.widget.EditText"));
		BloodSugarf.get(1).sendKeys("120");
		Thread.sleep(5000);

	}

	@Test(priority = 72)
	public void BloodSugarPP() throws InterruptedException {

		List<WebElement> BloodSugarHB = driver.findElements(By.className("android.widget.EditText"));
		BloodSugarHB.get(2).sendKeys("10");
		Thread.sleep(5000);

	}

	@Test(priority = 73)
	public void BloodSugarHB() throws InterruptedException {

		List<WebElement> BloodSugarHB = driver.findElements(By.className("android.widget.EditText"));
		BloodSugarHB.get(3).sendKeys("10");

		Thread.sleep(5000);
		List<WebElement> BPArrowDown = driver.findElements(By.className("android.widget.TextView"));
		BPArrowDown.get(24).click();

		Thread.sleep(5000);

		List<WebElement> LipidArrowDown = driver.findElements(By.className("android.widget.TextView"));
		LipidArrowDown.get(29).click();

		Thread.sleep(5000);
	}

	@Test(priority = 74)
	public void CholesterolHDL() throws InterruptedException {

		List<WebElement> CholesterolHDL = driver.findElements(By.className("android.widget.EditText"));
		CholesterolHDL.get(0).sendKeys("10");
		Thread.sleep(5000);

	}

	@Test(priority = 75)
	public void CholesterolLDL() throws InterruptedException {

		List<WebElement> CholesterolLDL = driver.findElements(By.className("android.widget.EditText"));
		CholesterolLDL.get(1).sendKeys("10");
		Thread.sleep(5000);

	}

	@Test(priority = 76)
	public void TotalCholesterol() throws InterruptedException {

		List<WebElement> TotalCholesterol = driver.findElements(By.className("android.widget.EditText"));
		TotalCholesterol.get(2).sendKeys("101");
		Thread.sleep(5000);

	}

	@Test(priority = 77)
	public void Triglycerides() throws InterruptedException {

		List<WebElement> Triglycerides = driver.findElements(By.className("android.widget.EditText"));
		Triglycerides.get(3).sendKeys("125");
		Thread.sleep(5000);

	}

	@Test(priority = 78)
	public void Save() throws InterruptedException {
		WebElement Save = driver.findElement(By.xpath("//*[@text='Save']"));
		Save.click();
		Thread.sleep(10000);

	}

	@Test(priority = 79)
	public void Appointment() throws InterruptedException, IndexOutOfBoundsException {
		List<WebElement> Backward = driver.findElements(By.className("android.widget.TextView"));
		Backward.get(0).click();

		Thread.sleep(10000);
		List<WebElement> Backward1 = driver.findElements(By.xpath("//android.widget.TextView[@text=\"\"]"));
		Backward1.get(0).click();
		Thread.sleep(10000);
		
		/*
		 * WebElement SearchIcon1 = driver.findElement(pBy.xpath(
		 * "//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"
		 * )); SearchIcon1.click();
		 *
		 */
		
		  List<WebElement> Appointment =
		  driver.findElements(By.xpath("//*[@text='Appointments']"));
		  Appointment.get(0).click();
		 
	
			/*
			 * WebElement myElement2 = driver.findElement(By.xpath(
			 * "//android.widget.EditText[@content-desc=\"search_bar\"]"));
			 * myElement2.sendKeys("Pivotal2April");
			 * 
			 * Thread.sleep(2000); WebElement myElement3=driver.findElement(By.xpath(
			 * "//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"
			 * )); myElement3.click(); Thread.sleep(2000);
			 * 
			 * List<WebElement> els2 = driver.findElements(AppiumBy.xpath(
			 * "(//android.widget.TextView[@text=\"\"])[1]")); els2.get(0).click();
			 * els2.get(0).click();
			 */
	

	}

	@Test(priority = 80)
	public void SlotTime() throws InterruptedException {
		Thread.sleep(10000);
		List<WebElement> EveArrow = driver.findElements(By.xpath("//*[@text='Evening Session']"));

		EveArrow.get(0).click();
		
		Thread.sleep(5000);
		List<WebElement> SlotTime = driver.findElements(By.xpath("//*[@text='01:50 pm']"));
		//List<WebElement> SlotTime = driver.findElements(By.className("android.widget.TextView"));
		//SlotTime.get(30).click();
		SlotTime.get(0).click();
		Thread.sleep(5000);
		List<WebElement> SelectPatient = driver.findElements(By.xpath("//*[@text='Select Patient']"));
		SelectPatient.get(0).click();
		Thread.sleep(5000);
		List<WebElement> Seatchbar = driver.findElements(By.xpath("//*[@text='Name / Mobile']"));
		Seatchbar.get(0).sendKeys("Pivotal18septBuild");
		Thread.sleep(5000);
		List<WebElement> Search = driver.findElements(By.className("android.widget.TextView"));
		Search.get(1).click();
		Thread.sleep(5000);
		List<WebElement> Patient = driver.findElements(By.className("android.widget.TextView"));
		Patient.get(3).click();
		
		Thread.sleep(5000);

	}

	/*
	 * @Test(priority = 81) public void Time() throws InterruptedException {
	 * Thread.sleep(2000); List<WebElement> Time =
	 * driver.findElements(By.className("android.widget.TextView"));
	 * 
	 * Time.get(10).click();
	 * 
	 * }
	 * 
	 * @Test(priority = 82) public void SlotBook() throws InterruptedException {
	 * Thread.sleep(2000); List<WebElement> SlotBook =
	 * driver.findElements(By.className("android.widget.TextView"));
	 * 
	 * // SlotBook.get(36).click();//11;40 SlotBook.get(9).click(); // 11:10
	 * 
	 * }
	 */
	@Test(priority = 83)
	public void VideoCheckBox() throws InterruptedException {
		Thread.sleep(2000);

		List<WebElement> VideoCheckBox = driver.findElements(By.className("android.widget.TextView"));
		VideoCheckBox.get(11).click();

	}

	@Test(priority = 84)
	public void Book() throws InterruptedException {
		Thread.sleep(2000);

		WebElement BookAP = driver.findElement(By.xpath("//*[@text='Book Appointment']"));
		BookAP.click();
		Thread.sleep(5000);

	}

	@Test(priority = 85)
	public void AppointmentBookedPopup() throws InterruptedException {
		Thread.sleep(2000);

		List<WebElement> AppointmentBookedPopup = driver.findElements(By.className("android.widget.TextView"));
		AppointmentBookedPopup.get(2).click();

		Thread.sleep(5000);
		List<WebElement> Backward = driver.findElements(By.className("android.widget.TextView"));
		Backward.get(0).click();
		Thread.sleep(5000);
		
		Thread.sleep(2000);
		WebElement SearchIcon1 =  driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
		SearchIcon1.click();
	}

	@Test(priority = 86)
	public void ClickPatient() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> Clickpatient = driver.findElements(By.className("android.widget.TextView"));
		Clickpatient.get(4).click();
		Clickpatient.get(4).click();
	}

	@Test(priority = 87)
	public void prescription() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		/*
		 * List<io.appium.java_client.MobileElement> Clickpatient = driver
		 * .findElements(By.className("android.widget.TextView"));
		 * Clickpatient.get(32).click();
		 */
		WebElement prescription = driver.findElement(By.xpath("//*[@text='Prescription']"));
		prescription.click();
	}

	@Test(priority = 88)
	public void ComplaintAndDiagnosis() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> ComplaintAndDiagnosis = driver.findElements(By.xpath("//*[@text='Complaints & Diagnosis']"));
		ComplaintAndDiagnosis.get(0).click();

	}

	@Test(priority = 89)
	public void AddChiefComplaints() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> AddChiefComplaints = driver.findElements(By.className("android.widget.TextView"));
		AddChiefComplaints.get(18).click();

	}

	@Test(priority = 90)
	public void Fever() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> AddChiefComplaints = driver.findElements(By.xpath("//*[@text='Fever']"));
		AddChiefComplaints.get(0).click();

	}

	@Test(priority = 91)
	public void Details() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> Details1day =
				  driver.findElements(By.className("android.widget.EditText"));
				  Details1day.get(1).sendKeys("1");
		
		List<WebElement> WithChills =
				  driver.findElements(By.xpath("//*[@text='With Chills']"));
		  WithChills.get(0).click();

	}

	/*
	 * @Test(priority = 92) public void mild() throws InterruptedException,
	 * IndexOutOfBoundsException { Thread.sleep(2000); List<WebElement> mild =
	 * driver.findElements(By.className("android.widget.TextView"));
	 * mild.get(12).click();
	 * 
	 * }
	 */

	@Test(priority = 93)
	public void moreSymptoms() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> moreSymptoms = driver.findElements(By.className("android.widget.TextView"));
		moreSymptoms.get(7).click();

	}

	@Test(priority = 94)
	public void Since2Days() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> Since2Days = driver.findElements(By.className("android.widget.TextView"));
		Since2Days.get(9).click();

	}

	@Test(priority = 95)
	public void AddComplaint() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> AddComplaint =
				  driver.findElements(By.xpath("//*[@text='Add Complaints']"));
				  AddComplaint.get(0).click();;

	}

	@Test(priority = 96)
	public void AddWorkingDiagnosis() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> AddWorkingDiagnosis = driver.findElements(By.className("android.widget.TextView"));
		AddWorkingDiagnosis.get(23).click();

	}

	@Test(priority = 97)
	public void AcuteUrti() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> AcuteUrti = driver.findElements(By.xpath("//*[@text='ACUTE URTI']"));
		AcuteUrti.get(0).click();

	}

	@Test(priority = 98)
	public void AddDiagnosis() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> AddDiagnosis = driver.findElements(By.xpath("//*[@text='Add Diagnosis']"));
		AddDiagnosis.get(0).click();

	}

	@Test(priority = 99)
	public void Medicine() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> Medicine = driver.findElements(By.xpath("//*[@text='Medicines']"));
		Medicine.get(0).click();

	}

	@Test(priority = 100)
	public void TapToAddMedicine() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> TapToAddMedicine = driver.findElements(By.xpath("//*[@text='Tap to add Medicines']"));
		TapToAddMedicine.get(0).click();

	}

	@Test(priority = 101)
	public void SearchMedDolo() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> SearchMedDolo = driver.findElements(By.className("android.widget.EditText"));
		SearchMedDolo.get(0).sendKeys("Dolo");
		SearchMedDolo.get(0).click();
		SearchMedDolo.get(0).sendKeys("Dolo");
		List<WebElement> SearchMedDolo1 = driver.findElements(By.className("android.widget.TextView"));
		SearchMedDolo1.get(4).click();

	}

	@Test(priority = 102)
	public void AddToPrescription() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> AddToPrescription = driver.findElements(By.className("android.widget.TextView"));
		AddToPrescription.get(31).click();
	}

	@Test(priority = 103)
	public void ClickFavourite() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> ClickFavourite = driver.findElements(By.xpath("//*[@text='Favourite']"));
		ClickFavourite.get(0).click();
	}

	@Test(priority = 104)
	public void ClickFavoutiteDropdown() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> ClickFavoutiteDropdown = driver.findElements(By.className("android.widget.EditText"));
		ClickFavoutiteDropdown.get(0).click();
	}

	@Test(priority = 105)
	public void ClickFavoutiteMedDrp() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> ClickFavoutiteDropdown = driver.findElements(By.className("android.widget.TextView"));
		ClickFavoutiteDropdown.get(1).click();
	}

	@Test(priority = 106)
	public void ClickFavoutiteMedicine() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> ClickFavoutiteMedicine = driver.findElements(By.className("android.widget.TextView"));
		ClickFavoutiteMedicine.get(6).click();
	}

	@Test(priority = 107)
	public void CopyMedicine() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> popularCopyMedicine =
				  driver.findElements(By.xpath("//*[@text='Copy Medicines']"));
				  popularCopyMedicine.get(0).click();
	}

	@Test(priority = 108)
	public void popularClick() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> popularClick = driver.findElements(By.xpath("//*[@text='Popular']"));
		popularClick.get(0).click();
	}

	@Test(priority = 109)
	public void popularMedicineClick() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> popularMedicineClick = driver.findElements(By.className("android.widget.TextView"));
		popularMedicineClick.get(3).click();

		/*
		 * List<io.appium.java_client.MobileElement> popularMedicineClick1 =
		 * driver.findElements(By.className("android.widget.TextView"));
		 * popularMedicineClick1.get(33).click();
		 * 
		 * MobileElement li= (MobileElement)driver.findElement(MobileBy.
		 * AndroidUIAutomator("new UiScrollable(new UiSelector().description(\"text\"));"
		 * ));
		 */

	}

	@Test(priority = 110)
	public void popularCopyMedicine() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> popularCopyMedicine = driver.findElements(By.xpath("//*[@text='Copy Medicines']"));
		popularCopyMedicine.get(0).click();
	}

	/*
	 * //close medicine Thread.sleep(2000);
	 * List<io.appium.java_client.MobileElement> popularMedicineClick =
	 * driver.findElements(By.className("android.widget.TextView"));
	 * popularMedicineClick.get(17).click();
	 */

//}

	@Test(priority = 111)
	public void DietAndNutrition() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement DietAndNutrition = driver.findElement(By.xpath("//*[@text='Diet & Nutrition']"));
		DietAndNutrition.click();

	}

	@Test(priority = 112)
	public void DietAndNutritionAdd() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> DietAndNutritionAdd = driver.findElements(By.className("android.widget.TextView"));
		DietAndNutritionAdd.get(28).click();

	}

	@Test(priority = 113)
	public void DietAdvice() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);

		WebElement DietAdvice = driver.findElement(By.xpath("//*[@text='Balanced diet']"));
		DietAdvice.click();
	}

	@Test(priority = 114)
	public void AddDietAdvice() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);

		WebElement DietAdvice = driver.findElement(By.xpath("//*[@text='Add Dietary Advice']"));
		DietAdvice.click();

	}

	@Test(priority = 115)
	public void GeneralInstructions() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);

		WebElement GeneralInstructions = driver.findElement(By.xpath("//*[@text='General Instructions']"));
		GeneralInstructions.click();
	}

	@Test(priority = 116)
	public void GeneralInstructionsAdd() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> GeneralInstructionsAdd = driver.findElements(By.className("android.widget.TextView"));
		GeneralInstructionsAdd.get(33).click();

	}

	@Test(priority = 117)
	public void InstructionsAdd() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);

		WebElement InstructionsAdd = driver.findElement(By.xpath("//*[@text='Doodh halad']"));
		InstructionsAdd.click();
	}

	@Test(priority = 118)
	public void Instructions() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);

		WebElement Instructions = driver.findElement(By.xpath("//*[@text='Add Instructions']"));
		Instructions.click();
	}

	@Test(priority = 119)
	public void NextFollowup() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement NextFollowup = driver.findElement(By.xpath("//*[@text='Next Followup']"));
		NextFollowup.click();
		Thread.sleep(2000);
	}

	@Test(priority = 120)
	public void NextFollowupCln7der() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);

		List<WebElement> NextFollowupClnder = driver.findElements(By.className("android.widget.TextView"));
		NextFollowupClnder.get(38).click();
	}

	/*
	 * @Test(priority=42) public void calenderDrpdwn() throws InterruptedException,
	 * IndexOutOfBoundsException{ Thread.sleep(2000);
	 * 
	 * 
	 * List<io.appium.java_client.MobileElement> calenderDrpdwn =
	 * driver.findElements(By.className("android.widget.TextView"));
	 * calenderDrpdwn.get(1).click(); }
	 * 
	 * @Test(priority=43) public void calenderDrpdwnDate() throws
	 * InterruptedException, IndexOutOfBoundsException{ Thread.sleep(2000);
	 * 
	 * 
	 * List<io.appium.java_client.MobileElement> calenderDrpdwnDate =
	 * driver.findElements(By.className("android.widget.TextView"));
	 * calenderDrpdwnDate.get(4).click(); }
	 */
	@Test(priority = 121)
	public void NextOk() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);

		WebElement NextOk = driver.findElement(By.xpath("//*[@text='Ok']"));
		NextOk.click();
	}

	@Test(priority = 122)
	public void NextVistTab() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);

		WebElement NextVistTab = driver.findElement(By.xpath("//*[@text='Visit']"));
		NextVistTab.click();
	}

	@Test(priority = 123)
	public void PreviewPrescription() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);

		WebElement PreviewPrescription = driver.findElement(By.xpath("//*[@text='Preview']"));
		PreviewPrescription.click();
	}

	@Test(priority = 124)
	public void SaveAndShare() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(10000);

		List<WebElement> SaveAndShare = driver.findElements(By.className("android.widget.TextView"));
		SaveAndShare.get(4).click();
	}

	/*
	 * @Test(priority = 125) public void DownloadPrint() throws
	 * InterruptedException, IndexOutOfBoundsException { Thread.sleep(5000);
	 * 
	 * List<WebElement> DownloadPrint = driver
	 * .findElements(By.className("android.widget.TextView"));
	 * DownloadPrint.get(8).click();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	@Test(priority = 126)
	public void DownloadBack() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);

		List<WebElement> DownloadCancel = driver.findElements(By.xpath("//*[@text='Cancel']"));
		DownloadCancel.get(0).click();

		Thread.sleep(5000);

		List<WebElement> Backward = driver.findElements(By.className("android.widget.TextView"));
		Backward.get(0).click();
		Thread.sleep(5000);

		List<WebElement> Backward1 = driver.findElements(By.className("android.widget.TextView"));
		Backward1.get(0).click();
		Thread.sleep(5000);

	}

	@Test(priority = 127)
	public void ImmunizationClick() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement ImmunizationClick = driver.findElement(By.xpath("//*[@text='Immunization']"));
		ImmunizationClick.click();

	}
	/*
	 * @Test(priority = 9) public void BulkCancel() throws InterruptedException,
	 * IndexOutOfBoundsException { Thread.sleep(5000); WebElement BulkCancel =
	 * driver.findElement(By.xpath("//*[@text='Cancel']")); BulkCancel.click();
	 */

//}

	@Test(priority = 128)
	public void AtBirth() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		WebElement AtBirth = driver.findElement(By.xpath("//*[@text='At Birth']"));
		AtBirth.click();

	}

	@Test(priority = 129)
	public void AddVaccine() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement AddVaccine = driver.findElement(By.xpath("//*[@text='Add Vaccine']"));
		AddVaccine.click();

	}

	@Test(priority = 130)
	public void SelectBrand() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement SelectBrand = driver.findElement(By.xpath("//*[@text='Tubaervac BCG']"));
		SelectBrand.click();

	}

	@Test(priority = 131)
	public void SelectDate() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement SelectDate = driver.findElement(By.xpath("//*[@text='Select Date']"));
		SelectDate.click();

		Thread.sleep(5000);
		WebElement popupOk = driver.findElement(By.xpath("//*[@text='Ok']"));
		popupOk.click();

	}

	@Test(priority = 132)
	public void VaccineLabel() throws InterruptedException, IndexOutOfBoundsException {

		Thread.sleep(5000);
		WebElement VaccineLabel = driver.findElement(By.xpath("//*[@text='Upload Photo of Vaccine Label']"));
		VaccineLabel.click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@text='Ok']")).click();
		
		WebElement Camera

		= driver.findElement(By.xpath("//*[@text='While using the app']"));
Camera.click();
Thread.sleep(2000);

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
		 */

		Thread.sleep(2000);
		WebElement CameraClick = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Take picture\"]"));
		CameraClick.click();

		Thread.sleep(10000);

		WebElement UploadOk = driver.findElement(By.xpath("//*[@text='OK']"));
		UploadOk.click();

		Thread.sleep(10000);

		WebElement Submit = driver.findElement(By.xpath("//*[@text='Submit']"));
		Submit.click();

	}

	/*
	 * @Test(priority = 133) public void PopUpOkch() throws InterruptedException,
	 * IndexOutOfBoundsException { Thread.sleep(2000); WebElement PopUpOk1 =
	 * driver.findElement(By.xpath("//*[@text='OK']")); PopUpOk1.click();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * 
	 * WebElement Submit =driver.findElement(By.xpath("//*[@text='Submit']"));
	 * Submit.click();
	 * 
	 * 
	 * }
	 */

	
	
	  @Test(priority = 134) public void BulkUpdate() throws InterruptedException,
	  IndexOutOfBoundsException { Thread.sleep(10000); WebElement BulkUpdate =
	  driver.findElement(By.xpath("//*[@text='Bulk-Update']")); BulkUpdate.click();
	  
	  Thread.sleep(5000);
	  
	  }
	  
	 
	@Test(priority = 135)
	public void PCV() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement PCV = driver.findElement(By.xpath("//*[@text='Hib-1']"));
		PCV.click();

		Thread.sleep(2000);

	}

	@Test(priority = 136)
	public void IPV() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement IPV = driver.findElement(By.xpath("//*[@text='IPV-2']"));
		IPV.click();

		Thread.sleep(2000);

	}

	@Test(priority = 137)
	public void Rotavirus() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Rotavirus = driver.findElement(By.xpath("//*[@text='Rotavirus-1']"));
		Rotavirus.click();

		Thread.sleep(2000);

	}

	@Test(priority = 138)
	public void AddToSchedule() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement AddToSchedule = driver.findElement(By.xpath("//*[@text='Add To Schedule']"));
		AddToSchedule.click();

		Thread.sleep(2000);

	}

	@Test(priority = 139)
	public void BulkUpdate1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		WebElement BulkUpdate = driver.findElement(By.xpath("//*[@text='Bulk-Update']"));
		BulkUpdate.click();

		Thread.sleep(5000);

	}

	@Test(priority = 140)
	public void TransScript() throws InterruptedException, IndexOutOfBoundsException {
		// Thread.sleep(2000); WebElement BulkUpdate =
		// driver.findElement(By.xpath("//*[@text='Bulk-Update']")); BulkUpdate.click();

		// Thread.sleep(5000);
		// Thread.sleep(30000);
		WebElement TransScript = driver.findElement(By.xpath("//*[@text='+Transcript']"));
		TransScript.click();

		// List<WebElement> TransScript =
		// driver.findElements(By.className("android.view.ViewGroup"));
		// TransScript.get(2).click();

		Thread.sleep(5000);
		// Thread.sleep(40000);
	}

	@Test(priority = 141)
	public void CreatedBy() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(10000);
		WebElement CreatedBy = driver.findElement(By.xpath("//*[@text='Created By']"));
		CreatedBy.sendKeys("abc");

		Thread.sleep(5000);

	}

	@Test(priority = 142)
	public void DocumentOn() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> DocumentOn = driver.findElements(By.className("android.widget.TextView"));
		DocumentOn.get(5).click();

		Thread.sleep(5000);

	}

	@Test(priority = 143)
	public void popoupOk() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement popoupOk = driver.findElement(By.xpath("//*[@text='Ok']"));
		popoupOk.click();

		Thread.sleep(2000);

	}

	@Test(priority = 144)
	public void Gallaries() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Gallaries = driver.findElement(By.xpath("//*[@text='Gallery']"));
		Gallaries.click();

		/*
		 * Thread.sleep(5000); WebElement GallariesAllow =
		 * driver.findElement(By.xpath("//*[@text='Allow']")); GallariesAllow.click();
		 * 
		 * Thread.sleep(5000);
		 */
	}

	/*
	 * @Test(priority = 26) public void GallariesAllow() throws
	 * InterruptedException, IndexOutOfBoundsException { Thread.sleep(2000);
	 * WebElement GallariesAllow =
	 * driver.findElement(By.xpath("//*[@text='Allow']")); GallariesAllow.click();
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 */

	@Test(priority = 145)
	public void GallariesPhoto() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"(//android.widget.ImageView[@resource-id=\"com.google.android.documentsui:id/icon_thumb\"])[1]"))
				.click();

		Thread.sleep(5000);

	}

	@Test(priority = 146)
	public void Upload() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Upload = driver.findElement(By.xpath("//*[@text='Upload']"));
		Upload.click();

		Thread.sleep(5000);

	}

	@Test(priority = 147)
	public void UploadOk() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement UploadOk = driver.findElement(By.xpath("//*[@text='OK']"));
		UploadOk.click();

		Thread.sleep(5000);

	}

	@Test(priority = 148)
	public void TransScript1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement TransScript = driver.findElement(By.xpath("//*[@text='+Transcript']"));
		TransScript.click();

		Thread.sleep(2000);
		WebElement CreatedBy = driver.findElement(By.xpath("//*[@text='Created By']"));
		CreatedBy.sendKeys("abc");

		Thread.sleep(5000);
		// Thread.sleep(2000);
		List<WebElement> DocumentOn = driver.findElements(By.className("android.widget.TextView"));
		DocumentOn.get(5).click();

		Thread.sleep(5000);
		WebElement popoupOk = driver.findElement(By.xpath("//*[@text='Ok']"));
		popoupOk.click();
		Thread.sleep(5000);

		WebElement Camera

				= driver.findElement(By.xpath("//*[@text='Camera']"));
		Camera.click();
		Thread.sleep(2000);
		
		//WebElement Camera1

	/*	= driver.findElement(By.xpath("//*[@text='While using the app']"));
Camera1.click();
Thread.sleep(2000);*/

		/*
		 * WebElement allow
		 * 
		 * = driver.findElement(By.xpath("//*[@text='Allow']")); allow.click();
		 * 
		 * 
		 * 
		 * WebElement allow1
		 * 
		 * = driver.findElement(By.xpath("//*[@text='Allow']")); allow1.click();
		 * Thread.sleep(2000); ;
		 */

		Thread.sleep(5000);
		WebElement CameraClick = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Take picture\"]"));
		CameraClick.click();

		Thread.sleep(10000);

		WebElement UploadOk = driver.findElement(By.xpath("//*[@text='OK']"));
		UploadOk.click();
		Thread.sleep(5000);
		WebElement Upload = driver.findElement(By.xpath("//*[@text='Upload']"));
		Upload.click();
		Thread.sleep(5000);
		WebElement UploadOk1 = driver.findElement(By.xpath("//*[@text='OK']"));
		UploadOk1.click();

		Thread.sleep(5000);

		List<WebElement> Backward = driver.findElements(By.className("android.widget.TextView"));
		Backward.get(10).click();
		Thread.sleep(5000);

		List<WebElement> Backward1 = driver.findElements(By.className("android.widget.TextView"));
		Backward1.get(0).click();
		Thread.sleep(5000);

	}

	@Test(priority = 149)
	public void ImmunizationGovClick() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement ImmunizationGovClick = driver.findElement(By.xpath("//*[@text='Immunization - Govt']"));
		ImmunizationGovClick.click();

	}

	
	
	
	
	
	  @Test(priority = 150) public void BulkCancel() throws InterruptedException,
	  IndexOutOfBoundsException { Thread.sleep(10000);
	  
	  
	  
	  
	  //WebElement BulkCancel = driver.findElement(By.xpath("//*[@text='Cancel']"));
	  //BulkCancel.click();
	  
	  
	  try {
          // Try to find and click the element
          WebElement element = driver.findElement(By.xpath("//*[@text='Cancel']"));
          element.click();
      } catch (NoSuchElementException e) {
          // Element not found, click on the next element
          WebElement nextElement = driver.findElement(By.xpath("//*[@text='Patient Name']"));
          nextElement.click();
      }
	  
	  
	  }
	 
	 
	 
	 
	 
		
		  @Test(priority = 151) public void opvO() throws InterruptedException,
		  IndexOutOfBoundsException { Thread.sleep(2000); WebElement opvO =
		  driver.findElement(By.xpath("//*[@text='OPV-0']")); opvO.click();
		  
		  }
		 

	@Test(priority = 152)
	public void SaveVaccine() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement SaveVaccine = driver.findElement(By.xpath("//*[@text='SAVE VACCINE']"));
		SaveVaccine.click();

	}

	@Test(priority = 153)
	public void IPV1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement IPV1 = driver.findElement(By.xpath("//*[@text='IPV-1']"));
		IPV1.click();

	}

	@Test(priority = 154)
	public void SaveVaccine1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement SaveVaccine = driver.findElement(By.xpath("//*[@text='SAVE VACCINE']"));
		SaveVaccine.click();

	}

	@Test(priority = 155)
	public void HepB() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement HepB = driver.findElement(By.xpath("//*[@text='Hep-B']"));
		HepB.click();

	}

	@Test(priority = 156)
	public void SaveVaccine2() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement SaveVaccine = driver.findElement(By.xpath("//*[@text='SAVE VACCINE']"));
		SaveVaccine.click();

	}

	@Test(priority = 157)
	public void Transscript() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Transscript = driver.findElement(By.xpath("//*[@text='+Transcript']"));
		Transscript.click();

	}

	@Test(priority = 158)
	public void CreatedBy2() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement CreatedBy = driver.findElement(By.xpath("//*[@text='Created By']"));
		CreatedBy.sendKeys("GovVcc");

	}

	@Test(priority = 159)
	public void DocumentOn2() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> DocumentOn = driver.findElements(By.className("android.widget.TextView"));
		DocumentOn.get(5).click();

	}

	@Test(priority = 160)
	public void popUpOk() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement popUpOk = driver.findElement(By.xpath("//*[@text='Ok']"));
		popUpOk.click();

	}

	@Test(priority = 161)
	public void Camera() throws InterruptedException, IndexOutOfBoundsException {

		Thread.sleep(5000);
		WebElement Camera

				= driver.findElement(By.xpath("//*[@text='Camera']"));
		Camera.click();
		Thread.sleep(2000);
		
		//WebElement Camera2

		/*= driver.findElement(By.xpath("//*[@text='While using the app']"));
Camera2.click();
Thread.sleep(2000);*/
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

		Thread.sleep(10000);

		WebElement UploadOk = driver.findElement(By.xpath("//*[@text='OK']"));
		UploadOk.click();

	}

	@Test(priority = 162)
	public void UploadCam() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Upload = driver.findElement(By.xpath("//*[@text='Upload']"));
		Upload.click();
	}

	@Test(priority = 163)
	public void UploadCamOk() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(10000);
		WebElement UploadOk = driver.findElement(By.xpath("//*[@text='OK']"));
		UploadOk.click();

	}

	@Test(priority = 164)
	public void Transscript1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Transscript = driver.findElement(By.xpath("//*[@text='+Transcript']"));
		Transscript.click();

	}

	@Test(priority = 165)
	public void CreatedBy1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement CreatedBy = driver.findElement(By.xpath("//*[@text='Created By']"));
		CreatedBy.sendKeys("GovVcc");

	}

	@Test(priority = 166)
	public void DocumentOn1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> DocumentOn = driver.findElements(By.className("android.widget.TextView"));
		DocumentOn.get(5).click();

	}

	@Test(priority = 167)
	public void popUpOk1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement popUpOk = driver.findElement(By.xpath("//*[@text='Ok']"));
		popUpOk.click();

	}

	@Test(priority = 168)
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
	@Test(priority = 169)
	public void photo() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"(//android.widget.ImageView[@resource-id=\"com.google.android.documentsui:id/icon_thumb\"])[1]"))
				.click();

	}

	@Test(priority = 170)
	public void Upload1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Upload = driver.findElement(By.xpath("//*[@text='Upload']"));
		Upload.click();

	}

	@Test(priority = 171)
	public void UploadOk1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(10000);
		WebElement UploadOk = driver.findElement(By.xpath("//*[@text='OK']"));
		UploadOk.click();

		List<WebElement> Backward1 = driver.findElements(By.className("android.widget.TextView"));
		Backward1.get(12).click();
		Thread.sleep(5000);
	}
	@Test(priority = 172)
	public void ImmunizationClick1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement ImmunizationClick
		  = driver.findElement(By.xpath("//*[@text='Immunization']"));
		  ImmunizationClick.click();

		

	}
	@Test(priority = 173)
	public void Records() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		WebElement Records
		  = driver.findElement(By.xpath("//*[@text='Records']"));
		  Records.click();

		

	}
	@Test(priority = 174)
	public void Certificates() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		WebElement Certificates
		  = driver.findElement(By.xpath("//*[@text='Certificates']"));
		  Certificates.click();

		

	}
	@Test(priority = 175)
	public void SelectVaciines() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		List<WebElement> SelectVaciines = driver.findElements(By.className("android.widget.EditText"));
		SelectVaciines.get(1).click();
		
		

	}
	@Test(priority = 176)
	public void Proceed() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		WebElement Proceed
		  = driver.findElement(By.xpath("//*[@text='Proceed']"));
		  Proceed.click();

		

	}
	@Test(priority = 177)
	public void SpecialityDropdown() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		WebElement SpecialityDropdown
		  = driver.findElement(By.xpath("//*[@text='Speciality']"));
		  SpecialityDropdown.click();

		

	}
	@Test(priority = 178)
	public void DefaultV3() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		WebElement DefaultV3
		  = driver.findElement(By.xpath("//*[@text='default.v3']"));
		  DefaultV3.click();

		

	}
	@Test(priority = 179)
	public void Preview() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		WebElement Preview
		  =driver.findElement(By.xpath("//*[@text='Preview']"));
		 Preview.click();
		

	}
	@Test(priority = 180)
	public void Print() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		
		
		/*
		 * WebElement Print = driver.findElement(By.xpath("//*[@text='Print']"));
		 * Print.click();
		 */
		 
		 
		 
		
		/*
		 * WebElement SaveAndShare =
		 * driver.findElement(By.xpath("//*[@text='Save & Share']"));
		 * SaveAndShare.click();
		 */
		 
		
		  List<WebElement> close =
				  driver.findElements(By.className("android.widget.TextView"));
				  close.get(0).click(); Thread.sleep(5000);
				  
				  List<WebElement> ClickBack =
				  driver.findElements(By.className("android.widget.TextView"));
				  ClickBack.get(0).click();
				  
				  Thread.sleep(5000);
				  
				  List< WebElement> ClickBack1 =
							/*
							 * driver.findElements(By.className("android.view.ViewGroup"));
							 * ClickBack1.get(2).click();
							 */
				  
				  driver.findElements(By.className("android.widget.TextView"));
				  ClickBack1.get(10).click();
				  
				  Thread.sleep(5000);
				  
				  List< WebElement> ClickBack2 =
						  driver.findElements(By.className("android.widget.TextView"));
						  ClickBack2.get(13).click();
						  
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
