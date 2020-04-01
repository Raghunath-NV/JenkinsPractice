package PageFactoryTestCases;

import PageFactory.HomePage;
import PageFactory.RegisterPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class RegisterpageTestCase {
	public WebDriver driver;
	HomePage homePage;
	RegisterPage registerPage;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver",
				"//Users//Raghu//Documents//Git_Jenkins//JenkinsPractice//Real_Testing_Maven_TestNG//geckodriver");
		driver = new FirefoxDriver();
	//	driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo/");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@Test(priority = 0)
	public void MainPageToRegisterPage() throws InterruptedException {
		homePage = new HomePage(driver);
        homePage.gotoRegisterPage();
        Assert.assertEquals("Register Account", driver.getTitle());
	}

	@Test(priority = 1)
	public void RegisterCustomer() {
		registerPage = new RegisterPage(driver);
		registerPage.setFirstName("Raghunath");
		registerPage.setLastName("N V");
		registerPage.setPassword("Raghu123!");
		registerPage.setEmail("abc4@abc.com");
		registerPage.setConfirmPassword("Raghu123!");
		registerPage.setRadioBtn(true);
		registerPage.setTelephone("8019356528");
		registerPage.setAgreeCheckBox();
		registerPage.clickContinueBtn();
		Assert.assertEquals("Your Account Has Been Created!", driver.getTitle());

	}

}
