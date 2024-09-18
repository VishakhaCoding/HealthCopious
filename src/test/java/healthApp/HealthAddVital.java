package healthApp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pivotalApplication.AppiumServerStart;

public class HealthAddVital extends AppiumServerStart   {
	AppiumDriver driver;
	public Object MobileElement;
//CertificateValid
	@BeforeClass
	public void setup1() throws MalformedURLException, InterruptedException {

	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
	dc.setCapability("–session-override",true);
	  dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120000);
	  dc.setCapability("noReset", false) ;
	dc.setCapability(MobileCapabilityType.APP, "C:\\healthapp-release-23-apr.apk");
	URL url = new URL("http://0.0.0.0:4723/");
	dc.setCapability("appPackage", "com.calculator_parent_apps");
	dc.setCapability("appActivity", "com.calculator_parent_apps.MainActivity");
	// AndroidDriver driver = new AndroidDriver(new
	// URL("http://127.0.0.1:4723/wd/hub"), dc); //Create driver object
	driver = new AppiumDriver(url, dc);

	Thread.sleep(10000);

}

	@Test(priority = 0)
	public void NumberField() throws MalformedURLException, InterruptedException {
		Thread.sleep(5000);
		List<WebElement> EnglishSelect = driver.findElements(By.xpath("//*[@text='Select']"));
		EnglishSelect.get(0).click();

		Thread.sleep(10000);
		// highlightElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));

		WebElement Number = driver.findElement(By.xpath(
				"//android.widget.EditText[@text=\"Mobile Number\"]"));
		Number.sendKeys("9665002440");
		// highlightElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
	}

@Test(priority = 1)
public void IAgree() throws MalformedURLException, InterruptedException {
	WebElement Agree = driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
	Agree.click();
	Thread.sleep(1000);
}

@Test(priority = 2)
public void proceedButton() throws MalformedURLException, InterruptedException {
	List<WebElement> proceed = driver.findElements(By.className(
			"android.widget.TextView"));
	proceed.get(6).click();
	Thread.sleep(5000);
}

@Test(priority = 3)
public void OTP() throws MalformedURLException, InterruptedException {
	List<WebElement> otp1 =driver.findElements(By.className(
			"android.widget.TextView"));
	otp1.get(7).click();

	Thread.sleep(1000);
	
	List<WebElement> otp2 =driver.findElements(By.xpath(
			"//*[@text='4']"));
	otp2.get(0).click();


	Thread.sleep(1000);
	
	List<WebElement> otp3 =driver.findElements(By.xpath(
			"//*[@text='0']"));
	otp3.get(1).click();


	Thread.sleep(1000);
	
	List<WebElement> otp4 =driver.findElements(By.xpath(
			"//*[@text='5']"));
	otp4.get(0).click();

	Thread.sleep(1000);
	
	List<WebElement> otp5 =driver.findElements(By.xpath(
			"//*[@text='2']"));
	otp5.get(0).click();


	Thread.sleep(1000);
	
	List<WebElement> otp6 =driver.findElements(By.xpath(
			"//*[@text='0']"));
	otp6.get(2).click();

	Thread.sleep(5000);
}

@Test(priority = 4)
public void Verify() throws MalformedURLException, InterruptedException {
	List<WebElement> verify =driver.findElements(By.xpath(
			"//*[@text='Verify and Proceed']"));
	verify.get(0).click();


	
	  Thread.sleep(5000);

}
@Test(priority = 5)
public void AddButton2() throws MalformedURLException, InterruptedException {
	/*
	 * List<WebElement> BackArrow =
	 * driver.findElements(By.className("android.widget.TextView"));
	 * BackArrow.get(0).click();
	 */
	Thread.sleep(10000);
	//List<WebElement> SelectFamilyMember = driver.findElements(By.className("android.view.ViewGroup"));
	//SelectFamilyMember.get(8).click();
	
	List<WebElement> SelectFamilyMember = driver.findElements(By.xpath("//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView"));
	SelectFamilyMember.get(0).click();

	Thread.sleep(5000);

	List<WebElement> AddButton = driver.findElements(By.xpath("(//android.widget.TextView[@text=\"󰐕\"])[2]"));
	AddButton.get(0).click();

	Thread.sleep(5000);

}

@Test(priority = 6)
public void AllVisits() throws MalformedURLException, InterruptedException {

	List<WebElement> AllVisits = driver.findElements(By.xpath("//*[@text='All Visits']"));
	AllVisits.get(0).click();

	Thread.sleep(5000);

}

