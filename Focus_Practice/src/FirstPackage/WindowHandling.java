package FirstPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		 FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> windowIds=driver.getWindowHandles();
		Iterator<String> it=windowIds.iterator();
		
		String parentWindow = it.next();
		String childWindow = it.next();
		
		System.out.println("Current Window title is "+driver.getTitle());
		driver.switchTo().window(childWindow);
		System.out.println("After changing Window title is "+driver.getTitle());
		
		driver.quit();
	}

}
