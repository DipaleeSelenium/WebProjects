package WebBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class webController {

	public static WebDriver driver = null;
	
	
	public static WebDriver invokeWebController() {
		if (driver != null) {
			return driver;
		}
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\D4668829\\Desktop\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://soclean.mutlp.test.pointp.saint-gobain.net/soclean/vehicle");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	
	@AfterSuite
	  public void stop() {
	        if (driver != null) {
	            driver.quit();
	            driver.close();
//	            driver = null;
	            
	        }
	        
	  }
}
	  
