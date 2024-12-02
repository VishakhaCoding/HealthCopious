package webAuto;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Vaccination_Module {
	public static WebDriver driver;

	public static String doctorLoginLink = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
	 public static String mobileNumber="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	    public static String sendOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	    public static String verifyOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	    public static String createPatient="createPatient";
	    public static String Number1="//*[text()='Profile']//following::input[4]";
	    public static String confirm="//*[text()='Confirm']";
	    public static String confirmPopup="//button[text()='Confirm']";
	    public static String number2="//*[text()='Profile']//following::input[6]";
	    public static String firstName="//*[text()='Profile']//following::input[7]";
	    public static String middleName="//*[text()='Profile']//following::input[8]";
	    public static String lastName="//*[text()='Profile']//following::input[9]";
	    public static String birthDate="//*[text()='Profile']//following::button[5]";
	    public static String genFemale="//*[text()='Female']";
	    public static String address="//*[text()='Profile']//following::input[12]";
	    public static String locality="//*[text()='Profile']//following::input[13]";
	    public static String city="//*[text()='Profile']//following::input[14]";
	    public static String pinCode="//*[text()='Profile']//following::input[15]";
	    public static String Next="//*[text()=' Next']";
	    public static String proceedWithSameRMN="//*[text()='Proceed With same RMN ']";
	    public static String clickClose="//*[text()='Continue to complete detail profile']";
	    public static String selectDelivery="//*[text()='Antenetal & Birth History']//following::span[17]";
	    public static String normalDelivery="//*[text()='Normal']";
	    public static String weight="//*[text()='Antenetal & Birth History']//following::input[22]";
	    public static String height="//*[text()='Antenetal & Birth History']//following::input[23]";
	    public static String HC="//*[text()='Antenetal & Birth History']//following::input[24]";
	    public static String CC="//*[text()='Antenetal & Birth History']//following::input[25]";
	    public static String BP="//*[text()='Antenetal & Birth History']//following::input[26]";
	    public static String BPdia="//*[text()='Antenetal & Birth History']//following::input[27]";
	    public static String vaccinationDate="//*[@id='mat-input-94']";
	    public static String bloodGrp="//*[text()='Antenetal & Birth History']//following::span[24]";
	    public static String bloodGrpOplus="//*[text()='O+']";
	    public static String antentalNext="//*[text()=' Back']//following::button[5]";
	    public static String medicalConditions="//*[text()='Health Profile']//following::input[19]";
	    //public static String medicalConditions="//*[text()='Health Profile']//following::span[45]";
	   // public static String SectmedicalConditions="//*[text()='Diabetes']";
	   // public static String AddmedicalConditions="//*[text()='Add Medical Conditions']";
	    
	    
	    public static String allergies="//*[text()='Health Profile']//following::input[20]";
	    public static String reactionToDrugs="//*[text()='Health Profile']//following::input[21]";
	    public static String recurringComplaints="//*[text()='Health Profile']//following::input[22]";
	    public static String hospitalization="//*[text()='Health Profile']//following::input[23]";
	    public static String healthHistory="//*[text()='Health Profile']//following::input[24]";
	    public static String emailID="//*[text()='Health Profile']//following::input[25]";
	    public static String UHID="//*[text()='Health Profile']//following::input[26]";
	    public static String geneticDisorder="//*[text()='Health Profile']//following::input[27]";
	    public static String healthNext="//*[text()='Health Profile']//following::button[16]";
	    public static String fatherHeightFt="//*[text()='Family Profile']//following::input[19]";
	    public static String fatherHeightinch="//*[text()='Family Profile']//following::input[20]";
	    public static String motherHeightFt="//*[text()='Family Profile']//following::input[21]";
	    public static String motherHeightinch="//*[text()='Family Profile']//following::input[22]";
	    public static String familyNext="//*[text()='Family Profile']//following::button[13]";
	    public static String success="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/div[1]/div[1]/div[1]/div[1]/div";
	    public static String age="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[2]/div/div[1]/div/input";
	    //public static String familyProfile="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[1]/mat-step-header[4]/div[3]/div";
	    public static String Done="//*[text()='Choose Action']//following::div[11]";
	    public static String SelectDate="//*[text()=' 1 ']";		
		 // public static String SelectMonth ="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[4]/div[1]";
		  // public static String ClickYearDropdown="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]";
		  // public static String clickYear="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[5]/td[3]/div[1]";
		  public static String clickContinue="//*[text()='Continue to complete detail profile']";
		  public static String prefferedLanguage="//*[text()='Preferred Language']";
		    public static String prefferedLanguageEnglish="//*[text()=' English ']";
		    public static String FamilyMedicalHistory = "//*[text()='Family Profile']//following::input[23]";
		  		public static String EnterDisorder = "//*[text()='Family Profile']//following::input[24]";
		  		public static String AnyGeneticDisorder = "//*[text()='Health Profile']//following::input[27]";
		public static String AdultSelectDate="//*[text()=' 1 ']";		
		public static String AdultbirthDate="//*[text()='Profile']//following::input[10]";		
		 public static String AdultSelectMonth ="//*[text()=' JUN ']";
		   public static String AdultClickYearDropdown="//*[text()='Profile']//following::button[13]//following::span[2]";
		   public static String AdultclickYear="//*[text()=' 2017 ']";
	
	public static String HealthProfile = "//*[text()='Health Profile']";

	public static String ImmunizationOption = "//*[text()='Immunization']";
	//public static String ConfirmVaccinationDate = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[5]/button";
	public static String VaccineRecord = "//*[text()='At Birth']//following::div[2]";
	public static String RecievedDate = "//*[text()='At Birth']//following::img[2]";
	public static String ClickDate = "//*[text()='1']";
	public static String SaveVaccine = "//*[text()='Save Vaccine']";
	public static String SpecialVaccineClick = "//*[text()='Special Vaccines']";
	public static String CholeraVacccine = "//*[text()='Meningococcal Vaccine']";
	//public static String SelectDate = "//*[text()='1']";
	public static String ClickCalender = "//*[text()='Received Date']//following::img";
	public static String SaveSpecialVaccine = "//*[text()='Save Vaccine']";
	public static String BrandName="//*[text()='Tubaervac BCG']";
	// birth
	//public static String OPV1 = "//*[text()='At Birth']//following::div[5]";
	public static String OPV1by4Record = "//*[text()='At Birth']//following::div[5]";
	public static String HepB1by5Record = "//*[text()='At Birth']//following::div[8]";
	//public static String HepB1by5 = "//*[text()='Vaccines']//following::span[3]";
	
	// 6week
	public static String DTWP1= "//*[text()='6 Week Visit']//following::div[2]";
	public static String Rotavirus1 = "//*[text()='6 Week Visit']//following::div[14]";
	public static String PCV1 = "//*[text()='6 Week Visit']//following::div[17]";
	
//10week
	public static String DTWP2 = "//*[text()='10 Week Visit']//following::div[2]";
	//public static String DTWP2 = "//*[text()='Vaccines']//following::span[1]";
	//public static String IPV2by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[11]/td[8]/div";
	//public static String IPV2by3 = "//*[text()='Vaccines']//following::span[2]";
	//public static String HIB2by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[12]/td[8]/div";
	//public static String HIB2by3 = "//*[text()='Vaccines']//following::span[3]";
	//public static String HepB3by5Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[15]/td[8]/div";
	//public static String HepB3by5 = "//*[text()='Vaccines']//following::span[6]";
	public static String Rotavirus2 = "//*[text()='10 Week Visit']//following::div[11]";
	//public static String Rotavirus2by3 = "//*[text()='Vaccines']//following::span[4]";
	public static String PCV2 = "//*[text()='10 Week Visit']//following::div[14]";
	//public static String PCV2by3 = "//*[text()='Vaccines']//following::span[5]";
//14week
	public static String DTWP3= "//*[text()='14 Week Visit']//following::div[2]";
	//public static String DTWP3by3 = "//*[text()='Vaccines']//following::span[1]";
	//public static String IPV3by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[17]/td[8]/div";
	//public static String IPV3by3 = "//*[text()='Vaccines']//following::span[2]";
	//public static String HIB3by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[18]/td[8]/div";
	//public static String HIB3by3 = "//*[text()='Vaccines']//following::span[3]";
	//public static String HepB4by5Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[21]/td[8]/div";
	//public static String HepB4by5 = "//*[text()='Vaccines']//following::span[6]";
	public static String Rotavirus3= "//*[text()='14 Week Visit']//following::div[11]";
	//public static String Rotavirus3by3 = "//*[text()='Vaccines']//following::span[4]";
	public static String PCV3= "//*[text()='14 Week Visit']//following::div[14]";
	//public static String PCV3by3 = "//*[text()='Vaccines']//following::span[5]";
//9to12Months
	public static String TyphoidConjugateV1by2ecord = "//*[text()='6 Months Visit']//following::div[8]";
//6months
	public static String OPV2by4Record = "//*[text()='6 Months Visit']//following::div[2]";
	//public static String OPV2by4 = "//*[text()='Vaccines']//following::span[1]";
	//public static String HepB5by5Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[23]/td[8]/div";
	//public static String HepB5by5 = "//*[text()='Vaccines']//following::span[2]";
	public static String influenza1by6Record = "//*[text()='6 Months Visit']//following::div[5]";
	//public static String influenza1by6 = "//*[text()='Vaccines']//following::span[3]";
	//7months
		public static String influenza2by6Record = "//*[text()='6 Months Visit']//following::div[11]";
//9months
	public static String OPV3by4Record = "//*[text()='6 Months Visit']//following::div[14]";
	//public static String OPV3by4 = "//*[text()='Vaccines']//following::span[1]";
	public static String MMR1by3Record = "//*[text()='6 Months Visit']//following::div[17]";
	//public static String MMR1by3 = "//*[text()='Vaccines']//following::span[2]";
	public static String MeningococcalMCV1by2Record = "//*[text()='6 Months Visit']//following::div[20]";
	//public static String MeningococcalMCV1by2 = "//*[text()='Vaccines']//following::span[3]";
//12months
	public static String HepA1by2Record = "//*[text()='6 Months Visit']//following::div[23]";
	//public static String HepA1by2 = "//*[text()='Vaccines']//following::span[1]";
	public static String JapaneseEncephalitisRecord = "//*[text()='6 Months Visit']//following::div[26]";
	//public static String JapaneseEncephalitis = "//*[text()='Vaccines']//following::span[2]";
	public static String MeningococcalMCV2by2Record = "//*[text()='6 Months Visit']//following::div[29]";
	//public static String MeningococcalMCV2by2 = "//*[text()='Vaccines']//following::span[3]";
//12to15Months
	public static String MMR2by3Record = "//*[text()='6 Months Visit']//following::div[32]";
	//public static String MMR2by3 = "//*[text()='Vaccines']//following::span[1]";
	public static String Varicella1by2Record = "//*[text()='6 Months Visit']//following::div[35]";
	//public static String Varicella1by2 = "//*[text()='Vaccines']//following::span[2]";
	public static String PCVBoosterRecord = "//*[text()='6 Months Visit']//following::div[38]";
	public static String japaneseEncephalitis2 = "//*[text()='6 Months Visit']//following::div[41]";
//16to18Months
	public static String DTPBossterRecord = "//*[text()='6 Months Visit']//following::div[44]";
	//public static String DTPBosster = "//*[text()='Vaccines']//following::span[1]";
	public static String IPVBoosterRecord = "//*[text()='6 Months Visit']//following::div[47]";
	//public static String IPVBooster = "//*[text()='Vaccines']//following::span[2]";
	public static String HIBBoosterRecord = "//*[text()='6 Months Visit']//following::div[50]";
	public static String Hep= "//*[text()='6 Months Visit']//following::div[53]";
//18Months
	public static String HepA2by2Record = "//*[text()='6 Months Visit']//following::div[56]";
	//public static String HepA2by2 = "//*[text()='Vaccines']//following::span[1]";
	public static String influenza3by6Record = "//*[text()='6 Months Visit']//following::div[59]";
	public static String varicella2= "//*[text()='6 Months Visit']//following::div[62]";
//7months
	//public static String influenza2by6Record = "//*[text()='6 Months Visit']//following::div[11]";
//2years
	public static String TyphoidConjugateVRecord = "//*[text()='6 Months Visit']//following::div[65]";
	//public static String TyphoidConjugateV = "//*[text()='Vaccines']//following::span[1]";
	public static String MeningococcalVacRecord = "//*[text()='6 Months Visit']//following::div[68]";
	//public static String MeningococcalVac = "//*[text()='Vaccines']//following::span[2]";
//2years6Months
	public static String Influenza4by6Record = "//*[text()='6 Months Visit']//following::div[71]";
	// public static String Influenza4by6="";
	
	//3years6Months
		public static String Influenza5 = "//*[text()='6 Months Visit']//following::div[74]";
//4to6years
	public static String DTPBoosterRecord = "//*[text()='6 Months Visit']//following::div[77]";
	public static String DTPBooster = "//*[text()='Brands']//following::span";
	public static String ipvB2Record = "//*[text()='6 Months Visit']//following::div[80]";
	public static String ipvB2 = "//*[text()='Brands']//following::span";
	//public static String Varicella2by2Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[47]/td[8]/div";
	//public static String Varicella2by2 = "//*[text()='Vaccines']//following::span[3]";
	public static String MMR3by3Record = "//*[text()='6 Months Visit']//following::div[83]";
	public static String MMR3by3 = "//*[text()='Brands']//following::span";
	
	//4years6Months
			public static String Influenza6 = "//*[text()='6 Months Visit']//following::div[86]";
	//5years6Months
			public static String Influenza7 = "//*[text()='6 Months Visit']//following::div[89]";
	//6years6Months
			public static String Influenza8 = "//*[text()='6 Months Visit']//following::div[92]";
			//7years6Months
			public static String Influenza9 = "//*[text()='6 Months Visit']//following::div[95]";
			//8years6Months
			public static String Influenza10= "//*[text()='6 Months Visit']//following::div[98]";
			//9years6Months
			public static String Influenza11 = "//*[text()='6 Months Visit']//following::div[101]";
//10-12years
	public static String TdapTDRecord = "//*[text()='6 Months Visit']//following::div[104]";
	// public static String TdapTD="";
//10years
	public static String HPV1by2 = "//*[text()='6 Months Visit']//following::div[107]";
	
//10yers6Months
	public static String HPV2by2Record = "//*[text()='6 Months Visit']//following::div[110]";
	// public static String HPV2by2="";

	//10years
//public static String HPV1by2Record="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[52]/td[8]/div";
	public static String OTP1 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]";
	public static String OTP2 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]";
	public static String OTP3 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]";
	public static String OTP4 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	public static String OTP5 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	public static String OTP6 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]";

