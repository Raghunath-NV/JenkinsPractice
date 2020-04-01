//Click checkbox in the row where Cognizant appears

package seleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase6 {

	@Test
	public void test6() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); // Dynamic Polymorphism

		driver.get("file:///Users/Raghu/Downloads/NewIndex.html");
		WebElement bodyList = driver.findElement(By.tagName("tbody"));
		List<WebElement> rowData = bodyList.findElements(By.tagName("tr"));

//		for (int index = 0; index < rowData.size(); index++) {
//			WebElement element = rowData.get(index);
//			if (element.getText().contains("Ventosanzap")) {
//				// element.findElement(By.xpath("//td...//input")).click();
//				element.findElement(By.tagName("input")).click();
//			}
//
//		}
		// driver.quit();
		
		
		//driver.findElement(By.xpath("//td[contains(text(),'Cognizant')]//preceding-sibling::td/input[@type='checkbox']")).click();
	
//		WebElement element= driver.findElement(By.xpath("//td[contains(text(),'Cognizant')]"));
//		WebElement element2 = driver.findElement(By.xpath(element+"//parent::tr"));
//		WebElement element3 =driver.findElement(By.xpath(element2+"/td/input"));
		
		//element3.click();
		
		WebElement element4 = driver.findElement(By.xpath("//*[@id='test-6-div']/div/table/tbody/tr[3]/td[1]/input"));
		
		element4.click();
		//driver.findElement(By.xpath(element+ ""+element2 +""+element3 )).click();
	}
}
