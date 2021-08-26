package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;



public class AccommodationPage extends GenericWrappers{

	public AccommodationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public AccommodationPage clickOnSidebar() {
		clickByXpath(prop.getProperty("AccommodationPage.Sidebar.Xpath"));
		return this;
	}
	
	public FTRServicePage clickOnBookYourCoach() {
		clickByXpath(prop.getProperty("AccommodationPage.BookYourCoach.Xpath"));
		return new FTRServicePage(driver, test);
	}
	
	public CharterPage clickOnCharter() {
		clickByXpath(prop.getProperty("CharterPage.Charter.Xpath"));
		return new CharterPage(driver, test);
	}	
	public HotelsPage clickOnHotels() {
		clickByXpath(prop.getProperty("HotelsPage.Hotels.Xpath"));
		return new HotelsPage(driver, test);	
	}
	
	public MoveControlToHotelsPage moveControlHotels(){
		switchToLastWindow();
		return new MoveControlToHotelsPage(driver, test);
	}
	
}
