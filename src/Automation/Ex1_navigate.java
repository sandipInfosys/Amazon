package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_navigate {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver g= new ChromeDriver();
		g.get("https://in.bookmyshow.com/");
		Thread.sleep(3000);
		
		g.get("https://www.javatpoint.com/");
		Thread.sleep(3000);
		
		g.navigate().back();
		Thread.sleep(2000);
		g.navigate().forward();
		Thread.sleep(1000);
		g.navigate().refresh();
		Thread.sleep(2000);
		
		
		
	}

}
