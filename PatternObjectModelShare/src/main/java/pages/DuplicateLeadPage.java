package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{
	
	public DuplicateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Duplicate Lead | opentaps CRM")) {
			throw new RuntimeException();
		}		
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLead;
	
	public ViewLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new ViewLeadPage(driver, test);
		
	}
	
	
	

}
