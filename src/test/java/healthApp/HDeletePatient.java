package healthApp;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HDeletePatient extends HealthLogin {
	@Test(priority = 5)
	public void SelectFamilyMember() throws MalformedURLException, InterruptedException {

		 Thread.sleep(5000);
		List<WebElement> SelectFamilyMember =driver.findElements(By.xpath(
				"//android.view.ViewGroup[@index='3']"));
		SelectFamilyMember.get(0).click();

		
		  Thread.sleep(5000);

	}
	
	@Test(priority = 6)
	public void SelectProfile() throws MalformedURLException, InterruptedException {

		 Thread.sleep(5000);
		List<WebElement> SelectFamilyMember =driver.findElements(By.xpath(
				"//*[@text='Profile']"));
		SelectFamilyMember.get(0).click();

		
		  Thread.sleep(5000);

	}
	@Test(priority = 7)
	public void DeletePatient() throws MalformedURLException, InterruptedException {

		 Thread.sleep(5000);
		List<WebElement> DeletePatient =driver.findElements(By.xpath(
				"//*[@text='Delete']"));
		DeletePatient.get(0).click();

		
		  Thread.sleep(5000);
		  
		  Thread.sleep(5000);
			List<WebElement> ClickYes =driver.findElements(By.xpath(
					"//*[@text='Delete']"));
			ClickYes.get(0).click();
		  

	}
	


}
