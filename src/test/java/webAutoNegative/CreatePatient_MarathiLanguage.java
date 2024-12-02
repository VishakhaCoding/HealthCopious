package webAutoNegative;

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
import org.testng.annotations.Test;

public class CreatePatient_MarathiLanguage {
	public static WebDriver driver;

	//Login	   
    public static String mobileNumber="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
    public static String sendOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
    public static String verifyOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
   
  //OTP code
	   public static String OTP1="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]"; 
	   public static String OTP2="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]"; 
	   public static String OTP3="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]"; 
	   public static String OTP4="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	   public static String OTP5="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	   public static String OTP6="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]";
 
    
    
//Create Pediatric Patient    
    public static String doctorLoginLink="/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
    //public static String mobileNumber="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
   // public static String sendOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
    //public static String verifyOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
    public static String createPatient="createPatient";
    public static String Number1="//*[text()='Profile']//following::input[4]";
    public static String confirm="//*[text()='Confirm']";
    public static String confirmPopup="//button[text()='Confirm']";
    public static String number2="//*[text()='Profile']//following::input[6]";
    public static String firstName="//*[text()='Profile']//following::input[7]";
    public static String middleName="//*[text()='Profile']//following::input[8]";
    public static String lastName="//*[text()='Profile']//following::input[9]";
    public static String birthDate="//*[text()='Profile']//following::button[5]";
    public static String genFemale="//*[text()='Female']";
    public static String address="//*[text()='Profile']//following::input[12]";
    public static String locality="//*[text()='Profile']//following::input[13]";
    public static String city="//*[text()='Profile']//following::input[14]";
    public static String pinCode="//*[text()='Profile']//following::input[15]";
    public static String Next="//*[text()=' Next']";
    public static String proceedWithSameRMN="//*[text()='Proceed With same RMN ']";
    public static String clickClose="//*[text()='Continue to complete detail profile']";
    public static String selectDelivery="//*[text()='Antenetal & Birth History']//following::span[15]";
    public static String normalDelivery="//*[text()='Normal']";
    public static String weight="//*[text()='Antenetal & Birth History']//following::input[22]";
    public static String height="//*[text()='Antenetal & Birth History']//following::input[23]";
    public static String HC="//*[text()='Antenetal & Birth History']//following::input[24]";
    public static String CC="//*[text()='Antenetal & Birth History']//following::input[25]";
    public static String BP="//*[text()='Antenetal & Birth History']//following::input[26]";
    public static String BPdia="//*[text()='Antenetal & Birth History']//following::input[27]";
    public static String vaccinationDate="//*[@xpath='mat-input-94']";
    public static String bloodGrp="//*[text()=' Back']//following::span[11]";
    public static String bloodGrpOplus="//*[text()='O+']";
    public static String antentalNext="//*[text()=' Back']//following::button[5]";
    public static String medicalConditions="//*[text()='Health Profile']//following::input[19]";
    
    
    
    public static String allergies="//*[text()='Health Profile']//following::input[20]";
    public static String reactionToDrugs="//*[text()='Health Profile']//following::input[21]";
    public static String recurringComplaints="//*[text()='Health Profile']//following::input[22]";
    public static String hospitalization="//*[text()='Health Profile']//following::input[23]";
    public static String healthHistory="//*[text()='Health Profile']//following::input[24]";
    public static String emailID="//*[text()='Health Profile']//following::input[25]";
    public static String UHID="//*[text()='Health Profile']//following::input[26]";
    public static String geneticDisorder="//*[text()='Health Profile']//following::input[27]";
    public static String healthNext="//*[text()='Health Profile']//following::button[16]";
    public static String fatherHeightFt="//*[text()='Family Profile']//following::input[19]";
    public static String fatherHeightinch="//*[text()='Family Profile']//following::input[20]";
    public static String motherHeightFt="//*[text()='Family Profile']//following::input[21]";
    public static String motherHeightinch="//*[text()='Family Profile']//following::input[22]";
    public static String familyNext="//*[text()='Family Profile']//following::button[13]";
    public static String success="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/div[1]/div[1]/div[1]/div[1]/div";
    public static String age="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[2]/div/div[1]/div/input";
    
