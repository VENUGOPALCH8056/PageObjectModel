package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To verify whether the user is able to book saloon in IRCTC application";
		author="Venu";
		category="smoke";
		browserName="chrome";
		appName="irctc";
		sheetName="TC003";
	}
	
	@Test(dataProvider="fetchData")
	public void saloonCheck (String name,String organization,String address,String mobile,
			String email, String request, String originStation,String destnStation, String checkIn,String checkOut,
			String durationPeriod,String coachDetails,String numPassenger,String charterPurpose,
			String services, String verification) {
		
		int req = Integer.parseInt(request);
		
		new CovidAlertPage(driver, test)
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.moveControl()
		.clickOnSidebar()
		.clickOnCharter()
		.clickOnEnquiryForm()
		.clickOnCloseSidebar()
		.enterName(name)
		.enterOrganization(organization)
		.enterAddress(address)
		.enterMobile(mobile)
		.enterEmail(email)
		.selectRequest(req)
		.enterOriginStation(originStation)
		.enterDestinationStation(destnStation)
		.clickOnCheckInDate()
		.clickOnCheckInDateNext()
		.clickOnCheckInDateDate(checkIn)
		.clickOnCheckOutDate()
		.clickOnCheckOutDateNext()
		.clickOnCheckOutDateDate(checkOut)
		.enterDurationOfTour(durationPeriod)
		.enterNumberOfCoaches(coachDetails)
		.enterNumberOfPassengers(numPassenger)
		.enterCharterPurpose(charterPurpose)
		.enterServices(services)
		.clickOnSubmit()
		.verifyMobileNumberError(verification);
		
	}
}
