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

public class InvestigationReport {
	public static WebDriver driver;

	public static String doctorLoginLink = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
	public static String mobileNumber = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String createPatient = "createPatient";
	public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
	public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
	public static String clickPatient = "li.clearfix";
	public static String OTP1="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]"; 
	   public static String OTP2="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]"; 
	   public static String OTP3="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]"; 
	   public static String OTP4="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	   public static String OTP5="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	   public static String OTP6="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]"; 
	   public static String InvestigationClick="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[3]/img";
	   public static String ReportsClick="//div[div='Requisitions']/descendant::div[text()='Reports']";
	   public static String UploadReport="//*[text()='Upload Report']";
	   public static String CreatedBy="/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/mat-form-field[2]/div/div[1]/div/input";
	   public static String DocumentOn="/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/mat-form-field[3]/div/div[1]/div[1]/input";
	   public static String BrownFile1="/html/body/div[2]/div[2]/div/mat-dialog-container/div[4]/div[1]/div/div/div[1]/input";
	   public static String UploadReportDoc="//*[text()='Upload']";
	   public static String UploadDocMsge="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/p-toast/div/p-toastitem/div/div/div/div[2]/div[2]";
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
			
			/*
			 * DesiredCapabilities cap = DesiredCapabilities.chrome();
			 * cap.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, false);
			 * ChromeOptions opt = new ChromeOptions(); opt.merge(cap); WebDriver driver =
			 * new ChromeDriver(opt);
			 */
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//driver.get("http://stage.copious.care:4200/");
			//driver.get("https://stage.copious.care/");
			driver.get("https://app.copious.care/");
			driver.manage().window().fullscreen();
			 //driver.get("https://opd.copious.care/");
		}

		/*
		 * @Test(priority = 0) public void clickDoctorLoginLink() {
		 * 
		 * waitForVisibilityOf(By.xpath(doctorLoginLink)); WebElement textbox =
		 * driver.findElement(By.xpath(doctorLoginLink)); //
		 * textbox.sendKeys(Keys.ENTER); highlightElement(By.xpath(doctorLoginLink));
		 * clickUsingJavaScript(By.xpath(doctorLoginLink));
		 * 
		 * }
		 */
		@Test(priority = 1)
		public void numberField() {
			waitForVisibilityOf(By.xpath(mobileNumber));
			driver.findElement(By.xpath(mobileNumber)).sendKeys("2424242424");
			highlightElement(By.xpath(mobileNumber));
			clickUsingJavaScript(By.xpath(mobileNumber));
		}

		@Test(priority = 2)
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
			driver.findElement(By.xpath(searchBar)).sendKeys("Test");
			
			//driver.findElement(By.xpath(searchBar)).sendKeys("pres");
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
		  clickUsingJavaScript(By.cssSelector(clickPatient)); }
		  
 @Test(priority = 7) public void Investigation() throws InterruptedException {
			  
			  
			  waitForVisibilityOf(By.xpath(InvestigationClick));
			  driver.findElement(By.xpath(InvestigationClick));
			  highlightElement(By.xpath(InvestigationClick));
			  clickUsingJavaScript(By.xpath(InvestigationClick));
			  
			  waitForVisibilityOf(By.xpath(ReportsClick));
			  driver.findElement(By.xpath(ReportsClick));
			  highlightElement(By.xpath(ReportsClick));
			  clickUsingJavaScript(By.xpath(ReportsClick));
			  
			  waitForVisibilityOf(By.xpath(UploadReport));
			  driver.findElement(By.xpath(UploadReport));
			  highlightElement(By.xpath(UploadReport));
			  clickUsingJavaScript(By.xpath(UploadReport));
			  
			  Thread.sleep(5000);
			  
			  waitForVisibilityOf(By.xpath(CreatedBy));
			  driver.findElement(By.xpath(CreatedBy)).sendKeys("Abc");
			  highlightElement(By.xpath(CreatedBy));
			  
			  waitForVisibilityOf(By.xpath(DocumentOn));
			  driver.findElement(By.xpath(DocumentOn)).sendKeys("01/01/2023");
			  highlightElement(By.xpath(DocumentOn));
			  
			  waitForVisibilityOf(By.xpath(BrownFile1));
				driver.findElement(By.xpath(BrownFile1)).sendKeys("C:\\\\Users\\\\Lenovo\\\\Desktop\\\\nature.jpg");
				highlightElement(By.xpath(BrownFile1));
			  
				Thread.sleep(15000);
				 waitForVisibilityOf(By.xpath(UploadReportDoc));
				  driver.findElement(By.xpath(UploadReportDoc));
				  highlightElement(By.xpath(UploadReportDoc));
				  clickUsingJavaScript(By.xpath(UploadReportDoc));
			  
				  waitForVisibilityOf(By.xpath(UploadDocMsge));
		        	highlightElement(By.xpath(UploadDocMsge));
		        	 String Actualmsge=driver.findElement(By.xpath(UploadDocMsge)).getText();
		        	 System.out.println("msge:"+Actualmsge);
		        	 String ErrorMsge="Your document has been uploaded successfully";
		            Assert.assertEquals(Actualmsge,ErrorMsge);
		  
		  
		  
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
