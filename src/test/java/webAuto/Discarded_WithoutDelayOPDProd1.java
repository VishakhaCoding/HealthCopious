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

public class Discarded_WithoutDelayOPDProd1 {
	public static WebDriver driver;

	public static String doctorLoginLink = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
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
	public static String proceedWithSameRMN = "//div[@class='quickrx']/following::div";
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
	public static String familyNext = "//*[@id='cdk-step-content-0-3']/div[2]/div[5]/button[2]";
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
	//public static String RxCC = ".mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-48";
	//public static String temperature = "input.mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-10";
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
	
	public static String DietaryAdd = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[2]/div[1]/div/div/div[4]/app-cutom-card";
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
	//public static String nextFollowupDate = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div/div[1]/div[2]/mat-datepicker-toggle/button/span[1]]";
	public static String nextFollowupSelectDate = "div.mat-calendar-body-cell-content.mat-focus-indicator";
	//public static String SPO2 = "input.mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-11";
	public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
	public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
	public static String ClickHome = "//*[text()=' Home']";
	public static String clickPatient = "li.clearfix";
	public static String InvestigationClick = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[3]/img";
	public static String InvestigationClick1 = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[3]/img";
	public static String ReportsClick = "//div[div='Requisitions']/descendant::div[text()='Reports']";
	public static String UploadReport = "//*[text()='Upload Report']";
	public static String CreatedBy = "//*[@class='ng-star-inserted']/ following:: input[1]";
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
	
	public static String AddNewAppointment="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[2]";
	public static String EnterTime="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[2]/div[2]/div[2]/div[1]/input";
	public static String SelectSlot="/html/body/div[2]/div[4]/div/mat-dialog-container/div/div[2]/form[2]/div/div/div/div[39]/div";
	public static String BookAppointment="/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[2]/button";
	
	public static String nextFollowupDate ="button.mat-focus-indicator.mat-icon-button";
	
	public static String RxCC=".mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-48";
	public static String temperature=".mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-10";
	public static String SPO2=".mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-11";
	public static String AnyGeneticDisorder="input.mat-input-element.mat-form-field-autofill-control.ng-tns-c165-527.ng-valid.cdk-text-field-autofill-monitored.ng-dirty.ng-touched";
	public static String FamilyMedicalHistory="/html/body/div[5]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[3]/mat-form-field/div/div[1]/div[1]/input";
	public static String EnterDisorder="/html/body/div[5]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[4]/mat-form-field/div/div[1]/div[1]/input";
	 public static String prefferedLanguage="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[7]/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]/span";
	    public static String prefferedLanguageEnglish="/html/body/div[2]/div[4]/div/div/div/mat-option[1]/span";
	    public static String Medicine = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[5]";
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
		//driver.get("http://stage.copious.care:4200/");
		// driver.manage().window().fullscreen();
		 driver.get("https://opd.copious.care/");
		//driver.get("https://stage.copious.care/");
		driver.manage().window().fullscreen();
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
		Thread.sleep(1000);
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
		Thread.sleep(1000);
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

	@Test(priority = 3)
	public void verifyButton() throws InterruptedException {
		Thread.sleep(10000);
		waitForVisibilityOf(By.xpath(verifyOTP));
		driver.findElement(By.xpath(verifyOTP));
		highlightElement(By.xpath(verifyOTP));
		clickUsingJavaScript(By.xpath(verifyOTP));

	}

	
	  @Test(priority = 4,groups="Regression") public void createPatient() {
	  waitForVisibilityOf(By.id(createPatient));
	  highlightElement(By.id(createPatient));
	  clickUsingJavaScript(By.id(createPatient));
	  driver.findElement(By.id(createPatient)); }
	  
	  @Test(priority = 5,groups="Regression") public void Number1() {
	  waitForVisibilityOf(By.xpath(Number1));
	  driver.findElement(By.xpath(Number1)).sendKeys("1234567891");
	  highlightElement(By.xpath(Number1)); clickUsingJavaScript(By.xpath(Number1));
	  }
	  
