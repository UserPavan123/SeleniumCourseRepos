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

import java.util.List;
import java.util.NoSuchElementException;

public class FindElements {
	String baseUrl = "http://www.google.com";

	@Test
	public void test1() throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/text-box/");

		// Find elements using tag name
		List<WebElement> allInputElements = driver.findElements(By.tagName("input"));

		if (allInputElements.size() != 0) {
			System.out.println(allInputElements.size() + " Elements found by TagName as input \n");

			for (WebElement inputElement : allInputElements) {
				System.out.println(inputElement.getAttribute("placeholder"));
			}
		}
	
		driver.close();

	}

}
