package Multibrowser_testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multi {
	WebDriver driver=null;//runtime polymorphism
	@Parameters("browsername")//annotation
	@BeforeTest 

	public void browserstart(String browsername) {//paramerized method
			
		
		
			if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
			else if(browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				 driver=new FirefoxDriver();
				
			}
			
			driver.get("https://www.flipkart.com/");//globally
			
	}
@Test
public void login() {
	Reporter.log("login completed",true);
}
@AfterTest
public void browserclose() {
	driver.quit();
}
}
