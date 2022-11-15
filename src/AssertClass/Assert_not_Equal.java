package AssertClass;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_not_Equal {
	@Test
	public void Tc2() {
		Reporter.log("running TC2",true);
		String expR="Rinky";
		String actR="Rinky";
		Assert.assertNotEquals(expR,actR);
	}
	}