@Test(priority = 7)
public void AddVitalsClick() throws MalformedURLException, InterruptedException {

	List<WebElement> AddVitalsClick = driver.findElements(By.xpath("//*[@text='Add Vitals']"));
	AddVitalsClick.get(0).click();

	Thread.sleep(5000);

}

@Test(priority = 8)
public void AddVitals() throws MalformedURLException, InterruptedException {

	List<WebElement> Weight = driver.findElements(By.xpath("//*[@text='WT. (kg)']"));
	Weight.get(0).sendKeys("5");

	List<WebElement> height = driver.findElements(By.xpath("//*[@text='HT. (cm)']"));
	height.get(0).sendKeys("100");

	List<WebElement> Temperature = driver.findElements(By.xpath("//*[@text='Temp. (F)']"));
	Temperature.get(0).sendKeys("98");

	List<WebElement> SPO2 = driver.findElements(By.xpath("//*[@text='SPO2']"));
	SPO2.get(1).sendKeys("100");

	List<WebElement> Haemoglobin = driver.findElements(By.xpath("//*[@text='Haemoglobin']"));
	Haemoglobin.get(1).sendKeys("12");

	List<WebElement> BPSys = driver.findElements(By.xpath("//*[@text='BP (Sys)']"));
	BPSys.get(1).sendKeys("70");

	List<WebElement> BPDia = driver.findElements(By.xpath("//*[@text='BP (Dia)']"));
	BPDia.get(1).sendKeys("70");

	List<WebElement> HeartRate = driver.findElements(By.xpath("//*[@text='Heart Rate']"));
	HeartRate.get(1).sendKeys("72");
	
	//List<WebElement> HeartRatetext = driver.findElements(By.xpath("//*[@text='Heart Rate']"));
	//HeartRatetext.get(0).click();

	//List<WebElement> Pulse1 = driver.findElements(By.xpath("//*[@text='Pulse']"));
	//Pulse1.get(0).click();
	
	System.out.println("Before scrolling ....");
	driver.findElement(AppiumBy.androidUIAutomator(
			"new UiScrollable(new UiSelector().scrollable(false).instance(0)).scrollIntoView(new UiSelector().textContains(\"Bloodsugar (F)\").instance(0))"));
	// Thread.sleep(10000);
	// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new
	// UiSelector().scrollable(false).instance(0)).scrollIntoView(new
	// UiSelector().textContains(\"Lipid Profile\").instance(0))"));
	Thread.sleep(10000);

	List<WebElement> Pulse = driver.findElements(By.xpath("//*[@text='Pulse']"));
	Pulse.get(1).sendKeys("78");

	List<WebElement> BloodSugarR = driver.findElements(By.xpath("//*[@text='Blood Sugar (Random)']"));
	BloodSugarR.get(1).sendKeys("300");

	List<WebElement> BloodSugarf = driver.findElements(By.xpath("//*[@text='Bloodsugar (F)']"));
	BloodSugarf.get(1).sendKeys("200");

	List<WebElement> BloodSugarPP = driver.findElements(By.xpath("//*[@text='Bloodsugar (PP)']"));
	BloodSugarPP.get(1).sendKeys("250");

	List<WebElement> BloodSugarHB = driver.findElements(By.xpath("//*[@text='Blood (HbA1c)']"));
	BloodSugarHB.get(1).sendKeys("250");

	Thread.sleep(5000);

}

@Test(priority = 9)
public void LipidProfile() throws MalformedURLException, InterruptedException {

	List<WebElement> LipidArrow = driver.findElements(By.xpath("//*[@text='Lipid Profile']"));
	LipidArrow.get(0).click();

	List<WebElement> CholestrolHDL = driver.findElements(By.xpath("//*[@text='Cholesterol (HDL)']"));
	CholestrolHDL.get(1).sendKeys("110");

	List<WebElement> CholestrolLDL = driver.findElements(By.xpath("//*[@text='Cholesterol (LDL)']"));
	CholestrolLDL.get(1).sendKeys("120");

	System.out.println("Before scrolling ....");
	driver.findElement(AppiumBy.androidUIAutomator(
			"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Total Cholesterol\").instance(0))"));
	Thread.sleep(10000);

	List<WebElement> TotalCholesterol = driver.findElements(By.xpath("//*[@text='Total Cholesterol']"));
	TotalCholesterol.get(1).sendKeys("140");

	List<WebElement> Tryglycerides = driver.findElements(By.xpath("//*[@text='Triglycerides']"));
	Tryglycerides.get(1).sendKeys("140");

	List<WebElement> Save = driver.findElements(By.xpath("//*[@text='Save']"));
	Save.get(0).click();

	Thread.sleep(5000);
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
