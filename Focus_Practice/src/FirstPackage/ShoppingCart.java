package FirstPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		 FirefoxDriver driver=new FirefoxDriver();
		 
		 //Implicit wait
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List a =new ArrayList();
		a.add("Grapes");
		a.add("Pista");
		List<WebElement> listOfProducts = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<listOfProducts.size();i++)
		{
			
			System.out.println(listOfProducts.get(i).getText());
			String[] veggie = listOfProducts.get(i).getText().split("-");
			
			if(a.contains(veggie[0].trim()))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
		}
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[3]/a[4]/img")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		

		Select s=new Select(driver.findElement(By.xpath("//*[@class='products']/div/div/select")));
		s.selectByValue("India");
		
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		
		
		driver.quit();

	}

}
