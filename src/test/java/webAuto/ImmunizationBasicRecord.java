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

public class ImmunizationBasicRecord {
	public static WebDriver driver;

	public static String doctorLoginLink = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
	public static String mobileNumber = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String createPatient = "createPatient";
	public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
	public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
	public static String clickPatient = "li.clearfix";
	public static String BulkUpdate = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[2]/button[2]/span";
	public static String BulkVaccineDTWP = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[3]/div[2]/div[2]/div/span[1]";
	public static String BulkVaccineHepB = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[3]/div[2]/div[1]/div/span[1]";
	public static String AddToSchedule = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[4]/button[2]";
	public static String VCCTaken = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[2]/patient-immunization/div/div[3]/div/table/tbody/tr[4]/td[5]/div";

	public static String OTP1 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]";
	public static String OTP2 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]";
	public static String OTP3 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]";
	public static String OTP4 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	public static String OTP5 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	public static String OTP6 = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]";
	public static String HealthProfile = "//*[text()='Health Profile']";
	public static String ImmunizationOption = "//*[text()='Immunization']";
	public static String ConfirmVaccinationDate = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[5]/button";
	public static String VaccineRecord = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-new-profile/div[2]/patient-immunization/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/table/tbody/tr[2]/td[8]/div";
	public static String RecievedDate = "/html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[5]/div/img";
	public static String ClickDate = "//*[text()='1']";
	public static String SaveVaccine = "//*[text()='Save Vaccine']";
	public static String SpecialVaccineClick = "//*[text()='Special Vaccines']";
	public static String CholeraVacccine = "//*[text()='Meningococcal Vaccine']";
	public static String SelectDate = "//*[text()='1']";
	public static String ClickCalender = "html/body/div[2]/div[2]/div/mat-dialog-container/div[2]/div[4]/div/img";
	public static String SaveSpecialVaccine = "//*[text()='Save Vaccine']";
	public static String BrandName="//*[text()='Tubaervac BCG']";
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

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// driver.get("http://stage.copious.care:4200/");
		// driver.get("https://stage.copious.care/");
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
		driver.findElement(By.xpath(searchBar)).sendKeys("BBBB");

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

		waitForVisibilityOf(By.cssSelector(clickPatient));
		driver.findElement(By.cssSelector(clickPatient));
		highlightElement(By.cssSelector(clickPatient));
		clickUsingJavaScript(By.cssSelector(clickPatient));
	}

	@Test(priority = 7)
	public void HealthProfile() throws InterruptedException {
		Thread.sleep(10000);

		waitForVisibilityOf(By.xpath(HealthProfile));
		driver.findElement(By.xpath(HealthProfile));
		highlightElement(By.xpath(HealthProfile));
		clickUsingJavaScript(By.xpath(HealthProfile));

		waitForVisibilityOf(By.xpath(ImmunizationOption));
		driver.findElement(By.xpath(ImmunizationOption));
		highlightElement(By.xpath(ImmunizationOption));
		clickUsingJavaScript(By.xpath(ImmunizationOption));

		/*
		 * waitForVisibilityOf(By.xpath(ConfirmVaccinationDate));
		 * driver.findElement(By.xpath(ConfirmVaccinationDate));
		 * highlightElement(By.xpath(ConfirmVaccinationDate));
		 * clickUsingJavaScript(By.xpath(ConfirmVaccinationDate));
		 */

		Thread.sleep(3000);
		waitForVisibilityOf(By.xpath(SpecialVaccineClick));
		driver.findElement(By.xpath(SpecialVaccineClick));
		highlightElement(By.xpath(SpecialVaccineClick));
		clickUsingJavaScript(By.xpath(SpecialVaccineClick));

		waitForVisibilityOf(By.xpath(CholeraVacccine));
		driver.findElement(By.xpath(CholeraVacccine));
		highlightElement(By.xpath(CholeraVacccine));
		clickUsingJavaScript(By.xpath(CholeraVacccine));

		waitForVisibilityOf(By.xpath(ClickCalender));
		driver.findElement(By.xpath(ClickCalender));
		highlightElement(By.xpath(ClickCalender));
		clickUsingJavaScript(By.xpath(ClickCalender));

		waitForVisibilityOf(By.xpath(SelectDate));
		driver.findElement(By.xpath(SelectDate));
		highlightElement(By.xpath(SelectDate));
		clickUsingJavaScript(By.xpath(SelectDate));

		waitForVisibilityOf(By.xpath(SaveSpecialVaccine));
		driver.findElement(By.xpath(SaveSpecialVaccine));
		highlightElement(By.xpath(SaveSpecialVaccine));
		clickUsingJavaScript(By.xpath(SaveSpecialVaccine));
Thread.sleep(5000);
		waitForVisibilityOf(By.xpath(VaccineRecord));
		  driver.findElement(By.xpath(VaccineRecord));
		  highlightElement(By.xpath(VaccineRecord));
		  clickUsingJavaScript(By.xpath(VaccineRecord));
		  
		  waitForVisibilityOf(By.xpath(BrandName));
		  driver.findElement(By.xpath(BrandName));
		  highlightElement(By.xpath(BrandName));
		  clickUsingJavaScript(By.xpath(BrandName));
		  
		  waitForVisibilityOf(By.xpath(RecievedDate));
		  driver.findElement(By.xpath(RecievedDate));
		  highlightElement(By.xpath(RecievedDate));
		  clickUsingJavaScript(By.xpath(RecievedDate));
		  
		  waitForVisibilityOf(By.xpath(ClickDate));
		  driver.findElement(By.xpath(ClickDate));
		  highlightElement(By.xpath(ClickDate));
		  clickUsingJavaScript(By.xpath(ClickDate));
		  
		  waitForVisibilityOf(By.xpath(SaveVaccine));
		  driver.findElement(By.xpath(SaveVaccine));
		  highlightElement(By.xpath(SaveVaccine));
		  clickUsingJavaScript(By.xpath(SaveVaccine));

		/*
		 * waitForVisibilityOf(By.xpath(BulkUpdate));
		 * driver.findElement(By.xpath(BulkUpdate));
		 * highlightElement(By.xpath(BulkUpdate));
		 * clickUsingJavaScript(By.xpath(BulkUpdate));
		 * 
		 * 
		 * waitForVisibilityOf(By.xpath(BulkVaccineOPV));
		 * driver.findElement(By.xpath(BulkVaccineOPV));
		 * highlightElement(By.xpath(BulkVaccineOPV));
		 * clickUsingJavaScript(By.xpath(BulkVaccineOPV));
		 * 
		 * 
		 * waitForVisibilityOf(By.xpath(BulkVaccineHepB));
		 * driver.findElement(By.xpath(BulkVaccineHepB));
		 * highlightElement(By.xpath(BulkVaccineHepB));
		 * clickUsingJavaScript(By.xpath(BulkVaccineHepB));
		 * 
		 * 
		 * waitForVisibilityOf(By.xpath(BulkVaccineDTWP));
		 * driver.findElement(By.xpath(BulkVaccineDTWP));
		 * highlightElement(By.xpath(BulkVaccineDTWP));
		 * clickUsingJavaScript(By.xpath(BulkVaccineDTWP));
		 * 
		 * 
		 * waitForVisibilityOf(By.xpath(AddToSchedule));
		 * driver.findElement(By.xpath(AddToSchedule));
		 * highlightElement(By.xpath(AddToSchedule));
		 * clickUsingJavaScript(By.xpath(AddToSchedule));
		 * 
		 * waitForVisibilityOf(By.xpath(VCCTaken)); String A=
		 * driver.findElement(By.xpath(VCCTaken)).getText(); System.out.println(A);
		 * highlightElement(By.xpath(VCCTaken));
		 * 
		 * 
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
