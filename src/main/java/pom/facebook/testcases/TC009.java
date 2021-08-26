package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.LoginOrSignUpPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{

	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To verify whether the user is able to register in facebook application";
		author="Venu";
		category="smoke";
		browserName="chrome";
		appName="facebook";
		sheetName="TC009";
	}
	
	@Test(dataProvider="fetchData")
	public void facebook(String firstname,String lastname,String regemail,String regemailconfirmation,String password, String date ,String month, String year , String gender) {
		
		
		new LoginOrSignUpPage(driver, test)
		.clickOnEnglish()
		.clickOnCreateNewAccount()
		.enterFirstName(firstname)
		.enterSurname(lastname)
		.enterEmailAddress(regemail)
		.reEnterEmailAddress(regemailconfirmation)
		.enterPassword(password)
		.selectDate(date)
		.selectMonth(month)
		.selectYear(year)
		.clickOnGender(gender);
	}
}
