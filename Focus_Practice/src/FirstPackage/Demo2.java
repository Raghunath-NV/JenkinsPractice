package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "//Users//Raghu//Downloads//chromedriver_2");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		 FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("raghu_is2010@yahoo.in");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("mysore");
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		
		
		//Xpath -> //tagName[@attribute='value']
		//CSS -> //tagName[attribute='value']
		//CSS - if we have id for element then -> tagName#id
	}

}

