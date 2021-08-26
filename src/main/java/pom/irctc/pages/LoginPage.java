package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers{

	public LoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public GuestUserLoginPage clickOnGuestUserLogin() {
		clickByXpath(prop.getProperty("GuestUserLoginPage.GuestUser.Xpath"));
		return new GuestUserLoginPage(driver, test);
	}

}
