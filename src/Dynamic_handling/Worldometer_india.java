package Dynamic_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Worldometer_india {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/country/india");
		String cases = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[1]")).getText();
		System.out.println(cases);
		String Death = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
		System.out.println(Death);
		String Recoverd = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
		System.out.println(Recoverd);
	}

}
