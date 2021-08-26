package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{

	public CharterPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public EnquiryFormPage clickOnEnquiryForm() {
		clickByXpath(prop.getProperty("EnquiryFormPage.EnquiryForm.Xpath"));
		return new EnquiryFormPage(driver, test);
	}
	
}