//Brands
	public static String TubaervacBCG = "//*[text()='Tubaervac BCG']";
	
	public static String OPV1Bipollio = "//*[text()='Biopolio']";
	public static String GenevacB = "//*[text()='Genevac B']";
	public static String EasySix = "//*[text()='Brands']//following::span";
	public static String Rotavac = "//*[text()='Brands']//following::span[5]";
	
	
	public static String Prevnar13 = "//*[text()='Brands']//following::span";
	public static String Biopollio = "//*[text()='Biopolio']";
	public static String influvac = "//*[text()='Influvac']";
	public static String TyphoidConjugateVaccine = "//*[text()='Enteroshield']";
	public static String Menactra = "//*[text()='Menactra']";
	public static String Enteroshield = "//*[text()='Enteroshield']";
	public static String Biovac = "//*[text()='Menactra']";
	//public static String TresivacMMR = "//*[text()='Tubaervac BCG']";
	public static String Varilix = "//*[text()='Varilix']";
	public static String Jenvac = "//*[text()='Jenvac']";
	public static String Varicella2Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-new-profile/div[2]/patient-immunization/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/table/tbody/tr[41]/td[8]/div";
	public static String Varicella2 = "//*[text()='Varilix']";
	public static String BcgRecord = "//*[text()='Varilix']";
	public static String Biopollio1 = "//*[text()='Brands']//following::span";
	public static String Enteroshield1 = "//*[text()='Brands']//following::span";
	public static String influvac1 = "//*[text()='Brands']//following::span";
	public static String TresivacMMR1 = "//*[text()='Brands']//following::span";
	//public static String Rotavac = "";
	public static String Biovac1 = "//*[text()='Brands']//following::span";
	public static String Menactra1 = "//*[text()='Brands']//following::span";
	public static String Jenvac1 = "//*[text()='Brands']//following::span";
	public static String TresivacMMR2 = "//*[text()='Brands']//following::span[2]";
	public static String Jenvac2 = "//*[text()='Brands']//following::span[2]";
	public static String EasySix1 = "//*[text()='Brands']//following::span[3]";
	public static String Varilix1 = "//*[text()='Brands']//following::span";
	public static String TDVAC = "//*[text()='Brands']//following::span";
	public static String Gardasil = "//*[text()='Brands']//following::span";
	public static void waitForVisibilityOf(By by) {
		try {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			// JavascriptExecutor jse = (JavascriptExecutor)driver;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickUsingJavaScript(By by) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(by));
	}

	public static void highlightElement(By by) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: grey; border: 2px solid black;');",
				driver.findElement(by));
	}

	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://app.copious.care/");
		// driver.get("https://stage.copious.care/");
		driver.manage().window().fullscreen();

	}

	@Test(priority = 1)
	public void numberField() {
		waitForVisibilityOf(By.xpath(mobileNumber));
		driver.findElement(By.xpath(mobileNumber)).sendKeys("9665002440");
		highlightElement(By.xpath(mobileNumber));
		clickUsingJavaScript(By.xpath(mobileNumber));
	}

	@Test(priority = 2)
	public void sendOTP() throws InterruptedException {
		waitForVisibilityOf(By.xpath(sendOTP));
		highlightElement(By.xpath(sendOTP));
		clickUsingJavaScript(By.xpath(sendOTP));

		waitForVisibilityOf(By.xpath(OTP1));
		driver.findElement(By.xpath(OTP1)).sendKeys("1");

		highlightElement(By.xpath(OTP1));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP2));
		driver.findElement(By.xpath(OTP2)).sendKeys("4");
		highlightElement(By.xpath(OTP2));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP3));
		driver.findElement(By.xpath(OTP3)).sendKeys("0");

		highlightElement(By.xpath(OTP3));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP4));
		driver.findElement(By.xpath(OTP4)).sendKeys("5");

		highlightElement(By.xpath(OTP4));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP5));
		driver.findElement(By.xpath(OTP5)).sendKeys("2");

		highlightElement(By.xpath(OTP5));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP6));
		driver.findElement(By.xpath(OTP6)).sendKeys("0");

		highlightElement(By.xpath(OTP6));

	}

	@Test(priority = 3)
	public void verifyButton() throws InterruptedException {
		Thread.sleep(10000);
		waitForVisibilityOf(By.xpath(verifyOTP));
		// driver.findElement(By.xpath(verifyOTP));
		highlightElement(By.xpath(verifyOTP));
		clickUsingJavaScript(By.xpath(verifyOTP));
	}

	@Test(priority = 4)
	public void createPatient() {
		waitForVisibilityOf(By.id(createPatient));
		highlightElement(By.id(createPatient));
		clickUsingJavaScript(By.id(createPatient));
		// driver.findElement(By.id(createPatient)).click();
	}

	@Test(priority = 5)
	public void Number1() {
		waitForVisibilityOf(By.xpath(Number1));
		driver.findElement(By.xpath(Number1)).sendKeys("1234567891");
		highlightElement(By.xpath(Number1));
		clickUsingJavaScript(By.xpath(Number1));
	}

	@Test(priority = 6)
	public void confirm() {
		waitForVisibilityOf(By.xpath(confirm));
		driver.findElement(By.xpath(confirm));
		highlightElement(By.xpath(confirm));
		clickUsingJavaScript(By.xpath(confirm));
		waitForVisibilityOf(By.xpath(proceedWithSameRMN));
		/*
		 * waitForVisibilityOf(By.xpath(confirmPopup));
		 * highlightElement(By.xpath(confirmPopup));
		 * clickUsingJavaScript(By.xpath(confirmPopup));
		 */

		waitForVisibilityOf(By.xpath(proceedWithSameRMN));
		driver.findElement(By.xpath(proceedWithSameRMN));
		highlightElement(By.xpath(proceedWithSameRMN));
		clickUsingJavaScript(By.xpath(proceedWithSameRMN));

	}

	@Test(priority = 7)
	public void number2() {
		waitForVisibilityOf(By.xpath(number2));
		driver.findElement(By.xpath(number2)).sendKeys("1234567892");

		highlightElement(By.xpath(number2));
		clickUsingJavaScript(By.xpath(number2));
	}

	@Test(priority = 8)
	public void firstName() {
		waitForVisibilityOf(By.xpath(firstName));
		driver.findElement(By.xpath(firstName)).sendKeys("Vaccine");

		highlightElement(By.xpath(firstName));
		clickUsingJavaScript(By.xpath(firstName));
	}

	@Test(priority = 9)
	public void middleName() {
		waitForVisibilityOf(By.xpath(middleName));
		driver.findElement(By.xpath(middleName)).sendKeys("Automation");

		highlightElement(By.xpath(middleName));
		clickUsingJavaScript(By.xpath(middleName));
	}

	@Test(priority = 10)
	public void lastName() {
		waitForVisibilityOf(By.xpath(lastName));
		driver.findElement(By.xpath(lastName)).sendKeys("Test");

		highlightElement(By.xpath(lastName));
		clickUsingJavaScript(By.xpath(lastName));
	}

	@Test(priority = 11)
	public void birthDate() throws InterruptedException {

		waitForVisibilityOf(By.xpath(birthDate));
		highlightElement(By.xpath(birthDate));
		driver.findElement(By.xpath(birthDate));
		clickUsingJavaScript(By.xpath(birthDate));

		waitForVisibilityOf(By.xpath(AdultClickYearDropdown));
		highlightElement(By.xpath(AdultClickYearDropdown));
		driver.findElement(By.xpath(AdultClickYearDropdown));
		clickUsingJavaScript(By.xpath(AdultClickYearDropdown));

		waitForVisibilityOf(By.xpath(AdultclickYear));
		highlightElement(By.xpath(AdultclickYear));
		driver.findElement(By.xpath(AdultclickYear));
		clickUsingJavaScript(By.xpath(AdultclickYear));

		waitForVisibilityOf(By.xpath(AdultSelectMonth));
		highlightElement(By.xpath(AdultSelectMonth));
		driver.findElement(By.xpath(AdultSelectMonth));
		clickUsingJavaScript(By.xpath(AdultSelectMonth));

		waitForVisibilityOf(By.xpath(AdultSelectDate));
		highlightElement(By.xpath(AdultSelectDate));
		driver.findElement(By.xpath(AdultSelectDate));
		clickUsingJavaScript(By.xpath(AdultSelectDate));

	}

	@Test(priority = 12)
	public void genFemale() {
		waitForVisibilityOf(By.xpath(genFemale));
		driver.findElement(By.xpath(genFemale));
		highlightElement(By.xpath(genFemale));
		clickUsingJavaScript(By.xpath(genFemale));
	}

	@Test(priority = 13)
	public void address() {
		waitForVisibilityOf(By.xpath(address));
		driver.findElement(By.xpath(address)).sendKeys("Address");

		highlightElement(By.xpath(address));
		clickUsingJavaScript(By.xpath(address));
	}

	@Test(priority = 14)
	public void locality() {
		waitForVisibilityOf(By.xpath(locality));
		driver.findElement(By.xpath(locality)).sendKeys("locality");
		highlightElement(By.xpath(locality));
		clickUsingJavaScript(By.xpath(locality));
	}

	@Test(priority = 15)
	public void city() {
		waitForVisibilityOf(By.xpath(city));
		driver.findElement(By.xpath(city)).sendKeys("City");

		highlightElement(By.xpath(city));
		clickUsingJavaScript(By.xpath(city));
	}

	@Test(priority = 16)
	public void pinCode() {
		waitForVisibilityOf(By.xpath(pinCode));
		driver.findElement(By.xpath(pinCode)).sendKeys("412306");
		highlightElement(By.xpath(pinCode));
		clickUsingJavaScript(By.xpath(pinCode));

		waitForVisibilityOf(By.xpath(prefferedLanguage));
		driver.findElement(By.xpath(prefferedLanguage));
		highlightElement(By.xpath(prefferedLanguage));
		clickUsingJavaScript(By.xpath(prefferedLanguage));

		waitForVisibilityOf(By.xpath(prefferedLanguageEnglish));
		driver.findElement(By.xpath(prefferedLanguageEnglish));
		highlightElement(By.xpath(prefferedLanguageEnglish));
		clickUsingJavaScript(By.xpath(prefferedLanguageEnglish));
	}

	/*
	 * @Test(priority=17) public void proceedWithSameRMN() {
	 * waitForVisibilityOf(By.xpath(proceedWithSameRMN));
	 *
	 * highlightElement(By.xpath(proceedWithSameRMN));
	 * clickUsingJavaScript(By.xpath(proceedWithSameRMN));
	 *
	 * }
	 */
	@Test(priority = 18)
	public void nextButton() throws InterruptedException {
		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(Next));
		driver.findElement(By.xpath(Next));
		highlightElement(By.xpath(Next));
		clickUsingJavaScript(By.xpath(Next));
		
		Thread.sleep(2000);
		
		highlightElement(By.xpath(Done));
		driver.findElement(By.xpath(Done));
		clickUsingJavaScript(By.xpath(Done));

		
	}
	@Test(priority = 19)
	public void HealthBirthVaccine() throws InterruptedException {
		
		Thread.sleep(5000);

		waitForVisibilityOf(By.xpath(HealthProfile));
		driver.findElement(By.xpath(HealthProfile));
		highlightElement(By.xpath(HealthProfile));
		clickUsingJavaScript(By.xpath(HealthProfile));

		waitForVisibilityOf(By.xpath(ImmunizationOption));
		driver.findElement(By.xpath(ImmunizationOption));
		highlightElement(By.xpath(ImmunizationOption));
		clickUsingJavaScript(By.xpath(ImmunizationOption));
		
		
		Thread.sleep(5000);

		waitForVisibilityOf(By.xpath(OPV1by4Record));
		driver.findElement(By.xpath(OPV1by4Record));
		highlightElement(By.xpath(OPV1by4Record));
		clickUsingJavaScript(By.xpath(OPV1by4Record));

		
		waitForVisibilityOf(By.xpath(OPV1Bipollio));
		driver.findElement(By.xpath(OPV1Bipollio));
		highlightElement(By.xpath(OPV1Bipollio));
		clickUsingJavaScript(By.xpath(OPV1Bipollio));

		waitForVisibilityOf(By.xpath(ClickCalender));
		driver.findElement(By.xpath(ClickCalender));
		highlightElement(By.xpath(ClickCalender));
		clickUsingJavaScript(By.xpath(ClickCalender));
		
		
		
		System.out.print("Dateclick");
		
		
		  LocalDate currentDate = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
	        String formattedDay = currentDate.format(dateFormatter);
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
		  System.out.print("Dateclicked");


		waitForVisibilityOf(By.xpath(SaveVaccine));
		driver.findElement(By.xpath(SaveVaccine));
		highlightElement(By.xpath(SaveVaccine));
		clickUsingJavaScript(By.xpath(SaveVaccine));

		Thread.sleep(10000);

		waitForVisibilityOf(By.xpath(HepB1by5Record));
		driver.findElement(By.xpath(HepB1by5Record));
		highlightElement(By.xpath(HepB1by5Record));
		clickUsingJavaScript(By.xpath(HepB1by5Record));

		/*
		 * waitForVisibilityOf(By.xpath(HepB1by5));
		 * driver.findElement(By.xpath(HepB1by5)); highlightElement(By.xpath(HepB1by5));
		 * clickUsingJavaScript(By.xpath(HepB1by5));
		 */

		waitForVisibilityOf(By.xpath(GenevacB));
		driver.findElement(By.xpath(GenevacB));
		highlightElement(By.xpath(GenevacB));
		clickUsingJavaScript(By.xpath(GenevacB));
		
		waitForVisibilityOf(By.xpath(ClickCalender));
		driver.findElement(By.xpath(ClickCalender));
		highlightElement(By.xpath(ClickCalender));
		clickUsingJavaScript(By.xpath(ClickCalender));
		
		
		
		System.out.print("Dateclick");
		
		
		  LocalDate currentDate1 = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("d");
	        String formattedDay1 = currentDate.format(dateFormatter1);
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
		  System.out.print("Dateclicked");

		waitForVisibilityOf(By.xpath(SaveVaccine));
		driver.findElement(By.xpath(SaveVaccine));
		highlightElement(By.xpath(SaveVaccine));
		clickUsingJavaScript(By.xpath(SaveVaccine));

	}
	@Test(priority = 20)
	public void Health6WeekVisitVaccine() throws InterruptedException {
		Thread.sleep(10000);
		Thread.sleep(5000);
		waitForVisibilityOf(By.xpath(HealthProfile));
		driver.findElement(By.xpath(HealthProfile));
		highlightElement(By.xpath(HealthProfile));
		clickUsingJavaScript(By.xpath(HealthProfile));

		waitForVisibilityOf(By.xpath(ImmunizationOption));
		driver.findElement(By.xpath(ImmunizationOption));
		highlightElement(By.xpath(ImmunizationOption));
		clickUsingJavaScript(By.xpath(ImmunizationOption));

		waitForVisibilityOf(By.xpath(DTWP1));
		driver.findElement(By.xpath(DTWP1));
		highlightElement(By.xpath(DTWP1));
		clickUsingJavaScript(By.xpath(DTWP1));

		
		
		waitForVisibilityOf(By.xpath(EasySix));
		driver.findElement(By.xpath(EasySix));
		highlightElement(By.xpath(EasySix));
		clickUsingJavaScript(By.xpath(EasySix));

		waitForVisibilityOf(By.xpath(ClickCalender));
		driver.findElement(By.xpath(ClickCalender));
		highlightElement(By.xpath(ClickCalender));
		clickUsingJavaScript(By.xpath(ClickCalender));
		
		
		
		System.out.print("Dateclick");
		
		
		  LocalDate currentDate = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
	        String formattedDay = currentDate.format(dateFormatter);
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
		  System.out.print("Dateclicked");


		waitForVisibilityOf(By.xpath(SaveVaccine));
		driver.findElement(By.xpath(SaveVaccine));
		highlightElement(By.xpath(SaveVaccine));
		clickUsingJavaScript(By.xpath(SaveVaccine));

	
		Thread.sleep(10000);
		waitForVisibilityOf(By.xpath(Rotavirus1));
		driver.findElement(By.xpath(Rotavirus1));
		highlightElement(By.xpath(Rotavirus1));
		clickUsingJavaScript(By.xpath(Rotavirus1));

		
		waitForVisibilityOf(By.xpath(Rotavac));
		driver.findElement(By.xpath(Rotavac));
		highlightElement(By.xpath(Rotavac));
		clickUsingJavaScript(By.xpath(Rotavac));

		waitForVisibilityOf(By.xpath(ClickCalender));
		driver.findElement(By.xpath(ClickCalender));
		highlightElement(By.xpath(ClickCalender));
		clickUsingJavaScript(By.xpath(ClickCalender));
		
		
		
		System.out.print("Dateclick");
		
		
		  LocalDate currentDate1 = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("d");
	        String formattedDay1 = currentDate.format(dateFormatter1);
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay1 + "']"));
		  System.out.print("Dateclicked");

		waitForVisibilityOf(By.xpath(SaveVaccine));
		driver.findElement(By.xpath(SaveVaccine));
		highlightElement(By.xpath(SaveVaccine));
		clickUsingJavaScript(By.xpath(SaveVaccine));

		Thread.sleep(10000);
		waitForVisibilityOf(By.xpath(PCV1));
		driver.findElement(By.xpath(PCV1));
		highlightElement(By.xpath(PCV1));
		clickUsingJavaScript(By.xpath(PCV1));

		
		  waitForVisibilityOf(By.xpath(Prevnar13));
		  driver.findElement(By.xpath(Prevnar13));
		  highlightElement(By.xpath(Prevnar13));
		  clickUsingJavaScript(By.xpath(Prevnar13));
		 

		waitForVisibilityOf(By.xpath(ClickCalender));
		driver.findElement(By.xpath(ClickCalender));
		highlightElement(By.xpath(ClickCalender));
		clickUsingJavaScript(By.xpath(ClickCalender));
		
		
		
		System.out.print("Dateclick");
		
		
		  LocalDate currentDate2 = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("d");
	        String formattedDay2 = currentDate.format(dateFormatter2);
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay2 + "']"));
		  System.out.print("Dateclicked");


		waitForVisibilityOf(By.xpath(SaveVaccine));
		driver.findElement(By.xpath(SaveVaccine));
		highlightElement(By.xpath(SaveVaccine));
		clickUsingJavaScript(By.xpath(SaveVaccine));

		Thread.sleep(10000);
		
	}
	
	@Test(priority = 21)
	public void Health10WeekVisitVaccine() throws InterruptedException {
		Thread.sleep(10000);
		Thread.sleep(5000);
		waitForVisibilityOf(By.xpath(HealthProfile));
		driver.findElement(By.xpath(HealthProfile));
		highlightElement(By.xpath(HealthProfile));
		clickUsingJavaScript(By.xpath(HealthProfile));

		waitForVisibilityOf(By.xpath(ImmunizationOption));
		driver.findElement(By.xpath(ImmunizationOption));
		highlightElement(By.xpath(ImmunizationOption));
		clickUsingJavaScript(By.xpath(ImmunizationOption));

		waitForVisibilityOf(By.xpath(DTWP2));
		driver.findElement(By.xpath(DTWP2));
		highlightElement(By.xpath(DTWP2));
		clickUsingJavaScript(By.xpath(DTWP2));

		Thread.sleep(2000);
		
		waitForVisibilityOf(By.xpath(EasySix));
		driver.findElement(By.xpath(EasySix));
		highlightElement(By.xpath(EasySix));
		clickUsingJavaScript(By.xpath(EasySix));
		
		Thread.sleep(2000);
		waitForVisibilityOf(By.xpath(ClickCalender));
		driver.findElement(By.xpath(ClickCalender));
		highlightElement(By.xpath(ClickCalender));
		clickUsingJavaScript(By.xpath(ClickCalender));
		
		
		
		System.out.print("Dateclick");
		
		
		  LocalDate currentDate = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
	        String formattedDay = currentDate.format(dateFormatter);
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
		  System.out.print("Dateclicked");


		waitForVisibilityOf(By.xpath(SaveVaccine));
		driver.findElement(By.xpath(SaveVaccine));
		highlightElement(By.xpath(SaveVaccine));
		clickUsingJavaScript(By.xpath(SaveVaccine));

	
		
		Thread.sleep(10000);
		waitForVisibilityOf(By.xpath(Rotavirus2));
		driver.findElement(By.xpath(Rotavirus2));
		highlightElement(By.xpath(Rotavirus2));
		clickUsingJavaScript(By.xpath(Rotavirus2));

		Thread.sleep(2000);
		
		waitForVisibilityOf(By.xpath(Rotavac));
		driver.findElement(By.xpath(Rotavac));
		highlightElement(By.xpath(Rotavac));
		clickUsingJavaScript(By.xpath(Rotavac));

		waitForVisibilityOf(By.xpath(ClickCalender));
		driver.findElement(By.xpath(ClickCalender));
		highlightElement(By.xpath(ClickCalender));
		clickUsingJavaScript(By.xpath(ClickCalender));
		
		
		
		System.out.print("Dateclick");
		
		
		  LocalDate currentDate2 = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("d");
	        String formattedDay2 = currentDate.format(dateFormatter2);
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay2 + "']"));
		  System.out.print("Dateclicked");


		waitForVisibilityOf(By.xpath(SaveVaccine));
		driver.findElement(By.xpath(SaveVaccine));
		highlightElement(By.xpath(SaveVaccine));
		clickUsingJavaScript(By.xpath(SaveVaccine));

		Thread.sleep(10000);
		waitForVisibilityOf(By.xpath(PCV2));
		driver.findElement(By.xpath(PCV2));
		highlightElement(By.xpath(PCV2));
		clickUsingJavaScript(By.xpath(PCV2));

	Thread.sleep(2000);
		
	waitForVisibilityOf(By.xpath(Prevnar13));
	  driver.findElement(By.xpath(Prevnar13));
	  highlightElement(By.xpath(Prevnar13));
	  clickUsingJavaScript(By.xpath(Prevnar13));

		waitForVisibilityOf(By.xpath(ClickCalender));
		driver.findElement(By.xpath(ClickCalender));
		highlightElement(By.xpath(ClickCalender));
		clickUsingJavaScript(By.xpath(ClickCalender));
		
		
		
		System.out.print("Dateclick");
		
		
		  LocalDate currentDate1 = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("d");
	        String formattedDay1 = currentDate.format(dateFormatter1);
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay1 + "']"));
		  System.out.print("Dateclicked");


		waitForVisibilityOf(By.xpath(SaveVaccine));
		driver.findElement(By.xpath(SaveVaccine));
		highlightElement(By.xpath(SaveVaccine));
		clickUsingJavaScript(By.xpath(SaveVaccine));

		Thread.sleep(10000);
		

	}
	@Test(priority = 22)
	public void Health114WeekVisitVaccine() throws InterruptedException {
		Thread.sleep(10000);

		waitForVisibilityOf(By.xpath(HealthProfile));
		driver.findElement(By.xpath(HealthProfile));
		highlightElement(By.xpath(HealthProfile));
		clickUsingJavaScript(By.xpath(HealthProfile));

		waitForVisibilityOf(By.xpath(ImmunizationOption));
		driver.findElement(By.xpath(ImmunizationOption));
		highlightElement(By.xpath(ImmunizationOption));
		clickUsingJavaScript(By.xpath(ImmunizationOption));

		waitForVisibilityOf(By.xpath(DTWP3));
		driver.findElement(By.xpath(DTWP3));
		highlightElement(By.xpath(DTWP3));
		clickUsingJavaScript(By.xpath(DTWP3));
		
		waitForVisibilityOf(By.xpath(EasySix));
		driver.findElement(By.xpath(EasySix));
		highlightElement(By.xpath(EasySix));
		clickUsingJavaScript(By.xpath(EasySix));
		

		waitForVisibilityOf(By.xpath(ClickCalender));
		driver.findElement(By.xpath(ClickCalender));
		highlightElement(By.xpath(ClickCalender));
		clickUsingJavaScript(By.xpath(ClickCalender));
		
		
		
		System.out.print("Dateclick");
		
		
		  LocalDate currentDate = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
	        String formattedDay = currentDate.format(dateFormatter);
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
		  System.out.print("Dateclicked");


		waitForVisibilityOf(By.xpath(SaveVaccine));
		driver.findElement(By.xpath(SaveVaccine));
		highlightElement(By.xpath(SaveVaccine));
		clickUsingJavaScript(By.xpath(SaveVaccine));

		Thread.sleep(2000);
		waitForVisibilityOf(By.xpath(Rotavirus3));
		driver.findElement(By.xpath(Rotavirus3));
		highlightElement(By.xpath(Rotavirus3));
		clickUsingJavaScript(By.xpath(Rotavirus3));

		waitForVisibilityOf(By.xpath(Rotavac));
		driver.findElement(By.xpath(Rotavac));
		highlightElement(By.xpath(Rotavac));
		clickUsingJavaScript(By.xpath(Rotavac));

		waitForVisibilityOf(By.xpath(ClickCalender));
		driver.findElement(By.xpath(ClickCalender));
		highlightElement(By.xpath(ClickCalender));
		clickUsingJavaScript(By.xpath(ClickCalender));
		
		
		
		System.out.print("Dateclick");
		
		
		  LocalDate currentDate3 = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("d");
	        String formattedDay3 = currentDate.format(dateFormatter3);

	        // Locate the calendar element
	       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

	        // Find and click the day element corresponding to the current date
	       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
	        //dayElement.click();
		 
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
		  System.out.print("Dateclicked");


		waitForVisibilityOf(By.xpath(SaveVaccine));
		driver.findElement(By.xpath(SaveVaccine));
		highlightElement(By.xpath(SaveVaccine));
		clickUsingJavaScript(By.xpath(SaveVaccine));

		Thread.sleep(10000);
		waitForVisibilityOf(By.xpath(PCV3));
		driver.findElement(By.xpath(PCV3));
		highlightElement(By.xpath(PCV3));
		clickUsingJavaScript(By.xpath(PCV3));
		
		waitForVisibilityOf(By.xpath(Prevnar13));
		  driver.findElement(By.xpath(Prevnar13));
		  highlightElement(By.xpath(Prevnar13));
		  clickUsingJavaScript(By.xpath(Prevnar13));

		

		waitForVisibilityOf(By.xpath(ClickCalender));
		driver.findElement(By.xpath(ClickCalender));
		highlightElement(By.xpath(ClickCalender));
		clickUsingJavaScript(By.xpath(ClickCalender));
		
		
		
		System.out.print("Dateclick");
		
		
		  LocalDate currentDate4 = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter4 = DateTimeFormatter.ofPattern("d");
	        String formattedDay4 = currentDate.format(dateFormatter4);

	        // Locate the calendar element
	       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

	        // Find and click the day element corresponding to the current date
	       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
	        //dayElement.click();
		 
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
		  System.out.print("Dateclicked");

		waitForVisibilityOf(By.xpath(SaveVaccine));
		driver.findElement(By.xpath(SaveVaccine));
		highlightElement(By.xpath(SaveVaccine));
		clickUsingJavaScript(By.xpath(SaveVaccine));

		

	}
	 @Test(priority = 23) public void Health6MonthVisitVaccine() throws
	  InterruptedException { Thread.sleep(10000);
	  
	  
	  waitForVisibilityOf(By.xpath(HealthProfile));
	  driver.findElement(By.xpath(HealthProfile));
	  highlightElement(By.xpath(HealthProfile));
	  clickUsingJavaScript(By.xpath(HealthProfile));
	  
	  waitForVisibilityOf(By.xpath(ImmunizationOption));
	  driver.findElement(By.xpath(ImmunizationOption));
	  highlightElement(By.xpath(ImmunizationOption));
	  clickUsingJavaScript(By.xpath(ImmunizationOption));
	  
	  waitForVisibilityOf(By.xpath(OPV2by4Record));
	  driver.findElement(By.xpath(OPV2by4Record));
	  highlightElement(By.xpath(OPV2by4Record));
	  clickUsingJavaScript(By.xpath(OPV2by4Record));
	  
	
	  waitForVisibilityOf(By.xpath(Biopollio1));
	  driver.findElement(By.xpath(Biopollio1)); highlightElement(By.xpath(Biopollio1));
	  clickUsingJavaScript(By.xpath(Biopollio1));
	  
		waitForVisibilityOf(By.xpath(ClickCalender));
		driver.findElement(By.xpath(ClickCalender));
		highlightElement(By.xpath(ClickCalender));
		clickUsingJavaScript(By.xpath(ClickCalender));
		
		
		
		System.out.print("Dateclick");
		
		
		  LocalDate currentDate = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
	        String formattedDay = currentDate.format(dateFormatter);

	        // Locate the calendar element
	       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

	        // Find and click the day element corresponding to the current date
	       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
	        //dayElement.click();
		 
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
		  System.out.print("Dateclicked");

	  
	  waitForVisibilityOf(By.xpath(SaveVaccine));
	  driver.findElement(By.xpath(SaveVaccine));
	  highlightElement(By.xpath(SaveVaccine));
	  clickUsingJavaScript(By.xpath(SaveVaccine));
	  
	
	  
	  Thread.sleep(10000); waitForVisibilityOf(By.xpath(influenza1by6Record));
	  driver.findElement(By.xpath(influenza1by6Record));
	  highlightElement(By.xpath(influenza1by6Record));
	  clickUsingJavaScript(By.xpath(influenza1by6Record));
	  
	 
	  waitForVisibilityOf(By.xpath(influvac));
	  driver.findElement(By.xpath(influvac));
	  highlightElement(By.xpath(influvac));
	  clickUsingJavaScript(By.xpath(influvac));
	  
		waitForVisibilityOf(By.xpath(ClickCalender));
		driver.findElement(By.xpath(ClickCalender));
		highlightElement(By.xpath(ClickCalender));
		clickUsingJavaScript(By.xpath(ClickCalender));
		
		
		
		System.out.print("Dateclick");
		
		
		  LocalDate currentDate1 = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("d");
	        String formattedDay1 = currentDate.format(dateFormatter1);

	        // Locate the calendar element
	       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

	        // Find and click the day element corresponding to the current date
	       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
	        //dayElement.click();
		 
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
		  System.out.print("Dateclicked");

	  
	  waitForVisibilityOf(By.xpath(SaveVaccine));
	  driver.findElement(By.xpath(SaveVaccine));
	  highlightElement(By.xpath(SaveVaccine));
	  clickUsingJavaScript(By.xpath(SaveVaccine));
	  
	  }
	  @Test(priority = 24)
			public void Health6to9MonthVisitVaccine() throws InterruptedException {
				Thread.sleep(10000);


				waitForVisibilityOf(By.xpath(HealthProfile));
				driver.findElement(By.xpath(HealthProfile));
				highlightElement(By.xpath(HealthProfile));
				clickUsingJavaScript(By.xpath(HealthProfile));

				waitForVisibilityOf(By.xpath(ImmunizationOption));
				driver.findElement(By.xpath(ImmunizationOption));
				highlightElement(By.xpath(ImmunizationOption));
				clickUsingJavaScript(By.xpath(ImmunizationOption));

				waitForVisibilityOf(By.xpath(TyphoidConjugateV1by2ecord));
				driver.findElement(By.xpath(TyphoidConjugateV1by2ecord));
				highlightElement(By.xpath(TyphoidConjugateV1by2ecord));
				clickUsingJavaScript(By.xpath(TyphoidConjugateV1by2ecord));
				
				waitForVisibilityOf(By.xpath(Enteroshield1));
				driver.findElement(By.xpath(Enteroshield1));
				highlightElement(By.xpath(Enteroshield1));
				clickUsingJavaScript(By.xpath(Enteroshield1));

				waitForVisibilityOf(By.xpath(ClickCalender));
				driver.findElement(By.xpath(ClickCalender));
				highlightElement(By.xpath(ClickCalender));
				clickUsingJavaScript(By.xpath(ClickCalender));
				
				
				
				System.out.print("Dateclick");
				
				
				  LocalDate currentDate = LocalDate.now();

			        // Format current date to match expected format in the calendar
			        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
			        String formattedDay = currentDate.format(dateFormatter);

			        // Locate the calendar element
			       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

			        // Find and click the day element corresponding to the current date
			       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
			        //dayElement.click();
				 
			        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
				  System.out.print("Dateclicked");


				waitForVisibilityOf(By.xpath(SaveVaccine));
				driver.findElement(By.xpath(SaveVaccine));
				highlightElement(By.xpath(SaveVaccine));
				clickUsingJavaScript(By.xpath(SaveVaccine));

			}
	  @Test(priority = 25)
		public void Health7MonthVisitVaccine() throws InterruptedException {
			Thread.sleep(10000);


			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));

			waitForVisibilityOf(By.xpath(influenza2by6Record));
			driver.findElement(By.xpath(influenza2by6Record));
			highlightElement(By.xpath(influenza2by6Record));
			clickUsingJavaScript(By.xpath(influenza2by6Record));
			
			waitForVisibilityOf(By.xpath(influvac1));
			driver.findElement(By.xpath(influvac1));
			highlightElement(By.xpath(influvac1));
			clickUsingJavaScript(By.xpath(influvac1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");
	;

			waitForVisibilityOf(By.xpath(SaveVaccine));
			driver.findElement(By.xpath(SaveVaccine));
			highlightElement(By.xpath(SaveVaccine));
			clickUsingJavaScript(By.xpath(SaveVaccine));

		}
	  @Test(priority = 26)
		public void Health9MonthVisitVaccine() throws InterruptedException {
			Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(OPV3by4Record));
			driver.findElement(By.xpath(OPV3by4Record));
			highlightElement(By.xpath(OPV3by4Record));
			clickUsingJavaScript(By.xpath(OPV3by4Record));

			
			waitForVisibilityOf(By.xpath(Biopollio1));
			driver.findElement(By.xpath(Biopollio1));
			highlightElement(By.xpath(Biopollio1));
			clickUsingJavaScript(By.xpath(Biopollio1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


			waitForVisibilityOf(By.xpath(SaveVaccine));
			driver.findElement(By.xpath(SaveVaccine));
			highlightElement(By.xpath(SaveVaccine));
			clickUsingJavaScript(By.xpath(SaveVaccine));

			Thread.sleep(10000);
			waitForVisibilityOf(By.xpath(MMR1by3Record));
			driver.findElement(By.xpath(MMR1by3Record));
			highlightElement(By.xpath(MMR1by3Record));
			clickUsingJavaScript(By.xpath(MMR1by3Record));

			
			waitForVisibilityOf(By.xpath(TresivacMMR1));
			driver.findElement(By.xpath(TresivacMMR1));
			highlightElement(By.xpath(TresivacMMR1));
			clickUsingJavaScript(By.xpath(TresivacMMR1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate1 = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("d");
		        String formattedDay1 = currentDate.format(dateFormatter1);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");

			waitForVisibilityOf(By.xpath(SaveVaccine));
			driver.findElement(By.xpath(SaveVaccine));
			highlightElement(By.xpath(SaveVaccine));
			clickUsingJavaScript(By.xpath(SaveVaccine));

			Thread.sleep(10000);
			waitForVisibilityOf(By.xpath(MeningococcalMCV1by2Record));
			driver.findElement(By.xpath(MeningococcalMCV1by2Record));
			highlightElement(By.xpath(MeningococcalMCV1by2Record));
			clickUsingJavaScript(By.xpath(MeningococcalMCV1by2Record));

			
			
			waitForVisibilityOf(By.xpath(Menactra));
			driver.findElement(By.xpath(Menactra));
			highlightElement(By.xpath(Menactra));
			clickUsingJavaScript(By.xpath(Menactra));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate2 = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("d");
		        String formattedDay2 = currentDate.format(dateFormatter2);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");

			waitForVisibilityOf(By.xpath(SaveVaccine));
			driver.findElement(By.xpath(SaveVaccine));
			highlightElement(By.xpath(SaveVaccine));
			clickUsingJavaScript(By.xpath(SaveVaccine));

		}
		
	  @Test(priority = 27)
		public void Health12MonthVisitVaccine() throws InterruptedException {
			Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));
			
			waitForVisibilityOf(By.xpath(HepA1by2Record));
			driver.findElement(By.xpath(HepA1by2Record));
			highlightElement(By.xpath(HepA1by2Record));
			clickUsingJavaScript(By.xpath(HepA1by2Record));

		
			waitForVisibilityOf(By.xpath(Biovac1));
			driver.findElement(By.xpath(Biovac1));
			highlightElement(By.xpath(Biovac1));
			clickUsingJavaScript(By.xpath(Biovac1
					));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");

			waitForVisibilityOf(By.xpath(SaveVaccine));
			driver.findElement(By.xpath(SaveVaccine));
			highlightElement(By.xpath(SaveVaccine));
			clickUsingJavaScript(By.xpath(SaveVaccine));
Thread.sleep(3000);
			waitForVisibilityOf(By.xpath(JapaneseEncephalitisRecord));
			driver.findElement(By.xpath(JapaneseEncephalitisRecord));
			highlightElement(By.xpath(JapaneseEncephalitisRecord));
			clickUsingJavaScript(By.xpath(JapaneseEncephalitisRecord));

			
			
			waitForVisibilityOf(By.xpath(Jenvac));
			driver.findElement(By.xpath(Jenvac));
			highlightElement(By.xpath(Jenvac));
			clickUsingJavaScript(By.xpath(Jenvac));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate1 = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("d");
		        String formattedDay1 = currentDate.format(dateFormatter1);
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


			waitForVisibilityOf(By.xpath(SaveVaccine));
			driver.findElement(By.xpath(SaveVaccine));
			highlightElement(By.xpath(SaveVaccine));
			clickUsingJavaScript(By.xpath(SaveVaccine));
			Thread.sleep(3000);

			waitForVisibilityOf(By.xpath(MeningococcalMCV2by2Record));
			driver.findElement(By.xpath(MeningococcalMCV2by2Record));
			highlightElement(By.xpath(MeningococcalMCV2by2Record));
			clickUsingJavaScript(By.xpath(MeningococcalMCV2by2Record));

		
			waitForVisibilityOf(By.xpath(Menactra1));
			driver.findElement(By.xpath(Menactra1));
			highlightElement(By.xpath(Menactra1));
			clickUsingJavaScript(By.xpath(Menactra1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate2 = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("d");
		        String formattedDay2 = currentDate.format(dateFormatter2);

		        ;
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


			waitForVisibilityOf(By.xpath(SaveVaccine));
			driver.findElement(By.xpath(SaveVaccine));
			highlightElement(By.xpath(SaveVaccine));
			clickUsingJavaScript(By.xpath(SaveVaccine));

		}
	  @Test(priority = 28)
		public void Health12To15MonthVisitVaccine() throws InterruptedException {
			Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));
			Thread.sleep(2000);
			waitForVisibilityOf(By.xpath(MMR2by3Record));
			driver.findElement(By.xpath(MMR2by3Record));
			highlightElement(By.xpath(MMR2by3Record));
			clickUsingJavaScript(By.xpath(MMR2by3Record));

			
			
			waitForVisibilityOf(By.xpath(TresivacMMR2));
			driver.findElement(By.xpath(TresivacMMR2));
			highlightElement(By.xpath(TresivacMMR2));
			clickUsingJavaScript(By.xpath(TresivacMMR2));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		       
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


			waitForVisibilityOf(By.xpath(SaveVaccine));
			driver.findElement(By.xpath(SaveVaccine));
			highlightElement(By.xpath(SaveVaccine));
			clickUsingJavaScript(By.xpath(SaveVaccine));
			Thread.sleep(2000);
			waitForVisibilityOf(By.xpath(Varicella1by2Record));
			driver.findElement(By.xpath(Varicella1by2Record));
			highlightElement(By.xpath(Varicella1by2Record));
			clickUsingJavaScript(By.xpath(Varicella1by2Record));

			
			
			waitForVisibilityOf(By.xpath(Varilix));
			driver.findElement(By.xpath(Varilix));
			highlightElement(By.xpath(Varilix));
			clickUsingJavaScript(By.xpath(Varilix));


			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate1 = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("d");
		        String formattedDay1 = currentDate.format(dateFormatter1);

		      
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
		

			waitForVisibilityOf(By.xpath(SaveVaccine));
			driver.findElement(By.xpath(SaveVaccine));
			highlightElement(By.xpath(SaveVaccine));
			clickUsingJavaScript(By.xpath(SaveVaccine));
			Thread.sleep(2000);
			waitForVisibilityOf(By.xpath(PCVBoosterRecord));
			driver.findElement(By.xpath(PCVBoosterRecord));
			highlightElement(By.xpath(PCVBoosterRecord));
			clickUsingJavaScript(By.xpath(PCVBoosterRecord));

			
			
			waitForVisibilityOf(By.xpath(Prevnar13));
			driver.findElement(By.xpath(Prevnar13));
			highlightElement(By.xpath(Prevnar13));
			clickUsingJavaScript(By.xpath(Prevnar13));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate2 = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("d");
		        String formattedDay2 = currentDate.format(dateFormatter2);

		    
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


			waitForVisibilityOf(By.xpath(SaveVaccine));
			driver.findElement(By.xpath(SaveVaccine));
			highlightElement(By.xpath(SaveVaccine));
			clickUsingJavaScript(By.xpath(SaveVaccine));
			Thread.sleep(2000);
			waitForVisibilityOf(By.xpath(japaneseEncephalitis2));
			driver.findElement(By.xpath(japaneseEncephalitis2));
			highlightElement(By.xpath(japaneseEncephalitis2));
			clickUsingJavaScript(By.xpath(japaneseEncephalitis2));

			
			waitForVisibilityOf(By.xpath(Jenvac2));
			driver.findElement(By.xpath(Jenvac2));
			highlightElement(By.xpath(Jenvac2));
			clickUsingJavaScript(By.xpath(Jenvac2));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate3 = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("d");
		        String formattedDay3 = currentDate.format(dateFormatter3);

		    
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


			waitForVisibilityOf(By.xpath(SaveVaccine));
			driver.findElement(By.xpath(SaveVaccine));
			highlightElement(By.xpath(SaveVaccine));
			clickUsingJavaScript(By.xpath(SaveVaccine));

		}  @Test(priority = 29) public void Health16To18MonthVisitVaccine() throws
		  InterruptedException { Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));
		  driver.findElement(By.xpath(DTPBossterRecord));
		  highlightElement(By.xpath(DTPBossterRecord));
		  clickUsingJavaScript(By.xpath(DTPBossterRecord));

		 
		  
		  waitForVisibilityOf(By.xpath(EasySix1));
		  driver.findElement(By.xpath(EasySix1));
		  highlightElement(By.xpath(EasySix1));
		  clickUsingJavaScript(By.xpath(EasySix1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		      
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));



		  }
		
		 @Test(priority = 30) public void Health18MonthVisitVaccine() throws
		  InterruptedException { Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));
		 Thread.sleep(2000);
			waitForVisibilityOf(By.xpath(HepA2by2Record));
		  driver.findElement(By.xpath(HepA2by2Record));
		  highlightElement(By.xpath(HepA2by2Record));
		  clickUsingJavaScript(By.xpath(HepA2by2Record));

		
		  
		  waitForVisibilityOf(By.xpath(Biovac1));
		  driver.findElement(By.xpath(Biovac1)); highlightElement(By.xpath(Biovac1));
		  clickUsingJavaScript(By.xpath(Biovac1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));
