package webAutoQueue;

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

public class AdultPatient {
	public static WebDriver driver;

    public static String doctorLoginLink="/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
    public static String mobileNumber="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
    public static String sendOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
    public static String verifyOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
    public static String createPatient="createPatient";
    public static String Number1="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[1]/mat-form-field[2]/div/div[1]/div/input";
    public static String confirm="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[1]/div/button";
    public static String confirmPopup="//button[text()='Confirm']";
    public static String number2="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[2]/mat-form-field[2]/div/div[1]/div/input";
    public static String firstName="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[1]/div/div[1]/div/input";
    public static String middleName="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[2]/div/div[1]/div/input";
    public static String lastName="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[3]/div/div[1]/div/input";
    public static String AdultbirthDate="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[1]/div/div[1]/div[1]/input";
    public static String genFemale="//*[text()='Female']";
    public static String address="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[1]/div/div[1]/div/input";
    public static String locality="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[2]/div/div[1]/div/input";
    public static String city="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[3]/div/div[1]/div/input";
    public static String pinCode="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[7]/mat-form-field/div/div[1]/div/input";
    public static String Next="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[8]/button[2]";
    public static String proceedWithSameRMN="/html/body/ngb-modal-window/div/div/div[3]/div/div[2]";
    public static String AdultSelectDate="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[3]/div[1]";		
	  public static String AdultSelectMonth ="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[4]/div[1]";
	   public static String AdultClickYearDropdown="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]";
	   public static String AdultclickYear="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[2]/td[2]/div[1]";
	   public static String clickClose="/html/body/ngb-modal-window/div/div/div[1]/div/button";
    public static String prefferedLanguage="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[7]/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]/span";
    public static String prefferedLanguageEnglish="/html/body/div[2]/div[4]/div/div/div/mat-option[1]/span";
    public static String BloodGroups ="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/div/div[1]/mat-form-field[2]/div/div[1]/div/mat-select";
    public static String BloodGroupsSelect="/html/body/div[2]/div[4]/div/div/div/mat-option[4]/span";
    public static String Habits="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/div/div[2]/div/div/div/div[3]/div[2]/div/div[1]/input[1]";
    public static String HealthNext="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/div/div[3]/button[2]";
    public static String Allergies="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[1]/mat-form-field[2]/div/div[1]/div/input";
    public static String ReactionToDrug="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[2]/mat-form-field[1]/div/div[1]/div/input";
    public static String Hospitalisation="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[3]/mat-form-field[1]/div/div[1]/div/input";
    public static String HealthHistory="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[3]/mat-form-field[2]/div/div[1]/div/input";
    public static String EmailId="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[4]/mat-form-field[1]/div/div[1]/div/input";
    public static String UHD="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[4]/mat-form-field[2]/div/div[1]/div/input";
    public static String GeneticDisorder="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[5]/mat-form-field/div/div[1]/div[1]/input";
    public static String MedicalCondition="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[1]/mat-form-field[1]/div/div[1]/div[1]/input";
    public static String FamilyMedicalHistory="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/form/div/div[1]/mat-form-field/div/div[1]/div[1]/input";
    public static String EnterDisorder="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/form/div/div[2]/mat-form-field/div/div[1]/div[1]/input";
    public static String RecurringComplaints="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[2]/mat-form-field[2]/div/div[1]/div/input";
    public static String HealthProfileNext="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[6]/button[2]";
    public static String FamilyProfileNext="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/form/div/div[3]/button[2]";
    public static String FamilyProfileDone="/html/body/ngb-modal-window/div/div/div[3]/div";
    public static String clickContinue="//*[text()='Continue to complete detail profile']";
    public static String success="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/div[1]/div[1]/div[1]/div[1]/div";
    public static String OTP1="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]"; 
	   public static String OTP2="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]"; 
	   public static String OTP3="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]"; 
	   public static String OTP4="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	   public static String OTP5="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	   public static String OTP6="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]"; 
    
    
    
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
     	public  void numberField() {
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
		  driver.findElement(By.xpath(firstName)).sendKeys("AdLive12sept");;
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
	      	driver.findElement(By.xpath(address)).sendKeys("Address");;
	      	highlightElement(By.xpath(address));
	    	clickUsingJavaScript(By.xpath(address));
	        }
	        @Test(priority=14)
	      	public  void locality() {
	      	waitForVisibilityOf(By.xpath(locality));
	      	driver.findElement(By.xpath(locality)).sendKeys("locality");
	      	highlightElement(By.xpath(locality));
	    	clickUsingJavaScript(By.xpath(locality));
	        }
	        @Test(priority=15)
	      	public  void city() {
	      	waitForVisibilityOf(By.xpath(city));
	      	driver.findElement(By.xpath(city)).sendKeys("City");;
	      	highlightElement(By.xpath(city));
	    	clickUsingJavaScript(By.xpath(city));
	        }
	        @Test(priority=16)
	      	public  void pinCode() {
	      	waitForVisibilityOf(By.xpath(pinCode));
	      	driver.findElement(By.xpath(pinCode)).sendKeys("412306");
	      	highlightElement(By.xpath(pinCode));
	    	clickUsingJavaScript(By.xpath(pinCode));
	        }
	     
	            
	        
