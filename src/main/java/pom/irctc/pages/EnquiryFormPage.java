package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers{
	
	public EnquiryFormPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public EnquiryFormPage clickOnCloseSidebar() {
		clickByXpath(prop.getProperty("EnquiryFormPage.CloseSidebar.Xpath"));
		return new EnquiryFormPage(driver, test);
	}

	public EnquiryFormPage enterName(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Name.Xpath"), data);
		return this;
	}
	public EnquiryFormPage enterOrganization(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Organization.Xpath"), data);
		return this;
	}
	public EnquiryFormPage enterAddress(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Address.Xpath"), data);
		return this;
	}
	public EnquiryFormPage enterMobile(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Mobile.Xpath"), data);
		return this;
	}
	public EnquiryFormPage enterEmail(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Email.Xpath"), data);
		return this;
	}
	public EnquiryFormPage selectRequest(int value) {
		selectIndexByXpath(prop.getProperty("EnquiryFormPage.RequestFor.Xpath"), value);
		return this;
	}
	
	public EnquiryFormPage enterOriginStation(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.OriginStation.Xpath"), data);
		return this;
	}
	
	public EnquiryFormPage enterDestinationStation(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.DestinationStation.Xpath"), data);
		return this;
	}
	
	public EnquiryFormPage clickOnCheckInDate() {
		clickByXpath(prop.getProperty("EnquiryFormPage.CheckInDate.Xpath"));
		return this;
	}
	
	public EnquiryFormPage clickOnCheckInDateNext() {
		clickByXpath(prop.getProperty("EnquiryFormPage.CheckInDateNext.Xpath"));
		return this;
	}
	
	public EnquiryFormPage clickOnCheckInDateDate(String date) {
		String newXpath = replaceXpath(prop.getProperty("EnquiryFormPage.CheckInDateDate.Xpath"), date);
		clickByXpath(newXpath);
		return this;
	}
	
	public EnquiryFormPage clickOnCheckOutDate() {
		clickByXpath(prop.getProperty("EnquiryFormPage.CheckOutDate.Xpath"));
		return this;
	}
	
	public EnquiryFormPage clickOnCheckOutDateNext() {
		clickByXpath(prop.getProperty("EnquiryFormPage.CheckOutDateNext.Xpath"));
		return this;
	}
	
	public EnquiryFormPage clickOnCheckOutDateDate(String date) {
		String newXpath = replaceXpath(prop.getProperty("EnquiryFormPage.CheckOutDateDate.Xpath"), date);
		clickByXpath(newXpath);
		return this;
	}
	
	public EnquiryFormPage enterDurationOfTour(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Duration.Xpath"), data);
		return this;
	}
	
	public EnquiryFormPage enterNumberOfCoaches(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Coaches.Xpath"), data);
		return this;
	}
	
	public EnquiryFormPage enterNumberOfPassengers(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Passenger.Xpath"), data);
		return this;
	}
	
	public EnquiryFormPage enterCharterPurpose(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Purpose.Xpath"), data);
		return this;
	}
	public EnquiryFormPage enterServices(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Services.Xpath"), data);
		return this;
	}
	public EnquiryFormPage clickOnSubmit() {
		clickByXpath(prop.getProperty("EnquiryFormPage.Submit.Xpath"));
		return this;
	}
	public EnquiryFormPage verifyMobileNumberError(String text) {
		verifyTextByXpath(prop.getProperty("EnquiryFormPage.Error.Xpath"), text);
		return this;
	}
}
