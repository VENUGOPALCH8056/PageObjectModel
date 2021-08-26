package pom.phptravelsregistration.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravelsregistation.pages.PhpHomePage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To verify whether the user is able to register in phptravels application";
		author="Venu";
		category="smoke";
		browserName="chrome";
		appName="phptravels";
		sheetName="TC008";
	} 
	
	@Test(dataProvider="fetchData")
	public void phpTravelsRegistration(String inputFirstName,String inputLastName,String countryName  ,String inputEmail,
			String inputPhone,String inputCompanyName,String address1,
			String address2,String inputCity,String stateinput,
			String inputPostcode,String country,String mobileNumber,String password, String comfirmPassword, String mailing) {
		
		
		new PhpHomePage(driver, test)
		.clickOnRegister()
		.enterFirstName(inputFirstName)
		.enterLastName(inputLastName)
		.enterEmailId(inputEmail)
		.clickOnCountryDropdown()
		.clickOnCountry(countryName)
		.enterPhoneNumber(inputPhone)
		.enterCompanyName(inputCompanyName)
		.enterStreetAddress(address1)
		.enterStreetAddress2(address2)
		.enterCity(inputCity)
		.enterState(stateinput)
		.enterPostal(inputPostcode)
		.selectCountry(country)
		.enterMobile(mobileNumber)
		.enterPassword(password)
		.enterConfirmPassword(comfirmPassword)
		.clickOnYesOrNo(mailing)
		;
	}
}
