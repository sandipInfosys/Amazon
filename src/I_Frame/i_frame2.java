package I_Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class i_frame2 {
	
	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 driver.manage().window().maximize();
		 
	}
}