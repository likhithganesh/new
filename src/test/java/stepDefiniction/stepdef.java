package stepDefiniction;
import org.openqa.selenium.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepdef {
	


	WebDriver driver = null;
	
	
	@Given("^I am on Github home page$")
	public void i_am_on_Github_home_page()  {
		WebDiverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/client");
	}

	@When("^I specify Username and Password$")
	public void i_specify_Username_and_Password()  {
		driver.findElement(By.id("userEmail")).sendKeys("1431ravan1431@gmail.com");
	    
		driver.findElement(By.id("userPassword")).sendKeys("Mouni@143");
	    
	}

	@When("^Click on SignIn button$")
	public void click_on_SignIn_button()  {
		driver.findElement(By.id("login")).click();
	   
	}

	@Then("^I should be able to see logout option$")
	public void i_should_be_able_to_see_logout_option()  {
	    
	}

}
