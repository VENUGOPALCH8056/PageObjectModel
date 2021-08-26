package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelsPage extends GenericWrappers{

	public HotelsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public HotelsPage waitTime(){
		waitTime(5000);
		return this;
	}

	
	public HotelsPage moveControlHotels(){
		switchToLastWindow();
		return this;
	}

	public HotelsPage enterHotelName(String data) {
		enterByXpath(prop.getProperty("HotelsPage.Name.Xpath"), data);
		return this;
	}
	
	public HotelsPage clickOnFirstOption() {
		clickByXpath(prop.getProperty("HotelsPage.FirstOption.Xpath"));
		return this;
	}
	
	public HotelsPage clickOnCheckInDate() {
		clickByXpath(prop.getProperty("HotelsPage.CheckInDate.Xpath"));
		return this;
	}
	
	public HotelsPage clickOnCheckInDateYearDropdown() {
		clickByXpath(prop.getProperty("HotelsPage.CheckInDateYearDropdown.Xpath"));
		return this;
	}
	
	public HotelsPage clickOnCheckInDateYear(String year) {
		String newXpath = replaceXpath(prop.getProperty("HotelsPage.CheckInDateYear.Xpath"), year);
		clickByXpath(newXpath);
		return this;
	}
	
	
	public HotelsPage clickOnCheckInDateMonth(String month) {
		String newXpath = replaceXpath(prop.getProperty("HotelsPage.CheckInDateMonth.Xpath"), month);
		clickByXpath(newXpath);
		return this;
	}
	
	public HotelsPage clickOnCheckInDateDate(String date) {
		String newXpath = replaceXpath(prop.getProperty("HotelsPage.CheckInDateDate.Xpath"), date);
		clickByXpath(newXpath);
		return this;
	}
	
	public HotelsPage clickOnCheckOutDate() {
		clickByXpath(prop.getProperty("HotelsPage.CheckOutDate.Xpath"));
		return this;
	}
	
	public HotelsPage clickOnCheckOutDateYearDropdown() {
		clickByXpath(prop.getProperty("HotelsPage.CheckOutDateYearDropdown.Xpath"));
		return this;
	}
	
	public HotelsPage clickOnCheckOutDateYear(String year) {
		String newXpath = replaceXpath(prop.getProperty("HotelsPage.CheckOutDateYear.Xpath"), year);
		clickByXpath(newXpath);
		return this;
	}
	
	
	public HotelsPage clickOnCheckOutDateMonth(String month) {
		String newXpath = replaceXpath(prop.getProperty("HotelsPage.CheckOutDateMonth.Xpath"), month);
		clickByXpath(newXpath);
		return this;
	}
	
	public HotelsPage clickOnCheckOutDateDate(String date) {
		String newXpath = replaceXpath(prop.getProperty("HotelsPage.CheckOutDateDate.Xpath"), date);
		clickByXpath(newXpath);
		return this;
	}
	
	public HotelsPage clickOnGuestsRooms() {
		clickByXpath(prop.getProperty("HotelsPage.Guest.Xpath"));
		return this;
	}
	
	public HotelsPage selectNumberOfAdults(int value) {
		selectIndexByXpath(prop.getProperty("HotelsPage.Adults.Xpath"), value);
		return this;
	}
	
	public HotelsPage clickOnDone() {
		clickByXpath(prop.getProperty("HotelsPage.Done.Xpath"));
		return this;
	}
	
	public HotelsListPage clickOnFindHotel() {
		clickByXpath(prop.getProperty("HotelsListPage.FindHotel.Xpath"));
		return new HotelsListPage(driver, test);
	}
}
