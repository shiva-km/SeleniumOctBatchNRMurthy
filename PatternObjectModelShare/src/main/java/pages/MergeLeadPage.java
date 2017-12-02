package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Merge Leads | opentaps CRM")) {
			throw new RuntimeException();
		}		
	}
	
	@FindBy(how=How.XPATH,using="//img[@alt='Lookup']")
	private WebElement eleIconFromLead;
	
	public LookUpLeadPage iconFromLead() {
		clickWithNoSnap(eleIconFromLead);
		switchToWindow(1);
		return new LookUpLeadPage(driver, test);
		
	}
	
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement eleIconToLead;
	
	public LookUpLeadPage iconToLead() {
		clickWithNoSnap(eleIconToLead);
		switchToWindow(1);
		return new LookUpLeadPage(driver, test);
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMerge;
	
	public ViewLeadPage mergeButton() {
		clickWithNoSnap(eleMerge);
		acceptAlert();
		return new ViewLeadPage(driver, test);
		
	}
	
	
	
	
	
	
	

}
