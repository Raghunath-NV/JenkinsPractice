package Ninja_Register;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void goToWebSite() throws InterruptedException {
	  driver.get("http://tutorialsninja.com/demo/");
	  driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/span[1]")).click();
	  Thread.sleep(10);
	  driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
	  AssertJUnit.assertEquals("Register Account", driver.getTitle());
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "//Users//Raghu//Documents//Git_Jenkins//JenkinsPractice//Real_Testing_Maven_TestNG//geckodriver");
	  driver = new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
