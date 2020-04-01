package FirstPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HTML_Table_Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
		int rowCount = table.findElements(By.tagName("tr")).size();
		System.out.println("Row count is " + rowCount);
		WebElement columnCount = table.findElement(By.xpath("//table[@id='product']/tbody/tr"));
		System.out.println("Column count is " + columnCount.findElements(By.tagName("th")).size());

		List<WebElement> recordsData = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));

		for (int i = 0; i < recordsData.size(); i++) {
			if (i == 2) {
				System.out.println(recordsData.get(i).getText());
			}
		}

		driver.quit();
	}

}