	  @Test(priority = 6,groups="Regression") public void confirm() throws InterruptedException {
	  waitForVisibilityOf(By.xpath(confirm));
	  driver.findElement(By.xpath(confirm)); highlightElement(By.xpath(confirm));
	  clickUsingJavaScript(By.xpath(confirm));
	  waitForVisibilityOf(By.xpath(confirmPopup));
	  highlightElement(By.xpath(confirmPopup));
	  clickUsingJavaScript(By.xpath(confirmPopup));
	  
	  Thread.sleep(5000);
	  waitForVisibilityOf(By.cssSelector(proceedWithSameRMN));
	  driver.findElement(By.cssSelector(proceedWithSameRMN));
	  highlightElement(By.cssSelector(proceedWithSameRMN));
	  clickUsingJavaScript(By.cssSelector(proceedWithSameRMN));
	  
	  }
	  
	  @Test(priority = 7,groups="Regression") public void number2() {
	  waitForVisibilityOf(By.xpath(number2));
	  driver.findElement(By.xpath(number2)).sendKeys("1234567892"); ;
	  highlightElement(By.xpath(number2)); clickUsingJavaScript(By.xpath(number2));
	  }
	  
	  @Test(priority = 8,groups="Regression") public void firstName() {
	  waitForVisibilityOf(By.xpath(firstName));
	  driver.findElement(By.xpath(firstName)).sendKeys("Sunaina"); ;
	  highlightElement(By.xpath(firstName));
	  clickUsingJavaScript(By.xpath(firstName)); }
	  
	  @Test(priority = 9,groups="Regression") public void middleName() {
	  waitForVisibilityOf(By.xpath(middleName));
	  driver.findElement(By.xpath(middleName)).sendKeys("s"); ;
	  highlightElement(By.xpath(middleName));
	  clickUsingJavaScript(By.xpath(middleName)); }
	  
	  @Test(priority = 10,groups="Regression") public void lastName() {
	  waitForVisibilityOf(By.xpath(lastName));
	  driver.findElement(By.xpath(lastName)).sendKeys("Test"); ;
	  highlightElement(By.xpath(lastName));
	  clickUsingJavaScript(By.xpath(lastName)); }
	  
	  @Test(priority = 11,groups="Regression") public void birthDate() throws InterruptedException {
	  
	  waitForVisibilityOf(By.xpath(birthDate));
	  highlightElement(By.xpath(birthDate));
	  driver.findElement(By.xpath(birthDate));
	  clickUsingJavaScript(By.xpath(birthDate));
	  
	  waitForVisibilityOf(By.xpath(SelectDate));
	  highlightElement(By.xpath(SelectDate));
	  driver.findElement(By.xpath(SelectDate));
	  clickUsingJavaScript(By.xpath(SelectDate)); }
	  
	  @Test(priority = 12,groups="Regression") public void genFemale() {
	  waitForVisibilityOf(By.xpath(genFemale));
	  driver.findElement(By.xpath(genFemale));
	  highlightElement(By.xpath(genFemale));
	  clickUsingJavaScript(By.xpath(genFemale)); }
	  
	  @Test(priority = 13,groups="Regression") public void address() {
	  waitForVisibilityOf(By.xpath(address));
	  driver.findElement(By.xpath(address)).sendKeys("Address"); ;
	  highlightElement(By.xpath(address)); clickUsingJavaScript(By.xpath(address));
	  }
	  
	  @Test(priority = 14,groups="Regression") public void locality() {
	  waitForVisibilityOf(By.xpath(locality));
	  driver.findElement(By.xpath(locality)).sendKeys("locality");
	  highlightElement(By.xpath(locality));
	  clickUsingJavaScript(By.xpath(locality)); }
	  
	  @Test(priority = 15,groups="Regression") public void city() {
	  waitForVisibilityOf(By.xpath(city));
	  driver.findElement(By.xpath(city)).sendKeys("City"); ;
	  highlightElement(By.xpath(city)); clickUsingJavaScript(By.xpath(city)); }
	  
