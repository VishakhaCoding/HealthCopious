package webAuto;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Add_favouriteMedicine {
	public static WebDriver driver;
	public static String doctorLoginLink = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button";
	public static String mobileNumber = "//*[text()='Login ']//following::input";
	public static String sendOTP = "//*[text()='Send OTP']";
	public static String verifyOTP = "//*[text()='Verify']";
	
	 public static String OTP1="//*[text()='Verify OTP ']//following::input[1]"; 
	   public static String OTP2="//*[text()='Verify OTP ']//following::input[2]"; 
	   public static String OTP3="//*[text()='Verify OTP ']//following::input[3]"; 
	   public static String OTP4="//*[text()='Verify OTP ']//following::input[4]";
	   public static String OTP5="//*[text()='Verify OTP ']//following::input[5]";
	   public static String OTP6="//*[text()='Verify OTP ']//following::input[6]"; 
	  
	public static String Favourite="// *[text()=' Favourite']";
	public static String favouriteSearch="/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-favourite-management/div/div[1]/div[2]/div[1]/input";
	public static String AddNewFavourite="//*[text()='+Add New Favourite']"; 
	public static String FavouriteName="//*[text()='Favourite Name']//following::input";
	public static String AddMedicine="//*[text()='Add Medicine']";
	public static String MedicineSearch="//*[text()='Add New Medicine']//following::input";
	public static String MedicineClick="//*[text()='Add New Medicine']//following::button";
	public static String AddToList="//*[text()='Add to List']";
	public static String Save="//*[text()='Save']";
	
	
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
			//driver.get("https://stage.copious.care/");
			driver.manage().window().fullscreen();
		}

		

		@Test(priority = 1,groups="Regression")
		public void numberField() {
			waitForVisibilityOf(By.xpath(mobileNumber));
			driver.findElement(By.xpath(mobileNumber)).sendKeys("9665002440");
			highlightElement(By.xpath(mobileNumber));
			clickUsingJavaScript(By.xpath(mobileNumber));
		}

		@Test(priority = 2,groups="Regression")
		public void sendOTP() throws InterruptedException {
			Thread.sleep(5000);
			waitForVisibilityOf(By.xpath(sendOTP));
			highlightElement(By.xpath(sendOTP));
			clickUsingJavaScript(By.xpath(sendOTP));

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

		@Test(priority = 3,groups="Regression")
		public void verifyButton() throws InterruptedException {
			Thread.sleep(10000);
			waitForVisibilityOf(By.xpath(verifyOTP));
			driver.findElement(By.xpath(verifyOTP));
			highlightElement(By.xpath(verifyOTP));
			clickUsingJavaScript(By.xpath(verifyOTP));
			
			waitForVisibilityOf(By.xpath(Favourite));
			driver.findElement(By.xpath(Favourite));
			highlightElement(By.xpath(Favourite));
			clickUsingJavaScript(By.xpath(Favourite));
			
			waitForVisibilityOf(By.xpath(AddNewFavourite));
			driver.findElement(By.xpath(AddNewFavourite));
			highlightElement(By.xpath(AddNewFavourite));
			clickUsingJavaScript(By.xpath(AddNewFavourite));
			
			waitForVisibilityOf(By.xpath(FavouriteName));
			driver.findElement(By.xpath(FavouriteName)).sendKeys("April14");
			highlightElement(By.xpath(FavouriteName));
			
			
			waitForVisibilityOf(By.xpath(AddMedicine));
			driver.findElement(By.xpath(AddMedicine));
			highlightElement(By.xpath(AddMedicine));
			clickUsingJavaScript(By.xpath(AddMedicine));
			
			waitForVisibilityOf(By.xpath(MedicineSearch));
			driver.findElement(By.xpath(MedicineSearch)).sendKeys("Dol");
			highlightElement(By.xpath(MedicineSearch));
			
			waitForVisibilityOf(By.xpath(MedicineClick));
			driver.findElement(By.xpath(MedicineClick));
			highlightElement(By.xpath(MedicineClick));
			clickUsingJavaScript(By.xpath(MedicineClick));
			
			waitForVisibilityOf(By.xpath(AddToList));
			driver.findElement(By.xpath(AddToList));
			highlightElement(By.xpath(AddToList));
			clickUsingJavaScript(By.xpath(AddToList));
			
			waitForVisibilityOf(By.xpath(AddMedicine));
			driver.findElement(By.xpath(AddMedicine));
			highlightElement(By.xpath(AddMedicine));
			clickUsingJavaScript(By.xpath(AddMedicine));
			
			waitForVisibilityOf(By.xpath(MedicineSearch));
			driver.findElement(By.xpath(MedicineSearch)).sendKeys("Crom");
			highlightElement(By.xpath(MedicineSearch));
			
			waitForVisibilityOf(By.xpath(MedicineClick));
			driver.findElement(By.xpath(MedicineClick));
			highlightElement(By.xpath(MedicineClick));
			clickUsingJavaScript(By.xpath(MedicineClick));
			
			waitForVisibilityOf(By.xpath(AddToList));
			driver.findElement(By.xpath(AddToList));
			highlightElement(By.xpath(AddToList));
			clickUsingJavaScript(By.xpath(AddToList));
			
			waitForVisibilityOf(By.xpath(AddMedicine));
			driver.findElement(By.xpath(AddMedicine));
			highlightElement(By.xpath(AddMedicine));
			clickUsingJavaScript(By.xpath(AddMedicine));
			
			/*
			 * waitForVisibilityOf(By.xpath(MedicineSearch));
			 * driver.findElement(By.xpath(MedicineSearch)).sendKeys("Syr");
			 * highlightElement(By.xpath(MedicineSearch));
			 * 
			 * waitForVisibilityOf(By.xpath(MedicineClick));
			 * driver.findElement(By.xpath(MedicineClick));
			 * highlightElement(By.xpath(MedicineClick));
			 * clickUsingJavaScript(By.xpath(MedicineClick));
			 */
			
			/*
			 * waitForVisibilityOf(By.xpath(AddToList));
			 * driver.findElement(By.xpath(AddToList));
			 * highlightElement(By.xpath(AddToList));
			 * clickUsingJavaScript(By.xpath(AddToList));
			 */
			
			waitForVisibilityOf(By.xpath(AddMedicine));
			driver.findElement(By.xpath(AddMedicine));
			highlightElement(By.xpath(AddMedicine));
			clickUsingJavaScript(By.xpath(AddMedicine));
			
			/*
			 * waitForVisibilityOf(By.xpath(MedicineSearch));
			 * driver.findElement(By.xpath(MedicineSearch)).sendKeys("dol");
			 * highlightElement(By.xpath(MedicineSearch));
			 * 
			 * Thread.sleep(2000);
			 * 
			 * waitForVisibilityOf(By.xpath(MedicineClick));
			 * driver.findElement(By.xpath(MedicineClick));
			 * highlightElement(By.xpath(MedicineClick));
			 * clickUsingJavaScript(By.xpath(MedicineClick));
			 * 
			 * waitForVisibilityOf(By.xpath(AddToList));
			 * driver.findElement(By.xpath(AddToList));
			 * highlightElement(By.xpath(AddToList));
			 * clickUsingJavaScript(By.xpath(AddToList));
			 */
			
			waitForVisibilityOf(By.xpath(Save));
			driver.findElement(By.xpath(Save));
			highlightElement(By.xpath(Save));
			clickUsingJavaScript(By.xpath(Save));
		}
		// @AfterClass public void close() throws IOException {
					@AfterMethod
					public void screenShot(ITestResult result) { // using ITestResult.FAILURE is equals to result.getStatus then it
						// enter into if condition
						if (ITestResult.SUCCESS== result.getStatus()) {
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
