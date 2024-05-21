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
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FullVaccination5YearsWise {
	public static WebDriver driver;

	public static String doctorLoginLink = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
	public static String mobileNumber = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
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
	public static String success = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/div[1]/div[1]/div[1]/div[1]/div";
	public static String age = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[2]/div/div[1]/div/input";
	public static String familyProfile = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[1]/mat-step-header[4]/div[3]/div";
	public static String Done = "/html/body/ngb-modal-window/div/div/div[3]/div";
	public static String SelectDate = "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[1]/td[2]/div[1]";
	public static String SelectMonth = "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[4]/div[1]";
	public static String ClickYearDropdown = "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]";
	public static String clickYear = "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[5]/td[3]/div[1]";
	public static String clickContinue = "/html/body/ngb-modal-window/div/div/div[2]/div/div/div[5]/span";
	public static String prefferedLanguage = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[7]/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]/span";
	public static String prefferedLanguageEnglish = "/html/body/div[2]/div[4]/div/div/div/mat-option[1]/span";
	public static String AdultSelectDate = "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[3]/div[1]";
	public static String AdultSelectMonth = "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[4]/div[1]";
	public static String AdultClickYearDropdown = "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]";
	public static String AdultclickYear = " //*[text()=' 2017 ']";
	public static String HealthProfile = "//*[text()='Health Profile']";

	public static String ImmunizationOption = "//*[text()='Immunization']";
	public static String ConfirmVaccinationDate = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[5]/button";
	public static String BCG = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[1]/td[8]/div";
	public static String RecievedDate = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[5]/div/img";
	public static String ClickDate = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[5]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[3]/div[2]/div";
	public static String SaveVaccine = "//*[text()='Save Vaccine']";
	public static String SpecialVaccineClick = "//*[text()='Special Vaccines']";
	public static String CholeraVacccine = "//*[text()='Cholera Vaccine']";
	public static String SelectDate1 = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[4]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[3]/div[1]/div";
	public static String ClickCalender = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[4]/div/img";
	public static String SaveSpecialVaccine = "//*[text()='Save Vaccine']";
	public static String BulkUpdate = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[2]/button[2]/span";
	public static String BulkVaccineDTWP = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[3]/div[2]/div[2]/div/span[1]";
	public static String BulkVaccineHepB = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[3]/div[2]/div[1]/div/span[1]";
	public static String AddToSchedule = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[4]/button[2]";
	public static String VCCTaken = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[4]/td[5]/div";
	public static String PneumococcalPolysaccharide = "//*[text()='Pneumococcal Polysaccharide']";
	public static String MeningococcalVaccine = "//*[text()='Meningococcal Vaccine']";
	public static String RabiesVaccine = "//*[text()='Rabies Vaccine']";
	// birth
	public static String OPV1by4 = "//*[text()='Vaccines']//following::span[2]";
	public static String OPV1by4Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[2]/td[8]/div";
	public static String HepB1by5Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[3]/td[8]/div";
	public static String HepB1by5 = "//*[text()='Vaccines']//following::span[3]";
	// 6week
	public static String DTWP1by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[4]/td[8]/div";
	public static String DTWP1by3 = "//*[text()='Vaccines']//following::span[1]";
	public static String IPV1by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[5]/td[8]/div";
	public static String IPV1by3 = "//*[text()='Vaccines']//following::span[2]";
	public static String HIB1by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[7]/td[8]/div";
	public static String HIB1by3 = "//*[text()='Vaccines']//following::span[3]";
	public static String HepB2by5Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[6]/td[8]/div";
	public static String HepB2by5 = "//*[text()='Vaccines']//following::span[4]";
	public static String Rotavirus1by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[8]/td[8]/div";
	public static String Rotavirus1by3 = "//*[text()='Vaccines']//following::span[5]";
	public static String PCV1by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[9]/td[8]/div";
	public static String PCV1by3 = "//*[text()='Vaccines']//following::span[6]";
