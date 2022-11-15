package Scroll_down;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_class {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 
		 //create object of Robot class
		 
		 Robot r=new Robot();
		    r.keyPress(KeyEvent.VK_PAGE_DOWN);
		    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		    
		    Thread.sleep(5000);
		    
		    r.keyPress(KeyEvent.VK_PAGE_DOWN);
		    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		    
		}
	}


