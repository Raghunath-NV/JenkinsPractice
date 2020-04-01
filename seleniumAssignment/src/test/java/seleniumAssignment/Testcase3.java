//Bootstrap Dropdown

package seleniumAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 {

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

		driver.findElement(By.id("dropdownMenuButton")).click();

		List<WebElement> list = driver.findElements(By.xpath("//div[@aria-labelledby='dropdownMenuButton']"));

		for (WebElement w : list) {
			if (w.getText().contains(properties.getProperty("option"))) {
				w.click();
			}
		}

		// driver.quit();
	}
}
