package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id='user_email']")
	public By email;

	@FindBy(xpath = "//*[@id='user_password']")
	public By password;

	@FindBy(xpath = "//*[@id='new_user']/div[3]/input")
	public By loginButton;

	public By getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}

}
