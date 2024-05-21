package webAutoQueueNegative;

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

public class QLogIn {
	public static WebDriver driver;

	public static String doctorLoginLink = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
	public static String mobileNumber = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	 public static String createPatient="createPatient";
	    public static String Number1="/html/body/div[3]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[1]/mat-form-field[2]/div/div[1]/div/input";
	    public static String confirm="/html/body/div[3]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[1]/div/button";
	    public static String confirmPopup="//button[text()='Confirm']";
	    public static String number2="/html/body/div[3]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[1]/div[2]/mat-form-field[2]/div/div[1]/div/input";
	    public static String firstName="/html/body/div[3]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[1]/div/div[1]/div/input";
	    public static String middleName="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[2]/div/div[1]/div/input";
	    public static String lastName="/html/body/div[3]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[4]/mat-form-field[3]/div/div[1]/div/input";
	    public static String birthDate="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[1]/div/div[1]/div[1]/input";
	    public static String genFemale="//*[text()='Female']";
	    public static String address="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[1]/div/div[1]/div/input";
	    public static String locality="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[2]/div/div[1]/div/input";
	    public static String city="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[6]/mat-form-field[3]/div/div[1]/div/input";
	    public static String pinCode="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[7]/mat-form-field/div/div[1]/div/input";
	    public static String Next="//*[text()=' Next']";
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
	    public static String age="/html/body/div[3]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[1]/mat-form-field[2]/div/div[1]/div/input";
	    public static String familyProfile="/html/body/div[2]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[1]/mat-step-header[4]/div[3]/div";
	    public static String Done="/html/body/ngb-modal-window/div/div/div[3]/div";
	    public static String SelectDate="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[1]/td[2]/div[1]";		
		  public static String SelectMonth ="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[4]/div[1]";
		   public static String ClickYearDropdown="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]";
		   public static String clickYear="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[5]/td[3]/div[1]";
	public static String GenError="//*[text()=' Please Select Gender']";
	public static String SendOTPError="//*[text()='User Not Exists Please Register.']";
	public static String SendOTPError1="//*[text()='Please Enter 10 Digit of Phone Number']";
	public static String ErrorEnterNo="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[3]/div";
	public static String PatientListEmpty="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[1]/div/div/app-alertbox/div/div[2]/div[1]";
	public static String PatientAge="/html/body/div[3]/div[2]/div/mat-dialog-container/app-new-onboard-patient/p-toast/div/p-toastitem/div/div/div/div[2]/div[2]";
	public static String UseDOBError="/html/body/div[3]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/p";
	public static String genmaleSelect="/html/body/div[3]/div[2]/div/mat-dialog-container/app-new-onboard-patient/mat-horizontal-stepper/div[2]/div[1]/form/div/div[5]/div[2]/div";
	
