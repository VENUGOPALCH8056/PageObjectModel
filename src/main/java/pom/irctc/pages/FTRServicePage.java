package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FTRServicePage extends GenericWrappers{

	public FTRServicePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FTRServicePage moveControl(){
		switchToLastWindow();
		return new FTRServicePage(driver, test);
	}
	
	public FTRUserRegistrationPage clickOnSignUp() {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.SignUp.Xpath"));
		return new FTRUserRegistrationPage(driver, test);
	}
}