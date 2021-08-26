package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoginOrSignUpPage extends GenericWrappers{

	
	public LoginOrSignUpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public LoginOrSignUpPage clickOnEnglish() {
		
		clickByXpath(prop.getProperty("LogInOrSignUpPage.English.Xpath"));
		
		return this;
	}
	
	public SignUpPage clickOnCreateNewAccount() {
		
		clickByXpath(prop.getProperty("LogInOrSignUpPage.CreateNewAccount.Xpath"));
		
		return new SignUpPage(driver,test);
		
	}
}
