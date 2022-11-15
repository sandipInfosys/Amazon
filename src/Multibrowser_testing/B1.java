package Multibrowser_testing;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class B1 {
		WebDriver driver=null;//runtime polymorphism
		@Parameters("browsername")//annotation
		@Test
		public void TC(String browsername) {//paramerized method
				
			
				if(browsername.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
				if(browsername.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
					 driver=new FirefoxDriver();
					
				}
				driver.get("https://www.facebook.com/");//globally
		}

}
