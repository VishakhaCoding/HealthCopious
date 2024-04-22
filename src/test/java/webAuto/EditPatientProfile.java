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

public class EditPatientProfile {
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
	public static String OTP1="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]"; 
	   public static String OTP2="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]"; 
	   public static String OTP3="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]"; 
	   public static String OTP4="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	   public static String OTP5="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	   public static String OTP6="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]";
	   public static String clickEditProfile="//*[text()='Edit ']";
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

			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//driver.get("http://stage.copious.care:4200/");
			//driver.get("https://stage.copious.care/");
			driver.get("https://app.copious.care/");
			 driver.manage().window().fullscreen();
		}

	
		@Test(priority = 1,groups="log")
		public void numberField() {
			waitForVisibilityOf(By.xpath(mobileNumber));
			driver.findElement(By.xpath(mobileNumber)).sendKeys("9665002440");
			highlightElement(By.xpath(mobileNumber));
			clickUsingJavaScript(By.xpath(mobileNumber));
		}

		@Test(priority = 2,groups="log")
		public void sendOTP() throws InterruptedException {
			Thread.sleep(2000);
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

		@Test(priority = 3,groups="log")
		public void verifyButton() throws InterruptedException {
			Thread.sleep(10000);
			waitForVisibilityOf(By.xpath(verifyOTP));
			driver.findElement(By.xpath(verifyOTP));
			highlightElement(By.xpath(verifyOTP));
			clickUsingJavaScript(By.xpath(verifyOTP));
			
		}

		@Test(priority = 4,groups="log")
		public void searchBar() {
			waitForVisibilityOf(By.xpath(searchBar));
			driver.findElement(By.xpath(searchBar)).sendKeys("Test");
			
			//driver.findElement(By.xpath(searchBar)).sendKeys("pres");
			highlightElement(By.xpath(searchBar));
			clickUsingJavaScript(By.xpath(searchBar));
		}

		@Test(priority = 5,groups="log")
		public void searchOpt() throws InterruptedException {
			Thread.sleep(3000);
			waitForVisibilityOf(By.xpath(searchOpt));
			driver.findElement(By.xpath(searchOpt));
			highlightElement(By.xpath(searchOpt));
			clickUsingJavaScript(By.xpath(searchOpt));
		}

		  @Test(priority = 6,groups="log") public void clickPatient() throws InterruptedException {
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
		  
		  @Test(priority=7) public void firstName() {
			  waitForVisibilityOf(By.xpath(firstName));
			  driver.findElement(By.xpath(firstName)).clear();
			  driver.findElement(By.xpath(firstName)).sendKeys("WeightEdit");
			  highlightElement(By.xpath(firstName));
			  clickUsingJavaScript(By.xpath(firstName)); 
			  
		  
		  
		  
		  
		  }
			  
			  @Test(priority=9) public void middleName() {
			  waitForVisibilityOf(By.xpath(middleName));
			  driver.findElement(By.xpath(middleName)).clear();
			  driver.findElement(By.xpath(middleName)).sendKeys("Automation");
			  highlightElement(By.xpath(middleName));
			  clickUsingJavaScript(By.xpath(middleName)); }
			  
			  @Test(priority=8) public void lastName() {
			  waitForVisibilityOf(By.xpath(lastName));
			  driver.findElement(By.xpath(lastName)).clear();
			  driver.findElement(By.xpath(lastName)).sendKeys("EditTest");
			  highlightElement(By.xpath(lastName));
			  clickUsingJavaScript(By.xpath(lastName)); }
		  
		  
@Test(priority=9)
public void nextButton() throws InterruptedException {
	Thread.sleep(15000);
    waitForVisibilityOf(By.xpath(Next));
  driver.findElement(By.xpath(Next));
  	highlightElement(By.xpath(Next));
	clickUsingJavaScript(By.xpath(Next));
    
}
@Test(priority=10)
public void fillVitalForm() throws InterruptedException {
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
  	
  	Thread.sleep(15000);
  	highlightElement(By.xpath(antentalNext));
  	clickUsingJavaScript(By.xpath(antentalNext));
  	
  	highlightElement(By.xpath(hospitalization));
  	driver.findElement(By.xpath(hospitalization)).clear();
  	driver.findElement(By.xpath(hospitalization)).sendKeys("None");
  	
	highlightElement(By.xpath(healthHistory));
	driver.findElement(By.xpath(healthHistory)).clear();
  	driver.findElement(By.xpath(healthHistory)).sendKeys("None");
  	
	highlightElement(By.xpath(emailID));
	driver.findElement(By.xpath(emailID)).clear();
  	driver.findElement(By.xpath(emailID)).sendKeys("vishu@123testtest.com");
  	
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
	
	highlightElement(By.xpath(familyNext));
	driver.findElement(By.xpath(familyNext));
	clickUsingJavaScript(By.xpath(familyNext));
	
	highlightElement(By.xpath(Done));
	driver.findElement(By.xpath(Done));
	clickUsingJavaScript(By.xpath(Done));
	
}
//@AfterClass public void close() throws IOException {
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
		
			
		
		  


