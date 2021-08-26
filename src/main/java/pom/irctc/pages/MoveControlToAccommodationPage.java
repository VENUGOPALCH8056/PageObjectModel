package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class MoveControlToAccommodationPage extends GenericWrappers {

	public MoveControlToAccommodationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public AccommodationPage moveControl(){
		switchToLastWindow();
		return new AccommodationPage(driver, test);
	}
}
