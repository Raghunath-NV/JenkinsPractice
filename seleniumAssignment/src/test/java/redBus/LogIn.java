package redBus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogIn {

	@Test
	public void Login() throws Exception {
		// TODO Auto-generated constructor stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); // Dynamic Polymorphism

		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
		driver.findElement(By.xpath("//*[@id='signInLink']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		driver.findElement(By.id("mobileNoInp")).sendKeys("1234567890");
	}

}
