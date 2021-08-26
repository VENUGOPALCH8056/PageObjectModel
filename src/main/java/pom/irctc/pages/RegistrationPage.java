package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public RegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.UserName.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Password.Xpath"), data);
		return this;
	}
	 
	public RegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.Xpath"), data);
		return this;
	}
	
	public RegistrationPage clickOnPreferredLanguageDropdown() {
		clickByXpath(prop.getProperty("RegistrationPagePreferredLanguageDropdown.Xpath"));
		return this;
	}
		
	public RegistrationPage clickOnPreferredLanguage(String language) {
		String newXpath = replaceXpath(prop.getProperty("RegistrationPage.PreferredLanguage.Xpath"), language);
		clickByXpath(newXpath);
		return this;
	}
	
	public RegistrationPage clickOnSecurityQuestionDropdown() {
		clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestionDropdown.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnSecurityQuestion(String question) {
		String newXpath = replaceXpath(prop.getProperty("RegistrationPage.SecurityQuestion.Xpath"), question);
		clickByXpath(newXpath);
		return this;
	}
	
	public RegistrationPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.Xpath"), data);
		return this;
	}
	
	public PersonalDetailsPage clickOnContinue() {
		clickByXpath(prop.getProperty("RegistrationPage.Continue.Xpath"));
		return new PersonalDetailsPage(driver, test);
	}

}
