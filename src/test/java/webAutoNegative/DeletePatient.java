package webAutoNegative;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeletePatient {
	
	public static WebDriver driver;
	public static String mobileNumber = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
	public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
	public static String clickPatient = "li.clearfix";
	public static String LinkPatient="button.new_btn";
	public static String SearchDoctorMobile="/html/body/div[2]/div[2]/div/mat-dialog-container/div[1]/div/h4/div/div/div[1]/input";
	public static String LinkOption="div.new_btn.ng-star-inserted";
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
    public static String Done="/html/body/ngb-modal-window/div/div/div[3]/div";
   
    public static String SelectDate="//*[text()=' 1 ']";		
    public static String prefferedLanguage="//*[text()='Preferred Language']";
    public static String prefferedLanguageEnglish="//*[text()=' English ']";
    public static String FamilyMedicalHistory = "//*[text()='Family Profile']//following::input[23]";
		public static String EnterDisorder = "//*[text()='Family Profile']//following::input[24]";
		public static String AnyGeneticDisorder = "//*[text()='Health Profile']//following::input[27]";
    public static String  LinkNotification="//*[text()=' Linked Patient to Doctor']";
    public static String DeleteOption="//*[text()='Delete Patient']";
    public static String Delete="//*[text()='Cancel']/following::button";
    public static String OTP1="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]"; 
	   public static String OTP2="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]"; 
	   public static String OTP3="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]"; 
	   public static String OTP4="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	   public static String OTP5="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	   public static String OTP6="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]";
	   
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
	      	driver.findElement(By.xpath(number2)).sendKeys("1234567892");;
	      	highlightElement(By.xpath(number2));
	    	clickUsingJavaScript(By.xpath(number2));
	        }
	     

			
			  @Test(priority=8) public void firstName() {
			  waitForVisibilityOf(By.xpath(firstName));
			  driver.findElement(By.xpath(firstName)).sendKeys("test");;
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
	        	
	        	highlightElement(By.xpath(Done));
	        	driver.findElement(By.xpath(Done));
	        	clickUsingJavaScript(By.xpath(Done));
	            
	        	highlightElement(By.xpath(DeleteOption));
	        	driver.findElement(By.xpath(DeleteOption));
	        	clickUsingJavaScript(By.xpath(DeleteOption));
	        	
	        	highlightElement(By.xpath(Delete));
	        	driver.findElement(By.xpath(Delete));
	        	clickUsingJavaScript(By.xpath(Delete));
	        	
	        	
	        }


}
