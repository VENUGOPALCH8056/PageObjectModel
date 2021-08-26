package pom.newpanapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PanApplicationPage extends GenericWrappers{
	
	public PanApplicationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public PanApplicationPage selectTitle(String value) {
		selectVisibleTextByXpath(prop.getProperty("PanApplicationPage.Title.Xpath"), value);
		return this;
		}
	public PanApplicationPage enterPanFirstname(String data) {
		enterByXpath(prop.getProperty("PanApplicationPage.FirstName.Xpath"), data);
		return this;
		}
	public PanApplicationPage enterPanMiddlename(String data) {
		enterByXpath(prop.getProperty("PanApplicationPage.MiddleName.Xpath"), data);
		return this;
		}
	public PanApplicationPage enterPanLastname(String data) {
		enterByXpath(prop.getProperty("PanApplicationPage.LastName.Xpath"), data);
		return this;
		}
	public PanApplicationPage enterFatherFirstname(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.FatherFirstName.Xpath"), data);
		   return this;
	}

	public PanApplicationPage enterFatherMiddlename(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.FatherMiddleName.Xpath"), data);
		   return this;
	}

	public PanApplicationPage enterFatherLastname(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.FatherLastName.Xpath"), data);
		   return this;
	}
	public PanApplicationPage enterMobileNumber(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.MobileNumber.Xpath"),data);
		   return this;
	}
	public PanApplicationPage enterEmail(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.Email.Xpath"),data);
		   return this;
	}

	public PanApplicationPage selectSourceofIncome(String data) {
		   selectVisibleTextByXpath(prop.getProperty("PanApplicationPage.SourceOfIncome.Xpath"), data);
		   return this;
	}

	public PanApplicationPage clickOnAddressofCommunication()
	{
		clickByXpath(prop.getProperty("PanApplicationPage.AddressOfCommunication.Xpath"));
		return this;
	}

	public PanApplicationPage enterDateofBirth(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.Dob.Xpath"), data);
		   return this;
	}
	
	public PanApplicationPage pageDown(String xpath) {
			pageDownXpath(xpath);
			return this;
	}

	public PanApplicationPage enterResidentHouseNumber(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.ResidentHouseNumber.Xpath"), data);
		   return this;
	}

	public PanApplicationPage enterResidentStreet(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.ResidentStreet.Xpath"), data);
		   return this;
	}

	public PanApplicationPage enterResiddentTown(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.City.Xpath"), data);
		   return this;
	}
	public PanApplicationPage selectState(String Value) {
		   selectVisibleTextByXpath(prop.getProperty("PanApplicationPage.State.Xpath"), Value);
		   return this;
	}
	public PanApplicationPage enterPincode(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.Pincode.Xpath"), data);
		   return this;
	}
	
	public PanApplicationPage enterOfficeName(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.OfficeName.Xpath"), data);
		   return this;
	}


	public PanApplicationPage enterOfficeHouse(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.OfficeHouse.Xpath"), data);
		   return this;
	}
	public PanApplicationPage enterOfficeArea(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.OfficeArea.Xpath"), data);
		   return this;
	}

	public PanApplicationPage enterOfficeCity(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.OfficeCity.Xpath"), data);
		   return this;
	}
		   
	public PanApplicationPage selectOfficeState(String Value) {
			   selectVisibleTextByXpath(prop.getProperty("PanApplicationPage.OfficeState.Xpath"), Value);
			   return this;
	}
	
	public PanApplicationPage enterOfficePincode(String data) {
		   enterByXpath(prop.getProperty("PanApplicationPage.OfficePincode.Xpath"), data);
		   return this;
	}
	
	public PanApplicationPage selectIdentityProof(String data) {
		   selectVisibleTextByXpath(prop.getProperty("PanApplicationPage.IdentityProof.Xpath"), data);
		   return this;
	}
	public PanApplicationPage selectAddressProof(String data) {
		   selectVisibleTextByXpath(prop.getProperty("PanApplicationPage.AddressProof.Xpath"), data);
		   return this;
	}
	public PanApplicationPage selectDobProof(String data) {
		   selectVisibleTextByXpath(prop.getProperty("PanApplicationPage.DobProof.Xpath"), data);
		   return this;
	}
	public PanApplicationPage selectAdhaarProof(String data) {
		   selectVisibleTextByXpath(prop.getProperty("PanApplicationPage.AadhaarProof.Xpath"), data);
		   return this;
	}
	public PanApplicationPage selectOfficeAddrProof(String officeaddrproof) {
		   selectVisibleTextByXpath(prop.getProperty("PanApplicationPage.OfficeAddressProof.Xpath"), officeaddrproof);
		   return this;
	}
	public PanApplicationPage clickOnTerms(){
		clickByXpath(prop.getProperty("PanApplicationPage.Terms.Xpath"));
		return this;
	}
}
