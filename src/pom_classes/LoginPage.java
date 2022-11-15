package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")private WebElement UN;
	@FindBy(name="pwd")private WebElement PWD;
	@FindBy(id="loginButton")private WebElement Loginbtn;
	// take constructor as public 
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	//take menthod as public
	public void enterUserName() {
		UN.sendKeys("admin");
		}
	public void enterPassWord() {
		PWD.sendKeys("manager");
	}
public void ClickonButton() {
	Loginbtn.click();
}
}
