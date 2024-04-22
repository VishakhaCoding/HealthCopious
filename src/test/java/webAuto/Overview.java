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
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Overview {
	public static WebDriver driver;
	public static String mobileNumber = "input#phoneNumberId";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String QuickRx = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[1]";
	public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
	public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
	public static String AddNewPrescription = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[1]/img";
	public static String DischargeSummary = "//*[text()=' Discharge Summary'] ";
	public static String UploadReport="//*[text()=' Upload Documents'] ";
	
	public static String MoreInfoEdit="//*[text()='Edit'] ";
	public static String MedicalCondition="//*[text()='More Information']/following::input[1]";
	public static String Allergies="//*[text()='More Information']/following::input[2]";
	public static String RecurringComplaints="//*[text()='More Information']/following::input[3]";
	public static String AccidentalHistory="//*[text()='More Information']/following::input[4]";
	public static String Save="//*[text()='Save']";
	public static String HeightGraph="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/img";
	public static String HeightGraphClose="//*[text()='�']";
	
	public static String CreatedBy = "//*[text()='Upload health reports and related documents as photos,images and PDFs.']/following::input[1]";
	public static String DocumentOn = "//*[text()='Upload health reports and related documents as photos,images and PDFs.']/following::input[2]";
	public static String BrownFile1 = "//*[text()='Upload health reports and related documents as photos,images and PDFs.']/following::input[3]";
	public static String UploadReportDoc = "//*[text()='Upload health reports and related documents as photos,images and PDFs.']/following::button[2]";
	public static String UploadDocMsge = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/p-toast/div/p-toastitem/div/div/div/div[2]/div[2]";
	public static String OverViewOption ="//*[text()='Overview '] ";
	public static String OTP1 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]";
	public static String OTP2 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]";
	public static String OTP3 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]";
	public static String OTP4 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	public static String OTP5 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	public static String OTP6 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]";
	
	public static void waitForVisibilityOf(By by) {
		try {

			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
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

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 //driver.get("http://stage.copious.care:4200/");
		// driver.manage().window().fullscreen();
		driver.get("https://opd.copious.care/");
		// driver.get("https://stage.copious.care/");
		driver.manage().window().fullscreen();
	}

	@Test(priority = 1, groups = "Regression")
	public void numberField() {
		waitForVisibilityOf(By.cssSelector(mobileNumber));
		driver.findElement(By.cssSelector(mobileNumber)).sendKeys("9665002440");
		highlightElement(By.cssSelector(mobileNumber));
		clickUsingJavaScript(By.cssSelector(mobileNumber));
	}

	@Test(priority = 2, groups = "Regression")
	public void sendOTP() throws InterruptedException {
		Thread.sleep(5000);
		waitForVisibilityOf(By.xpath(sendOTP));
		highlightElement(By.xpath(sendOTP));
		clickUsingJavaScript(By.xpath(sendOTP));
		
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP1));
		driver.findElement(By.xpath(OTP1)).sendKeys("1");
		highlightElement(By.xpath(OTP1));
		
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP2));
		driver.findElement(By.xpath(OTP2)).sendKeys("4");
		highlightElement(By.xpath(OTP2));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP3));
		driver.findElement(By.xpath(OTP3)).sendKeys("0");
		highlightElement(By.xpath(OTP3));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP4));
		driver.findElement(By.xpath(OTP4)).sendKeys("5");
		highlightElement(By.xpath(OTP4));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP5));
		driver.findElement(By.xpath(OTP5)).sendKeys("2");
		highlightElement(By.xpath(OTP5));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP6));
		driver.findElement(By.xpath(OTP6)).sendKeys("0");
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
	public void searchBar1() {
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
	@Test(priority = 6)
	public void clickPatient() throws InterruptedException {
		Thread.sleep(10000);
		driver.manage().window().fullscreen();
		waitForVisibilityOf(By.xpath(AddNewPrescription));
		driver.findElement(By.xpath(AddNewPrescription));
		highlightElement(By.xpath(AddNewPrescription));
		clickUsingJavaScript(By.xpath(AddNewPrescription));}
	
	
	  @Test(priority = 7, groups = "Regression") public void DischargeSummary()
	  throws InterruptedException { Thread.sleep(5000);
	  driver.manage().window().fullscreen();
	  waitForVisibilityOf(By.xpath(OverViewOption));
	  driver.findElement(By.xpath(OverViewOption));
	  highlightElement(By.xpath(OverViewOption));
	  clickUsingJavaScript(By.xpath(OverViewOption));
	  
		
		  waitForVisibilityOf(By.xpath(DischargeSummary));
		  driver.findElement(By.xpath(DischargeSummary));
		  highlightElement(By.xpath(DischargeSummary));
		  clickUsingJavaScript(By.xpath(DischargeSummary));
		  
		  
		  
		  Thread.sleep(5000); waitForVisibilityOf(By.xpath(CreatedBy));
		  driver.findElement(By.xpath(CreatedBy)).sendKeys("Abc");
		  highlightElement(By.xpath(CreatedBy));
		  
		  waitForVisibilityOf(By.xpath(DocumentOn));
		  driver.findElement(By.xpath(DocumentOn)).sendKeys("01/01/2023");
		  highlightElement(By.xpath(DocumentOn));
		  
		  waitForVisibilityOf(By.xpath(BrownFile1));
		  driver.findElement(By.xpath(BrownFile1)).sendKeys(
		  "C:\\Users\\Lenovo\\Desktop\\nature.jpg");
		  highlightElement(By.xpath(BrownFile1));
		  
		  Thread.sleep(15000); waitForVisibilityOf(By.xpath(UploadReportDoc));
		  driver.findElement(By.xpath(UploadReportDoc));
		  highlightElement(By.xpath(UploadReportDoc));
		  clickUsingJavaScript(By.xpath(UploadReportDoc));
		  
		  waitForVisibilityOf(By.xpath(UploadDocMsge));
		  highlightElement(By.xpath(UploadDocMsge)); String Actualmsge =
		  driver.findElement(By.xpath(UploadDocMsge)).getText();
		  System.out.println("msge:" + Actualmsge); String ErrorMsge =
		  "Your document has been uploaded successfully";
		  Assert.assertEquals(Actualmsge, ErrorMsge);
		 
	  
	  }
	 
	@Test(priority = 8, groups = "Regression")
	public void UploadDoc() throws InterruptedException {
		Thread.sleep(5000);
		waitForVisibilityOf(By.xpath(OverViewOption));
		  driver.findElement(By.xpath(OverViewOption));
		  highlightElement(By.xpath(OverViewOption));
		  clickUsingJavaScript(By.xpath(OverViewOption));
		
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
		driver.findElement(By.xpath(BrownFile1)).sendKeys("C:\\Users\\Lenovo\\Desktop\\nature.jpg");
		highlightElement(By.xpath(BrownFile1));

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(UploadReportDoc));
		driver.findElement(By.xpath(UploadReportDoc));
		highlightElement(By.xpath(UploadReportDoc));
		clickUsingJavaScript(By.xpath(UploadReportDoc));

		waitForVisibilityOf(By.xpath(UploadDocMsge));
		highlightElement(By.xpath(UploadDocMsge));
		String Actualmsge = driver.findElement(By.xpath(UploadDocMsge)).getText();
		System.out.println("msge:" + Actualmsge);
		String ErrorMsge = "Your document has been uploaded successfully";
		Assert.assertEquals(Actualmsge, ErrorMsge);

	}
	@Test(priority = 9)
	public void MoreInfoEdit() throws InterruptedException {
		Thread.sleep(10000);
		 waitForVisibilityOf(By.xpath(OverViewOption));
		  driver.findElement(By.xpath(OverViewOption));
		  highlightElement(By.xpath(OverViewOption));
		  clickUsingJavaScript(By.xpath(OverViewOption));
		
		
		//driver.manage().window().fullscreen();
		
		
		waitForVisibilityOf(By.xpath(MoreInfoEdit));
		driver.findElement(By.xpath(MoreInfoEdit));
		highlightElement(By.xpath(MoreInfoEdit));
		clickUsingJavaScript(By.xpath(MoreInfoEdit));
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		waitForVisibilityOf(By.xpath(MedicalCondition));
		driver.findElement(By.xpath(MedicalCondition)).clear();
		driver.findElement(By.xpath(MedicalCondition)).sendKeys("Paralysis,Thyroid");
		highlightElement(By.xpath(MedicalCondition));
		
		
		waitForVisibilityOf(By.xpath(Allergies));
		driver.findElement(By.xpath(Allergies)).clear();
		driver.findElement(By.xpath(Allergies)).sendKeys("Dust");
		highlightElement(By.xpath(Allergies));
		
		
		waitForVisibilityOf(By.xpath(RecurringComplaints));
		driver.findElement(By.xpath(RecurringComplaints)).clear();
		driver.findElement(By.xpath(RecurringComplaints)).sendKeys("yes");
		highlightElement(By.xpath(RecurringComplaints));
		
		
		waitForVisibilityOf(By.xpath(AccidentalHistory));
		driver.findElement(By.xpath(AccidentalHistory)).clear();
		driver.findElement(By.xpath(AccidentalHistory)).sendKeys("yes");
		highlightElement(By.xpath(AccidentalHistory));
	
		
		waitForVisibilityOf(By.xpath(Save));
		driver.findElement(By.xpath(Save));
		highlightElement(By.xpath(Save));
		clickUsingJavaScript(By.xpath(Save));
		
	}
	@Test(priority = 10)
	public void VitaGraph() throws InterruptedException {
		Thread.sleep(10000);
		 waitForVisibilityOf(By.xpath(OverViewOption));
		  driver.findElement(By.xpath(OverViewOption));
		  highlightElement(By.xpath(OverViewOption));
		  clickUsingJavaScript(By.xpath(OverViewOption));
		  
		waitForVisibilityOf(By.xpath(HeightGraph));
		driver.findElement(By.xpath(HeightGraph));
		highlightElement(By.xpath(HeightGraph));
		clickUsingJavaScript(By.xpath(HeightGraph));
		
		Thread.sleep(5000);
		waitForVisibilityOf(By.xpath(HeightGraphClose));
		driver.findElement(By.xpath(HeightGraphClose));
		highlightElement(By.xpath(HeightGraphClose));
		clickUsingJavaScript(By.xpath(HeightGraphClose));
		
		
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
