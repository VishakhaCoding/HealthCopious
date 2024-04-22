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

public class Example {
	public static WebDriver driver;

    public static String doctorLoginLink="/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
    public static String mobileNumber="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
    public static String sendOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
    public static String verifyOTP="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
    public static String createPatient="createPatient";
    public static String Number1="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[1]/mat-form-field[2]/div/div[1]/div/input";
    public static String confirm="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[1]/div";
    public static String confirmPopup="//button[text()='Confirm']";
    public static String number2="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[2]/mat-form-field[2]/div/div[1]/div/input";
    public static String firstName="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[1]/div/div[1]/div/input";
    public static String middleName="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[2]/div/div[1]/div/input";
    public static String lastName="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[3]/div/div[1]/div/input";
    public static String birthDate="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[1]/div/div[1]/div[1]/input";
    public static String genFemale="//*[text()='Female']";
    public static String address="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[1]/div/div[1]/div/input";
    public static String locality="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[2]/div/div[1]/div/input";
    public static String city="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[3]/div/div[1]/div/input";
    public static String pinCode="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[7]/mat-form-field/div/div[1]/div/input";
    public static String Next="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[8]/button[2]";
    public static String proceedWithSameRMN="//div[text()=' Modify RMN ']/following::div[1]";
    public static String clickClose="/html/body/ngb-modal-window/div/div/div[1]/div/button";
    public static String selectDelivery="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[1]/mat-form-field[3]/div/div[1]/div/mat-select";
    public static String normalDelivery="//*[text()='Normal']";
    public static String weight="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[5]/mat-form-field[1]/div/div[1]/div/input";
    public static String height="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[5]/mat-form-field[2]/div/div[1]/div/input";
    public static String HC="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[5]/mat-form-field[3]/div/div[1]/div/input";
    public static String CC="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[6]/mat-form-field[1]/div/div[1]/div/input";
    public static String BP="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[6]/mat-form-field[2]/div/div[1]/div/input";
    public static String BPdia="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[6]/mat-form-field[3]/div/div[1]/div/input";
    public static String vaccinationDate="//*[@id='mat-input-94']";
    public static String bloodGrp="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[7]/mat-form-field[2]/div/div[1]/div/mat-select";
    public static String bloodGrpOplus="//*[text()='O+']";
    public static String antentalNext="//*[@id='cdk-step-content-0-1']/form/div[2]/div[8]/button[2]";
    public static String medicalConditions="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[1]/mat-form-field[1]/div/div[1]/div[1]/input";
    public static String allergies="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[1]/mat-form-field[2]/div/div[1]/div/input";
    public static String reactionToDrugs="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[2]/mat-form-field[1]/div/div[1]/div/input";
    public static String recurringComplaints="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[2]/mat-form-field[2]/div/div[1]/div/input";
    public static String hospitalization="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[3]/mat-form-field[1]/div/div[1]/div/input";
    public static String healthHistory="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[3]/mat-form-field[2]/div/div[1]/div/input";
    public static String emailID="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[4]/mat-form-field[1]/div/div[1]/div/input";
    public static String UHID="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[4]/mat-form-field[2]/div/div[1]/div/input";
    public static String geneticDisorder="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[5]/mat-form-field/div/div[1]/div[1]/input";
    public static String healthNext="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[6]/button[2]";
    public static String fatherHeightFt="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[1]/div[2]/mat-form-field[1]/div/div[1]/div/input";
    public static String fatherHeightinch="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[1]/div[2]/mat-form-field[2]/div/div[1]/div/input";
    public static String motherHeightFt="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[2]/div[2]/mat-form-field[1]/div/div[1]/div/input";
    public static String motherHeightinch="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[2]/div[2]/mat-form-field[2]/div/div[1]/div/input";
    public static String familyNext="//*[@id='cdk-step-content-0-3']/div[2]/div[5]/button[2]";
    public static String success="//*[text()='Success']";
    public static String age="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[2]/div/div[1]/div/input";
    public static String familyProfile="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[1]/mat-step-header[4]/div[3]/div";
    public static String Done="/html/body/ngb-modal-window/div/div/div[3]/div";
    public static String SelectDate="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[2]/td[2]/div[1]";		
	  public static String SelectMonth ="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[4]/div[1]";
	   public static String ClickYearDropdown="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]";
	   public static String clickYear="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[5]/td[3]/div[1]";
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
		
