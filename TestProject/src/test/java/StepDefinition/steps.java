package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.java.en.*;


public class steps {

	public WebDriver driver;
    
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4");
		
	}

	
	@When("^Enter the \"(.*)\" and \"(.*)$")
	public void enter_the_Username_and_Password(String Username,String Password) throws Throwable {
		driver.findElement(By.name("uid")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
	}

	@Then("^Reset the credential$")
	public void Reset_the_credential() throws Throwable {
		driver.findElement(By.name("btnReset")).click();
	}
	
}