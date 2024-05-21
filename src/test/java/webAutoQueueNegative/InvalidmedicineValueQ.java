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
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvalidmedicineValueQ {
public static WebDriver driver;
	
	public static String mobileNumber = "input#phoneNumberId";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String QuickRx = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[1]";
	public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
	public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
	public static String clickPatient = "li.clearfix";
	public static String AddNewPrescription = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[1]/img";
	public static String Medicine = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[5]";
	public static String medicineSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/input";
	public static String Dolocare = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/ngb-typeahead-window/button[1]/ngb-highlight[1]";
	public static String MedAddtoList = "//div[text()='Add to List']";
	public static String Medpageinstruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[4]/div/app-language-select-textbox/div/input";
	public static String Instruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[4]/div/app-language-select-textbox/div/input";
	public static String Dose1="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[3]/div[1]/div[1]/div[1]/input";
	public static String Dose2="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[3]/div[1]/div[2]/div[1]/input";
	public static String Dose3="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[3]/div[1]/div[3]/div[1]/input";
	public static String Dose4="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[3]/div[1]/div[4]/div[1]/input";
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
		driver.get("https://app.copious.care/");
		// driver.get("https://stage.copious.care/");
		driver.manage().window().fullscreen();
	}

	@Test(priority = 1, groups = "Regression")
	public void numberField() {
		waitForVisibilityOf(By.cssSelector(mobileNumber));
		driver.findElement(By.cssSelector(mobileNumber)).sendKeys("2424242424");
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
	public void AddPrescription() throws InterruptedException {
		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(AddNewPrescription));
		driver.findElement(By.xpath(AddNewPrescription));
		highlightElement(By.xpath(AddNewPrescription));
		clickUsingJavaScript(By.xpath(AddNewPrescription));}
	@Test(priority = 7)
	public void Medicine1() throws InterruptedException {

		Thread.sleep(15000);
		waitForVisibilityOf(By.xpath(Medicine));
		driver.findElement(By.xpath(Medicine));
		highlightElement(By.xpath(Medicine));
		clickUsingJavaScript(By.xpath(Medicine));
		
		waitForVisibilityOf(By.xpath(medicineSearch));
		highlightElement(By.xpath(medicineSearch));
		driver.findElement(By.xpath(medicineSearch)).sendKeys("dolo");
		waitForVisibilityOf(By.xpath(Dolocare));
		highlightElement(By.xpath(Dolocare));
		clickUsingJavaScript(By.xpath(Dolocare));
		
		waitForVisibilityOf(By.xpath(Medicine));
		driver.findElement(By.xpath(Medicine));
		highlightElement(By.xpath(Medicine));
		
		
		
		driver.findElement(By.xpath(Dose1)).clear();
		driver.findElement(By.xpath(Dose2)).clear();
		driver.findElement(By.xpath(Dose3)).clear();
		driver.findElement(By.xpath(Dose4)).clear();
		driver.findElement(By.xpath(Dose1)).sendKeys("-1");
		driver.findElement(By.xpath(Dose2)).sendKeys("-1");
		driver.findElement(By.xpath(Dose3)).sendKeys("-1");
		driver.findElement(By.xpath(Dose4)).sendKeys("-1");
		//driver.findElement(By.xpath(MedAddtoList));
		clickUsingJavaScript(By.xpath(MedAddtoList));
		
		/*
		 * //waitForVisibilityOf(By.xpath(Dose1));
		 * driver.findElement(By.xpath(Dose1)).clear();
		 * highlightElement(By.xpath(Dose1));
		 * 
		 * //waitForVisibilityOf(By.xpath(Dose2));
		 * driver.findElement(By.xpath(Dose2)).clear();
		 * highlightElement(By.xpath(Dose2));
		 * 
		 * //waitForVisibilityOf(By.xpath(Dose3));
		 * driver.findElement(By.xpath(Dose3)).clear();
		 * highlightElement(By.xpath(Dose3));
		 * 
		 * //waitForVisibilityOf(By.xpath(Dose4));
		 * driver.findElement(By.xpath(Dose4)).clear();
		 * highlightElement(By.xpath(Dose4));
		 */
		
		
		
		/*
		 * highlightElement(By.xpath(Medpageinstruction));
		 * driver.findElement(By.xpath(Medpageinstruction));
		 * clickUsingJavaScript(By.xpath(Medpageinstruction));
		 * 
		 * waitForVisibilityOf(By.xpath(Instruction));
		 * highlightElement(By.xpath(Instruction));
		 * driver.findElement(By.xpath(Instruction)).sendKeys("Drink water");
		 * clickUsingJavaScript(By.xpath(Instruction));
		 */

		/*
		 * waitForVisibilityOf(By.xpath(MedAddtoList));
		 * highlightElement(By.xpath(MedAddtoList));
		 * driver.findElement(By.xpath(MedAddtoList));
		 * clickUsingJavaScript(By.xpath(MedAddtoList));
		 */
		
		waitForVisibilityOf(By.xpath(medicineSearch));
		highlightElement(By.xpath(medicineSearch));
		driver.findElement(By.xpath(medicineSearch)).sendKeys("para");
		waitForVisibilityOf(By.xpath(Dolocare));
		highlightElement(By.xpath(Dolocare));
		clickUsingJavaScript(By.xpath(Dolocare));
		
		waitForVisibilityOf(By.xpath(Medicine));
		driver.findElement(By.xpath(Medicine));
		highlightElement(By.xpath(Medicine));
		
		
		
		driver.findElement(By.xpath(Dose1)).clear();
		driver.findElement(By.xpath(Dose2)).clear();
		driver.findElement(By.xpath(Dose3)).clear();
		driver.findElement(By.xpath(Dose4)).clear();
		driver.findElement(By.xpath(Dose1)).sendKeys("A");
		driver.findElement(By.xpath(Dose2)).sendKeys("B");
		driver.findElement(By.xpath(Dose3)).sendKeys("C");
		driver.findElement(By.xpath(Dose4)).sendKeys("D");
		//driver.findElement(By.xpath(MedAddtoList));
		clickUsingJavaScript(By.xpath(MedAddtoList));
		
		
		
		waitForVisibilityOf(By.xpath(medicineSearch));
		highlightElement(By.xpath(medicineSearch));
		driver.findElement(By.xpath(medicineSearch)).sendKeys("para");
		waitForVisibilityOf(By.xpath(Dolocare));
		highlightElement(By.xpath(Dolocare));
		clickUsingJavaScript(By.xpath(Dolocare));
		
		waitForVisibilityOf(By.xpath(Medicine));
		driver.findElement(By.xpath(Medicine));
		highlightElement(By.xpath(Medicine));
		
		driver.findElement(By.xpath(Dose1)).clear();
		driver.findElement(By.xpath(Dose2)).clear();
		driver.findElement(By.xpath(Dose3)).clear();
		driver.findElement(By.xpath(Dose4)).clear();
		driver.findElement(By.xpath(Dose1)).sendKeys("@");
		driver.findElement(By.xpath(Dose2)).sendKeys("#");
		driver.findElement(By.xpath(Dose3)).sendKeys("$");
		driver.findElement(By.xpath(Dose4)).sendKeys("*");
		//driver.findElement(By.xpath(MedAddtoList));
		clickUsingJavaScript(By.xpath(MedAddtoList));
	
		
	
	
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
