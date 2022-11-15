package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {
	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		 //inspect the element where we need to move cursor
		
		  WebElement targ = driver.findElement(By.xpath("//a[text()='Gmail']"));
		  
		//create object of actions class
		  
		  Actions act=new Actions(driver);
		  
		  act.moveToElement(targ).perform();
		  
		
	}
	
	

}
