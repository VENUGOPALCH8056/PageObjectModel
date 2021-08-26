package pom.frro.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.frro.pages.FormCMenuUserReg;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To verify whether the user is able to register in FormC application";
		author="Venu";
		category="smoke";
		browserName="chrome";
		appName="formC";
		sheetName="TC006";
	}
	
	@Test(dataProvider="fetchData")
	public void formC(String u_id,String u_pwd,String u_repwd,String securityQuestion,String u_secans,
			String u_name,String gender,String u_dob,String u_designation,String u_emailid,String u_mobile,
			String u_phone,String name,String capacity,String address,String state, String dist,String frroData,
			String accType,String starRating,String email,String mcontact,
			String contact,String name_o,String address_o,String stateOff,String cityOff,
			String emailid_o,String phoneno_o,String mobile_o,
			String name_1,String address_1,String stateOffOne,String cityOffOne,String emailid_1,String phoneno_1,String mobile_1,
			String name_2,String address_2,String stateOffTwo,String cityOffTwo,String emailid_2,String phoneno_2,String mobile_2) {
			
			int secQes = Integer.parseInt(securityQuestion);
			int city = Integer.parseInt(dist);
			int data = Integer.parseInt(frroData);
			int rating = Integer.parseInt(starRating);
			int staetOff = Integer.parseInt(stateOff);
			int distOff = Integer.parseInt(cityOff);
			int staetOffOne = Integer.parseInt(stateOffOne);
			int distOffOne = Integer.parseInt(cityOffOne);
			int staetOffTwo = Integer.parseInt(stateOffTwo);
			int distOffTwo = Integer.parseInt(cityOffTwo);
		
			new FormCMenuUserReg(driver, test)
			.clickOnSignUp()
			.enterUserId(u_id)
			.enterPassword(u_pwd)
			.enterConfirmPassword(u_repwd)
			.selectSecurityQuestion(secQes)
			.enterSecurityAnswer(u_secans)
			.enterName(u_name)
			.selectGender(gender)
			.enterDOB(u_dob)
			.enterDesignation(u_designation)
			.enterEmailId(u_emailid)
			.enterMobileNumber(u_mobile)
			.enterPhoneNumber(u_phone)
			.enterHotelName(name)
			.enterCapacity(capacity)
			.enterAddress(address)
			.selectState(state)
			.waitTime()
			.selectCity(city)
			.selectFrroData(data)
			.selectAccomodationType(accType)
			.selectAccomodationGrade(rating)
			.enterHotelEmailId(email)
			.enterHotelMobileNumber(mcontact)
			.enterHotelPhoneNumber(contact)
			.enterNameAdd(name_o)
			.enterAddressAdd(address_o)
			.selectStateAdd(staetOff)
			.waitTime()
			.selectCityAdd(distOff)
			.enterEmailIdAdd(emailid_o)
			.enterPhoneNumberAdd(phoneno_o)
			.enterMobileNumberAdd(mobile_o)
			.clickOnAdd()
			.enterNameAdd(name_1)
			.enterAddressAdd(address_1)
			.selectStateAdd(staetOffOne)
			.waitTime()
			.selectCityAdd(distOffOne)
			.enterEmailIdAdd(emailid_1)
			.enterPhoneNumberAdd(phoneno_1)
			.enterMobileNumberAdd(mobile_1)
			.clickOnAdd()
			.enterNameAdd(name_2)
			.enterAddressAdd(address_2)
			.selectStateAdd(staetOffTwo)
			.waitTime()
			.selectCityAdd(distOffTwo)
			.enterEmailIdAdd(emailid_2)
			.enterPhoneNumberAdd(phoneno_2)
			.enterMobileNumberAdd(mobile_2);
		
		}
}
