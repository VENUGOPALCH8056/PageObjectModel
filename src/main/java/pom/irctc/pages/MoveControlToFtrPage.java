package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class MoveControlToFtrPage extends GenericWrappers{

	public MoveControlToFtrPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FTRServicePage moveControl(){
		switchToLastWindow();
		return new FTRServicePage(driver, test);
	}

}
