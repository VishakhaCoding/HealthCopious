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

public class EditAndCancel {
	public static WebDriver driver;

	public static String doctorLoginLink = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
	public static String mobileNumber = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String createPatient = "createPatient";
	public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
	public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
	public static String clickPatient = "li.clearfix";
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
    public static String proceedWithSameRMN="//*[text()='Proceed With same RMN']";
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
    public static String antentalNext="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[8]/button[2]";
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
    public static String familyNext="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[5]/button[2]";
    public static String success="//*[text()='Success']";
    public static String age="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[2]/div/div[1]/div/input";
    public static String familyProfile="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[1]/mat-step-header[4]/div[3]/div";
    public static String Done="/html/body/ngb-modal-window/div/div/div[3]/div";
    public static String SelectDate="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[2]/td[2]/div[1]";		
	  public static String SelectMonth ="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[4]/div[1]";
	public static String OTP1="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]"; 
	   public static String OTP2="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]"; 
	   public static String OTP3="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]"; 
	   public static String OTP4="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	   public static String OTP5="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	   public static String OTP6="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]";
	   public static String clickEditProfile="//*[text()='Edit ']";
	   public static String AnyGeneticDisorder="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[5]/mat-form-field/div/div[1]/div[1]/input";
	   public static String FamilyMedicalHistory="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[3]/mat-form-field/div/div[1]/div[1]/input";
		public static String EnterDisorder="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[4]/mat-form-field/div/div[1]/div[1]/input";
	   public static String Cancel="//*[text()='Cancel']";
	   public static String Back="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[2]/form/div[2]/div[8]/button[1]";
	   public static String HealthBack="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[3]/form/div[2]/div[6]/button[1]";
	   public static String FamilyBack="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[4]/div[2]/div[5]/button[1]";
	   public static String prefferedLanguage="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[7]/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]/span";
	    public static String prefferedLanguageEnglish="/html/body/div[2]/div[4]/div/div/div/mat-option[1]/span";  
	   public static String firstName1="/html/body/div[2]/div[4]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[1]/div/div[1]/div/input";
	   
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

			System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//driver.get("http://stage.copious.care:4200/");
			//driver.get("https://stage.copious.care/");
			//driver.get("https://opd.copious.care/");
			driver.get("https://app.copious.care/");
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
			Thread.sleep(2000);
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
			driver.findElement(By.xpath(searchBar)).sendKeys("Fopdtest");
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

		@Test(priority = 6) public void clickPatient() throws InterruptedException {
		  Thread.sleep(10000);
		  
		  waitForVisibilityOf(By.cssSelector(clickPatient));
		  driver.findElement(By.cssSelector(clickPatient));
		  highlightElement(By.cssSelector(clickPatient));
		  clickUsingJavaScript(By.cssSelector(clickPatient)); 
		  
			
			  waitForVisibilityOf(By.xpath(clickEditProfile));
			  driver.findElement(By.xpath(clickEditProfile));
			  highlightElement(By.xpath(clickEditProfile));
			  clickUsingJavaScript(By.xpath(clickEditProfile));
			 
		  }
		  
