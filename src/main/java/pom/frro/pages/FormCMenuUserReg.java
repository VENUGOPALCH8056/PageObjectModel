package pom.frro.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FormCMenuUserReg extends GenericWrappers{
	
	public FormCMenuUserReg(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public FormCUserRegistrationPage clickOnSignUp() {
		clickByXpath(prop.getProperty("FormCUserRegistrationPage.SignUp.Xpath"));
		return new FormCUserRegistrationPage(driver, test);
	}
}
