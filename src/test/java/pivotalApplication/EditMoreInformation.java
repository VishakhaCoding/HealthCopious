package pivotalApplication;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.gson.stream.MalformedJsonException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class EditMoreInformation {

	private AppiumDriver driver;
	//public Object MobileElement;
	//AndroidDriver driver;

	@BeforeClass
	public void setup() throws MalformedJsonException, InterruptedException, MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
		dc.setCapability(MobileCapabilityType.APP, "D:\\\\pivotalapp-20-june.apk");
		URL url = new URL("http://0.0.0.0:4723/");
		dc.setCapability("appPackage", "com.calculator_apps");
		dc.setCapability("appActivity", "com.calculator_apps.MainActivity");
		// AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc); //Create driver object
		driver = new AppiumDriver(url, dc);

		Thread.sleep(5000);

	}

	@Test(priority = 0)
	public void NumberField() throws MalformedURLException, InterruptedException {
		WebElement Number =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));
		/*
		 * WebElement Number = driver.findElementByXPath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"
		 * ); Number.sendKeys("9665002440");
		 */
		Number.sendKeys("9665002440");
	}

	@Test(priority = 1)
	public void IAgree() throws MalformedURLException, InterruptedException {
		WebElement Agree = driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
		Agree.click();
		Thread.sleep(1000);
	}

	@Test(priority = 2)
	public void proceedButton() throws MalformedURLException, InterruptedException {
		WebElement proceed = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"));
		proceed.click();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void OTP() throws MalformedURLException, InterruptedException {
		WebElement otp = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"));
		otp.sendKeys("140520");

		Thread.sleep(10000);
	}

	@Test(priority = 4)
	public void submit() throws MalformedURLException, InterruptedException {
		WebElement submit = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView"));
		submit.click();

		Thread.sleep(2000);
		 List<WebElement> WhatsNewClose =  driver.findElements(By.className("android.widget.TextView"));
		  WhatsNewClose.get(1).click();
		  Thread.sleep(2000);

	}

	@Test(priority = 5)
	public void Search() throws InterruptedException {

		WebElement SearchIcon = 
				driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
		SearchIcon.click();

		Thread.sleep(2000);

		WebElement SearchBar = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_bar\"]"));
		SearchBar.sendKeys("pedi31Automation");

		Thread.sleep(2000);
		WebElement SearchIcon1 = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"search_icon\"]/android.widget.TextView"));
		SearchIcon1.click();
		Thread.sleep(5000);
	}

	@Test(priority = 6)
	public void ClickPatient() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> Clickpatient = driver
				.findElements(By.className("android.widget.TextView"));
		Clickpatient.get(5).click();



}
	@Test(priority = 7)
	public void ClickEdit() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> ClickEdit = driver
				.findElements(By.className("android.widget.TextView"));
		ClickEdit.get(28).click();
		ClickEdit.get(29).click();


}
	@Test(priority = 8)
	public void AddMedicalCondition() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(5000);
		List<WebElement> AddMedicalCondition = driver
				.findElements(By.className("android.widget.TextView"));
		//AddMedicalCondition.get(28).click();
		AddMedicalCondition.get(3).click();


}
	@Test(priority = 9)
	public void SelectMedicalCondition() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> SelectMedicalCondition = driver
				.findElements(By.className("android.widget.TextView"));
		SelectMedicalCondition.get(71).click();
		Thread.sleep(2000);
		SelectMedicalCondition.get(75).click();
		Thread.sleep(2000);
		SelectMedicalCondition.get(87).click();
		Thread.sleep(2000);
		
}

	@Test(priority = 10)
	public void AddMedicalCondition1() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement AddMedicalCondition1 = driver
				.findElement(By.xpath("//*[@text='Add Medical Conditions']"));
		AddMedicalCondition1.click();
		


}
	@Test(priority = 11)
	public void Allergies() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
	WebElement Allergies = driver
				.findElement(By.xpath("//*[@text='Your Allergies']"));
	Allergies.clear();
		Allergies.sendKeys("Dust");



}
	@Test(priority = 12)
	public void ReComplaints() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement ReComplaints = driver
				.findElement(By.xpath("//*[@text='Your Recurring Complaints']"));
		ReComplaints.clear();
		ReComplaints.sendKeys("yes");



}
	@Test(priority = 13)
	public void Hospitalization() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Hospitalization = driver
				.findElement(By.xpath("//*[@text='Your Hospitalization History']"));
		Hospitalization.clear();
		Hospitalization.sendKeys("yes");




}
	@Test(priority = 14)
	public void Submit() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Submit = driver
				.findElement(By.xpath("//*[@text='Submit']"));
		Submit.click();



}
}
