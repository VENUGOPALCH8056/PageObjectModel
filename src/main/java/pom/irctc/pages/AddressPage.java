package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AddressPage extends GenericWrappers{
	
	public AddressPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public AddressPage enterDoorNo(String data) {
		enterByXpath(prop.getProperty("AddressPage.DoorNo.Xpath"), data);
		return this;
	}
	
	public AddressPage enterStreet(String data) {
		enterByXpath(prop.getProperty("AddressPage.Street.Xpath"), data);
		return this;
	}
	
	public AddressPage enterArea(String data) {
		enterByXpath(prop.getProperty("AddressPage.Area.Xpath"), data);
		return this;
	}
	
	public AddressPage enterPinCode(String data) {
		enterByXpath(prop.getProperty("AddressPage.PinCode.Xpath"), data);
		return this;
	}
	
	public AddressPage clickOnState() {
		clickByXpath(prop.getProperty("AddressPage.State.Xpath"));
		return this;
	}
	
	public AddressPage waitTime() {
		waitTime(5000);
		return this;
	}
	
	public AddressPage selectCity(int value) {
		selectIndexByXpath(prop.getProperty("AddressPage.City.Xpath"), value);
		return this;
	}
	
	public AddressPage selectPostOffice(int value) {
		selectIndexByXpath(prop.getProperty("AddressPage.PostOffice.Xpath"), value);
		return this;
	}
	
	public AddressPage enterPhone(String data) {
		enterByXpath(prop.getProperty("AddressPage.Phone.Xpath"), data);
		return this;
	}
	
	public AddressPage clickNo() {
		clickByXpath(prop.getProperty("AddressPage.No.Xpath"));
		return this;
	}
	
	public AddressPage enterOfficeDoorNo(String data) {
		enterByXpath(prop.getProperty("AddressPage.OfficeDoorNumber.XPath"), data);
		return this;
	}
	
	public AddressPage enterOfficeStreet(String data) {
		enterByXpath(prop.getProperty("AddressPage.OfficeStreet.Xpath"), data);
		return this;
	}
	
	public AddressPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("AddressPage.OfficeArea.Xpath"), data);
		return this;
	}
	
	public AddressPage clickOnCountryDropdown() {
		clickByXpath(prop.getProperty("AddressPage.CountryDropdown.Xpath"));
		return this;
	}
	
	public AddressPage clickOnCountry(String country) {
		String newXpath = replaceXpath(prop.getProperty("AddressPage.Country.Xpath"), country);
		clickByXpath(newXpath);
		return this;
	}
	
	public AddressPage enterOfficePinCode(String data) {
		enterByXpath(prop.getProperty("AddressPage.OfficePinCode.Xpath"), data);
		return this;
	}
	
	public AddressPage clickOnOffifceState(String data) {
		enterByXpath(prop.getProperty("AddressPage.OffifceState.Xpath"), data);
		//clickByXpath(prop.getProperty("AddressPage.OffifceState.Xpath"));
		return this;
	}
	
	public AddressPage selectOfficeCity(String data) {
		enterByXpath(prop.getProperty("AddressPage.OfficeCity.Xpath"), data);
		//selectIndexByXpath(prop.getProperty("AddressPage.OfficeCity.Xpath"), value);
		return this;
	}
	
	public AddressPage selectOfficePostOffice(String data) {
		enterByXpath(prop.getProperty("AddressPage.OfficePostOffice.Xpath"), data);
		//selectIndexByXpath(prop.getProperty("AddressPage.OfficePostOffice.Xpath"), value);
		return this;
	}
	
	public AddressPage enterOfficePhone(String data) {
		enterByXpath(prop.getProperty("AddressPage.OfficePhone.Xpath"), data);
		return this;
	}
	
}
