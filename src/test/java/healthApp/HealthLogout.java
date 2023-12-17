package healthApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HealthLogout extends HealthLogin {
	
	@Test(priority = 1)
	public void menu() throws InterruptedException {
	

	Thread.sleep(2000);
	WebElement menu
	=driver.findElement(By.xpath("//*[@text='Menu']"));
	menu.click();
	
	
	Thread.sleep(5000);
	WebElement Logout
	=driver.findElement(By.xpath("//*[@text='Logout']"));
	Logout.click();
	
	Thread.sleep(5000);
	WebElement LogoutPopup
	=driver.findElement(By.xpath("//*[@text='LOGOUT']"));
	LogoutPopup.click();
	}
}
