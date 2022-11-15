package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("sandipshelke1992@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Sandy@123");
		Thread.sleep(2000);
		
		
	}

}