//10week
	public static String DTWP2by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[10]/td[8]/div";
	public static String DTWP2by3 = "//*[text()='Vaccines']//following::span[1]";
	public static String IPV2by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[11]/td[8]/div";
	public static String IPV2by3 = "//*[text()='Vaccines']//following::span[2]";
	public static String HIB2by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[12]/td[8]/div";
	public static String HIB2by3 = "//*[text()='Vaccines']//following::span[3]";
	public static String HepB3by5Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[15]/td[8]/div";
	public static String HepB3by5 = "//*[text()='Vaccines']//following::span[6]";
	public static String Rotavirus2by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[13]/td[8]/div";
	public static String Rotavirus2by3 = "//*[text()='Vaccines']//following::span[4]";
	public static String PCV2by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[14]/td[8]/div";
	public static String PCV2by3 = "//*[text()='Vaccines']//following::span[5]";
//14week
	public static String DTWP3by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[16]/td[8]/div";
	public static String DTWP3by3 = "//*[text()='Vaccines']//following::span[1]";
	public static String IPV3by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[17]/td[8]/div";
	public static String IPV3by3 = "//*[text()='Vaccines']//following::span[2]";
	public static String HIB3by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[18]/td[8]/div";
	public static String HIB3by3 = "//*[text()='Vaccines']//following::span[3]";
	public static String HepB4by5Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[21]/td[8]/div";
	public static String HepB4by5 = "//*[text()='Vaccines']//following::span[6]";
	public static String Rotavirus3by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[19]/td[8]/div";
	public static String Rotavirus3by3 = "//*[text()='Vaccines']//following::span[4]";
	public static String PCV3by3Record = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[20]/td[8]/div";
	public static String PCV3by3 = "//*[text()='Vaccines']//following::span[5]";
//9to12Months
	public static String TyphoidConjugateV1by2ecord = "//*[text()=' Typhoid Conjugate V (1/2) (9-12 months) ']//following::div[2]";
//6months
	public static String OPV2by4Record = "//*[text()=' OPV (2/4) ']//following::div[2]";
	public static String OPV2by4 = "//*[text()='Vaccines']//following::span[1]";
	public static String HepB5by5Record = "//*[text()=' Hep-B (5/5) ']//following::div[2]";
	public static String HepB5by5 = "//*[text()='Vaccines']//following::span[2]";
	public static String influenza1by6Record = "//*[text()=' Influenza (1/6) ']//following::div[2]";
	public static String influenza1by6 = "//*[text()='Vaccines']//following::span[3]";
//9months
	public static String OPV3by4Record = "//*[text()=' OPV (3/4) ']//following::div[2]";
	public static String OPV3by4 = "//*[text()='Vaccines']//following::span[1]";
	public static String MMR1by3Record = "//*[text()=' MMR (1/3) ']//following::div[2]";
	public static String MMR1by3 = "//*[text()='Vaccines']//following::span[2]";
	public static String MeningococcalMCV1by2Record = "//*[text()=' Meningococcal (MCV 1/2) ']//following::div[2]";
	public static String MeningococcalMCV1by2 = "//*[text()='Vaccines']//following::span[3]";
//12months
	public static String HepA1by2Record = "//*[text()=' Hep A (1/2) (1year) ']//following::div[2]";
	public static String HepA1by2 = "//*[text()='Vaccines']//following::span[1]";
	public static String JapaneseEncephalitisRecord = "//*[text()=' Japanese Encephalitis ']//following::div[2]";
	public static String JapaneseEncephalitis = "//*[text()='Vaccines']//following::span[2]";
	public static String MeningococcalMCV2by2Record = "//*[text()=' Meningococcal (MCV 2/2) ']//following::div[2]";
	public static String MeningococcalMCV2by2 = "//*[text()='Vaccines']//following::span[3]";
//12to15Months
	public static String MMR2by3Record = "//*[text()=' MMR (2/3) (12-15 months) ']//following::div[2]";
	public static String MMR2by3 = "//*[text()='Vaccines']//following::span[1]";
	public static String Varicella1by2Record = "//*[text()=' Varicella (1/2) (12-15 months) ']//following::div[2]";
	public static String Varicella1by2 = "//*[text()='Vaccines']//following::span[2]";
	public static String PCVBoosterRecord = "//*[text()=' PCV Booster (12-15 months) ']//following::div[2]";
	public static String PCVBooster = "//*[text()='Vaccines']//following::span[3]";
