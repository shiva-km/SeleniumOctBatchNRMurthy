package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003_CreateLead";
		testCaseName = "TC003_CreateLead";
		testDescription = "To Create New Lead";
		category= "Regression";
		authors	="Shiva and Vinoth";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord, String cName, String fName, String lName, String source, String compaign, String phone, String email) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrm()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.chooseSource(source)
		.chooseCompaign(compaign)
		.enterPhone(phone)
		.enterEmail(email)
		.clickCreateLeadButton()
		.verifyLeadId();	
		
		
	}

}
