package extendreports;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class demoTakesScreenshotAddExtentReport {
	@Test
	public void demoTakesScreenshot() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String time = LocalDateTime.now().toString().replace(":", "_");
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("dkp2233@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("demo@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		TakesScreenshot tc=(TakesScreenshot)driver;
		String demoScreenshot = tc.getScreenshotAs(OutputType.BASE64);
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/"+time+".html");
		ExtentReports ereport=new ExtentReports();
		ereport.attachReporter(spark);
		ExtentTest test = ereport.createTest("demoTakesScreenshot");
		test.log(Status.INFO, "addingscreenshot");
		test.addScreenCaptureFromBase64String(demoScreenshot);
		ereport.flush();
	}

}
