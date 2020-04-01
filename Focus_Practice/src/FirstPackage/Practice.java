package FirstPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		 FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		System.out.println("Number of anchor tags in page is "+driver.findElementsByTagName("a").size());
		System.out.println("Number of anchor tags in page is "+driver.findElements(By.tagName("a")).size());
		
		
		WebElement listOfElements=driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]"));
		
		System.out.println("Number of anchor tags under Latest news section is "+listOfElements.findElements(By.tagName("a")).size());
		
		for(int i=0;i<listOfElements.findElements(By.tagName("a")).size();i++)
		{
			//opening each anchor tag
			listOfElements.findElements(By.tagName("a")).get(i).click();
		}
		
		driver.quit();

	}

}
