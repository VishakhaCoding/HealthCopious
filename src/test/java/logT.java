



//import org.apache.commons.io.FileUtils;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.ChiefComplaints;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfileSummaryPage;
import Pages.SearchPatientPage;
import Pages.VitalsPage;

public class logT extends TestBase {
    public static WebDriver driver;
    LoginPage loginPage;
    SearchPatientPage searchPatientPage;
    ProfileSummaryPage profileSummaryPage;
    HomePage homePage;
    VitalsPage vitalsPage;
    ChiefComplaints chiefComplaints;
    public static String createPatient = "createPatient";

    public static String OnExamination = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[3]";
    public static String SearchExamination = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[3]/div/div/div/div[1]/div[2]/div/div/input";
    public static String ExaminationNew = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[3]/div/div/div/div[1]/div[2]/button";
    public static String Examination = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[12]/app-cutom-card/div";
    public static String DiagnosisOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[4]";
    public static String SearchDiagnosis = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[4]/div/div/div/div[1]/div[2]/div/div/input";
    public static String DiagnosisNew = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[4]/div/div/div/div[1]/div[2]/button";
    public static String Diagnosis = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[4]/div/div/div/div[2]/div[1]/div/div/div[1]/app-cutom-card/div";
    public static String Medicine = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[5]";
    public static String medicineSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/input";
    public static String Dolocare = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/ngb-typeahead-window/button[1]";
    public static String MedAddtoList = "//div[text()='Add to List']";
    public static String newDrug = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[1]/div[2]/div";
    public static String DrugName = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[2]/form/div/div[1]/div[1]/div[1]/input";
    public static String DrugType = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[2]/form/div/div[1]/div[1]/div[2]/div[2]/input";
    public static String GenericName = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[2]/form/div/div[1]/div[2]/div[1]/input";
    public static String DrugCompany = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[2]/form/div/div[1]/div[2]/div[2]/div[2]/input";
    public static String Unit = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[2]/form/div/div[2]/div/input";
    public static String Frequency = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[2]/form/div/div[2]/div/mat-form-field[1]/div/div[1]/div/mat-select/div/div[1]/span";
    public static String Night = "/html/body/div[4]/div[4]/div/div/div/mat-option[1]";
    public static String Duration = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[2]/form/div/div[2]/div/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]";
    public static String TwoDays = "//span[text()=' 1 Day(s) ']";
    public static String WhenToTake = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[2]/form/div/div[2]/div/mat-form-field[3]/div/div[1]/div/mat-select/div/div[1]/span";
    public static String AfterFood = "/html/body/div[4]/div[4]/div/div/div/mat-option[2]/span";
    public static String Instruction = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[2]/form/div/div[2]/input";
    public static String AddNewDrug = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div";
    public static String MedDrugType = "/html/body/div[4]/div[2]/div/div/div/mat-option[6]/span";
    public static String Capsule = "//*[text()=' Capsule']";
    public static String MedDrugUnit = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[3]/div[2]/mat-form-field[1]/div/div[1]/div/mat-select/div/div[1]";
    public static String Medml = "/html/body/div[4]/div[2]/div/div/div/mat-option[5]/span";
    public static String MedWhenToTake = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[3]/div[2]/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]";
    public static String MedAfterFood = "/html/body/div[4]/div[2]/div/div/div/mat-option[3]/span";
    public static String MedDuration = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[3]/div[2]/mat-form-field[3]/div/div[1]/div/mat-select/div/div[1]";
    public static String MedTwoDays = "/html/body/div[4]/div[2]/div/div/div/mat-option[3]/span";
    public static String MedDrugDose = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[3]/div[1]/div[1]/div[1]/input";
    public static String Footer = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]";
    public static String PopularOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[1]/div/div[2]/div[2]";
    public static String PopularSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[1]/input";
    public static String PopularMedicineClick = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[3]/div[1]/div/img";
    public static String FavouriteOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[1]/div/div[2]/div[3]";
    public static String FavouriteSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/input";
    public static String FavouriteClick = "/html/body/div[4]/div/div/div/mat-option[1]/span";
    public static String FavouriteClickMedicine = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[2]/div[2]/div/img";
    public static String previousOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[1]/div/div[2]/div[4]";
    public static String previousSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span";
    public static String previousResultClick = "/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span/div/div";
    public static String previousMedicineClick = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[2]/div/div/img";
    public static String previousViewPDF = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[2]";
    public static String DietaryAdviceOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[6]";
    public static String DietarySearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[1]/div[3]/div/app-language-select-textbox/div/input";
    public static String DietaryLanguage = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[1]/div[3]/div/app-language-select-textbox/div/div/div/mat-form-field/div/div[1]/div/mat-select/div/div[1]";
    public static String DietaryLanguageMarathi = "/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span";
    public static String DietaryAdd = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[1]/div[3]/div/div/button/span[1]";
    public static String DietaryAdvice = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[2]/div[1]/div/div/div[1]/app-cutom-card/div";
    public static String GeneralInstruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[7]/div[1]";
    public static String GenInstruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[2]/div[1]/div/div/div[1]/app-cutom-card/div";
    public static String InstructionLanguage = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[1]/div[3]/div/app-language-select-textbox/div/div/div/mat-form-field/div/div[1]/div/mat-select/div";
    public static String InstructionLanguageMarathi = "/html/body/div[5]/div[2]/div/div/div/mat-option[2]/span";
    public static String InstructionSearch = "input.ng-dirty";
    public static String InstructionAdd = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[1]/div[3]/div/div/button";
    public static String prescriptionSave = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[1]/div[1]";
    public static String prescriptionProceed = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[1]/div[2]";
    public static String InstructionImpNote = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[2]/app-prescription-live-preview/div/div/mat-chip-list/div/mat-chip[2]";
    public static String FollowupTypes = "/html/body/div[5]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[1]/div[2]/div[1]/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]/span";
    public static String Appointment = "/html/body/div[4]/div[4]/div/div/div/mat-option[2]/span";
    public static String FollowupMessage = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[1]/div[2]/div[2]/mat-chip-list/div/mat-chip[2]";
    public static String CustomisePrescription = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[3]/mat-form-field[1]/div/div[1]/div/mat-select/div/div[1]/span/span";
    public static String HeightDisable = "/html/body/div[4]/div[4]/div/div/div/mat-option[2]/span";
    public static String confirmPrescrFooter = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[3]/div[2]";
    public static String SelectedFields = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[3]/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]/span/span";
    public static String onExaminationDisable = "/html/body/div[4]/div[4]/div/div/div/mat-option[2]/span";
    public static String SpecialityLocation = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[3]/div[1]/mat-form-field[1]/div/div[1]/div/mat-select/div/div[1]";
    public static String AnkurV3 = "/html/body/div[4]/div[4]/div/div/div/mat-option[1]/span";
    public static String RxLanguage = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[3]/div[1]/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]";
    public static String RxLanguageMarathi = "/html/body/div[4]/div[4]/div/div/div/mat-option[2]/span";
    public static String ConfirmandPrint = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[2]/button[2]";
    public static String prescriptionDone = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-prescriptionpreview/div[1]/div/div[3]/div";
    public static String ChoosePharmacy = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/mat-form-field/div/div[1]/div/mat-select/div/div[1]";
    public static String TestPharmacy = "/html/body/div[4]/div[4]/div/div/div/mat-option[1]/span";
    public static String ShareWhatsapp = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div[2]/div[1]";
    public static String ShareEmail = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div[2]/div[2]";
    public static String ShareInHealthapp = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div[5]/div[2]/div";
    public static String GoHome = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[4]/div[2]/button[2]";

    @BeforeClass
    public void setUp() throws IOException {

	loginPage = new LoginPage();
	searchPatientPage = new SearchPatientPage();
	profileSummaryPage = new ProfileSummaryPage();
	homePage=new HomePage();
	vitalsPage= new VitalsPage();
	chiefComplaints=new ChiefComplaints();
    }
	/*
	 * @Test(priority = 0) public void loginAsDoctorInvalidValue() throws
	 * InterruptedException { loginPage.clickOnDoctorLink();
	 * loginPage.enterMobileNumber("966504aa"); loginPage.sendOTP();
	 * System.out.println("vvv"+loginPage.getValidationMsg());
	 * Assert.assertEquals("Please Enter 10 Digit of Phone",
	 * loginPage.getValidationMsg()); //Thread.sleep(20000);
	 * //loginPage.verifyOtp(); //System.out.println(homePage.getWelcomeUserN());
	 * //Assert.assertEquals("Dr.Vishakha", homePage.getWelcomeUserN()); }
	 */

    @Test(priority = 1)
    public void loginAsDoctor() throws InterruptedException {
	//loginPage.clickOnDoctorLink();
	loginPage.enterMobileNumber("9665002440");
	loginPage.sendOTP();
	Thread.sleep(20000);
	loginPage.enterOTP();
	loginPage.verifyOtp();
	System.out.println(homePage.getWelcomeUserN());
	Assert.assertEquals("Dr.Vishakha", homePage.getWelcomeUserN());
    }

    @Test(priority = 1)
    public void searchPatientAndClick() throws InterruptedException {
	searchPatientPage.searchPatient();
	searchPatientPage.clickOnSearchButton();
	searchPatientPage.clickPatient();
	
    }

    @Test(priority = 2)
	public void clickOnQuickRx() throws InterruptedException {
	    profileSummaryPage.clickOnQuickRx();
	  
    }
   @Test(priority = 3)
	public void fillComplaintsData() throws InterruptedException {
	chiefComplaints.clickOnChiefComplaint();
	chiefComplaints.enterComplaintDescription();
   }
   @Test(priority = 4)
   	public void fillVitalData() throws InterruptedException {
   	    vitalsPage.clickOnVitals();
   	  
       }
		
}
