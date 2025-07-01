package extendreports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport {
	@Test
	public void createReport() {
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/extentreport1.html");
		
	}
}
