package Practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_perticilar_element {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement perticular = driver.findElement(By.xpath("//li[@class=\"feed-carousel-card\"]"));
		
		File src= perticular.getScreenshotAs(OutputType.FILE);
		
		File dst = new File("C:\\Users\\Shree\\Desktop\\Screenshot\\\\book.jpg");
		
		Files.copy(src, dst);
		
		
		
		
	}
;
}
