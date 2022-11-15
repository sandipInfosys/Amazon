package Practice;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class Screenshot_of_amazon {
	public static void main(String[] args) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File src =ts.getScreenshotAs(OutputType.FILE);
		
		File dst = new File("C:\\Users\\Shree\\Desktop\\Screenshot\\amazon.jpg");
		
		Files.copy(src, dst);
		
		
		
		
	}

}
