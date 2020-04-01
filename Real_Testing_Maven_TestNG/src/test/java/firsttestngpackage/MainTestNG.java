package firsttestngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//https://www.quora.com/How-do-I-practice-selenium-testing-on-free-live-projects

public class MainTestNG {
	
	public WebDriver driver;
  @BeforeTest
  public void setup()
  {
	  System.setProperty("webdriver.gecko.driver", "//Users//Raghu//Documents//Git_Jenkins//JenkinsPractice//Real_Testing_Maven_TestNG//geckodriver");
	driver = new FirefoxDriver();
  }
	
  @Test
  public void f() {
	  driver.get("http://demo.guru99.com/test/newtours/");
	  
  }
  
  @AfterTest
  public void terminate()
  {
	  driver.quit();
  }
}