	  @Test(priority = 16,groups="Regression") public void pinCode() {
	  waitForVisibilityOf(By.xpath(pinCode));
	  driver.findElement(By.xpath(pinCode)).sendKeys("412306");
	  highlightElement(By.xpath(pinCode)); clickUsingJavaScript(By.xpath(pinCode));
	  
	  }
	  @Test(priority = 17,groups="Regression") public void proceedWithSameRMN() {
		  
		 
	            waitForVisibilityOf(By.xpath(prefferedLanguage));
	        	highlightElement(By.xpath(prefferedLanguage));
	          driver.findElement(By.xpath(prefferedLanguage));
	          	clickUsingJavaScript(By.xpath(prefferedLanguage));
				
				
				  waitForVisibilityOf(By.xpath(prefferedLanguageEnglish));
				  highlightElement(By.xpath(prefferedLanguageEnglish));
				  driver.findElement(By.xpath(prefferedLanguageEnglish));
				 clickUsingJavaScript(By.xpath(prefferedLanguageEnglish));
				 
	        	
		  waitForVisibilityOf(By.xpath(proceedWithSameRMN));
		  
		  highlightElement(By.xpath(proceedWithSameRMN));
		  clickUsingJavaScript(By.xpath(proceedWithSameRMN));
		  
		  }
	
	  @Test(priority = 18,groups="Regression") public void nextButton() throws InterruptedException {
	  Thread.sleep(15000); waitForVisibilityOf(By.xpath(Next));
	  driver.findElement(By.xpath(Next)); highlightElement(By.xpath(Next));
	  clickUsingJavaScript(By.xpath(Next));
	  
	  }
	  
	 
	  
	  
	  @Test(priority = 19,groups="Regression") public void clickClose() {
	  waitForVisibilityOf(By.xpath(clickClose));
	  
	  highlightElement(By.xpath(clickClose));
	  clickUsingJavaScript(By.xpath(clickClose));
	  
	  }
	  
	  @Test(priority = 20) public void fillVitalForm() throws InterruptedException
	  { waitForVisibilityOf(By.xpath(selectDelivery));
	  
	  highlightElement(By.xpath(selectDelivery));
	  clickUsingJavaScript(By.xpath(selectDelivery));
	  waitForVisibilityOf(By.xpath(normalDelivery));
	  highlightElement(By.xpath(normalDelivery));
	  clickUsingJavaScript(By.xpath(normalDelivery));
	  
	  highlightElement(By.xpath(height));
	  driver.findElement(By.xpath(height)).sendKeys("100");
	  
	  highlightElement(By.xpath(weight));
	  driver.findElement(By.xpath(weight)).sendKeys("4");
	  
	  highlightElement(By.xpath(HC));
	  driver.findElement(By.xpath(HC)).sendKeys("4");
	  
	  highlightElement(By.xpath(CC));
	  driver.findElement(By.xpath(CC)).sendKeys("4");
	  
	  highlightElement(By.xpath(BP));
	  driver.findElement(By.xpath(BP)).sendKeys("80");
	  
	  highlightElement(By.xpath(BPdia));
	  driver.findElement(By.xpath(BPdia)).sendKeys("120");
	  
	  
		
		
		/*
		 * highlightElement(By.xpath(vaccinationDate));
		 * driver.findElement(By.xpath(vaccinationDate)).sendKeys("03/01/2019");
		 */
		  
		  
		  highlightElement(By.xpath(bloodGrp));
		  driver.findElement(By.xpath(bloodGrp));
		  clickUsingJavaScript(By.xpath(bloodGrp));
		  
		  highlightElement(By.xpath(bloodGrpOplus));
		  driver.findElement(By.xpath(bloodGrpOplus));
		  clickUsingJavaScript(By.xpath(bloodGrpOplus));
		 
	  
	  //Thread.sleep(15000); 
	  highlightElement(By.xpath(antentalNext));
	  clickUsingJavaScript(By.xpath(antentalNext));
	  
	  }
	  
