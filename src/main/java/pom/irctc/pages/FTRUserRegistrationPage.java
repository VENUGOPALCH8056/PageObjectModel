package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FTRUserRegistrationPage extends GenericWrappers{

	public FTRUserRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public FTRUserRegistrationPage enterUserId(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.UserId.Xpath"), data);
		return this;
	}
	public FTRUserRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Password.Xpath"), data);
		return this;
	}
	public FTRUserRegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.ConfirmPassword.Xpath"), data);
		return this;
	}
	public FTRUserRegistrationPage selectSecurityQuestion(String data) {
		selectVisibleTextByXpath(prop.getProperty("FTRUserRegistrationPage.SecurityQuestion.Xpath"), data);
		return this;
		
	}
	public FTRUserRegistrationPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.SecurityAnswer.Xpath"), data);
		return this;
	}
	public FTRUserRegistrationPage enterDateOfBirth(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.DateOfBirth.Xpath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage clickOnDate(String date) {
		String newXpath = replaceXpath(prop.getProperty("FTRUserRegistrationPage.Date.Xpath"), date);
		clickByXpath(newXpath);
		return this;
	}
	
	public FTRUserRegistrationPage clickOnGender(String gender) {
		String newXpath = replaceXpath(prop.getProperty("FTRUserRegistrationPage.Gender.Xpath"), gender);
		clickByXpath(newXpath);
		return this;
	}
	public FTRUserRegistrationPage clickOnMaritalStatus(String marital) {
		String newXpath = replaceXpath(prop.getProperty("FTRUserRegistrationPage.MaritalStatus.Xpath"), marital);
		clickByXpath(newXpath);
		return this;
	}
	public FTRUserRegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Email.Xpath"), data);
		return this;
	}
	public FTRUserRegistrationPage selectOccupation(String value) {
		selectVisibleTextByXpath(prop.getProperty("FTRUserRegistrationPage.Occupation.Xpath"), value);
		return this;
	}
	public FTRUserRegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.FirstName.Xpath"), data);
		return this;
	}
	public FTRUserRegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.MiddleName.Xpath"), data);
		return this;
	}
	public FTRUserRegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.LastName.Xpath"), data);
		return this;
	}	
	public FTRUserRegistrationPage selectNationality(String value) {
		selectVisibleTextByXpath(prop.getProperty("FTRUserRegistrationPage.Nationality.Xpath"), value);
		return this;
	}
	public FTRUserRegistrationPage enterFlatOrDoorNumber(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.DoorNumber.Xpath"), data);
		return this;
	}
	public FTRUserRegistrationPage enterStreetNumber(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.StreetNumber.Xpath"), data);
		return this;
	}
	public FTRUserRegistrationPage enterArea(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Area.Xpath"), data);
		return this;
	}
	public FTRUserRegistrationPage selectCountry(String value) {
		selectVisibleTextByXpath(prop.getProperty("FTRUserRegistrationPage.Country.Xpath"), value);
		return this;
	}
	public FTRUserRegistrationPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Mobile.Xpath"), data);
		return this;
	}
	public FTRUserRegistrationPage enterPincode(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Pincode.Xpath"), data);
		return this;
	}
	public FTRUserRegistrationPage tab() {
		tab(prop.getProperty("FTRUserRegistrationPage.Tab.Xpath"));
		return this;
	}
	public FTRUserRegistrationPage selectPostoffice(int value) {
		selectIndexByXpath(prop.getProperty("FTRUserRegistrationPage.PostOffice.Xpath"), value);
		return this;
	}
	public FTRUserRegistrationPage clickOnNo() {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.No.Xpath"));
		return this;
	}
	public FTRUserRegistrationPage enterOfficeFlatOrDoorNumber(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.FlatNoOffice.Xpath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterOfficeStreetName(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.StreetOffice.Xpath"), data);
		return this;
	}
	public FTRUserRegistrationPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.AreaOffice.Xpath"), data);
		return this;
	}
	public FTRUserRegistrationPage selectOfficeCountry(String value) {
		selectVisibleTextByXpath(prop.getProperty("FTRUserRegistrationPage.countryOffice.Xpath"), value);
		return this;
	}
	public FTRUserRegistrationPage enterOfficeMobileNumber(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.MobileOffice.Xpath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterOfficePincode(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.PincodeOffice.Xpath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage tabTwo() {
		tab(prop.getProperty("FTRUserRegistrationPage.TabTwo.Xpath"));
		return this;
	}
	
	public FTRUserRegistrationPage selectPostOfficeOffice(int value) {
		selectIndexByXpath(prop.getProperty("FTRUserRegistrationPage.PostOfficeOffice.Xpath"), value);
		return this;
	}
	

}
