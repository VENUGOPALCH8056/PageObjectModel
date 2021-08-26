package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelsListPage extends GenericWrappers{

	public HotelsListPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public HotelDetailsPage clickOnFirstHotel() {
		clickByXpath(prop.getProperty("HotelDetailsPage.FirstHotel.Xpath"));
		return new HotelDetailsPage(driver, test);
	}
	
}
