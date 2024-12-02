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

public class Create_Receipt {
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
	   public static String Document="//*[text()='Documents']";
	   public static String ReceiptOption="//*[text()='Bill/Receipt']";
	   public static String ReceiptNo="//*[text()='Create Receipt ']//following::input";
	   public static String Consultation="//*[@class='searchBox']//child::input[1]";
	   public static String Vaccination="//div[@class='searchBox']//following::input[2]";
	   public static String VaccinationCheckboxClick="//*[text()='Create Receipt ']//following::div[36]";
	   public static String previewReceipt="//*[text()='Preview Receipt']";
	   public static String EnterPayerName="//*[text()='Payer Name']//following::input";
	   public static String PaymentMethodDropdown="//*[text()='Payment Method']//following::div[2]";
	   public static String PaymentMethod="//*[text()=' Cash ']";
	   public static String CreateReceipt="//*[text()='Create Receipt']//following::button[2]";
	   public static String CloseReceipt="//*[text()='×']";
	   public static String OtheCharges="//div[@class='searchBox']//following::input[7]";
	   public static String AddMoreButton="//*[text()='Add More']";
	   public static String ExtraOtherCharges="//div[@class='searchBox']//following::input[8]";
	   public static String ExtraCharges="//div[@class='searchBox']//following::input[9]";
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
			driver.manage().window().fullscreen();
			 driver.get("https://app.copious.care/");
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
		  
		  @Test(priority = 7)
			public void Document() throws InterruptedException {
			  Thread.sleep(5000);
				waitForVisibilityOf(By.xpath(Document));
				driver.findElement(By.xpath(Document));
				highlightElement(By.xpath(Document));
				clickUsingJavaScript(By.xpath(Document));
		  }
		  @Test(priority = 8) public void ReceiptOption() throws InterruptedException {
			  Thread.sleep(10000);
			  
			  waitForVisibilityOf(By.xpath(ReceiptOption));
			  driver.findElement(By.xpath(ReceiptOption));
			  highlightElement(By.xpath(ReceiptOption));
			  clickUsingJavaScript(By.xpath(ReceiptOption));
			  
			  
			  Thread.sleep(5000);
				/*
				 * waitForVisibilityOf(By.xpath(ReceiptNo));
				 * driver.findElement(By.xpath(ReceiptNo)).sendKeys("123456");;
				 * highlightElement(By.xpath(ReceiptNo));
				 */
			  
				
				  Thread.sleep(3000); waitForVisibilityOf(By.xpath(Consultation));
				  driver.findElement(By.xpath(Consultation)).sendKeys("100.5");
				  highlightElement(By.xpath(Consultation));
				  
					
					  Thread.sleep(3000); waitForVisibilityOf(By.xpath(Vaccination));
					  driver.findElement(By.xpath(Vaccination)).sendKeys("1000");
					  highlightElement(By.xpath(Vaccination));
					 
					
					 
				 
		  }

			
			
			  @Test(priority = 9) public void OtheCharges() throws InterruptedException {
			  
			  waitForVisibilityOf(By.xpath(OtheCharges));
			  driver.findElement(By.xpath(OtheCharges)).sendKeys("500");
			  highlightElement(By.xpath(OtheCharges));
			  
			  }
			 
					  @Test(priority = 10) public void previewReceipt() throws InterruptedException {  
						  
							
							
							  waitForVisibilityOf(By.xpath(AddMoreButton));
							  driver.findElement(By.xpath(AddMoreButton));
							  highlightElement(By.xpath(AddMoreButton));
							  clickUsingJavaScript(By.xpath(AddMoreButton));
							  
							  Thread.sleep(5000); waitForVisibilityOf(By.xpath(ExtraOtherCharges));
							  driver.findElement(By.xpath(ExtraOtherCharges)).sendKeys("Extra");;
							  highlightElement(By.xpath(ExtraOtherCharges));
							  
							  
							  waitForVisibilityOf(By.xpath(ExtraCharges));
							  driver.findElement(By.xpath(ExtraCharges)).sendKeys("100");;
							  highlightElement(By.xpath(ExtraCharges));
							 
							 
						  
						
						  
			  waitForVisibilityOf(By.xpath(previewReceipt));
			  driver.findElement(By.xpath(previewReceipt));
			  highlightElement(By.xpath(previewReceipt));
			  clickUsingJavaScript(By.xpath(previewReceipt));
			  Thread.sleep(3000);
				
				
				  waitForVisibilityOf(By.xpath(EnterPayerName));
				  driver.findElement(By.xpath(EnterPayerName)).sendKeys("payer");
				  highlightElement(By.xpath(EnterPayerName));
				 
			  
			  waitForVisibilityOf(By.xpath(PaymentMethodDropdown));
			  driver.findElement(By.xpath(PaymentMethodDropdown));
			  highlightElement(By.xpath(PaymentMethodDropdown));
			  clickUsingJavaScript(By.xpath(PaymentMethodDropdown));
			  
			  waitForVisibilityOf(By.xpath(PaymentMethod));
			  driver.findElement(By.xpath(PaymentMethod));
			  highlightElement(By.xpath(PaymentMethod));
			  clickUsingJavaScript(By.xpath(PaymentMethod));
			  
			  Thread.sleep(15000);
			  waitForVisibilityOf(By.xpath(CreateReceipt));
			  driver.findElement(By.xpath(CreateReceipt));
			  highlightElement(By.xpath(CreateReceipt));
			  clickUsingJavaScript(By.xpath(CreateReceipt));
			  
			  Thread.sleep(15000);
			  waitForVisibilityOf(By.xpath(CloseReceipt));
			  driver.findElement(By.xpath(CloseReceipt));
			  highlightElement(By.xpath(CloseReceipt));
			  clickUsingJavaScript(By.xpath(CloseReceipt));
			  
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
