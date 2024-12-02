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

public class Discarded_EndToEndWorkflow {
	public static WebDriver driver;

	
	public static String mobileNumber = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String QuickRx="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[1]";
	public static String OTP1 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]";
	public static String OTP2 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]";
	public static String OTP3 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]";
	public static String OTP4 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	public static String OTP5 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	public static String OTP6 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]";
	public static String createPatient = "createPatient";
	
	public static String GoHome = "//*[text()='Go Home']";
	public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
	public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
	public static String ClickHome = "//*[text()=' Home']";
	public static String clickPatient = "li.clearfix";
	public static String InvestigationClick = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[3]/img";
	public static String InvestigationClick1 = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[3]/img";
	public static String ReportsClick = "//div[div='Requisitions']/descendant::div[text()='Reports']";
	public static String UploadReport = "//*[text()='Upload Report']";
	public static String CreatedBy = "//div[@class='mat-form-field-infix ng-tns-c165-185']/ child::input";
	public static String DocumentOn = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/mat-form-field[3]/div/div[1]/div[1]/input";
	public static String BrownFile1 = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[4]/div[1]/div/div/div[1]/input";
	public static String UploadReportDoc = "//*[text()='Upload']";
	public static String RequisitionClick = "//*[text()='Requisitions']";
	public static String NewRequisition = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/div/app-patient-requisition/div/div[1]/div[2]/button[2]";
	public static String SelectTest = "//*[text()='RT-PCR']";
	public static String SelectPackageOption = "//*[text()='Packages']";
	public static String SelectPackage = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/form/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[3]/div[1]/mat-checkbox/label/span[1]";
	public static String RequisitionSaveAndShare = "//*[text()='Save & Preview']";
	public static String ShareRequisition = "//*[text()='Share Requisition']";
	public static String CancelOption = "//*[text()='Cancel']";
	public static String HealthProfile = "//*[text()='Health Profile']";
	public static String ImmunizationOption = "//*[text()='Immunization']";
	public static String ConfirmVaccinationDate = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[5]/button";
	public static String VaccineRecord = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[1]/td[8]/div";
	public static String RecievedDate = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[5]/div/img";
	public static String ClickDate = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[5]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[3]/div[2]/div";
	public static String SaveVaccine = "//*[text()='Save Vaccine']";
	public static String SpecialVaccineClick = "//*[text()='Special Vaccines']";
	public static String CholeraVacccine = "//*[text()='Meningococcal Vaccine']";
	public static String SelectDate1 = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[4]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[3]/div[1]/div";
	public static String ClickCalender = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[4]/div/img";
	public static String SaveSpecialVaccine = "//*[text()='Save Vaccine']";
	public static String ReceiptOption = "//*[text()='Bill/Receipt']";
	public static String ReceiptNo = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-receipt/div/div[2]/div/div[2]/mat-form-field[2]/div/div[1]/div/input";
	public static String Consultation = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-receipt/div/div[2]/div/div[4]/div[3]/input";
	public static String Vaccination = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-receipt/div/div[2]/div/div[6]/div[3]/input";
	public static String VaccinationCheckboxClick = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-receipt/div/div[2]/div/div[6]/img";
	public static String previewReceipt = "//*[text()='Preview Receipt']";
	public static String EnterPayerName = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[1]/mat-form-field[1]/div/div[1]/div/input";
	public static String PaymentMethodDropdown = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[1]/mat-form-field[2]/div/div[1]/div/mat-select";
	public static String PaymentMethod = "/html/body/div[2]/div[4]/div/div/div/mat-option[1]/span";
	public static String CreateReceipt = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[3]/button[2]";
	public static String CloseReceipt = "//*[text()='�']";
	public static String OtheCharges = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-receipt/div/div[2]/div/div[10]/div[3]/input";
	public static String AddMoreButton = "//*[text()='Add More']";
	public static String ExtraOtherCharges = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-receipt/div/div[2]/div/div[11]/div[2]/div/input";
	public static String ExtraCharges = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-receipt/div/div[2]/div/div[11]/div[3]/input";
	public static String Document = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[5]";
	public static String cirtificateOption = "//*[text()='Certificate']";
	public static String createCirtificate = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-certificate/div/div[1]/button";
	public static String cirtificateTypeDropdown = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[1]/div/div/div/div/button";
	public static String cirtificateType = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[1]/div/div/div/div/div/button[1]";
	public static String MessagePreviewclick = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[4]/div";
	public static String cirtificatePreview = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[5]/button";
	public static String SaveAndShare = "//*[text()='Save & share ']";
	public static String ReferralOption = "//*[text()='Referral']";
	public static String TapToCreateReferral = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-referral/div/div[3]/button";
	public static String SpecialityDropdown = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[1]/div/div/button";
	public static String SelectSpeciality = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[1]/div/div/div/button";
	public static String RefferingDrName = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[2]/mat-form-field[1]/div/div[1]/div/input";
	public static String RefferingDrEmail = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[2]/mat-form-field[2]/div/div[1]/div/input";
	public static String RefferingDrMobileNo = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[3]/mat-form-field[1]/div/div[1]/div/input";
	public static String HealthCondition = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[3]/mat-form-field[2]/div/div[1]/div/input";
	public static String Duration1 = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[4]/mat-form-field/div/div[1]/div/input";
	public static String ReferralPreview = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[7]/button";
	public static String ReferralSaveAndShare = "/html/body/div[2]/div[4]/div/mat-dialog-container/div/div[2]/div[2]/div";
	public static String ViewReceipt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-receipt/div/div[1]/div[3]/div/table/tbody/tr/td[4]/div";
	public static String CloseCertificate = "//*[text()='�']";
	public static String ViewCirtificate = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-certificate/div/div[2]/div/table/tbody/tr/td[5]/div";
	public static String CloseCirtificate = "//*[text()='�']";
	public static String ViewReceiptDoc = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-history/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/table/tbody/tr[1]/td[5]/div";
	public static String CloseReceipt1 = "//*[text()='�']";
	public static String AllDocuments = "//*[text()='All Documents']";
	public static String CertificateOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-history/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[5]";
	public static String ViewCirtificateDoc = "//*[text()=' View ']";
	public static String CloseCirtificateDoc = "//*[text()='�']";
	public static String InstructionAdd = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[1]/div[3]/div/div/button";
	public static void waitForVisibilityOf(By by) {
		try {

			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
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
		driver.manage().window().maximize();
		driver.get("http://stage.copious.care:4200/");
		// driver.manage().window().fullscreen();
		driver.get("https://app.copious.care/");
		// driver.get("https://stage.copious.care/");
		driver.manage().window().fullscreen();
	}

	
	@Test(priority = 1,groups="Regression")
	public void numberField() {
		waitForVisibilityOf(By.xpath(mobileNumber));
		driver.findElement(By.xpath(mobileNumber)).sendKeys("9665002440");
		highlightElement(By.xpath(mobileNumber));
		clickUsingJavaScript(By.xpath(mobileNumber));
	}

	@Test(priority = 2,groups="Regression")
	public void sendOTP() throws InterruptedException {
		Thread.sleep(5000);
		waitForVisibilityOf(By.xpath(sendOTP));
		highlightElement(By.xpath(sendOTP));
		clickUsingJavaScript(By.xpath(sendOTP));

		waitForVisibilityOf(By.xpath(OTP1));
		driver.findElement(By.xpath(OTP1)).sendKeys("1");
		;
		highlightElement(By.xpath(OTP1));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP2));
		driver.findElement(By.xpath(OTP2)).sendKeys("4");
		highlightElement(By.xpath(OTP2));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP3));
		driver.findElement(By.xpath(OTP3)).sendKeys("0");
		;
		highlightElement(By.xpath(OTP3));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP4));
		driver.findElement(By.xpath(OTP4)).sendKeys("5");
		;
		highlightElement(By.xpath(OTP4));

		waitForVisibilityOf(By.xpath(OTP5));
		driver.findElement(By.xpath(OTP5)).sendKeys("2");
		;
		highlightElement(By.xpath(OTP5));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP6));
		driver.findElement(By.xpath(OTP6)).sendKeys("0");
		;
		highlightElement(By.xpath(OTP6));

	}

	@Test(priority = 3,groups="Regression")
	public void verifyButton() throws InterruptedException {
		Thread.sleep(10000);
		waitForVisibilityOf(By.xpath(verifyOTP));
		driver.findElement(By.xpath(verifyOTP));
		highlightElement(By.xpath(verifyOTP));
		clickUsingJavaScript(By.xpath(verifyOTP));

	}

	@Test(priority = 4)
	public  void searchBar1() {
		waitForVisibilityOf(By.xpath(searchBar));
		driver.findElement(By.xpath(searchBar)).sendKeys("Test");
		
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

	

	 
	  
	 
	@Test(priority = 6,groups="Regression")
	public void searchBar2() throws InterruptedException {
		Thread.sleep(15000);
		

		waitForVisibilityOf(By.cssSelector(clickPatient));
		driver.findElement(By.cssSelector(clickPatient));
		highlightElement(By.cssSelector(clickPatient));
		clickUsingJavaScript(By.cssSelector(clickPatient));
	}

	@Test(priority = 7,groups="Regression")
	public void Investigation() throws InterruptedException {
		Thread.sleep(5000);

		waitForVisibilityOf(By.xpath(InvestigationClick));
		driver.findElement(By.xpath(InvestigationClick));
		highlightElement(By.xpath(InvestigationClick));
		clickUsingJavaScript(By.xpath(InvestigationClick));

		waitForVisibilityOf(By.xpath(ReportsClick));
		driver.findElement(By.xpath(ReportsClick));
		highlightElement(By.xpath(ReportsClick));
		clickUsingJavaScript(By.xpath(ReportsClick));

		waitForVisibilityOf(By.xpath(UploadReport));
		driver.findElement(By.xpath(UploadReport));
		highlightElement(By.xpath(UploadReport));
		clickUsingJavaScript(By.xpath(UploadReport));

	}
		@Test(priority = 8,groups="Regression")
		public void CreatedBy() throws InterruptedException {
			Thread.sleep(5000);
			
			
			
			/*
			 * waitForVisibilityOf(By.cssSelector(CreatedBy));
			 * driver.findElement(By.cssSelector(CreatedBy)).sendKeys("Abc");
			 * highlightElement(By.cssSelector(CreatedBy));
			 */
			 
			 
		
			waitForVisibilityOf(By.xpath(DocumentOn));
		driver.findElement(By.xpath(DocumentOn)).sendKeys("01/01/2023");
		highlightElement(By.xpath(DocumentOn));

		waitForVisibilityOf(By.xpath(BrownFile1));
		driver.findElement(By.xpath(BrownFile1)).sendKeys("C:\\Users\\Lenovo\\Desktop\\upNature.jpg");
		highlightElement(By.xpath(BrownFile1));

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(UploadReportDoc));
		driver.findElement(By.xpath(UploadReportDoc));
		highlightElement(By.xpath(UploadReportDoc));
		clickUsingJavaScript(By.xpath(UploadReportDoc));

	}

	@Test(priority = 9,groups="Regression")
	public void Investigation1() throws InterruptedException {

		Thread.sleep(5000);

		waitForVisibilityOf(By.xpath(InvestigationClick1));
		driver.findElement(By.xpath(InvestigationClick1));
		highlightElement(By.xpath(InvestigationClick1));
		clickUsingJavaScript(By.xpath(InvestigationClick1));

		waitForVisibilityOf(By.xpath(RequisitionClick));
		driver.findElement(By.xpath(RequisitionClick));
		highlightElement(By.xpath(RequisitionClick));
		clickUsingJavaScript(By.xpath(RequisitionClick));

		waitForVisibilityOf(By.xpath(NewRequisition));
		driver.findElement(By.xpath(NewRequisition));
		highlightElement(By.xpath(NewRequisition));
		clickUsingJavaScript(By.xpath(NewRequisition));

		Thread.sleep(3000);
		waitForVisibilityOf(By.xpath(SelectTest));
		driver.findElement(By.xpath(SelectTest));
		highlightElement(By.xpath(SelectTest));
		clickUsingJavaScript(By.xpath(SelectTest));

		waitForVisibilityOf(By.xpath(SelectPackageOption));
		driver.findElement(By.xpath(SelectPackageOption));
		highlightElement(By.xpath(SelectPackageOption));
		clickUsingJavaScript(By.xpath(SelectPackageOption));

		waitForVisibilityOf(By.xpath(SelectPackage));
		driver.findElement(By.xpath(SelectPackage));
		highlightElement(By.xpath(SelectPackage));
		clickUsingJavaScript(By.xpath(SelectPackage));

		Thread.sleep(15000);

		waitForVisibilityOf(By.xpath(RequisitionSaveAndShare));
		driver.findElement(By.xpath(RequisitionSaveAndShare));
		highlightElement(By.xpath(RequisitionSaveAndShare));
		clickUsingJavaScript(By.xpath(RequisitionSaveAndShare));

		Thread.sleep(10000);
		waitForVisibilityOf(By.xpath(ShareRequisition));
		driver.findElement(By.xpath(ShareRequisition));
		highlightElement(By.xpath(ShareRequisition));
		clickUsingJavaScript(By.xpath(ShareRequisition));

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(CancelOption));
		driver.findElement(By.xpath(CancelOption));
		highlightElement(By.xpath(CancelOption));
		clickUsingJavaScript(By.xpath(CancelOption));

	}

	@Test(priority = 10,groups="Regression")
	public void HealthProfile() throws InterruptedException {
		Thread.sleep(5000);

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
		 

		Thread.sleep(3000);
		waitForVisibilityOf(By.xpath(SpecialVaccineClick));
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

		waitForVisibilityOf(By.xpath(SelectDate1));
		driver.findElement(By.xpath(SelectDate1));
		highlightElement(By.xpath(SelectDate1));
		clickUsingJavaScript(By.xpath(SelectDate1));

		waitForVisibilityOf(By.xpath(SaveSpecialVaccine));
		driver.findElement(By.xpath(SaveSpecialVaccine));
		highlightElement(By.xpath(SaveSpecialVaccine));
		clickUsingJavaScript(By.xpath(SaveSpecialVaccine));

		waitForVisibilityOf(By.xpath(VaccineRecord));
		driver.findElement(By.xpath(VaccineRecord));
		highlightElement(By.xpath(VaccineRecord));
		clickUsingJavaScript(By.xpath(VaccineRecord));

		waitForVisibilityOf(By.xpath(RecievedDate));
		driver.findElement(By.xpath(RecievedDate));
		highlightElement(By.xpath(RecievedDate));
		clickUsingJavaScript(By.xpath(RecievedDate));

		waitForVisibilityOf(By.xpath(ClickDate));
		driver.findElement(By.xpath(ClickDate));
		highlightElement(By.xpath(ClickDate));
		clickUsingJavaScript(By.xpath(ClickDate));

		waitForVisibilityOf(By.xpath(SaveVaccine));
		driver.findElement(By.xpath(SaveVaccine));
		highlightElement(By.xpath(SaveVaccine));
		clickUsingJavaScript(By.xpath(SaveVaccine));

	}

	@Test(priority = 11,groups="Regression")
	public void Document1() throws InterruptedException {

		waitForVisibilityOf(By.xpath(Document));
		driver.findElement(By.xpath(Document));
		highlightElement(By.xpath(Document));
		clickUsingJavaScript(By.xpath(Document));
	}

	@Test(priority = 12,groups="Regression")
	public void ReceiptOption() throws InterruptedException {
		Thread.sleep(5000);

		waitForVisibilityOf(By.xpath(ReceiptOption));
		driver.findElement(By.xpath(ReceiptOption));
		highlightElement(By.xpath(ReceiptOption));
		clickUsingJavaScript(By.xpath(ReceiptOption));

		waitForVisibilityOf(By.xpath(ReceiptNo));
		driver.findElement(By.xpath(ReceiptNo)).sendKeys("123456");
		highlightElement(By.xpath(ReceiptNo));

		
		waitForVisibilityOf(By.xpath(Consultation));
		driver.findElement(By.xpath(Consultation)).sendKeys("1000");
		highlightElement(By.xpath(Consultation));

		

	}

	
	@Test(priority = 13,groups="Regression")
	public void previewReceipt() throws InterruptedException {

		

		waitForVisibilityOf(By.xpath(previewReceipt));
		driver.findElement(By.xpath(previewReceipt));
		highlightElement(By.xpath(previewReceipt));
		clickUsingJavaScript(By.xpath(previewReceipt));

		waitForVisibilityOf(By.xpath(EnterPayerName));
		driver.findElement(By.xpath(EnterPayerName)).sendKeys("payer");
		highlightElement(By.xpath(EnterPayerName));

		waitForVisibilityOf(By.xpath(PaymentMethodDropdown));
		driver.findElement(By.xpath(PaymentMethodDropdown));
		highlightElement(By.xpath(PaymentMethodDropdown));
		clickUsingJavaScript(By.xpath(PaymentMethodDropdown));

		waitForVisibilityOf(By.xpath(PaymentMethod));
		driver.findElement(By.xpath(PaymentMethod));
		highlightElement(By.xpath(PaymentMethod));
		clickUsingJavaScript(By.xpath(PaymentMethod));

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(CreateReceipt));
		driver.findElement(By.xpath(CreateReceipt));
		highlightElement(By.xpath(CreateReceipt));
		clickUsingJavaScript(By.xpath(CreateReceipt));

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(CloseReceipt));
		driver.findElement(By.xpath(CloseReceipt));
		highlightElement(By.xpath(CloseReceipt));
		clickUsingJavaScript(By.xpath(CloseReceipt));

	}

	@Test(priority = 14,groups="Regression")
	public void cirtificateOption1() throws InterruptedException {
		Thread.sleep(5000);

		
		waitForVisibilityOf(By.xpath(ViewReceipt));
		driver.findElement(By.xpath(ViewReceipt));
		highlightElement(By.xpath(ViewReceipt));
		clickUsingJavaScript(By.xpath(ViewReceipt));

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(CloseCertificate));
		driver.findElement(By.xpath(CloseCertificate));
		highlightElement(By.xpath(CloseCertificate));
		clickUsingJavaScript(By.xpath(CloseCertificate));

	}

	@Test(priority = 15,groups="Regression")
	public void AllDocuments() throws InterruptedException {
		Thread.sleep(5000);

		waitForVisibilityOf(By.xpath(AllDocuments));
		driver.findElement(By.xpath(AllDocuments));
		highlightElement(By.xpath(AllDocuments));
		clickUsingJavaScript(By.xpath(AllDocuments));

		waitForVisibilityOf(By.xpath(ViewReceiptDoc));
		driver.findElement(By.xpath(ViewReceiptDoc));
		highlightElement(By.xpath(ViewReceiptDoc));
		clickUsingJavaScript(By.xpath(ViewReceiptDoc));

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(CloseReceipt));
		driver.findElement(By.xpath(CloseReceipt));
		highlightElement(By.xpath(CloseReceipt));
		clickUsingJavaScript(By.xpath(CloseReceipt));
	}

	@Test(priority = 16,groups="Regression")
	public void Document2() throws InterruptedException {

		waitForVisibilityOf(By.xpath(Document));
		driver.findElement(By.xpath(Document));
		highlightElement(By.xpath(Document));
		clickUsingJavaScript(By.xpath(Document));

	}

	@Test(priority = 17,groups="Regression")
	public void cirtificateOption() throws InterruptedException {
		waitForVisibilityOf(By.xpath(cirtificateOption));
		driver.findElement(By.xpath(cirtificateOption));
		highlightElement(By.xpath(cirtificateOption));
		clickUsingJavaScript(By.xpath(cirtificateOption));

		waitForVisibilityOf(By.xpath(createCirtificate));
		driver.findElement(By.xpath(createCirtificate));
		highlightElement(By.xpath(createCirtificate));
		clickUsingJavaScript(By.xpath(createCirtificate));

		waitForVisibilityOf(By.xpath(cirtificateTypeDropdown));
		driver.findElement(By.xpath(cirtificateTypeDropdown));
		highlightElement(By.xpath(cirtificateTypeDropdown));
		clickUsingJavaScript(By.xpath(cirtificateTypeDropdown));

		waitForVisibilityOf(By.xpath(cirtificateType));
		driver.findElement(By.xpath(cirtificateType));
		highlightElement(By.xpath(cirtificateType));
		clickUsingJavaScript(By.xpath(cirtificateType));

		waitForVisibilityOf(By.xpath(cirtificateType));
		driver.findElement(By.xpath(cirtificateType));
		highlightElement(By.xpath(cirtificateType));
		clickUsingJavaScript(By.xpath(cirtificateType));

		waitForVisibilityOf(By.xpath(MessagePreviewclick));
		driver.findElement(By.xpath(MessagePreviewclick));
		// highlightElement(By.xpath(MessagePreviewclick));
		clickUsingJavaScript(By.xpath(MessagePreviewclick));

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(cirtificatePreview));
		driver.findElement(By.xpath(cirtificatePreview));
		highlightElement(By.xpath(cirtificatePreview));
		clickUsingJavaScript(By.xpath(cirtificatePreview));

		Thread.sleep(15000);

		waitForVisibilityOf(By.xpath(SaveAndShare));
		driver.findElement(By.xpath(SaveAndShare));
		highlightElement(By.xpath(SaveAndShare));
		clickUsingJavaScript(By.xpath(SaveAndShare));
	}

	@Test(priority = 18,groups="Regression")
	public void cirtificateOption3() throws InterruptedException {
		Thread.sleep(5000);

		
		waitForVisibilityOf(By.xpath(ViewCirtificate));
		driver.findElement(By.xpath(ViewCirtificate));
		highlightElement(By.xpath(ViewCirtificate));
		clickUsingJavaScript(By.xpath(ViewCirtificate));

		Thread.sleep(15000);

		waitForVisibilityOf(By.xpath(CloseCirtificate));
		driver.findElement(By.xpath(CloseCirtificate));
		highlightElement(By.xpath(CloseCirtificate));
		clickUsingJavaScript(By.xpath(CloseCirtificate));

	}

	@Test(priority = 19,groups="Regression")
	public void AllDocuments1() throws InterruptedException {
		Thread.sleep(5000);

		waitForVisibilityOf(By.xpath(AllDocuments));
		driver.findElement(By.xpath(AllDocuments));
		highlightElement(By.xpath(AllDocuments));
		clickUsingJavaScript(By.xpath(AllDocuments));

		waitForVisibilityOf(By.xpath(CertificateOption));
		driver.findElement(By.xpath(CertificateOption));
		highlightElement(By.xpath(CertificateOption));
		clickUsingJavaScript(By.xpath(CertificateOption));

		waitForVisibilityOf(By.xpath(ViewCirtificateDoc));
		driver.findElement(By.xpath(ViewCirtificateDoc));
		highlightElement(By.xpath(ViewCirtificateDoc));
		clickUsingJavaScript(By.xpath(ViewCirtificateDoc));

		Thread.sleep(5000);

		waitForVisibilityOf(By.xpath(CloseCirtificateDoc));
		driver.findElement(By.xpath(CloseCirtificateDoc));
		highlightElement(By.xpath(CloseCirtificateDoc));
		clickUsingJavaScript(By.xpath(CloseCirtificateDoc));

	}

	@Test(priority = 20,groups="Regression")
	public void ReferralOption3() throws InterruptedException {

		Thread.sleep(5000);
		waitForVisibilityOf(By.xpath(Document));
		driver.findElement(By.xpath(Document));
		highlightElement(By.xpath(Document));
		clickUsingJavaScript(By.xpath(Document));

		Thread.sleep(5000);

		waitForVisibilityOf(By.xpath(ReferralOption));
		driver.findElement(By.xpath(ReferralOption));
		highlightElement(By.xpath(ReferralOption));
		clickUsingJavaScript(By.xpath(ReferralOption));

		waitForVisibilityOf(By.xpath(TapToCreateReferral));
		driver.findElement(By.xpath(TapToCreateReferral));
		highlightElement(By.xpath(TapToCreateReferral));
		clickUsingJavaScript(By.xpath(TapToCreateReferral));

		waitForVisibilityOf(By.xpath(SpecialityDropdown));
		driver.findElement(By.xpath(SpecialityDropdown));
		highlightElement(By.xpath(SpecialityDropdown));
		clickUsingJavaScript(By.xpath(SpecialityDropdown));

		waitForVisibilityOf(By.xpath(SelectSpeciality));
		driver.findElement(By.xpath(SelectSpeciality));
		highlightElement(By.xpath(SelectSpeciality));
		clickUsingJavaScript(By.xpath(SelectSpeciality));

		waitForVisibilityOf(By.xpath(RefferingDrName));
		driver.findElement(By.xpath(RefferingDrName)).sendKeys("Dr.Refer");
		highlightElement(By.xpath(RefferingDrName));

		waitForVisibilityOf(By.xpath(RefferingDrEmail));
		driver.findElement(By.xpath(RefferingDrEmail)).sendKeys("refer@gmail.com");
		highlightElement(By.xpath(RefferingDrEmail));

		waitForVisibilityOf(By.xpath(RefferingDrMobileNo));
		driver.findElement(By.xpath(RefferingDrMobileNo)).sendKeys("1234567891");
		highlightElement(By.xpath(RefferingDrMobileNo));

		waitForVisibilityOf(By.xpath(HealthCondition));
		driver.findElement(By.xpath(HealthCondition)).sendKeys("Critical");
		highlightElement(By.xpath(HealthCondition));

		waitForVisibilityOf(By.xpath(Duration1));
		driver.findElement(By.xpath(Duration1)).sendKeys("2");
		highlightElement(By.xpath(Duration1));

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(ReferralPreview));
		driver.findElement(By.xpath(ReferralPreview));
		highlightElement(By.xpath(ReferralPreview));
		clickUsingJavaScript(By.xpath(ReferralPreview));

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(ReferralSaveAndShare));
		driver.findElement(By.xpath(ReferralSaveAndShare));
		highlightElement(By.xpath(ReferralSaveAndShare));
		clickUsingJavaScript(By.xpath(ReferralSaveAndShare));
		
		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(GoHome));
		driver.findElement(By.xpath(GoHome));
		highlightElement(By.xpath(GoHome));
		clickUsingJavaScript(By.xpath(GoHome));

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
