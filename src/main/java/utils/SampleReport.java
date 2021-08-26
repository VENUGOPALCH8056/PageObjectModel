package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void generateReport() {
		
		// Start Report
		
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		// Start Test
		
		ExtentTest test = report.startTest("TC004", "To verify IRCTC Registration");
		
		test.assignAuthor("Venu");
		
		test.assignCategory("Regression");
		
		// log test steps
		
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		test.log(LogStatus.PASS, "The browser is laucnhed with the given url successfully");
		
		// end test
		
		report.endTest(test);
		
		//end report
		
		report.flush();
		
		
		
	}
	
	

}
