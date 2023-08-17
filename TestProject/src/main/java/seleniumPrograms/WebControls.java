package seleniumPrograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;

public class WebControls {
	String baseUrl = "http://www.google.com";
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void AfterMethod() {
		driver.quit();
		driver.close();
	}

	@Test
	public void CheckBox() throws InterruptedException {
		// TODO Auto-generated method stub

		driver.get("https://demoqa.com/text-box/");

		driver.manage().window().maximize();

		/**
		 * Validate isSelected and click
		 */

		WebElement checkBoxSelected = driver
				.findElement(By.xpath("//*[text()='Home']//parent::label/span[@class='rct-checkbox']"));
		boolean isSelected = checkBoxSelected.isSelected();

		// performing click operation if element is not selected
		if (isSelected == false) {
			checkBoxSelected.click();
		}

		/**
		 * Validate isDisplayed and click
		 */
		WebElement checkBoxDisplayed = driver
				.findElement(By.xpath("//*[text()='Home']//parent::label/span[@class='rct-checkbox']"));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();

		// performing click operation if element is displayed
		if (isDisplayed == true) {
			checkBoxDisplayed.click();
		}

		/**
		 * Validate isEnabled and click
		 */
		WebElement checkBoxEnabled = driver
				.findElement(By.xpath("//*[text()='Home']//parent::label/span[@class='rct-checkbox']"));
		boolean isEnabled = checkBoxEnabled.isEnabled();

		// performing click operation if element is enabled
		if (isEnabled == true) {
			checkBoxEnabled.click();
		}

	}

	@Test
	public void RadioButton() throws InterruptedException {
		// TODO Auto-generated method stub

		driver.get("https://demoqa.com/text-box/");

		driver.manage().window().maximize();

		/**
		 * Find radio button using ID, Validate isSelected and then click to select
		 */

		WebElement radioEle = driver.findElement(By.id("yesRadio"));

		boolean select = radioEle.isSelected();
		System.out.print(select);
		// performing click operation if element is not already selected
		if (select == false) {
			radioEle.click();
		}

		/**
		 * Find radio button using Xpath, Validate isDisplayed and click to select
		 */

		WebElement radioElem = driver.findElement(By.xpath("//div/input[@id='impressiveRadio']"));
		boolean sel = radioEle.isDisplayed();

		// performing click operation if element is displayed
		if (sel == true) {
			radioElem.click();
		}

		/**
		 * Find radio button using CSS Selector, Validate isEnabled and click to select
		 */
		WebElement radioNo = driver.findElement(By.cssSelector("input[id='noRadio']"));
		boolean selectNo = radioNo.isDisplayed();

		// performing click operation if element is enabled
		if (selectNo == true) {
			radioNo.click();
		}

	}

	@Test
	public void DropDown() throws InterruptedException { // TODO Auto-generated method stub

		// Step#2- Launching URL
		driver.get("https://demoqa.com/select-menu");

		// Maximizing window
		driver.manage().window().maximize();

		// Step#3- Selecting the dropdown element by locating its id

		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));

		// Step#4- Printing the options of the dropdown // Get list of web elements
		List<WebElement> lst = select.getOptions();

		// Looping through the options and printing dropdown options
		System.out.println("The dropdown options are:");

		for (WebElement options : lst) {
			System.out.println(options.getText());
		}

		// Step#5- Selecting the option as 'Purple'-- selectByIndex
		System.out.println("Select the Option by Index 4");

		select.selectByIndex(4);
		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

		// Step#6- Selecting the option as 'Magenta'-- selectByVisibleText
		System.out.println("Select the Option by Text Magenta");
		select.selectByVisibleText("Magenta");

		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

		// Step#7- Selecting an option by its value
		System.out.println("Select the Option by value 6");

		select.selectByValue("6");

		System.out.println("Select value is: " +

				select.getFirstSelectedOption().getText());

	}

	@Test
	public void Alerts() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();
		// This step will result in an alert on screen

		driver.findElement(By.id("alertButton")).click();

		Alert simpleAlert = driver.switchTo().alert();

		simpleAlert.accept();
		simpleAlert.dismiss();

		// This step will result in an alert on screen WebElement element =
		driver.findElement(By.id("promtButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()");

		Alert promptAlert = driver.switchTo().alert();
		String alertText = promptAlert.getText();

		System.out.println("Alert text is " + alertText); // Send some text to the
		promptAlert.sendKeys("Test User");
		promptAlert.accept();

		// This step will result in an alert on screen WebElement element1 =
		driver.findElement(By.id("confirmButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()");
		Alert confirmationAlert = driver.switchTo().alert();
		String alertText1 = confirmationAlert.getText();
		System.out.println("Alert text is " + alertText1);

		confirmationAlert.accept();

		try {

			driver.findElement(By.id("timerAlertButton")).click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());

			Alert simpleAlert1 = driver.switchTo().alert();
			simpleAlert1.accept();
			System.out.println("Unexpected alert accepted");
		} catch (Exception e) {
			System.out.println("unexpected alert not present");
		}
	}

	@Test
	public void WebTable() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));

		driver.get("https://toolsqa.com/automation-practice-table");

		String sRow = "1";
		String sCol = "2";

		
		Object sCellValue;
		// Here we are locating the xpath by passing variables in the xpath String
		 sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + sRow + "]/td[" + sCol + "]")).getText();

		System.out.println(sCellValue);

		String sRowValue = "Clock Tower Hotel";

		// First loop will find the 'ClOCK TWER HOTEL' in the first column
		for (int i = 1; i <= 5; i++) {
			String sValue = null;
			sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();
			if (sValue.equalsIgnoreCase(sRowValue)) { // If thesValue match with the description, it will initiate one
														// more inner // loop for all the columns of 'i' row
				for (int j = 1; j <= 5; j++) {
					String sColumnValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td[" + j + "]"))
							.getText();
					System.out.println(sColumnValue);
				}
				break;
			}
		}
	}

	@Test 
	public void IFrames() throws InterruptedException {
			  
			  driver.get("https://demoqa.com/frames");
			  
			  // By executing a java script 
			  JavascriptExecutor exe = (JavascriptExecutor)driver; 
			  Integer numberOfFrames =Integer.parseInt(exe.executeScript("return window.length").toString());
			  
			  System.out.println("Number of iframes on the page are " + numberOfFrames);
			  
			  // By finding all the web elements using iframe tag 
			  List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
			  
			  
			  System.out.println("The total number of iframes are " +iframeElements.size());
			  
			   //Switch by Index 
			   driver.switchTo().frame(0);
			  
			   //Switch by frame ID 
			   driver.switchTo().frame("frame1");
			  
			  WebElement iframeElement = driver.findElement(By.id("IF1"));
			  
			  // now use the switch command driver.switchTo().frame(iframeElement);
			  
			  driver.switchTo().defaultContent();
			  
			  driver.switchTo().frame(1);
			  
			  }

}
