 package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	static WebDriver driver;
	 
	public static WebDriver getDriver(String chrome){
		if (Constants.browser.equalsIgnoreCase(chrome)) {
			//System.setProperty("webdriver.chrome.driver", "D:\\Jars\\ChromeDriver\\chromedriver_win32_109\\chromedriver.exe");
			//Check the current browser & its version and download & point the driver accordingly
			System.setProperty(Constants.chromeDriverKey, Constants.chromeDriverValue);
			driver = new ChromeDriver();
		}
		 
		 return driver;
	 }

}
