package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Helper.CommonFunctions;

public class ChiefComplaints extends TestBase {

    CommonFunctions cf;
    @FindBy(xpath = "//div[7]/app-cutom-card/div/div[text()='Cough ']")
    WebElement chiefComplaintCough;

    @FindBy(xpath = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[1]")
    WebElement complaintDetails;

    @FindBy(xpath = "\"/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[2]/div[3]/div/div/div[8]")
    WebElement moreSymptoms;
    
    @FindBy(xpath = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[1]/div[2]/div/input")
    WebElement complainSearch;
    
    @FindBy(xpath = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-quick/div/mat-horizontal-stepper/div[2]/div[1]/div/div/div/div[1]/div[2]/button")
    WebElement complainNew;

    
	
    public ChiefComplaints() throws IOException {
	PageFactory.initElements(driver, this);
	cf = new CommonFunctions(driver);
    }

   

    public void clickOnChiefComplaint() {
	cf.waitForElement(chiefComplaintCough);
	cf.highlightElement(chiefComplaintCough);
	cf.clickUsingJavaScript(chiefComplaintCough);
	//doctorLoginLink.click();
    }
    
    public void enterComplaintDescription() {
   	cf.waitForElement(complaintDetails);
   	cf.highlightElement(complaintDetails);
   	complaintDetails.sendKeys("test data");
       }
    
  
}