Thread.sleep(2000);

		  waitForVisibilityOf(By.xpath(influenza3by6Record));
		  driver.findElement(By.xpath(influenza3by6Record));
		  highlightElement(By.xpath(influenza3by6Record));
		  clickUsingJavaScript(By.xpath(influenza3by6Record));

		 
		  
		  waitForVisibilityOf(By.xpath(influvac1));
		  driver.findElement(By.xpath(influvac1));
		  highlightElement(By.xpath(influvac1));
		  clickUsingJavaScript(By.xpath(influvac1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate1 = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("d");
		        String formattedDay1 = currentDate.format(dateFormatter1);

		       
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));

		  
		  waitForVisibilityOf(By.xpath(Varicella2Record));
		  driver.findElement(By.xpath(Varicella2Record));
		  highlightElement(By.xpath(Varicella2Record));
		  clickUsingJavaScript(By.xpath(Varicella2Record));

		
		  
		  waitForVisibilityOf(By.xpath(Varilix));
		  driver.findElement(By.xpath(Varilix));
		  highlightElement(By.xpath(Varilix));
		  clickUsingJavaScript(By.xpath(Varilix));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate2 = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("d");
		        String formattedDay2 = currentDate.format(dateFormatter2);

		       
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));
		  
		  waitForVisibilityOf(By.xpath(varicella2));
		  driver.findElement(By.xpath(varicella2));
		  highlightElement(By.xpath(varicella2));
		  clickUsingJavaScript(By.xpath(varicella2));

		
		  
		  waitForVisibilityOf(By.xpath(Varilix));
		  driver.findElement(By.xpath(Varilix));
		  highlightElement(By.xpath(Varilix));
		  clickUsingJavaScript(By.xpath(Varilix));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate3 = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("d");
		        String formattedDay3 = currentDate.format(dateFormatter3);

		      
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));



		  }
		 @Test(priority = 31) public void Health2YearsVisitVaccine() throws
		  InterruptedException {Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));
			
			Thread.sleep(2000);
		  Thread.sleep(10000); waitForVisibilityOf(By.xpath(TyphoidConjugateVRecord));
		  driver.findElement(By.xpath(TyphoidConjugateVRecord));
		  highlightElement(By.xpath(TyphoidConjugateVRecord));
		  clickUsingJavaScript(By.xpath(TyphoidConjugateVRecord));

		
		  
		  waitForVisibilityOf(By.xpath(Enteroshield1));
		  driver.findElement(By.xpath(Enteroshield1));
		  highlightElement(By.xpath(Enteroshield1));
		  clickUsingJavaScript(By.xpath(Enteroshield1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		      
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");

		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));

