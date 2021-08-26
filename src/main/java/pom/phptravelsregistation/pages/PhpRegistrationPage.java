package pom.phptravelsregistation.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

	public class PhpRegistrationPage extends GenericWrappers{
		
	
	public PhpRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
			this.driver=driver;
			this.test=test;
		}
		
		
	public PhpRegistrationPage enterFirstName(String data) {
			enterByXpath(prop.getProperty("PhpRegistrationPage.FirstName.Xpath"), data);
			return this;
		}	
		
	public PhpRegistrationPage enterLastName(String data) {
			enterByXpath(prop.getProperty("PhpRegistrationPage.LastName.Xpath"), data);
			return this;
		}		
	
	public PhpRegistrationPage enterEmailId(String data) {
			enterByXpath(prop.getProperty("PhpRegistrationPage.Email.Xpath"), data);
			return this;
		}
	
	public PhpRegistrationPage clickOnCountryDropdown() {
		clickByXpath(prop.getProperty("PhpRegistrationPage.CountryDropdown.Xpath"));
		return this;
		}
	
	public PhpRegistrationPage clickOnCountry(String country) {
		String newXpath = replaceXpath(prop.getProperty("PhpRegistrationPage.CountryCode.Xpath"), country);
		clickByXpath(newXpath);
		return this;
		}

	public PhpRegistrationPage enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("PhpRegistrationPage.Phone.Xpath"), data);
		return this;
		}

	public PhpRegistrationPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("PhpRegistrationPage.CompanyName.Xpath"), data);
		return this;
		}

	public PhpRegistrationPage enterStreetAddress(String data) {
		enterByXpath(prop.getProperty("PhpRegistrationPage.StreetAddress.Xpath"), data);
		return this;
		}

	public PhpRegistrationPage enterStreetAddress2(String data) {
		enterByXpath(prop.getProperty("PhpRegistrationPage.StreetAddress2.Xpath"), data);
		return this;
		}

	public PhpRegistrationPage enterCity(String data) {
		enterByXpath(prop.getProperty("PhpRegistrationPage.City.Xpath"), data);
		return this;
		}

	public PhpRegistrationPage enterState(String data) {
		enterByXpath(prop.getProperty("PhpRegistrationPage.State.Xpath"), data);
		return this;
		}

	public PhpRegistrationPage enterPostal(String data) {
		enterByXpath(prop.getProperty("PhpRegistrationPage.Postcode.Xpath"), data);
		return this;
		}
	
	public PhpRegistrationPage selectCountry(String value) {
		selectVisibleTextByXpath(prop.getProperty("PhpRegistrationPage.Country.Xpath"), value);
		return this;
		}

	public PhpRegistrationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("PhpRegistrationPage.Mobile.Xpath"), data);
		return this;
		}

	public PhpRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("PhpRegistrationPage.Password.Xpath"), data);
		return this;
		}
	
	public PhpRegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("PhpRegistrationPage.ConfirmPassword.Xpath"), data);
		return this;
		}

	public PhpRegistrationPage clickOnYesOrNo(String data) {
		String newXpath = replaceXpath(prop.getProperty("PhpRegistrationPage.YesOrNo.Xpath"), data);
		clickByXpath(newXpath);
		return this;
		}

}