//16to18Months
	public static String DTPBossterRecord = "//*[text()=' DTP Booster (16-18 months) ']//following::div[2]";
	public static String DTPBosster = "//*[text()='Vaccines']//following::span[1]";
	public static String IPVBoosterRecord = "//*[text()=' IPV Booster (16-18 months) ']//following::div[2]";
	public static String IPVBooster = "//*[text()='Vaccines']//following::span[2]";
	public static String HIBBoosterRecord = "//*[text()=' Hib Booster (16-18 months) ']//following::div[2]";
	public static String HIBBooster = "//*[text()='Vaccines']//following::span[3]";
//18Months
	public static String HepA2by2Record = "//*[text()=' Hep A (2/2) (18 months) ']//following::div[2]";
	public static String HepA2by2 = "//*[text()='Vaccines']//following::span[1]";
	public static String influenza3by6Record = "//*[text()=' Influenza (3/6) ']//following::div[2]";
	public static String influenza3by6 = "//*[text()='Vaccines']//following::span[2]";
//7months
	public static String influenza2by6Record = "//*[text()=' Influenza (2/6) ']//following::div[2]";
//2years
	public static String TyphoidConjugateVRecord = "//*[text()=' Typhoid Conjugate V (2 years) ']//following::div[2]";
	public static String TyphoidConjugateV = "//*[text()='Vaccines']//following::span[1]";
	public static String MeningococcalVacRecord = "//*[text()=' Meningococcal Vac. (2 years) ']//following::div[2]";
	public static String MeningococcalVac = "//*[text()='Vaccines']//following::span[2]";
//2years6Months
	public static String Influenza4by6Record = "//*[text()=' Influenza (4/6) ']//following::div[2]";
	// public static String Influenza4by6="";
//4to6years
	public static String DTPBoosterRecord = "//*[text()=' DTP Booster (4-6 years) ']//following::div[2]";
	public static String DTPBooster = "//*[text()='Vaccines']//following::span[1]";
	public static String OPV4by4Record = "//*[text()=' OPV (4/4) (4-6 years) ']//following::div[2]";
	public static String OPV4by4 = "//*[text()='Vaccines']//following::span[2]";
	public static String Varicella2by2Record = "//*[text()=' Varicella (2/2) (4-6 years) ']//following::div[2]";
	public static String Varicella2by2 = "//*[text()='Vaccines']//following::span[3]";
	public static String MMR3by3Record = "//*[text()=' MMR (3/3) (4-6 years) ']//following::div[2]";
	public static String MMR3by3 = "//*[text()='Vaccines']//following::span[4]";
//3yrs6Months
	public static String Influenza5by6Record = "//*[text()=' Influenza (5/6) ']//following::div[2]";
	// public static String Influenza5by6="";
//10To12Years
	public static String TdapTDRecord = "//*[text()=' Tdap/Td (10-12 years) ']//following::div[2]";
	// public static String TdapTD="";
//4years6months
	public static String influenza6by6Record = "//*[text()=' Influenza (6/6) ']//following::div[2]";
	// public static String HPV1by2="";
//10yers6Months
	public static String HPV2by2Record = "//*[text()=' HPV (2/2) (10yr 6m) ']//following::div[2]";
	// public static String HPV2by2="";

	//10years
