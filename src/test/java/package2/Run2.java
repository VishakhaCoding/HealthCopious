/*
 * package package2;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.JavascriptExecutor;
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.testng.annotations.BeforeClass; import org.testng.annotations.Test;
 * 
 * public class Run2 { public static WebDriver driver;
 * 
 * // public static String doctorLoginLink = //
 * "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
 * public static String mobileNumber = "input#phoneNumberId"; public static
 * String sendOTP =
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
 * public static String createPatient = "createPatient"; public static String
 * Number1 =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[1]/mat-form-field[2]/div/div[1]/div/input";
 * public static String confirm =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[1]/div";
 * public static String confirmPopup = "//button[text()='Confirm']"; public
 * static String number2 =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[2]/mat-form-field[2]/div/div[1]/div/input";
 * public static String firstName =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[1]/div/div[1]/div/input";
 * public static String middleName =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[2]/div/div[1]/div/input";
 * public static String lastName =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[3]/div/div[1]/div/input";
 * public static String birthDate =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[1]/div/div[1]/div[1]/input";
 * public static String genFemale = "//*[text()='Female']"; public static String
 * address =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[1]/div/div[1]/div/input";
 * public static String locality =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[2]/div/div[1]/div/input";
 * public static String city =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[3]/div/div[1]/div/input";
 * public static String pinCode =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[7]/mat-form-field/div/div[1]/div/input";
 * public static String Next =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[8]/button[2]";
 * public static String proceedWithSameRMN =
 * "//*[text()='Proceed With same RMN']"; public static String clickClose =
 * "/html/body/ngb-modal-window/div/div/div[1]/div/button"; public static String
 * selectDelivery =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[1]/mat-form-field[3]/div/div[1]/div/mat-select";
 * public static String normalDelivery = "//*[text()='Normal']"; public static
 * String weight =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[5]/mat-form-field[1]/div/div[1]/div/input";
 * public static String height =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[5]/mat-form-field[2]/div/div[1]/div/input";
 * public static String HC =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[5]/mat-form-field[3]/div/div[1]/div/input";
 * public static String CC =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[6]/mat-form-field[1]/div/div[1]/div/input";
 * public static String BP =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[6]/mat-form-field[2]/div/div[1]/div/input";
 * public static String BPdia =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[6]/mat-form-field[3]/div/div[1]/div/input";
 * public static String vaccinationDate = "//*[@id='mat-input-94']"; public
 * static String bloodGrp =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[7]/mat-form-field[2]/div/div[1]/div/mat-select";
 * public static String bloodGrpOplus = "//*[text()='O+']"; public static String
 * antentalNext =
 * "//*[@id='cdk-step-content-0-1']/form/div[2]/div[8]/button[2]"; public static
 * String medicalConditions =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[1]/mat-form-field[1]/div/div[1]/div[1]/input";
 * public static String allergies =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[1]/mat-form-field[2]/div/div[1]/div/input";
 * public static String reactionToDrugs =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[2]/mat-form-field[1]/div/div[1]/div/input";
 * public static String recurringComplaints =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[2]/mat-form-field[2]/div/div[1]/div/input";
 * public static String hospitalization =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[3]/mat-form-field[1]/div/div[1]/div/input";
 * public static String healthHistory =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[3]/mat-form-field[2]/div/div[1]/div/input";
 * public static String emailID =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[4]/mat-form-field[1]/div/div[1]/div/input";
 * public static String UHID =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[4]/mat-form-field[2]/div/div[1]/div/input";
 * public static String geneticDisorder =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[5]/mat-form-field/div/div[1]/div[1]/input";
 * public static String healthNext =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[6]/button[2]";
 * public static String fatherHeightFt =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[1]/div[2]/mat-form-field[1]/div/div[1]/div/input";
 * public static String fatherHeightinch =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[1]/div[2]/mat-form-field[2]/div/div[1]/div/input";
 * public static String motherHeightFt =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[2]/div[2]/mat-form-field[1]/div/div[1]/div/input";
 * public static String motherHeightinch =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[2]/div[2]/mat-form-field[2]/div/div[1]/div/input";
 * public static String familyNext =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[5]/button[2]";
 * public static String success = "//*[text()='Success']"; public static String
 * age =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[2]/div/div[1]/div/input";
 * public static String familyProfile =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[1]/mat-step-header[4]/div[3]/div";
 * public static String Done = "/html/body/ngb-modal-window/div/div/div[3]/div";
 * public static String SelectDate =
 * "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[1]/td[2]/div[1]";
 * public static String SelectMonth =
 * "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[4]/div[1]";
 * public static String ClickYearDropdown =
 * "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]";
 * public static String AddNewPrescription =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[1]/img";
 * public static String ClearCompalaint =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[2]/app-prescription-live-preview/div/div/div[1]/div[2]/label[2]/span[2]";
 * 
 * public static String ChiefComplaints =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div/div/div[8]/app-cutom-card/div";
 * public static String ComplaintDetails =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[1]";
 * public static String MoreSymptoms =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[3]/div/div/div[8]";
 * public static String VitalsOption =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[2]";
 * public static String VitalsButton =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]";
 * public static String Rxweight =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
 * public static String RxBP =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[3]/div/div[2]/div/mat-form-field/div/div[1]/div[3]/input";
 * public static String vitals =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]";
 * public static String vitalWeihgt = "mat-input-0"; public static String
 * vitalHeihgt = "mat-input-1"; public static String headCircumferance =
 * "mat-input-17";
 * 
 * public static String BpAndHeart = "mat-tab-label-0-1"; public static String
 * BPSys = "mat-input-4"; public static String BPDia = "mat-input-5"; public
 * static String heartRate = "mat-input-6"; public static String pulse =
 * "mat-input-7"; public static String BloodAndAnalysis =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[3]";
 * public static String Haemoglobin =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[1]/mat-form-field/div/div[1]/div[3]/input";
 * public static String BloodSugarRandom =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
 * public static String BloodSugarF =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[3]/mat-form-field/div/div[1]/div[3]/input";
 * public static String BloodSugarPP =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[4]/mat-form-field/div/div[1]/div[3]/input";
 * public static String Blood =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[3]/div/div/div/div/div[5]/mat-form-field/div/div[1]/div[3]/input";
 * public static String LipidProfile =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[4]";
 * public static String CholestrerolHDL =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[1]/mat-form-field/div/div[1]/div[3]/input";
 * public static String CholestrerolLDL =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[2]/mat-form-field/div/div[1]/div[3]/input";
 * public static String totalCholesterol =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[3]/mat-form-field/div/div[1]/div[3]/input";
 * public static String Triglycerides =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/div/mat-tab-body[4]/div/div/div/div/div[4]/mat-form-field/div/div[1]/div[3]/input";
 * public static String OnExamination =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[3]";
 * public static String SearchExamination =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[3]/div/div/div/div[1]/div[2]/div/div/input";
 * public static String ExaminationNew =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[3]/div/div/div/div[1]/div[2]/button";
 * public static String Examination =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[4]/app-cutom-card/div";
 * public static String DiagnosisOption =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[4]";
 * public static String SearchDiagnosis =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[4]/div/div/div/div[1]/div[2]/div/div/input";
 * public static String DiagnosisNew =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[4]/div/div/div/div[1]/div[2]/button";
 * public static String Diagnosis = "//*[text()='NODULAR URTICARIA ']"; public
 * static String medicineSearch =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/input";
 * public static String Dolocare =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/ngb-typeahead-window/button[1]/ngb-highlight[1]";
 * public static String MedAddtoList = "//div[text()='Add to List']";
 * 
 * public static String Instruction =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[4]/div/app-language-select-textbox/div/input";
 * public static String AddNewDrug =
 * "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div";
 * 
 * public static String PopularOption = "//div[text()=' Popular ']"; public
 * static String PopularSearch =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[1]/input";
 * public static String PopularMedicineClick =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[3]/div[1]/div/img";
 * public static String FavouriteOption =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[1]/div/div[2]/div[3]";
 * public static String FavouriteSearch =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/input";
 * public static String FavouriteClick = "span.mat-option-text"; public static
 * String FavouriteClickMedicine =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[2]/div/div/img";
 * 
 * public static String DietaryAdviceOption =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[6]";
 * 
 * public static String DietaryAdd =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[2]/div[1]/div/div/div[4]/app-cutom-card/div/div";
 * public static String DietaryAdvice =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[6]/div/div/div/div[2]/div[1]/div/div/div[1]/app-cutom-card/div";
 * public static String GeneralInstruction =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[7]/div[1]";
 * public static String GenInstruction =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[2]/div[1]/div/div/div[1]/app-cutom-card/div";
 * 
 * public static String prescriptionSave =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[1]/div[1]";
 * public static String prescriptionProceed =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[1]/div[2]";
 * public static String InstructionImpNote =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[2]/app-prescription-live-preview/div/div/mat-chip-list/div/mat-chip[2]";
 * public static String FollowupTypes =
 * "//*[@class='ng-star-inserted']/ following::mat-select[5]"; public static
 * String Appointment = "//*[text()=' Call ']"; public static String
 * FollowupMessage =
 * "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[1]/div[2]/div[2]/mat-chip-list/div/mat-chip[2]";
 * 
 * public static String ConfirmandPrint = "button.btn-confirm"; public static
 * String prescriptionDone =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-prescriptionpreview/div[1]/div/div[3]/div";
 * public static String ChoosePharmacy =
 * "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/mat-form-field/div/div[1]/div/mat-select/div/div[1]";
 * public static String TestPharmacy =
 * "/html/body/div[4]/div[4]/div/div/div/mat-option[1]/span"; public static
 * String ShareWhatsapp =
 * "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div[2]/div[1]";
 * public static String ShareEmail =
 * "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div[2]/div[2]";
 * public static String ShareInHealthapp =
 * "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div[5]/div[2]/div";
 * public static String GoHome = "//*[text()='Go Home']"; public static String
 * Medpageinstruction =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[4]/div/app-language-select-textbox/div/input";
 * public static String Doctor =
 * "/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/div[3]/div";
 * // public static String nextFollowupDate = //
 * "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div[2]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div/div[1]/div[2]/mat-datepicker-toggle/button/span[1]]";
 * public static String nextFollowupSelectDate =
 * "div.mat-calendar-body-cell-content.mat-focus-indicator"; // public static
 * String SPO2 = //
 * "input.mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-11";
 * 
 * public static String ClickHome = "//*[text()=' Home']"; public static String
 * clickPatient = "li.clearfix"; public static String InstructionAdd =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[7]/div/div/div/div[1]/div[3]/div/div/button";
 * 
 * public static String AddNewAppointment =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[2]";
 * public static String EnterTime =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[2]/div[2]/div[2]/div[1]/input";
 * public static String SelectSlot =
 * "/html/body/div[2]/div[4]/div/mat-dialog-container/div/div[2]/form[2]/div/div/div/div[39]/div";
 * public static String BookAppointment =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div[2]/button";
 * 
 * public static String nextFollowupDate =
 * "button.mat-focus-indicator.mat-icon-button";
 * 
 * public static String RxCC =
 * ".mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-48";
 * public static String temperature =
 * ".mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-10";
 * public static String SPO2 =
 * ".mat-input-element.mat-form-field-autofill-control.mat-tooltip-trigger.ng-tns-c164-11";
 * public static String AnyGeneticDisorder =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[5]/mat-form-field/div/div[1]/div[1]/input";
 * public static String FamilyMedicalHistory =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[3]/mat-form-field/div/div[1]/div[1]/input";
 * public static String EnterDisorder =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[4]/mat-form-field/div/div[1]/div[1]/input";
 * public static String prefferedLanguage =
 * "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[7]/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]/span";
 * public static String prefferedLanguageEnglish =
 * "/html/body/div[2]/div[4]/div/div/div/mat-option[1]/span"; public static
 * String Medicine =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[5]";
 * public static String clickContinue =
 * "/html/body/ngb-modal-window/div/div/div[2]/div/div/div[5]/span"; public
 * static String AppointmentBooked =
 * "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/p-toast/div/p-toastitem/div/div/div/div[2]/div[2]";
 * 
 * public static void waitForVisibilityOf(By by) { try {
 * 
 * driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //
 * JavascriptExecutor jse = (JavascriptExecutor)driver; } catch (Exception e) {
 * e.printStackTrace(); }
 * 
 * }
 * 
 * public static void clickUsingJavaScript(By by) {
 * 
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("arguments[0].click();", driver.findElement(by)); }
 * 
 * public static void highlightElement(By by) { JavascriptExecutor js =
 * (JavascriptExecutor) driver; js.
 * executeScript("arguments[0].setAttribute('style', 'background: grey; border: 2px solid black;');"
 * , driver.findElement(by)); }
 * 
 * @BeforeClass public void setUp() {
 * 
 * System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
 * 
 * driver = new ChromeDriver(); driver.manage().timeouts().implicitlyWait(60,
 * TimeUnit.SECONDS); driver.manage().window().maximize();
 * //driver.get("http://stage.copious.care:4200/"); //
 * driver.manage().window().fullscreen();
 * driver.get("https://opd.copious.care/"); //
 * driver.get("https://stage.copious.care/");
 * driver.manage().window().fullscreen(); }
 * 
 * @Test(priority = 1, groups = "Regression") public void numberField() {
 * waitForVisibilityOf(By.cssSelector(mobileNumber));
 * driver.findElement(By.cssSelector(mobileNumber)).sendKeys("9665002440");
 * highlightElement(By.cssSelector(mobileNumber));
 * clickUsingJavaScript(By.cssSelector(mobileNumber)); }
 * 
 * @Test(priority = 2, groups = "Regression") public void sendOTP() throws
 * InterruptedException { Thread.sleep(5000);
 * waitForVisibilityOf(By.xpath(sendOTP)); highlightElement(By.xpath(sendOTP));
 * clickUsingJavaScript(By.xpath(sendOTP));
 * 
 * waitForVisibilityOf(By.xpath(OTP1));
 * driver.findElement(By.xpath(OTP1)).sendKeys("1");
 * highlightElement(By.xpath(OTP1));
 * 
 * Thread.sleep(2000); waitForVisibilityOf(By.xpath(OTP2));
 * driver.findElement(By.xpath(OTP2)).sendKeys("4");
 * highlightElement(By.xpath(OTP2));
 * 
 * waitForVisibilityOf(By.xpath(OTP3));
 * driver.findElement(By.xpath(OTP3)).sendKeys("0");
 * highlightElement(By.xpath(OTP3));
 * 
 * waitForVisibilityOf(By.xpath(OTP4));
 * driver.findElement(By.xpath(OTP4)).sendKeys("5");
 * highlightElement(By.xpath(OTP4));
 * 
 * waitForVisibilityOf(By.xpath(OTP5));
 * driver.findElement(By.xpath(OTP5)).sendKeys("2");
 * highlightElement(By.xpath(OTP5));
 * 
 * waitForVisibilityOf(By.xpath(OTP6));
 * driver.findElement(By.xpath(OTP6)).sendKeys("0");
 * highlightElement(By.xpath(OTP6));
 * 
 * }
 * 
 * @Test(priority = 3) public void verifyButton() throws InterruptedException {
 * Thread.sleep(10000); waitForVisibilityOf(By.xpath(verifyOTP));
 * driver.findElement(By.xpath(verifyOTP));
 * highlightElement(By.xpath(verifyOTP));
 * clickUsingJavaScript(By.xpath(verifyOTP));
 * 
 * }
 * 
 * @Test(priority = 4, groups = "Regression") public void createPatient() {
 * waitForVisibilityOf(By.id(createPatient));
 * highlightElement(By.id(createPatient));
 * clickUsingJavaScript(By.id(createPatient));
 * driver.findElement(By.id(createPatient)); }
 * 
 * @Test(priority = 5, groups = "Regression") public void Number1() {
 * waitForVisibilityOf(By.xpath(Number1));
 * driver.findElement(By.xpath(Number1)).sendKeys("1234567891");
 * highlightElement(By.xpath(Number1)); clickUsingJavaScript(By.xpath(Number1));
 * }
 * 
 * @Test(priority = 6, groups = "Regression") public void confirm() throws
 * InterruptedException {
 * 
 * waitForVisibilityOf(By.xpath(confirm));
 * driver.findElement(By.xpath(confirm)); highlightElement(By.xpath(confirm));
 * clickUsingJavaScript(By.xpath(confirm));
 * clickUsingJavaScript(By.xpath(proceedWithSameRMN));
 * 
 * System.out.println("package running 2"); }
 * 
 * }
 */