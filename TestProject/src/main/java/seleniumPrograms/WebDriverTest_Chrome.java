package seleniumPrograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WebDriverTest_Chrome {

	@Test
	public void test1() throws InterruptedException  
	{
		// TODO Auto-generated method stub

	    // declaration and instantiation of objects/variables  
	   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    
		// Launch web site  
	    driver.navigate().to("http://www.google.com/");  
	          
	    
	    Thread.sleep(2000);
	    
		//this will maximize window
	    driver.manage().window().maximize();
		
	    // Click on the search text box and send value  
	    driver.findElement(By.id("APjFqb")).sendKeys("javatpoint tutorials");
	    
	        
	    // Click on the search button  
	    driver.findElement(By.name("btnK")).click();  
	    
	    driver.findElement(By.xpath("//input[contains(@value,'Google Search') and @name='btnK'])[2]")).click(); 
	    
	    Thread.sleep(2000);
	    
	    driver.close();
		
	}

}
