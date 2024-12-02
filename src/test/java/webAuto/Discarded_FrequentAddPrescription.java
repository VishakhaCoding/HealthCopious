package webAuto;

import java.io.File;
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
import org.testng.annotations.Test;

public class Discarded_FrequentAddPrescription {
public static WebDriver driver;
	
	public static String doctorLoginLink = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
	public static String mobileNumber = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String createPatient = "createPatient";
	public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
	public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
	public static String clickPatient = "li.clearfix";
	public static String AddNewPrescription="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[1]/img";
	public static String chiefComplaint = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div/div/div[7]/app-cutom-card/div/img";
	public static String complaintDetails = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[6]";
	public static String moreSymptoms = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[3]/div/div/div[1]";
	public static String complainSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[1]/div[2]/div/input";
	public static String complainNew = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[1]/div[2]/button";
	public static String vitalsButton = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[2]/div[1]";
	public static String frequent = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]";
	public static String Freqweight = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqHeight = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[2]/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqHeadcircumferance="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[3]/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqCC="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[4]/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqTemp="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[5]/div/mat-form-field/div/div[1]/div[3]/input";
	public static String vitals = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]";
	public static String FreqVitalweight="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[3]/div/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input"; 
	public static String FreqVitalHeight ="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[3]/div/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqVitalHeadcircumferance="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[3]/div/div[3]/div[2]/mat-form-field/div/div[1]/div[3]/input"; 
	public static String FreqVitalCC ="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[3]/div/div[4]/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqVitalTemp ="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[3]/div/div[5]/div/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqBpAndHeart="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[3]";
	public static String FreqBPSys="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div[1]/mat-form-field/div/div[1]/div[3]/input";
	public static String freqBPDia="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqheartRate="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div[3]/mat-form-field/div/div[1]/div[3]/input";
	public static String Freqpulse="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div[4]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqBloodAndAnalysis="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[4]";
	public static String FreqHaemoglobin="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[1]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqBloodSugarRandom="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String freqBloodSugarF="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[3]/mat-form-field/div/div[1]/div[3]/input";
	public static String freqBloodSugarPP="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[4]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqBlood="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[5]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqLipidProfile="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[5]";
	public static String FreqCholestrerolHDL="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[5]/div/div/div/div/div[1]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqCholestrerolLDL="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[5]/div/div/div/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqtotalCholesterol="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[5]/div/div/div/div/div[3]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqTriglycerides="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[5]/div/div/div/div/div[4]/mat-form-field/div/div[1]/div[3]/input";
	public static String FreqOnExamination="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[3]";
	public static String FreqExamination ="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[12]/app-cutom-card/div";
	public static String FreqDiagnosisOption="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[4]/div[1]";
	public static String FreqDiagnosis="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[4]/div/div/div/div[2]/div[1]/div/div/div[4]/app-cutom-card/div";
	public static String FreqMedicine="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[5]/div[1]";
	public static String freqmedicineSearch="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/input";
	public static String Dolocare="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/ngb-typeahead-window/button[1]";
	public static String FreqInstruction="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[4]/div/app-language-select-textbox/div/input";
	public static String FreqMedAddtoList="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[5]";
	public static String FreqPopularOption="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[1]/div/div[2]/div[2]";
	public static String FreqPopularSearch="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[1]/input";
	public static String FreqPopularMedicineClick="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[3]/div/div/img";
	public static String FreqFavouriteOption="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[1]/div/div[2]/div[3]";
	public static String FreqFavouriteSearch="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/input";
	public static String FreqFavouriteClick="/html/body/div[5]/div/div/div/mat-option/span";
	public static String FreqFavouriteClickMedicine="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[2]/div/div/img";
	public static String FreqDietaryAdviceOption="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[6]/div[3]/div";
	public static String FreqDietaryAdd="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[2]/div[1]/div/div/div[32]/app-cutom-card/div";
	public static String FreqGeneralInstruction="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[7]/div[1]";
	public static String FreqInstructionAdd="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[2]/div[1]/div/div/div[1]/app-cutom-card/div";
	public static String FreqInstructionImpNote="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[2]/app-prescription-live-preview/div/div/mat-chip-list/div/mat-chip[2]";
	public static String FreqprescriptionSave="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[1]/div[1]";
	public static String FreqprescriptionProceed="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[1]/div[2]";
	public static String FreqnextFollowupDate="/html/body/div[5]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div/div[1]/div[2]/mat-datepicker-toggle/button";
	public static String FreqFollowupTypes="/html/body/div[5]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[1]/div[2]/div[1]/mat-form-field[2]/div/div[1]/div/mat-select/div";
	public static String FreqAppointment="/html/body/div[5]/div[4]/div/div/div/mat-option[2]/span";
	public static String FreqFollowupMessage="/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[1]/div[2]/div[2]/mat-chip-list/div/mat-chip[2]";
	public static String FreqConfirmandPrint="/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[2]/button[2]";
	public static String FreqprescriptionDone="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-prescriptionpreview/div[1]/div/div[3]/div";
	public static String FreqGoHome="/html/body/div[4]/div[2]/div/mat-dialog-container/div[4]/div[2]/button[2]";
	public static String FreqnextFollowupSelectDate="/html/body/div[5]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[5]/td[1]/div[1]";
	public static String OTP1="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]"; 
	   public static String OTP2="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]"; 
	   public static String OTP3="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]"; 
	   public static String OTP4="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	   public static String OTP5="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	   public static String OTP6="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]"; 
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

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		
		/*
		 * DesiredCapabilities cap = DesiredCapabilities.chrome();
		 * cap.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, false);
		 * ChromeOptions opt = new ChromeOptions(); opt.merge(cap); WebDriver driver =
		 * new ChromeDriver(opt);
		 */
		 
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://stage.copious.care:4200/");
		 //driver.get("https://opd.copious.care/");
	}

	/*
	 * @Test(priority = 0) public void clickDoctorLoginLink() {
	 * 
	 * waitForVisibilityOf(By.xpath(doctorLoginLink)); WebElement textbox =
	 * driver.findElement(By.xpath(doctorLoginLink)); //
	 * textbox.sendKeys(Keys.ENTER); highlightElement(By.xpath(doctorLoginLink));
	 * clickUsingJavaScript(By.xpath(doctorLoginLink));
	 * 
	 * }
	 */

	@Test(priority = 1)
	public void numberField() {
		waitForVisibilityOf(By.xpath(mobileNumber));
		driver.findElement(By.xpath(mobileNumber)).sendKeys("9665002440");
		highlightElement(By.xpath(mobileNumber));
		clickUsingJavaScript(By.xpath(mobileNumber));
	}

	@Test(priority = 2)
	public void sendOTP() throws InterruptedException {
		Thread.sleep(2000);
		waitForVisibilityOf(By.xpath(sendOTP));
		highlightElement(By.xpath(sendOTP));
		clickUsingJavaScript(By.xpath(sendOTP));
		
		waitForVisibilityOf(By.xpath(OTP1));
	   	driver.findElement(By.xpath(OTP1)).sendKeys("1");;
	   	highlightElement(By.xpath(OTP1));
	   	Thread.sleep(1000);
	   	waitForVisibilityOf(By.xpath(OTP2));
	   	driver.findElement(By.xpath(OTP2)).sendKeys("4");
	   	highlightElement(By.xpath(OTP2));
	   	Thread.sleep(1000);
	   	waitForVisibilityOf(By.xpath(OTP3));
	   	driver.findElement(By.xpath(OTP3)).sendKeys("0");;
	   	highlightElement(By.xpath(OTP3));
	   	Thread.sleep(1000);
	   	waitForVisibilityOf(By.xpath(OTP4));
	   	driver.findElement(By.xpath(OTP4)).sendKeys("5");;
	   	highlightElement(By.xpath(OTP4));
	   	Thread.sleep(1000);
	   	waitForVisibilityOf(By.xpath(OTP5));
	   	driver.findElement(By.xpath(OTP5)).sendKeys("2");;
	   	highlightElement(By.xpath(OTP5));
	   	Thread.sleep(1000);
	   	waitForVisibilityOf(By.xpath(OTP6));
	   	driver.findElement(By.xpath(OTP6)).sendKeys("0");;
	   	highlightElement(By.xpath(OTP6));
	       
	}

	@Test(priority = 3)
	public void verifyButton() throws InterruptedException {
		Thread.sleep(10000);
		waitForVisibilityOf(By.xpath(verifyOTP));
		driver.findElement(By.xpath(verifyOTP));
		highlightElement(By.xpath(verifyOTP));
		clickUsingJavaScript(By.xpath(verifyOTP));
		
	}

	@Test(priority = 4)
	public void searchBar() {
		waitForVisibilityOf(By.xpath(searchBar));
		driver.findElement(By.xpath(searchBar)).sendKeys("Netra");
		
		//driver.findElement(By.xpath(searchBar)).sendKeys("pres");
		highlightElement(By.xpath(searchBar));
		clickUsingJavaScript(By.xpath(searchBar));
	}

	@Test(priority = 5)
	public void searchOpt() throws InterruptedException {
		Thread.sleep(3000);
		waitForVisibilityOf(By.xpath(searchOpt));
		driver.findElement(By.xpath(searchOpt));
		highlightElement(By.xpath(searchOpt));
		clickUsingJavaScript(By.xpath(searchOpt));
	}

	/*
	 * @Test(priority = 6) public void clickPatient() throws InterruptedException {
	 * Thread.sleep(10000);
	 * 
	 * waitForVisibilityOf(By.cssSelector(clickPatient));
	 * driver.findElement(By.cssSelector(clickPatient));
	 * highlightElement(By.cssSelector(clickPatient));
	 * clickUsingJavaScript(By.cssSelector(clickPatient)); }
	 */

	@Test(priority = 7)
	public void AddNewPrescription() throws InterruptedException {
		waitForVisibilityOf(By.xpath(AddNewPrescription));
		driver.findElement(By.xpath(AddNewPrescription));
		highlightElement(By.xpath(AddNewPrescription));
		clickUsingJavaScript(By.xpath(AddNewPrescription));
	}
	@Test(priority = 8)
	public void chiefComplaint() throws InterruptedException {
		waitForVisibilityOf(By.xpath(chiefComplaint));
		driver.findElement(By.xpath(chiefComplaint));
		
		highlightElement(By.xpath(chiefComplaint));
		clickUsingJavaScript(By.xpath(chiefComplaint));
	}

	@Test(priority = 9)
	public void complaintDetails() throws InterruptedException {
		waitForVisibilityOf(By.xpath(complaintDetails));
		driver.findElement(By.xpath(complaintDetails)); 
		highlightElement(By.xpath(complaintDetails));
		clickUsingJavaScript(By.xpath(complaintDetails));
	}
	
	  @Test(priority = 10) public void moreSymptoms() throws InterruptedException {
	  waitForVisibilityOf(By.xpath(moreSymptoms));
	  driver.findElement(By.xpath(moreSymptoms));
	  highlightElement(By.xpath(moreSymptoms));
	  clickUsingJavaScript(By.xpath(moreSymptoms)); }

	
	
	 
	  @Test(priority = 11) public void vitalsButton() throws InterruptedException {
			Thread.sleep(15000);
	  waitForVisibilityOf(By.xpath(vitalsButton));
	  driver.findElement(By.xpath(vitalsButton));
	  highlightElement(By.xpath(vitalsButton));
	  clickUsingJavaScript(By.xpath(vitalsButton)); }
	  
	  
	  
	
	
	
	
	
	/*
	 * @Test(priority = 12) public void frequent() {
	 * 
	 * waitForVisibilityOf(By.xpath(frequent));
	 * driver.findElement(By.xpath(frequent)); highlightElement(By.xpath(frequent));
	 * clickUsingJavaScript(By.xpath(frequent));
	 * 
	 * highlightElement(By.xpath(Freqweight));
	 * driver.findElement(By.xpath(Freqweight)).clear();
	 * driver.findElement(By.xpath(Freqweight)).sendKeys("10");
	 * 
	 * highlightElement(By.xpath(FreqHeight));
	 * driver.findElement(By.xpath(FreqHeight)).clear();
	 * driver.findElement(By.xpath(FreqHeight)).sendKeys("100");
	 * 
	 * highlightElement(By.xpath(FreqHeadcircumferance));
	 * driver.findElement(By.xpath(FreqHeadcircumferance)).clear();
	 * driver.findElement(By.xpath(FreqHeadcircumferance)).sendKeys("100");
	 * 
	 * highlightElement(By.xpath(FreqCC));
	 * driver.findElement(By.xpath(FreqCC)).clear();
	 * driver.findElement(By.xpath(FreqCC)).sendKeys("100");
	 * 
	 * highlightElement(By.xpath(FreqTemp));
	 * driver.findElement(By.xpath(FreqTemp)).clear();
	 * driver.findElement(By.xpath(FreqTemp)).sendKeys("100"); }
	 */
  @Test(priority = 13) public void vitalsOption() throws InterruptedException {
	  
		//Thread.sleep(15000);
		  
		  waitForVisibilityOf(By.xpath(vitals)); 
		  driver.findElement(By.xpath(vitals));
		  highlightElement(By.xpath(vitals)); clickUsingJavaScript(By.xpath(vitals));
		  
		  highlightElement(By.xpath(FreqVitalweight));
		  driver.findElement(By.xpath(FreqVitalweight)).clear();
		  driver.findElement(By.xpath(FreqVitalweight)).sendKeys("10");
		  
		  highlightElement(By.xpath(FreqVitalHeight)); driver.findElement(By.xpath(FreqVitalHeight)).clear();
		  driver.findElement(By.xpath(FreqVitalHeight)).sendKeys("100"); 
		  
		  highlightElement(By.xpath(FreqVitalHeadcircumferance)); driver.findElement(By.xpath(FreqVitalHeadcircumferance)).clear();
		  driver.findElement(By.xpath(FreqVitalHeadcircumferance)).sendKeys("100"); 
		  
		  highlightElement(By.xpath(FreqVitalCC)); driver.findElement(By.xpath(FreqVitalCC)).clear();
		  driver.findElement(By.xpath(FreqVitalCC)).sendKeys("100"); 
		  
		  highlightElement(By.xpath(FreqVitalTemp)); driver.findElement(By.xpath(FreqVitalTemp)).clear();
		  driver.findElement(By.xpath(FreqVitalTemp)).sendKeys("100"); 
  }
  @Test(priority = 14) public void FreqBpandHeartOption() throws
  InterruptedException { 
 
		Thread.sleep(15000);
waitForVisibilityOf(By.xpath(FreqBpAndHeart));
  driver.findElement(By.xpath(FreqBpAndHeart));
  highlightElement(By.xpath(FreqBpAndHeart));
  clickUsingJavaScript(By.xpath(FreqBpAndHeart));
  
  highlightElement(By.xpath(FreqBPSys));
  driver.findElement(By.xpath(FreqBPSys)).clear();
  driver.findElement(By.xpath(FreqBPSys)).sendKeys("80");
  
  highlightElement(By.xpath(freqBPDia));
  driver.findElement(By.xpath(freqBPDia)).clear();
  driver.findElement(By.xpath(freqBPDia)).sendKeys("100");
  
  highlightElement(By.xpath(FreqheartRate));
  driver.findElement(By.xpath(FreqheartRate)).clear();
  driver.findElement(By.xpath(FreqheartRate)).sendKeys("75");
  
  highlightElement(By.xpath(Freqpulse));
  driver.findElement(By.xpath(Freqpulse)).clear();
  driver.findElement(By.xpath(Freqpulse)).sendKeys("77");
  
  }
  
  @Test(priority = 15) public void freqBloodAndAnalysis() throws InterruptedException 
  { 
		Thread.sleep(15000);
  waitForVisibilityOf(By.xpath(FreqBloodAndAnalysis));
  driver.findElement(By.xpath(FreqBloodAndAnalysis)); 
  highlightElement(By.xpath(FreqBloodAndAnalysis));
  clickUsingJavaScript(By.xpath(FreqBloodAndAnalysis));
  
  highlightElement(By.xpath(FreqHaemoglobin));
  driver.findElement(By.xpath(FreqHaemoglobin)).clear();
  driver.findElement(By.xpath(FreqHaemoglobin)).sendKeys("12");
  
  highlightElement(By.xpath(FreqBloodSugarRandom));
  driver.findElement(By.xpath(FreqBloodSugarRandom)).clear();
  driver.findElement(By.xpath(FreqBloodSugarRandom)).sendKeys("110");
  
  highlightElement(By.xpath(freqBloodSugarF));
  driver.findElement(By.xpath(freqBloodSugarF)).clear();
  driver.findElement(By.xpath(freqBloodSugarF)).sendKeys("140");
  
  highlightElement(By.xpath(freqBloodSugarPP));
  driver.findElement(By.xpath(freqBloodSugarPP)).clear();
  driver.findElement(By.xpath(freqBloodSugarPP)).sendKeys("120");
  
  highlightElement(By.xpath(FreqBlood));
  driver.findElement(By.xpath(FreqBlood)).clear();
  driver.findElement(By.xpath(FreqBlood)).sendKeys("10");
  
  }
  @Test(priority = 16) public void FreqLipidProfile() throws InterruptedException {
		Thread.sleep(15000);
	  waitForVisibilityOf(By.xpath(FreqLipidProfile));
	  driver.findElement(By.xpath(FreqLipidProfile));
	  highlightElement(By.xpath(FreqLipidProfile));
	  clickUsingJavaScript(By.xpath(FreqLipidProfile));
	  
	  highlightElement(By.xpath(FreqCholestrerolHDL));
	  driver.findElement(By.xpath(FreqCholestrerolHDL)).clear();
	  driver.findElement(By.xpath(FreqCholestrerolHDL)).sendKeys("30");
	  
	  highlightElement(By.xpath(FreqCholestrerolLDL));
	  driver.findElement(By.xpath(FreqCholestrerolLDL)).clear();
	  driver.findElement(By.xpath(FreqCholestrerolLDL)).sendKeys("40");
	  
	  highlightElement(By.xpath(FreqtotalCholesterol));
	  driver.findElement(By.xpath(FreqtotalCholesterol)).clear();
	  driver.findElement(By.xpath(FreqtotalCholesterol)).sendKeys("40");
	  
	  highlightElement(By.xpath(FreqTriglycerides));
	  driver.findElement(By.xpath(FreqTriglycerides)).clear();
	  driver.findElement(By.xpath(FreqTriglycerides)).sendKeys("40");
	  
	  }
  @Test(priority = 17) public void OnExamination() throws InterruptedException {
		Thread.sleep(15000);
		
	  waitForVisibilityOf(By.xpath(FreqOnExamination));
	  driver.findElement(By.xpath(FreqOnExamination));
	  highlightElement(By.xpath(FreqOnExamination));
	  clickUsingJavaScript(By.xpath(FreqOnExamination));
	  
		
		 
	 
driver.findElement(By.xpath(FreqExamination));
highlightElement(By.xpath(FreqExamination));
clickUsingJavaScript(By.xpath(FreqExamination));

}
  @Test(priority = 18) public void FreqDiagnosis() throws InterruptedException {
		Thread.sleep(15000);
		
	  waitForVisibilityOf(By.xpath(FreqDiagnosisOption));
	  driver.findElement(By.xpath(FreqDiagnosisOption)); //
	  highlightElement(By.xpath(FreqDiagnosisOption));
	  clickUsingJavaScript(By.xpath(FreqDiagnosisOption));
	  
		
		 
	 

driver.findElement(By.xpath(FreqDiagnosis));
highlightElement(By.xpath(FreqDiagnosis));
clickUsingJavaScript(By.xpath(FreqDiagnosis));

}
  @Test(priority = 19) public void Medicine() throws InterruptedException {
		Thread.sleep(15000);
	  waitForVisibilityOf(By.xpath(FreqMedicine));
	  driver.findElement(By.xpath(FreqMedicine)); highlightElement(By.xpath(FreqMedicine));
	  clickUsingJavaScript(By.xpath(FreqMedicine));
	  
	  
	  
	  
	  }
	 

