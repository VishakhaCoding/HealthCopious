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

public class AddNewPrescription {
	public static WebDriver driver;

	public static String doctorLoginLink = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
	public static String mobileNumber = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String createPatient = "createPatient";
	public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
	public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
	public static String clickPatient = "li.clearfix";
	public static String AddNewPrescription = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[1]/img";
	public static String ClearCompalaint = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[2]/app-prescription-live-preview/div/div/div[1]/div[2]/label[2]/span[2]";
	public static String clearOnExamination = "";
	public static String ClearWorkingDiagnosis = "";
	public static String DeleteMedicine = "";
	public static String DeletePopularMedicine = "";
	public static String DeleteFavouriteMedicine = "";
	public static String ChiefComplaints = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div/div/div[8]/app-cutom-card/div";
	public static String ComplaintDetails = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[1]";
	public static String MoreSymptoms = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[3]/div/div/div[8]";
	public static String VitalsOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[2]";
	public static String VitalsButton = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]";
	public static String weight = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String BP = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[2]/div/mat-form-field/div/div[1]/div[3]/input";
	public static String vitals = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]";
	public static String vitalWeihgt = "mat-input-0";
	public static String vitalHeihgt = "mat-input-1";
	public static String headCircumferance = "mat-input-17";
	public static String CC = "mat-input-18";
	public static String temperature = "mat-input-2";
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
	public static String Diagnosis = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[4]/div/div/div/div[2]/div[1]/div/div/div[2]/app-cutom-card/div";
	public static String Medicine = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[5]";
	public static String medicineSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/input";
	public static String Dolocare = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/ngb-typeahead-window/button[1]/ngb-highlight[1]";
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
	public static String Instruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[4]/div/app-language-select-textbox/div/input";
	public static String AddNewDrug = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div";
	public static String MedDrugType = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/mat-form-field/div/div[1]/div/mat-select";
	public static String Capsule = "/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span";
	public static String MedDrugUnit = "mat-select-value-15";
	public static String Medml = "mat-option-50";
	public static String MedWhenToTake = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[3]/div[2]/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]";
	public static String MedAfterFood = "/html/body/div[4]/div[2]/div/div/div/mat-option[3]/span";
	public static String MedDuration = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[3]/div[2]/mat-form-field[3]/div/div[1]/div/mat-select/div/div[1]";
	public static String MedTwoDays = "/html/body/div[4]/div[2]/div/div/div/mat-option[3]/span";
	public static String MedDrugDose = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[3]/div[1]/div[1]/div[1]/input";
	public static String Footer = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]";
	public static String PopularOption = "//div[text()=' Popular ']";
	public static String PopularSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[1]/input";
	public static String PopularMedicineClick = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[3]/div[1]/div/img";
	public static String FavouriteOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[1]/div/div[2]/div[3]";
	public static String FavouriteSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/input";
	public static String FavouriteClick = "mat-option-136";
	public static String FavouriteClickMedicine = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[2]/div/div/img";
	public static String previousOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[1]/div/div[2]/div[4]";
	public static String previousSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span";
	public static String previousResultClick = "/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span/div/div";
	public static String previousMedicineClick = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[2]/div/div/img";
	public static String previousViewPDF = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[2]";
	public static String DietaryAdviceOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[6]";
	public static String DietarySearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[1]/div[3]/div/app-language-select-textbox/div/input";
	public static String DietaryLanguage = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[1]/div[3]/div/app-language-select-textbox/div/div/div/mat-form-field/div/div[1]/div/mat-select/div/div[1]";
	public static String DietaryLanguageMarathi = "/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span";
	public static String DietaryAdd = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[2]/div[1]/div/div/div[4]/app-cutom-card";
	public static String DietaryAdvice = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[2]/div[1]/div/div/div[1]/app-cutom-card/div";
	public static String GeneralInstruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[7]/div[1]";
	public static String GenInstruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[2]/div[1]/div/div/div[1]/app-cutom-card/div";
	public static String InstructionLanguage = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[1]/div[3]/div/app-language-select-textbox/div/div/div/mat-form-field";
	public static String InstructionLanguageMarathi = "/html/body/div[5]/div[2]/div/div/div/mat-option[2]/span";
	public static String InstructionSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[1]/div[3]/div/app-language-select-textbox/div/input";
	public static String InstructionAdd = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[1]/div[3]/div/div/button";
	public static String prescriptionSave = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[1]/div[1]";
	public static String prescriptionProceed = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[1]/div[2]";
	public static String InstructionImpNote = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[2]/app-prescription-live-preview/div/div/mat-chip-list/div/mat-chip[2]";
	public static String FollowupTypes = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[1]/div[2]/div[1]/mat-form-field[2]/div/div[1]/div/mat-select/div";
	public static String Appointment = "//*[text()=' Call ']";
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
	public static String ConfirmandPrint = "//*[text()='Confirm and Print']";
	public static String prescriptionDone = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-prescriptionpreview/div[1]/div/div[3]/div";
	public static String ChoosePharmacy = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/mat-form-field/div/div[1]/div/mat-select/div/div[1]";
	public static String TestPharmacy = "/html/body/div[4]/div[4]/div/div/div/mat-option[1]/span";
	public static String ShareWhatsapp = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div[2]/div[1]";
	public static String ShareEmail = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div[2]/div[2]";
	public static String ShareInHealthapp = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div[5]/div[2]/div";
	public static String GoHome = "//*[text()='Go Home']";
	public static String Medpageinstruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[4]/div/app-language-select-textbox/div/input";
	public static String Doctor = "/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/div[3]/div";
	public static String nextFollowupDate = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div/div[1]/div[2]/mat-datepicker-toggle/button/span[1]";
	public static String nextFollowupSelectDate = "/html/body/div[4]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[4]/div[1]";
	public static String SPO2 = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[6]/div/mat-form-field/div/div[1]/div[3]/input";
	public static String OTP1 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]";
	public static String OTP2 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]";
	public static String OTP3 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]";
	public static String OTP4 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	public static String OTP5 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	public static String OTP6 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]";

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
		driver.manage().window().maximize();
		//driver.get("http://stage.copious.care:4200/");
		// driver.get("https://stage.copious.care/");
		 driver.get("https://opd.copious.care/");
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
	public void searchBar() {
		waitForVisibilityOf(By.xpath(searchBar));
		driver.findElement(By.xpath(searchBar)).sendKeys("confirm");
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

	@Test(priority = 6)
	public void AddPrescription() throws InterruptedException {

		waitForVisibilityOf(By.xpath(AddNewPrescription));
		driver.findElement(By.xpath(AddNewPrescription));
		highlightElement(By.xpath(AddNewPrescription));
		clickUsingJavaScript(By.xpath(AddNewPrescription));
		// Thread.sleep(10000);

		
		 
	}

	@Test(priority = 7)
	public void Complaints() throws InterruptedException {

		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		waitForVisibilityOf(By.xpath(ChiefComplaints));
		driver.findElement(By.xpath(ChiefComplaints));
		highlightElement(By.xpath(ChiefComplaints));
		clickUsingJavaScript(By.xpath(ChiefComplaints));

		waitForVisibilityOf(By.xpath(ComplaintDetails));
		driver.findElement(By.xpath(ComplaintDetails));
		highlightElement(By.xpath(ComplaintDetails));
		clickUsingJavaScript(By.xpath(ComplaintDetails));

		waitForVisibilityOf(By.xpath(MoreSymptoms));
		driver.findElement(By.xpath(MoreSymptoms));
		highlightElement(By.xpath(MoreSymptoms));
		clickUsingJavaScript(By.xpath(MoreSymptoms));

	}

	
	  @Test(priority = 8) public void VitalsOption() throws InterruptedException {
	  
	  Thread.sleep(3000); //driver.manage().window().fullscreen();
	  waitForVisibilityOf(By.xpath(VitalsOption));
	  driver.findElement(By.xpath(VitalsOption));
	  highlightElement(By.xpath(VitalsOption));
	  clickUsingJavaScript(By.xpath(VitalsOption));
	  
	  waitForVisibilityOf(By.xpath(VitalsButton));
	  driver.findElement(By.xpath(VitalsButton));
	  highlightElement(By.xpath(VitalsButton));
	  clickUsingJavaScript(By.xpath(VitalsButton));
	  
	  highlightElement(By.id(vitalWeihgt));
	  driver.findElement(By.id(vitalWeihgt)).clear();
	  driver.findElement(By.id(vitalWeihgt)).sendKeys("13");
	  
	  highlightElement(By.id(vitalHeihgt));
	  driver.findElement(By.id(vitalHeihgt)).clear();
	  driver.findElement(By.id(vitalHeihgt)).sendKeys("100");
	  
	  highlightElement(By.id(headCircumferance));
	  driver.findElement(By.id(headCircumferance)).clear();
	  driver.findElement(By.id(headCircumferance)).sendKeys("5");
	  
	  highlightElement(By.id(CC)); driver.findElement(By.id(CC)).clear();
	  driver.findElement(By.id(CC)).sendKeys("97");
	  
	  highlightElement(By.id(temperature));
	  driver.findElement(By.id(temperature)).clear();
	  driver.findElement(By.id(temperature)).sendKeys("77");
	  
	  highlightElement(By.xpath(SPO2)); driver.findElement(By.xpath(SPO2)).clear();
	  driver.findElement(By.xpath(SPO2)).sendKeys("10");
	  
	  }
	  
	  @Test(priority = 9) public void BpandHeartOption() throws
	  InterruptedException {
	  
	  Thread.sleep(15000); waitForVisibilityOf(By.id(BpAndHeart));
	  driver.findElement(By.id(BpAndHeart)); highlightElement(By.id(BpAndHeart));
	  clickUsingJavaScript(By.id(BpAndHeart));
	  
	  highlightElement(By.id(BPSys)); driver.findElement(By.id(BPSys)).clear();
	  driver.findElement(By.id(BPSys)).sendKeys("80");
	  
	  highlightElement(By.id(BPDia)); driver.findElement(By.id(BPDia)).clear();
	  driver.findElement(By.id(BPDia)).sendKeys("100");
	  
	  highlightElement(By.id(heartRate));
	  driver.findElement(By.id(heartRate)).clear();
	  driver.findElement(By.id(heartRate)).sendKeys("75");
	  
	  highlightElement(By.id(pulse)); driver.findElement(By.id(pulse)).clear();
	  driver.findElement(By.id(pulse)).sendKeys("77");
	  
	  }
	  
	  @Test(priority = 10) public void BloodAndAnalysis() throws
	  InterruptedException {
	  
	  Thread.sleep(15000); waitForVisibilityOf(By.xpath(BloodAndAnalysis));
	  driver.findElement(By.xpath(BloodAndAnalysis));
	  highlightElement(By.xpath(BloodAndAnalysis));
	  clickUsingJavaScript(By.xpath(BloodAndAnalysis));
	  
	  highlightElement(By.xpath(Haemoglobin));
	  driver.findElement(By.xpath(Haemoglobin)).clear();
	  driver.findElement(By.xpath(Haemoglobin)).sendKeys("12");
	  
	  highlightElement(By.xpath(BloodSugarRandom));
	  driver.findElement(By.xpath(BloodSugarRandom)).clear();
	  driver.findElement(By.xpath(BloodSugarRandom)).sendKeys("110");
	  
	  highlightElement(By.xpath(BloodSugarF));
	  driver.findElement(By.xpath(BloodSugarF)).clear();
	  driver.findElement(By.xpath(BloodSugarF)).sendKeys("140");
	  
	  highlightElement(By.xpath(BloodSugarPP));
	  driver.findElement(By.xpath(BloodSugarPP)).clear();
	  driver.findElement(By.xpath(BloodSugarPP)).sendKeys("120");
	  
	  highlightElement(By.xpath(Blood));
	  driver.findElement(By.xpath(Blood)).clear();
	  driver.findElement(By.xpath(Blood)).sendKeys("10");
	  
	  }
	  
	  @Test(priority = 11) public void LipidProfile() throws InterruptedException {
	  
	  Thread.sleep(15000); waitForVisibilityOf(By.xpath(LipidProfile));
	  driver.findElement(By.xpath(LipidProfile));
	  highlightElement(By.xpath(LipidProfile));
	  clickUsingJavaScript(By.xpath(LipidProfile));
	  
	  highlightElement(By.xpath(CholestrerolHDL));
	  driver.findElement(By.xpath(CholestrerolHDL)).clear();
	  driver.findElement(By.xpath(CholestrerolHDL)).sendKeys("30");
	  
	  highlightElement(By.xpath(CholestrerolLDL));
	  driver.findElement(By.xpath(CholestrerolLDL)).clear();
	  driver.findElement(By.xpath(CholestrerolLDL)).sendKeys("40");
	  
	  highlightElement(By.xpath(totalCholesterol));
	  driver.findElement(By.xpath(totalCholesterol)).clear();
	  driver.findElement(By.xpath(totalCholesterol)).sendKeys("40");
	  
	  highlightElement(By.xpath(Triglycerides));
	  driver.findElement(By.xpath(Triglycerides)).clear();
	  driver.findElement(By.xpath(Triglycerides)).sendKeys("40");
	  
	  }
	  
	  @Test(priority = 12) public void OnExamination() throws InterruptedException
	  {
	  
	  Thread.sleep(15000); waitForVisibilityOf(By.xpath(OnExamination));
	  driver.findElement(By.xpath(OnExamination));
	  highlightElement(By.xpath(OnExamination));
	  clickUsingJavaScript(By.xpath(OnExamination));
	  
	  
	  
	  
	  driver.findElement(By.xpath(Examination));
	  highlightElement(By.xpath(Examination));
	  clickUsingJavaScript(By.xpath(Examination));
	  
	  }
	  
	  @Test(priority = 13) public void Diagnosis() throws InterruptedException {
	  
	  Thread.sleep(15000);
	  
	  waitForVisibilityOf(By.xpath(DiagnosisOption));
	  driver.findElement(By.xpath(DiagnosisOption)); //
	  highlightElement(By.xpath(DiagnosisOption));
	  clickUsingJavaScript(By.xpath(DiagnosisOption));
	  
	  
	  
	  
	  
	  driver.findElement(By.xpath(Diagnosis));
	  highlightElement(By.xpath(Diagnosis));
	  clickUsingJavaScript(By.xpath(Diagnosis));
	  
	  }
	  
	  
	  @Test(priority = 14) public void Medicine() {
	  waitForVisibilityOf(By.xpath(Medicine));
	  driver.findElement(By.xpath(Medicine)); highlightElement(By.xpath(Medicine));
	  clickUsingJavaScript(By.xpath(Medicine));
	  
	  
	  
	  
	  }
	  
	  
	  @Test(priority = 15) public void Medicine1() throws InterruptedException {
	  
	  Thread.sleep(15000); waitForVisibilityOf(By.xpath(Medicine));
	  driver.findElement(By.xpath(Medicine)); highlightElement(By.xpath(Medicine));
	  clickUsingJavaScript(By.xpath(Medicine));
	  
	  
	  waitForVisibilityOf(By.xpath(medicineSearch));
	  highlightElement(By.xpath(medicineSearch));
	  driver.findElement(By.xpath(medicineSearch)).sendKeys("dolo");
	  waitForVisibilityOf(By.xpath(Dolocare));
	  highlightElement(By.xpath(Dolocare));
	  clickUsingJavaScript(By.xpath(Dolocare));
	  
	  
		
	  
	  waitForVisibilityOf(By.xpath(Instruction));
	  highlightElement(By.xpath(Instruction));
	  driver.findElement(By.xpath(Instruction)).sendKeys("Drink water");
	  clickUsingJavaScript(By.xpath(Instruction));
	  
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
	  driver.findElement(By.xpath(PopularSearch)).sendKeys("new");
	  
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
	  driver.findElement(By.xpath(FavouriteSearch)).sendKeys("test");
	  
	  waitForVisibilityOf(By.id(FavouriteClick));
	  highlightElement(By.id(FavouriteClick));
	  driver.findElement(By.id(FavouriteClick));
	  clickUsingJavaScript(By.id(FavouriteClick));
	  
	  waitForVisibilityOf(By.xpath(FavouriteClickMedicine));
	  highlightElement(By.xpath(FavouriteClickMedicine));
	  driver.findElement(By.xpath(FavouriteClickMedicine));
	  clickUsingJavaScript(By.xpath(FavouriteClickMedicine));
	  
		
	  }
	  
	  @Test(priority = 16) public void DietaryAdvice() throws InterruptedException
	  {
	  
	  Thread.sleep(15000);
	  
	  waitForVisibilityOf(By.xpath(DietaryAdviceOption));
	  driver.findElement(By.xpath(DietaryAdviceOption));
	  highlightElement(By.xpath(DietaryAdviceOption));
	  clickUsingJavaScript(By.xpath(DietaryAdviceOption));
	  
	  
	  waitForVisibilityOf(By.xpath(DietaryAdd));
	  driver.findElement(By.xpath(DietaryAdd));
	  highlightElement(By.xpath(DietaryAdd));
	  clickUsingJavaScript(By.xpath(DietaryAdd));
	  
	  }
	  
	  @Test(priority = 17) public void GeneralInstruction() throws
	  InterruptedException {
	  
	  Thread.sleep(15000);
	  
	  
	  
	  waitForVisibilityOf(By.xpath(GeneralInstruction));
	  driver.findElement(By.xpath(GeneralInstruction));
	  highlightElement(By.xpath(GeneralInstruction));
	  clickUsingJavaScript(By.xpath(GeneralInstruction));
	  
	  
	  waitForVisibilityOf(By.xpath(InstructionAdd));
	  driver.findElement(By.xpath(InstructionAdd));
	  highlightElement(By.xpath(InstructionAdd));
	  clickUsingJavaScript(By.xpath(InstructionAdd));
	  
	  waitForVisibilityOf(By.xpath(InstructionImpNote));
	  driver.findElement(By.xpath(InstructionImpNote));
	  highlightElement(By.xpath(InstructionImpNote));
	  clickUsingJavaScript(By.xpath(InstructionImpNote));
	  
	  }
	 
	@Test(priority = 18)
	public void SaveandProceed() throws InterruptedException {
		/*
		 * waitForVisibilityOf(By.xpath(prescriptionSave));
		 * driver.findElement(By.xpath(prescriptionSave));
		 * highlightElement(By.xpath(prescriptionSave));
		 * clickUsingJavaScript(By.xpath(prescriptionSave));
		 */

		waitForVisibilityOf(By.xpath(prescriptionProceed));
		driver.findElement(By.xpath(prescriptionProceed));
		highlightElement(By.xpath(prescriptionProceed));
		clickUsingJavaScript(By.xpath(prescriptionProceed));

	}

	@Test(priority = 19)
	public void ConfirmPrescription() throws InterruptedException {

		
		
		  waitForVisibilityOf(By.xpath(nextFollowupDate));
		  driver.findElement(By.xpath(nextFollowupDate));
		  highlightElement(By.xpath(nextFollowupDate));
		  clickUsingJavaScript(By.xpath(nextFollowupDate));
		  
		  waitForVisibilityOf(By.xpath(nextFollowupSelectDate));
		  driver.findElement(By.xpath(nextFollowupSelectDate));
		  highlightElement(By.xpath(nextFollowupSelectDate));
		  clickUsingJavaScript(By.xpath(nextFollowupSelectDate));
		 

		
		  waitForVisibilityOf(By.xpath(FollowupTypes));
		  driver.findElement(By.xpath(FollowupTypes));
		  highlightElement(By.xpath(FollowupTypes));
		  clickUsingJavaScript(By.xpath(FollowupTypes));
		  
		  waitForVisibilityOf(By.xpath(Appointment));
		  driver.findElement(By.xpath(Appointment));
		  highlightElement(By.xpath(Appointment));
		  clickUsingJavaScript(By.xpath(Appointment));
		 

		
		  waitForVisibilityOf(By.xpath(FollowupMessage));
		  driver.findElement(By.xpath(FollowupMessage));
		  highlightElement(By.xpath(FollowupMessage));
		  clickUsingJavaScript(By.xpath(FollowupMessage));
		 

		

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(ConfirmandPrint));
		driver.findElement(By.xpath(ConfirmandPrint));
		highlightElement(By.xpath(ConfirmandPrint));
		clickUsingJavaScript(By.xpath(ConfirmandPrint));

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