	public static String OTP1="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]"; 
	   public static String OTP2="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]"; 
	   public static String OTP3="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]"; 
	   public static String OTP4="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	   public static String OTP5="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	   public static String OTP6="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]"; 
	   public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
		public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
		public static String verifyOTP1="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[5]/div";
		
		
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
		public void setUp() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			
			
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//driver.get("http://stage.copious.care:4200/");
			//driver.get("https://stage.copious.care/");
			driver.manage().window().fullscreen();
			 driver.get("https://app.copious.care/");
			 Thread.sleep(5000);
		}
		@Test(priority = 1)
		public void numberField1() {
			driver.findElement(By.xpath(mobileNumber)).clear();
			
			waitForVisibilityOf(By.xpath(mobileNumber));
			driver.findElement(By.xpath(mobileNumber)).sendKeys("");
			highlightElement(By.xpath(mobileNumber));
			
			waitForVisibilityOf(By.xpath(sendOTP));
			highlightElement(By.xpath(sendOTP));
			clickUsingJavaScript(By.xpath(sendOTP));
			
			highlightElement(By.xpath(ErrorEnterNo)); 
			  String actualMsg =driver.findElement(By.xpath(ErrorEnterNo)).getText();
			  System.out.println("actual Msg :"+actualMsg);
			  Object errorMessage = "Please Enter Phone Number";
			  Assert.assertEquals(actualMsg,errorMessage);
			
			
			
			}

		

	
		@Test(priority = 2)
		public void numberField2() {
			waitForVisibilityOf(By.xpath(mobileNumber));
			driver.findElement(By.xpath(mobileNumber)).sendKeys("960024400000000");
			highlightElement(By.xpath(mobileNumber));
			clickUsingJavaScript(By.xpath(mobileNumber));
		
	
			waitForVisibilityOf(By.xpath(sendOTP));
			highlightElement(By.xpath(sendOTP));
			clickUsingJavaScript(By.xpath(sendOTP));
			
			
			  highlightElement(By.xpath(SendOTPError)); 
			  String actualMsg =driver.findElement(By.xpath(SendOTPError)).getText();
			  System.out.println("actual Msg :"+actualMsg);
			  Object errorMessage = "User Not Exists Please Register.";
			  Assert.assertEquals(actualMsg,errorMessage);
			 
			
			
			}
		@Test(priority = 3)
		public void numberField3() {
			driver.findElement(By.xpath(mobileNumber)).clear();
			
			waitForVisibilityOf(By.xpath(mobileNumber));
			driver.findElement(By.xpath(mobileNumber)).sendKeys("1");
			highlightElement(By.xpath(mobileNumber));
			
			
			
			
			waitForVisibilityOf(By.xpath(sendOTP));
			highlightElement(By.xpath(sendOTP));
			clickUsingJavaScript(By.xpath(sendOTP));
			
			highlightElement(By.xpath(SendOTPError1));
	       	 String actualMsg = driver.findElement(By.xpath(SendOTPError1)).getText();
	            System.out.println("actual Msg :"+actualMsg);
	            Object errorMessage = "Please Enter 10 Digit of Phone Number";
				Assert.assertEquals(actualMsg,errorMessage);
		
		}
		@Test(priority = 4)
		public void numberField4() {
			driver.findElement(By.xpath(mobileNumber)).clear();
			
			waitForVisibilityOf(By.xpath(mobileNumber));
			driver.findElement(By.xpath(mobileNumber)).sendKeys("@###$%^%&^&&*&*&*&&**&&--+++*/|");
			highlightElement(By.xpath(mobileNumber));
			
			waitForVisibilityOf(By.xpath(sendOTP));
			highlightElement(By.xpath(sendOTP));
			clickUsingJavaScript(By.xpath(sendOTP));
			
			highlightElement(By.xpath(SendOTPError)); 
			  String actualMsg =driver.findElement(By.xpath(SendOTPError)).getText();
			  System.out.println("actual Msg :"+actualMsg);
			  Object errorMessage = "User Not Exists Please Register.";
			  Assert.assertEquals(actualMsg,errorMessage);
			
			
			
			}
		
			@Test(priority = 5)
		public void numberField5() {
			driver.findElement(By.xpath(mobileNumber)).clear();
			
			waitForVisibilityOf(By.xpath(mobileNumber));
			driver.findElement(By.xpath(mobileNumber)).sendKeys("बावन्न");
			highlightElement(By.xpath(mobileNumber));
			
			waitForVisibilityOf(By.xpath(sendOTP));
			highlightElement(By.xpath(sendOTP));
			clickUsingJavaScript(By.xpath(sendOTP));
			
			highlightElement(By.xpath(SendOTPError1));
	       	 String actualMsg = driver.findElement(By.xpath(SendOTPError1)).getText();
	            System.out.println("actual Msg :"+actualMsg);

	            Object errorMessage = "Please Enter 10 Digit of Phone Number";
				Assert.assertEquals(actualMsg,errorMessage);
			
			
			
			}
		
		
		
		
		@Test(priority = 6)
		public void numberField6() {
			driver.findElement(By.xpath(mobileNumber)).clear();
			waitForVisibilityOf(By.xpath(mobileNumber));
			driver.findElement(By.xpath(mobileNumber)).sendKeys("9665002440");
			highlightElement(By.xpath(mobileNumber));
			clickUsingJavaScript(By.xpath(mobileNumber));
		
			waitForVisibilityOf(By.xpath(sendOTP));
			highlightElement(By.xpath(sendOTP));
			clickUsingJavaScript(By.xpath(sendOTP));
			}
		@Test(priority = 7)
		public void sendOTP5() throws InterruptedException {
			Thread.sleep(2000);
		
		  waitForVisibilityOf(By.xpath(OTP1));
		   	driver.findElement(By.xpath(OTP1)).sendKeys("1");
		   	highlightElement(By.xpath(OTP1));
		   	
		   	waitForVisibilityOf(By.xpath(OTP2));
		   	driver.findElement(By.xpath(OTP2)).sendKeys("2");
		   	highlightElement(By.xpath(OTP2));
		   	
		   	waitForVisibilityOf(By.xpath(OTP3));
		   	driver.findElement(By.xpath(OTP3)).sendKeys("0");;
		   	highlightElement(By.xpath(OTP3));
		   	
		   	waitForVisibilityOf(By.xpath(OTP4));
		   	driver.findElement(By.xpath(OTP4)).sendKeys("5");;
		   	highlightElement(By.xpath(OTP4));
		   	
		   	waitForVisibilityOf(By.xpath(OTP5));
		   	driver.findElement(By.xpath(OTP5)).sendKeys("2");;
		   	highlightElement(By.xpath(OTP5));
		   	
		   	waitForVisibilityOf(By.xpath(OTP6));
		   	driver.findElement(By.xpath(OTP6)).sendKeys("0");;
		   	highlightElement(By.xpath(OTP6));
		   
		       
	
			waitForVisibilityOf(By.xpath(verifyOTP));
			driver.findElement(By.xpath(verifyOTP));
			highlightElement(By.xpath(verifyOTP));
			clickUsingJavaScript(By.xpath(verifyOTP));
			
			Thread.sleep(2000);
			highlightElement(By.xpath(verifyOTP1));
		 	 String actualMsg = driver.findElement(By.xpath(verifyOTP1)).getText();
	            System.out.println("actual Msg :"+actualMsg);
                Object errorMessage = "Please Enter Valid OTP.";
				Assert.assertEquals(actualMsg,errorMessage);
				
			
			
	
			
		}
			@Test(priority = 8)
			public void sendOTP1() throws InterruptedException {
				driver.findElement(By.xpath(OTP1)).clear();
			  waitForVisibilityOf(By.xpath(OTP1));
			   	driver.findElement(By.xpath(OTP1)).sendKeys("1");;
			   	highlightElement(By.xpath(OTP1));
			   	
			   	driver.findElement(By.xpath(OTP2)).clear();
			   	waitForVisibilityOf(By.xpath(OTP2));
			   	driver.findElement(By.xpath(OTP2)).sendKeys("4");
			   	highlightElement(By.xpath(OTP2));
			   	
				driver.findElement(By.xpath(OTP3)).clear();
			   	waitForVisibilityOf(By.xpath(OTP3));
			   	driver.findElement(By.xpath(OTP3)).sendKeys("0");;
			   	highlightElement(By.xpath(OTP3));
			   	
			   	
			   	driver.findElement(By.xpath(OTP4)).clear();
			   	waitForVisibilityOf(By.xpath(OTP4));
			   	driver.findElement(By.xpath(OTP4)).sendKeys("5");;
			   	highlightElement(By.xpath(OTP4));
			   	
			   	
				driver.findElement(By.xpath(OTP5)).clear();
			   	waitForVisibilityOf(By.xpath(OTP5));
			   	driver.findElement(By.xpath(OTP5)).sendKeys("2");;
			   	highlightElement(By.xpath(OTP5));
			   	
			   	
			   	driver.findElement(By.xpath(OTP6)).clear();
			   	waitForVisibilityOf(By.xpath(OTP6));
			   	driver.findElement(By.xpath(OTP6)).sendKeys("0");;
			   	highlightElement(By.xpath(OTP6));
			   	
			   	
			   	
					waitForVisibilityOf(By.xpath(verifyOTP));
					driver.findElement(By.xpath(verifyOTP));
					highlightElement(By.xpath(verifyOTP));
					clickUsingJavaScript(By.xpath(verifyOTP));
			   	
			       
		}
			@Test(priority = 9)
			public  void searchBar1() {
				waitForVisibilityOf(By.xpath(searchBar));
				driver.findElement(By.xpath(searchBar)).sendKeys("ppppppp");
				
				//driver.findElement(By.xpath(searchBar)).sendKeys("pres");
				highlightElement(By.xpath(searchBar));
				clickUsingJavaScript(By.xpath(searchBar));
			
				waitForVisibilityOf(By.xpath(searchOpt));
				driver.findElement(By.xpath(searchOpt));
				highlightElement(By.xpath(searchOpt));
				clickUsingJavaScript(By.xpath(searchOpt));
				
				highlightElement(By.xpath(PatientListEmpty));
				 String actualMsg = driver.findElement(By.xpath(PatientListEmpty)).getText();
		            System.out.println("actual Msg :"+actualMsg);
	                Object errorMessage = "Patients list empty";
					Assert.assertEquals(actualMsg,errorMessage);
				
				}
			
			@Test(priority=10)
	     	public  void createPatient() {
	        waitForVisibilityOf(By.id(createPatient));
	     	highlightElement(By.id(createPatient));
	     	clickUsingJavaScript(By.id(createPatient));
	     	//driver.findElement(By.id(createPatient)).click();
	     	}
	        @Test(priority=11)
	      	public  void Number1() throws InterruptedException {
	        	Thread.sleep(5000);
	      	waitForVisibilityOf(By.xpath(Number1));
	      	driver.findElement(By.xpath(Number1)).sendKeys("1234567891");
	      	highlightElement(By.xpath(Number1));
	    	clickUsingJavaScript(By.xpath(Number1));
	        }
	        @Test(priority=12)
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
	        @Test(priority=13)
	      	public  void number2() {
	      	waitForVisibilityOf(By.xpath(number2));
	      	driver.findElement(By.xpath(number2)).sendKeys("1234567892");;
	      	highlightElement(By.xpath(number2));
	    	clickUsingJavaScript(By.xpath(number2));
	        }
	     

			
			  @Test(priority=14) public void firstName() {
			  waitForVisibilityOf(By.xpath(firstName));
			  driver.findElement(By.xpath(firstName)).sendKeys("NewTesting");;
			  highlightElement(By.xpath(firstName));
			  clickUsingJavaScript(By.xpath(firstName)); }
			  
		
			  @Test(priority=15) public void lastName() {
			  waitForVisibilityOf(By.xpath(lastName));
			  driver.findElement(By.xpath(lastName)).sendKeys("Test");;
			  highlightElement(By.xpath(lastName));
			  clickUsingJavaScript(By.xpath(lastName)); }
		
	        @Test(priority=16)
	     @Ignore
	      	public  void genFemale() {
	      	waitForVisibilityOf(By.xpath(genFemale));
	      	driver.findElement(By.xpath(genFemale));
	      	highlightElement(By.xpath(genFemale));
	    	clickUsingJavaScript(By.xpath(genFemale));
	      	boolean as=driver.findElement(By.xpath(genFemale)).isDisplayed();
	      	Assert.assertEquals(as,true);
	      	driver.findElement(By.xpath(genFemale)).getText();
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
	        @Test(priority=17)
	        public void nextButton() throws InterruptedException {
	        	//Thread.sleep(15000);
	            waitForVisibilityOf(By.xpath(Next));
	          driver.findElement(By.xpath(Next));
	          	highlightElement(By.xpath(Next));
	        	clickUsingJavaScript(By.xpath(Next));
	        	
				
				  highlightElement(By.xpath(GenError)); String actualMsg =
				  driver.findElement(By.xpath(GenError)).getText();
				  System.out.println("actual Msg :"+actualMsg); Object errorMessage =
				  "Please Select Gender"; Assert.assertEquals(actualMsg,errorMessage);
				  
					
					
					  waitForVisibilityOf(By.xpath(genFemale));
					  driver.findElement(By.xpath(genFemale));
					  highlightElement(By.xpath(genFemale));
					  clickUsingJavaScript(By.xpath(genFemale));
					 
					 
		    	
		    	boolean as=driver.findElement(By.xpath(genmaleSelect)).isDisplayed();
		      	Assert.assertEquals(as,true);
		      	String p=driver.findElement(By.xpath(genmaleSelect)).getText();
		      	System.out.println(""+p);
		    	
		    	Thread.sleep(2000);
		    	
		    	waitForVisibilityOf(By.xpath(Next));
		          driver.findElement(By.xpath(Next));
		          	highlightElement(By.xpath(Next));
		        	clickUsingJavaScript(By.xpath(Next));
		        	
		        	Thread.sleep(2000);
		        	
		        	highlightElement(By.xpath(PatientAge));
		        	 String actualMsg1 = driver.findElement(By.xpath(PatientAge)).getText();
		             System.out.println("actual Msg :"+actualMsg1);
		             Object errorMessage1 = "Please Enter Patient Age";
					Assert.assertEquals(actualMsg1,errorMessage1);
					
					waitForVisibilityOf(By.xpath(age));
			      	driver.findElement(By.xpath(age)).sendKeys("1");
			      	highlightElement(By.xpath(age));
			    	
			      	highlightElement(By.xpath(UseDOBError));
		        	 String actualMsg2 = driver.findElement(By.xpath(UseDOBError)).getText();
		             System.out.println("actual Msg :"+actualMsg2);
		             Object errorMessage2 = "Use DOB for age less than 1 yrs";
					Assert.assertEquals(actualMsg2,errorMessage2);
					
				
				
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
