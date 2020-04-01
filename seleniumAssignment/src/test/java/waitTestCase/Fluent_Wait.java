package waitTestCase;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluent_Wait {

	@Test
	public void fluent() {
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver(); // Dynamic Polymorphism
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				
				
				//return driver.findElement(By.xpath("//p[contains(.,'WebDriver')]"));
				WebElement ele= driver.findElement(By.id("demo"));
				String value = ele.getAttribute("innerHTML");
				if(value.equalsIgnoreCase("WebDriver"))
				{
					return ele;
				}
				else{
					System.out.println("Current Text Value :"+value);
					return null;
				}
			}
		});
		
		System.out.println("element is displayed ?"+ element.isDisplayed());
	}
}
