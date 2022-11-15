package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_groupindex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("(//input)[14]")).sendKeys("7030118970");
		driver.findElement(By.xpath("(//input)[15]")).sendKeys("Sandy@123");
		driver.findElement(By.xpath("(//button)[1]")).click();
		
	}

}
