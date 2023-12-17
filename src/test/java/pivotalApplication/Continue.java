package pivotalApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Continue extends PivotalLogIn{
	@Test(priority = 7)
	public void Appointment() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		List<WebElement> Appointment = driver.findElements(By.className("android.widget.TextView"));
		Appointment.get(7).click();

		
	}

	
	  @Test(priority=8) public void SlotTime() throws InterruptedException {
	  Thread.sleep(10000); List<WebElement> SlotTime =
	  driver.findElements(By.className("android.widget.EditText"));
	  
	  
	  SlotTime.get(2).click();
	  
	  
	  
	  
	  
	  }
	  
	  @Test(priority=9) public void Time() throws InterruptedException {
	  Thread.sleep(2000); List<WebElement> Time =
	  driver.findElements(By.className("android.widget.TextView"));
	  
	  
	  Time.get(10).click();
	  
	  
	  
	  
	  
	  }
	  
	  @Test(priority=10) public void SlotBook() throws InterruptedException {
	  Thread.sleep(2000); List<WebElement>  SlotBook =
	  driver.findElements(By.className("android.widget.TextView"));
	  
	  
	  //SlotBook.get(36).click();//11;40
	  SlotBook.get(9).click(); //11:10
	  
	  
	  
	  
	  }
	 
	@Test(priority = 11)
	public void VideoCheckBox() throws InterruptedException {
		Thread.sleep(2000);
		

		List<WebElement> VideoCheckBox = driver.findElements(By.className("android.widget.TextView"));
		VideoCheckBox.get(11).click();

	}

	@Test(priority = 12)
	public void Book() throws InterruptedException {
		Thread.sleep(2000);

		 WebElement BookAP = driver.findElement(By.xpath("//*[@text='Book Appointment']"));
		 BookAP.click();
		Thread.sleep(5000);

	}

	@Test(priority = 13)
	public void AppointmentBookedPopup() throws InterruptedException {
		Thread.sleep(2000);

		

		List<WebElement> AppointmentBookedPopup = driver.findElements(By.className("android.widget.TextView"));
		AppointmentBookedPopup.get(2).click();

		Thread.sleep(5000);

	}
	

}
