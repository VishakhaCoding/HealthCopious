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
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MoreInfoQ {
	public static WebDriver driver;

	public static String doctorLoginLink = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
	public static String mobileNumber = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String createPatient = "createPatient";
	public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
	public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
	public static String clickPatient = "li.clearfix";
	public static String OTP1 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]";
	public static String OTP2 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]";
	public static String OTP3 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]";
	public static String OTP4 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	public static String OTP5 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	public static String OTP6 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]";
	public static String HealthProfile = "//*[text()='Health Profile']";
	public static String ImmunizationOption = "//*[text()='Immunization']";
	public static String CertificateOption="//*[text()='Certificate']";
	public static String CreateCertificate="//*[text()='Create Certificate']";
	public static String CertificateTypedrpdwn="//*[text()='Select Certificate ']/following::button[1]";
	public static String  SelectVaccines="//*[text()=' Select vaccinations ']"; 
	public static String SelectAllVaccines="//*[text()='Select Vaccines']/following::div[4]";
	public static String proceed="//*[text()='Select Vaccines']/following::div[11]";
	public static String preview="//*[text()='Preview']";
	public static String SaveAndShare="//*[text()='Save & share ']";
	public static String CertificateSharedMsge="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/app-patient-certificate/p-toast/div/p-toastitem/div/div/div/div[2]/div[2]";
	public static String AddNewPrescription = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[1]/img";
	public static String MoreInfo="//*[text()='More Information']";
	public static String MoreInfoEdit="/html/body/div[4]/div[2]/div/div/div/div[1]/div[2]/div[1]/button/span";
	public static String MedicalCondition="/html/body/div[4]/div[2]/div/mat-dialog-container/div[2]/div[1]/mat-form-field[1]/div/div[1]/div[3]/input";
	public static String Allergies="/html/body/div[4]/div[2]/div/mat-dialog-container/div[2]/div[1]/mat-form-field[2]/div/div[1]/div[3]/input";
	public static String RecurringComplaints="/html/body/div[4]/div[2]/div/mat-dialog-container/div[2]/div[1]/mat-form-field[3]/div/div[1]/div[3]/input";
	public static String AccidentalHistory="/html/body/div[4]/div[2]/div/mat-dialog-container/div[2]/div[1]/mat-form-field[4]/div/div[1]/div[3]/input";
	public static String Save="/html/body/div[4]/div[2]/div/mat-dialog-container/div[2]/div[2]/button";
	
	
	
	
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

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// driver.get("http://stage.copious.care:4200/");
		// driver.get("https://stage.copious.care/");
		driver.get("https://opd.copious.care/");
		//driver.get("https://opd.copious.care/");
		driver.manage().window().fullscreen();
	}

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
Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP1));
		driver.findElement(By.xpath(OTP1)).sendKeys("1");
		;
		highlightElement(By.xpath(OTP1));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP2));
		driver.findElement(By.xpath(OTP2)).sendKeys("4");
		highlightElement(By.xpath(OTP2));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP3));
		driver.findElement(By.xpath(OTP3)).sendKeys("0");
		;
		highlightElement(By.xpath(OTP3));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP4));
		driver.findElement(By.xpath(OTP4)).sendKeys("5");
		;
		highlightElement(By.xpath(OTP4));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP5));
		driver.findElement(By.xpath(OTP5)).sendKeys("2");
		;
		highlightElement(By.xpath(OTP5));
		Thread.sleep(1000);
		waitForVisibilityOf(By.xpath(OTP6));
		driver.findElement(By.xpath(OTP6)).sendKeys("0");
		;
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
		driver.findElement(By.xpath(searchBar)).sendKeys("test");

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
		clickUsingJavaScript(By.xpath(AddNewPrescription));
		
		
		//driver.manage().window().fullscreen();
		waitForVisibilityOf(By.xpath(MoreInfo));
		driver.findElement(By.xpath(MoreInfo));
		highlightElement(By.xpath(MoreInfo));
		clickUsingJavaScript(By.xpath(MoreInfo));
		
		waitForVisibilityOf(By.xpath(MoreInfo));
		driver.findElement(By.xpath(MoreInfo));
		highlightElement(By.xpath(MoreInfo));
		clickUsingJavaScript(By.xpath(MoreInfo));
		
		waitForVisibilityOf(By.xpath(MoreInfoEdit));
		driver.findElement(By.xpath(MoreInfoEdit));
		highlightElement(By.xpath(MoreInfoEdit));
		clickUsingJavaScript(By.xpath(MoreInfoEdit));
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		waitForVisibilityOf(By.xpath(MedicalCondition));
		driver.findElement(By.xpath(MedicalCondition)).sendKeys("Paralysis,Thyroid");
		highlightElement(By.xpath(MedicalCondition));
		
		
		waitForVisibilityOf(By.xpath(Allergies));
		driver.findElement(By.xpath(Allergies)).sendKeys("Dust");
		highlightElement(By.xpath(Allergies));
		
		
		waitForVisibilityOf(By.xpath(RecurringComplaints));
		driver.findElement(By.xpath(RecurringComplaints)).sendKeys("yes");
		highlightElement(By.xpath(RecurringComplaints));
		
		
		waitForVisibilityOf(By.xpath(AccidentalHistory));
		driver.findElement(By.xpath(AccidentalHistory)).sendKeys("yes");
		highlightElement(By.xpath(AccidentalHistory));
	
		
		waitForVisibilityOf(By.xpath(Save));
		driver.findElement(By.xpath(Save));
		highlightElement(By.xpath(Save));
		clickUsingJavaScript(By.xpath(Save));
		
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
