package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Helper.CommonFunctions;

public class SearchPatientPage extends TestBase {

    CommonFunctions cf;
    @FindBy(xpath = "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[1]/input")
    WebElement searchBox;

    @FindBy(xpath= "/html/body/app-root/app-layout/ng-sidebar-container/div/div/div/app-home-dashboard/div[1]/div/div[1]/div[3]/button")
    WebElement searchOpt;

    @FindBy(css = "li.clearfix")
    WebElement clickPatient;


	
    public SearchPatientPage() throws IOException {
	PageFactory.initElements(driver, this);
	cf = new CommonFunctions(driver);
    }

   

    public void searchPatient() {
	cf.waitForElement(searchBox);
	cf.highlightElement(searchBox);
	searchBox.sendKeys("Test");
	//doctorLoginLink.click();
    }
    
    public void clickOnSearchButton() {
  	cf.waitForElement(searchOpt);
  	cf.highlightElement(searchOpt);
  	cf.clickUsingJavaScript(searchOpt);
  	//doctorLoginLink.click();
      }
    
    public void clickPatient() {
   	cf.waitForElement(clickPatient);
   	cf.highlightElement(clickPatient);
   	cf.clickUsingJavaScript(clickPatient);
       }
    
  
}