    public static String SelectDate="//*[text()=' 1 ']";		
	
	public static String AddNewPrescription = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[1]/img";
	//public static String ClearCompalaint = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[2]/app-prescription-live-preview/div/div/div[1]/div[2]/label[2]/span[2]";
	 public static String prefferedLanguage="//*[text()='Preferred Language']";
	    public static String prefferedLanguageEnglish="//*[text()=' English ']";
	    public static String FamilyMedicalHistory = "//*[text()='Family Profile']//following::input[23]";
  		public static String EnterDisorder = "//*[text()='Family Profile']//following::input[24]";
  		public static String AnyGeneticDisorder = "//*[text()='Health Profile']//following::input[27]";
	public static String familyProfile = "/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[1]/mat-step-header[4]/div[3]/div";
	public static String Done = "/html/body/ngb-modal-window/div/div/div[3]/div";
	//public static String SelectDate = "//*[text()=' 1 ']";
	public static String SelectMonth = "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[4]/div[1]";
	public static String ClickYearDropdown = "/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]";
	//public static String AddNewPrescription = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[1]/img";
	public static String ClearCompalaint = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/div[2]/app-prescription-live-preview/div/div/div[1]/div[2]/label[2]/span[2]";

	//public static String AddNewPrescription= "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a[1]/li/a/div/div[3]/figure/a[1]";
	
	
	public static String VitalsOption = "//*[text()='Vitals']";
	public static String VitalsButton = "//*[text()='Vital']";
	public static String vitals = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[2]/div/div/app-add-vitals/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]";
	public static String vitalWeihgt = "//*[text()='Vitals']//following::input[1]";
	public static String vitalHeihgt = "//*[text()='Vitals']//following::input[2]";
	public static String headCircumferance = "//*[text()='Vitals']//following::input[3]";
	//public static String CC = "//*[text()='Vitals']//following::input[4]";
	public static String RxCC = "//*[text()='Vitals']//following::input[4]";
	public static String temperature = "//*[text()='Vitals']//following::input[5]";
	public static String SPO2 = "//*[text()='Vitals']//following::input[6]";
	//public static String temperature = "mat-input-2";
	public static String BpAndHeart = "//*[text()='BP & Heart']";
	public static String BPSys = "mat-input-4";
	public static String BPDia = "mat-input-5";
	public static String heartRate = "mat-input-6";
	public static String pulse = "mat-input-7";
	public static String BloodAndAnalysis = "//*[text()='Blood Analysis(Sugar)	']";
	public static String Haemoglobin = "//*[text()='Blood Analysis(Sugar)	']//following::input[1]";
	public static String BloodSugarRandom = "//*[text()='Blood Analysis(Sugar)	']//following::input[2]";
	public static String BloodSugarF = "//*[text()='Blood Analysis(Sugar)	']//following::input[3]";
	public static String BloodSugarPP = "//*[text()='Blood Analysis(Sugar)	']//following::input[4]";
	public static String Blood = "//*[text()='Blood Analysis(Sugar)	']//following::input[5]";
	public static String LipidProfile = "//*[text()='Lipid Profile']";
	public static String CholestrerolHDL = "//*[text()='Lipid Profile']//following::input[1]";
	public static String CholestrerolLDL = "//*[text()='Lipid Profile']//following::input[2]";
	public static String totalCholesterol = "//*[text()='Lipid Profile']//following::input[3]";
	public static String Triglycerides = "//*[text()='Lipid Profile']//following::input[4]";
	public static String OnExamination = "//*[text()='On Examination']";
	public static String DiagnosisOption = "//*[text()=' Diagnosis ']";
	public static String Diagnosis = "//*[text()='RESPIRATORY TRACK INFECTION ']";
	public static String Medicine = "//*[text()=' Medicines ']";
	public static String medicineSearch = "//*[text()=' Medicines ']//following::input[9]";
	public static String Dolocare = "//*[text()='DOLO']";
	public static String MedAddtoList = "//*[text()='Add to List']";
	//public static String newDrug = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[1]/div[2]/div";
	public static String Instruction = "//*[text()='Medicines']//following::input[6]";
	public static String InstructionAdd = "//*[text()='Can mix all supplements except iron supplement ']";
	public static String ChiefComplaints = "//*[text()='Fever ']  ";
	public static String ComplaintDetails = "//*[text()='Highgrade'] ";
	public static String MoreSymptoms = "//*[text()='with chills'] ";
	public static String PopularOption = "//div[text()=' Popular ']";
	public static String PopularSearch = "//*[text()= ' Popular ']//following::input";
	public static String PopularMedicineClick = "//*[text()= ' Popular ']//following::Img";
	public static String FavouriteOption = "//*[text()= ' Favourite ']";
	public static String FavouriteSearch = "//*[text()= ' Favourite ']//following::input[1]";
	public static String FavouriteClick = "//*[text()= ' Favourite ']//following::mat-option";
	public static String FavouriteClickMedicine = "//*[text()= ' Favourite ']//following::img";
	public static String DietaryAdviceOption = "//*[text()= ' Dietary Advice ']";
	public static String DietaryAdd = "//*[text()= 'Eat green vegetables ']";
	public static String GeneralInstruction = "//*[text()='Instructions']";
	public static String GenInstruction = "//*[text()='Can mix all supplements except iron supplement ']";
	public static String prescriptionSave = "//*[text()=' Save']";
	public static String prescriptionProceed = "//*[text()=' Proceed']";
	public static String InstructionImpNote = "//*[text()=' If no relief on taking medicines visit doctor immediately ']";
	public static String FollowupTypes = "//*[text()='Confirm Prescription']//following::span[5]";
	public static String Appointment = "//*[text()=' Call ']";
	public static String ConfirmandPrint = "//*[text()='Confirm and Print']";
	public static String prescriptionDone = "//*[text()=' Done']";
	public static String GoHome = "//*[text()='Go Home']";
	public static String nextFollowupSelectDate = "//*[text()='Confirm Prescription']//following::span[112]";
	public static String ClickHome = "//*[text()=' Home']";
	public static String nextFollowupDate = "//*[text()='Confirm Prescription']//following::span[4]";
	public static String Examination = "//*[text()='THROAT - NORMAL '] ";
	public static String clickPatient = "li.clearfix";
	
	//Create appointment	
		public static String AddNewAppointment = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[2]";
		public static String EnterTime = "//*[text()='Profile']//following::input[5]";
		public static String SelectSlot = "//*[text()=' 04:55 pm']";
		public static String BookAppointment = "//*[text()='Book Appointment']";
		public static String clickContinue = "//*[text()='Continue to complete detail profile']";
		public static String AppointmentBooked = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/p-toast/div/p-toastitem/div/div/div/div[2]/div[2]";

		
    public static void waitForVisibilityOf(By by) {
    	 try {
    	    	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    	      //  JavascriptExecutor jse = (JavascriptExecutor)driver;
    	    }
    	    catch(Exception e) {
    	        e.printStackTrace();
    	    }
    	
        }
        public static void clickUsingJavaScript(By by) {
       		
   	 JavascriptExecutor js= (JavascriptExecutor)driver;
   	 js.executeScript("arguments[0].click();", driver.findElement(by));
        }
        
        public static void highlightElement(By by) {
   	 JavascriptExecutor js= (JavascriptExecutor)driver;
   	 js.executeScript("arguments[0].setAttribute('style', 'background: grey; border: 2px solid black;');", driver.findElement(by));
        }
        
        
        @BeforeClass
        public void setUp() {
    	
            System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://app.copious.care/");
		//driver.get("http://stage.copious.care:4200/");
		//driver.get("https://stage.copious.care/");
		driver.manage().window().fullscreen();

 }
        
        
	
        
        @Test(priority=1)
      	public  void numberField() throws InterruptedException {
        	Thread.sleep(5000);
        	waitForVisibilityOf(By.xpath(mobileNumber));
    		driver.findElement(By.xpath(mobileNumber)).sendKeys("9665002440");
    		highlightElement(By.xpath(mobileNumber));
    		clickUsingJavaScript(By.xpath(mobileNumber));
        }
        @Test(priority=2)
        public  void sendOTP() throws InterruptedException {
        	
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
        @Test(priority=3)
    	public  void verifyButton() throws InterruptedException {
        	Thread.sleep(10000);
    	waitForVisibilityOf(By.xpath(verifyOTP));
    	//driver.findElement(By.xpath(verifyOTP));
    	highlightElement(By.xpath(verifyOTP));
    	clickUsingJavaScript(By.xpath(verifyOTP));
    	}
       
        @Test(priority=4)
     	public  void createPatient() {
        waitForVisibilityOf(By.id(createPatient));
     	highlightElement(By.id(createPatient));
     	clickUsingJavaScript(By.id(createPatient));
     	//driver.findElement(By.xpath(createPatient)).click();
     	}
        @Test(priority=5)
      	public  void Number1() {
      	waitForVisibilityOf(By.xpath(Number1));
      	driver.findElement(By.xpath(Number1)).sendKeys("1234567891");
      	highlightElement(By.xpath(Number1));
    	clickUsingJavaScript(By.xpath(Number1));
        }
        @Test(priority=6)
      	public  void confirm() {
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
        @Test(priority=7)
      	public  void number2() {
      	waitForVisibilityOf(By.xpath(number2));
      	driver.findElement(By.xpath(number2)).sendKeys("१२३४५६७८९२");;
      	highlightElement(By.xpath(number2));
    	clickUsingJavaScript(By.xpath(number2));
        }
     

		
		  @Test(priority=8) public void firstName() {
		  waitForVisibilityOf(By.xpath(firstName));
		  driver.findElement(By.xpath(firstName)).sendKeys("मराठी");;
		  highlightElement(By.xpath(firstName));
		  clickUsingJavaScript(By.xpath(firstName)); }
		  
		  @Test(priority=9) public void middleName() {
		  waitForVisibilityOf(By.xpath(middleName));
		  driver.findElement(By.xpath(middleName)).sendKeys("ऑटोमेशन");;
		  highlightElement(By.xpath(middleName));
		  clickUsingJavaScript(By.xpath(middleName)); }
		  
		  @Test(priority=10) public void lastName() {
		  waitForVisibilityOf(By.xpath(lastName));
		  driver.findElement(By.xpath(lastName)).sendKeys("ऑटोमेशन");;
		  highlightElement(By.xpath(lastName));
		  clickUsingJavaScript(By.xpath(lastName)); }
		 
        @Test(priority=11)
      	public  void birthDate() throws InterruptedException {
			
	    waitForVisibilityOf(By.xpath(birthDate));
    	highlightElement(By.xpath(birthDate));
		 driver.findElement(By.xpath(birthDate));
		 clickUsingJavaScript(By.xpath(birthDate));
		 
		
		 
		 waitForVisibilityOf(By.xpath(SelectDate)); 
		 highlightElement(By.xpath(SelectDate));
		 driver.findElement(By.xpath(SelectDate));
		 clickUsingJavaScript(By.xpath(SelectDate));
        }

        @Test(priority=12)
      	public  void genFemale() {
      	waitForVisibilityOf(By.xpath(genFemale));
      	driver.findElement(By.xpath(genFemale));
      	highlightElement(By.xpath(genFemale));
    	clickUsingJavaScript(By.xpath(genFemale));
        }
        @Test(priority=13)
      	public  void address() {
      	waitForVisibilityOf(By.xpath(address));
      	driver.findElement(By.xpath(address)).sendKeys("पत्ता");;
      	highlightElement(By.xpath(address));
    	clickUsingJavaScript(By.xpath(address));
        }
        @Test(priority=14)
      	public  void locality() {
      	waitForVisibilityOf(By.xpath(locality));
      	driver.findElement(By.xpath(locality)).sendKeys("परिसर");
      	highlightElement(By.xpath(locality));
    	clickUsingJavaScript(By.xpath(locality));
        }
        @Test(priority=15)
      	public  void city() {
      	waitForVisibilityOf(By.xpath(city));
      	driver.findElement(By.xpath(city)).sendKeys("शहर");;
      	highlightElement(By.xpath(city));
    	clickUsingJavaScript(By.xpath(city));
        }
        @Test(priority=16)
      	public  void pinCode() {
      	waitForVisibilityOf(By.xpath(pinCode));
      	driver.findElement(By.xpath(pinCode)).sendKeys("४१२३०६");
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
        @Test(priority=18)
        public void nextButton() throws InterruptedException {
        	Thread.sleep(15000);
            waitForVisibilityOf(By.xpath(Next));
          driver.findElement(By.xpath(Next));
          	highlightElement(By.xpath(Next));
        	clickUsingJavaScript(By.xpath(Next));
            
        }

		
		
		 
		 
		
		  @Test(priority=19) public void clickClose() {
		  waitForVisibilityOf(By.xpath(clickContinue));
		  
		  highlightElement(By.xpath(clickContinue));
		  clickUsingJavaScript(By.xpath(clickContinue));
		  
		  }
		 
        @Test(priority=20,retryAnalyzer = webAutoNegative.Demo_MyRetry.class)
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
        	driver.findElement(By.xpath(weight)).sendKeys("४.१");
        	Assert.assertEquals(4.1, 4.1,"doesnt match");
          	
        	highlightElement(By.xpath(HC));
        	driver.findElement(By.xpath(HC)).sendKeys("४");
          	
        	highlightElement(By.xpath(CC));
        	driver.findElement(By.xpath(CC)).sendKeys("४");
          	
        	highlightElement(By.xpath(BP));
        	driver.findElement(By.xpath(BP)).sendKeys("८०");
          	
        	highlightElement(By.xpath(BPdia));
          	driver.findElement(By.xpath(BPdia)).sendKeys("१२०");
          	
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
        @Test(priority=21)
        public void fillHealthProfile() throws InterruptedException {
        	Thread.sleep(10000);

            waitForVisibilityOf(By.xpath(medicalConditions));
           highlightElement(By.xpath(medicalConditions));
          	driver.findElement(By.xpath(medicalConditions)).sendKeys("उच्च रक्तदाब,मधुमेह");
        	
            waitForVisibilityOf(By.xpath(allergies));
           highlightElement(By.xpath(allergies));
          	driver.findElement(By.xpath(allergies)).sendKeys("धूळ");

        	highlightElement(By.xpath(reactionToDrugs));
          	driver.findElement(By.xpath(reactionToDrugs)).sendKeys("yes");
          	
        	highlightElement(By.xpath(recurringComplaints));
          	driver.findElement(By.xpath(recurringComplaints)).sendKeys("होय");
          	
        	highlightElement(By.xpath(hospitalization));
          	driver.findElement(By.xpath(hospitalization)).sendKeys("होय");
          	
        	highlightElement(By.xpath(healthHistory));
          	driver.findElement(By.xpath(healthHistory)).sendKeys("काहीही नाही");
          	
        	highlightElement(By.xpath(emailID));
          	driver.findElement(By.xpath(emailID)).sendKeys("vishu@123testtest.com");
          	
        	highlightElement(By.xpath(UHID));
          	driver.findElement(By.xpath(UHID)).sendKeys("काहीही नाही");
          	
        	highlightElement(By.xpath(AnyGeneticDisorder));
    		driver.findElement(By.xpath(AnyGeneticDisorder)).sendKeys("स्मृतिभ्रंश");
    		;
          	
        	highlightElement(By.xpath(healthNext));
          	driver.findElement(By.xpath(healthNext));
          	clickUsingJavaScript(By.xpath(healthNext));
          	
          	//highlightElement(By.xpath(familyProfile));
          	//driver.findElement(By.xpath(familyProfile));
            
        }
        @Test(priority=22)
        public void fillFamilyProfile() throws InterruptedException {
        	Thread.sleep(15000);
            waitForVisibilityOf(By.xpath(fatherHeightFt));
           
          	highlightElement(By.xpath(fatherHeightFt));
          	driver.findElement(By.xpath(fatherHeightFt)).sendKeys("५");
        	
        	highlightElement(By.xpath(fatherHeightinch));
        	driver.findElement(By.xpath(fatherHeightinch)).sendKeys("१०");
        	
        	highlightElement(By.xpath(motherHeightFt));
        	driver.findElement(By.xpath(motherHeightFt)).sendKeys("५");
        	
        	highlightElement(By.xpath(motherHeightinch));
        	driver.findElement(By.xpath(motherHeightinch)).sendKeys("४");
        	
        	highlightElement(By.xpath(FamilyMedicalHistory));
    		driver.findElement(By.xpath(FamilyMedicalHistory)).sendKeys("उच्च रक्तदाब,मधुमेह");

    		highlightElement(By.xpath(EnterDisorder));
    		driver.findElement(By.xpath(EnterDisorder)).sendKeys("शारीरिकदृष्ट्या आव्हानात्मक");
        	
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
    	@Test(priority = 23)
    	public void GoHome() throws InterruptedException {
    		waitForVisibilityOf(By.xpath(ClickHome));
    		driver.findElement(By.xpath(ClickHome));
    		highlightElement(By.xpath(ClickHome));
    		clickUsingJavaScript(By.xpath(ClickHome));

    	}

    	@Test(priority = 24)
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

    	@Test(priority = 25)
    	public void AddPrescription() throws InterruptedException {
    		Thread.sleep(15000);
    		waitForVisibilityOf(By.xpath(AddNewPrescription));
    		driver.findElement(By.xpath(AddNewPrescription));
    		highlightElement(By.xpath(AddNewPrescription));
    		clickUsingJavaScript(By.xpath(AddNewPrescription));

    	}

    	@Test(priority = 26)
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

    	@Test(priority = 27)
    	public void VitalsOption() throws InterruptedException {

    		Thread.sleep(3000); // driver.manage().window().fullscreen();
    		waitForVisibilityOf(By.xpath(VitalsOption));
    		driver.findElement(By.xpath(VitalsOption));
    		highlightElement(By.xpath(VitalsOption));
    		clickUsingJavaScript(By.xpath(VitalsOption));

    		waitForVisibilityOf(By.xpath(VitalsButton));
    		driver.findElement(By.xpath(VitalsButton));
    		highlightElement(By.xpath(VitalsButton));
    		clickUsingJavaScript(By.xpath(VitalsButton));

    		highlightElement(By.xpath(vitalWeihgt));
    		driver.findElement(By.xpath(vitalWeihgt)).clear();
    		driver.findElement(By.xpath(vitalWeihgt)).sendKeys("१३.५");

    		highlightElement(By.xpath(vitalHeihgt));
    		driver.findElement(By.xpath(vitalHeihgt)).clear();
    		driver.findElement(By.xpath(vitalHeihgt)).sendKeys("१००");

    		highlightElement(By.xpath(headCircumferance));
    		driver.findElement(By.xpath(headCircumferance)).clear();
    		driver.findElement(By.xpath(headCircumferance)).sendKeys("५");

    		highlightElement(By.xpath(RxCC));
    		driver.findElement(By.xpath(RxCC)).clear();
    		driver.findElement(By.xpath(RxCC)).sendKeys("९७");

    		highlightElement(By.xpath(temperature));
    		driver.findElement(By.xpath(temperature)).clear();
    		driver.findElement(By.xpath(temperature)).sendKeys("७७");

    		highlightElement(By.xpath(SPO2));
    		driver.findElement(By.xpath(SPO2)).clear();
    		driver.findElement(By.xpath(SPO2)).sendKeys("१०");

    	}

    	@Test(priority = 28)
    	public void BpandHeartOption() throws InterruptedException {

    		Thread.sleep(15000);
    		waitForVisibilityOf(By.xpath(BpAndHeart));
    		driver.findElement(By.xpath(BpAndHeart));
    		highlightElement(By.xpath(BpAndHeart));
    		clickUsingJavaScript(By.xpath(BpAndHeart));

    		highlightElement(By.id(BPSys));
    		driver.findElement(By.id(BPSys)).clear();
    		driver.findElement(By.id(BPSys)).sendKeys("८०");

    		highlightElement(By.id(BPDia));
    		driver.findElement(By.id(BPDia)).clear();
    		driver.findElement(By.id(BPDia)).sendKeys("१००");

    		highlightElement(By.id(heartRate));
    		driver.findElement(By.id(heartRate)).clear();
    		driver.findElement(By.id(heartRate)).sendKeys("७५");

    		highlightElement(By.id(pulse));
    		driver.findElement(By.id(pulse)).clear();
    		driver.findElement(By.id(pulse)).sendKeys("७७");

    	}

    	@Test(priority = 29)
    	public void BloodAndAnalysis() throws InterruptedException {

    		Thread.sleep(15000);
    		waitForVisibilityOf(By.xpath(BloodAndAnalysis));
    		driver.findElement(By.xpath(BloodAndAnalysis));
    		highlightElement(By.xpath(BloodAndAnalysis));
    		clickUsingJavaScript(By.xpath(BloodAndAnalysis));

    		highlightElement(By.xpath(Haemoglobin));
    		driver.findElement(By.xpath(Haemoglobin)).clear();
    		driver.findElement(By.xpath(Haemoglobin)).sendKeys("१२");

    		highlightElement(By.xpath(BloodSugarRandom));
    		driver.findElement(By.xpath(BloodSugarRandom)).clear();
    		driver.findElement(By.xpath(BloodSugarRandom)).sendKeys("११०");

    		highlightElement(By.xpath(BloodSugarF));
    		driver.findElement(By.xpath(BloodSugarF)).clear();
    		driver.findElement(By.xpath(BloodSugarF)).sendKeys("१५०");

    		highlightElement(By.xpath(BloodSugarPP));
    		driver.findElement(By.xpath(BloodSugarPP)).clear();
    		driver.findElement(By.xpath(BloodSugarPP)).sendKeys("१००");

    		highlightElement(By.xpath(Blood));
    		driver.findElement(By.xpath(Blood)).clear();
    		driver.findElement(By.xpath(Blood)).sendKeys("१०");

    	}

    	@Test(priority = 30)
    	public void LipidProfile() throws InterruptedException {

    		Thread.sleep(15000);
    		waitForVisibilityOf(By.xpath(LipidProfile));
    		driver.findElement(By.xpath(LipidProfile));
    		highlightElement(By.xpath(LipidProfile));
    		clickUsingJavaScript(By.xpath(LipidProfile));

    		highlightElement(By.xpath(CholestrerolHDL));
    		driver.findElement(By.xpath(CholestrerolHDL)).clear();
    		driver.findElement(By.xpath(CholestrerolHDL)).sendKeys("३०");

    		highlightElement(By.xpath(CholestrerolLDL));
    		driver.findElement(By.xpath(CholestrerolLDL)).clear();
    		driver.findElement(By.xpath(CholestrerolLDL)).sendKeys("४०");

    		highlightElement(By.xpath(totalCholesterol));
    		driver.findElement(By.xpath(totalCholesterol)).clear();
    		driver.findElement(By.xpath(totalCholesterol)).sendKeys("४०");

    		highlightElement(By.xpath(Triglycerides));
    		driver.findElement(By.xpath(Triglycerides)).clear();
    		driver.findElement(By.xpath(Triglycerides)).sendKeys("४०");

    	}

    	@Test(priority = 31)
    	public void OnExamination() throws InterruptedException {

    		Thread.sleep(15000);
    		waitForVisibilityOf(By.xpath(OnExamination));
    		driver.findElement(By.xpath(OnExamination));
    		highlightElement(By.xpath(OnExamination));
    		clickUsingJavaScript(By.xpath(OnExamination));

    		driver.findElement(By.xpath(Examination));
    		highlightElement(By.xpath(Examination));
    		clickUsingJavaScript(By.xpath(Examination));

    	}

    	@Test(priority = 32)
    	public void Diagnosis() throws InterruptedException {

    		Thread.sleep(15000);

    		waitForVisibilityOf(By.xpath(DiagnosisOption));
    		driver.findElement(By.xpath(DiagnosisOption)); //
    		highlightElement(By.xpath(DiagnosisOption));
    		clickUsingJavaScript(By.xpath(DiagnosisOption));

    		driver.findElement(By.xpath(Diagnosis));
    		highlightElement(By.xpath(Diagnosis));
    		clickUsingJavaScript(By.xpath(Diagnosis));

    	}

    	@Test(priority = 34)
    	public void Medicine1() throws InterruptedException {

    		Thread.sleep(15000);
    		waitForVisibilityOf(By.xpath(Medicine));
    		driver.findElement(By.xpath(Medicine));
    		highlightElement(By.xpath(Medicine));
    		clickUsingJavaScript(By.xpath(Medicine));

    		waitForVisibilityOf(By.xpath(medicineSearch));
    		highlightElement(By.xpath(medicineSearch));
    		driver.findElement(By.xpath(medicineSearch)).sendKeys("dolo");
    		waitForVisibilityOf(By.xpath(Dolocare));
    		highlightElement(By.xpath(Dolocare));
    		clickUsingJavaScript(By.xpath(Dolocare));

    		

    		waitForVisibilityOf(By.xpath(Instruction));
    		highlightElement(By.xpath(Instruction));
    		driver.findElement(By.xpath(Instruction)).sendKeys("पाणी पिणे");
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
    		driver.findElement(By.xpath(FavouriteSearch)).sendKeys("temp");

    		waitForVisibilityOf(By.xpath(FavouriteClick));
    		highlightElement(By.xpath(FavouriteClick));
    		driver.findElement(By.xpath(FavouriteClick));
    		clickUsingJavaScript(By.xpath(FavouriteClick));

    		waitForVisibilityOf(By.xpath(FavouriteClickMedicine));
    		highlightElement(By.xpath(FavouriteClickMedicine));
    		driver.findElement(By.xpath(FavouriteClickMedicine));
    		clickUsingJavaScript(By.xpath(FavouriteClickMedicine));

    	}

    	@Test(priority = 35)
    	public void DietaryAdvice() throws InterruptedException {

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

    	@Test(priority = 36)
    	public void GeneralInstruction() throws InterruptedException {

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

    		Thread.sleep(5000);

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

    		/*
    		 * waitForVisibilityOf(By.xpath(FollowupMessage));
    		 * driver.findElement(By.xpath(FollowupMessage));
    		 * highlightElement(By.xpath(FollowupMessage));
    		 * clickUsingJavaScript(By.xpath(FollowupMessage));
    		 */

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

