package FirstPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HTML_Tables {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		 FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/24395/slt-vs-rpr-32nd-match-bangladesh-premier-league-2019-20");
		//WebElement totalScores= driver.findElement(By.xpath("//div[@id='innings_1']"));
		
		WebElement totalScores = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		//*[@id="innings_1"]/div[4]
		
		//WebElement batsmenScores = totalScores.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']"));
		
		//WebElement batsmenScores = totalScores.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']"));
		
		System.out.println(" Size is "+ totalScores.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']")).size());
		
		for(int i=0;i<totalScores.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();i++)
		{
			System.out.println(i+"   "+ totalScores.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		}
		
		driver.quit();
	}

}

//cb-col cb-col-8 text-right text-bold
