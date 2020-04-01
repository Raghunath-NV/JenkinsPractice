package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEndTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		 FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://rahulshettyacademy.com/AutomationPractice/");
  
 //Static DROP DOWN
		Select s=new Select(driver.findElement(By.xpath("//*[@id='dropdown-class-example']")));
        //s.selectByValue("option1");   //selecting by value
        //s.selectByIndex(2);           //by index
        s.selectByVisibleText("Option3"); //by text
        System.out.println(s.isMultiple());
      //*[@id="checkBoxOption1"]
  
 //Check Box
        System.out.println("Number of check boxes : "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());  //number of check boxes
        System.out.println("Number of check boxes : "+driver.findElements(By.xpath("//*[@type='checkbox']")).size());
        
        driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
        
        
//Radio Button
        System.out.println("Number of Radio Buttons : "+driver.findElements(By.xpath("//*[@type='radio']")).size());
        //driver.findElement(By.xpath("//*[@id='radio-btn-example']/fieldset/label[1]/input")).click();
        driver.findElement(By.xpath("//*[@value='radio2']")).click();
        
        System.out.println("Is radio1 selected ?: "+ driver.findElement(By.xpath("//input[@value='radio1']")).isSelected());


//Alerts
        
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Raghunath");
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        System.out.println("Text in alert box is : "+driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
		Thread.sleep(2000);
		driver.quit();

	}

}
