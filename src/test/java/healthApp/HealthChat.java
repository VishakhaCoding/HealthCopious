package healthApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HealthChat extends HealthLogin{
	@Test(priority = 5)
	public void Chats() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement Chats = driver.findElement(By.xpath("//*[@text='Chats']"));
		Chats.click();

		Thread.sleep(5000);

	}
	@Test(priority = 6)
	public void SelectFamilyMember() throws InterruptedException, IndexOutOfBoundsException {
		Thread.sleep(2000);
		WebElement SelectFamilyMember = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Dr. vishakha Nawale (For ReHealth16feb)\"]"));
		SelectFamilyMember.click();

		Thread.sleep(5000);

	}
	@Test(priority=7) public void clickCamera() throws InterruptedException {
		  Thread.sleep(2000);
		  
				  
				//working code for vdo call checkbox
			WebElement Camera
			
			  = driver.findElement(By.className("android.widget.Button"));
			Camera.click();
		
		  
			  
		  Thread.sleep(5000);}
	  @Test(priority=8) public void CameraAllow() throws InterruptedException {
		  Thread.sleep(2000);
		  
				  
				//working code for vdo call checkbox
				  
			WebElement allow
			
			  = driver.findElement(By.xpath("//*[@text='While using the app']"));
			allow.click();
			  
		  Thread.sleep(5000);}

		/*
		 * @Test(priority=9) public void CameraAllow1() throws InterruptedException {
		 * Thread.sleep(2000);
		 * 
		 * 
		 * //working code for vdo call checkbox
		 * 
		 * WebElement allow1
		 * 
		 * = driver.findElement(By.xpath("//*[@text='Allow']")); allow1.click();
		 * 
		 * Thread.sleep(5000);}
		 */
	  @Test(priority=10) public void CameraClick() throws InterruptedException {
		  Thread.sleep(2000);
		  
				  
				//working code for vdo call checkbox
				  
		  WebElement CameraClick
		  = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Take picture\"]"));
		CameraClick.click();
			  
		  Thread.sleep(5000);}
	  @Test(priority=11) public void OkClick() throws InterruptedException {
		  Thread.sleep(2000);
		  
				  
				
		  WebElement UploadOk
		  =driver.findElement(By.xpath("//*[@text='OK']"));
		 UploadOk.click();
		
		  
			  
		  Thread.sleep(5000);}	

		
		/*
		 * @Test(priority=12) public void Gallery() throws InterruptedException {
		 * Thread.sleep(2000);
		 * 
		 * 
		 * 
		 * List<WebElement >Gallery
		 * =driver.findElements(By.className("/android.view.ViewGroup"));
		 * Gallery.get(5).click();
		 * 
		 * 
		 * 
		 * Thread.sleep(5000);
		 * 
		 * 
		 * System.out.println ("wait"); Thread.sleep(5000); }
		 */
		 
	  @Test(priority=13) public void TypeMessage() throws InterruptedException {
		  Thread.sleep(2000);
		  
				  
				//working code for vdo call checkbox
				  
				 WebElement TypeMessage =driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Type a message...\"]"));
				 TypeMessage.sendKeys("test");
		  
		 // WebElement Appointmentclick =driver.findElement(By.id("appointment_menu_id"));
		 // Appointmentclick.click();
		  
		  Thread.sleep(5000);
			
		  
		  }

			
			  @Test(priority=14) public void SendButton() throws InterruptedException {
			  Thread.sleep(2000);
			  
			  
			  //working code for vdo call checkbox
			  
			 List< WebElement> SendButton =driver.findElements(By.xpath(
			  "//*[@text='']"));
			  SendButton.get(0).click();
			  
			  
			  Thread.sleep(5000);
			  
			  
			  }
			
}
