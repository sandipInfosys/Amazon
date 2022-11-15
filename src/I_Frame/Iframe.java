package I_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.manage().window().maximize();
	
		driver.switchTo().frame("packageListFrame");
		
		Thread.sleep(3000);
		
	 String text1 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.cli']")).getText();
	 
	 System.out.println(text1);
	 
	 Thread.sleep(2000);
	 
	 driver.switchTo().defaultContent();
	 
	 driver.switchTo().frame("packageFrame");
	 
	 Thread.sleep(4000);
	 
	 String text2 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
	 
	 Thread.sleep(4000);
	 
	 System.out.println(text2);
	 
	 driver.switchTo().defaultContent();
	 
	 driver.switchTo().frame("classFrame");
	 
	 Thread.sleep(3000);

	 String txt3 =driver.findElement(By.xpath("//span[text()='Packages']")).getText(); 
	 
    Thread.sleep(2000);
    
    System.out.println(txt3);
	 
	 
	 
	 
	 
	 
	 
	 

	 
	 
	 
	 
	 
	 
	 
	 
		
		
		 
		
		
		 
		
	}

}
