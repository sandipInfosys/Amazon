package Findelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEs {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int count=0;
		// to cancel the popup 
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		List<WebElement> element = driver.findElements(By.xpath("//div"));
		
		for(WebElement i:element) {
			String str=i.getText();
			System.out.println(str);
			count++;
		}
		
		System.out.println(count);
		
}
}