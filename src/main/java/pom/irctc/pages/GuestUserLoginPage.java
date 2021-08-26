package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class GuestUserLoginPage extends GenericWrappers {
	
	public GuestUserLoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public GuestUserLoginPage waitTime() {
		waitTime(5000);
		return this;
	}
	
	public GuestUserLoginPage enterUserName(String data) {
		enterByXpath(prop.getProperty("GuestUserLoginPage.Email.Xpath"), data);
		return this;
	}
	
	public GuestUserLoginPage enterPassword(String data) {
		enterByXpath(prop.getProperty("GuestUserLoginPage.Mobile.Xpath"), data);
		return this;
	}
	
	public PassengerDetailPage clickOnLogin() {
		clickByXpath(prop.getProperty("PassengerDetailPage.Login.Xpath"));
		return new PassengerDetailPage(driver, test);
	}
}