public static String HPV1by2Record="//*[text()=' HPV (1/2) (10 years) ']//following::div[2]";
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
		driver.findElement(By.xpath(firstName)).sendKeys("HHHH");

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

	}

	@Test(priority = 19)
	public void clickClose() {
		waitForVisibilityOf(By.xpath(clickContinue));

		highlightElement(By.xpath(clickContinue));
		clickUsingJavaScript(By.xpath(clickContinue));

	}

	@Test(priority = 20, retryAnalyzer = webAutoNegative.MyRetry.class)
	public void fillVitalForm() throws InterruptedException {
		waitForVisibilityOf(By.xpath(selectDelivery));

		highlightElement(By.xpath(selectDelivery));
		clickUsingJavaScript(By.xpath(selectDelivery));
		waitForVisibilityOf(By.xpath(normalDelivery));
		highlightElement(By.xpath(normalDelivery));
		clickUsingJavaScript(By.xpath(normalDelivery));

		highlightElement(By.xpath(height));
		driver.findElement(By.xpath(height)).sendKeys("100");

		highlightElement(By.xpath(weight));
		driver.findElement(By.xpath(weight)).sendKeys("4.1");
		Assert.assertEquals(4.1, 4.1, "doesnt match");

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
		clickUsingJavaScript(By.xpath(bloodGrp));

		highlightElement(By.xpath(bloodGrpOplus));
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
		driver.findElement(By.xpath(medicalConditions)).sendKeys("Critical");

		waitForVisibilityOf(By.xpath(allergies));
		highlightElement(By.xpath(allergies));
		driver.findElement(By.xpath(allergies)).sendKeys("Dust");

		highlightElement(By.xpath(reactionToDrugs));
		driver.findElement(By.xpath(reactionToDrugs)).sendKeys("yes");

		highlightElement(By.xpath(recurringComplaints));
		driver.findElement(By.xpath(recurringComplaints)).sendKeys("None");

		highlightElement(By.xpath(hospitalization));
		driver.findElement(By.xpath(hospitalization)).sendKeys("yes");

		highlightElement(By.xpath(healthHistory));
		driver.findElement(By.xpath(healthHistory)).sendKeys("None");

		highlightElement(By.xpath(emailID));
		driver.findElement(By.xpath(emailID)).sendKeys("vishu@123testtest.com");

		highlightElement(By.xpath(UHID));
		driver.findElement(By.xpath(UHID)).sendKeys("None");

		highlightElement(By.xpath(healthNext));
		driver.findElement(By.xpath(healthNext));
		clickUsingJavaScript(By.xpath(healthNext));

		// highlightElement(By.xpath(familyProfile));
		// driver.findElement(By.xpath(familyProfile));

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

		highlightElement(By.xpath(familyNext));
		driver.findElement(By.xpath(familyNext));
		clickUsingJavaScript(By.xpath(familyNext));

		highlightElement(By.xpath(Done));
		driver.findElement(By.xpath(Done));
		clickUsingJavaScript(By.xpath(Done));

		/*
		 * waitForVisibilityOf(By.xpath(success)); highlightElement(By.xpath(success));
		 * String p=driver.findElement(By.xpath(success)).getText();
		 * System.out.println("msge:"+p); String a="Profile"; Assert.assertEquals(p,a);
		 */
	}
	
	  @Test(priority = 28) public void Health6MonthVisitVaccine() throws
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
	  
	  waitForVisibilityOf(By.xpath(OPV2by4));
	  driver.findElement(By.xpath(OPV2by4)); highlightElement(By.xpath(OPV2by4));
	  clickUsingJavaScript(By.xpath(OPV2by4));
	  
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
	  
	  Thread.sleep(10000); waitForVisibilityOf(By.xpath(HepB5by5Record));
	  driver.findElement(By.xpath(HepB5by5Record));
	  highlightElement(By.xpath(HepB5by5Record));
	  clickUsingJavaScript(By.xpath(HepB5by5Record));
	  
	  waitForVisibilityOf(By.xpath(HepB5by5));
	  driver.findElement(By.xpath(HepB5by5)); highlightElement(By.xpath(HepB5by5));
	  clickUsingJavaScript(By.xpath(HepB5by5));
	  
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
	  
	  
	  Thread.sleep(10000); waitForVisibilityOf(By.xpath(influenza1by6Record));
	  driver.findElement(By.xpath(influenza1by6Record));
	  highlightElement(By.xpath(influenza1by6Record));
	  clickUsingJavaScript(By.xpath(influenza1by6Record));
	  
	  waitForVisibilityOf(By.xpath(influenza1by6));
	  driver.findElement(By.xpath(influenza1by6));
	  highlightElement(By.xpath(influenza1by6));
	  clickUsingJavaScript(By.xpath(influenza1by6));
	  
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

	  @Test(priority = 29)
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
	 

	  @Test(priority = 30)
		public void Health9MonthVisitVaccine() throws InterruptedException {
			Thread.sleep(10000);
			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));

			waitForVisibilityOf(By.xpath(OPV3by4Record));
			driver.findElement(By.xpath(OPV3by4Record));
			highlightElement(By.xpath(OPV3by4Record));
			clickUsingJavaScript(By.xpath(OPV3by4Record));

			waitForVisibilityOf(By.xpath(OPV3by4));
			driver.findElement(By.xpath(OPV3by4));
			highlightElement(By.xpath(OPV3by4));
			clickUsingJavaScript(By.xpath(OPV3by4));

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

			Thread.sleep(10000);
			waitForVisibilityOf(By.xpath(MMR1by3Record));
			driver.findElement(By.xpath(MMR1by3Record));
			highlightElement(By.xpath(MMR1by3Record));
			clickUsingJavaScript(By.xpath(MMR1by3Record));

			waitForVisibilityOf(By.xpath(MMR1by3));
			driver.findElement(By.xpath(MMR1by3));
			highlightElement(By.xpath(MMR1by3));
			clickUsingJavaScript(By.xpath(MMR1by3));

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

			Thread.sleep(10000);
			waitForVisibilityOf(By.xpath(MeningococcalMCV1by2Record));
			driver.findElement(By.xpath(MeningococcalMCV1by2Record));
			highlightElement(By.xpath(MeningococcalMCV1by2Record));
			clickUsingJavaScript(By.xpath(MeningococcalMCV1by2Record));

			waitForVisibilityOf(By.xpath(MeningococcalMCV1by2));
			driver.findElement(By.xpath(MeningococcalMCV1by2));
			highlightElement(By.xpath(MeningococcalMCV1by2));
			clickUsingJavaScript(By.xpath(MeningococcalMCV1by2));

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

	  @Test(priority = 31)
		public void Health9To12MonthVisitVaccine() throws InterruptedException {
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
 
	  @Test(priority = 32)
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

			waitForVisibilityOf(By.xpath(HepA1by2));
			driver.findElement(By.xpath(HepA1by2));
			highlightElement(By.xpath(HepA1by2));
			clickUsingJavaScript(By.xpath(HepA1by2));

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
			
			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));

			waitForVisibilityOf(By.xpath(JapaneseEncephalitisRecord));
			driver.findElement(By.xpath(JapaneseEncephalitisRecord));
			highlightElement(By.xpath(JapaneseEncephalitisRecord));
			clickUsingJavaScript(By.xpath(JapaneseEncephalitisRecord));

			waitForVisibilityOf(By.xpath(JapaneseEncephalitis));
			driver.findElement(By.xpath(JapaneseEncephalitis));
			highlightElement(By.xpath(JapaneseEncephalitis));
			clickUsingJavaScript(By.xpath(JapaneseEncephalitis));

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

			waitForVisibilityOf(By.xpath(MeningococcalMCV2by2Record));
			driver.findElement(By.xpath(MeningococcalMCV2by2Record));
			highlightElement(By.xpath(MeningococcalMCV2by2Record));
			clickUsingJavaScript(By.xpath(MeningococcalMCV2by2Record));

			waitForVisibilityOf(By.xpath(MeningococcalMCV2by2));
			driver.findElement(By.xpath(MeningococcalMCV2by2));
			highlightElement(By.xpath(MeningococcalMCV2by2));
			clickUsingJavaScript(By.xpath(MeningococcalMCV2by2));

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

	  @Test(priority = 33)
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
			waitForVisibilityOf(By.xpath(MMR2by3Record));
			driver.findElement(By.xpath(MMR2by3Record));
			highlightElement(By.xpath(MMR2by3Record));
			clickUsingJavaScript(By.xpath(MMR2by3Record));

			waitForVisibilityOf(By.xpath(MMR2by3));
			driver.findElement(By.xpath(MMR2by3));
			highlightElement(By.xpath(MMR2by3));
			clickUsingJavaScript(By.xpath(MMR2by3));

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
			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			clickUsingJavaScript(By.xpath(ImmunizationOption));

			waitForVisibilityOf(By.xpath(Varicella1by2Record));
			driver.findElement(By.xpath(Varicella1by2Record));
			highlightElement(By.xpath(Varicella1by2Record));
			clickUsingJavaScript(By.xpath(Varicella1by2Record));

			waitForVisibilityOf(By.xpath(Varicella1by2));
			driver.findElement(By.xpath(Varicella1by2));
			highlightElement(By.xpath(Varicella1by2));
			clickUsingJavaScript(By.xpath(Varicella1by2));

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
			waitForVisibilityOf(By.xpath(HealthProfile));
			driver.findElement(By.xpath(HealthProfile));
			highlightElement(By.xpath(HealthProfile));
			clickUsingJavaScript(By.xpath(HealthProfile));

			waitForVisibilityOf(By.xpath(ImmunizationOption));
			driver.findElement(By.xpath(ImmunizationOption));
			highlightElement(By.xpath(ImmunizationOption));
			
			clickUsingJavaScript(By.xpath(ImmunizationOption));
			
			waitForVisibilityOf(By.xpath(PCVBoosterRecord));
			driver.findElement(By.xpath(PCVBoosterRecord));
			highlightElement(By.xpath(PCVBoosterRecord));
			clickUsingJavaScript(By.xpath(PCVBoosterRecord));

			waitForVisibilityOf(By.xpath(PCVBooster));
			driver.findElement(By.xpath(PCVBooster));
			highlightElement(By.xpath(PCVBooster));
			clickUsingJavaScript(By.xpath(PCVBooster));

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

	  @Test(priority = 34) public void Health16To18MonthVisitVaccine() throws
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

	  waitForVisibilityOf(By.xpath(DTPBosster));
	  driver.findElement(By.xpath(DTPBosster));
	  highlightElement(By.xpath(DTPBosster));
	  clickUsingJavaScript(By.xpath(DTPBosster));

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
	  waitForVisibilityOf(By.xpath(HealthProfile));
		driver.findElement(By.xpath(HealthProfile));
		highlightElement(By.xpath(HealthProfile));
		clickUsingJavaScript(By.xpath(HealthProfile));

		waitForVisibilityOf(By.xpath(ImmunizationOption));
		driver.findElement(By.xpath(ImmunizationOption));
		highlightElement(By.xpath(ImmunizationOption));
		clickUsingJavaScript(By.xpath(ImmunizationOption));

	  waitForVisibilityOf(By.xpath(IPVBoosterRecord));
	  driver.findElement(By.xpath(IPVBoosterRecord));
	  highlightElement(By.xpath(IPVBoosterRecord));
	  clickUsingJavaScript(By.xpath(IPVBoosterRecord));

	  waitForVisibilityOf(By.xpath(IPVBooster));
	  driver.findElement(By.xpath(IPVBooster));
	  highlightElement(By.xpath(IPVBooster));
	  clickUsingJavaScript(By.xpath(IPVBooster));

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

	  waitForVisibilityOf(By.xpath(HealthProfile));
		driver.findElement(By.xpath(HealthProfile));
		highlightElement(By.xpath(HealthProfile));
		clickUsingJavaScript(By.xpath(HealthProfile));

		waitForVisibilityOf(By.xpath(ImmunizationOption));
		driver.findElement(By.xpath(ImmunizationOption));
		highlightElement(By.xpath(ImmunizationOption));
		clickUsingJavaScript(By.xpath(ImmunizationOption));


	  waitForVisibilityOf(By.xpath(HIBBoosterRecord));
	  driver.findElement(By.xpath(HIBBoosterRecord));
	  highlightElement(By.xpath(HIBBoosterRecord));
	  clickUsingJavaScript(By.xpath(HIBBoosterRecord));

	  waitForVisibilityOf(By.xpath(HIBBooster));
	  driver.findElement(By.xpath(HIBBooster));
	  highlightElement(By.xpath(HIBBooster));
	  clickUsingJavaScript(By.xpath(HIBBooster));

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
	  @Test(priority = 35) public void Health18MonthVisitVaccine() throws
	  InterruptedException { Thread.sleep(10000);

		waitForVisibilityOf(By.xpath(HealthProfile));
		driver.findElement(By.xpath(HealthProfile));
		highlightElement(By.xpath(HealthProfile));
		clickUsingJavaScript(By.xpath(HealthProfile));

		waitForVisibilityOf(By.xpath(ImmunizationOption));
		driver.findElement(By.xpath(ImmunizationOption));
		highlightElement(By.xpath(ImmunizationOption));
		clickUsingJavaScript(By.xpath(ImmunizationOption));
		
	  waitForVisibilityOf(By.xpath(HepA2by2Record));
	  driver.findElement(By.xpath(HepA2by2Record));
	  highlightElement(By.xpath(HepA2by2Record));
	  clickUsingJavaScript(By.xpath(HepA2by2Record));

	  waitForVisibilityOf(By.xpath(HepA2by2));
	  driver.findElement(By.xpath(HepA2by2)); highlightElement(By.xpath(HepA2by2));
	  clickUsingJavaScript(By.xpath(HepA2by2));

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

	  waitForVisibilityOf(By.xpath(HealthProfile));
		driver.findElement(By.xpath(HealthProfile));
		highlightElement(By.xpath(HealthProfile));
		clickUsingJavaScript(By.xpath(HealthProfile));

		waitForVisibilityOf(By.xpath(ImmunizationOption));
		driver.findElement(By.xpath(ImmunizationOption));
		highlightElement(By.xpath(ImmunizationOption));
		clickUsingJavaScript(By.xpath(ImmunizationOption));
		Thread.sleep(5000);
	  waitForVisibilityOf(By.xpath(influenza3by6Record));
	  driver.findElement(By.xpath(influenza3by6Record));
	  highlightElement(By.xpath(influenza3by6Record));
	  clickUsingJavaScript(By.xpath(influenza3by6Record));

	  waitForVisibilityOf(By.xpath(influenza3by6));
	  driver.findElement(By.xpath(influenza3by6));
	  highlightElement(By.xpath(influenza3by6));
	  clickUsingJavaScript(By.xpath(influenza3by6));

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
	  @Test(priority = 36) public void Health2YearsVisitVaccine() throws
	  InterruptedException {Thread.sleep(10000);

		waitForVisibilityOf(By.xpath(HealthProfile));
		driver.findElement(By.xpath(HealthProfile));
		highlightElement(By.xpath(HealthProfile));
		clickUsingJavaScript(By.xpath(HealthProfile));

		waitForVisibilityOf(By.xpath(ImmunizationOption));
		driver.findElement(By.xpath(ImmunizationOption));
		highlightElement(By.xpath(ImmunizationOption));
		clickUsingJavaScript(By.xpath(ImmunizationOption));

	  Thread.sleep(10000); waitForVisibilityOf(By.xpath(TyphoidConjugateVRecord));
	  driver.findElement(By.xpath(TyphoidConjugateVRecord));
	  highlightElement(By.xpath(TyphoidConjugateVRecord));
	  clickUsingJavaScript(By.xpath(TyphoidConjugateVRecord));

	  waitForVisibilityOf(By.xpath(TyphoidConjugateV));
	  driver.findElement(By.xpath(TyphoidConjugateV));
	  highlightElement(By.xpath(TyphoidConjugateV));
	  clickUsingJavaScript(By.xpath(TyphoidConjugateV));

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

	  Thread.sleep(10000);
	  waitForVisibilityOf(By.xpath(MeningococcalVacRecord));
	  driver.findElement(By.xpath(MeningococcalVacRecord));
	  highlightElement(By.xpath(MeningococcalVacRecord));
	  clickUsingJavaScript(By.xpath(MeningococcalVacRecord));

	  waitForVisibilityOf(By.xpath(MeningococcalVac));
	  driver.findElement(By.xpath(MeningococcalVac));
	  highlightElement(By.xpath(MeningococcalVac));
	  clickUsingJavaScript(By.xpath(MeningococcalVac));

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
	  @Test(priority = 37) public void Health2Years6monthVisitVaccine() throws
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
	  
	  @Test(priority = 38) public void Health3Years6monthVisitVaccine() throws
	  InterruptedException { Thread.sleep(10000);

		waitForVisibilityOf(By.xpath(HealthProfile));
		driver.findElement(By.xpath(HealthProfile));
		highlightElement(By.xpath(HealthProfile));
		clickUsingJavaScript(By.xpath(HealthProfile));

		waitForVisibilityOf(By.xpath(ImmunizationOption));
		driver.findElement(By.xpath(ImmunizationOption));
		highlightElement(By.xpath(ImmunizationOption));
		clickUsingJavaScript(By.xpath(ImmunizationOption));

	  waitForVisibilityOf(By.xpath(Influenza5by6Record));
	  driver.findElement(By.xpath(Influenza5by6Record));
	  highlightElement(By.xpath(Influenza5by6Record));
	  clickUsingJavaScript(By.xpath(Influenza5by6Record));



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
	  @Test(priority = 39) public void Health4Years6yearsVisitVaccine() throws
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



	  Thread.sleep(10000);

	  waitForVisibilityOf(By.xpath(OPV4by4Record));
	  driver.findElement(By.xpath(OPV4by4Record));
	  highlightElement(By.xpath(OPV4by4Record));
	  clickUsingJavaScript(By.xpath(OPV4by4Record));

	  waitForVisibilityOf(By.xpath(OPV4by4));
	  driver.findElement(By.xpath(OPV4by4)); highlightElement(By.xpath(OPV4by4));
	  clickUsingJavaScript(By.xpath(OPV4by4));

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



	  Thread.sleep(10000);

	  waitForVisibilityOf(By.xpath(Varicella2by2Record));
	  driver.findElement(By.xpath(Varicella2by2Record));
	  highlightElement(By.xpath(Varicella2by2Record));
	  clickUsingJavaScript(By.xpath(Varicella2by2Record));

	  waitForVisibilityOf(By.xpath(Varicella2by2));
	  driver.findElement(By.xpath(Varicella2by2));
	  highlightElement(By.xpath(Varicella2by2));
	  clickUsingJavaScript(By.xpath(Varicella2by2));

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




	  Thread.sleep(10000);

	  waitForVisibilityOf(By.xpath(MMR3by3Record));
	  driver.findElement(By.xpath(MMR3by3Record));
	  highlightElement(By.xpath(MMR3by3Record));
	  clickUsingJavaScript(By.xpath(MMR3by3Record));

	  waitForVisibilityOf(By.xpath(MMR3by3));
	  driver.findElement(By.xpath(MMR3by3)); highlightElement(By.xpath(MMR3by3));
	  clickUsingJavaScript(By.xpath(MMR3by3));

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
	  @Test(priority = 40) public void Health4Years6MonthsVisitVaccine() throws
	  InterruptedException { Thread.sleep(10000);

		waitForVisibilityOf(By.xpath(HealthProfile));
		driver.findElement(By.xpath(HealthProfile));
		highlightElement(By.xpath(HealthProfile));
		clickUsingJavaScript(By.xpath(HealthProfile));

		waitForVisibilityOf(By.xpath(ImmunizationOption));
		driver.findElement(By.xpath(ImmunizationOption));
		highlightElement(By.xpath(ImmunizationOption));
		clickUsingJavaScript(By.xpath(ImmunizationOption));



	  driver.findElement(By.xpath(influenza6by6Record));
	  highlightElement(By.xpath(influenza6by6Record));
	  clickUsingJavaScript(By.xpath(influenza6by6Record));

	

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
	  clickUsingJavaScript(By.xpath(SaveVaccine));}

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

	  waitForVisibilityOf(By.xpath(HPV1by2Record));
	  driver.findElement(By.xpath(HPV1by2Record));
	  highlightElement(By.xpath(HPV1by2Record));
	  clickUsingJavaScript(By.xpath(HPV1by2Record));

	  waitForVisibilityOf(By.xpath(HPV1by2Record));
	  driver.findElement(By.xpath(HPV1by2Record));
	  highlightElement(By.xpath(HPV1by2Record));
	  clickUsingJavaScript(By.xpath(HPV1by2Record));

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
