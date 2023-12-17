package Pages;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Helper.CommonFunctions;

public class LoginPage extends TestBase {
	
    CommonFunctions cf;
    @FindBy(xpath = "/html/body/app-root/app-home-page/div/div/div/header[2]/div/div[4]/button")
    WebElement doctorLoginLink;

    @FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[2]/input")
    WebElement mobileNumber;

    @FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[4]/button")
    WebElement sendOTP;

    @FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[1]")
    WebElement enterOTP1;
    
    @FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[2]")
    WebElement enterOTP2;
    @FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[3]")
    WebElement enterOTP3;
    @FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[4]")
    WebElement enterOTP4;
    @FindBy(xpath ="/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[5]")
    WebElement enterOTP5;
    @FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[3]/div/input[6]")
    WebElement enterOTP6;

    @FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div[6]/button")
    WebElement verifyOTP;
    
    @FindBy(xpath = "/html/body/app-root/app-signin/div/div/div/div/div[1]/div/div/section/div/div/form/div[3]/div")
    WebElement validationMsg;

    public LoginPage() throws IOException {
	PageFactory.initElements(TestBase.driver, this);
	cf = new CommonFunctions(driver);
    }

    public String validateLoginPageTitle() {
	return driver.getTitle();
    }

    public String getValidationMsg() {
   	return validationMsg.getText();
       }

    public void clickOnDoctorLink() {
	
	cf.waitForElement(doctorLoginLink);
	cf.highlightElement(doctorLoginLink);
	cf.clickUsingJavaScript(doctorLoginLink);
	//doctorLoginLink.click();
	
    }
    
    public void enterMobileNumber(String number) {
    	cf.waitForElement(mobileNumber);
   	cf.highlightElement(mobileNumber);
   	mobileNumber.sendKeys(number);}
    
    public void enterMobileclear() {
   mobileNumber.clear();
       }
  
    public void enterOTP() {
   	
   	cf.highlightElement(enterOTP1);
   	cf.clickUsingJavaScript(enterOTP1);
   	enterOTP1.sendKeys("1");
   	
  
   	cf.highlightElement(enterOTP2);
   	cf.clickUsingJavaScript(enterOTP2);
   	enterOTP2.sendKeys("4");
   	
   	cf.waitForElement(enterOTP3);
   	cf.highlightElement(enterOTP3);
   	cf.clickUsingJavaScript(enterOTP3);
   	enterOTP3.sendKeys("0");
   	
   
   	cf.highlightElement(enterOTP4);
   	cf.clickUsingJavaScript(enterOTP4);
   	enterOTP4.sendKeys("5");
   	
  
   	cf.highlightElement(enterOTP5);
   	cf.clickUsingJavaScript(enterOTP5);
   	enterOTP5.sendKeys("2");
   	
      	cf.highlightElement(enterOTP6);
   	cf.clickUsingJavaScript(enterOTP6);
   	enterOTP6.sendKeys("0");
   	
   	
       }
    public void sendOTP() {
       	cf.waitForElement(sendOTP);
       	cf.highlightElement(sendOTP);
       	cf.clickUsingJavaScript(sendOTP);
    
    }
    public void verifyOtp() {
   	cf.waitForElement(verifyOTP);
   	cf.highlightElement(verifyOTP);
   	cf.clickUsingJavaScript(verifyOTP);
       }

	
	}

