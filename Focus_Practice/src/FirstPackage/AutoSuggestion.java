package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
	JavascriptExecutor js= (JavascriptExecutor)driver;
	String command="return document.getElementById(\"fromPlaceName\").value;";
	while(!js.executeScript(command).toString().equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
	{
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		System.out.println(js.executeScript(command).toString());
	}
	
	driver.quit();

	}

}