	        @Test(priority=17)
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
	        @Test(priority=18)
	        public void nextButton() throws InterruptedException {
	        	
	        	Thread.sleep(15000);
	            waitForVisibilityOf(By.xpath(Next));
	          driver.findElement(By.xpath(Next));
	          	highlightElement(By.xpath(Next));
	        	clickUsingJavaScript(By.xpath(Next));
	        }
	        @Test(priority=19)
	        public void clickClose() {
	            waitForVisibilityOf(By.xpath(clickContinue));
	            driver.findElement(By.xpath(clickContinue));
	          	highlightElement(By.xpath(clickContinue));
	        	clickUsingJavaScript(By.xpath(clickContinue));
	            
	        }
	        @Test(priority=20)
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
	        @Test(priority=21)
	        public void Habits() {
	            waitForVisibilityOf(By.xpath(Habits));
	            driver.findElement(By.xpath(Habits));
	          	highlightElement(By.xpath(Habits));
	        	clickUsingJavaScript(By.xpath(Habits));}
	        
	        @Test(priority=22)
	        public void HealthNext() throws InterruptedException {
	        	Thread.sleep(15000);
	            waitForVisibilityOf(By.xpath(HealthNext));
	            driver.findElement(By.xpath(HealthNext));
	          	highlightElement(By.xpath(HealthNext));
	        	clickUsingJavaScript(By.xpath(HealthNext));}
	        
	        @Test(priority=23)
	        public void HealthProfile() throws InterruptedException {
	            waitForVisibilityOf(By.xpath(Allergies));
	            driver.findElement(By.xpath(Allergies)).sendKeys("Dust");
	          	highlightElement(By.xpath(Allergies));
	          	
	          	waitForVisibilityOf(By.xpath(ReactionToDrug));
	            driver.findElement(By.xpath(ReactionToDrug)).sendKeys("yes");
	          	highlightElement(By.xpath(ReactionToDrug));
	          	
	          	waitForVisibilityOf(By.xpath(RecurringComplaints));
	            driver.findElement(By.xpath(RecurringComplaints)).sendKeys("No");
	          	highlightElement(By.xpath(RecurringComplaints));
	          	
	          	waitForVisibilityOf(By.xpath(Hospitalisation));
	            driver.findElement(By.xpath(Hospitalisation)).sendKeys("yes");
	          	highlightElement(By.xpath(Hospitalisation));
	          	
	          	waitForVisibilityOf(By.xpath(HealthHistory));
	            driver.findElement(By.xpath(HealthHistory)).sendKeys("No");
	          	highlightElement(By.xpath(HealthHistory));
	          	
	          	waitForVisibilityOf(By.xpath(EmailId));
	            driver.findElement(By.xpath(EmailId)).sendKeys("abc@gmail.com");
	          	highlightElement(By.xpath(EmailId));
	          	
	          	waitForVisibilityOf(By.xpath(UHD));
	            driver.findElement(By.xpath(UHD)).sendKeys("No");
	          	highlightElement(By.xpath(UHD));
	          	
	          	waitForVisibilityOf(By.xpath(GeneticDisorder));
	            driver.findElement(By.xpath(GeneticDisorder)).sendKeys("dementia");
	          	highlightElement(By.xpath(GeneticDisorder));
	          	
	          	waitForVisibilityOf(By.xpath(MedicalCondition));
	            driver.findElement(By.xpath(MedicalCondition)).sendKeys("No");
	          	highlightElement(By.xpath(MedicalCondition));
	          	
	        	Thread.sleep(15000);
	          	waitForVisibilityOf(By.xpath(HealthProfileNext));
	            driver.findElement(By.xpath(HealthProfileNext));
	          	highlightElement(By.xpath(HealthProfileNext));
	          	clickUsingJavaScript(By.xpath(HealthProfileNext));
	        }
	        @Test(priority=24)
	        public void FamilyProfile() throws InterruptedException {
	        	
	        	Thread.sleep(3000);
	            waitForVisibilityOf(By.xpath(FamilyMedicalHistory));
	            driver.findElement(By.xpath(FamilyMedicalHistory)).sendKeys("Diabetes");
	          	highlightElement(By.xpath(FamilyMedicalHistory));
	          	
	          	waitForVisibilityOf(By.xpath(EnterDisorder));
	            driver.findElement(By.xpath(EnterDisorder)).sendKeys("Physically Challenged");
	          	highlightElement(By.xpath(EnterDisorder));
	          	
	        	Thread.sleep(15000);
	        	waitForVisibilityOf(By.xpath(FamilyProfileNext));
	            driver.findElement(By.xpath(FamilyProfileNext));
	          	highlightElement(By.xpath(FamilyProfileNext));
	          	clickUsingJavaScript(By.xpath(FamilyProfileNext));
	          	
	          	waitForVisibilityOf(By.xpath(FamilyProfileDone));
	            driver.findElement(By.xpath(FamilyProfileDone));
	          	highlightElement(By.xpath(FamilyProfileDone));
	          	clickUsingJavaScript(By.xpath(FamilyProfileDone));
	          	

				/*
				 * waitForVisibilityOf(By.xpath(success)); highlightElement(By.xpath(success));
				 * String p=driver.findElement(By.xpath(success)).getText();
				 * System.out.println("msge:"+p); String a="Profile"; Assert.assertEquals(p,a);
				 */
	          	
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
