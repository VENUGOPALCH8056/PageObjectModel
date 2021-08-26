package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelDetailsPage extends GenericWrappers{
	
	public static String hotelName;
	public static String hotelPrice;
	
	
	public HotelDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public HotelDetailsPage moveControlHotelDetails(){
		switchToLastWindow();
		return this;
	}
	
	public HotelDetailsPage waitTime() {
		waitTime(5000);
		return this;
	}

	public HotelDetailsPage getTextOfHotelName() {
		hotelName = getTextByXpath(prop.getProperty("HotelDetailsPage.HotelName.Xpath"));
		return this;
	}
	
	public HotelDetailsPage getTextOfHotelPrice() {
		hotelPrice = getTextByXpath(prop.getProperty("HotelDetailsPage.HotelPrice.Xpath"));
		return this;
	}

	public LoginPage clickOnContinueToBook() {
		clickByXpath(prop.getProperty("LoginPage.ContinueToBook,Xpath"));
		return new LoginPage(driver, test);
	}
}