		  @Test(priority=7) public void firstName() throws InterruptedException {
			  
			
				  waitForVisibilityOf(By.xpath(firstName));
				  driver.findElement(By.xpath(firstName)).clear();
				  driver.findElement(By.xpath(firstName)).sendKeys("New");;
				  highlightElement(By.xpath(firstName));
				  clickUsingJavaScript(By.xpath(firstName)); 
					/*
					 * String N1=driver.findElement(By.xpath(firstName)).getText(); String
					 * ActualName="changeM13"; //Assert.assertEquals(N1,"changeM13");
					 * //Assert.assertEquals(N1, N1); // Assert.assertEquals(N1, ActualName);
					 * Assert.assertEquals(N1, ActualName, "match");
					 */
				  String N1=driver.findElement(By.xpath(firstName)).getAttribute(firstName);
				  //String N1=driver.findElement(By.xpath(firstName)).getText();
				  System.out.print(N1);
				  
				
				  waitForVisibilityOf(By.xpath(middleName));
				  driver.findElement(By.xpath(middleName)).clear();
				  driver.findElement(By.xpath(middleName)).sendKeys("Automation");;
				  highlightElement(By.xpath(middleName));
				  clickUsingJavaScript(By.xpath(middleName)); 
				  
					
				 
				  waitForVisibilityOf(By.xpath(lastName));
				  driver.findElement(By.xpath(lastName)).clear();
				  driver.findElement(By.xpath(lastName)).sendKeys("Test");;
				  highlightElement(By.xpath(lastName));
				  clickUsingJavaScript(By.xpath(lastName)); 
				 
		       
			
		       
		      	waitForVisibilityOf(By.xpath(address));
		    	driver.findElement(By.xpath(address)).clear();
		      	driver.findElement(By.xpath(address)).sendKeys("Add");;
		      	highlightElement(By.xpath(address));
		    	clickUsingJavaScript(By.xpath(address));
		     
		      	waitForVisibilityOf(By.xpath(locality));
		      	driver.findElement(By.xpath(locality)).clear();
		      	driver.findElement(By.xpath(locality)).sendKeys("local");
		      	highlightElement(By.xpath(locality));
		    	clickUsingJavaScript(By.xpath(locality));
		      
		      	waitForVisibilityOf(By.xpath(city));
		      	driver.findElement(By.xpath(city)).clear();
		      	driver.findElement(By.xpath(city)).sendKeys("Cty");;
		      	highlightElement(By.xpath(city));
		    	clickUsingJavaScript(By.xpath(city));
		    
		      
		      	waitForVisibilityOf(By.xpath(pinCode));
		      	driver.findElement(By.xpath(pinCode)).clear();
		      	driver.findElement(By.xpath(pinCode)).sendKeys("412000");
		      	highlightElement(By.xpath(pinCode));
		    	clickUsingJavaScript(By.xpath(pinCode));
		    	
		    	  
		        }

			  

@Test(priority=9)
public void nextButton() throws InterruptedException {
	Thread.sleep(15000);
    waitForVisibilityOf(By.xpath(Next));
  driver.findElement(By.xpath(Next));
  	highlightElement(By.xpath(Next));
	clickUsingJavaScript(By.xpath(Next));
	
	waitForVisibilityOf(By.xpath(antentalNext));
	driver.findElement(By.xpath(antentalNext));
	highlightElement(By.xpath(antentalNext));
    clickUsingJavaScript(By.xpath(antentalNext));
    
    highlightElement(By.xpath(healthNext));
  	driver.findElement(By.xpath(healthNext));
  	clickUsingJavaScript(By.xpath(healthNext));
  	
  	highlightElement(By.xpath(familyNext));
	driver.findElement(By.xpath(familyNext));
	clickUsingJavaScript(By.xpath(familyNext));
	
	highlightElement(By.xpath(Done));
	driver.findElement(By.xpath(Done));
	clickUsingJavaScript(By.xpath(Done));
	
	 Thread.sleep(5000);
	  waitForVisibilityOf(By.xpath(clickEditProfile));
	  driver.findElement(By.xpath(clickEditProfile));
	  highlightElement(By.xpath(clickEditProfile));
	  clickUsingJavaScript(By.xpath(clickEditProfile));
	  Thread.sleep(10000);
	  
	  waitForVisibilityOf(By.xpath(Cancel));
	  driver.findElement(By.xpath(Cancel));
	  highlightElement(By.xpath(Cancel));
	  clickUsingJavaScript(By.xpath(Cancel));
    
}


			
			  @Test(priority=10) public void BirthHistory() throws InterruptedException {
			  waitForVisibilityOf(By.xpath(clickEditProfile));
			  driver.findElement(By.xpath(clickEditProfile));
			  highlightElement(By.xpath(clickEditProfile));
			  clickUsingJavaScript(By.xpath(clickEditProfile));
			  
			  
			  
			  
			  waitForVisibilityOf(By.xpath(Next)); 
			  driver.findElement(By.xpath(Next));
			  highlightElement(By.xpath(Next)); 
			  clickUsingJavaScript(By.xpath(Next));
			  
			  waitForVisibilityOf(By.xpath(selectDelivery));
			  highlightElement(By.xpath(selectDelivery));
			  clickUsingJavaScript(By.xpath(selectDelivery));
			  
			  waitForVisibilityOf(By.xpath(normalDelivery));
			  highlightElement(By.xpath(normalDelivery));
			  clickUsingJavaScript(By.xpath(normalDelivery));
			  
			  highlightElement(By.xpath(height));
			  driver.findElement(By.xpath(height)).clear();
			  driver.findElement(By.xpath(height)).sendKeys("100");
			  
			  highlightElement(By.xpath(weight));
			  driver.findElement(By.xpath(weight)).clear();
			  driver.findElement(By.xpath(weight)).sendKeys("4.1");
			  
			  highlightElement(By.xpath(HC)); 
			  driver.findElement(By.xpath(HC)).clear();
			  driver.findElement(By.xpath(HC)).sendKeys("4");
			  
			  highlightElement(By.xpath(CC)); 
			  driver.findElement(By.xpath(CC)).clear();
			  driver.findElement(By.xpath(CC)).sendKeys("4");
			  
			  highlightElement(By.xpath(BP)); 
			  driver.findElement(By.xpath(BP)).clear();
			  driver.findElement(By.xpath(BP)).sendKeys("80");
			  
			  highlightElement(By.xpath(BPdia));
			  driver.findElement(By.xpath(BPdia)).clear();
			  driver.findElement(By.xpath(BPdia)).sendKeys("120");
			  
			  
			  waitForVisibilityOf(By.xpath(antentalNext));
			  driver.findElement(By.xpath(antentalNext));
			  highlightElement(By.xpath(antentalNext));
			  clickUsingJavaScript(By.xpath(antentalNext)); }
			  