	  @Test(priority = 21) public void fillHealthProfile() throws
	  InterruptedException { //Thread.sleep(10000);
	  
	  waitForVisibilityOf(By.xpath(medicalConditions));
	  highlightElement(By.xpath(medicalConditions));
	  driver.findElement(By.xpath(medicalConditions)).sendKeys("None");
	  
	  waitForVisibilityOf(By.xpath(allergies));
	  highlightElement(By.xpath(allergies));
	  driver.findElement(By.xpath(allergies)).sendKeys("None");
	  
	  highlightElement(By.xpath(reactionToDrugs));
	  driver.findElement(By.xpath(allergies)).sendKeys("None");
	  
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
	  
		/*
		 * highlightElement(By.cssSelector(AnyGeneticDisorder));
		 * driver.findElement(By.cssSelector(AnyGeneticDisorder)).sendKeys("none");;
		 */
	  
	  highlightElement(By.xpath(healthNext));
	  driver.findElement(By.xpath(healthNext));
	  clickUsingJavaScript(By.xpath(healthNext));
	  
	 
	  
	  
	  // highlightElement(By.xpath(familyProfile)); //
	  driver.findElement(By.xpath(familyProfile));
	  
	  }
	  
	  @Test(priority = 22) public void fillFamilyProfile() throws
	  InterruptedException { Thread.sleep(15000);
	  waitForVisibilityOf(By.xpath(fatherHeightFt));
	  
	  highlightElement(By.xpath(fatherHeightFt));
	  driver.findElement(By.xpath(fatherHeightFt)).sendKeys("5");
	  
	  highlightElement(By.xpath(fatherHeightinch));
	  driver.findElement(By.xpath(fatherHeightinch)).sendKeys("10");
	  
	  highlightElement(By.xpath(motherHeightFt));
	  driver.findElement(By.xpath(motherHeightFt)).sendKeys("5");
	  
	  highlightElement(By.xpath(motherHeightinch));
	  driver.findElement(By.xpath(motherHeightinch)).sendKeys("4");
	  
		/*
		 * highlightElement(By.xpath(FamilyMedicalHistory));
		 * driver.findElement(By.xpath(FamilyMedicalHistory)).sendKeys("None");
		 * 
		 * highlightElement(By.xpath(EnterDisorder));
		 * driver.findElement(By.xpath(EnterDisorder)).sendKeys("None");
		 */
		
		  highlightElement(By.xpath(familyNext));
		  driver.findElement(By.xpath(familyNext));
		  clickUsingJavaScript(By.xpath(familyNext));
		 
	  
	  highlightElement(By.xpath(Done)); driver.findElement(By.xpath(Done));
	  clickUsingJavaScript(By.xpath(Done));}
	  
	  @Test(priority = 23)
			public void GoHome() throws InterruptedException { 
	  waitForVisibilityOf(By.xpath(ClickHome));
	  driver.findElement(By.xpath(ClickHome)); highlightElement(By.xpath(ClickHome));
	  clickUsingJavaScript(By.xpath(ClickHome));
	 
		}
	  
	  @Test(priority = 24)
		public void AddNewAppointment() throws InterruptedException {
			//Thread.sleep(10000);

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
			
			//Thread.sleep(15000);
			waitForVisibilityOf(By.xpath(BookAppointment));
			driver.findElement(By.xpath(BookAppointment));
			highlightElement(By.xpath(BookAppointment));
			clickUsingJavaScript(By.xpath(BookAppointment));
	  }
			
			@Test(priority = 25)
			public void AddPrescription() throws InterruptedException {
				//Thread.sleep(15000);
				waitForVisibilityOf(By.xpath(AddNewPrescription));
				driver.findElement(By.xpath(AddNewPrescription));
				highlightElement(By.xpath(AddNewPrescription));
				clickUsingJavaScript(By.xpath(AddNewPrescription));
				
				  
				  
				 
			}

