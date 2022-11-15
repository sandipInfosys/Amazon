package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_DDF {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// delete all cookis 
		driver.manage().deleteAllCookies();
		//miximize
		driver.manage().window().maximize();
		// open application
	driver.get("https://demo.actitime.com/login.do");
	// enter UN
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	// enter passowrd
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	//click login button
	driver.findElement(By.xpath("//div[text()='Login ']")).click(); //div[text()='Login ']
	//add something on homepage
	driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("sandip");
	//actual title
	String act = driver.getTitle();
	System.out.println(act);
	String exp = "actiTIME - Enter Time-Track";
	// compare both
	if (exp.equals(act)) {
		System.out.println("TC is pass");
	}
	else {
		System.out.println("Tc is Fails");
	}
	
	}

}
