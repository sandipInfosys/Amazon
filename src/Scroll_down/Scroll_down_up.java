package Scroll_down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down_up {
	
public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driver= new ChromeDriver();
		
driver.get("https://www.amazon.com/");
		
	//typecast
		 JavascriptExecutor jse =(JavascriptExecutor)driver;

//scroll down
jse.executeScript("window.scrollBy(0,2000);");
//scroll up
Thread.sleep(5000);

jse.executeScript("window.scrollBy(0,-1000);"); 
		
		

	}

}
