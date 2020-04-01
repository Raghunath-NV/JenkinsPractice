package FirstPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SortingTableCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//*[@id='sortableTable']/thead/tr/th[2]/b")).click();
		//driver.findElement(By.xpath("//*[@id='sortableTable']/thead/tr/th[2]/b")).click();
		List<WebElement> data=driver.findElements(By.xpath("//*[@id='sortableTable']/tbody/tr/td[2]"));
		ArrayList<String> originalData=new ArrayList<String>();
	
	
		
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
			originalData.add(data.get(i).getText());
		}
		
		ArrayList<String> sortedData=new ArrayList<String>(originalData);
		//Collections.sort(sortedData); //Ascending
		Collections.sort(sortedData,Collections.reverseOrder());
		System.out.println("Sorted :"+originalData.equals(sortedData));
		driver.quit();

	}
	
	//*[@id="sortableTable"]/thead/tr/th[2]/b

}
