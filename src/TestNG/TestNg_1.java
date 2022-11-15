package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_1 {
	@Test//it is acting as a main method...
	public void m1() {
		Reporter.log("Hii",true);
	}
}
 