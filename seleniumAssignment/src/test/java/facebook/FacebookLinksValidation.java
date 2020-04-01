package facebook;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLinksValidation {
	
	public String actualResponse,expectedResponse;
	
	@Test
	public void checkLinks() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> links=driver.findElements(By.xpath("//div[@id='pageFooterChildren']//li//a"));
		System.out.println("OP :"+links.size());
		for(int j=0;j<links.size();j++)
		{
			HttpsURLConnection httpsURLConnection=(HttpsURLConnection) new URL(links.get(j).getAttribute("href")).openConnection();
			httpsURLConnection.connect();
			actualResponse=httpsURLConnection.getResponseMessage();
			httpsURLConnection.disconnect();
			System.out.println(links.get(j).getAttribute("href")+ " --->"+actualResponse);	
			expectedResponse = "OK";
			assertEquals(actualResponse, expectedResponse);
		}
	
		
	}

}