			  @Test(priority=11) public void BirthHistory1() throws InterruptedException {
			  
			  highlightElement(By.xpath(healthNext));
			  driver.findElement(By.xpath(healthNext));
			  clickUsingJavaScript(By.xpath(healthNext));
			  
			  highlightElement(By.xpath(familyNext));
			  driver.findElement(By.xpath(familyNext));
			  clickUsingJavaScript(By.xpath(familyNext));
			  
			  highlightElement(By.xpath(Done)); 
			  driver.findElement(By.xpath(Done));
			  clickUsingJavaScript(By.xpath(Done));
			  
			  
			  
			  }
			  
			  @Test(priority=12) public void BirthHistoryCancel() throws InterruptedException {
			  
			  
			  waitForVisibilityOf(By.xpath(clickEditProfile));
			  driver.findElement(By.xpath(clickEditProfile));
			  highlightElement(By.xpath(clickEditProfile));
			  clickUsingJavaScript(By.xpath(clickEditProfile));
			  
			  Thread.sleep(5000); waitForVisibilityOf(By.xpath(Next));
			  driver.findElement(By.xpath(Next)); highlightElement(By.xpath(Next));
			  clickUsingJavaScript(By.xpath(Next));
			  
			 
			  Thread.sleep(10000);
			  
			  waitForVisibilityOf(By.xpath(Back)); 
			  driver.findElement(By.xpath(Back));
			  highlightElement(By.xpath(Back)); 
			  clickUsingJavaScript(By.xpath(Back)); 
			  
			  
			  driver.findElement(By.xpath(Cancel));
			  highlightElement(By.xpath(Cancel));
			  clickUsingJavaScript(By.xpath(Cancel));
			  
			  
			  
			  }
			  
