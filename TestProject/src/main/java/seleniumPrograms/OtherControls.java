package seleniumPrograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.NoSuchElementException;

public class OtherControls {
	String baseUrl = "http://www.google.com";

	/*
	 * @Test public void test1() throws InterruptedException { // TODO
	 * Auto-generated method stub
	 * 
	 * WebDriver driver = new ChromeDriver();
	 * 
	 * driver.get("C:/Users/spava/Desktop/selenium.html");
	 * 
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * 
	 * driver.manage().window().maximize();
	 * 
	 * // This controls are to click Radio Button
	 * 
	 * driver.findElement(By.xpath("//input[@value='Ladyfinger']")).click();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * driver.findElement(By.xpath("//input[@value='Potato']")).click();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * driver.findElement(By.xpath("//input[@value='Tomato']")).click();
	 * 
	 * driver.close();
	 * 
	 * }
	 */

	@Test
	public void test2() throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://irctc.co.in");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().window().maximize();

		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='concessionBooking']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='concessionBooking']")));
		
		driver.findElement(By.xpath("//input[@id='concessionBooking']")).click();
		Thread.sleep(1000);

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dateSpecific")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dateSpecific")));
		driver.findElement(By.xpath("//input[@id='dateSpecific']")).click();

		Thread.sleep(1000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("availableBerth")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("availableBerth")));
		driver.findElement(By.xpath("//input[@id='availableBerth']")).click();

		Thread.sleep(1000);

		driver.close();

	}

}
