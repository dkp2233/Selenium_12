package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BajajTest {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bajajauto.com/");
		Reporter.log("Bajaj Launched",true);
		Syetem.out.println("code change by github");
		
		
	}

}
