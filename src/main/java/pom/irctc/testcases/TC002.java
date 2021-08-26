package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To verify whether the user is able to book coach in IRCTC application";
		author="Venu";
		category="smoke";
		browserName="chrome";
		appName="irctc";
		sheetName="TC002";
	}
	
	@Test(dataProvider="fetchData")
	public void bookYourCoach(String userId,String password,String cnfPassword,String securityQstn,String secAnswer,
			String dateOfBirth,String date,String gender,String marital,String email,String occupation,String fname,String mname,String lname,String nationality,
			String flatNo,String street,String area,String country,String mobile,String pincode,String postOffice, String flatNoOffice,
			String streetOffice,String areaOffice,String countryOffice,String mobileOffice,String pincodeOffice,String postOfficeOffice) {
		
		int po = Integer.parseInt(postOffice);
		int poOff = Integer.parseInt(postOfficeOffice);
		
		new CovidAlertPage(driver, test)
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.moveControl()
		.clickOnSidebar()
		.clickOnBookYourCoach()
		.moveControl()
		.clickOnSignUp()
		.enterUserId(userId)
		.enterPassword(password)
		.enterConfirmPassword(cnfPassword)
		.selectSecurityQuestion(securityQstn)
		.enterSecurityAnswer(secAnswer)
		.enterDateOfBirth(dateOfBirth)
		.clickOnDate(date)
		.clickOnGender(gender)
		.clickOnMaritalStatus(marital)
		.enterEmail(email)
		.selectOccupation(occupation)
		.enterFirstName(fname)
		.enterMiddleName(mname)
		.enterLastName(lname)
		.selectNationality(nationality)
		.enterFlatOrDoorNumber(flatNo)
		.enterStreetNumber(street)
		.enterArea(area)
		.selectCountry(country)
		.enterMobileNumber(mobile)
		.enterPincode(pincode)
		.tab()
		.selectPostoffice(po)
		.clickOnNo()
		.enterOfficeFlatOrDoorNumber(flatNoOffice)
		.enterOfficeStreetName(streetOffice)
		.enterOfficeArea(areaOffice)
		.selectOfficeCountry(countryOffice)
		.enterOfficeMobileNumber(mobileOffice)
		.enterOfficePincode(pincodeOffice)
		.tabTwo()
		.selectPostOfficeOffice(poOff);
		
	}

}
