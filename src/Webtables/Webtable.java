package Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Shree/Desktop/JAVA%20NOTES/selelium/Ankush%20sir/WebTable%20by%20ANKUSH%20(1).html");
		// print only student name
		String Student = driver.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
	System.out.println(Student);
		//print city
	String city = driver.findElement(By.xpath("//table[@id='2244']//th[3]")).getText();
	System.out.println(city);
	// print sr no
	
	String srno = driver.findElement(By.xpath("//table[@id='2244']//th[1]")).getText();
	System.out.println(srno);
	
	//print sachin
	
	String sachin = driver.findElement(By.xpath("//table[@id='2244']/descendant::td[2]")).getText();
	System.out.println(sachin);
	// shilpa
	String shilpa = driver.findElement(By.xpath("//table[@id='2244']/descendant::td[11]")).getText();
	System.out.println(shilpa);
	
	//print r2
	String r2 = driver.findElement(By.xpath("//table[@id='2244']//tr[2]")).getText();
	System.out.println(r2);
//print r5
	String r5 = driver.findElement(By.xpath("//table[@id='2244']//tr[5]")).getText();
	System.out.println(r5);
		
		
	}

}
