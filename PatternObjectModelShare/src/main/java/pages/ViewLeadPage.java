package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("View Lead | opentaps CRM")) {
			throw new RuntimeException();
		}		
	}
	
	@FindBy(how=How.XPATH,using="//span[@id='viewLead_companyName_sp']")
	private WebElement eleLeadId;
	
	public ViewLeadPage verifyLeadId() {
		getText(eleLeadId);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//span[@id='viewLead_companyName_sp']")
	private WebElement eleverifylead;
	
	public ViewLeadPage verifyLead() {
		getText(eleverifylead);
		return this;
		
	}
	
	@FindBy(how=How.LINK_TEXT, using = "Find Leads")
	private WebElement viewfindlead;
	
	public FindLeadPage viewFindLead() {
		click(viewfindlead);
		return new FindLeadPage(driver, test);
		
	}
	
	@FindBy(how=How.LINK_TEXT, using = "Duplicate Lead")
	private WebElement eleDuplicatelead;
	
	public DuplicateLeadPage clickDuplicateLead() {
		click(eleDuplicatelead);
		return new DuplicateLeadPage(driver, test);
		
	}
	
	@FindBy(how=How.ID, using = "viewLead_firstName_sp")
	private WebElement eleverifyfirstname;
	
	public ViewLeadPage verifyFirstName(String expectedText) {
		verifyExactText(eleverifyfirstname, expectedText);
		return this;
		
	}
	
	
	
	
	
	

}
