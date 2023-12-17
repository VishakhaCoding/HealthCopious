package healthApp;

import java.io.File;
import java.net.MalformedURLException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HealthImmunization extends HealthLogin{
	@Test(priority = 5)
	public void SelectFamilyMember() throws MalformedURLException, InterruptedException {

		 Thread.sleep(5000);
		List<WebElement> SelectFamilyMember =driver.findElements(By.xpath(
				"//android.view.ViewGroup[@index='3']"));
		SelectFamilyMember.get(0).click();

		
		  Thread.sleep(5000);

	}

	@Test(priority = 7)
	public void Immunization() throws MalformedURLException, InterruptedException {
		

		List<WebElement> Immunization =driver.findElements(By.xpath(
				"//*[@text='Immunization']"));
		Immunization.get(0).click();

		
		  Thread.sleep(5000);

	}
	@Test(priority = 8)
	public void Birth() throws MalformedURLException, InterruptedException {
		

		List<WebElement> Birth =driver.findElements(By.xpath(
				"//*[@text='At Birth']"));
		Birth.get(0).click();

		
		  Thread.sleep(5000);
		  
		  List<WebElement> BCG =driver.findElements(By.xpath(
					"//*[@text='BCG']"));
		  BCG.get(0).click();
		  
		  List<WebElement> Addvaccine =driver.findElements(By.xpath(
					"//*[@text='Add Vaccine']"));
		  Addvaccine.get(0).click();
		  
		  Thread.sleep(5000);
		  List<WebElement> SelectBrand =driver.findElements(By.xpath(
					"//*[@text='Tubaervac BCG']"));
		  SelectBrand.get(0).click();
		  
		  Thread.sleep(5000);
			WebElement VaccineLabel = driver.findElement(By.xpath("//*[@text='Upload Photo of Vaccine Label']"));
			VaccineLabel.click();
			Thread.sleep(2000);
			// driver.findElement(By.xpath("//*[@text='Ok']")).click();

			Thread.sleep(2000);
			WebElement allow

					= driver.findElement(By.xpath("//*[@text='Allow']"));
			allow.click();

			WebElement allow1

					= driver.findElement(By.xpath("//*[@text='Allow']"));
			allow1.click();
			Thread.sleep(2000);
			;

			Thread.sleep(2000);
			WebElement CameraClick = driver.findElement(By.xpath("//CenterButtonGroup[@content-desc=\"NONE\"]"));
			CameraClick.click();

			Thread.sleep(5000);

			WebElement UploadOk = driver.findElement(By.xpath("//*[@text='OK']"));
			UploadOk.click();

			Thread.sleep(2000);

			WebElement Submit = driver.findElement(By.xpath("//*[@text='Submit']"));
			Submit.click();

		}

		
		  @Test(priority = 9) public void PopUpOk() throws InterruptedException,
					IndexOutOfBoundsException {
				/*
				 * Thread.sleep(2000); WebElement PopUpOk1 =
				 * driver.findElement(By.xpath("//*[@text='OK']")); PopUpOk1.click();
				 * 
				 * Thread.sleep(2000);
				 * 
				 * WebElement Submit =driver.findElement(By.xpath("//*[@text='Submit']"));
				 * Submit.click(); Thread.sleep(2000);
				 */
			  Thread.sleep(5000);
			WebElement VaccineOk = driver.findElement(By.xpath("//*[@text='OK']"));
			VaccineOk.click();

			Thread.sleep(2000);
		  
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
