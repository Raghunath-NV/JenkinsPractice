package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory.HomePage;

public class ShoppingTestCase {

	public WebDriver driver;
	HomePage homePage;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver",
				"//Users//Raghu//Documents//Git_Jenkins//JenkinsPractice//Real_Testing_Maven_TestNG//geckodriver");
		driver = new FirefoxDriver();
		// driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo/");
		homePage = new HomePage(driver);
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	@Test
	public void selectCurrency(){
		
		homePage.selectCurrency(1);
	}
}
