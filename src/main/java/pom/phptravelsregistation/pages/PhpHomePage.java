package pom.phptravelsregistation.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhpHomePage extends GenericWrappers{
	
	public PhpHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

public PhpRegistrationPage  clickOnRegister() {
		clickByXpath(prop.getProperty("PhpRegistrationPage.Register.Xpath"));
		return new PhpRegistrationPage(driver, test);
		
	}
	
}
