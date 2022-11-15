package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/"); //now control goes to google
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		driver.navigate().back(); //now control goes to amazon
		Thread.sleep(3000);
		driver.navigate().forward(); //now control goes to amazon
		Thread.sleep(2000);
		
		driver.navigate().refresh(); //whenever page is refreshed in automation at that time address of webpage can be change
		
	}

}
