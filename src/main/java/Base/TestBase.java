
  package Base;
  
  import java.io.File; import java.io.FileInputStream; 
import
  java.io.FileNotFoundException; import java.io.IOException; import
  java.util.Properties; import java.util.concurrent.TimeUnit;
  
  import org.apache.commons.io.FileUtils; import org.apache.log4j.Logger;
  import org.openqa.selenium.OutputType; import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver; import
  org.openqa.selenium.firefox.FirefoxDriver; import
  org.openqa.selenium.ie.InternetExplorerDriver; import
  org.openqa.selenium.support.events.EventFiringWebDriver; import
  org.testng.ITestResult; import org.testng.annotations.AfterMethod; import
  org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
  
  public class TestBase { public static WebDriver driver; public static
  Properties prop; public static EventFiringWebDriver e_driver; public static
  Logger log = Logger.getLogger("devpinoyLogger");
  
  public TestBase() {
  
  try { prop = new Properties();
  
  FileInputStream ip = new FileInputStream( System.getProperty("user.dir") +
  "/src/main/java" + "/com.webauto.config/config.properties"); prop.load(ip); }
  catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
  e) { e.printStackTrace(); } }
  
  
  @Test(priority=0)
  @BeforeClass public static void initialization() throws IOException { String
  browserName = prop.getProperty("browser");
  
  if (browserName.equals("chrome")) {
  
  System.setProperty("webdriver.chrome.driver",
  "C:\\Users\\Lenovo\\Desktop\\PracticeHealth\\src\\test\\resources\\Browser\\chromedriver.exe");
  
  driver = new ChromeDriver();
  
  log.debug("chrome launch..............");
  System.out.println("chrome launch.............."); } else if
  (browserName.equalsIgnoreCase("firefox")) {
  System.setProperty("webdrive.gecko.driver",
  ".//src//test//resources//Browser//geckodrivers.exe"); driver = new
  FirefoxDriver(); log.debug("firefox launch..............");
  System.out.println("firefox launch.............."); } else if
  (browserName.equalsIgnoreCase("ie")) {
  System.setProperty("webdriver.ie.driver",
  ".//src//test//resources//Browser//IEDriverServer.exe"); driver = new
  InternetExplorerDriver(); log.debug("IE launch..............");
  System.out.println("IE launch.............."); }
  driver.manage().window().maximize(); driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  driver.get(prop.getProperty("sandboxurl"));
  driver.manage().window().fullscreen();
  
  }}
  
  // @AfterClass public void close() throws IOException {
  
	/*
	 * @AfterMethod public void screenShot(ITestResult result) { // using
	 * ITestResult.FAILURE is equals to result.getStatus then it // enter into if
	 * condition if (ITestResult.FAILURE == result.getStatus()) { try { // To create
	 * reference of TakesScreenshot EventFiringWebDriver edriver = new
	 * EventFiringWebDriver(driver); // Call method to capture screenshot File src =
	 * edriver.getScreenshotAs(OutputType.FILE); // Copy files to specific location
	 * // result.getName() will return name of test case so that screenshot name
	 * will // be same as test case name FileUtils.copyFile(src, new
	 * File("C:\\ScreenShotFolder\\" + result.getName() + ".png"));
	 * System.out.println("Successfully captured a screenshot"); // driver.quit(); }
	 * catch (Exception e) { System.out.println("Exception while taking screenshot "
	 * + e.getMessage());
	 * 
	 * // driver.quit(); //
	 * Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T"); }
	 * 
	 * } } } }
	 */
 