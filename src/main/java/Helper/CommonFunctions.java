package Helper;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import Base.TestBase;

public class CommonFunctions extends TestBase{
    
    public CommonFunctions(WebDriver driver) throws IOException {
	
	TestBase.driver = driver;
	
}
    public static void waitForVisibilityOf(By by) {
	//WebDriverWait wait = new WebDriverWait(driver, 50);
	try {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// JavascriptExecutor jse = (JavascriptExecutor)driver;
	} catch (Exception e) {
		e.printStackTrace();
	}

}
    public void waitForElement(WebElement element) {
	System.out.println("Executing waitForElement " + element);
	log.info("Executing waitForElement " + element);
	//WebDriverWait wait = new WebDriverWait(driver, 5);
	int attempts = 1;
	while (attempts < 5) {
		try {
			//wait.until(ExpectedConditions.visibilityOf(element));
			break;
		} catch (StaleElementReferenceException ex) {
			System.out.println("Caught StaleElementReferenceException in waitForElement Method for '"+attempts+"' time.");
			attempts++;
		} catch (Exception e) {
			e.printStackTrace();
			break;
		}
}
	
}
    
public void clickUsingJavaScript(By by) {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", driver.findElement(by));
}

public void clickUsingJavaScript(WebElement element) {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", element);
}

public  void highlightElement(By by) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style', 'background: pink; border: 2px solid red;');",
			driver.findElement(by));
}

public  void highlightElement(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style', 'background: grey; border: 2px solid black;');",
		element);
}

}
