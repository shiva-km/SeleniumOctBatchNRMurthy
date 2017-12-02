package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DuplicateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC005_DuplicateLead";
		testCaseName = "TC005_DuplicateLead";
		testDescription = "To Duplicate Lead";
		category= "Regression";
		authors	="Shiva";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void mergeLead(String userName, String passWord, String emailId) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrm()
		.clickLeads()
		.clickFindLead()
		.clickEmail()
		.enterEmail(emailId)
		.clickFindLeadButton()
		.captureFirstResLead()
		.clickFirstResLead()
		.clickDuplicateLead()
		.clickCreateLead()
		.verifyFirstName(captureFirstName);
		
		
	}

}
