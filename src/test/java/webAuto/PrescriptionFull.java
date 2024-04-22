package webAuto;

import java.io.File;

import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;


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

public class PrescriptionFull {
	public static WebDriver driver;

	public static String doctorLoginLink = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
	public static String mobileNumber = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String createPatient = "createPatient";
	public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
	public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
	public static String clickPatient = "li.clearfix";
	public static String quickRx = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[1]";
	public static String chiefComplaint = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div/div/div[7]/app-cutom-card/div/img";
	public static String complaintDetails = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[6]";
	public static String moreSymptoms = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[3]/div/div/div[1]";
	public static String complainSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[1]/div[2]/div/input";
	public static String complainNew = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[1]/div[2]/button";
	public static String vitalsButton = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[2]/div[1]";
	public static String frequent = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]";
	public static String weight = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String BP = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[2]/div/mat-form-field/div/div[1]/div[3]/input";
	public static String vitals = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]";
	public static String vitalWeihgt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String vitalHeihgt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String headCircumferance = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[3]/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String CC = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[4]/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String temperature = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[5]/div/mat-form-field/div/div[1]/div[3]/input";
	public static String BpAndHeart = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]";
	public static String BPSys = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[1]/mat-form-field/div/div[1]/div[3]/input";
	public static String BPDia = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
	public static String heartRate = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[3]/mat-form-field/div/div[1]/div[3]/input";
	public static String pulse = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[2]/div/div/div/div[4]/mat-form-field/div/div[1]/div[3]/input";
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

		System.setProperty("webdriver.chrome.driver",
				"C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://stage.copious.care:4200/");
		// driver.get("https://opd.copious.care/");
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
	}

	@Test(priority = 3)
	public void verifyButton() throws InterruptedException {
		Thread.sleep(30000);
		waitForVisibilityOf(By.xpath(verifyOTP));
		driver.findElement(By.xpath(verifyOTP));
		highlightElement(By.xpath(verifyOTP));
		clickUsingJavaScript(By.xpath(verifyOTP));
	}

	@Test(priority = 4)
	public void searchBar() {
		waitForVisibilityOf(By.xpath(searchBar));
		driver.findElement(By.xpath(searchBar)).sendKeys("pinky");
		
		// driver.findElement(By.xpath(searchBar)).sendKeys("pres");
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
	public void clickPatient() throws InterruptedException {
		Thread.sleep(10000);

		waitForVisibilityOf(By.cssSelector(clickPatient));
		driver.findElement(By.cssSelector(clickPatient));
		// textbox.sendKeys(Keys.ENTER);
		highlightElement(By.cssSelector(clickPatient));
		clickUsingJavaScript(By.cssSelector(clickPatient));
	}

	@Test(priority = 7)
	public void quickRx() throws InterruptedException {
		waitForVisibilityOf(By.xpath(quickRx));
		driver.findElement(By.xpath(quickRx));
		// textbox.sendKeys(Keys.ENTER);
		highlightElement(By.xpath(quickRx));
		clickUsingJavaScript(By.xpath(quickRx));
	}

	@Test(priority = 8)
	public void chiefComplaint() throws InterruptedException {
		waitForVisibilityOf(By.xpath(chiefComplaint));
		driver.findElement(By.xpath(chiefComplaint));
		// textbox.sendKeys(Keys.ENTER);
		highlightElement(By.xpath(chiefComplaint));
		clickUsingJavaScript(By.xpath(chiefComplaint));
	}

	@Test(priority = 9)
	public void complaintDetails() throws InterruptedException {
		waitForVisibilityOf(By.xpath(complaintDetails));
		driver.findElement(By.xpath(complaintDetails)); //
		highlightElement(By.xpath(complaintDetails));
		clickUsingJavaScript(By.xpath(complaintDetails));
	}
	
	  @Test(priority = 9) public void moreSymptoms() throws InterruptedException {
	  waitForVisibilityOf(By.xpath(moreSymptoms));
	  driver.findElement(By.xpath(moreSymptoms));
	  highlightElement(By.xpath(moreSymptoms));
	  clickUsingJavaScript(By.xpath(moreSymptoms)); }
	  
	  @Test(priority = 10) public void complainSearch() throws InterruptedException
	  { waitForVisibilityOf(By.xpath(complainSearch));
	  driver.findElement(By.xpath(complainSearch)).sendKeys("headache"); //
	  highlightElement(By.xpath(complainSearch));
	  clickUsingJavaScript(By.xpath(complainSearch)); }
	  
	  @Test(priority = 11) public void complainNew() throws InterruptedException {
	  waitForVisibilityOf(By.xpath(complainNew));
	  driver.findElement(By.xpath(complainNew));
	  highlightElement(By.xpath(complainNew));
	  clickUsingJavaScript(By.xpath(complainNew)); }
	  
	  @Test(priority = 12) public void vitalsButton() throws InterruptedException {
	  waitForVisibilityOf(By.xpath(vitalsButton));
	  driver.findElement(By.xpath(vitalsButton));
	  highlightElement(By.xpath(vitalsButton));
	  clickUsingJavaScript(By.xpath(vitalsButton)); }
	  
	  
	  
	  @Test(priority = 13) public void frequent() {
	  
	  waitForVisibilityOf(By.xpath(frequent));
	  driver.findElement(By.xpath(frequent)); highlightElement(By.xpath(frequent));
	  clickUsingJavaScript(By.xpath(frequent));
	  
	  highlightElement(By.xpath(weight));
	  driver.findElement(By.xpath(weight)).sendKeys("10");
	  
	  highlightElement(By.xpath(BP));
	  driver.findElement(By.xpath(BP)).sendKeys("100"); }
	  
	  
	  
	  @Test(priority = 13) public void vitalsOption() throws InterruptedException {
	  
	  waitForVisibilityOf(By.xpath(vitals)); driver.findElement(By.xpath(vitals));
	  highlightElement(By.xpath(vitals)); clickUsingJavaScript(By.xpath(vitals));
	  
	  Thread.sleep(10000); highlightElement(By.xpath(vitalWeihgt));
	  driver.findElement(By.xpath(vitalWeihgt)).sendKeys("10");
	  
	  highlightElement(By.xpath(vitalHeihgt));
	  driver.findElement(By.xpath(vitalHeihgt)).sendKeys("10");
	  
	  highlightElement(By.xpath(headCircumferance));
	  driver.findElement(By.xpath(headCircumferance)).sendKeys("10");
	  
	  highlightElement(By.xpath(CC));
	  driver.findElement(By.xpath(CC)).sendKeys("10");
	  
	  highlightElement(By.xpath(temperature));
	  driver.findElement(By.xpath(temperature)).sendKeys("10"); }
	  
	  @Test(priority = 14) public void BpandHeartOption() throws
	  InterruptedException { Thread.sleep(10000);
	  waitForVisibilityOf(By.xpath(BpAndHeart));
	  driver.findElement(By.xpath(BpAndHeart));
	  highlightElement(By.xpath(BpAndHeart));
	  clickUsingJavaScript(By.xpath(BpAndHeart));
	  
	  highlightElement(By.xpath(BPSys));
	  driver.findElement(By.xpath(BPSys)).sendKeys("10");
	  
	  highlightElement(By.xpath(BPDia));
	  driver.findElement(By.xpath(BPDia)).sendKeys("10");
	  
	  highlightElement(By.xpath(heartRate));
	  driver.findElement(By.xpath(heartRate)).sendKeys("10");
	  
	  highlightElement(By.xpath(pulse));
	  driver.findElement(By.xpath(pulse)).sendKeys("10");
	  
	  }
	  
	  @Test(priority = 15) public void BloodAndAnalysis() throws
	  InterruptedException { Thread.sleep(10000);
	  waitForVisibilityOf(By.xpath(BloodAndAnalysis));
	  driver.findElement(By.xpath(BloodAndAnalysis)); //
	  highlightElement(By.xpath(BloodAndAnalysis));
	  clickUsingJavaScript(By.xpath(BloodAndAnalysis));
	  
	  highlightElement(By.xpath(Haemoglobin));
	  driver.findElement(By.xpath(Haemoglobin)).sendKeys("10");
	  
	  highlightElement(By.xpath(BloodSugarRandom));
	  driver.findElement(By.xpath(BloodSugarRandom)).sendKeys("10");
	  
	  highlightElement(By.xpath(BloodSugarF));
	  driver.findElement(By.xpath(BloodSugarF)).sendKeys("10");
	  
	  highlightElement(By.xpath(BloodSugarPP));
	  driver.findElement(By.xpath(BloodSugarPP)).sendKeys("10");
	  
	  highlightElement(By.xpath(Blood));
	  driver.findElement(By.xpath(Blood)).sendKeys("10");
	  
	  }
	  
	  @Test(priority = 16) public void LipidProfile() throws InterruptedException {
	  Thread.sleep(10000); waitForVisibilityOf(By.xpath(LipidProfile));
	  driver.findElement(By.xpath(LipidProfile));
	  highlightElement(By.xpath(LipidProfile));
	  clickUsingJavaScript(By.xpath(LipidProfile));
	  
	  highlightElement(By.xpath(CholestrerolHDL));
	  driver.findElement(By.xpath(CholestrerolHDL)).sendKeys("10");
	  
	  highlightElement(By.xpath(CholestrerolLDL));
	  driver.findElement(By.xpath(CholestrerolLDL)).sendKeys("10");
	  
	  highlightElement(By.xpath(totalCholesterol));
	  driver.findElement(By.xpath(totalCholesterol)).sendKeys("10");
	  
	  highlightElement(By.xpath(Triglycerides));
	  driver.findElement(By.xpath(Triglycerides)).sendKeys("10");
	  
	  }
	  
	  @Test(priority = 17) public void OnExamination() {
	  waitForVisibilityOf(By.xpath(OnExamination));
	  driver.findElement(By.xpath(OnExamination));
	  highlightElement(By.xpath(OnExamination));
	  clickUsingJavaScript(By.xpath(OnExamination));
	  
	  highlightElement(By.xpath(SearchExamination));
	  driver.findElement(By.xpath(SearchExamination)).sendKeys("headache");
	  
	  driver.findElement(By.xpath(ExaminationNew)); //
	  highlightElement(By.xpath(ExaminationNew));
	  clickUsingJavaScript(By.xpath(ExaminationNew));
	  
	  driver.findElement(By.xpath(Examination));
	  highlightElement(By.xpath(Examination));
	  clickUsingJavaScript(By.xpath(Examination));
	  
	  }
	  
	  @Test(priority = 18) public void Diagnosis() {
	  waitForVisibilityOf(By.xpath(DiagnosisOption));
	  driver.findElement(By.xpath(DiagnosisOption)); //
	  highlightElement(By.xpath(DiagnosisOption));
	  clickUsingJavaScript(By.xpath(DiagnosisOption));
	  
	  highlightElement(By.xpath(SearchDiagnosis));
	  driver.findElement(By.xpath(SearchDiagnosis)).sendKeys("headache");
	  
	  driver.findElement(By.xpath(DiagnosisNew));
	  highlightElement(By.xpath(DiagnosisNew));
	  clickUsingJavaScript(By.xpath(DiagnosisNew));
	  
	  driver.findElement(By.xpath(Diagnosis));
	  highlightElement(By.xpath(Diagnosis));
	  clickUsingJavaScript(By.xpath(Diagnosis));
	  
	  }
	  
	  @Test(priority = 19) public void Medicine() {
	  waitForVisibilityOf(By.xpath(Medicine));
	  driver.findElement(By.xpath(Medicine)); // textbox.sendKeys(Keys.ENTER);
	  highlightElement(By.xpath(Medicine));
	  clickUsingJavaScript(By.xpath(Medicine));
	  
	  
	  driver.findElement(By.xpath(newDrug)); highlightElement(By.xpath(newDrug));
	  clickUsingJavaScript(By.xpath(newDrug));
	  
	  highlightElement(By.xpath(DrugName));
	  driver.findElement(By.xpath(DrugName)).sendKeys("testDrugName");
	  
	  highlightElement(By.xpath(DrugType));
	  driver.findElement(By.xpath(DrugType)).sendKeys(" Capsule ");
	  
	  highlightElement(By.xpath(GenericName));
	  driver.findElement(By.xpath(GenericName)).sendKeys(" GenericNames ");
	  
	  highlightElement(By.xpath(DrugCompany));
	  driver.findElement(By.xpath(DrugCompany)).sendKeys(" DrugCompany ");
	  
	  highlightElement(By.xpath(Unit));
	  driver.findElement(By.xpath(Unit)).sendKeys("1");
	  
	  
	  
	  highlightElement(By.xpath(Frequency));
	  driver.findElement(By.xpath(Frequency));
	  clickUsingJavaScript(By.xpath(Frequency)); highlightElement(By.xpath(Night));
	  driver.findElement(By.xpath(Night)); clickUsingJavaScript(By.xpath(Night));
	  
	  driver.findElement(By.xpath(Instruction));
	  clickUsingJavaScript(By.xpath(Instruction));
	  
	  highlightElement(By.xpath(Footer)); driver.findElement(By.xpath(Footer));
	  clickUsingJavaScript(By.xpath(Footer));
	  
	  
	  
	  
	  highlightElement(By.xpath(Frequency));
	  driver.findElement(By.xpath(Frequency));
	  clickUsingJavaScript(By.xpath(Frequency));
	  
	  
	  
	  highlightElement(By.xpath(Duration)); driver.findElement(By.xpath(Duration));
	  clickUsingJavaScript(By.xpath(Duration));
	  highlightElement(By.xpath(TwoDays)); driver.findElement(By.xpath(TwoDays));
	  clickUsingJavaScript(By.xpath(TwoDays)); highlightElement(By.xpath(Footer));
	  driver.findElement(By.xpath(Footer)); clickUsingJavaScript(By.xpath(Footer));
	  
	  
	  highlightElement(By.xpath(WhenToTake));
	  driver.findElement(By.xpath(WhenToTake));
	  clickUsingJavaScript(By.xpath(WhenToTake));
	  highlightElement(By.xpath(AfterFood));
	  driver.findElement(By.xpath(AfterFood));
	  clickUsingJavaScript(By.xpath(AfterFood));
	  highlightElement(By.xpath(Footer)); driver.findElement(By.xpath(Footer));
	  clickUsingJavaScript(By.xpath(Footer));
	  
	  highlightElement(By.xpath(Instruction));
	  driver.findElement(By.xpath(Instruction)).sendKeys("test instructions");
	  
	  
	  
	  highlightElement(By.xpath(AddNewDrug));
	  driver.findElement(By.xpath(AddNewDrug));
	  clickUsingJavaScript(By.xpath(AddNewDrug));
	  
	  
	  }
	 

	@Test(priority = 20)
	public void Medicine1() throws InterruptedException {
		

		
		  waitForVisibilityOf(By.xpath(Medicine));
		  driver.findElement(By.xpath(Medicine)); highlightElement(By.xpath(Medicine));
		  clickUsingJavaScript(By.xpath(Medicine));
		 

		waitForVisibilityOf(By.xpath(medicineSearch));
		highlightElement(By.xpath(medicineSearch));
		driver.findElement(By.xpath(medicineSearch)).sendKeys("dolo");
		waitForVisibilityOf(By.xpath(Dolocare));
		highlightElement(By.xpath(Dolocare));
		clickUsingJavaScript(By.xpath(Dolocare));

		highlightElement(By.xpath(MedDrugType));
		driver.findElement(By.xpath(MedDrugType));
		waitForVisibilityOf(By.xpath(Capsule));
		clickUsingJavaScript(By.xpath(Capsule));

		highlightElement(By.xpath(MedDrugDose));
		driver.findElement(By.xpath(MedDrugDose)).sendKeys("1 ");

		highlightElement(By.xpath(MedDrugUnit));
		driver.findElement(By.xpath(MedDrugUnit));
		highlightElement(By.xpath(Medml));
		driver.findElement(By.xpath(Medml));
		clickUsingJavaScript(By.xpath(Medml));

		highlightElement(By.xpath(MedWhenToTake));
		driver.findElement(By.xpath(MedWhenToTake));
		highlightElement(By.xpath(MedAfterFood));
		driver.findElement(By.xpath(MedAfterFood));
		clickUsingJavaScript(By.xpath(MedAfterFood));

		highlightElement(By.xpath(MedDuration));
		driver.findElement(By.xpath(MedDuration));
		highlightElement(By.xpath(MedTwoDays));
		driver.findElement(By.xpath(MedTwoDays));
		clickUsingJavaScript(By.xpath(MedTwoDays));

		/*
		 * waitForVisibilityOf(By.xpath(MedAddtoList));
		 * highlightElement(By.xpath(MedAddtoList));
		 * driver.findElement(By.xpath(MedAddtoList));
		 * clickUsingJavaScript(By.xpath(MedAddtoList));
		 */

		waitForVisibilityOf(By.xpath(PopularOption));
		highlightElement(By.xpath(PopularOption));
		driver.findElement(By.xpath(PopularOption));
		clickUsingJavaScript(By.xpath(PopularOption));

		waitForVisibilityOf(By.xpath(PopularSearch));
		highlightElement(By.xpath(PopularSearch));
		driver.findElement(By.xpath(PopularSearch)).sendKeys("test");

		waitForVisibilityOf(By.xpath(PopularMedicineClick));
		highlightElement(By.xpath(PopularMedicineClick));
		driver.findElement(By.xpath(PopularMedicineClick));
		clickUsingJavaScript(By.xpath(PopularMedicineClick));

		waitForVisibilityOf(By.xpath(FavouriteOption));
		highlightElement(By.xpath(FavouriteOption));
		driver.findElement(By.xpath(FavouriteOption));
		clickUsingJavaScript(By.xpath(FavouriteOption));

		waitForVisibilityOf(By.xpath(FavouriteSearch));
		highlightElement(By.xpath(FavouriteSearch));
		driver.findElement(By.xpath(FavouriteSearch)).sendKeys("test");

		waitForVisibilityOf(By.xpath(FavouriteClick));
		highlightElement(By.xpath(FavouriteClick));
		driver.findElement(By.xpath(FavouriteClick));
		clickUsingJavaScript(By.xpath(FavouriteClick));

		waitForVisibilityOf(By.xpath(FavouriteClickMedicine));
		highlightElement(By.xpath(FavouriteClickMedicine));
		driver.findElement(By.xpath(FavouriteClickMedicine));
		clickUsingJavaScript(By.xpath(FavouriteClickMedicine));

		waitForVisibilityOf(By.xpath(previousOption));
		highlightElement(By.xpath(previousOption));
		driver.findElement(By.xpath(previousOption));
		clickUsingJavaScript(By.xpath(previousOption));

		waitForVisibilityOf(By.xpath(previousSearch));
		highlightElement(By.xpath(previousSearch));
		driver.findElement(By.xpath(previousSearch));
		clickUsingJavaScript(By.xpath(previousSearch));

		waitForVisibilityOf(By.xpath(previousResultClick));
		highlightElement(By.xpath(previousResultClick));
		driver.findElement(By.xpath(previousResultClick));
		clickUsingJavaScript(By.xpath(previousResultClick));

		waitForVisibilityOf(By.xpath(previousMedicineClick));
		highlightElement(By.xpath(previousMedicineClick));
		driver.findElement(By.xpath(previousMedicineClick));
		clickUsingJavaScript(By.xpath(previousMedicineClick));

		waitForVisibilityOf(By.xpath(previousViewPDF));
		highlightElement(By.xpath(previousViewPDF));
		driver.findElement(By.xpath(previousViewPDF));
		clickUsingJavaScript(By.xpath(previousViewPDF));

	}

	@Test(priority = 21)
	public void DietaryAdvice() throws InterruptedException {

	
		waitForVisibilityOf(By.xpath(DietaryAdviceOption));
		driver.findElement(By.xpath(DietaryAdviceOption));
		highlightElement(By.xpath(DietaryAdviceOption));
		clickUsingJavaScript(By.xpath(DietaryAdviceOption));

		waitForVisibilityOf(By.xpath(DietaryAdvice));
		driver.findElement(By.xpath(DietaryAdvice));
		highlightElement(By.xpath(DietaryAdvice));
		clickUsingJavaScript(By.xpath(DietaryAdvice));

		waitForVisibilityOf(By.xpath(DietaryLanguage));
		driver.findElement(By.xpath(DietaryLanguage));
		highlightElement(By.xpath(DietaryLanguage));
		clickUsingJavaScript(By.xpath(DietaryLanguage));

		waitForVisibilityOf(By.xpath(DietaryLanguageMarathi));
		driver.findElement(By.xpath(DietaryLanguageMarathi));
		highlightElement(By.xpath(DietaryLanguageMarathi));
		clickUsingJavaScript(By.xpath(DietaryLanguageMarathi));

		waitForVisibilityOf(By.xpath(DietarySearch));
		highlightElement(By.xpath(DietarySearch));
		driver.findElement(By.xpath(DietarySearch)).sendKeys("test1");

		waitForVisibilityOf(By.xpath(DietaryAdvice));
		driver.findElement(By.xpath(DietaryAdvice));
		highlightElement(By.xpath(DietaryAdvice));
		clickUsingJavaScript(By.xpath(DietaryAdvice));

	}

	@Test(priority = 22)
	public void GeneralInstruction() throws InterruptedException {

		
		waitForVisibilityOf(By.xpath(GeneralInstruction));
		driver.findElement(By.xpath(GeneralInstruction));
		highlightElement(By.xpath(GeneralInstruction));
		clickUsingJavaScript(By.xpath(GeneralInstruction));

		waitForVisibilityOf(By.xpath(GenInstruction));
		driver.findElement(By.xpath(GenInstruction));
		highlightElement(By.xpath(GenInstruction));
		clickUsingJavaScript(By.xpath(GenInstruction));

		waitForVisibilityOf(By.xpath(InstructionLanguage));
		driver.findElement(By.xpath(InstructionLanguage));
		highlightElement(By.xpath(InstructionLanguage));
		clickUsingJavaScript(By.xpath(InstructionLanguage));

		waitForVisibilityOf(By.xpath(InstructionLanguageMarathi));
		driver.findElement(By.xpath(InstructionLanguageMarathi));
		highlightElement(By.xpath(InstructionLanguageMarathi));
		clickUsingJavaScript(By.xpath(InstructionLanguageMarathi));

		/*
		 * waitForVisibilityOf(By.cssSelector(InstructionSearch));
		 * highlightElement(By.cssSelector(InstructionSearch));
		 * driver.findElement(By.cssSelector(InstructionSearch)).sendKeys("test2");
		 */
		waitForVisibilityOf(By.xpath(InstructionAdd));
		driver.findElement(By.xpath(InstructionAdd));
		highlightElement(By.xpath(InstructionAdd));
		clickUsingJavaScript(By.xpath(InstructionAdd));

		waitForVisibilityOf(By.xpath(InstructionImpNote));
		driver.findElement(By.xpath(InstructionImpNote));
		highlightElement(By.xpath(InstructionImpNote));
		clickUsingJavaScript(By.xpath(InstructionImpNote));

	}

	@Test(priority = 23)
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

	@Test(priority = 24)
	public void ConfirmPrescription() throws InterruptedException {

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

		waitForVisibilityOf(By.xpath(CustomisePrescription));
		driver.findElement(By.xpath(CustomisePrescription));
		highlightElement(By.xpath(CustomisePrescription));
		clickUsingJavaScript(By.xpath(CustomisePrescription));

		waitForVisibilityOf(By.xpath(HeightDisable));
		driver.findElement(By.xpath(HeightDisable));
		highlightElement(By.xpath(HeightDisable));
		clickUsingJavaScript(By.xpath(HeightDisable));

		waitForVisibilityOf(By.xpath(CustomisePrescription));
		driver.findElement(By.xpath(CustomisePrescription));
		highlightElement(By.xpath(CustomisePrescription));
		clickUsingJavaScript(By.xpath(CustomisePrescription));

		waitForVisibilityOf(By.xpath(confirmPrescrFooter));
		driver.findElement(By.xpath(confirmPrescrFooter));
		highlightElement(By.xpath(confirmPrescrFooter));
		clickUsingJavaScript(By.xpath(confirmPrescrFooter));

		waitForVisibilityOf(By.xpath(SelectedFields));
		driver.findElement(By.xpath(SelectedFields));
		highlightElement(By.xpath(SelectedFields));
		clickUsingJavaScript(By.xpath(SelectedFields));

		waitForVisibilityOf(By.xpath(onExaminationDisable));
		driver.findElement(By.xpath(onExaminationDisable));
		highlightElement(By.xpath(onExaminationDisable));
		clickUsingJavaScript(By.xpath(onExaminationDisable));

		waitForVisibilityOf(By.xpath(confirmPrescrFooter));
		driver.findElement(By.xpath(confirmPrescrFooter));
		highlightElement(By.xpath(confirmPrescrFooter));
		clickUsingJavaScript(By.xpath(confirmPrescrFooter));

		waitForVisibilityOf(By.xpath(SpecialityLocation));
		driver.findElement(By.xpath(SpecialityLocation));
		highlightElement(By.xpath(SpecialityLocation));
		clickUsingJavaScript(By.xpath(SpecialityLocation));

		waitForVisibilityOf(By.xpath(AnkurV3));
		driver.findElement(By.xpath(AnkurV3));
		highlightElement(By.xpath(AnkurV3));
		clickUsingJavaScript(By.xpath(AnkurV3));

		waitForVisibilityOf(By.xpath(confirmPrescrFooter));
		driver.findElement(By.xpath(confirmPrescrFooter));
		highlightElement(By.xpath(confirmPrescrFooter));
		clickUsingJavaScript(By.xpath(confirmPrescrFooter));

		waitForVisibilityOf(By.xpath(RxLanguage));
		driver.findElement(By.xpath(RxLanguage));
		highlightElement(By.xpath(RxLanguage));
		clickUsingJavaScript(By.xpath(RxLanguage));

		waitForVisibilityOf(By.xpath(RxLanguageMarathi));
		driver.findElement(By.xpath(RxLanguageMarathi));
		highlightElement(By.xpath(RxLanguageMarathi));
		clickUsingJavaScript(By.xpath(RxLanguageMarathi));

		Thread.sleep(20000);
		waitForVisibilityOf(By.xpath(ConfirmandPrint));
		driver.findElement(By.xpath(ConfirmandPrint));
		highlightElement(By.xpath(ConfirmandPrint));
		clickUsingJavaScript(By.xpath(ConfirmandPrint));

		waitForVisibilityOf(By.xpath(prescriptionDone));
		driver.findElement(By.xpath(prescriptionDone));
		highlightElement(By.xpath(prescriptionDone));
		clickUsingJavaScript(By.xpath(prescriptionDone));

		waitForVisibilityOf(By.xpath(ChoosePharmacy));
		driver.findElement(By.xpath(ChoosePharmacy));
		highlightElement(By.xpath(ChoosePharmacy));
		clickUsingJavaScript(By.xpath(ChoosePharmacy));

		waitForVisibilityOf(By.xpath(TestPharmacy));
		driver.findElement(By.xpath(TestPharmacy));
		highlightElement(By.xpath(TestPharmacy));
		clickUsingJavaScript(By.xpath(TestPharmacy));

		waitForVisibilityOf(By.xpath(ShareWhatsapp));
		driver.findElement(By.xpath(ShareWhatsapp));
		highlightElement(By.xpath(ShareWhatsapp));
		clickUsingJavaScript(By.xpath(ShareWhatsapp));

		waitForVisibilityOf(By.xpath(ShareEmail));
		driver.findElement(By.xpath(ShareEmail));
		highlightElement(By.xpath(ShareEmail));
		clickUsingJavaScript(By.xpath(ShareEmail));

		waitForVisibilityOf(By.xpath(ShareInHealthapp));
		driver.findElement(By.xpath(ShareInHealthapp));
		highlightElement(By.xpath(ShareInHealthapp));
		clickUsingJavaScript(By.xpath(ShareInHealthapp));
		Thread.sleep(20000);
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