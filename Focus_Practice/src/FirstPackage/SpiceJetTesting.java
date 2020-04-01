package FirstPackage;

import javax.security.auth.kerberos.KerberosKey;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJetTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		 FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("MAA");
		
		//driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("BOM");
		
		driver.findElement(By.xpath("//a[@value='BOM'")).click();
		
		
		Select s= new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByVisibleText("USD");
		
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		s=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		
		s.selectByVisibleText("8");
		
		s=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Child']")));
		s.selectByVisibleText("1");
		
		driver.findElement(By.xpath("//*[@for='ctl00_mainContent_chk_StudentDiscount']")).click();
		
		//driver.getKeyboard().pressKey(Ke));
		
		
		
		
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
