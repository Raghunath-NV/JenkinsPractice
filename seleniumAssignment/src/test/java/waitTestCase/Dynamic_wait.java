package waitTestCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.library.*;

public class Dynamic_wait {

	// @Test
	public void contacts() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); // Dynamic Polymorphism

		driver.get("https://jupiter.cloud.planittesting.com/#/contact");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.id("forename")).sendKeys("test");
		driver.findElement(By.id("email")).sendKeys("test");
		driver.findElement(By.id("message")).sendKeys("test");
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		WebElement element = driver.findElement(By.xpath("//strong[contains(text(),'Thanks')]"));
		DynamicWaitLibrary.dynamic_wait(driver, element, 10);

		String text = element.getText();
		Assert.assertEquals(text, "Thanks test");

	}

	@Test
	public void shop() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); // Dynamic Polymorphism
		driver.get("https://jupiter.cloud.planittesting.com/#/shop");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[text()='Buy'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Buy'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Buy'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Buy'])[3]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[2]/li[4]/a")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//tbody//tr"));
		int items = 0;
		for (WebElement e : elements) {
			items = items + Integer.parseInt(e.findElement(By.tagName("input")).getAttribute("value"));
		}
		System.out.println("Number of items :" + items);
	}

}