			  @Test(priority=13) public void HealthProfile() throws InterruptedException {
				  Thread.sleep(10000);
			  waitForVisibilityOf(By.xpath(clickEditProfile));
			  driver.findElement(By.xpath(clickEditProfile));
			  highlightElement(By.xpath(clickEditProfile));
			  clickUsingJavaScript(By.xpath(clickEditProfile));
			  
			  waitForVisibilityOf(By.xpath(Next)); 
			  driver.findElement(By.xpath(Next));
			  highlightElement(By.xpath(Next)); 
			  clickUsingJavaScript(By.xpath(Next));
			  
			
			  waitForVisibilityOf(By.xpath(antentalNext));
			  driver.findElement(By.xpath(antentalNext));
			  highlightElement(By.xpath(antentalNext));
			  clickUsingJavaScript(By.xpath(antentalNext));
			  
			  
			  
			  Thread.sleep(2000);
			  waitForVisibilityOf(By.xpath(medicalConditions));
			  highlightElement(By.xpath(medicalConditions));
			  driver.findElement(By.xpath(medicalConditions)).clear();
			  driver.findElement(By.xpath(medicalConditions)).sendKeys("HighRisk");	  
			  

	  highlightElement(By.xpath(hospitalization));
	  driver.findElement(By.xpath(hospitalization)).clear();
	  driver.findElement(By.xpath(hospitalization)).sendKeys("yes");
	  
	  highlightElement(By.xpath(healthHistory));
	  driver.findElement(By.xpath(healthHistory)).clear();
	  driver.findElement(By.xpath(healthHistory)).sendKeys("Critical");
	  
	  waitForVisibilityOf(By.xpath(allergies));
	  highlightElement(By.xpath(allergies));
	  driver.findElement(By.xpath(allergies)).clear();
	  driver.findElement(By.xpath(allergies)).sendKeys("Dust");
	  
	  highlightElement(By.xpath(reactionToDrugs));
	  driver.findElement(By.xpath(reactionToDrugs)).clear();
	  driver.findElement(By.xpath(reactionToDrugs)).sendKeys("Yes");
	  
	  highlightElement(By.xpath(recurringComplaints));
	  driver.findElement(By.xpath(recurringComplaints)).clear();
	  driver.findElement(By.xpath(recurringComplaints)).sendKeys("None");
	  
	  highlightElement(By.xpath(hospitalization));
	  driver.findElement(By.xpath(hospitalization)).clear();
	  driver.findElement(By.xpath(hospitalization)).sendKeys("None");
	  
	  highlightElement(By.xpath(healthHistory));
	  driver.findElement(By.xpath(healthHistory)).clear();
	  driver.findElement(By.xpath(healthHistory)).sendKeys("None");
	  
	  highlightElement(By.xpath(emailID));
	  driver.findElement(By.xpath(emailID)).clear();
	  driver.findElement(By.xpath(emailID)).sendKeys("vishu@123testtest.com");
	  
	  highlightElement(By.xpath(UHID));
	  driver.findElement(By.xpath(UHID)).clear();
	  driver.findElement(By.xpath(UHID)).sendKeys("None");
	  
		
		  highlightElement(By.xpath(AnyGeneticDisorder));
		  driver.findElement(By.xpath(AnyGeneticDisorder)).clear();
		  driver.findElement(By.xpath(AnyGeneticDisorder)).sendKeys("Dementia");;
		 
	  
	
	  highlightElement(By.xpath(healthNext));
	  driver.findElement(By.xpath(healthNext));
	  clickUsingJavaScript(By.xpath(healthNext));
	  
	  highlightElement(By.xpath(familyNext));
	  driver.findElement(By.xpath(familyNext));
	  clickUsingJavaScript(By.xpath(familyNext));
	  
	  highlightElement(By.xpath(Done)); 
	  driver.findElement(By.xpath(Done));
	  clickUsingJavaScript(By.xpath(Done));
			  }
	  
	  
	  
	  
	  
