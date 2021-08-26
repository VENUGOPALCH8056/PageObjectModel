package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To verify whether the user is able to book hotels in irctc application";
		author="Venu";
		category="smoke";
		browserName="chrome";
		appName="irctc";
		sheetName="TC004";
	}
	
	@Test(dataProvider="fetchData")
	public void bookHotelsOtp(String destination,String inYear, String inMonth,String inDate,
			String outYear, String outMonth,String outDate,String noOfAdults,String email,String loginPassword,
			String title,String firstName, String lastName, String state,
			String gst, String xpath,String days,String verification) {
		
		int adults = Integer.parseInt(noOfAdults);
		int gender = Integer.parseInt(title);
		int gstCheck = Integer.parseInt(gst);
		
		
		new CovidAlertPage(driver, test)
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.moveControl()
		.clickOnHotels()
		.moveControlHotels()
		.enterHotelName(destination)
		.clickOnFirstOption()
		.clickOnCheckInDate()
		.clickOnCheckInDateYearDropdown()
		.clickOnCheckInDateYear(inYear)
		.clickOnCheckInDateMonth(inMonth)
		.clickOnCheckInDateDate(inDate)
		.clickOnCheckOutDate()
		.clickOnCheckOutDateYearDropdown()
		.clickOnCheckOutDateYear(outYear)
		.clickOnCheckOutDateMonth(outMonth)
		.clickOnCheckOutDateDate(outDate)
		.clickOnGuestsRooms()
		.selectNumberOfAdults(adults)
		.clickOnDone()
		.clickOnFindHotel()
		.clickOnFirstHotel()
		.moveControlHotelDetails()
		.getTextOfHotelName()
		.getTextOfHotelPrice()
		.clickOnContinueToBook()
		.clickOnGuestUserLogin()
		.waitTime()
		.enterUserName(email)
		.enterPassword(loginPassword)
		.clickOnLogin()
		.waitTime()
		.selectTitle(gender)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectState(state)
		.selectGst(gstCheck)
		.pageDown(xpath)
		.clickOnContinueGstNo()
		.waitTime()
		.verifyHotelName()
		.verifyHotelPrice(days)
		.waitTime()
		.clickOnAgree()
		.clickOnMakePayment()
		.waitTime()
		.clickOnVerify()
		.checkError(verification);
	}
}
