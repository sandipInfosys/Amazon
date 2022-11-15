package Drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");   //open the application
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click(); //click on create new account btn
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']")); //select the dd which we need to handle
		Thread.sleep(3000);                                    
		Select s =new Select(day); //create the object of select class
		Thread.sleep(3000);
		//s.selectByVisibleText("18");   //use select class methods(select bt text)
		
		s.selectByValue("16");  //select by value
	}

}
