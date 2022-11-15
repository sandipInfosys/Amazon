package Screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screnshot_of_perticular_element {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//find particular element and store ref varaible
		
		WebElement perticular = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		
		File Src=perticular.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Shree\\Desktop\\Screenshot\\\\google.jpg");
		
		Files.copy(Src, dest);

}
}