package Drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Year {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']")); 
		
		Thread.sleep(2000);
		Select s=new Select(year);
		
		// s.selectByVisibleText("1993");
		
		//s.selectByValue("2019");
		
		s.selectByIndex(8);
		
		}
}
