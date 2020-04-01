package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='top-links']/ul/li[2]/a/span[1]")
	WebElement MyAccount;
	
	@FindBy(xpath="//*[@id='top-links']/ul/li[2]/ul/li[1]/a")
	WebElement Register;
	
	 public HomePage(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	 public void gotoRegisterPage()
	 {
		 MyAccount.click();
		 Register.click();
	 }

}
