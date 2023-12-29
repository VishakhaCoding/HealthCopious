package pivotalApplication;


import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.io.IOExceptionWithCause;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class AppiumServerStart {
	 AppiumDriver driver;
	
	

	
private static AppiumDriverLocalService Server;
@Test()
@BeforeSuite()
public void BfSuite()
{
	Server= getAppiumServiceDefault();
	Server.start();
	Server.clearOutPutStreams(); //clear the server logs
	System.out.println("Appium Server started");
}

  @org.testng.annotations.AfterSuite() public void AfterSuite() {
  
  Server.stop();
  System.out.println("Appium Server stopped");
  
  
  
  }
 
	/*
	 * public boolean CheckAppiumServerIsRunning(int port) throws IOException {
	 * boolean isAppiumRunning= false; Socket socket; try { socket= new
	 * Socket(port); socket.close();} catch(IOExceptionWithCause e) {
	 * System.out.println("1"); isAppiumRunning= true;
	 * 
	 * }finally { socket=null; }
	 * 
	 * return isAppiumRunning; }
	 */

public AppiumDriverLocalService getAppiumServiceDefault() {
	return AppiumDriverLocalService.buildDefaultService();
}






  
  
/*
 * @BeforeClass public void setup() throws MalformedURLException,
 * InterruptedException {
 * 
 * DesiredCapabilities dc = new DesiredCapabilities();
 * dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
 * dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
 * dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
 * dc.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung"); CommandLine
 * cmd = new CommandLine("C:\\Program Files\\nodejs\\node.exe");
 * cmd.addArgument(
 * "C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"
 * ); dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120000);
 * //dc.setCapability(MobileCapabilityType.APP, "D:\\pivotalapp-20-june.apk");
 * //dc.setCapability(MobileCapabilityType.APP, "D:\\pivoapp-prod-16-nov.apk");
 * URL url = new URL("http://0.0.0.0:4723/"); dc.setCapability("appPackage",
 * "com.calculator_apps"); dc.setCapability("appActivity",
 * "com.calculator_apps.MainActivity"); // AndroidDriver driver = //
 * //newAndroidDriver(new // URL("http://127.0.0.1:4723/wd/hub"), dc);
 * //Createdriver object driver = new AppiumDriver(url, dc);
 * 
 * // Thread.sleep(5000);
 * 
 * }
 */
 
 
 
 
 

}
