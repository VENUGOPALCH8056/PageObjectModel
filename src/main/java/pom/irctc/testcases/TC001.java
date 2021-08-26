package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;


public class TC001 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify whether the user is able to register in IRCTC application";
		author="Venu";
		category="smoke";
		browserName="chrome";
		appName="irctc";
		sheetName="TC001";
	}
	
	
	@Test(dataProvider="fetchData")
	public void irctcRegistration(String userName,String usrPwd,String cnfUsrPwd,String language, String secQue,
			String secAns,String firstName,String middleName,String lastname,String occupation,String dob,String marital,
			String nationality,String gender,String email,String mobile,String country,String resAddress1,String resAddress2,
			String resAddress3,String resPinCode,String resCity,String postOffice,String resPhone,String offAddress1,
			String offAddress2,String offAddress3,String offPinCode,String OffState,String offCity,
			String offPostOff, String offPhone) {
		
		int city = Integer.parseInt(resCity);
		int po = Integer.parseInt(postOffice);
		
		
		new CovidAlertPage(driver, test)
		.clickOnOK()
		.clickOnRegister()
		.enterUserName(userName)
		.enterPassword(usrPwd)
		.enterConfirmPassword(cnfUsrPwd)
		.clickOnPreferredLanguageDropdown()
		.clickOnPreferredLanguage(language)
		.clickOnSecurityQuestionDropdown()
		.clickOnSecurityQuestion(secQue)
		.enterSecurityAnswer(secAns)
		.clickOnContinue()
		.enterFirstName(firstName)
		.enterMiddleName(middleName)
		.enterLastName(lastname)
		.clickOccupationDropdown()
		.clickOccupation(occupation)
		.enterDob(dob)
		.clickOnMaritalStatus(marital)
		.selectCountry(nationality)
		.clickOnGender(gender)
		.enterEmail(email)
		.enterMobile(mobile)
		.selectNationality(country)
		.clickOnOkay()
		.enterDoorNo(resAddress1)
		.enterStreet(resAddress2)
		.enterArea(resAddress3)
		.enterPinCode(resPinCode)
		.clickOnState()
		.waitTime()
		.selectCity(city)
		.waitTime()
		.selectPostOffice(po)
		.enterPhone(resPhone)
		.clickNo()
		.enterOfficeDoorNo(offAddress1)
		.enterOfficeStreet(offAddress2)
		.enterOfficeArea(offAddress3)
		.clickOnCountryDropdown()
		.clickOnCountry(country)
		.enterOfficePinCode(offPinCode)
		.clickOnOffifceState(OffState)
		.selectOfficeCity(offCity)
		.selectOfficePostOffice(offPostOff)
		.enterOfficePhone(offPhone)
		;
		
	}

}
