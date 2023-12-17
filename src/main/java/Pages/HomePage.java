package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Helper.CommonFunctions;

public class HomePage extends TestBase {

    CommonFunctions cf;
    @FindBy(xpath = "/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/div[3]/div")
    WebElement welcomeUserName;

    @FindBy(xpath = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[6]")
    WebElement complaintDetails;

    @FindBy(xpath = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[3]/div/div/div[1]")
    WebElement moreSymptoms;
    
    @FindBy(xpath = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[1]/div[2]/div/input")
    WebElement complainSearch;
    
    @FindBy(xpath = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[1]/div[2]/button")
    WebElement complainNew;

    
	
    public HomePage() throws IOException {
	PageFactory.initElements(driver, this);
	cf = new CommonFunctions(driver);
    }

   
public String getWelcomeUserN() {
    return welcomeUserName.getText();
}
   
    
    public void enterComplaintDescription() {
   	cf.waitForElement(complaintDetails);
   	cf.highlightElement(complaintDetails);
   	complaintDetails.sendKeys("test data");
       }
    
  
}
