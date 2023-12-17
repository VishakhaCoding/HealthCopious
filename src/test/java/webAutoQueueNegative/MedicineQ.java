package webAutoQueueNegative;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MedicineQ {
public static WebDriver driver;
	
	public static String mobileNumber = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input";
	public static String sendOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button";
	public static String verifyOTP = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button";
	public static String searchBar = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input";
	public static String searchOpt = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button";
	public static String AddNewPrescription = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[2]/div[2]/div[1]/app-patient/div/div/div/div/div[2]/div/div/ul/a/li/a/div/div[3]/figure/a[1]/img";
	public static String medicineSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/input";
	public static String Dolocare = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/ngb-typeahead-window/button[1]/ngb-highlight[1]";
	public static String MedAddtoList = "//div[text()='Add to List']";
	
	public static String Instruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[4]/div/app-language-select-textbox/div/input";
	public static String AddNewDrug = "/html/body/div[4]/div[2]/div/mat-dialog-container/div[3]/div";
	
	public static String PopularOption = "//div[text()=' Popular ']";
	public static String PopularSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[1]/input";
	public static String PopularMedicineClick = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/div[3]/div[1]/div/img";
	public static String FavouriteOption = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[1]/div/div[2]/div[3]";
	public static String FavouriteSearch = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[1]/input";
	public static String FavouriteClick = "span.mat-option-text";
	public static String FavouriteClickMedicine = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div[2]/div/div/img";
	public static String Medicine = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[1]/mat-step-header[5]";
	public static String Medpageinstruction = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[5]/div/div/div[2]/div/div/div[4]/div/app-language-select-textbox/div/input";
	public static String MandatoryError="/html/body/div[4]/div[4]/div/mat-dialog-container/h4";
	public static String MandatoryFieldsOk="//*[text()='Ok']";
	public static String MedicineNotFound="// *[text()=' Medicine not found']";
	public static String AddNewDrug1="//*[@class='modal-footer ng-star-inserted']/child::div";

	
	
	
	
	
	
	public static String OTP1="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]"; 
	   public static String OTP2="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]"; 
	   public static String OTP3="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]"; 
	   public static String OTP4="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]";
	   public static String OTP5="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]";
	   public static String OTP6="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]"; 
	   public static void waitForVisibilityOf(By by) {
	    	 try {
	    	    	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    	      //  JavascriptExecutor jse = (JavascriptExecutor)driver;
	    	    }
	    	    catch(Exception e) {
	    	        e.printStackTrace();
	    	    }
	    	
	        }
	        public static void clickUsingJavaScript(By by) {
	       		
	   	 JavascriptExecutor js= (JavascriptExecutor)driver;
	   	 js.executeScript("arguments[0].click();", driver.findElement(by));
	        }
	        
	        public static void highlightElement(By by) {
	   	 JavascriptExecutor js= (JavascriptExecutor)driver;
	   	 js.executeScript("arguments[0].setAttribute('style', 'background: grey; border: 2px solid black;');", driver.findElement(by));
	        }
	        
	        
	        @BeforeClass
	        public void setUp() {
	    	
	            System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://app.copious.care/");
			//driver.get("https://opd.copious.care/");
			//driver.get("https://stage.copious.care/");
			driver.manage().window().fullscreen();

	 }
	        
	        
		
	        
	        @Test(priority=1)
	      	public  void numberField() {
	      	waitForVisibilityOf(By.xpath(mobileNumber));
	      	driver.findElement(By.xpath(mobileNumber)).sendKeys("2424242424");
	      	highlightElement(By.xpath(mobileNumber));
	    	clickUsingJavaScript(By.xpath(mobileNumber));
	        }
	        @Test(priority=2)
	        public  void sendOTP() throws InterruptedException {
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
	        @Test(priority=3)
	    	public  void verifyButton() throws InterruptedException {
	        	Thread.sleep(10000);
	    	waitForVisibilityOf(By.xpath(verifyOTP));
	    	//driver.findElement(By.xpath(verifyOTP));
	    	highlightElement(By.xpath(verifyOTP));
	    	clickUsingJavaScript(By.xpath(verifyOTP));
	    	}
	        @Test(priority = 4)
			public  void searchBar1() {
				waitForVisibilityOf(By.xpath(searchBar));
				driver.findElement(By.xpath(searchBar)).sendKeys("Test");
				
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
			@Test(priority = 25)
			public void AddPrescription() throws InterruptedException {
				Thread.sleep(15000);
				waitForVisibilityOf(By.xpath(AddNewPrescription));
				driver.findElement(By.xpath(AddNewPrescription));
				highlightElement(By.xpath(AddNewPrescription));
				clickUsingJavaScript(By.xpath(AddNewPrescription));}
				
				@Test(priority = 34) public void Medicine1() throws InterruptedException {
					  
					  Thread.sleep(15000); waitForVisibilityOf(By.xpath(Medicine));
					  driver.findElement(By.xpath(Medicine)); highlightElement(By.xpath(Medicine));
					  clickUsingJavaScript(By.xpath(Medicine));
					  
					  
						/*
						 * waitForVisibilityOf(By.xpath(medicineSearch));
						 * highlightElement(By.xpath(medicineSearch));
						 * driver.findElement(By.xpath(medicineSearch)).sendKeys("dolo");
						 * waitForVisibilityOf(By.xpath(Dolocare));
						 * highlightElement(By.xpath(Dolocare));
						 * clickUsingJavaScript(By.xpath(Dolocare));
						 */
					  
					
					  highlightElement(By.xpath(Medpageinstruction));
					  driver.findElement(By.xpath(Medpageinstruction));
					  clickUsingJavaScript(By.xpath(Medpageinstruction));
					  
					  
					
					  
					  
					  waitForVisibilityOf(By.xpath(Instruction));
					  highlightElement(By.xpath(Instruction));
					  driver.findElement(By.xpath(Instruction)).sendKeys("Drink water");
					  clickUsingJavaScript(By.xpath(Instruction));
					  
					  waitForVisibilityOf(By.xpath(MedAddtoList));
					  highlightElement(By.xpath(MedAddtoList));
					  driver.findElement(By.xpath(MedAddtoList));
					  clickUsingJavaScript(By.xpath(MedAddtoList));
					  
						/*
						 * waitForVisibilityOf(By.xpath(MandatoryError));
						 * highlightElement(By.xpath(MandatoryError)); String
						 * actualMsg=driver.findElement(By.xpath(MandatoryError)).getText();
						 * System.out.println("actual Msg :"+actualMsg); Object errorMessage =
						 * "Mandatory Fields"; Assert.assertEquals(actualMsg,errorMessage);
						 */
					 
					  waitForVisibilityOf(By.xpath(MandatoryFieldsOk));
					  highlightElement(By.xpath(MandatoryFieldsOk));
					  driver.findElement(By.xpath(MandatoryFieldsOk));
					  clickUsingJavaScript(By.xpath(MandatoryFieldsOk));
					  
					  
						  waitForVisibilityOf(By.xpath(medicineSearch));
						  highlightElement(By.xpath(medicineSearch));
						  driver.findElement(By.xpath(medicineSearch)).sendKeys("zzzzz");
						  
						  waitForVisibilityOf(By.xpath(MedAddtoList));
						  highlightElement(By.xpath(MedAddtoList));
						  driver.findElement(By.xpath(MedAddtoList));
						  clickUsingJavaScript(By.xpath(MedAddtoList));
						 
						  waitForVisibilityOf(By.xpath(MedicineNotFound));
						  highlightElement(By.xpath(MedicineNotFound));
						  String actualMsg1=driver.findElement(By.xpath(MedicineNotFound)).getText();
						  System.out.println("actual Msg :"+actualMsg1);
						  Object errorMessage1 = "Medicine not found";
						  Assert.assertEquals(actualMsg1,errorMessage1);
						  
						  waitForVisibilityOf(By.xpath(AddNewDrug1));
						  highlightElement(By.xpath(AddNewDrug1));
						  driver.findElement(By.xpath(AddNewDrug1));
						  clickUsingJavaScript(By.xpath(AddNewDrug1));
						  
						  org.openqa.selenium.Alert alt=driver.switchTo().alert();
							System.out.println(alt.getText());
							String Expected="Please specify drug name and type.";
							String Actual=alt.getText();
							if(Expected.equals(Actual))
							{
								System.out.println("test is passed");
							}
							else
							{
								System.out.println("test is failed");
							}
							alt.accept();
							
					  
					  
					  
					  Thread.sleep(15000);
					  
					  waitForVisibilityOf(By.xpath(PopularOption));
					  highlightElement(By.xpath(PopularOption));
					  driver.findElement(By.xpath(PopularOption));
					  clickUsingJavaScript(By.xpath(PopularOption));
					  
					  waitForVisibilityOf(By.xpath(PopularSearch));
					  highlightElement(By.xpath(PopularSearch));
					  driver.findElement(By.xpath(PopularSearch)).sendKeys("Cro");
					  
					  waitForVisibilityOf(By.xpath(PopularMedicineClick));
					  highlightElement(By.xpath(PopularMedicineClick));
					  driver.findElement(By.xpath(PopularMedicineClick));
					  clickUsingJavaScript(By.xpath(PopularMedicineClick));
					  
					  Thread.sleep(15000);
					  
					  waitForVisibilityOf(By.xpath(FavouriteOption));
					  highlightElement(By.xpath(FavouriteOption));
					  driver.findElement(By.xpath(FavouriteOption));
					  clickUsingJavaScript(By.xpath(FavouriteOption));
					  
					  waitForVisibilityOf(By.xpath(FavouriteSearch));
					  highlightElement(By.xpath(FavouriteSearch));
					  driver.findElement(By.xpath(FavouriteSearch)).sendKeys("April");
					  
					  waitForVisibilityOf(By.cssSelector(FavouriteClick));
					  highlightElement(By.cssSelector(FavouriteClick));
					  driver.findElement(By.cssSelector(FavouriteClick));
					  clickUsingJavaScript(By.cssSelector(FavouriteClick));
					  
					  waitForVisibilityOf(By.xpath(FavouriteClickMedicine));
					  highlightElement(By.xpath(FavouriteClickMedicine));
					  driver.findElement(By.xpath(FavouriteClickMedicine));
					  clickUsingJavaScript(By.xpath(FavouriteClickMedicine));
					  
					
					  
					  }


}
