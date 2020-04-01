//Button loading delayed - handling with external wait

package seleniumAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase5 {

	@Test
	public void test6() throws Exception {

		Properties properties = new Properties();
		File src = new File(
				"/Users/Raghu/Documents/Git_Jenkins/JenkinsPractice/seleniumAssignment/src/test/resources/config.properties");
		FileInputStream ip = new FileInputStream(src);
		properties.load(ip);

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); // Dynamic Polymorphism

		driver.get("file:///Users/Raghu/Downloads/NewIndex.html");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("test5-button")));
		driver.findElement(By.id("test5-button")).click();
		Assert.assertEquals(driver.findElement(By.id("test5-alert")).getText(),
				properties.getProperty("buttonClickMessage"));

		driver.quit();
	}
}
