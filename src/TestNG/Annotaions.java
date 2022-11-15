package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotaions {
	@BeforeClass
	public void openbrowser() {
		
	}
    @BeforeMethod
    public void loginApp() {
		Reporter.log("login to App",true);
    }
       @Test
       public void verifyID() {
			Reporter.log("verify user id",true);
       }
       @AfterMethod
		public void logoutApp() {
			Reporter.log("logout from App",true);
			
		}
		@AfterClass
		
		public void closebrowser() {
			Reporter.log("close the browser",true);
		}
}
