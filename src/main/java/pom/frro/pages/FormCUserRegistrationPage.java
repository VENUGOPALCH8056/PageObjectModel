package pom.frro.pages;


import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.GenericWrappers;

	public class FormCUserRegistrationPage extends GenericWrappers{
		
		public FormCUserRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
			this.driver=driver;
			this.test=test;
		}
	
		public FormCUserRegistrationPage enterUserId(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.UserId.Xpath"), data);
			return this;
		}
		
		public FormCUserRegistrationPage enterPassword(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.Password.Xpath"), data);
			return this;
		}
		
		public FormCUserRegistrationPage enterConfirmPassword(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.ConfirmPassword.Xpath"), data);
			return this;
		}
		
		public FormCUserRegistrationPage selectSecurityQuestion(int value) {
			selectIndexByXpath(prop.getProperty("FormCUserRegistrationPage.SecurityQuestion.Xpath"), value);
			return this;
		}
		
		public FormCUserRegistrationPage enterSecurityAnswer(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.SecurityAnswer.Xpath"), data);
			return this;	
		}	
		
		public FormCUserRegistrationPage enterName(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.Name.Xpath"), data);
			return this;	
		}	
			
		public FormCUserRegistrationPage selectGender(String data) {
			selectVisibleTextByXpath(prop.getProperty("FormCUserRegistrationPage.Gender.Xpath"), data);
			return this;	
		}
			
		public FormCUserRegistrationPage enterDOB(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.Dob.Xpath"), data);
			return this;	
		}

		public FormCUserRegistrationPage enterDesignation(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.Designation.Xpath"), data);
			return this;	
		}
		
		public FormCUserRegistrationPage enterEmailId(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.EmailId.Xpath"), data);
			return this;	
		}	
		
		public FormCUserRegistrationPage enterMobileNumber(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.Mobile.Xpath"), data);
			return this;	
		}	
		
		public FormCUserRegistrationPage enterPhoneNumber(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.Phone.Xpath"), data);
			return this;	
		}	
		
		public FormCUserRegistrationPage selectNationality(String value) {
			selectVisibleTextByXpath(prop.getProperty("FormCUserRegistrationPage.Nationality.Xpath"), value);
			return this;	
		}
		
		public FormCUserRegistrationPage enterHotelName(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.HotelName.Xpath"), data);
			return this;	
		}	
			
		public FormCUserRegistrationPage enterCapacity(String data){
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.Capacity.Xpath"), data);
			return this;	
		}
		
		public FormCUserRegistrationPage enterAddress(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.Address.Xpath"), data);
			return this;	
		}	
		
		public FormCUserRegistrationPage selectState(String value) {
			selectVisibleTextByXpath(prop.getProperty("FormCUserRegistrationPage.State.Xpath"), value);
			return this;	
		}	
		
		public FormCUserRegistrationPage selectCity(int value) {
			selectIndexByXpath(prop.getProperty("FormCUserRegistrationPage.City.Xpath"), value);
			return this;	
		}
		
		public FormCUserRegistrationPage selectFrroData(int value) {
			selectIndexByXpath(prop.getProperty("FormCUserRegistrationPage.FrroData.Xpath"), value);
			return this;	
		}
		
		public FormCUserRegistrationPage selectAccomodationType(String value) {
			selectVisibleTextByXpath(prop.getProperty("FormCUserRegistrationPage.AccomodationType.Xpath"), value);
			return this;	
		}	
		
		public FormCUserRegistrationPage selectAccomodationGrade(int value) {
			selectIndexByXpath(prop.getProperty("FormCUserRegistrationPage.Grade.Xpath"), value);
			return this;	
		}	
		
		public FormCUserRegistrationPage enterHotelEmailId(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.HotelEmail.Xpath"), data);
			return this;	
		}	
		
		public FormCUserRegistrationPage enterHotelMobileNumber(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.HotelMobileNumber.Xpath"), data);
			return this;	
		}	
		
		public FormCUserRegistrationPage enterHotelPhoneNumber(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.HotelPhoneNumber.Xpath"), data);
			return this;	
		}
		
		
		public FormCUserRegistrationPage enterNameAdd(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.NameAdd.Xpath"), data);
			return this;	
		}	
		
		public FormCUserRegistrationPage enterAddressAdd(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.AddressAdd.Xpath"), data);
			return this;	
		}
		
		public FormCUserRegistrationPage selectStateAdd(int value) {
			selectIndexByXpath(prop.getProperty("FormCUserRegistrationPage.StateAdd.Xpath"), value);
			return this;	
		}
		
		public FormCUserRegistrationPage selectCityAdd(int value) {
			selectIndexByXpath(prop.getProperty("FormCUserRegistrationPage.CityAdd.Xpath"), value);
			return this;	
		}
		
		public FormCUserRegistrationPage enterEmailIdAdd(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.EmailIdAdd.Xpath"), data);
			return this;
		}	
		
		public FormCUserRegistrationPage enterPhoneNumberAdd(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.PhoneNumberAdd.Xpath"), data);
			return this;	
		}	
		
		public FormCUserRegistrationPage enterMobileNumberAdd(String data) {
			enterByXpath(prop.getProperty("FormCUserRegistrationPage.MobileNumberAdd.Xpath"), data);
			return this;	
		}	
		
		public FormCUserRegistrationPage clickOnAdd() {
			clickByXpath(prop.getProperty("FormCUserRegistrationPage.Add.Xpath"));
			return this;
		}
		
		public FormCUserRegistrationPage waitTime() {
			waitTime(5000);
			return this;
		}
	
}
