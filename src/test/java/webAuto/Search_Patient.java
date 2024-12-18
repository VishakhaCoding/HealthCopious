package webAuto;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Search_Patient {
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
	   public static String searchBar = "//*[text()=' Home']//following::input";
		public static String searchOpt = "//*[text()=' Home']//following::img[7]";
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
			driver.manage().window().fullscreen();
			 driver.get("https://app.copious.care/");
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
		public  void searchBar1() {
			waitForVisibilityOf(By.xpath(searchBar));
			driver.findElement(By.xpath(searchBar)).sendKeys("test");
			
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

		
}