@Test(priority = 20)
public void Medicine1() throws InterruptedException {
	 waitForVisibilityOf(By.xpath(FreqMedicine));
	  driver.findElement(By.xpath(FreqMedicine)); 
	  highlightElement(By.xpath(FreqMedicine));
	  clickUsingJavaScript(By.xpath(FreqMedicine));

	
	 waitForVisibilityOf(By.xpath(freqmedicineSearch));
	highlightElement(By.xpath(freqmedicineSearch));
	driver.findElement(By.xpath(freqmedicineSearch)).sendKeys("dolo");
	waitForVisibilityOf(By.xpath(Dolocare));
	highlightElement(By.xpath(Dolocare));
	clickUsingJavaScript(By.xpath(Dolocare));
	
	waitForVisibilityOf(By.xpath(FreqInstruction));
	  highlightElement(By.xpath(FreqInstruction));
	  driver.findElement(By.xpath(FreqInstruction)).sendKeys("Drink water");
	  clickUsingJavaScript(By.xpath(FreqInstruction));
	  
	  waitForVisibilityOf(By.xpath(FreqMedAddtoList));
	  highlightElement(By.xpath(FreqMedAddtoList));
	  driver.findElement(By.xpath(FreqMedAddtoList));
	  clickUsingJavaScript(By.xpath(FreqMedAddtoList));
	 

		Thread.sleep(15000);
	waitForVisibilityOf(By.xpath(FreqPopularOption));
	highlightElement(By.xpath(FreqPopularOption));
	driver.findElement(By.xpath(FreqPopularOption));
	clickUsingJavaScript(By.xpath(FreqPopularOption));

	waitForVisibilityOf(By.xpath(FreqPopularSearch));
	highlightElement(By.xpath(FreqPopularSearch));
	driver.findElement(By.xpath(FreqPopularSearch)).sendKeys("new");

	waitForVisibilityOf(By.xpath(FreqPopularMedicineClick));
	highlightElement(By.xpath(FreqPopularMedicineClick));
	driver.findElement(By.xpath(FreqPopularMedicineClick));
	clickUsingJavaScript(By.xpath(FreqPopularMedicineClick));
	
	Thread.sleep(15000);
	waitForVisibilityOf(By.xpath(FreqFavouriteOption));
	highlightElement(By.xpath(FreqFavouriteOption));
	driver.findElement(By.xpath(FreqFavouriteOption));
	clickUsingJavaScript(By.xpath(FreqFavouriteOption));

	waitForVisibilityOf(By.xpath(FreqFavouriteSearch));
	highlightElement(By.xpath(FreqFavouriteSearch));
	driver.findElement(By.xpath(FreqFavouriteSearch)).sendKeys("test");

	waitForVisibilityOf(By.xpath(FreqFavouriteClick));
	highlightElement(By.xpath(FreqFavouriteClick));
	driver.findElement(By.xpath(FreqFavouriteClick));
	clickUsingJavaScript(By.xpath(FreqFavouriteClick));

	waitForVisibilityOf(By.xpath(FreqFavouriteClickMedicine));
	highlightElement(By.xpath(FreqFavouriteClickMedicine));
	driver.findElement(By.xpath(FreqFavouriteClickMedicine));
	clickUsingJavaScript(By.xpath(FreqFavouriteClickMedicine));
}
@Test(priority = 21)
public void FreqDietaryAdvice() throws InterruptedException {


	Thread.sleep(15000);
	  waitForVisibilityOf(By.xpath(FreqDietaryAdviceOption));
	  driver.findElement(By.xpath(FreqDietaryAdviceOption));
	  highlightElement(By.xpath(FreqDietaryAdviceOption));
	  clickUsingJavaScript(By.xpath(FreqDietaryAdviceOption));
	  
	 
	waitForVisibilityOf(By.xpath(FreqDietaryAdd));
	driver.findElement(By.xpath(FreqDietaryAdd));
	highlightElement(By.xpath(FreqDietaryAdd));
	clickUsingJavaScript(By.xpath(FreqDietaryAdd));

}
@Test(priority = 22)
public void FreqGeneralInstruction() throws InterruptedException {

	Thread.sleep(15000);
	waitForVisibilityOf(By.xpath(FreqGeneralInstruction));
	driver.findElement(By.xpath(FreqGeneralInstruction));
	highlightElement(By.xpath(FreqGeneralInstruction));
	clickUsingJavaScript(By.xpath(FreqGeneralInstruction));

	
	  waitForVisibilityOf(By.xpath(FreqInstructionAdd));
	  driver.findElement(By.xpath(FreqInstructionAdd));
	  highlightElement(By.xpath(FreqInstructionAdd));
	  clickUsingJavaScript(By.xpath(FreqInstructionAdd));
	 
	waitForVisibilityOf(By.xpath(FreqInstructionImpNote));
	driver.findElement(By.xpath(FreqInstructionImpNote));
	highlightElement(By.xpath(FreqInstructionImpNote));
	clickUsingJavaScript(By.xpath(FreqInstructionImpNote));

}
@Test(priority = 23)
public void SaveandProceed() throws InterruptedException {
	/*
	 * waitForVisibilityOf(By.xpath(FreqprescriptionSave));
	 * driver.findElement(By.xpath(FreqprescriptionSave));
	 * highlightElement(By.xpath(FreqprescriptionSave));
	 * clickUsingJavaScript(By.xpath(FreqprescriptionSave));
	 */
	
	  waitForVisibilityOf(By.xpath(FreqprescriptionProceed));
	  driver.findElement(By.xpath(FreqprescriptionProceed));
	  highlightElement(By.xpath(FreqprescriptionProceed));
	  clickUsingJavaScript(By.xpath(FreqprescriptionProceed)); 
	 
}
@Test(priority = 24)
public void FreqConfirmPrescription() throws InterruptedException {
	
	
	  waitForVisibilityOf(By.xpath(FreqnextFollowupDate));
	  //driver.findElement(By.xpath(FreqnextFollowupDate)).clear();
	  driver.findElement(By.xpath(FreqnextFollowupDate));
	  highlightElement(By.xpath(FreqnextFollowupDate));
	  clickUsingJavaScript(By.xpath(FreqnextFollowupDate));
	 
	  waitForVisibilityOf(By.xpath(FreqnextFollowupSelectDate));
	  driver.findElement(By.xpath(FreqnextFollowupSelectDate));
	  highlightElement(By.xpath(FreqnextFollowupSelectDate));
	  clickUsingJavaScript(By.xpath(FreqnextFollowupSelectDate));

	waitForVisibilityOf(By.xpath(FreqFollowupTypes));
	driver.findElement(By.xpath(FreqFollowupTypes));
	highlightElement(By.xpath(FreqFollowupTypes));
	clickUsingJavaScript(By.xpath(FreqFollowupTypes));

	waitForVisibilityOf(By.xpath(FreqAppointment));
	driver.findElement(By.xpath(FreqAppointment));
	highlightElement(By.xpath(FreqAppointment));
	clickUsingJavaScript(By.xpath(FreqAppointment));

	waitForVisibilityOf(By.xpath(FreqFollowupMessage));
	driver.findElement(By.xpath(FreqFollowupMessage));
	highlightElement(By.xpath(FreqFollowupMessage));
	clickUsingJavaScript(By.xpath(FreqFollowupMessage));
	
	Thread.sleep(15000);
	  waitForVisibilityOf(By.cssSelector(FreqConfirmandPrint));
	  driver.findElement(By.cssSelector(FreqConfirmandPrint));
	  highlightElement(By.cssSelector(FreqConfirmandPrint));
	  clickUsingJavaScript(By.cssSelector(FreqConfirmandPrint));
	 

Thread.sleep(20000);
waitForVisibilityOf(By.xpath(FreqprescriptionDone));
driver.findElement(By.xpath(FreqprescriptionDone));
highlightElement(By.xpath(FreqprescriptionDone));
clickUsingJavaScript(By.xpath(FreqprescriptionDone));


Thread.sleep(15000);
waitForVisibilityOf(By.xpath(FreqGoHome));
driver.findElement(By.xpath(FreqGoHome));
highlightElement(By.xpath(FreqGoHome));
clickUsingJavaScript(By.xpath(FreqGoHome));
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
  
  
  
	 






