package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class MoveControlToHotelsPage extends GenericWrappers{
	
	public MoveControlToHotelsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

}
