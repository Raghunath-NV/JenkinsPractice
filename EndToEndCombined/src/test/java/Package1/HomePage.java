package Package1;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

/*public class HomePage extends base{

	public WebDriver driver;

	@Test
	public void basePageNavigation() throws IOException, InterruptedException {
		//base b = new base();
		driver = intializeDriver();
		driver.get("http://qaclickacademy.com");
		Thread.sleep(1000);
		LandingPage lp = new LandingPage(driver);
		lp.getSignin().click();
		System.out.println("Hello");
		LoginPage lgPage = new LoginPage(driver);
		lgPage.getLoginButton().click();
		driver.quit();

	}

} */

public class HomePage extends base {

	public static Logger log = LogManager.getLogger(HomePage.class.getName());

	@BeforeTest

	public void initialize() throws IOException

	{

		driver = initializeDriver();

	}

	@Test(dataProvider = "getData")

	public void basePageNavigation(String Username, String Password, String text) throws IOException

	{

		// one is inheritance

		// creating object to that class and invoke methods of it

		driver.get(prop.getProperty("url"));

		LandingPage l = new LandingPage(driver);

		l.getLogin().click(); // driver.findElement(By.css()

		LoginPage lp = new LoginPage(driver);

		((WebElement) lp.getEmail()).sendKeys(Username);

		lp.getPassword().sendKeys(Password);

		log.info(text);

		lp.getLoginButton().click();

	}

	@AfterTest

	public void teardown()

	{

		driver.close();

		driver = null;

	}

	@DataProvider

	public Object[][] getData()

	{

		// Row stands for how many different data types test should run

		// coloumn stands for how many values per each test

		// Array size is 2

		// 0,1

		Object[][] data = new Object[2][3];

		// 0th row

		data[0][0] = "nonrestricteduser@qw.com";

		data[0][1] = "123456";

		data[0][2] = "Restrcited User";

		// 1st row

		data[1][0] = "restricteduser@qw.com";

		data[1][1] = "456788";

		data[1][2] = "Non restricted user";

		return data;

	}

}
