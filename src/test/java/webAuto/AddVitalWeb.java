package webAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddVitalWeb {
	public static WebDriver driver;

	// public static String doctorLoginLink =
	// "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
	public static String mobileNumber = "input#phoneNumberId";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String QuickRx = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[1]";
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
	public static String SelectDate = "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[1]/td[2]/div[1]";
	public static String SelectMonth = "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[4]/div[1]";
	public static String ClickYearDropdown = "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]";
	public static String AddNewPrescription = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[1]/img";
	public static String ClearCompalaint = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[2]/app-prescription-live-preview/div/div/div[1]/div[2]/label[2]/span[2]";

	public static String ChiefComplaints = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div/div/div[8]/app-cutom-card/div";
	public static String ComplaintDetails = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[1]";
	public static String MoreSymptoms = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[3]/div/div/div[8]";
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
	public static String OnExamination = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[3]";
	public static String SearchExamination = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[3]/div/div/div/div[1]/div[2]/div/div/input";
	public static String ExaminationNew = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[3]/div/div/div/div[1]/div[2]/button";
	public static String Examination = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[4]/app-cutom-card/div";
	public static String DiagnosisOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[4]";
	public static String SearchDiagnosis = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[4]/div/div/div/div[1]/div[2]/div/div/input";
	public static String DiagnosisNew = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[4]/div/div/div/div[1]/div[2]/button";
	public static String Diagnosis = "//*[text()='NODULAR URTICARIA ']";
	public static String medicineSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/input";
	public static String Dolocare = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/ngb-typeahead-window/button[1]/ngb-highlight[1]";
	public static String MedAddtoList = "//div[text()='Add to List']";

	public static String Instruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[4]/div/app-language-select-textbox/div/input";
	public static String AddNewDrug = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div";

	public static String PopularOption = "//div[text()=' Popular ']";
	public static String PopularSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[1]/input";
	public static String PopularMedicineClick = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[3]/div[1]/div/img";
	public static String FavouriteOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[1]/div/div[2]/div[3]";
	public static String FavouriteSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/input";
	public static String FavouriteClick = "span.mat-option-text";
	public static String FavouriteClickMedicine = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[2]/div/div/img";

	public static String DietaryAdviceOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[6]";

	public static String DietaryAdd = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[2]/div[1]/div/div/div[4]/app-cutom-card/div/div";
	public static String DietaryAdvice = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[2]/div[1]/div/div/div[1]/app-cutom-card/div";
	public static String GeneralInstruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[7]/div[1]";
	public static String GenInstruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[2]/div[1]/div/div/div[1]/app-cutom-card/div";

	public static String prescriptionSave = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[1]/div[1]";
	public static String prescriptionProceed = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[1]/div[2]";
	public static String InstructionImpNote = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[2]/app-prescription-live-preview/div/div/mat-chip-list/div/mat-chip[2]";
	public static String FollowupTypes = "//*[@class='ng-star-inserted']/ following::mat-select[5]";
	public static String Appointment = "//*[text()=' Call ']";
	public static String FollowupMessage = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[1]/div[2]/div[2]/mat-chip-list/div/mat-chip[2]";

	public static String ConfirmandPrint = "button.btn-confirm";
	public static String prescriptionDone = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-prescriptionpreview/div[1]/div/div[3]/div";
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
	public static String nextFollowupSelectDate = "div.mat-calendar-body-cell-content.mat-focus-indicator";
	// public static String SPO2 =
	// "input.mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-11";

	public static String ClickHome = "//*[text()=' Home']";
	public static String clickPatient = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a[1]/li/a/div/div[2]/figure/img";
	public static String InstructionAdd = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[1]/div[3]/div/div/button";

	public static String AddNewAppointment = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[2]";
	public static String EnterTime = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[2]/div[2]/div[2]/div[1]/input";
	public static String SelectSlot = "/html/body/div[2]/div[4]/div/mat-dialog-container/div/div[2]/form[2]/div/div/div/div[39]/div";
	public static String BookAppointment = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[2]/button";

	public static String nextFollowupDate = "button.mat-focus-indicator.mat-icon-button";

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
	public static String AdvitalWeihgt = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String AdvitalHeihgt = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String AdheadCircumferance = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[3]/div[2]/mat-form-field/div/div[1]/div[3]/input";

	public static String AdBpAndHeart = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]";
	public static String AdBPSys = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[1]/mat-form-field/div/div[1]/div[3]/input";
	public static String AdBPDia = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String AdheartRate = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[3]/mat-form-field/div/div[1]/div[3]/input";
	public static String Adpulse = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[4]/mat-form-field/div/div[1]/div[3]/input";
	public static String AdBloodAndAnalysis = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[3]/div";
	public static String AdHaemoglobin = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[1]/mat-form-field/div/div[1]/div[3]/input";
	public static String AdBloodSugarRandom = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String AdBloodSugarF = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[3]/mat-form-field/div/div[1]/div[3]/input";
	public static String AdBloodSugarPP = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[4]/mat-form-field/div/div[1]/div[3]/input";
	public static String AdBlood = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[5]/mat-form-field/div/div[1]/div[3]/input";
	public static String AdLipidProfile = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[4]";
	public static String AdCholestrerolHDL = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[1]/mat-form-field/div/div[1]/div[3]/input";
	public static String AdCholestrerolLDL = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String AdtotalCholesterol = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[3]/mat-form-field/div/div[1]/div[3]/input";
	public static String AdTriglycerides = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[4]/mat-form-field/div/div[1]/div[3]/input";
	
	public static String AdRxCC = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[4]/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String Adtemperature = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[5]/div/mat-form-field/div/div[1]/div[3]/input";
	public static String AdSPO2 = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[6]/div/mat-form-field/div/div[1]/div[3]/input";
	public static String ClickAddVitals="//*[text()='Add Vitals']";
	public static String clickEditProfile="//*[text()='Edit ']";
	public static String VitSave="//*[text()=' save ']";
	
	
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

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 //driver.get("http://stage.copious.care:4200/");
		// driver.manage().window().fullscreen();
		//driver.get("https://opd.copious.care/");
		driver.get("https://app.copious.care/");
		//driver.get("https://stage.copious.care/");
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

	@Test(priority = 4, groups = "Regression")
	public void createPatient() {
		waitForVisibilityOf(By.id(createPatient));
		highlightElement(By.id(createPatient));
		clickUsingJavaScript(By.id(createPatient));
		driver.findElement(By.id(createPatient));
	}

	@Test(priority = 5, groups = "Regression")
	public void Number1() {
		waitForVisibilityOf(By.xpath(Number1));
		driver.findElement(By.xpath(Number1)).sendKeys("1234567891");
		highlightElement(By.xpath(Number1));
		clickUsingJavaScript(By.xpath(Number1));
	}

	@Test(priority = 6, groups = "Regression")
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

	@Test(priority = 7, groups = "Regression")
	public void number2() {
		waitForVisibilityOf(By.xpath(number2));
		driver.findElement(By.xpath(number2)).sendKeys("1234567888");
		highlightElement(By.xpath(number2));
		clickUsingJavaScript(By.xpath(number2));
	}

	@Test(priority = 8, groups = "Regression")
	public void firstName() {
		waitForVisibilityOf(By.xpath(firstName));
		driver.findElement(By.xpath(firstName)).sendKeys("Vital81Webopdtest");
		;
		highlightElement(By.xpath(firstName));
		clickUsingJavaScript(By.xpath(firstName));
	}

	@Test(priority = 9, groups = "Regression")
	public void middleName() {
		waitForVisibilityOf(By.xpath(middleName));
		driver.findElement(By.xpath(middleName)).sendKeys("Auto");
		highlightElement(By.xpath(middleName));
		clickUsingJavaScript(By.xpath(middleName));
	}

	@Test(priority = 10, groups = "Regression")
	public void lastName() {
		waitForVisibilityOf(By.xpath(lastName));
		driver.findElement(By.xpath(lastName)).sendKeys("TEST");
		highlightElement(By.xpath(lastName));
		clickUsingJavaScript(By.xpath(lastName));
	}

	@Test(priority = 11, groups = "Regression")
	public void birthDate() throws InterruptedException {

		waitForVisibilityOf(By.xpath(birthDate));
		highlightElement(By.xpath(birthDate));
		driver.findElement(By.xpath(birthDate));
		clickUsingJavaScript(By.xpath(birthDate));

		waitForVisibilityOf(By.xpath(SelectDate));
		highlightElement(By.xpath(SelectDate));
		driver.findElement(By.xpath(SelectDate));
		clickUsingJavaScript(By.xpath(SelectDate));
	}

	@Test(priority = 12, groups = "Regression")
	public void genFemale() {
		waitForVisibilityOf(By.xpath(genFemale));
		driver.findElement(By.xpath(genFemale));
		highlightElement(By.xpath(genFemale));
		clickUsingJavaScript(By.xpath(genFemale));
	}

	@Test(priority = 13, groups = "Regression")
	public void address() {
		waitForVisibilityOf(By.xpath(address));
		driver.findElement(By.xpath(address)).sendKeys("Address");
		highlightElement(By.xpath(address));
		clickUsingJavaScript(By.xpath(address));
	}

	@Test(priority = 14, groups = "Regression")
	public void locality() {
		waitForVisibilityOf(By.xpath(locality));
		driver.findElement(By.xpath(locality)).sendKeys("locality");
		highlightElement(By.xpath(locality));
		clickUsingJavaScript(By.xpath(locality));
	}

	@Test(priority = 15, groups = "Regression")
	public void city() {
		waitForVisibilityOf(By.xpath(city));
		driver.findElement(By.xpath(city)).sendKeys("City");
		highlightElement(By.xpath(city));
		clickUsingJavaScript(By.xpath(city));
	}

	@Test(priority = 16, groups = "Regression")
	public void pinCode() {
		waitForVisibilityOf(By.xpath(pinCode));
		driver.findElement(By.xpath(pinCode)).sendKeys("412306");
		highlightElement(By.xpath(pinCode));
		clickUsingJavaScript(By.xpath(pinCode));

	}

	@Test(priority = 17, groups = "Regression")
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

	@Test(priority = 18, groups = "Regression")
	public void nextButton() throws InterruptedException {
		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(Next));
		driver.findElement(By.xpath(Next));
		highlightElement(By.xpath(Next));
		clickUsingJavaScript(By.xpath(Next));

	}

	@Test(priority = 19, groups = "Regression")
	public void clickClose() {
		waitForVisibilityOf(By.xpath(clickContinue));
		highlightElement(By.xpath(clickContinue));
		clickUsingJavaScript(By.xpath(clickContinue));

	}

	@Test(priority = 20)
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

	@Test(priority = 21)
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
		driver.findElement(By.xpath(recurringComplaints)).sendKeys("None");

		highlightElement(By.xpath(hospitalization));
		driver.findElement(By.xpath(hospitalization)).sendKeys("None");

		highlightElement(By.xpath(healthHistory));
		driver.findElement(By.xpath(healthHistory)).sendKeys("None");

		highlightElement(By.xpath(emailID));
		driver.findElement(By.xpath(emailID)).sendKeys("vishu@123testtest.com");

		highlightElement(By.xpath(UHID));
		driver.findElement(By.xpath(UHID)).sendKeys("None");

		highlightElement(By.xpath(AnyGeneticDisorder));
		driver.findElement(By.xpath(AnyGeneticDisorder)).sendKeys("Dementia");
		;

		highlightElement(By.xpath(healthNext));
		driver.findElement(By.xpath(healthNext));
		clickUsingJavaScript(By.xpath(healthNext));

		// highlightElement(By.xpath(familyProfile)); //
		driver.findElement(By.xpath(familyProfile));

	}

	@Test(priority = 22)
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

	@Test(priority = 23)
	public void GoHome() throws InterruptedException {
		waitForVisibilityOf(By.xpath(ClickHome));
		driver.findElement(By.xpath(ClickHome));
		highlightElement(By.xpath(ClickHome));
		clickUsingJavaScript(By.xpath(ClickHome));

	}
	@Test(priority = 24, groups = "Regression")
	public void searchBar2() throws InterruptedException {
		Thread.sleep(15000);

		waitForVisibilityOf(By.xpath(clickPatient));
		driver.findElement(By.xpath(clickPatient));
		highlightElement(By.xpath(clickPatient));
		clickUsingJavaScript(By.xpath(clickPatient));
		
		  waitForVisibilityOf(By.xpath(clickEditProfile));
		  driver.findElement(By.xpath(clickEditProfile));
		  highlightElement(By.xpath(clickEditProfile));
		  clickUsingJavaScript(By.xpath(clickEditProfile));
		  
		  waitForVisibilityOf(By.xpath(Next));
		  driver.findElement(By.xpath(Next));
		  	highlightElement(By.xpath(Next));
			clickUsingJavaScript(By.xpath(Next));
			
			waitForVisibilityOf(By.xpath(antentalNext1));
			driver.findElement(By.xpath(antentalNext1));
			highlightElement(By.xpath(antentalNext1));
		    clickUsingJavaScript(By.xpath(antentalNext1));
		    
		    highlightElement(By.xpath(healthNext));
		  	driver.findElement(By.xpath(healthNext));
		  	clickUsingJavaScript(By.xpath(healthNext));
		  	
		  	highlightElement(By.xpath(familyNext));
			driver.findElement(By.xpath(familyNext));
			clickUsingJavaScript(By.xpath(familyNext));
			
			highlightElement(By.xpath(ClickAddVitals));
			driver.findElement(By.xpath(ClickAddVitals));
			clickUsingJavaScript(By.xpath(ClickAddVitals));
		  
	}
	
	@Test(priority = 25)
	public void AdVitals() throws InterruptedException {

		Thread.sleep(10000); // driver.manage().window().fullscreen();
	

		highlightElement(By.xpath(AdvitalWeihgt));
		driver.findElement(By.xpath(AdvitalWeihgt)).clear();
		driver.findElement(By.xpath(AdvitalWeihgt)).sendKeys("13.5");

		highlightElement(By.xpath(AdvitalHeihgt));
		driver.findElement(By.xpath(AdvitalHeihgt)).clear();
		driver.findElement(By.xpath(AdvitalHeihgt)).sendKeys("100");

		highlightElement(By.xpath(AdheadCircumferance));
		driver.findElement(By.xpath(AdheadCircumferance)).clear();
		driver.findElement(By.xpath(AdheadCircumferance)).sendKeys("5");

		highlightElement(By.xpath(AdRxCC));
		driver.findElement(By.xpath(AdRxCC)).clear();
		driver.findElement(By.xpath(AdRxCC)).sendKeys("97");

		highlightElement(By.xpath(Adtemperature));
		driver.findElement(By.xpath(Adtemperature)).clear();
		driver.findElement(By.xpath(Adtemperature)).sendKeys("77");

		highlightElement(By.xpath(AdSPO2));
		driver.findElement(By.xpath(AdSPO2)).clear();
		driver.findElement(By.xpath(AdSPO2)).sendKeys("10");

	}
	@Test(priority = 26)
	public void AdBpandHeartOption() throws InterruptedException {

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(AdBpAndHeart));
		driver.findElement(By.xpath(AdBpAndHeart));
		highlightElement(By.xpath(AdBpAndHeart));
		clickUsingJavaScript(By.xpath(AdBpAndHeart));

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

	}
	@Test(priority = 27)
	public void AdBloodAndAnalysis() throws InterruptedException {

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(AdBloodAndAnalysis));
		driver.findElement(By.xpath(AdBloodAndAnalysis));
		highlightElement(By.xpath(AdBloodAndAnalysis));
		clickUsingJavaScript(By.xpath(AdBloodAndAnalysis));

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

		highlightElement(By.xpath(AdBlood));
		driver.findElement(By.xpath(AdBlood)).clear();
		driver.findElement(By.xpath(AdBlood)).sendKeys("10");

	}
	@Test(priority = 28)
	public void AdLipidProfile() throws InterruptedException {

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(AdLipidProfile));
		driver.findElement(By.xpath(AdLipidProfile));
		highlightElement(By.xpath(AdLipidProfile));
		clickUsingJavaScript(By.xpath(AdLipidProfile));

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
		
		waitForVisibilityOf(By.xpath(VitSave));
		driver.findElement(By.xpath(VitSave));
		highlightElement(By.xpath(VitSave));
		clickUsingJavaScript(By.xpath(VitSave));

		waitForVisibilityOf(By.xpath(ClickHome));
		driver.findElement(By.xpath(ClickHome));
		highlightElement(By.xpath(ClickHome));
		clickUsingJavaScript(By.xpath(ClickHome));

	}


}
