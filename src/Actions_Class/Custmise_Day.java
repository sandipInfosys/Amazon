package Actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Custmise_Day {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		//click on create new account btn
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		//select on day
		
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Actions act = new Actions(driver);
		 
		//click on day
		
		act.click(Day).perform();
		
		//move upside by one
        
        act.sendKeys(Keys.ARROW_UP).perform();
      
        //move downside by one
        act.sendKeys(Keys.ARROW_DOWN).perform();
        //click on 7
        act.sendKeys(Keys.ENTER).perform();
		 
		 
		
	}

}
