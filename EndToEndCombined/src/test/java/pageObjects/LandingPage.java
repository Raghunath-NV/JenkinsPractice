package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*public class LandingPage {

	public WebDriver driver;

	@FindBy(xpath = "//*[@class='fa fa-lock fa-lg']")
	By signin;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin() {
		return driver.findElement(signin);
	}

}*/


public class LandingPage {

	public WebDriver driver;

	By signin = By.cssSelector("a[href*='sign_in']");

	By title = By.cssSelector(".text-center>h2");

	By NavBar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");

	By popup = By.xpath("//button[text()='NO THANKS']");

	public LandingPage(WebDriver driver) {

		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getLogin()

	{

		return driver.findElement(signin);

	}

	public WebElement getNavigationBar()

	{

		return driver.findElement(NavBar);

	}

	public int getPopUpSize()

	{

		return driver.findElements(popup).size();

	}

	public WebElement getPopUp()

	{

		return driver.findElement(popup);

	}

	public WebElement getTitle()

	{

		return driver.findElement(title);

	}

}
