package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("My Leads | opentaps CRM")) {
			throw new RuntimeException();
		}		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleClickCreateLead;
	public CreateLeadPage clickCreateLead() {
		click(eleClickCreateLead);
		return new CreateLeadPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleClickMergeLead;
	public MergeLeadPage clickMergeLead() {
		click(eleClickMergeLead);
		return new MergeLeadPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleClickFindLead;
	public FindLeadPage clickFindLead() {
		click(eleClickFindLead);
		return new FindLeadPage(driver, test);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
