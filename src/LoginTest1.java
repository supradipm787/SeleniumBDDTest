//import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utility.DriverFactory;
import utility.Constants;

public class LoginTest1 {

	@Test
	public void test() {
		WebDriver driver = DriverFactory.getDriver(Constants.browser);
		//driver.get("https://www.scrum.org/user/login");
		driver.get(Constants.indexPage);
	}

}
