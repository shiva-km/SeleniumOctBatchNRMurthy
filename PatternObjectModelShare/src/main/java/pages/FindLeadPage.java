package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{
	
	public FindLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Find Leads | opentaps CRM")) {
			throw new RuntimeException();
		}		
	}
	
	@FindBy(how=How.NAME,using="id")
	private WebElement eleFindLeadId;
	
	public FindLeadPage findLeadId(String leadid) {
		type(eleFindLeadId, leadid);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmail;
	
	public FindLeadPage clickEmail() {
		click(eleEmail);
		return this;
		
	}
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleEnterEmail;
	
	public FindLeadPage enterEmail(String emailid) {
		type(eleEnterEmail, emailid);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLead;
	
	public FindLeadPage clickFindLeadButton() throws InterruptedException {
		clickWithNoSnap(eleFindLead);
		Thread.sleep(5000);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
	private WebElement eleCaptureFirstResLead;
	
	public FindLeadPage captureFirstResLead() {
		captureFirstName = getText(eleCaptureFirstResLead);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
	private WebElement eleClickFirstResLead;
	
	public ViewLeadPage clickFirstResLead() {
		clickWithNoSnap(eleClickFirstResLead);
		return new ViewLeadPage(driver, test);
		
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement eleVerifyErrMessage;
	
	public FindLeadPage verifyErrMessage(String expectedtext) {
		verifyExactText(eleVerifyErrMessage, expectedtext);
		return this;	
		
	}
	
	
	

}