		driver.get("https://opd.copious.care/");
		driver.get("https://stage.copious.care/");
		driver.manage().window().fullscreen();

 }
        
        
        @Test(priority=0)
    	public  void clickDoctorLoginLink() {
    	
    	waitForVisibilityOf(By.xpath(doctorLoginLink));
    	driver.findElement(By.xpath(doctorLoginLink));
   	//textbox.sendKeys(Keys.ENTER);
    	highlightElement(By.xpath(doctorLoginLink));
    	clickUsingJavaScript(By.xpath(doctorLoginLink));
   	 
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
    	waitForVisibilityOf(By.xpath(confirmPopup));
    	highlightElement(By.xpath(confirmPopup));
    	clickUsingJavaScript(By.xpath(confirmPopup));
        }
    	  @Test(priority=7)
        	public  void ProRMN() {
		
		  waitForVisibilityOf(By.xpath(proceedWithSameRMN));
		  driver.findElement(By.xpath(proceedWithSameRMN));
		  highlightElement(By.xpath(proceedWithSameRMN));
		  clickUsingJavaScript(By.xpath(proceedWithSameRMN));
		 
        }
        @Test(priority=7)
      	public  void number2() {
      	waitForVisibilityOf(By.xpath(number2));
      	driver.findElement(By.xpath(number2)).sendKeys("1234567892");;
      	highlightElement(By.xpath(number2));
    	clickUsingJavaScript(By.xpath(number2));
        }
     

		
		  @Test(priority=8) public void firstName() {
		  waitForVisibilityOf(By.xpath(firstName));
		  driver.findElement(By.xpath(firstName)).sendKeys("NewTesting");;
		  highlightElement(By.xpath(firstName));
		  clickUsingJavaScript(By.xpath(firstName)); }
		  
		  @Test(priority=9) public void middleName() {
		  waitForVisibilityOf(By.xpath(middleName));
		  driver.findElement(By.xpath(middleName)).sendKeys("Automation");;
		  highlightElement(By.xpath(middleName));
		  clickUsingJavaScript(By.xpath(middleName)); }
		  
		  @Test(priority=10) public void lastName() {
		  waitForVisibilityOf(By.xpath(lastName));
		  driver.findElement(By.xpath(lastName)).sendKeys("Test");;
		  highlightElement(By.xpath(lastName));
		  clickUsingJavaScript(By.xpath(lastName)); }
		 
        @Test(priority=11)
      	public  void birthDate() throws InterruptedException {
			/*
			 * waitForVisibilityOf(By.xpath(birthDate)); Thread.sleep(1000); //
			 * driver.findElement(By.xpath(birthDate)).sendKeys("3");; JavascriptExecutor
			 * js=(JavascriptExecutor) driver;
			 * 
			 * js.executeScript("document.getElementById('mat-input-12').value='3'");
			 * Thread.sleep(3000); highlightElement(By.xpath(birthDate));
			 * 
			 * //clickUsingJavaScript(By.xpath(birthDate));
			 */      	waitForVisibilityOf(By.xpath(birthDate));
    	highlightElement(By.xpath(birthDate));
		 driver.findElement(By.xpath(birthDate));
		 clickUsingJavaScript(By.xpath(birthDate));
		 
		
		 
		 waitForVisibilityOf(By.xpath(SelectDate)); 
		 highlightElement(By.xpath(SelectDate));
		 driver.findElement(By.xpath(SelectDate));
		 clickUsingJavaScript(By.xpath(SelectDate));
        }

		/*
		 * @Test(priority=12) public void age() { waitForVisibilityOf(By.xpath(age));
		 * driver.findElement(By.xpath(age)).sendKeys("3");;
		 * highlightElement(By.xpath(age)); clickUsingJavaScript(By.xpath(age)); }
		 */
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
            waitForVisibilityOf(By.xpath(clickClose));
           
          	highlightElement(By.xpath(clickClose));
        	clickUsingJavaScript(By.xpath(clickClose));
            
        }
        @Test(priority=20)
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
        	
        	
        	//waitForVisibilityOf(By.xpath(success));
            //Assert.assertEquals("success", driver.findElement(By.xpath(success)).getText());
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