			@Test(priority = 26)
			public void Complaints() throws InterruptedException {

				//Thread.sleep(3000);
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

			
			  @Test(priority = 27) public void VitalsOption() throws InterruptedException {
			  
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
			  
			  highlightElement(By.cssSelector(RxCC)); 
			  driver.findElement(By.cssSelector(RxCC)).clear();
			  driver.findElement(By.cssSelector(RxCC)).sendKeys("97");
			  
			  highlightElement(By.cssSelector(temperature));
			  driver.findElement(By.cssSelector(temperature)).clear();
			  driver.findElement(By.cssSelector(temperature)).sendKeys("77");
			  
			  highlightElement(By.cssSelector(SPO2)); 
			  driver.findElement(By.cssSelector(SPO2)).clear();
			  driver.findElement(By.cssSelector(SPO2)).sendKeys("10");
			  
			  }
			  
			  @Test(priority = 28) public void BpandHeartOption() throws
			  InterruptedException {
			  
			  //Thread.sleep(15000); 
			  waitForVisibilityOf(By.id(BpAndHeart));
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
			  
			  @Test(priority = 29) public void BloodAndAnalysis() throws
			  InterruptedException {
			  
			  //Thread.sleep(15000); 
			  waitForVisibilityOf(By.xpath(BloodAndAnalysis));
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
			  
			  @Test(priority = 30) public void LipidProfile() throws InterruptedException {
			  
			  //Thread.sleep(15000); 
			  waitForVisibilityOf(By.xpath(LipidProfile));
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
			  
			  @Test(priority = 31) public void OnExamination() throws InterruptedException
			  {
			  
			  //Thread.sleep(15000); 
			  waitForVisibilityOf(By.xpath(OnExamination));
			  driver.findElement(By.xpath(OnExamination));
			  highlightElement(By.xpath(OnExamination));
			  clickUsingJavaScript(By.xpath(OnExamination));
			  
			  
			  
			  
			  driver.findElement(By.xpath(Examination));
			  highlightElement(By.xpath(Examination));
			  clickUsingJavaScript(By.xpath(Examination));
			  
			  }
			  
			  @Test(priority = 32) public void Diagnosis() throws InterruptedException {
			  
			  //Thread.sleep(15000);
			  
			  waitForVisibilityOf(By.xpath(DiagnosisOption));
			  driver.findElement(By.xpath(DiagnosisOption)); //
			  highlightElement(By.xpath(DiagnosisOption));
			  clickUsingJavaScript(By.xpath(DiagnosisOption));
			  
			  
			  
			  
			  
			  driver.findElement(By.xpath(Diagnosis));
			  highlightElement(By.xpath(Diagnosis));
			  clickUsingJavaScript(By.xpath(Diagnosis));
			  
			  }
			  
			  
				/*
				 * @Test(priority = 33) public void Medicine() {
				 * waitForVisibilityOf(By.xpath(Medicine));
				 * driver.findElement(By.xpath(Medicine)); highlightElement(By.xpath(Medicine));
				 * clickUsingJavaScript(By.xpath(Medicine));
				 * 
				 * 
				 * 
				 * 
				 * }
				 */
			  
			  
			  @Test(priority = 34) public void Medicine1() throws InterruptedException {
			  
			  //Thread.sleep(15000); 
			  waitForVisibilityOf(By.xpath(Medicine));
			  driver.findElement(By.xpath(Medicine)); highlightElement(By.xpath(Medicine));
			  clickUsingJavaScript(By.xpath(Medicine));
			  
			  
			  waitForVisibilityOf(By.xpath(medicineSearch));
			  highlightElement(By.xpath(medicineSearch));
			  driver.findElement(By.xpath(medicineSearch)).sendKeys("dolo");
			  waitForVisibilityOf(By.xpath(Dolocare));
			  highlightElement(By.xpath(Dolocare));
			  clickUsingJavaScript(By.xpath(Dolocare));
			  
			
			  highlightElement(By.xpath(Medpageinstruction));
			  driver.findElement(By.xpath(Medpageinstruction));
			  clickUsingJavaScript(By.xpath(Medpageinstruction));
			  
			  
			
			  
			  
			  waitForVisibilityOf(By.xpath(Instruction));
			  highlightElement(By.xpath(Instruction));
			  driver.findElement(By.xpath(Instruction)).sendKeys("Drink water");
			  clickUsingJavaScript(By.xpath(Instruction));
			  
			  waitForVisibilityOf(By.xpath(MedAddtoList));
			  highlightElement(By.xpath(MedAddtoList));
			  driver.findElement(By.xpath(MedAddtoList));
			  clickUsingJavaScript(By.xpath(MedAddtoList));
			  
			  //Thread.sleep(15000);
			  
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
			  
			  //Thread.sleep(15000);
			  
			  waitForVisibilityOf(By.xpath(FavouriteOption));
			  highlightElement(By.xpath(FavouriteOption));
			  driver.findElement(By.xpath(FavouriteOption));
			  clickUsingJavaScript(By.xpath(FavouriteOption));
			  
			  waitForVisibilityOf(By.xpath(FavouriteSearch));
			  highlightElement(By.xpath(FavouriteSearch));
			  driver.findElement(By.xpath(FavouriteSearch)).sendKeys("disprin");
			  
			  waitForVisibilityOf(By.cssSelector(FavouriteClick));
			  highlightElement(By.cssSelector(FavouriteClick));
			  driver.findElement(By.cssSelector(FavouriteClick));
			  clickUsingJavaScript(By.cssSelector(FavouriteClick));
			  
			  waitForVisibilityOf(By.xpath(FavouriteClickMedicine));
			  highlightElement(By.xpath(FavouriteClickMedicine));
			  driver.findElement(By.xpath(FavouriteClickMedicine));
			  clickUsingJavaScript(By.xpath(FavouriteClickMedicine));
			  
			
			  
			  }
			  
			  @Test(priority = 35) public void DietaryAdvice() throws InterruptedException
			  {
			  
			  //Thread.sleep(15000);
			  
			  waitForVisibilityOf(By.xpath(DietaryAdviceOption));
			  driver.findElement(By.xpath(DietaryAdviceOption));
			  highlightElement(By.xpath(DietaryAdviceOption));
			  clickUsingJavaScript(By.xpath(DietaryAdviceOption));
			  
			  
			  waitForVisibilityOf(By.xpath(DietaryAdd));
			  driver.findElement(By.xpath(DietaryAdd));
			  highlightElement(By.xpath(DietaryAdd));
			  clickUsingJavaScript(By.xpath(DietaryAdd));
			  
			  }
			  
			  @Test(priority = 36) public void GeneralInstruction() throws
			  InterruptedException {
			  
			  //Thread.sleep(15000);
			  
			  
			  
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
			 
			@Test(priority = 37)
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

			@Test(priority = 38)
			public void ConfirmPrescription() throws InterruptedException {

				//Thread.sleep(5000);
				
				
				  waitForVisibilityOf(By.cssSelector(nextFollowupDate));
				   driver.findElement(By.cssSelector(nextFollowupDate));
				  highlightElement(By.cssSelector(nextFollowupDate));
				  clickUsingJavaScript(By.cssSelector(nextFollowupDate));
				  
				  
				  waitForVisibilityOf(By.cssSelector(nextFollowupSelectDate));
				  driver.findElement(By.cssSelector(nextFollowupSelectDate));
				  highlightElement(By.cssSelector(nextFollowupSelectDate));
				  clickUsingJavaScript(By.cssSelector(nextFollowupSelectDate));
				 
				  
				  
					
					  waitForVisibilityOf(By.xpath(FollowupTypes));
					  driver.findElement(By.xpath(FollowupTypes));
					  highlightElement(By.xpath(FollowupTypes));
					  clickUsingJavaScript(By.xpath(FollowupTypes));
					  
					  waitForVisibilityOf(By.xpath(Appointment));
					  driver.findElement(By.xpath(Appointment));
					  highlightElement(By.xpath(Appointment));
					  clickUsingJavaScript(By.xpath(Appointment));
					  
					 
				  
					
					/*
					 * waitForVisibilityOf(By.xpath(FollowupMessage));
					 * driver.findElement(By.xpath(FollowupMessage));
					 * highlightElement(By.xpath(FollowupMessage));
					 * clickUsingJavaScript(By.xpath(FollowupMessage));
					 */
				 

			

				//Thread.sleep(15000);
				waitForVisibilityOf(By.cssSelector(ConfirmandPrint));
				driver.findElement(By.cssSelector(ConfirmandPrint));
				highlightElement(By.cssSelector(ConfirmandPrint));
				clickUsingJavaScript(By.cssSelector(ConfirmandPrint));

				//Thread.sleep(20000);
				waitForVisibilityOf(By.xpath(prescriptionDone));
				driver.findElement(By.xpath(prescriptionDone));
				highlightElement(By.xpath(prescriptionDone));
				clickUsingJavaScript(By.xpath(prescriptionDone));

				//Thread.sleep(15000);
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