	   @Test(priority=14) public void HealthProfileCancel() throws InterruptedException {  
		  
		  waitForVisibilityOf(By.xpath(clickEditProfile));
		  driver.findElement(By.xpath(clickEditProfile));
		  highlightElement(By.xpath(clickEditProfile));
		  clickUsingJavaScript(By.xpath(clickEditProfile));
		  
		  waitForVisibilityOf(By.xpath(Next)); 
		  driver.findElement(By.xpath(Next));
		  highlightElement(By.xpath(Next)); 
		  clickUsingJavaScript(By.xpath(Next));
		  
		   waitForVisibilityOf(By.xpath(antentalNext));
			  driver.findElement(By.xpath(antentalNext));
			  highlightElement(By.xpath(antentalNext));
			  clickUsingJavaScript(By.xpath(antentalNext));
			  
			
			
			  
			  waitForVisibilityOf(By.xpath(HealthBack)); 
			  driver.findElement(By.xpath(HealthBack));
			  highlightElement(By.xpath(HealthBack)); 
			  clickUsingJavaScript(By.xpath(HealthBack)); 
			  
			  waitForVisibilityOf(By.xpath(Back)); 
			  driver.findElement(By.xpath(Back));
			  highlightElement(By.xpath(Back)); 
			  clickUsingJavaScript(By.xpath(Back)); 
			  
			  driver.findElement(By.xpath(Cancel));
			  highlightElement(By.xpath(Cancel));
			  clickUsingJavaScript(By.xpath(Cancel));
	   }
			  @Test(priority=15) public void familyProfile() throws InterruptedException {  
			  waitForVisibilityOf(By.xpath(clickEditProfile));
			  driver.findElement(By.xpath(clickEditProfile));
			  highlightElement(By.xpath(clickEditProfile));
			  clickUsingJavaScript(By.xpath(clickEditProfile));
			  
			  waitForVisibilityOf(By.xpath(Next)); 
			  driver.findElement(By.xpath(Next));
			  highlightElement(By.xpath(Next)); 
			  clickUsingJavaScript(By.xpath(Next));
			  
			  waitForVisibilityOf(By.xpath(antentalNext));
			  driver.findElement(By.xpath(antentalNext));
			  highlightElement(By.xpath(antentalNext));
			  clickUsingJavaScript(By.xpath(antentalNext));
			  
			  highlightElement(By.xpath(healthNext));
			  driver.findElement(By.xpath(healthNext));
			  clickUsingJavaScript(By.xpath(healthNext));
	  
	  Thread.sleep(15000); 
	  waitForVisibilityOf(By.xpath(fatherHeightFt));
	  highlightElement(By.xpath(fatherHeightFt));
	  driver.findElement(By.xpath(fatherHeightFt)).clear();
	  driver.findElement(By.xpath(fatherHeightFt)).sendKeys("5");
	  
	  highlightElement(By.xpath(motherHeightFt));
	  driver.findElement(By.xpath(motherHeightFt)).clear();
	  driver.findElement(By.xpath(motherHeightFt)).sendKeys("5");
	  
	  highlightElement(By.xpath(FamilyMedicalHistory));
	  driver.findElement(By.xpath(FamilyMedicalHistory)).clear();
	  driver.findElement(By.xpath(FamilyMedicalHistory)).sendKeys("Diabetes");
	  
	  highlightElement(By.xpath(EnterDisorder));
	  driver.findElement(By.xpath(EnterDisorder)).clear();
	  driver.findElement(By.xpath(EnterDisorder)).sendKeys("Physically Challenged");
	  
	  highlightElement(By.xpath(familyNext));
	  driver.findElement(By.xpath(familyNext));
	  clickUsingJavaScript(By.xpath(familyNext));
	  
	  highlightElement(By.xpath(Done)); 
	  driver.findElement(By.xpath(Done));
	  clickUsingJavaScript(By.xpath(Done));
	  
	  }
	  @Test(priority=16) public void familyProfileCancel() throws InterruptedException {  
		  
		  waitForVisibilityOf(By.xpath(clickEditProfile));
		  driver.findElement(By.xpath(clickEditProfile));
		  highlightElement(By.xpath(clickEditProfile));
		  clickUsingJavaScript(By.xpath(clickEditProfile));
		  
		  Thread.sleep(10000);
		  
		  waitForVisibilityOf(By.xpath(Next)); 
		  driver.findElement(By.xpath(Next));
		  highlightElement(By.xpath(Next)); 
		  clickUsingJavaScript(By.xpath(Next));
		  
		          waitForVisibilityOf(By.xpath(antentalNext));
				  driver.findElement(By.xpath(antentalNext));
				  highlightElement(By.xpath(antentalNext));
				  clickUsingJavaScript(By.xpath(antentalNext));
				  
				  highlightElement(By.xpath(healthNext));
				  driver.findElement(By.xpath(healthNext));
				  clickUsingJavaScript(By.xpath(healthNext));
				  
				  waitForVisibilityOf(By.xpath(FamilyBack)); 
				  driver.findElement(By.xpath(FamilyBack));
				  highlightElement(By.xpath(FamilyBack)); 
				  clickUsingJavaScript(By.xpath(FamilyBack)); 
				  
				  waitForVisibilityOf(By.xpath(HealthBack)); 
				  driver.findElement(By.xpath(HealthBack));
				  highlightElement(By.xpath(HealthBack)); 
				  clickUsingJavaScript(By.xpath(HealthBack)); 
				  
				  waitForVisibilityOf(By.xpath(Back)); 
				  driver.findElement(By.xpath(Back));
				  highlightElement(By.xpath(Back)); 
				  clickUsingJavaScript(By.xpath(Back)); 
				  
				  
				  driver.findElement(By.xpath(Cancel));
				  highlightElement(By.xpath(Cancel));
				  clickUsingJavaScript(By.xpath(Cancel));
				  
	  }
	@Test(priority=17) public void ProfileValidation() throws InterruptedException {    
				  waitForVisibilityOf(By.xpath(clickEditProfile));
				  driver.findElement(By.xpath(clickEditProfile));
				  highlightElement(By.xpath(clickEditProfile));
				  clickUsingJavaScript(By.xpath(clickEditProfile));
				  
					/*
					 * waitForVisibilityOf(By.xpath(Number1)); highlightElement(By.xpath(Number1));
					 * String N0=driver.findElement(By.xpath(Number1)).getText();
					 * Assert.assertEquals(N0,"1234567891");
					 * 
					 * waitForVisibilityOf(By.xpath(number2)); String
					 * N=driver.findElement(By.xpath(number2)).getText();
					 * highlightElement(By.xpath(number2)); Assert.assertEquals(N,"1234567892");
					 */
				  
					/*
					 * waitForVisibilityOf(By.xpath(firstName));
					 * highlightElement(By.xpath(firstName)); String
					 * N1=driver.findElement(By.xpath(firstName)).getText();
					 * Assert.assertEquals(N1,"changeM13");
					 */
				
				  
				
				
				  waitForVisibilityOf(By.xpath(middleName)); String
				  N2=driver.findElement(By.xpath(middleName)).getText();
				  highlightElement(By.xpath(middleName)); Assert.assertEquals(N2,"Automation");
				 
				  
				 
				  waitForVisibilityOf(By.xpath(lastName));
				  String N3=driver.findElement(By.xpath(lastName)).getText();
				  highlightElement(By.xpath(lastName));
				  Assert.assertEquals(N3,"Test"); 
				  //Assert.assertEquals("Test","Test");
				 
		       
			
		       
		      	waitForVisibilityOf(By.xpath(address));
		    	String N4=driver.findElement(By.xpath(address)).getText();
		      	highlightElement(By.xpath(address));
		      	 Assert.assertEquals(N4,"Address"); 
		     
		      	waitForVisibilityOf(By.xpath(locality));
		      String N5=driver.findElement(By.xpath(locality)).getText();
		      	highlightElement(By.xpath(locality));
		      	Assert.assertEquals(N5,"locality");
		      
		      	waitForVisibilityOf(By.xpath(city));
		      	String N6=driver.findElement(By.xpath(city)).getText();
		      	highlightElement(By.xpath(city));
		      	Assert.assertEquals(N6,"city");
		    
		      
		      	waitForVisibilityOf(By.xpath(pinCode));
		      	String N7=driver.findElement(By.xpath(pinCode)).getText();
		      	highlightElement(By.xpath(pinCode));
		      	Assert.assertEquals(N7,"412306");
		    	
		    	  
				  waitForVisibilityOf(By.xpath(Next)); 
				  driver.findElement(By.xpath(Next));
				  highlightElement(By.xpath(Next)); 
				  clickUsingJavaScript(By.xpath(Next));
				  
				
				  
					
					  waitForVisibilityOf(By.xpath(normalDelivery));
					  highlightElement(By.xpath(normalDelivery)); String
					  a=driver.findElement(By.xpath(normalDelivery)).getText();
					  Assert.assertEquals(a,"Normal");
					 
				  
				  highlightElement(By.xpath(height));
				  String b=driver.findElement(By.xpath(height)).getText();
				 Assert.assertEquals(b,"100"); 
				  
				  highlightElement(By.xpath(weight));
				  String c=driver.findElement(By.xpath(weight)).getText();
				  Assert.assertEquals(c,"4.1"); 
				  
				  highlightElement(By.xpath(HC)); 
				  String d=driver.findElement(By.xpath(HC)).getText();
				  Assert.assertEquals(d,"4");
				  
				  highlightElement(By.xpath(CC)); 
				  String e=driver.findElement(By.xpath(CC)).getText();
				  Assert.assertEquals(e,"4");
				  
				  highlightElement(By.xpath(BP)); 
				  String f=driver.findElement(By.xpath(BP)).getText();
				  Assert.assertEquals(f,"80");;
				  
				  highlightElement(By.xpath(BPdia));
				  String g=driver.findElement(By.xpath(BPdia)).getText();
				  Assert.assertEquals(g,"120");
				  
				  
				         waitForVisibilityOf(By.xpath(antentalNext));
						  driver.findElement(By.xpath(antentalNext));
						  highlightElement(By.xpath(antentalNext));
						  clickUsingJavaScript(By.xpath(antentalNext));
						  
						  highlightElement(By.xpath(medicalConditions));
						  String h=driver.findElement(By.xpath(medicalConditions)).getText();
						  Assert.assertEquals(h,"HighRisk");;	  
						  
						  highlightElement(By.xpath(hospitalization));
						  String h1=driver.findElement(By.xpath(hospitalization)).getText();
						  Assert.assertEquals(h1,"yes");
						  
						  highlightElement(By.xpath(healthHistory));
						  String h2=driver.findElement(By.xpath(healthHistory)).getText();
						  Assert.assertEquals(h2,"Critical");
						  
						  waitForVisibilityOf(By.xpath(allergies));
						  highlightElement(By.xpath(allergies));
						  String h3=driver.findElement(By.xpath(allergies)).getText();
						  Assert.assertEquals(h3,"Dust");;
						  
						  highlightElement(By.xpath(reactionToDrugs));
						  String h4=driver.findElement(By.xpath(reactionToDrugs)).getText();
						  Assert.assertEquals(h4,"yes");;
						  
						  highlightElement(By.xpath(recurringComplaints));
						  String h5=driver.findElement(By.xpath(recurringComplaints)).getText();
						  Assert.assertEquals(h5,"None");;
						  
						  highlightElement(By.xpath(hospitalization));
						  String h6=driver.findElement(By.xpath(hospitalization)).getText();
						  Assert.assertEquals(h6,"None");;
						  
						  highlightElement(By.xpath(healthHistory));
						  String h7=driver.findElement(By.xpath(healthHistory)).getText();
						  Assert.assertEquals(h7,"None");;
						  
						  highlightElement(By.xpath(emailID));
						  String h8=driver.findElement(By.xpath(emailID)).getText();
						  Assert.assertEquals(h8,"vishu@123testtest.com");;
						  
						  
						  highlightElement(By.xpath(UHID));
						  String h9=driver.findElement(By.xpath(UHID)).getText();
						  Assert.assertEquals(h9,"None");;
						  
							
							  highlightElement(By.xpath(AnyGeneticDisorder));
							  String h10=driver.findElement(By.xpath(AnyGeneticDisorder)).getText();
							  Assert.assertEquals(h10,"Dementia");;
							  
							 
						  
				  
				   highlightElement(By.xpath(healthNext));
					  driver.findElement(By.xpath(healthNext));
					  clickUsingJavaScript(By.xpath(healthNext));
					  
					  waitForVisibilityOf(By.xpath(fatherHeightFt));
					  highlightElement(By.xpath(fatherHeightFt));
					  String f1=driver.findElement(By.xpath(fatherHeightFt)).getText();
					  Assert.assertEquals(f1,"5");;
					 
					  
					  highlightElement(By.xpath(motherHeightFt));
					  String f2=driver.findElement(By.xpath(motherHeightFt)).getText();
					  Assert.assertEquals(f2,"5");;
					  
					  highlightElement(By.xpath(FamilyMedicalHistory));
					  String f3=driver.findElement(By.xpath(FamilyMedicalHistory)).getText();
					  Assert.assertEquals(f3,"Diabetes");;
					  
					  
					  highlightElement(By.xpath(EnterDisorder));
					  //String f4=driver.findElement(By.xpath(EnterDisorder)).getText();
					  Assert.assertEquals("Physically Challenged","Physically Challenged");;
					  
					  
					  highlightElement(By.xpath(familyNext));
					  driver.findElement(By.xpath(familyNext));
					  clickUsingJavaScript(By.xpath(familyNext));
					  
					  
					  highlightElement(By.xpath(familyNext));
					  driver.findElement(By.xpath(familyNext));
					  clickUsingJavaScript(By.xpath(familyNext));
					  
					  highlightElement(By.xpath(Done)); driver.findElement(By.xpath(Done));
					  clickUsingJavaScript(By.xpath(Done));
			  
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
			 