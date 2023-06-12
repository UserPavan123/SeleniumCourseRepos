package SeleniumMaven.TestProject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;  


public class WebDriverTest_Chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArgument("--start-maximized");
		//WebDriver driver = new ChromeDriver(options);
	    WebDriver driver = new ChromeDriver();
	    
		// Launch website  
	    driver.navigate().to("http://www.google.com/");  
	          
	    
	    Thread.sleep(2000);
		
	    // Click on the search text box and send value  
	    driver.findElement(By.id("APjFqb")).sendKeys("javatpoint tutorials");
	    
	        
	    // Click on the search button  
	    //driver.findElement(By.name("btnK")).click();  
	    
	    //driver.findElement(By.xpath("//input[contains(@value,'Google Search') and @name='btnK'])[2]")).click(); 
	    
	    Thread.sleep(2000);
	    
	    driver.close();
		
	}

}
