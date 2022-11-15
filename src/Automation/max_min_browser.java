package Automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class max_min_browser {
	public static void main(String[] args) throws Throwable { 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize(); //maximize browser
		Thread.sleep(4000);
		
		driver.manage().window().minimize(); //minimize browser
		
		Dimension d=new Dimension(100,200);  // setsize();
		driver.manage().window().setSize(d);
		
		Point p=new Point(300,400);
		driver.manage().window().setPosition(p);
		
		
	}

}
