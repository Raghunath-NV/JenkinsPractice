package FirstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "//Users//Raghu//Downloads//chromedriver_2");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		 FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println("Hello "+driver.getTitle() +" "+driver.getCurrentUrl());
		driver.get("http://facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
		
	}

}
