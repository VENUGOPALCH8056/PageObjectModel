package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PersonalDetailsPage extends GenericWrappers{
	
	public PersonalDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public PersonalDetailsPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.FirstName.Xpath"), data);
		return this;
	}
	
	public PersonalDetailsPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.MiddleName.Xpath"), data);
		return this;
	}
	
	public PersonalDetailsPage enterLastName(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.LastName.Xpath"), data);
		return this;
	}
	
	public PersonalDetailsPage clickOccupationDropdown() {
		clickByXpath(prop.getProperty("PersonalDetailsPage.OccupationDropdown.Xpath"));
		return this;
	}
	
	public PersonalDetailsPage clickOccupation(String occupation) {
		String newXpath = replaceXpath(prop.getProperty("PersonalDetailsPage.Occupation.Xpath"), occupation);
		clickByXpath(newXpath);
		return this;
	}
	
	public PersonalDetailsPage enterDob(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.Dob.Xpath"), data);
		return this; 
	}

	public PersonalDetailsPage clickOnMaritalStatus(String marital) {
		String newXpath = replaceXpath(prop.getProperty("PersonalDetailsPage.MaritalStatus.Xpath"), marital);
		clickByXpath(newXpath);
		return this;
	}
	
	public PersonalDetailsPage selectCountry(String value) {
		selectVisibleTextByXpath(prop.getProperty("PersonalDetailsPage.Country.Xpath"), value);
		return this;
	}
	
	public PersonalDetailsPage clickOnGender(String gender) {
		String newXpath = replaceXpath(prop.getProperty("PersonalDetailsPage.Gender.Xpath"), gender);
		clickByXpath(newXpath);
		return this;
	}
	
	public PersonalDetailsPage enterEmail(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.Email.Xpath"), data);
		return this;
	}
	
	public PersonalDetailsPage enterMobile(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsPage.Mobile.Xpath"), data);
		return this;
	}	
	public PersonalDetailsPage selectNationality(String value) {
		selectVisibleTextByXpath(prop.getProperty("PersonalDetailsPage.Nationality.Xpath"), value);
		return this;
	}
	
	public AddressPage clickOnOkay() {
		clickByXpath(prop.getProperty("AddressPage.Okay.Xpath"));
		return new AddressPage(driver, test);
	}
	
}
