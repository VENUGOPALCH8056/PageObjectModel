package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class OtpPage extends GenericWrappers{

	public OtpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public OtpPage waitTime() {
		waitTime(5000);
		return this;
	}
	
	public OtpPage clickOnVerify() {
		clickByXpath(prop.getProperty("OtpPage.Verify.Xpath"));
		return this;
	}
	
	public OtpPage checkError(String text) {
		verifyTextByXpath(prop.getProperty("OtpPage.Error.Xpath"), text);
		return this;
	}
}
