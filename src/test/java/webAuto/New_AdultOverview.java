package webAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class New_AdultOverview {
	public static WebDriver driver;

	 public static String mobileNumber="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	    public static String sendOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	    public static String verifyOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
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
	    public static String MedicalCondition="//*[text()='Health Profile']//following::input[19]";
	    
 public static String AdultSelectDate="//*[text()=' 1 ']";		
 public static String AdultbirthDate="//*[text()='Profile']//following::input[10]";		
	 public static String AdultSelectMonth ="//*[text()=' JUN ']";
	   public static String AdultClickYearDropdown="//*[text()='Profile']//following::button[13]//following::span[2]";
	   public static String AdultclickYear="//*[text()=' 2001 ']";
	   //public static String clickClose="/html/body/ngb-modal-window/div/div/div[1]/div/button";
 
 public static String BloodGroups ="//*[text()='Health History']//following::mat-select[2]";
 public static String BloodGroupsSelect="//*[text()='A+']";
 public static String Habits="//*[text()='Health History']//following::input[14]";
 public static String HealthNext="//*[text()='Health History']//following::button[6]";

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
 public static String familyNext="//*[text()='Family Profile']//following::button[16]";
 public static String success="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/div[1]/div[1]/div[1]/div[1]/div";
 public static String age="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[2]/div/div[1]/div/input";
 //public static String familyProfile="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[1]/mat-step-header[4]/div[3]/div";
 public static String Done="//*[text()='Success']//following::div[9]";
 public static String SelectDate="//*[text()=' 1 ']";		
	 // public static String SelectMonth ="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[4]/div[1]";
	  // public static String ClickYearDropdown="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]";
	  // public static String clickYear="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[5]/td[3]/div[1]";
	  public static String clickContinue="//*[text()='Continue to complete detail profile']";
	  public static String prefferedLanguage="//*[text()='Preferred Language']";
	    public static String prefferedLanguageEnglish="//*[text()=' English ']";
	    public static String FamilyMedicalHistory = "//*[text()='Family Profile']//following::input[7]";
	  		public static String EnterDisorder = "//*[text()='Family Profile']//following::input[8]";
	  		public static String AnyGeneticDisorder = "//*[text()='Health Profile']//following::input[27]";
    public static String OTP1="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]"; 
	   public static String OTP2="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]"; 
	   public static String OTP3="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]"; 
	   public static String OTP4="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	   public static String OTP5="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	   public static String OTP6="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]"; 
    
    
	   
		public static String LinkPatient="//*[text()='Link Patient']";
		public static String SearchDoctorMobile="//*[text()='Enter doctor complete mobile number']/following::input";
		public static String LinkOption="//*[text()='Link']";
		public static String  LinkNotification="//*[text()=' Linked Patient to Doctor']";
		
		
		
		
		public static String ReccuringComplaints="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-new-profile/div[2]/div[1]/div[2]/div[2]/div[4]/div[1]";
		public static String AccidentalInfo="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-new-profile/div[2]/div[1]/div[2]/div[2]/div[5]/div[1]";
		public static String Reaction="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-new-profile/div[2]/div[1]/div[2]/div[2]/div[6]/div[1]";
		
		public static String HistoryClick="//*[text()='History']";
		
		public static String NewScreening="//*[text()='New Born Screening']"; 
		public static String UploadReport="//*[text()='Upload Report']";
		   public static String CreatedBy="//*[text()='Upload health reports and related documents as photos,images and PDFs.']/following::input[1]";
		   public static String DocumentOn="//*[text()='Upload health reports and related documents as photos,images and PDFs.']/following::input[2]";
		   public static String BrownFile1="//*[text()='Upload health reports and related documents as photos,images and PDFs.']/following::input[3]";
		   public static String UploadReportDoc="//*[text()='Upload']";
		
		 public static String DeletePatient="//*[text()='Delete Patient']";
	    public static String Delete="//*[text()='Cancel']/following::button";
		
		
		public static String OverViewOption ="//*[text()='Overview '] ";
		
		
		public static String Hospitalization="//*[text()='Reaction To Drugs/ Medicine']";
		public static String HealthHistoryT="//*[text()='Health History']";
		public static String FamMedicalHistory="//*[text()='Family Medical History']";
		public static String GenDisorder="//*[text()='Genetic Disorders']";
		
		public static String OViewMedicalCondition="//*[text()='Medical Conditions']";
		public static String OViewAllergies="//*[text()='Allergies']";
		public static String OViewReccuringComplaints="//*[text()='Recurring Complaints']";
		public static String OviewAccidentalInfo="//*[text()='Accidental/Procedural Information']";
		
		public static String EditPatientProfile="//*[text()='Edit']";
		public static String EditMedicalCondition="//*[text()='More Information']/following::mat-chip[1]";
		public static String EditMedicalConditionclear="//*[text()='More Information']/following::input[1]";
		public static String EditMedicalCondition1="//*[text()='More Information']/following::mat-chip[2]";
		
		public static String EditAllergies="//*[text()='More Information']/following::input[2]";
		
		public static String EditReccuringComplaint="//*[text()='More Information']/following::input[3]";
		
		public static String EditAccidentalInfo="//*[text()='More Information']/following::input[4]";
		public static String SaveProfile="//*[text()='More Information']/following::button[2]";
		public static String Notes="//*[text()='Notes']/following::textarea";
		public static String SaveNotes="//*[text()='Notes']/following::div[1]";
		public static String ClickHome = "//*[text()=' Home']";
		public static String clickPatient = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a[1]/li/a/div/div[2]/figure/img";
		public static String Heathprofile="//*[text()='Health Profile']";
  		public static String EditClick="//*[text()=' Birth ']//following::table";
  		public static String VitalsClick="//*[text()='Vitals']";
		
		
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
		//driver.get("https://stage.copious.care/");
		driver.manage().window().fullscreen();

}
       

       
       @Test(priority=1)
     	public  void numberField() throws InterruptedException {
    	   Thread.sleep(2000);
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
       Thread.sleep(1000);
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
    	//driver.findElement(By.id(createPatient)).click();
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
	clickUsingJavaScript(By.xpath(proceedWithSameRMN));
	/*
	 * waitForVisibilityOf(By.xpath(confirmPopup));
	 * highlightElement(By.xpath(confirmPopup));
	 * driver.findElement(By.xpath(confirmPopup));
	 * clickUsingJavaScript(By.xpath(confirmPopup));
	 */
       }

		/*
		 * @Test(priority=7) public void proceedWithSameRMN() throws
		 * InterruptedException { //Thread.sleep(5000);
		 * waitForVisibilityOf(By.xpath(proceedWithSameRMN));
		 * driver.findElement(By.xpath(proceedWithSameRMN));
		 * highlightElement(By.xpath(proceedWithSameRMN));
		 * clickUsingJavaScript(By.xpath(proceedWithSameRMN));
		 * 
		 * }
		 */
       @Test(priority=8)
     	public  void number2() {
     	waitForVisibilityOf(By.xpath(number2));
     	driver.findElement(By.xpath(number2)).sendKeys("1234567892");;
     	highlightElement(By.xpath(number2));
   	clickUsingJavaScript(By.xpath(number2));
       }
    

		
		  @Test(priority=9) public void firstName() {
		  waitForVisibilityOf(By.xpath(firstName));
		  driver.findElement(By.xpath(firstName)).sendKeys("TypeAD");;
		  highlightElement(By.xpath(firstName));
		  clickUsingJavaScript(By.xpath(firstName)); }
		  
		  @Test(priority=10) public void middleName() {
		  waitForVisibilityOf(By.xpath(middleName));
		  driver.findElement(By.xpath(middleName)).sendKeys("Automation");;
		  highlightElement(By.xpath(middleName));
		  clickUsingJavaScript(By.xpath(middleName)); }
		  
		  @Test(priority=11) public void lastName() {
		  waitForVisibilityOf(By.xpath(lastName));
		  driver.findElement(By.xpath(lastName)).sendKeys("Patient");;
		  highlightElement(By.xpath(lastName));
		  clickUsingJavaScript(By.xpath(lastName)); }
		  
		  
		  @Test(priority=12)public  void birthDate() throws InterruptedException {
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

	        @Test(priority=13)
	      	public  void genFemale() {
	      	waitForVisibilityOf(By.xpath(genFemale));
	      	driver.findElement(By.xpath(genFemale));
	      	highlightElement(By.xpath(genFemale));
	    	clickUsingJavaScript(By.xpath(genFemale));
	        }
	        @Test(priority=14)
	      	public  void address() {
	      	waitForVisibilityOf(By.xpath(address));
	      	driver.findElement(By.xpath(address)).sendKeys("Address");;
	      	highlightElement(By.xpath(address));
	    	clickUsingJavaScript(By.xpath(address));
	        }
	        @Test(priority=15)
	      	public  void locality() {
	      	waitForVisibilityOf(By.xpath(locality));
	      	driver.findElement(By.xpath(locality)).sendKeys("locality");
	      	highlightElement(By.xpath(locality));
	    	clickUsingJavaScript(By.xpath(locality));
	        }
	        @Test(priority=16)
	      	public  void city() {
	      	waitForVisibilityOf(By.xpath(city));
	      	driver.findElement(By.xpath(city)).sendKeys("City");;
	      	highlightElement(By.xpath(city));
	    	clickUsingJavaScript(By.xpath(city));
	        }
	        @Test(priority=17)
	      	public  void pinCode() {
	      	waitForVisibilityOf(By.xpath(pinCode));
	      	driver.findElement(By.xpath(pinCode)).sendKeys("412306");
	      	highlightElement(By.xpath(pinCode));
	    	clickUsingJavaScript(By.xpath(pinCode));
	        }
	     
	            
	        
	        @Test(priority=18)
	        public void prefferedLanguage() throws InterruptedException {
	            waitForVisibilityOf(By.xpath(prefferedLanguage));
	          driver.findElement(By.xpath(prefferedLanguage));
	          	highlightElement(By.xpath(prefferedLanguage));
	        	clickUsingJavaScript(By.xpath(prefferedLanguage));
				
				
				  waitForVisibilityOf(By.xpath(prefferedLanguageEnglish));
				  driver.findElement(By.xpath(prefferedLanguageEnglish));
				  highlightElement(By.xpath(prefferedLanguageEnglish));
				  clickUsingJavaScript(By.xpath(prefferedLanguageEnglish));
				 
	        	
	            
	        }
	        @Test(priority=19)
	        public void nextButton() throws InterruptedException {
	        	
	        	Thread.sleep(15000);
	            waitForVisibilityOf(By.xpath(Next));
	          driver.findElement(By.xpath(Next));
	          	highlightElement(By.xpath(Next));
	        	clickUsingJavaScript(By.xpath(Next));
	        }
	        @Test(priority=20)
	        public void clickClose() {
	            waitForVisibilityOf(By.xpath(clickContinue));
	            driver.findElement(By.xpath(clickContinue));
	          	highlightElement(By.xpath(clickContinue));
	        	clickUsingJavaScript(By.xpath(clickContinue));
	            
	        }
	        @Test(priority=21)
	        public void BloodGroups() {
	            waitForVisibilityOf(By.xpath(BloodGroups));
	            driver.findElement(By.xpath(BloodGroups));
	          	highlightElement(By.xpath(BloodGroups));
	        	clickUsingJavaScript(By.xpath(BloodGroups));
	        	
	        	waitForVisibilityOf(By.xpath(BloodGroupsSelect));
	            driver.findElement(By.xpath(BloodGroupsSelect));
	          	highlightElement(By.xpath(BloodGroupsSelect));
	        	clickUsingJavaScript(By.xpath(BloodGroupsSelect));
	            
	        }
	        @Test(priority=22)
	        public void Habits() {
	            waitForVisibilityOf(By.xpath(Habits));
	            driver.findElement(By.xpath(Habits));
	          	highlightElement(By.xpath(Habits));
	        	clickUsingJavaScript(By.xpath(Habits));}
	        
	        @Test(priority=23)
	        public void HealthNext() throws InterruptedException {
	        	Thread.sleep(15000);
	            waitForVisibilityOf(By.xpath(HealthNext));
	            driver.findElement(By.xpath(HealthNext));
	          	highlightElement(By.xpath(HealthNext));
	        	clickUsingJavaScript(By.xpath(HealthNext));}
	        
	        @Test(priority=24)
	        public void HealthProfile() throws InterruptedException {
	        	Thread.sleep(2000);
	            waitForVisibilityOf(By.xpath(allergies));
	            driver.findElement(By.xpath(allergies)).sendKeys("Dust");
	          	highlightElement(By.xpath(allergies));
	          	
	          	waitForVisibilityOf(By.xpath(reactionToDrugs));
	            driver.findElement(By.xpath(reactionToDrugs)).sendKeys("yes");
	          	highlightElement(By.xpath(reactionToDrugs));
	          	
	          	waitForVisibilityOf(By.xpath(recurringComplaints));
	            driver.findElement(By.xpath(recurringComplaints)).sendKeys("No");
	          	highlightElement(By.xpath(recurringComplaints));
	          	
	          	waitForVisibilityOf(By.xpath(hospitalization));
	            driver.findElement(By.xpath(hospitalization)).sendKeys("yes");
	          	highlightElement(By.xpath(hospitalization));
	          	
	          	waitForVisibilityOf(By.xpath(healthHistory));
	            driver.findElement(By.xpath(healthHistory)).sendKeys("No");
	          	highlightElement(By.xpath(healthHistory));
	          	
	          	waitForVisibilityOf(By.xpath(emailID));
	            driver.findElement(By.xpath(emailID)).sendKeys("abc@gmail.com");
	          	highlightElement(By.xpath(emailID));
	          	
	          	waitForVisibilityOf(By.xpath(UHID));
	            driver.findElement(By.xpath(UHID)).sendKeys("No");
	          	highlightElement(By.xpath(UHID));
	          	
	          	waitForVisibilityOf(By.xpath(geneticDisorder));
	            driver.findElement(By.xpath(geneticDisorder)).sendKeys("dementia");
	          	highlightElement(By.xpath(geneticDisorder));
	          	
	          	waitForVisibilityOf(By.xpath(MedicalCondition));
	            driver.findElement(By.xpath(MedicalCondition)).sendKeys("No");
	          	highlightElement(By.xpath(MedicalCondition));
	          	
	        	Thread.sleep(15000);
	          	waitForVisibilityOf(By.xpath(healthNext));
	            driver.findElement(By.xpath(healthNext));
	          	highlightElement(By.xpath(healthNext));
	          	clickUsingJavaScript(By.xpath(healthNext));
	        }
	        @Test(priority=25)
	        public void FamilyProfile() throws InterruptedException {
	        	
	        	Thread.sleep(3000);
	            waitForVisibilityOf(By.xpath(FamilyMedicalHistory));
	            driver.findElement(By.xpath(FamilyMedicalHistory)).sendKeys("Diabetes");
	          	highlightElement(By.xpath(FamilyMedicalHistory));
	          	
	          	waitForVisibilityOf(By.xpath(EnterDisorder));
	            driver.findElement(By.xpath(EnterDisorder)).sendKeys("Physically Challenged");
	          	highlightElement(By.xpath(EnterDisorder));
	          	
	        	Thread.sleep(15000);
	        	waitForVisibilityOf(By.xpath(familyNext));
	            driver.findElement(By.xpath(familyNext));
	          	highlightElement(By.xpath(familyNext));
	          	clickUsingJavaScript(By.xpath(familyNext));
	          	
	          	waitForVisibilityOf(By.xpath(Done));
	            driver.findElement(By.xpath(Done));
	          	highlightElement(By.xpath(Done));
	          	clickUsingJavaScript(By.xpath(Done));
	          	
	        }
	        @Test(priority = 26, groups = "Regression") public void EditPatientProfile()
		  			  throws InterruptedException { Thread.sleep(5000);
		  			  driver.manage().window().fullscreen();
		  			 
		  			waitForVisibilityOf(By.xpath(ClickHome));
		  	   		driver.findElement(By.xpath(ClickHome));
		  	   		highlightElement(By.xpath(ClickHome));
		  	   		clickUsingJavaScript(By.xpath(ClickHome));

		  			  
		  			  
		  	   	Thread.sleep(15000);

		   		waitForVisibilityOf(By.xpath(clickPatient));
		   		driver.findElement(By.xpath(clickPatient));
		   		highlightElement(By.xpath(clickPatient));
		   		clickUsingJavaScript(By.xpath(clickPatient));
		   		
				/*
				 * waitForVisibilityOf(By.xpath(Heathprofile));
				 * driver.findElement(By.xpath(Heathprofile));
				 * highlightElement(By.xpath(Heathprofile));
				 * clickUsingJavaScript(By.xpath(Heathprofile));
				 * 
				 * waitForVisibilityOf(By.xpath(VitalsClick));
				 * driver.findElement(By.xpath(VitalsClick));
				 * highlightElement(By.xpath(VitalsClick));
				 * clickUsingJavaScript(By.xpath(VitalsClick));
				 * 
				 * waitForVisibilityOf(By.xpath(EditClick));
				 * driver.findElement(By.xpath(EditClick));
				 * highlightElement(By.xpath(EditClick));
				 * clickUsingJavaScript(By.xpath(EditClick));
				 */
				
				
				/*
				 * Thread.sleep(5000); waitForVisibilityOf(By.xpath(OverViewOption));
				 * driver.findElement(By.xpath(OverViewOption));
				 * highlightElement(By.xpath(OverViewOption));
				 * clickUsingJavaScript(By.xpath(OverViewOption));
				 */
				  
				
		          	
		  			 
						/*
						 * waitForVisibilityOf(By.xpath(OViewReaction)); String Reaction1=
						 * driver.findElement(By.xpath(OViewReaction)).getText();
						 * System.out.println(Reaction1); highlightElement(By.xpath(OViewReaction));
						 */
		  			 
		  			  
		  			
		        	
		  			  
		  			  
		  			  
		  			  
		  		}
	        
	        @Test(priority = 27, groups = "Regression") public void PatientProfile()
	  			  throws InterruptedException { Thread.sleep(5000);
	  			  driver.manage().window().fullscreen();
	  			 
	  			  
	  			  
	  			  waitForVisibilityOf(By.xpath(OViewMedicalCondition));
	  			  String MedicalCondition1= driver.findElement(By.xpath(OViewMedicalCondition)).getText();
	  			  System.out.println(MedicalCondition1);
	  			  highlightElement(By.xpath(OViewMedicalCondition));
	  			  
	  			  
	  			  waitForVisibilityOf(By.xpath(OViewAllergies));
	  			  String Allergies1=driver.findElement(By.xpath(OViewAllergies)).getText();
	  			  System.out.println(Allergies1);
	  			  highlightElement(By.xpath(OViewAllergies));
	  			 
	  			  
	  			  waitForVisibilityOf(By.xpath(OViewReccuringComplaints));
	  			  String ReccuringComplaints1= driver.findElement(By.xpath(OViewReccuringComplaints)).getText();
	  			  System.out.println(ReccuringComplaints1);
	  			  highlightElement(By.xpath(OViewReccuringComplaints));
	  			  
	  			  
	  			  
					
					  waitForVisibilityOf(By.xpath(OviewAccidentalInfo)); String
					  AccidentalInfo1=driver.findElement(By.xpath(OviewAccidentalInfo)).getText();
					  System.out.println(AccidentalInfo1);
					  highlightElement(By.xpath(OviewAccidentalInfo));
					 
	  			 
					/*
					 * waitForVisibilityOf(By.xpath(OViewReaction)); String Reaction1=
					 * driver.findElement(By.xpath(OViewReaction)).getText();
					 * System.out.println(Reaction1); highlightElement(By.xpath(OViewReaction));
					 */
	  			 
	  			  
	  			
	  			  
	  			  
	  			  
	  			  
	  			  
	  		}
	        @Test(priority = 28, groups = "Regression") public void AdditionalInformation()
		  			  throws InterruptedException { Thread.sleep(5000);
		  			  driver.manage().window().fullscreen();
		  			 
		  			  
		  			  
		  			  waitForVisibilityOf(By.xpath(Hospitalization));
		  			  String Hospitalization1= driver.findElement(By.xpath(Hospitalization)).getText();
		  			  System.out.println(Hospitalization1);
		  			highlightElement(By.xpath(Hospitalization));
		  			  
		  			  
		  			  waitForVisibilityOf(By.xpath(HealthHistoryT));
		  			  String HealthHistoryT1=driver.findElement(By.xpath(HealthHistoryT)).getText();
		  			  System.out.println(HealthHistoryT1);
		  			  highlightElement(By.xpath(HealthHistoryT));
		  			 
		  			  
		  			  waitForVisibilityOf(By.xpath(FamMedicalHistory));
		  			  String FamMedicalHistory1= driver.findElement(By.xpath(FamMedicalHistory)).getText();
		  			  System.out.println(FamMedicalHistory1);
		  			  highlightElement(By.xpath(FamMedicalHistory));
		  			  
		  			  
		  			  
						/*
						 * waitForVisibilityOf(By.xpath(AccidentalInfo)); String
						 * AccidentalInfo1=driver.findElement(By.xpath(AccidentalInfo)).getText();
						 * System.out.println(AccidentalInfo1);
						 * highlightElement(By.xpath(AccidentalInfo));
						 */
		  			 
		  			  waitForVisibilityOf(By.xpath(GenDisorder));
		  			  String GenDisorder1= driver.findElement(By.xpath(GenDisorder)).getText();
		  			  System.out.println(GenDisorder1);
		  			  highlightElement(By.xpath(GenDisorder));
		  			 
		  			  
		  			
		  			  
		  			  
		  			  
		  			  
		  			  
		  		}
	    	  @Test(priority = 29) public void Notes() throws InterruptedException {
		  		  Thread.sleep(10000);
		  		  
		  		waitForVisibilityOf(By.xpath(Notes));
	          	//driver.findElement(By.xpath(EditAccidentalInfo)).clear();
	            driver.findElement(By.xpath(Notes)).sendKeys("Test");;
	          	highlightElement(By.xpath(Notes));
	          	
	  			 
					
	  			  Thread.sleep(5000);
	  			
	        	waitForVisibilityOf(By.xpath(SaveNotes));
	            driver.findElement(By.xpath(SaveNotes));
	          	highlightElement(By.xpath(SaveNotes));
	          	clickUsingJavaScript(By.xpath(SaveNotes));
	  			  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  }
	  	  @Test(priority = 30) public void LinkPatient() throws InterruptedException {
	  		  Thread.sleep(10000);
	  		  
	  		 
	  		 waitForVisibilityOf(By.xpath(LinkPatient));
	  		 driver.findElement(By.xpath(LinkPatient));
	  		 highlightElement(By.xpath(LinkPatient));
	  		 clickUsingJavaScript(By.xpath(LinkPatient));
	  		 
	  		 Thread.sleep(5000);
	  		 
	  		 waitForVisibilityOf(By.xpath(SearchDoctorMobile));
	  		 driver.findElement(By.xpath(SearchDoctorMobile)).sendKeys("9665002440");
	  		 highlightElement(By.xpath(SearchDoctorMobile));
	  		 
	  		waitForVisibilityOf(By.xpath(LinkOption));
	  		driver.findElement(By.xpath(LinkOption));
	  		highlightElement(By.xpath(LinkOption));
	  		clickUsingJavaScript(By.xpath(LinkOption));
	  		
	  		
	  		/*
	  		 * Thread.sleep(2000); waitForVisibilityOf(By.xpath(LinkNotification));
	  		 * highlightElement(By.xpath(LinkNotification)); String
	  		 * Actualmsge=driver.findElement(By.xpath(LinkNotification)).getText();
	  		 * System.out.println("msge:"+Actualmsge); String
	  		 * ErrorMsge="Linked Patient to Doctor";
	  		 * Assert.assertEquals(Actualmsge,ErrorMsge);
	  		 */
	       
	  	
	  		  
	  		  
	  		  }
	  	  @Test(priority = 31) public void History() throws InterruptedException {
	  		  Thread.sleep(10000);
	  		  
	  		 
	  		 waitForVisibilityOf(By.xpath(HistoryClick));
	  		 driver.findElement(By.xpath(HistoryClick));
	  		 highlightElement(By.xpath(HistoryClick));
	  		 clickUsingJavaScript(By.xpath(HistoryClick));
	  		 
	  		 Thread.sleep(5000);
	  		 
	  		 waitForVisibilityOf(By.xpath(OverViewOption));
	  		  driver.findElement(By.xpath(OverViewOption));
	  		  highlightElement(By.xpath(OverViewOption));
	  		  clickUsingJavaScript(By.xpath(OverViewOption));
	  	  
	  	  }

			/*
			 * @Test(priority = 29) public void NewScreening() throws InterruptedException {
			 * Thread.sleep(10000);
			 * 
			 * 
			 * waitForVisibilityOf(By.xpath(NewScreening));
			 * driver.findElement(By.xpath(NewScreening));
			 * highlightElement(By.xpath(NewScreening));
			 * clickUsingJavaScript(By.xpath(NewScreening));
			 * 
			 * Thread.sleep(5000);
			 * 
			 * 
			 * waitForVisibilityOf(By.xpath(CreatedBy));
			 * driver.findElement(By.xpath(CreatedBy)).sendKeys("Abc");
			 * highlightElement(By.xpath(CreatedBy));
			 * 
			 * waitForVisibilityOf(By.xpath(DocumentOn));
			 * driver.findElement(By.xpath(DocumentOn)).sendKeys("01/01/2023");
			 * highlightElement(By.xpath(DocumentOn));
			 * 
			 * waitForVisibilityOf(By.xpath(BrownFile1));
			 * driver.findElement(By.xpath(BrownFile1)).sendKeys(
			 * "C:\\\\Users\\\\Lenovo\\\\Desktop\\\\nature.jpg");
			 * highlightElement(By.xpath(BrownFile1));
			 * 
			 * Thread.sleep(15000); waitForVisibilityOf(By.xpath(UploadReportDoc));
			 * driver.findElement(By.xpath(UploadReportDoc));
			 * highlightElement(By.xpath(UploadReportDoc));
			 * clickUsingJavaScript(By.xpath(UploadReportDoc));
			 * 
			 * waitForVisibilityOf(By.xpath(OverViewOption));
			 * driver.findElement(By.xpath(OverViewOption));
			 * highlightElement(By.xpath(OverViewOption));
			 * clickUsingJavaScript(By.xpath(OverViewOption)); }
			 */
	  	  @Test(priority = 32) public void DeletePatient() throws InterruptedException {
	  		  Thread.sleep(2000);  
	  		  waitForVisibilityOf(By.xpath(OverViewOption));
	  		  driver.findElement(By.xpath(OverViewOption));
	  		  highlightElement(By.xpath(OverViewOption));
	  		  clickUsingJavaScript(By.xpath(OverViewOption));
	  		  Thread.sleep(5000);
	  		 waitForVisibilityOf(By.xpath(DeletePatient));
	  		 driver.findElement(By.xpath(DeletePatient));
	  		 highlightElement(By.xpath(DeletePatient));
	  		 clickUsingJavaScript(By.xpath(DeletePatient));
	  		 
	  		 Thread.sleep(5000);
	  			
	          	
	  			
	  			  highlightElement(By.xpath(Delete)); driver.findElement(By.xpath(Delete));
	  			  clickUsingJavaScript(By.xpath(Delete));
	  			 }

	  }


