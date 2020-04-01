package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestionAssignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String command = "return document.getElementById(\"autocomplete\").value;";

		while (!js.executeScript(command).toString().equalsIgnoreCase("India")) {
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			System.out.println(js.executeScript(command).toString());
		}
		
		
		
		driver.quit();
	}

}
