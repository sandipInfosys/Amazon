package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ULC_of_loginpage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		// create loginpage of object
		ULC_of_loginpage lp=new ULC_of_loginpage();
		lp.enterUserName();
		lp.enterPassWord();
		lp.ClickonButton();
	}

	private void enterUserName() {
		// TODO Auto-generated method stub
		
	}

	private void enterPassWord() {
		// TODO Auto-generated method stub
		
	}

	private void ClickonButton() {
		// TODO Auto-generated method stub
		
	}

}
