package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SummaryPage extends GenericWrappers{

	public SummaryPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public SummaryPage verifyHotelName() {
		verifyTextByXpath(prop.getProperty("PassengerDetailPage.VerifyHotelName.Xpath"), HotelDetailsPage.hotelName);
		return this;
	}
	
	public SummaryPage  verifyHotelPrice(String days) {
		String hotelPrice = HotelDetailsPage.hotelPrice;
		String price = hotelPrice.substring(2,hotelPrice.length());
		Integer pri = Integer.parseInt(price);
		Integer day = Integer.parseInt(days);
		int finalPrice = (int) ((int)(pri*day)+(pri*day*0.12));
		String finalHotelPrice;
		finalHotelPrice = Integer.toString(finalPrice);
		verifyTextByXpath(prop.getProperty("PassengerDetailPage.VerifyHotelPrice.Xpath"), finalHotelPrice);
		return this;
	}	
 
	public SummaryPage waitTime() {
		waitTime(5000);
		return this;
	}
	
	public SummaryPage clickOnAgree() {
	 clickByXpath(prop.getProperty("SummaryPage.Agree.Xpath"));
	 return this;
	}
 
	public OtpPage clickOnMakePayment() {
	 clickByXpath(prop.getProperty("OtpPage.MakePayment.Xpath"));
	 return new OtpPage(driver, test);
	}
}
