package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Datadriven {
	
	WebDriver driver;
	
	@Given("User opens the browser and navigate to training from website")
	public void user_opens_the_browser_and_navigate_to_training_from_website() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/simple-form");
	    driver.manage().window().maximize();
	    
	}	

	@When("User enter {string}, {string}, {string}")
	public void user_enter(String firstname, String lastname, String Email) throws InterruptedException {
		driver.findElement(By.id("firstName")).sendKeys(firstname);
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys(lastname);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(Email);
		Thread.sleep(2000);
	}

	@When("User is entering {string}, {string}")
	public void user_is_entering(String ContactNumber, String Message) throws InterruptedException {
		
		driver.findElement(By.id("number")).sendKeys(ContactNumber);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='field']//textarea")).sendKeys(Message);
		Thread.sleep(2000);
		
	}

	@When("User clicks on submit")
	public void user_clicks_on_submit() {
	   
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		
	}

	@Then("Aconfirmation popup is displayed")
	public void aconfirmation_popup_is_displayed() { 
	    driver.quit();
	}
	
}
