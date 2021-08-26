package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PassengerDetailPage extends GenericWrappers{

	public PassengerDetailPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public PassengerDetailPage waitTime() {
		waitTime(5000);
		return this;
	}


	public PassengerDetailPage selectTitle(int value) {
		selectIndexByXpath(prop.getProperty("PassengerDetailPage.Title.Xpath"), value);
		return this;
	}
	public PassengerDetailPage enterFirstName(String data){
		enterByXpath(prop.getProperty("PassengerDetailPage.FirstName.Xpath"), data);
		return this;
	}
	
	public PassengerDetailPage enterLastName(String data){
		enterByXpath(prop.getProperty("PassengerDetailPage.LastName.Xpath"), data);
		return this;
	}
	
	public PassengerDetailPage selectState(String data) {
		selectVisibleTextByXpath(prop.getProperty("PassengerDetailPage.State.Xpath"), data);
		return this;
	}
	
	public PassengerDetailPage selectGst(int value) {
		selectIndexByXpath(prop.getProperty("PassengerDetailPage.Gst.Xpath"), value);
		return this;
	}
	
	public PassengerDetailPage enterGstNumber(String data) {
		enterByXpath(prop.getProperty("PassengerDetailPage.GstNumber.Xpath"), data);
		return this;
	}
	
	public PassengerDetailPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("PassengerDetailPage.CompanyName.Xpath"), data);
		return this;
	}
	
	public PassengerDetailPage enterCompanyAddress(String data) {
		enterByXpath(prop.getProperty("PassengerDetailPage.CompanyAddress.Xpath"), data);
		return this;
	}
	
	public PassengerDetailPage pageDown(String xpath) {
		pageDownXpath(xpath);
		return this;
	}
	
	public SummaryPage clickOnContinueGstNo() {
		clickByXpath(prop.getProperty("SummaryPage.ContinueGstNo.Xpath"));
		return new SummaryPage(driver, test);
		}
	
	public PassengerDetailPage clickOnContinueGstYes() {
		clickByXpath(prop.getProperty("PassengerDetailPage.Continue.Xpath"));
		return this;
	}
	
	public PassengerDetailPage verifyError(String text) {
		verifyTextByXpath(prop.getProperty("PassengerDetailPage.Error.Xpath"), text);
		return this;
	}
	
	
	
}
