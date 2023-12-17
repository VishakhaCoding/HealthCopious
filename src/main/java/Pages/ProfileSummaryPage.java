package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Helper.CommonFunctions;

public class ProfileSummaryPage extends TestBase {

    CommonFunctions cf;
    @FindBy(xpath = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[1]")
    WebElement quickRx;
    
    @FindBy(xpath = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[1]")
    WebElement overview;
    
    @FindBy(xpath = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-profile-summary/div/div[1]/app-top-info-navbar/div/div[2]/div[1]")
    WebElement healthProfile;

   
    public ProfileSummaryPage() throws IOException {
	PageFactory.initElements(driver, this);
	cf = new CommonFunctions(driver);
    }

  

    public void clickOnQuickRx() {
	cf.waitForElement(quickRx);
	cf.highlightElement(quickRx);
	cf.clickUsingJavaScript(quickRx);
	//doctorLoginLink.click();
    }
    
    public void clickOnHealthProfile() {
   	cf.waitForElement(healthProfile);
   	cf.highlightElement(healthProfile);
   	cf.clickUsingJavaScript(healthProfile);
   	//doctorLoginLink.click();
       }
}
