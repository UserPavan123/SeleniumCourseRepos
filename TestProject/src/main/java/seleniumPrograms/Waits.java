package seleniumPrograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.NoSuchElementException;

public class Waits {
	String baseUrl = "http://www.google.com";
	WebDriver driver;

	@BeforeMethod
	public void beforemethod() {
		driver = new ChromeDriver();

	}

	@AfterMethod
	public void aftermethod() {
		// close browser
		driver.close();
	}

	@Test
	public void implicitWaitExcercise() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// launch Chrome and redirect it to the URL
		driver.get("https://demoqa.com/dynamic-properties");

		// this will maximize window driver.manage().window().maximize();

		// This element will appear after 5 secs
		driver.findElement(By.id("visibleAfter")).click();

	}

	@Test
	public void ExplicitWaitExcercise() throws InterruptedException {
		// TODO Auto-generated method stub

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String eTitle = "Demo Guru99 Page";

		// launch Chrome and redirect it to the Base URL
		driver.get("https://demo.guru99.com/test/guru99home/");

		// Maximizes the browser window driver.manage().window().maximize();

		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains(eTitle));

		WebElement guru99seleniumlink;
		guru99seleniumlink = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='SELENIUM']")));

		guru99seleniumlink.click();

	}

	/*
	 * The following are the Expected Conditions that can be used in Selenium
	 * Explicit Wait
	 * 
	 * alertIsPresent() elementSelectionStateToBe() elementToBeClickable()
	 * elementToBeSelected() frameToBeAvaliableAndSwitchToIt()
	 * invisibilityOfTheElementLocated() invisibilityOfElementWithText()
	 * presenceOfAllElementsLocatedBy() presenceOfElementLocated()
	 * textToBePresentInElement() textToBePresentInElementLocated()
	 * textToBePresentInElementValue() titleIs() titleContains() visibilityOf()
	 * visibilityOfAllElements() visibilityOfAllElementsLocatedBy()
	 * visibilityOfElementLocated()
	 */

	@Test
	public void FluentWaitExcercise() throws InterruptedException {

		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/");

		// Maximizes the browser window driver.manage().window().maximize();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//a[text()='SELENIUM']"));
			}
		});
		// click on the selenium link
		clickseleniumlink.click();

	}

}
