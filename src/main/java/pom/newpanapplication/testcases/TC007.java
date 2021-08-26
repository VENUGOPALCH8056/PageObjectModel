package pom.newpanapplication.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.newpanapplication.pages.PanApplicationPage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify whether the user is able to register in pan application";
		author="Venu";
		category="smoke";
		browserName="chrome";
		appName="pan";
		sheetName="TC007";
	}
	
	@Test(dataProvider="fetchData")
	public void newPanAppication(String gender,String pan_firstname,String pan_middlename,String pan_lastname,
			String pan_fatherfirstname,String pan_fathermiddlename,
			String pan_fatherlastname,String pan_mobilenumber,
			String pan_email,String sourceOfIncome,String pan_dob, String bodyXpath,String pan_addressline1,
			String pan_addressline2,String pan_cityname,String state,String pan_pincode,
			String pan_officename,String pan_officeaddressline1,String pan_officeaddressline2,
			String pan_officecityname,String officeState, String bodyXpathTwo,String pan_officepincode,
			String identityProof, String addressProof,String dateOfBirthProof,String aadhaarProof,String officeAddressProof) {
		
	
		
		new PanApplicationPage(driver, test)
		.selectTitle(gender)
		.enterPanFirstname(pan_firstname)
		.enterPanMiddlename(pan_middlename)
		.enterPanLastname(pan_lastname)
		.enterFatherFirstname(pan_fatherfirstname)
		.enterFatherMiddlename(pan_fathermiddlename)
		.enterFatherLastname(pan_fatherlastname)
		.enterMobileNumber(pan_mobilenumber)
		.enterEmail(pan_email)
		.selectSourceofIncome(sourceOfIncome)
		.clickOnAddressofCommunication()
		.enterDateofBirth(pan_dob)
		.pageDown(bodyXpath)
		.enterResidentHouseNumber(pan_addressline1)
		.enterResidentStreet(pan_addressline2)
		.enterResiddentTown(pan_cityname)
		.selectState(state)
		.enterPincode(pan_pincode)
		.enterOfficeName(pan_officename)
		.enterOfficeHouse(pan_officeaddressline1)
		.enterOfficeArea(pan_officeaddressline2)
		.enterOfficeCity(pan_officecityname)
		.selectOfficeState(officeState)
		.pageDown(bodyXpathTwo)
		.enterOfficePincode(pan_officepincode)
		.selectIdentityProof(identityProof)
		.selectAddressProof(addressProof)
		.selectDobProof(dateOfBirthProof)
		.selectAdhaarProof(aadhaarProof)
		.selectOfficeAddrProof(officeAddressProof)
		.clickOnTerms();
	}
}
