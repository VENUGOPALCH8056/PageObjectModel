package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers{

	public SignUpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	
	public SignUpPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("SignUpPage.FirstName.Xpath"), data);
		return this;
	}
	public SignUpPage enterSurname(String data) {
		enterByXpath(prop.getProperty("SignUpPage.LastName.Xpath"), data);
		return this;
	}
	public SignUpPage enterEmailAddress(String data) {
		enterByXpath(prop.getProperty("SignUpPage.EmailAddress.Xpath"), data);
		return this;
	}
	
	public SignUpPage reEnterEmailAddress(String data) {
		enterByXpath(prop.getProperty("SignUpPage.ReEnterEmail.Xpath"), data);
		return this;
	}
	
	public SignUpPage enterPassword(String data) {
		enterByXpath(prop.getProperty("SignUpPage.Password.Xpath"), data);
		return this;
	}
	
	public SignUpPage selectDate(String data) {
		selectVisibleTextByXpath(prop.getProperty("SignUpPage.DobDay.Xpath"), data);
		return this;
	}
	
	public SignUpPage selectMonth(String data) {
		selectVisibleTextByXpath(prop.getProperty("SignUpPage.DobMonth.Xpath"), data);
		return this;
	}
	
	public SignUpPage selectYear(String data) {
		selectVisibleTextByXpath(prop.getProperty("SignUpPage.DobYear.Xpath"), data);
		return this;
	}
	
	public SignUpPage clickOnGender(String gender) {
		String newXpath = replaceXpath(prop.getProperty("SignUpPage.Gender.Xpath"), gender);
		clickByXpath(newXpath);
		return this;
	}
}