Thread.sleep(3000);
		  waitForVisibilityOf(By.xpath(MeningococcalVacRecord));
		  driver.findElement(By.xpath(MeningococcalVacRecord));
		  highlightElement(By.xpath(MeningococcalVacRecord));
		  clickUsingJavaScript(By.xpath(MeningococcalVacRecord));

		 
		  
		  waitForVisibilityOf(By.xpath(Menactra1));
		  driver.findElement(By.xpath(Menactra1));
		  highlightElement(By.xpath(Menactra1));
		  clickUsingJavaScript(By.xpath(Menactra1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate1 = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("d");
		        String formattedDay1 = currentDate.format(dateFormatter1);

		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));


		  }
		 @Test(priority = 32) public void Health2Years6monthVisitVaccine() throws
		  InterruptedException { Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));

		  waitForVisibilityOf(By.xpath(Influenza4by6Record));
		  driver.findElement(By.xpath(Influenza4by6Record));
		  highlightElement(By.xpath(Influenza4by6Record));
		  clickUsingJavaScript(By.xpath(Influenza4by6Record));

		  waitForVisibilityOf(By.xpath(influvac1));
		  driver.findElement(By.xpath(influvac1));
		  highlightElement(By.xpath(influvac1));
		  clickUsingJavaScript(By.xpath(influvac1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		       
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));








		  }


		  @Test(priority = 33) public void Health3Years6monthVisitVaccine() throws
		  InterruptedException { Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));

		  waitForVisibilityOf(By.xpath(Influenza5));
		  driver.findElement(By.xpath(Influenza5));
		  highlightElement(By.xpath(Influenza5));
		  clickUsingJavaScript(By.xpath(Influenza5));

		  waitForVisibilityOf(By.xpath(influvac1));
		  driver.findElement(By.xpath(influvac1));
		  highlightElement(By.xpath(influvac1));
		  clickUsingJavaScript(By.xpath(influvac1));
		  
			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		      
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));





		  }

		
		  @Test(priority = 34) public void Health4To6YearsVisitVaccine() throws
		  InterruptedException { Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));



		  driver.findElement(By.xpath(DTPBoosterRecord));
		  highlightElement(By.xpath(DTPBoosterRecord));
		  clickUsingJavaScript(By.xpath(DTPBoosterRecord));

		  waitForVisibilityOf(By.xpath(DTPBooster));
		  driver.findElement(By.xpath(DTPBooster));
		  highlightElement(By.xpath(DTPBooster));
		  clickUsingJavaScript(By.xpath(DTPBooster));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		       
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));



		  Thread.sleep(10000);

		  waitForVisibilityOf(By.xpath(ipvB2Record));
		  driver.findElement(By.xpath(ipvB2Record));
		  highlightElement(By.xpath(ipvB2Record));
		  clickUsingJavaScript(By.xpath(ipvB2Record));

		  waitForVisibilityOf(By.xpath(ipvB2));
		  driver.findElement(By.xpath(ipvB2)); highlightElement(By.xpath(ipvB2));
		  clickUsingJavaScript(By.xpath(ipvB2));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate1 = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("d");
		        String formattedDay1 = currentDate.format(dateFormatter1);

		       
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");

		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));



		  Thread.sleep(10000);

			


		  Thread.sleep(10000);

		  waitForVisibilityOf(By.xpath(MMR3by3Record));
		  driver.findElement(By.xpath(MMR3by3Record));
		  highlightElement(By.xpath(MMR3by3Record));
		  clickUsingJavaScript(By.xpath(MMR3by3Record));

		  waitForVisibilityOf(By.xpath(MMR3by3));
		  driver.findElement(By.xpath(MMR3by3)); highlightElement(By.xpath(MMR3by3));
		  clickUsingJavaScript(By.xpath(MMR3by3));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate3 = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("d");
		        String formattedDay3 = currentDate.format(dateFormatter3);

		       
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));


		  }
		  @Test(priority = 35) public void Health4Years6monthVisitVaccine() throws
		  InterruptedException { Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));

		  waitForVisibilityOf(By.xpath(Influenza6));
		  driver.findElement(By.xpath(Influenza6));
		  highlightElement(By.xpath(Influenza6));
		  clickUsingJavaScript(By.xpath(Influenza6));

		  waitForVisibilityOf(By.xpath(influvac1));
		  driver.findElement(By.xpath(influvac1));
		  highlightElement(By.xpath(influvac1));
		  clickUsingJavaScript(By.xpath(influvac1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));








		  }
		  @Test(priority = 36) public void Health5Years6monthVisitVaccine() throws
		  InterruptedException { Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));

		  waitForVisibilityOf(By.xpath(Influenza7));
		  driver.findElement(By.xpath(Influenza7));
		  highlightElement(By.xpath(Influenza7));
		  clickUsingJavaScript(By.xpath(Influenza7));

		  waitForVisibilityOf(By.xpath(influvac1));
		  driver.findElement(By.xpath(influvac1));
		  highlightElement(By.xpath(influvac1));
		  clickUsingJavaScript(By.xpath(influvac1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));








		  }
		  @Test(priority = 37) public void Health6Years6monthVisitVaccine() throws
		  InterruptedException { Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));

		  waitForVisibilityOf(By.xpath(Influenza8));
		  driver.findElement(By.xpath(Influenza8));
		  highlightElement(By.xpath(Influenza8));
		  clickUsingJavaScript(By.xpath(Influenza8));

		  waitForVisibilityOf(By.xpath(influvac1));
		  driver.findElement(By.xpath(influvac1));
		  highlightElement(By.xpath(influvac1));
		  clickUsingJavaScript(By.xpath(influvac1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));








		  }
		  @Test(priority = 38) public void Health7Years6monthVisitVaccine() throws
		  InterruptedException { Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));

		  waitForVisibilityOf(By.xpath(Influenza9));
		  driver.findElement(By.xpath(Influenza9));
		  highlightElement(By.xpath(Influenza9));
		  clickUsingJavaScript(By.xpath(Influenza9));

		  waitForVisibilityOf(By.xpath(influvac1));
		  driver.findElement(By.xpath(influvac1));
		  highlightElement(By.xpath(influvac1));
		  clickUsingJavaScript(By.xpath(influvac1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));








		  }
		  @Test(priority = 39) public void Health8Years6monthVisitVaccine() throws
		  InterruptedException { Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));

		  waitForVisibilityOf(By.xpath(Influenza10));
		  driver.findElement(By.xpath(Influenza10));
		  highlightElement(By.xpath(Influenza10));
		  clickUsingJavaScript(By.xpath(Influenza10));

		  waitForVisibilityOf(By.xpath(influvac1));
		  driver.findElement(By.xpath(influvac1));
		  highlightElement(By.xpath(influvac1));
		  clickUsingJavaScript(By.xpath(influvac1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));








		  }
		  @Test(priority = 40) public void Health9Years6monthVisitVaccine() throws
		  InterruptedException { Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));

		  waitForVisibilityOf(By.xpath(Influenza11));
		  driver.findElement(By.xpath(Influenza11));
		  highlightElement(By.xpath(Influenza11));
		  clickUsingJavaScript(By.xpath(Influenza11));

		  waitForVisibilityOf(By.xpath(influvac1));
		  driver.findElement(By.xpath(influvac1));
		  highlightElement(By.xpath(influvac1));
		  clickUsingJavaScript(By.xpath(influvac1));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));








		  }

		  @Test(priority = 41) public void Health10Years12YearVisitVaccine() throws
		  InterruptedException { Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));
			
		  waitForVisibilityOf(By.xpath(TdapTDRecord));
		  driver.findElement(By.xpath(TdapTDRecord));
		  highlightElement(By.xpath(TdapTDRecord));
		  clickUsingJavaScript(By.xpath(TdapTDRecord));
		  
		  waitForVisibilityOf(By.xpath(TDVAC));
		  driver.findElement(By.xpath(TDVAC));
		  highlightElement(By.xpath(TDVAC));
		  clickUsingJavaScript(By.xpath(TDVAC));


			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));



		  }

	
		  @Test(priority = 42) public void Health10YearsVisitVaccine() throws
		  InterruptedException { Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));

			waitForVisibilityOf(By.xpath(HPV1by2));
			  driver.findElement(By.xpath(HPV1by2));
			  highlightElement(By.xpath(HPV1by2));
			  clickUsingJavaScript(By.xpath(HPV1by2));

			  waitForVisibilityOf(By.xpath(Gardasil));
			  driver.findElement(By.xpath(Gardasil));
			  highlightElement(By.xpath(Gardasil));
			  clickUsingJavaScript(By.xpath(Gardasil));
		  
			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));








		  }


	
		  @Test(priority = 43) public void Health10Years6MonthVisitVaccine() throws
		  InterruptedException { Thread.sleep(10000);

			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));

		  waitForVisibilityOf(By.xpath(HPV2by2Record));
		  driver.findElement(By.xpath(HPV2by2Record));
		  highlightElement(By.xpath(HPV2by2Record));
		  clickUsingJavaScript(By.xpath(HPV2by2Record));

		  waitForVisibilityOf(By.xpath(Gardasil));
		  driver.findElement(By.xpath(Gardasil));
		  highlightElement(By.xpath(Gardasil));
		  clickUsingJavaScript(By.xpath(Gardasil));


			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");


		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));


	

		  }
		  @Test(priority = 44) public void HealthSpecialVaccine() throws
		  InterruptedException { Thread.sleep(10000);
		 
		 
		  waitForVisibilityOf(By.xpath(HealthProfile));
		  driver.findElement(By.xpath(HealthProfile));
		  highlightElement(By.xpath(HealthProfile));
		  clickUsingJavaScript(By.xpath(HealthProfile));
		 
		  waitForVisibilityOf(By.xpath(ImmunizationOption));
		  driver.findElement(By.xpath(ImmunizationOption));
		  highlightElement(By.xpath(ImmunizationOption));
		  clickUsingJavaScript(By.xpath(ImmunizationOption));
		 
		 
		 
			/*
			 * waitForVisibilityOf(By.xpath(ConfirmVaccinationDate));
			 * driver.findElement(By.xpath(ConfirmVaccinationDate));
			 * highlightElement(By.xpath(ConfirmVaccinationDate));
			 * clickUsingJavaScript(By.xpath(ConfirmVaccinationDate));
			 */
		 
		 
		 
		 
		 
		  Thread.sleep(3000); waitForVisibilityOf(By.xpath(SpecialVaccineClick));
		  driver.findElement(By.xpath(SpecialVaccineClick));
		  highlightElement(By.xpath(SpecialVaccineClick));
		  clickUsingJavaScript(By.xpath(SpecialVaccineClick));
		 
			
			  waitForVisibilityOf(By.xpath(CholeraVacccine));
			  driver.findElement(By.xpath(CholeraVacccine));
			  highlightElement(By.xpath(CholeraVacccine));
			  clickUsingJavaScript(By.xpath(CholeraVacccine));
			 
		 
			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			
			
			System.out.print("Dateclick");
			
			
			  LocalDate currentDate = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d");
		        String formattedDay = currentDate.format(dateFormatter);

		        // Locate the calendar element
		       // WebElement calendar = driver.findElement(By.xpath(ClickCalender));

		        // Find and click the day element corresponding to the current date
		       // WebElement dayElement = calendar.findElement(By.xpath("//*[text()='" + formattedDay + "']"));
		        //dayElement.click();
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay + "']"));
			  System.out.print("Dateclicked");

		  waitForVisibilityOf(By.xpath(SaveSpecialVaccine));
		  driver.findElement(By.xpath(SaveSpecialVaccine));
		  highlightElement(By.xpath(SaveSpecialVaccine));
		  clickUsingJavaScript(By.xpath(SaveSpecialVaccine));
		 Thread.sleep(3000);
		 
		  waitForVisibilityOf(By.xpath(VaccineRecord));
		  driver.findElement(By.xpath(VaccineRecord));
		  highlightElement(By.xpath(VaccineRecord));
		  clickUsingJavaScript(By.xpath(VaccineRecord));
		  
		  waitForVisibilityOf(By.xpath(BrandName));
		  driver.findElement(By.xpath(BrandName));
		  highlightElement(By.xpath(BrandName));
		  clickUsingJavaScript(By.xpath(BrandName));
		  
		  waitForVisibilityOf(By.xpath(RecievedDate));
		  driver.findElement(By.xpath(RecievedDate));
		  highlightElement(By.xpath(RecievedDate));
		  clickUsingJavaScript(By.xpath(RecievedDate));
		  
		  
		  LocalDate currentDate1 = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("d");
	        String formattedDay1 = currentDate1.format(dateFormatter1);

	        
		 
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay1 + "']"));
		  
			/*
			 * waitForVisibilityOf(By.xpath(ClickDate));
			 * driver.findElement(By.xpath(ClickDate));
			 * highlightElement(By.xpath(ClickDate));
			 * clickUsingJavaScript(By.xpath(ClickDate));
			 */
		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));
		 
		 }
		 




		// @AfterClass public void close() throws IOException {

		@AfterMethod
		public void screenShot(ITestResult result) {
			// usingITestResult.FAILURE is equals to result.getStatus then it // enter into
			// ifcondition
			if (ITestResult.FAILURE == result.getStatus()) {
				try { // To createreference of TakesScreenshot
					EventFiringWebDriver edriver = new EventFiringWebDriver(driver); // Call method to capture screenshot
					File src = edriver.getScreenshotAs(OutputType.FILE); // Copy files to specific location
					// result.getName() will return name of test case so that screenshot namewill //
					// be same as test case name
					FileUtils.copyFile(src, new File("C:\\ScreenShotFolder\\" + result.getName() + ".png"));
					System.out.println("Successfully captured a screenshot");
					// driver.quit();
				} catch (Exception e) {
					System.out.println("Exception while taking screenshot " + e.getMessage());

					// driver.quit(); //Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe
					// /T"); }

				}
			}
		}







}
