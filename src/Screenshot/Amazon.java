package Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon {
	private static final String TakesScreen = null;
	private static File src;

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://flipkart.com/");
		
	   //how to take screenshot

		TakesScreenshot ts= (TakesScreenshot)driver; //typcast here
		
	  //use getscreenshot method and stote in src
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//create folder where we need to store scrnsot and give the path of folder with proper name and extensin
		
		File dest= new File("C:\\Users\\Shree\\Desktop\\Screenshot\\\\flipkart.jpg");
		
		//copy scnshot src to dest
		
		Files.copy(src, dest);
		
		
	}

}
