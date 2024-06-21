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
import org.testng.annotations.Test;

public class NewRxFlow {
	public static WebDriver driver;
	
	public static String mobileNumber = "input#phoneNumberId";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String QuickRx = "//*[text()='Quick Rx']";
	public static String OTP1 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]";
	public static String OTP2 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]";
	public static String OTP3 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]";
	public static String OTP4 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	public static String OTP5 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	public static String OTP6 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]";
	public static String createPatient = "createPatient";
	public static String Number1 = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[1]/mat-form-field[2]/div/div[1]/div/input";
	public static String confirm = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[1]/div";
	public static String confirmPopup = "//button[text()='Confirm']";
	public static String number2 = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[2]/mat-form-field[2]/div/div[1]/div/input";
	public static String firstName = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[1]/div/div[1]/div/input";
	public static String middleName = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[2]/div/div[1]/div/input";
	public static String lastName = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[3]/div/div[1]/div/input";
	public static String birthDate = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[1]/div/div[1]/div[1]/input";
	public static String genFemale = "//*[text()='Female']";
	public static String address = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[1]/div/div[1]/div/input";
	public static String locality = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[2]/div/div[1]/div/input";
	public static String city = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[3]/div/div[1]/div/input";
	public static String pinCode = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[7]/mat-form-field/div/div[1]/div/input";
	public static String Next = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[8]/button[2]";
	public static String proceedWithSameRMN = "//*[text()='Proceed With same RMN']";
	public static String clickClose = "/html/body/ngb-modal-window/div/div/div[1]/div/button";
	public static String selectDelivery = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[1]/mat-form-field[3]/div/div[1]/div/mat-select";
	public static String normalDelivery = "//*[text()='Normal']";
	public static String weight = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[5]/mat-form-field[1]/div/div[1]/div/input";
	public static String height = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[5]/mat-form-field[2]/div/div[1]/div/input";
	public static String HC = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[5]/mat-form-field[3]/div/div[1]/div/input";
	public static String CC = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[6]/mat-form-field[1]/div/div[1]/div/input";
	public static String BP = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[6]/mat-form-field[2]/div/div[1]/div/input";
	public static String BPdia = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[6]/mat-form-field[3]/div/div[1]/div/input";
	public static String vaccinationDate = "//*[@id='mat-input-94']";
	public static String bloodGrp = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[7]/mat-form-field[2]/div/div[1]/div/mat-select";
	public static String bloodGrpOplus = "//*[text()='O+']";
	public static String antentalNext = "//*[@id='cdk-step-content-0-1']/form/div[2]/div[8]/button[2]";
	public static String antentalNext1= "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[8]/button[2]";
	public static String medicalConditions = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[1]/mat-form-field[1]/div/div[1]/div[1]/input";
	public static String allergies = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[1]/mat-form-field[2]/div/div[1]/div/input";
	public static String reactionToDrugs = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[2]/mat-form-field[1]/div/div[1]/div/input";
	public static String recurringComplaints = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[2]/mat-form-field[2]/div/div[1]/div/input";
	public static String hospitalization = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[3]/mat-form-field[1]/div/div[1]/div/input";
	public static String healthHistory = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[3]/mat-form-field[2]/div/div[1]/div/input";
	public static String emailID = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[4]/mat-form-field[1]/div/div[1]/div/input";
	public static String UHID = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[4]/mat-form-field[2]/div/div[1]/div/input";
	public static String geneticDisorder = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[5]/mat-form-field/div/div[1]/div[1]/input";
	public static String healthNext = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[6]/button[2]";
	public static String fatherHeightFt = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[1]/div[2]/mat-form-field[1]/div/div[1]/div/input";
	public static String fatherHeightinch = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[1]/div[2]/mat-form-field[2]/div/div[1]/div/input";
	public static String motherHeightFt = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[2]/div[2]/mat-form-field[1]/div/div[1]/div/input";
	public static String motherHeightinch = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[2]/div[2]/mat-form-field[2]/div/div[1]/div/input";
	public static String familyNext = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[5]/button[2]";
	public static String success = "//*[text()='Success']";
	public static String age = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[2]/div/div[1]/div/input";
	public static String familyProfile = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[1]/mat-step-header[4]/div[3]/div";
	public static String Done = "/html/body/ngb-modal-window/div/div/div[3]/div";
	public static String SelectDate = "//*[text()=' 1 ']";
	public static String SelectMonth = "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[4]/div[1]";
	public static String ClickYearDropdown = "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]";
	public static String AddNewPrescription = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[1]/img";
	public static String ClearCompalaint = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[2]/app-prescription-live-preview/div/div/div[1]/div[2]/label[2]/span[2]";

	public static String ChiefComplaints = "//*[text()='Fever ']  ";
	public static String ComplaintDetails = "//*[text()='Highgrade'] ";
	public static String MoreSymptoms = "//*[text()='with chills'] ";
	public static String VitalsOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[2]";
	public static String VitalsButton = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]";
	public static String Rxweight = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String RxBP = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[2]/div/mat-form-field/div/div[1]/div[3]/input";
	public static String vitals = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]";
	public static String vitalWeihgt = "mat-input-0";
	public static String vitalHeihgt = "mat-input-1";
	public static String headCircumferance = "mat-input-17";

	public static String BpAndHeart = "mat-tab-label-0-1";
	public static String BPSys = "mat-input-4";
	public static String BPDia = "mat-input-5";
	public static String heartRate = "mat-input-6";
	public static String pulse = "mat-input-7";
	public static String BloodAndAnalysis = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[3]";
	public static String Haemoglobin = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[1]/mat-form-field/div/div[1]/div[3]/input";
	public static String BloodSugarRandom = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String BloodSugarF = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[3]/mat-form-field/div/div[1]/div[3]/input";
	public static String BloodSugarPP = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[4]/mat-form-field/div/div[1]/div[3]/input";
	public static String Blood = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[5]/mat-form-field/div/div[1]/div[3]/input";
	public static String LipidProfile = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[4]";
	public static String CholestrerolHDL = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[1]/mat-form-field/div/div[1]/div[3]/input";
	public static String CholestrerolLDL = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String totalCholesterol = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[3]/mat-form-field/div/div[1]/div[3]/input";
	public static String Triglycerides = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[4]/mat-form-field/div/div[1]/div[3]/input";
	public static String ConcernTabClick = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[1]/mat-expansion-panel-header";
	public static String SearchExamination = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[3]/div/div/div/div[1]/div[2]/div/div/input";
	public static String ExaminationNew = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[3]/div/div/div/div[1]/div[2]/button";
	public static String Examination = "//*[text()=' Vomitting '] ";
	public static String DiagnosisOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[4]";
	public static String SearchDiagnosis = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[4]/div/div/div/div[1]/div[2]/div/div/input";
	public static String DiagnosisNew = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[4]/div/div/div/div[1]/div[2]/button";
	public static String Diagnosis = "//*[text()=' ACUTE GASTROENTITIS '] ";
	public static String medicineSearch = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[4]/div/div/div[2]/div[1]/div[2]/div/div/div[1]/div/input";
	public static String Dolocare = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[4]/div/div/div[2]/div[1]/div[2]/div/div/div[1]/div/ngb-typeahead-window/button[2]";
	public static String MedAddtoList = "//*[text()='Add to List ']";

	public static String Instruction = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[4]/div/div/div[2]/div[1]/div[2]/div/div/div[3]/div/app-language-select-textbox/div/input";
	public static String AddNewDrug = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div";

	public static String PopularOption = "//*[text()=' Popular ']";
	public static String PopularSearch = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[4]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/input";
	public static String PopularMedicineClick = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[4]/div/div/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div/img";
	public static String FavouriteOption = "//*[text()=' Favourite ']";
	public static String FavouriteSearch = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[4]/div/div/div[2]/div[1]/div[2]/div[1]/input";
	public static String FavouriteClick = "//*[text()='temp ']";
	public static String FavouriteClickMedicine = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[4]/div/div/div[2]/div[1]/div[2]/div[2]/div/div/img";

	public static String DietaryAdviceOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[6]";

	public static String DietaryAdd = "//*[text()=' Eat green vegetables ']";
	public static String DietaryAdvice = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[2]/div[1]/div/div/div[1]/app-cutom-card/div";
	public static String GeneralInstruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[7]/div[1]";
	public static String GenInstruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[2]/div[1]/div/div/div[1]/app-cutom-card/div";

	public static String prescriptionSave = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[1]/div[1]";
	public static String prescriptionProceed = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[1]/div[2]";
	public static String InstructionImpNote = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[2]/app-prescription-live-preview/div/div/mat-chip-list/div/mat-chip[2]";
	public static String FollowupTypes = "//*[@class='ng-star-inserted']/ following::mat-select[5]";
	public static String Appointment = "//*[text()='Visit']";
	public static String FollowupMessage = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[1]/div[2]/div[2]/mat-chip-list/div/mat-chip[2]";

	public static String ConfirmandPrint = "button.btn-confirm";
	public static String prescriptionDone = "//*[text()=' Done']";
	public static String ChoosePharmacy = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/mat-form-field/div/div[1]/div/mat-select/div/div[1]";
	public static String TestPharmacy = "/html/body/div[4]/div[4]/div/div/div/mat-option[1]/span";
	public static String ShareWhatsapp = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div[2]/div[1]";
	public static String ShareEmail = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div[2]/div[2]";
	public static String ShareInHealthapp = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div[5]/div[2]/div";
	public static String GoHome = "//*[text()='Go Home']";
	public static String Medpageinstruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[4]/div/app-language-select-textbox/div/input";
	public static String Doctor = "/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/div[3]/div";
	// public static String nextFollowupDate =
	// "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div/div[1]/div[2]/mat-datepicker-toggle/button/span[1]]";
	public static String nextFollowupSelectDate = "//*[text()=' 1 ']";
	// public static String SPO2 =
	// "input.mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-11";

	public static String ClickHome = "//*[text()=' Home']";
	public static String clickPatient = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a[1]/li/a/div/div[2]/figure/img";
	public static String InstructionAdd = "//*[text()=' Hot fomentation ']";

	public static String AddNewAppointment = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[2]";
	public static String EnterTime = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[2]/div[2]/div[2]/div[1]/input";
	public static String SelectSlot = "/html/body/div[2]/div[4]/div/mat-dialog-container/div/div[2]/form[2]/div/div/div/div[39]/div";
	public static String BookAppointment = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[2]/button";

	public static String nextFollowupDate = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[7]/div/div/div/div[2]/div[3]/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button";

	public static String RxCC = ".mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-48";
	public static String temperature = ".mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-10";
	public static String SPO2 = ".mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-11";
	public static String AnyGeneticDisorder = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[5]/mat-form-field/div/div[1]/div[1]/input";
	public static String FamilyMedicalHistory = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[3]/mat-form-field/div/div[1]/div[1]/input";
	public static String EnterDisorder = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[4]/mat-form-field/div/div[1]/div[1]/input";
	public static String prefferedLanguage = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[7]/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]/span";
	public static String prefferedLanguageEnglish = "/html/body/div[2]/div[4]/div/div/div/mat-option[1]/span";
	public static String Medicine = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[5]";
	public static String clickContinue = "/html/body/ngb-modal-window/div/div/div[2]/div/div/div[5]/span";
	public static String AppointmentBooked = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/p-toast/div/p-toastitem/div/div/div/div[2]/div[2]";

	
	
	
	public static String AdRxweight = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String AdRxBP = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[2]/div/mat-form-field/div/div[1]/div[3]/input";
	public static String Advitals = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]";
	public static String AdvitalWeihgt = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[1]/div/div/div/div/mat-form-field[1]/div/div[1]/div[3]/input";
	public static String AdvitalHeihgt = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[1]/div/div/div/div/mat-form-field[2]/div/div[1]/div[3]/input";
	public static String AdheadCircumferance = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[3]/div[2]/mat-form-field/div/div[1]/div[3]/input";

	public static String AdBpAndHeart = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]";
	public static String AdBPSys = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[2]/div/div/div/div/mat-form-field[1]/div/div[1]/div[3]/input";
	public static String AdBPDia = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[2]/div/div/div/div/mat-form-field[2]/div/div[1]/div[3]/input";
	public static String AdheartRate = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[2]/div/div/div/div/mat-form-field[3]/div/div[1]/div[3]/input";
	public static String Adpulse = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[2]/div/div/div/div/mat-form-field[4]/div/div[1]/div[3]/input";
	public static String AdBloodAndAnalysis = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[3]/div";
	public static String AdHaemoglobin = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[3]/div/div/div/div/mat-form-field[1]/div/div[1]/div[3]/input";
	public static String AdBloodSugarRandom = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[3]/div/div/div/div/mat-form-field[2]/div/div[1]/div[3]/input";
	public static String AdBloodSugarF = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[3]/div/div/div/div/mat-form-field[3]/div/div[1]/div[3]/input";
	public static String AdBloodSugarPP = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[3]/div/div/div/div/mat-form-field[4]/div/div[1]/div[3]/input";
	public static String HBA1C = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[3]/div/div/div/div/mat-form-field[5]/div/div[1]/div[3]/input";
	public static String AdLipidProfile = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[4]";
	public static String AdCholestrerolHDL = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[4]/div/div/div/div/mat-form-field[1]/div/div[1]/div[3]/input";
	public static String AdCholestrerolLDL = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[4]/div/div/div/div/mat-form-field[2]/div/div[1]/div[3]/input";
	public static String AdtotalCholesterol = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[4]/div/div/div/div/mat-form-field[3]/div/div[1]/div[3]/input";
	public static String AdTriglycerides = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[4]/div/div/div/div/mat-form-field[4]/div/div[1]/div[3]/input";
	
	public static String AdRxCC = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[4]/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String Adtemperature = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[1]/div/div/div/div/mat-form-field[3]/div/div[1]/div[3]/input";
	public static String AdSPO2 = "/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[1]/div/div/div/div/mat-form-field[4]/div/div[1]/div[3]/input";
	public static String ClickAddVitals="//*[text()='Add Vitals']";
	public static String clickEditProfile="//*[text()='Edit ']";
	public static String VitSave="//*[text()=' save ']";
	
	 public static String AdultbirthDate="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[1]/div/div[1]/div[1]/input";
	 public static String AdultSelectDate="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[3]/div[1]";		
	  public static String AdultSelectMonth ="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[4]/div[1]";
	   public static String AdultClickYearDropdown="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]";
	   public static String AdultclickYear="//*[text()=' 2014 ']";
	   public static String Profile="//*[text()=' Profile']";
	   public static String NewUISelect="//*[text()=' New UI']";
	   public static String clickHome="//*[text()=' Home']";
	   public static String MedicineTabClick="/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[4]/mat-expansion-panel-header";
	   
	   
	   
	   public static String DietTabClick="/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[5]/mat-expansion-panel-header";
	   public static String NextFollowupTabclick="/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[7]/mat-expansion-panel-header";
	   public static String GeneralInstructionTabClick="/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[6]/mat-expansion-panel-header";
	   public static String FollowupMsge="/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[7]/div/div/div/div[2]/div[1]/mat-chip-list/div/mat-chip[2]";
	   public static String SaveAndPreview="//*[text()=' Save & Preview ']";
	   
	   
	   /*
		 * public static String clickHome="//*[text()=' Home']"; public static String
		 * clickHome="//*[text()=' Home']"; public static String
		 * clickHome="//*[text()=' Home']"; public static String
		 * clickHome="//*[text()=' Home']"; public static String
		 * clickHome="//*[text()=' Home']"; public static String
		 * clickHome="//*[text()=' Home']";
		 */
		/*
		 * public static String mobileNumber =
		 * "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
		 * public static String sendOTP =
		 * "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
		 * public static String verifyOTP =
		 * "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
		 * public static String QuickRx =
		 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[1]";
		 * public static String OTP1 =
		 * "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]";
		 * public static String OTP2 =
		 * "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]";
		 * public static String OTP3 =
		 * "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]";
		 * public static String OTP4 =
		 * "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
		 * public static String OTP5 =
		 * "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
		 * public static String OTP6 =
		 * "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]";
		 */
		public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
		public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
		//public static String ClickHome = "//*[text()=' Home']";
		//public static String clickPatient = "li.clearfix";
		public static String InvestigationClick = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-new-profile/div[1]/app-top-info-navbar/div/div[2]/div[3]/div[1]";
		public static String InvestigationClick1 = "//*[text()='Investigations']";
		public static String ReportsClick = "//div[div='Requisitions']/descendant::div[text()='Reports']";
		public static String UploadReport = "//*[text()='Upload Report']";
		public static String CreatedBy = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/mat-form-field[2]/div/div[1]/div/input";
		public static String DocumentOn = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/mat-form-field[3]/div/div[1]/div[1]/input";
		public static String BrownFile1 = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[4]/div[1]/div/div/div[1]/input";
		public static String UploadReportDoc = "//*[text()='Upload']";
		public static String RequisitionClick = "//*[text()='Requisition']";
		public static String NewRequisition = "//*[text()='New Requisition']";
		public static String SelectTest = "//*[text()='RT-PCR']";
		public static String SelectPackageOption = "//*[text()='Packages']";
		public static String SelectPackage = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/form/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[3]/div[1]/mat-checkbox/label/span[1]";
		public static String RequisitionSaveAndShare = "//*[text()='Save & Preview']";
		public static String ShareRequisition = "//*[text()='Share Requisition']";
		public static String CancelOption = "//*[text()='Cancel']";
		public static String HealthProfile = "//*[text()='Health Profile']";
		public static String ImmunizationOption = "//*[text()='Immunization']";
		public static String ConfirmVaccinationDate = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[5]/button";
		public static String VaccineRecord = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-new-profile/div[2]/patient-immunization/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/table/tbody/tr[2]/td[8]/div";
		public static String RecievedDate = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[5]/div/img";
		public static String ClickDate = "//*[text()='15']";
		public static String SaveVaccine = "//*[text()='Save Vaccine']";
		public static String SpecialVaccineClick = "//*[text()='Special Vaccines']";
		public static String CholeraVacccine = "//*[text()='Meningococcal Vaccine']";
		public static String SelectDate1 = "//*[text()='15']";
		public static String ClickCalender = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[4]/div/img";
		public static String SaveSpecialVaccine = "//*[text()='Save Vaccine']";
		public static String ReceiptOption = "//*[text()='Receipts']";
		public static String ReceiptNo = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-new-profile/div[2]/app-patient-receipt/div/div[2]/div/div[2]/mat-form-field[2]/div/div[1]/div/input";
		public static String Consultation = "//*[@class='searchBox']//child::input[1]";
		public static String Vaccination = "//div[@class='searchBox']//following::input[2]";
		public static String VaccinationCheckboxClick = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-receipt/div/div[2]/div/div[6]/img";
		public static String previewReceipt = "//*[text()='Preview Receipt']";
		public static String EnterPayerName = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[1]/mat-form-field[1]/div/div[1]/div/input";
		public static String PaymentMethodDropdown = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[1]/mat-form-field[2]/div/div[1]/div/mat-select";
		public static String PaymentMethod = "/html/body/div[2]/div[4]/div/div/div/mat-option[1]/span";
		public static String CreateReceipt = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[3]/button[2]";
		public static String CloseReceipt = "//*[text()='×']";
		public static String OtheCharges = "//div[@class='searchBox']//following::input[7]";
		public static String AddMoreButton = "//*[text()='Add More']";
		public static String ExtraOtherCharges = "//div[@class='searchBox']//following::input[8]";
		public static String ExtraCharges = "//div[@class='searchBox']//following::input[9]";
		public static String Document = "//*[text()='Documents']";
		public static String cirtificateOption = "//*[text()='Certificate']";
		public static String createCirtificate = "//*[text()='Create Certificate']";
		public static String cirtificateTypeDropdown = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[1]/div/div/div/div/button";
		public static String cirtificateType = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[1]/div/div/div/div/div/button[1]";
		public static String MessagePreviewclick = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[4]/div";
		public static String cirtificatePreview = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[5]/button";
		public static String SaveAndShare = "//*[text()='Save & share ']";
		public static String ReferralOption = "//*[text()='Referral']";
		public static String TapToCreateReferral = "//*[text()='Tap to create Referral']";
		public static String SpecialityDropdown = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[1]/div/div/button";
		public static String SelectSpeciality = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[1]/div/div/div/button";
		public static String RefferingDrName = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[2]/mat-form-field[1]/div/div[1]/div/input";
		public static String RefferingDrEmail = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[2]/mat-form-field[2]/div/div[1]/div/input";
		public static String RefferingDrMobileNo = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[3]/mat-form-field[1]/div/div[1]/div/input";
		public static String HealthCondition = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[3]/mat-form-field[2]/div/div[1]/div/input";
		public static String Duration1 = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[4]/mat-form-field/div/div[1]/div/input";
		public static String ReferralPreview = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[7]/button";
		public static String ReferralSaveAndShare = "/html/body/div[2]/div[4]/div/mat-dialog-container/div/div[2]/div[2]/div";
		public static String ViewReceipt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-new-profile/div[2]/app-patient-receipt/div/div[1]/div[3]/div/table/tbody/tr/td[4]/div";
		public static String CloseCertificate = "//*[text()='×']";
		public static String ViewCirtificate = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-new-profile/div[2]/app-patient-certificate/div/div[2]/div/table/tbody/tr/td[5]/div";
		public static String CloseCirtificate = "//*[text()='×']";
		public static String ViewReceiptDoc = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-new-profile/div[2]/app-patient-history/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/table/tbody/tr[1]/td[5]/div";
		public static String CloseReceipt1 = "//*[text()='×']";
		public static String AllDocuments = "//div[@class='menu-item']//child::div[1]";
		public static String CertificateOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-new-profile/div[2]/app-patient-history/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[5]/div";
		public static String ViewCirtificateDoc = "//*[text()=' View ']";
		public static String CloseCirtificateDoc = "//*[text()='×']";
		//public static String InstructionAdd = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[1]/div[3]/div/div/button";
		public static String SuccessfulMsge = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-certificate/p-toast/div/p-toastitem/div/div/div/div[2]/div[2]";
		public static String ReferralSharedMsge = "div.p-text-center";
		public static String RequisitionSharedMsge = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/p-toast/div/p-toastitem/div/div/div/div[2]/div[2]";
		public static String UploadDocMsge = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/p-toast/div/p-toastitem/div/div/div/div[2]/div[2]";
		public static String AllDocuments1 = "//*[text()='All Documents']";

		public static String BulkUpdate = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[2]/button[2]/span";
		public static String BulkVaccineDTWP = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[3]/div[2]/div[2]/div/span[1]";
		public static String BulkVaccineHepB = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[3]/td[5]";
		public static String AddToSchedule = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[4]/button[2]";
		public static String VCCTaken = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[4]/td[5]/div";
		public static String ChooseLab = "/html/body/div[2]/div[4]/div/mat-dialog-container/div[2]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span";
		public static String DashLab = "//*[text()=' Dash_lab ']";
		public static String EmailOption = "/html/body/div[2]/div[4]/div/mat-dialog-container/div[2]/div[2]/div";
	public static String BrandName="//*[text()='Tubaervac BCG']";
	public static String SpecialOtherVaccine="//*[text()='Other']";
	public static String Test="/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[5]/input";
	
	public static String Since1day="/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[1]/div/div/div[2]/div[2]/div/div[2]/input";
	public static String MoreDetailsDropDown="/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[1]/div/div/div[2]/div[2]/div/div[3]/div";
	public static String Severe="//*[text()='Severe']";
	public static String VitalTabClick="/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/mat-expansion-panel-header";
	
	public static String LMP="/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[2]/div/div/mat-vertical-stepper/div[1]/div/div/div/div/div/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]";
	
	public static String LMPDate="//*[text()='M']//following::div[5]"; 
	public static String DiagnosisTabClick="/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[1]/mat-accordion/mat-expansion-panel[3]/mat-expansion-panel-header"; 
	
	
	
	public static String ViewReferral="//*[text()=' Referal Note '] / following::div[1]"; 
	public static String ReferralClose="//*[text()='×']"; 
	
	public static String ViewCertificate="//*[text()=' Referal Note '] / following::div[2]"; 
	public static String CertificateClose="//*[text()='×']"; 
	
	public static String ViewPrescription="//*[text()=' Referal Note '] / following::div[3]"; 
	public static String PrescriptionClose="//*[text()='×']"; 
	
	public static String ViewRequisition="//*[text()=' Referal Note '] / following::div[4]"; 
	public static String RequisitionClose="//*[text()='×']"; 
	
	public static String ReceiptClose="//*[text()='×']"; 
	
	public static String ViewLastPrescription="/html/body/app-root/app-new-rx-sidebar/ng-sidebar-container/div/div/div/app-new-quick-rx/div[1]/div[2]/div[2]/div[2]/app-patient-previous-details/div[2]/div[2]/div/div[2]"; 
	public static String View1Receipt="//*[text()=' Referal Note '] / following::div[5]"; 
	public static String History = "//*[text()='History']";
	
	
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
		 driver.manage().window().fullscreen();
		//driver.get("https://app.copious.care/");
		//driver.get("https://app.copious.care/");
		// driver.get("https://stage.copious.care/");
		driver.manage().window().fullscreen();
	}

	@Test(priority = 1, groups = "Regression")
	public void numberField() {
		waitForVisibilityOf(By.cssSelector(mobileNumber));
		driver.findElement(By.cssSelector(mobileNumber)).sendKeys("9665002440");
		highlightElement(By.cssSelector(mobileNumber));
		clickUsingJavaScript(By.cssSelector(mobileNumber));
	}

	@Test(priority = 2, groups = "Regression")
	public void sendOTP() throws InterruptedException {
		Thread.sleep(5000);
		waitForVisibilityOf(By.xpath(sendOTP));
		highlightElement(By.xpath(sendOTP));
		clickUsingJavaScript(By.xpath(sendOTP));
		
		Thread.sleep(1000);
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
		driver.findElement(By.xpath(verifyOTP));
		highlightElement(By.xpath(verifyOTP));
		clickUsingJavaScript(By.xpath(verifyOTP));

	}
	@Test(priority = 4)
	public void Profile() throws InterruptedException {
		Thread.sleep(10000);
		waitForVisibilityOf(By.xpath(Profile));
		driver.findElement(By.xpath(Profile));
		highlightElement(By.xpath(Profile));
		clickUsingJavaScript(By.xpath(Profile));

	}
	@Test(priority = 5)
	public void NewUISelect() throws InterruptedException {
		Thread.sleep(10000);
		driver.manage().window().maximize();
		waitForVisibilityOf(By.xpath(NewUISelect));
		driver.findElement(By.xpath(NewUISelect));
		highlightElement(By.xpath(NewUISelect));
		clickUsingJavaScript(By.xpath(NewUISelect));

	}
	
	@Test(priority = 6)
	public void clickHome() throws InterruptedException {
		Thread.sleep(10000);
		waitForVisibilityOf(By.xpath(clickHome));
		driver.findElement(By.xpath(clickHome));
		highlightElement(By.xpath(clickHome));
		clickUsingJavaScript(By.xpath(clickHome));

	}
	@Test(priority = 7, groups = "Regression")
	public void createPatient() {
		waitForVisibilityOf(By.id(createPatient));
		highlightElement(By.id(createPatient));
		clickUsingJavaScript(By.id(createPatient));
		driver.findElement(By.id(createPatient));
	}

	@Test(priority = 8, groups = "Regression")
	public void Number1() {
		waitForVisibilityOf(By.xpath(Number1));
		driver.findElement(By.xpath(Number1)).sendKeys("1234567891");
		highlightElement(By.xpath(Number1));
		clickUsingJavaScript(By.xpath(Number1));
	}

	@Test(priority = 9, groups = "Regression")
	public void confirm() throws InterruptedException {

		waitForVisibilityOf(By.xpath(confirm));
		driver.findElement(By.xpath(confirm));
		highlightElement(By.xpath(confirm));
		clickUsingJavaScript(By.xpath(confirm));
		clickUsingJavaScript(By.xpath(proceedWithSameRMN));

		/*
		 * waitForVisibilityOf(By.xpath(confirmPopup));
		 * highlightElement(By.xpath(confirmPopup));
		 * clickUsingJavaScript(By.xpath(confirmPopup));
		 */

		/*
		 * waitForVisibilityOf(By.xpath(proceedWithSameRMN));
		 * driver.findElement(By.xpath(proceedWithSameRMN));
		 * highlightElement(By.xpath(proceedWithSameRMN));
		 * clickUsingJavaScript(By.xpath(proceedWithSameRMN));
		 */

	}

	@Test(priority = 10, groups = "Regression")
	public void number2() {
		waitForVisibilityOf(By.xpath(number2));
		driver.findElement(By.xpath(number2)).sendKeys("1234567888");
		highlightElement(By.xpath(number2));
		clickUsingJavaScript(By.xpath(number2));
	}

	@Test(priority = 11, groups = "Regression")
	public void firstName() {
		waitForVisibilityOf(By.xpath(firstName));
		driver.findElement(By.xpath(firstName)).sendKeys("NewRx22june");
		;
		highlightElement(By.xpath(firstName));
		clickUsingJavaScript(By.xpath(firstName));
	}

	@Test(priority = 12, groups = "Regression")
	public void middleName() {
		waitForVisibilityOf(By.xpath(middleName));
		driver.findElement(By.xpath(middleName)).sendKeys("Auto");
		highlightElement(By.xpath(middleName));
		clickUsingJavaScript(By.xpath(middleName));
	}

	@Test(priority = 13, groups = "Regression")
	public void lastName() {
		waitForVisibilityOf(By.xpath(lastName));
		driver.findElement(By.xpath(lastName)).sendKeys("TEST");
		highlightElement(By.xpath(lastName));
		clickUsingJavaScript(By.xpath(lastName));
	}

	@Test(priority = 14, groups = "Regression")
	public void birthDate() throws InterruptedException {

		  waitForVisibilityOf(By.xpath(AdultbirthDate));
	      	highlightElement(By.xpath(AdultbirthDate));
				 driver.findElement(By.xpath(AdultbirthDate));
				 clickUsingJavaScript(By.xpath(AdultbirthDate));
				 
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

	@Test(priority = 15, groups = "Regression")
	public void genFemale() {
		waitForVisibilityOf(By.xpath(genFemale));
		driver.findElement(By.xpath(genFemale));
		highlightElement(By.xpath(genFemale));
		clickUsingJavaScript(By.xpath(genFemale));
	}

	@Test(priority = 16, groups = "Regression")
	public void address() {
		waitForVisibilityOf(By.xpath(address));
		driver.findElement(By.xpath(address)).sendKeys("Address");
		highlightElement(By.xpath(address));
		clickUsingJavaScript(By.xpath(address));
	}

	@Test(priority = 17, groups = "Regression")
	public void locality() {
		waitForVisibilityOf(By.xpath(locality));
		driver.findElement(By.xpath(locality)).sendKeys("locality");
		highlightElement(By.xpath(locality));
		clickUsingJavaScript(By.xpath(locality));
	}

	@Test(priority = 18, groups = "Regression")
	public void city() {
		waitForVisibilityOf(By.xpath(city));
		driver.findElement(By.xpath(city)).sendKeys("City");
		highlightElement(By.xpath(city));
		clickUsingJavaScript(By.xpath(city));
	}

	@Test(priority = 19, groups = "Regression")
	public void pinCode() {
		waitForVisibilityOf(By.xpath(pinCode));
		driver.findElement(By.xpath(pinCode)).sendKeys("412306");
		highlightElement(By.xpath(pinCode));
		clickUsingJavaScript(By.xpath(pinCode));

	}

	@Test(priority = 20, groups = "Regression")
	public void proceedWithSameRMN() {

		waitForVisibilityOf(By.xpath(prefferedLanguage));
		highlightElement(By.xpath(prefferedLanguage));
		driver.findElement(By.xpath(prefferedLanguage));
		clickUsingJavaScript(By.xpath(prefferedLanguage));

		waitForVisibilityOf(By.xpath(prefferedLanguageEnglish));
		highlightElement(By.xpath(prefferedLanguageEnglish));
		driver.findElement(By.xpath(prefferedLanguageEnglish));
		clickUsingJavaScript(By.xpath(prefferedLanguageEnglish));

		/*
		 * waitForVisibilityOf(By.xpath(proceedWithSameRMN));
		 * highlightElement(By.xpath(proceedWithSameRMN));
		 * clickUsingJavaScript(By.xpath(proceedWithSameRMN));
		 */

	}

	@Test(priority = 21, groups = "Regression")
	public void nextButton() throws InterruptedException {
		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(Next));
		driver.findElement(By.xpath(Next));
		highlightElement(By.xpath(Next));
		clickUsingJavaScript(By.xpath(Next));

	}

	@Test(priority = 22, groups = "Regression")
	public void clickClose() {
		waitForVisibilityOf(By.xpath(clickContinue));
		highlightElement(By.xpath(clickContinue));
		clickUsingJavaScript(By.xpath(clickContinue));

	}

	@Test(priority = 23)
	public void fillVitalForm() throws InterruptedException {
		waitForVisibilityOf(By.xpath(selectDelivery));
		highlightElement(By.xpath(selectDelivery));
		clickUsingJavaScript(By.xpath(selectDelivery));
		waitForVisibilityOf(By.xpath(normalDelivery));
		highlightElement(By.xpath(normalDelivery));
		clickUsingJavaScript(By.xpath(normalDelivery));

		highlightElement(By.xpath(height));
		driver.findElement(By.xpath(height)).sendKeys("100");
		//String w3=driver.findElement(By.xpath(weight)).getText();
		//System.out.println("msge:"+w3); String a2="100"; Assert.assertEquals(w3,a2);

		highlightElement(By.xpath(weight));
		driver.findElement(By.xpath(weight)).sendKeys("4.1");
		
		  //String w1=driver.findElement(By.xpath(weight)).getText();
		 // String w2=driver.findElement(By.xpath(weight)).getText();
			 //System.out.println("msge:"+w2); String a1="4.1"; Assert.assertEquals(w2,a1);
		 
		highlightElement(By.xpath(HC));
		driver.findElement(By.xpath(HC)).sendKeys("4");

		highlightElement(By.xpath(CC));
		driver.findElement(By.xpath(CC)).sendKeys("4");

		highlightElement(By.xpath(BP));
		driver.findElement(By.xpath(BP)).sendKeys("80");

		highlightElement(By.xpath(BPdia));
		driver.findElement(By.xpath(BPdia)).sendKeys("120");

		highlightElement(By.xpath(bloodGrp));
		driver.findElement(By.xpath(bloodGrp));
		clickUsingJavaScript(By.xpath(bloodGrp));

		highlightElement(By.xpath(bloodGrpOplus));
		driver.findElement(By.xpath(bloodGrpOplus));
		clickUsingJavaScript(By.xpath(bloodGrpOplus));
		
		

		Thread.sleep(15000);
		highlightElement(By.xpath(antentalNext));
		clickUsingJavaScript(By.xpath(antentalNext));

	}

	@Test(priority = 24)
	public void fillHealthProfile() throws InterruptedException {
		Thread.sleep(10000);

		waitForVisibilityOf(By.xpath(medicalConditions));
		highlightElement(By.xpath(medicalConditions));
		driver.findElement(By.xpath(medicalConditions)).sendKeys("hypertension,Diabetes");

		waitForVisibilityOf(By.xpath(allergies));
		highlightElement(By.xpath(allergies));
		driver.findElement(By.xpath(allergies)).sendKeys("Dust");

		highlightElement(By.xpath(reactionToDrugs));
		driver.findElement(By.xpath(reactionToDrugs)).sendKeys("Yes");

		highlightElement(By.xpath(recurringComplaints));
		driver.findElement(By.xpath(recurringComplaints)).sendKeys("Test");

		highlightElement(By.xpath(hospitalization));
		driver.findElement(By.xpath(hospitalization)).sendKeys("Test1");

		highlightElement(By.xpath(healthHistory));
		driver.findElement(By.xpath(healthHistory)).sendKeys("Test2");

		highlightElement(By.xpath(emailID));
		driver.findElement(By.xpath(emailID)).sendKeys("vishu@123testtest.com");

		highlightElement(By.xpath(UHID));
		driver.findElement(By.xpath(UHID)).sendKeys("Test3");

		highlightElement(By.xpath(AnyGeneticDisorder));
		driver.findElement(By.xpath(AnyGeneticDisorder)).sendKeys("Dementia");
		;

		highlightElement(By.xpath(healthNext));
		driver.findElement(By.xpath(healthNext));
		clickUsingJavaScript(By.xpath(healthNext));

		// highlightElement(By.xpath(familyProfile)); //
		driver.findElement(By.xpath(familyProfile));

	}

	@Test(priority = 25)
	public void fillFamilyProfile() throws InterruptedException {
		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(fatherHeightFt));

		highlightElement(By.xpath(fatherHeightFt));
		driver.findElement(By.xpath(fatherHeightFt)).sendKeys("5");

		highlightElement(By.xpath(fatherHeightinch));
		driver.findElement(By.xpath(fatherHeightinch)).sendKeys("10");

		highlightElement(By.xpath(motherHeightFt));
		driver.findElement(By.xpath(motherHeightFt)).sendKeys("5");

		highlightElement(By.xpath(motherHeightinch));
		driver.findElement(By.xpath(motherHeightinch)).sendKeys("4");

		highlightElement(By.xpath(FamilyMedicalHistory));
		driver.findElement(By.xpath(FamilyMedicalHistory)).sendKeys("Diabetes");

		highlightElement(By.xpath(EnterDisorder));
		driver.findElement(By.xpath(EnterDisorder)).sendKeys("Physically Challenged");

		highlightElement(By.xpath(familyNext));
		driver.findElement(By.xpath(familyNext));
		clickUsingJavaScript(By.xpath(familyNext));

		highlightElement(By.xpath(Done));
		driver.findElement(By.xpath(Done));
		clickUsingJavaScript(By.xpath(Done));
	}

	/*
	 * waitForVisibilityOf(By.xpath(success)); highlightElement(By.xpath(success));
	 * String p=driver.findElement(By.xpath(success)).getText();
	 * System.out.println("msge:"+p); String a="Profile"; Assert.assertEquals(p,a);}
	 */

	@Test(priority = 26)
	public void GoHome() throws InterruptedException {
		waitForVisibilityOf(By.xpath(ClickHome));
		driver.findElement(By.xpath(ClickHome));
		highlightElement(By.xpath(ClickHome));
		clickUsingJavaScript(By.xpath(ClickHome));

	}
	

	@Test(priority = 27)
	public void AddNewAppointment() throws InterruptedException {
		Thread.sleep(10000);

		waitForVisibilityOf(By.xpath(AddNewAppointment));
		driver.findElement(By.xpath(AddNewAppointment));
		highlightElement(By.xpath(AddNewAppointment));
		clickUsingJavaScript(By.xpath(AddNewAppointment));

		waitForVisibilityOf(By.xpath(EnterTime));
		driver.findElement(By.xpath(EnterTime));
		highlightElement(By.xpath(EnterTime));
		clickUsingJavaScript(By.xpath(EnterTime));

		waitForVisibilityOf(By.xpath(SelectSlot));
		driver.findElement(By.xpath(SelectSlot));
		highlightElement(By.xpath(SelectSlot));
		clickUsingJavaScript(By.xpath(SelectSlot));

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(BookAppointment));
		driver.findElement(By.xpath(BookAppointment));
		highlightElement(By.xpath(BookAppointment));
		clickUsingJavaScript(By.xpath(BookAppointment));

		
		
		
		
		
		/*
		 * waitForVisibilityOf(By.xpath(AppointmentBooked));
		 * 
		 * highlightElement(By.xpath(AppointmentBooked)); String
		 * Actualmsge=driver.findElement(By.xpath(AppointmentBooked)).getText();
		 * System.out.println("msge:"+Actualmsge); String
		 * ErrorMsge="Appointment Created"; Assert.assertEquals(Actualmsge,ErrorMsge);
		 */
		 
		 
		 
		 
	}

	@Test(priority = 28)
	public void AddPrescription() throws InterruptedException {
		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(AddNewPrescription));
		driver.findElement(By.xpath(AddNewPrescription));
		highlightElement(By.xpath(AddNewPrescription));
		clickUsingJavaScript(By.xpath(AddNewPrescription));

	}
	
	@Test(priority = 29, groups = "Regression")
	public void HealthProfile() throws InterruptedException {
		Thread.sleep(5000);

		/*
		 * waitForVisibilityOf(By.xpath(HealthProfile));
		 * driver.findElement(By.xpath(HealthProfile));
		 * highlightElement(By.xpath(HealthProfile));
		 * clickUsingJavaScript(By.xpath(HealthProfile));
		 */

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
		
		
		 LocalDate currentDate1 = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("d");
	        String formattedDay1 = currentDate1.format(dateFormatter1);

	        
		 
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay1 + "']"));

		/*
		 * waitForVisibilityOf(By.xpath(SelectDate1));
		 * driver.findElement(By.xpath(SelectDate1));
		 * highlightElement(By.xpath(SelectDate1));
		 * clickUsingJavaScript(By.xpath(SelectDate1));
		 */

		waitForVisibilityOf(By.xpath(SaveSpecialVaccine));
		driver.findElement(By.xpath(SaveSpecialVaccine));
		highlightElement(By.xpath(SaveSpecialVaccine));
		clickUsingJavaScript(By.xpath(SaveSpecialVaccine));

		Thread.sleep(5000);
		
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
		  
		  LocalDate currentDate2 = LocalDate.now();

	        // Format current date to match expected format in the calendar
	        DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("d");
	        String formattedDay2 = currentDate2.format(dateFormatter2);

	        
		 
	        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay2 + "']"));
		  
		  
		  
		  
		  
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
		  
		  Thread.sleep(3000);
		  
		  waitForVisibilityOf(By.xpath(SpecialVaccineClick));
			driver.findElement(By.xpath(SpecialVaccineClick));
			highlightElement(By.xpath(SpecialVaccineClick));
			clickUsingJavaScript(By.xpath(SpecialVaccineClick));
			
			waitForVisibilityOf(By.xpath(SpecialOtherVaccine));
			driver.findElement(By.xpath(SpecialOtherVaccine));
			highlightElement(By.xpath(SpecialOtherVaccine));
			clickUsingJavaScript(By.xpath(SpecialOtherVaccine));

			waitForVisibilityOf(By.xpath(Test));
			driver.findElement(By.xpath(Test)).sendKeys("Test");
			highlightElement(By.xpath(Test));
			//clickUsingJavaScript(By.xpath(Test));

			waitForVisibilityOf(By.xpath(ClickCalender));
			driver.findElement(By.xpath(ClickCalender));
			highlightElement(By.xpath(ClickCalender));
			clickUsingJavaScript(By.xpath(ClickCalender));
			
			 LocalDate currentDate3 = LocalDate.now();

		        // Format current date to match expected format in the calendar
		        DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("d");
		        String formattedDay3 = currentDate3.format(dateFormatter3);

		        
			 
		        clickUsingJavaScript(By.xpath("//*[text()='" + formattedDay3 + "']"));

			/*
			 * waitForVisibilityOf(By.xpath(SelectDate1));
			 * driver.findElement(By.xpath(SelectDate1));
			 * highlightElement(By.xpath(SelectDate1));
			 * clickUsingJavaScript(By.xpath(SelectDate1));
			 */

			waitForVisibilityOf(By.xpath(SaveSpecialVaccine));
			driver.findElement(By.xpath(SaveSpecialVaccine));
			highlightElement(By.xpath(SaveSpecialVaccine));
			clickUsingJavaScript(By.xpath(SaveSpecialVaccine));
		 

}
	@Test(priority = 30)
	public void ConcernsAndIssues() throws InterruptedException {

		Thread.sleep(15000);
		
		waitForVisibilityOf(By.xpath(QuickRx));
		driver.findElement(By.xpath(QuickRx));
		highlightElement(By.xpath(QuickRx));
		clickUsingJavaScript(By.xpath(QuickRx));
		
		Thread.sleep(20000);
		waitForVisibilityOf(By.xpath(ConcernTabClick));
		driver.findElement(By.xpath(ConcernTabClick));
		highlightElement(By.xpath(ConcernTabClick));
		clickUsingJavaScript(By.xpath(ConcernTabClick));

		
		Thread.sleep(5000);
		driver.findElement(By.xpath(Examination));
		highlightElement(By.xpath(Examination));
		clickUsingJavaScript(By.xpath(Examination));
		
		waitForVisibilityOf(By.xpath(Since1day));
		driver.findElement(By.xpath(Since1day)).sendKeys("1");
		highlightElement(By.xpath(Since1day));
		clickUsingJavaScript(By.xpath(Since1day));
		
		waitForVisibilityOf(By.xpath(MoreDetailsDropDown));
		driver.findElement(By.xpath(MoreDetailsDropDown));
		highlightElement(By.xpath(MoreDetailsDropDown));
		clickUsingJavaScript(By.xpath(MoreDetailsDropDown));
		
		waitForVisibilityOf(By.xpath(Severe));
		driver.findElement(By.xpath(Severe));
		highlightElement(By.xpath(Severe));
		clickUsingJavaScript(By.xpath(Severe));
		
		/*
		 * driver.findElement(By.xpath(Examination1));
		 * highlightElement(By.xpath(Examination1));
		 * clickUsingJavaScript(By.xpath(Examination1));
		 */
		
		waitForVisibilityOf(By.xpath(ConcernTabClick));
		driver.findElement(By.xpath(ConcernTabClick));
		highlightElement(By.xpath(ConcernTabClick));
		clickUsingJavaScript(By.xpath(ConcernTabClick));

	}
	@Test(priority = 31)
	public void AdVitals() throws InterruptedException {

		Thread.sleep(3000); // driver.manage().window().fullscreen();
		waitForVisibilityOf(By.xpath(VitalTabClick));
		driver.findElement(By.xpath(VitalTabClick));
		highlightElement(By.xpath(VitalTabClick));
		clickUsingJavaScript(By.xpath(VitalTabClick));

		System.out.print("print");
		
		highlightElement(By.xpath(AdvitalWeihgt));
		driver.findElement(By.xpath(AdvitalWeihgt)).clear();
		driver.findElement(By.xpath(AdvitalWeihgt)).sendKeys("13.5");

		highlightElement(By.xpath(AdvitalHeihgt));
		driver.findElement(By.xpath(AdvitalHeihgt)).clear();
		driver.findElement(By.xpath(AdvitalHeihgt)).sendKeys("100");

		

		

		highlightElement(By.xpath(Adtemperature));
		driver.findElement(By.xpath(Adtemperature)).clear();
		driver.findElement(By.xpath(Adtemperature)).sendKeys("77");

		highlightElement(By.xpath(AdSPO2));
		driver.findElement(By.xpath(AdSPO2)).clear();
		driver.findElement(By.xpath(AdSPO2)).sendKeys("10");
		
		highlightElement(By.xpath(LMP));
		//driver.findElement(By.xpath(LMP)).clear();
		driver.findElement(By.xpath(LMP));
		clickUsingJavaScript(By.xpath(LMP));
		
		
		Thread.sleep(5000);
		
		
		
		  LocalDate currentDate5 = LocalDate.now();
		  
		  // Format current date to match expected format in the calendar
		  DateTimeFormatter dateFormatter5 = DateTimeFormatter.ofPattern("d"); String
		  formattedDay5 = currentDate5.format(dateFormatter5);
		  
		  
		  
		  clickUsingJavaScript(By.xpath("//*[text()=' " + formattedDay5 + " ']"));
		  
		 
			
		/*
		 * highlightElement(By.xpath(LMPDate));
		 * //driver.findElement(By.xpath(LMPDate)).clear();
		 * driver.findElement(By.xpath(LMPDate));
		 * clickUsingJavaScript(By.xpath(LMPDate)); System.out.print("printfail");
		 */
	
		highlightElement(By.xpath(AdBPSys));
		driver.findElement(By.xpath(AdBPSys)).clear();
		driver.findElement(By.xpath(AdBPSys)).sendKeys("80");

		highlightElement(By.xpath(AdBPDia));
		driver.findElement(By.xpath(AdBPDia)).clear();
		driver.findElement(By.xpath(AdBPDia)).sendKeys("100");

		
		  highlightElement(By.xpath(AdheartRate));
		  driver.findElement(By.xpath(AdheartRate)).clear();
		  driver.findElement(By.xpath(AdheartRate)).sendKeys("75");
		 

		highlightElement(By.xpath(Adpulse));
		driver.findElement(By.xpath(Adpulse)).clear();
		driver.findElement(By.xpath(Adpulse)).sendKeys("77");

	
	

		

		highlightElement(By.xpath(AdHaemoglobin));
		driver.findElement(By.xpath(AdHaemoglobin)).clear();
		driver.findElement(By.xpath(AdHaemoglobin)).sendKeys("12");

		highlightElement(By.xpath(AdBloodSugarRandom));
		driver.findElement(By.xpath(AdBloodSugarRandom)).clear();
		driver.findElement(By.xpath(AdBloodSugarRandom)).sendKeys("110");

		highlightElement(By.xpath(AdBloodSugarF));
		driver.findElement(By.xpath(AdBloodSugarF)).clear();
		driver.findElement(By.xpath(AdBloodSugarF)).sendKeys("140");

		highlightElement(By.xpath(AdBloodSugarPP));
		driver.findElement(By.xpath(AdBloodSugarPP)).clear();
		driver.findElement(By.xpath(AdBloodSugarPP)).sendKeys("120");

		highlightElement(By.xpath(HBA1C));
		driver.findElement(By.xpath(HBA1C)).clear();
		driver.findElement(By.xpath(HBA1C)).sendKeys("10");

	

		highlightElement(By.xpath(AdCholestrerolHDL));
		driver.findElement(By.xpath(AdCholestrerolHDL)).clear();
		driver.findElement(By.xpath(AdCholestrerolHDL)).sendKeys("30");

		highlightElement(By.xpath(AdCholestrerolLDL));
		driver.findElement(By.xpath(AdCholestrerolLDL)).clear();
		driver.findElement(By.xpath(AdCholestrerolLDL)).sendKeys("40");

		highlightElement(By.xpath(AdtotalCholesterol));
		driver.findElement(By.xpath(AdtotalCholesterol)).clear();
		driver.findElement(By.xpath(AdtotalCholesterol)).sendKeys("40");

		highlightElement(By.xpath(AdTriglycerides));
		driver.findElement(By.xpath(AdTriglycerides)).clear();
		driver.findElement(By.xpath(AdTriglycerides)).sendKeys("40");
		
		waitForVisibilityOf(By.xpath(VitalTabClick));
		driver.findElement(By.xpath(VitalTabClick));
		highlightElement(By.xpath(VitalTabClick));
		clickUsingJavaScript(By.xpath(VitalTabClick));

	
	
	}
		
	@Test(priority = 37)
	public void Diagnosis() throws InterruptedException {

		Thread.sleep(15000);
		
		waitForVisibilityOf(By.xpath(DiagnosisTabClick));
		driver.findElement(By.xpath(DiagnosisTabClick)); //
		highlightElement(By.xpath(DiagnosisTabClick));
		clickUsingJavaScript(By.xpath(DiagnosisTabClick));

		/*
		 * waitForVisibilityOf(By.xpath(DiagnosisOption));
		 * driver.findElement(By.xpath(DiagnosisOption)); //
		 * highlightElement(By.xpath(DiagnosisOption));
		 * clickUsingJavaScript(By.xpath(DiagnosisOption));
		 */

		driver.findElement(By.xpath(Diagnosis));
		highlightElement(By.xpath(Diagnosis));
		clickUsingJavaScript(By.xpath(Diagnosis));
		
		waitForVisibilityOf(By.xpath(DiagnosisTabClick));
		driver.findElement(By.xpath(DiagnosisTabClick)); //
		highlightElement(By.xpath(DiagnosisTabClick));
		clickUsingJavaScript(By.xpath(DiagnosisTabClick));

	}

	@Test(priority = 38)
	public void Medicine1() throws InterruptedException {

		Thread.sleep(15000);
		
		waitForVisibilityOf(By.xpath(MedicineTabClick));
		driver.findElement(By.xpath(MedicineTabClick)); //
		highlightElement(By.xpath(MedicineTabClick));
		clickUsingJavaScript(By.xpath(MedicineTabClick));

		/*
		 * waitForVisibilityOf(By.xpath(Medicine));
		 * driver.findElement(By.xpath(Medicine)); highlightElement(By.xpath(Medicine));
		 * clickUsingJavaScript(By.xpath(Medicine));
		 */

		waitForVisibilityOf(By.xpath(medicineSearch));
		highlightElement(By.xpath(medicineSearch));
		driver.findElement(By.xpath(medicineSearch)).sendKeys("dolo");
		waitForVisibilityOf(By.xpath(Dolocare));
		highlightElement(By.xpath(Dolocare));
		clickUsingJavaScript(By.xpath(Dolocare));

		/*
		 * highlightElement(By.xpath(Medpageinstruction));
		 * driver.findElement(By.xpath(Medpageinstruction));
		 * clickUsingJavaScript(By.xpath(Medpageinstruction));
		 */

		/*
		 * waitForVisibilityOf(By.xpath(Instruction));
		 * highlightElement(By.xpath(Instruction));
		 * driver.findElement(By.xpath(Instruction)).sendKeys("Drink water");
		 * clickUsingJavaScript(By.xpath(Instruction));
		 */
		waitForVisibilityOf(By.xpath(MedAddtoList));
		highlightElement(By.xpath(MedAddtoList));
		driver.findElement(By.xpath(MedAddtoList));
		clickUsingJavaScript(By.xpath(MedAddtoList));

		Thread.sleep(15000);

		waitForVisibilityOf(By.xpath(PopularOption));
		highlightElement(By.xpath(PopularOption));
		driver.findElement(By.xpath(PopularOption));
		clickUsingJavaScript(By.xpath(PopularOption));

		waitForVisibilityOf(By.xpath(PopularSearch));
		highlightElement(By.xpath(PopularSearch));
		driver.findElement(By.xpath(PopularSearch)).sendKeys("Cro");

		waitForVisibilityOf(By.xpath(PopularMedicineClick));
		highlightElement(By.xpath(PopularMedicineClick));
		driver.findElement(By.xpath(PopularMedicineClick));
		clickUsingJavaScript(By.xpath(PopularMedicineClick));

		Thread.sleep(15000);

		waitForVisibilityOf(By.xpath(FavouriteOption));
		highlightElement(By.xpath(FavouriteOption));
		driver.findElement(By.xpath(FavouriteOption));
		clickUsingJavaScript(By.xpath(FavouriteOption));

		waitForVisibilityOf(By.xpath(FavouriteSearch));
		highlightElement(By.xpath(FavouriteSearch));
		driver.findElement(By.xpath(FavouriteSearch)).sendKeys("Temp");

		waitForVisibilityOf(By.xpath(FavouriteClick));
		highlightElement(By.xpath(FavouriteClick));
		driver.findElement(By.xpath(FavouriteClick));
		clickUsingJavaScript(By.xpath(FavouriteClick));

		waitForVisibilityOf(By.xpath(FavouriteClickMedicine));
		highlightElement(By.xpath(FavouriteClickMedicine));
		driver.findElement(By.xpath(FavouriteClickMedicine));
		clickUsingJavaScript(By.xpath(FavouriteClickMedicine));
		
		waitForVisibilityOf(By.xpath(MedicineTabClick));
		driver.findElement(By.xpath(MedicineTabClick)); //
		highlightElement(By.xpath(MedicineTabClick));
		clickUsingJavaScript(By.xpath(MedicineTabClick));

	}

	@Test(priority = 39)
	public void DietaryAdvice() throws InterruptedException {

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(DietTabClick));
		driver.findElement(By.xpath(DietTabClick)); //
		highlightElement(By.xpath(DietTabClick));
		clickUsingJavaScript(By.xpath(DietTabClick));

		/*
		 * waitForVisibilityOf(By.xpath(DietaryAdviceOption));
		 * driver.findElement(By.xpath(DietaryAdviceOption));
		 * highlightElement(By.xpath(DietaryAdviceOption));
		 * clickUsingJavaScript(By.xpath(DietaryAdviceOption));
		 */

		waitForVisibilityOf(By.xpath(DietaryAdd));
		driver.findElement(By.xpath(DietaryAdd));
		highlightElement(By.xpath(DietaryAdd));
		clickUsingJavaScript(By.xpath(DietaryAdd));
		
		waitForVisibilityOf(By.xpath(DietTabClick));
		driver.findElement(By.xpath(DietTabClick)); //
		highlightElement(By.xpath(DietTabClick));
		clickUsingJavaScript(By.xpath(DietTabClick));

	}

	@Test(priority = 40)
	public void GeneralInstruction() throws InterruptedException {

		Thread.sleep(15000);
		
		waitForVisibilityOf(By.xpath(GeneralInstructionTabClick));
		driver.findElement(By.xpath(GeneralInstructionTabClick)); //
		highlightElement(By.xpath(GeneralInstructionTabClick));
		clickUsingJavaScript(By.xpath(GeneralInstructionTabClick));

		/*
		 * waitForVisibilityOf(By.xpath(GeneralInstruction));
		 * driver.findElement(By.xpath(GeneralInstruction));
		 * highlightElement(By.xpath(GeneralInstruction));
		 * clickUsingJavaScript(By.xpath(GeneralInstruction));
		 */

		waitForVisibilityOf(By.xpath(InstructionAdd));
		driver.findElement(By.xpath(InstructionAdd));
		highlightElement(By.xpath(InstructionAdd));
		clickUsingJavaScript(By.xpath(InstructionAdd));

		/*
		 * waitForVisibilityOf(By.xpath(InstructionImpNote));
		 * driver.findElement(By.xpath(InstructionImpNote));
		 * highlightElement(By.xpath(InstructionImpNote));
		 * clickUsingJavaScript(By.xpath(InstructionImpNote));
		 */
		
		waitForVisibilityOf(By.xpath(GeneralInstructionTabClick));
		driver.findElement(By.xpath(GeneralInstructionTabClick)); //
		highlightElement(By.xpath(GeneralInstructionTabClick));
		clickUsingJavaScript(By.xpath(GeneralInstructionTabClick));

	}

	

	@Test(priority = 42)
	public void NextFoolowup() throws InterruptedException {

		Thread.sleep(5000);
		waitForVisibilityOf(By.xpath(NextFollowupTabclick));
		driver.findElement(By.xpath(NextFollowupTabclick)); //
		highlightElement(By.xpath(NextFollowupTabclick));
		clickUsingJavaScript(By.xpath(NextFollowupTabclick));
		
		waitForVisibilityOf(By.xpath(FollowupMsge));
		driver.findElement(By.xpath(FollowupMsge));
		highlightElement(By.xpath(FollowupMsge));
		clickUsingJavaScript(By.xpath(FollowupMsge));


		waitForVisibilityOf(By.xpath(nextFollowupDate));
		driver.findElement(By.xpath(nextFollowupDate));
		highlightElement(By.xpath(nextFollowupDate));
		clickUsingJavaScript(By.xpath(nextFollowupDate));

		waitForVisibilityOf(By.xpath(nextFollowupSelectDate));
		driver.findElement(By.xpath(nextFollowupSelectDate));
		highlightElement(By.xpath(nextFollowupSelectDate));
		clickUsingJavaScript(By.xpath(nextFollowupSelectDate));

		/*
		 * waitForVisibilityOf(By.xpath(FollowupTypes));
		 * driver.findElement(By.xpath(FollowupTypes));
		 * highlightElement(By.xpath(FollowupTypes));
		 * clickUsingJavaScript(By.xpath(FollowupTypes));
		 */
		waitForVisibilityOf(By.xpath(Appointment));
		driver.findElement(By.xpath(Appointment));
		highlightElement(By.xpath(Appointment));
		clickUsingJavaScript(By.xpath(Appointment));
		
		waitForVisibilityOf(By.xpath(NextFollowupTabclick));
		driver.findElement(By.xpath(NextFollowupTabclick)); //
		highlightElement(By.xpath(NextFollowupTabclick));
		clickUsingJavaScript(By.xpath(NextFollowupTabclick));

		/*
		 * waitForVisibilityOf(By.xpath(FollowupMessage));
		 * driver.findElement(By.xpath(FollowupMessage));
		 * highlightElement(By.xpath(FollowupMessage));
		 * clickUsingJavaScript(By.xpath(FollowupMessage));
		 */

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(SaveAndPreview));
		driver.findElement(By.xpath(SaveAndPreview));
		highlightElement(By.xpath(SaveAndPreview));
		clickUsingJavaScript(By.xpath(SaveAndPreview));
		
		/*
		 * waitForVisibilityOf(By.xpath(ConfirmandPrint));
		 * driver.findElement(By.xpath(ConfirmandPrint));
		 * highlightElement(By.xpath(ConfirmandPrint));
		 * clickUsingJavaScript(By.xpath(ConfirmandPrint));
		 */

		Thread.sleep(20000);
		waitForVisibilityOf(By.xpath(prescriptionDone));
		driver.findElement(By.xpath(prescriptionDone));
		highlightElement(By.xpath(prescriptionDone));
		clickUsingJavaScript(By.xpath(prescriptionDone));

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(GoHome));
		driver.findElement(By.xpath(GoHome));
		highlightElement(By.xpath(GoHome));
		clickUsingJavaScript(By.xpath(GoHome));
		
		
			Thread.sleep(15000);
			waitForVisibilityOf(By.xpath(AddNewPrescription));
			driver.findElement(By.xpath(AddNewPrescription));
			highlightElement(By.xpath(AddNewPrescription));
			clickUsingJavaScript(By.xpath(AddNewPrescription));}

			@Test(priority = 43, groups = "Regression")
			public void ReferralOption3() throws InterruptedException {
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

	Thread.sleep(2000);

	/*
	 * waitForVisibilityOf(By.cssSelector(ReferralSharedMsge));
	 * highlightElement(By.cssSelector(ReferralSharedMsge)); String Actualmsge =
	 * driver.findElement(By.cssSelector(ReferralSharedMsge)).getText();
	 * System.out.println("msge:" + Actualmsge); String ErrorMsge =
	 * "Certificate saved and shared with patient successfully";
	 * Assert.assertEquals(Actualmsge, ErrorMsge);
	 */
	waitForVisibilityOf(By.xpath(QuickRx));
	driver.findElement(By.xpath(QuickRx));
	highlightElement(By.xpath(QuickRx));
	clickUsingJavaScript(By.xpath(QuickRx));

}
			@Test(priority = 44, groups = "Regression") public void Investigation1()
					  throws InterruptedException {
					  
					  Thread.sleep(5000);
					  
						/*
						 * waitForVisibilityOf(By.xpath(InvestigationClick1));
						 * driver.findElement(By.xpath(InvestigationClick1));
						 * highlightElement(By.xpath(InvestigationClick1));
						 * clickUsingJavaScript(By.xpath(InvestigationClick1));
						 */
					  
					  waitForVisibilityOf(By.xpath(RequisitionClick));
					  driver.findElement(By.xpath(RequisitionClick));
					  highlightElement(By.xpath(RequisitionClick));
					  clickUsingJavaScript(By.xpath(RequisitionClick));
					  
					  waitForVisibilityOf(By.xpath(NewRequisition));
					  driver.findElement(By.xpath(NewRequisition));
					  highlightElement(By.xpath(NewRequisition));
					  clickUsingJavaScript(By.xpath(NewRequisition));
					  
					  Thread.sleep(3000); waitForVisibilityOf(By.xpath(SelectTest));
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
					  
					  Thread.sleep(10000); waitForVisibilityOf(By.xpath(ShareRequisition));
					  driver.findElement(By.xpath(ShareRequisition));
					  highlightElement(By.xpath(ShareRequisition));
					  clickUsingJavaScript(By.xpath(ShareRequisition));
					  
						
						
						
						/*
						 * waitForVisibilityOf(By.xpath(ChooseLab));
						 * driver.findElement(By.xpath(ChooseLab));
						 * highlightElement(By.xpath(ChooseLab));
						 * clickUsingJavaScript(By.xpath(ChooseLab));
						 * 
						 * waitForVisibilityOf(By.xpath(ChooseLab));
						 * driver.findElement(By.xpath(ChooseLab));
						 * highlightElement(By.xpath(ChooseLab));
						 * clickUsingJavaScript(By.xpath(ChooseLab));
						 * 
						 * waitForVisibilityOf(By.xpath(DashLab));
						 * driver.findElement(By.xpath(DashLab)); highlightElement(By.xpath(DashLab));
						 * clickUsingJavaScript(By.xpath(DashLab));
						 * 
						 * waitForVisibilityOf(By.xpath(EmailOption));
						 * driver.findElement(By.xpath(EmailOption));
						 * highlightElement(By.xpath(EmailOption));
						 * clickUsingJavaScript(By.xpath(EmailOption));
						 * 
						 */
						 
					  
					  
					  waitForVisibilityOf(By.xpath(CancelOption));
					  driver.findElement(By.xpath(CancelOption));
					  highlightElement(By.xpath(CancelOption));
					  clickUsingJavaScript(By.xpath(CancelOption));
					 
					  Thread.sleep(5000); 
						/*
						 * Thread.sleep(2000); waitForVisibilityOf(By.xpath(RequisitionSharedMsge));
						 * highlightElement(By.xpath(RequisitionSharedMsge)); String Actualmsge =
						 * driver.findElement(By.xpath(RequisitionSharedMsge)).getText();
						 * System.out.println("msge:" + Actualmsge); String ErrorMsge =
						 * "Requisition shared to patient successfully"; Assert.assertEquals(Actualmsge,
						 * ErrorMsge);
						 */
					  waitForVisibilityOf(By.xpath(QuickRx));
						driver.findElement(By.xpath(QuickRx));
						highlightElement(By.xpath(QuickRx));
						clickUsingJavaScript(By.xpath(QuickRx));	  
					  
					 }
			@Test(priority = 45)
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
				driver.findElement(By.xpath(Consultation)).sendKeys("100.5");
				highlightElement(By.xpath(Consultation));

				Thread.sleep(3000);
				waitForVisibilityOf(By.xpath(Vaccination));
				driver.findElement(By.xpath(Vaccination)).sendKeys("1000");
				highlightElement(By.xpath(Vaccination));

				waitForVisibilityOf(By.xpath(OtheCharges));
				driver.findElement(By.xpath(OtheCharges)).sendKeys("500.5");
				highlightElement(By.xpath(OtheCharges));

				waitForVisibilityOf(By.xpath(AddMoreButton));
				driver.findElement(By.xpath(AddMoreButton));
				highlightElement(By.xpath(AddMoreButton));
				clickUsingJavaScript(By.xpath(AddMoreButton));

				Thread.sleep(5000);
				waitForVisibilityOf(By.xpath(ExtraOtherCharges));
				driver.findElement(By.xpath(ExtraOtherCharges)).sendKeys("Extra");
				;
				highlightElement(By.xpath(ExtraOtherCharges));

				waitForVisibilityOf(By.xpath(ExtraCharges));
				driver.findElement(By.xpath(ExtraCharges)).sendKeys("100.5");
				;
				highlightElement(By.xpath(ExtraCharges));
				
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
				
				Thread.sleep(5000);
	
				waitForVisibilityOf(By.xpath(QuickRx));
				driver.findElement(By.xpath(QuickRx));
				highlightElement(By.xpath(QuickRx));
				clickUsingJavaScript(By.xpath(QuickRx));

			}
			@Test(priority = 46, groups = "Regression")
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

				Thread.sleep(1000);
				/*
				 * waitForVisibilityOf(By.xpath(SuccessfulMsge));
				 * highlightElement(By.xpath(SuccessfulMsge)); String Actualmsge =
				 * driver.findElement(By.xpath(SuccessfulMsge)).getText();
				 * System.out.println("msge:" + Actualmsge); String ErrorMsge =
				 * "Certificate saved and shared with patient successfully";
				 * Assert.assertEquals(Actualmsge, ErrorMsge);
				 */
				waitForVisibilityOf(By.xpath(QuickRx));
				driver.findElement(By.xpath(QuickRx));
				highlightElement(By.xpath(QuickRx));
				clickUsingJavaScript(By.xpath(QuickRx));
			}
			@Test(priority = 47, groups = "Regression")
			public void History() throws InterruptedException {
				Thread.sleep(10000);
				waitForVisibilityOf(By.xpath(History));
				driver.findElement(By.xpath(History));
				highlightElement(By.xpath(History));
				clickUsingJavaScript(By.xpath(History));
				
				Thread.sleep(15000);
				waitForVisibilityOf(By.xpath(ViewReferral));
				driver.findElement(By.xpath(ViewReferral));
				highlightElement(By.xpath(ViewReferral));
				clickUsingJavaScript(By.xpath(ViewReferral));
				Thread.sleep(10000);
				waitForVisibilityOf(By.xpath(ReferralClose));
				driver.findElement(By.xpath(ReferralClose));
				highlightElement(By.xpath(ReferralClose));
				clickUsingJavaScript(By.xpath(ReferralClose));

				Thread.sleep(5000);
				
				waitForVisibilityOf(By.xpath(ViewCertificate));
				driver.findElement(By.xpath(ViewCertificate));
				highlightElement(By.xpath(ViewCertificate));
				clickUsingJavaScript(By.xpath(ViewCertificate));
				Thread.sleep(10000);
				waitForVisibilityOf(By.xpath(CertificateClose));
				driver.findElement(By.xpath(CertificateClose));
				highlightElement(By.xpath(CertificateClose));
				clickUsingJavaScript(By.xpath(CertificateClose));
				
				
Thread.sleep(5000);
				
				waitForVisibilityOf(By.xpath(ViewPrescription));
				driver.findElement(By.xpath(ViewPrescription));
				highlightElement(By.xpath(ViewPrescription));
				clickUsingJavaScript(By.xpath(ViewPrescription));
				Thread.sleep(10000);
				waitForVisibilityOf(By.xpath(PrescriptionClose));
				driver.findElement(By.xpath(PrescriptionClose));
				highlightElement(By.xpath(PrescriptionClose));
				clickUsingJavaScript(By.xpath(PrescriptionClose));
			
Thread.sleep(5000);
				
				waitForVisibilityOf(By.xpath(ViewRequisition));
				driver.findElement(By.xpath(ViewRequisition));
				highlightElement(By.xpath(ViewRequisition));
				clickUsingJavaScript(By.xpath(ViewRequisition));
				Thread.sleep(10000);
				waitForVisibilityOf(By.xpath(RequisitionClose));
				driver.findElement(By.xpath(RequisitionClose));
				highlightElement(By.xpath(RequisitionClose));
				clickUsingJavaScript(By.xpath(RequisitionClose));		
				
Thread.sleep(5000);
				
				waitForVisibilityOf(By.xpath(View1Receipt));
				driver.findElement(By.xpath(View1Receipt));
				highlightElement(By.xpath(View1Receipt));
				clickUsingJavaScript(By.xpath(View1Receipt));
				Thread.sleep(10000);
				waitForVisibilityOf(By.xpath(ReceiptClose));
				driver.findElement(By.xpath(ReceiptClose));
				highlightElement(By.xpath(ReceiptClose));
				clickUsingJavaScript(By.xpath(ReceiptClose));
				
				Thread.sleep(5000);			
				waitForVisibilityOf(By.xpath(QuickRx));
				driver.findElement(By.xpath(QuickRx));
				highlightElement(By.xpath(QuickRx));
				clickUsingJavaScript(By.xpath(QuickRx));
				
				Thread.sleep(5000);
				
				waitForVisibilityOf(By.xpath(ViewLastPrescription));
				driver.findElement(By.xpath(ViewLastPrescription));
				highlightElement(By.xpath(ViewLastPrescription));
				clickUsingJavaScript(By.xpath(ViewLastPrescription));
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


					 
	


