package stepImplementation;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.DriverFactory;
import utility.Constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
//import utility.ChromeDriver;
import cucumber.api.java.en.Given;

public class BDDLoginTest {
	
	WebDriver driver;
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page () {
		System.out.println("User is on the login page");
		//driver = DriverFactory.getDriver("Chrome");
		//driver.get("https://www.scrum.org/user/login");
		
		driver = DriverFactory.getDriver(Constants.browser);
		driver.get(Constants.indexPage);
		
	}
	
	 @Before("@wait")
	    public void doingWait(){
	        try {
	            System.out.println("Waiting for 10 sec..");
	            Thread.sleep(10_000);
	        } catch (InterruptedException e) {
	            throw new RuntimeException(e);
	        }
	    }

	
	@When("^user enters the correct username and password$")
	public void user_enters_the_correct_username_and_password () {
		System.out.println("User enters the correct username and password");		
		
		try {
            System.out.println("Waiting for 10 sec..");
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }		
		
		
		driver.findElement(By.name(Constants.field_name)).sendKeys(Constants.username);
		driver.findElement(By.name(Constants.field_password)).sendKeys(Constants.password);		
		
		driver.findElement(By.name(Constants.field_button_op)).click();
		
		try {
            System.out.println("Waiting for 10 sec..");
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }		
		
		
	}
	
	@When("^user enters the correct email (.*)$")
	public void user_enters_the_correct_email (String username) {
		System.out.println("User enters the parameter username :: " + username);
		driver.findElement(By.name(Constants.field_name)).sendKeys(username);
		
	}
	
	@And("^user enters password (.*)$")
	public void user_enters_password (String password) {
		System.out.println("User enters the parameter password ::" + password);
		driver.findElement(By.name(Constants.field_password)).sendKeys(password);
		driver.findElement(By.name(Constants.field_button_op)).click();
	}
	
	@Then ("^user gets the confirmation message$")
	public void user_gets_the_confirmation_message () {
		System.out.println("user gets the confirmation message");
		
		
	}
	
	@After
	public void tear_down ()	{
	   
	   driver.close();
	   driver.quit();
	   System.out.println("Closing & Quitting Driver");
	}

}


