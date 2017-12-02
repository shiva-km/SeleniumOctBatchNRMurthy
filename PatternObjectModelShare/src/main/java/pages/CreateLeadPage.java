package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Create Lead | opentaps CRM")) {
			throw new RuntimeException();
		}		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecompanyName;
	
	public CreateLeadPage enterCompanyName(String cName) {
		type(elecompanyName, cName);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLeadPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	public CreateLeadPage enterLastName(String lName) {
		type(eleLastName, lName);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	private WebElement eleSource;
	
	public CreateLeadPage chooseSource(String source) {
		selectDropDownUsingText(eleSource, source);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	private WebElement eleCompaign;
	
	public CreateLeadPage chooseCompaign(String compaign) {
		selectDropDownUsingIndex(eleCompaign, compaign);
		return this;
		
	}
	
		
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhone;
	
	public CreateLeadPage enterPhone(String phone) {
		type(elePhone, phone);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	
	public CreateLeadPage enterEmail(String email) {
		type(eleEmail, email);
		return this;
		
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleClickCreateLeadButton;
	public ViewLeadPage clickCreateLeadButton() {
		click(eleClickCreateLeadButton);
		return new ViewLeadPage(driver, test);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
