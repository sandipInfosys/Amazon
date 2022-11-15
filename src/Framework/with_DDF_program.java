package Framework;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class with_DDF_program {
	public static void main(String[] args) throws Throwable {
		//fetch data from excel
		FileInputStream fis=new FileInputStream("C:\\Users\\Shree\\Documents\\Book.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//delet all cookies
		driver.manage().deleteAllCookies();
		// maximize
		driver.manage().window().maximize();
		// open actitime 
		driver.get("https://demo.actitime.com/login.do");
		// get username from excel
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
	   driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
	   // get password from excel
         String pass = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass);
		// click login table
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//enter something on home page
		
		String data = sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys(data);
		// get titale
		String expT = sh.getRow(1).getCell(2).getStringCellValue();
		String act = driver.getTitle();
		System.out.println(act);
		// comprizan
		if(expT.equals(act)) {
			System.out.println("TC is pass");
		}
		
		else {
			System.out.println("Tc  is fail");
		}
		
		}

}
