package FirstPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.*;



public class ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("/Users/Raghu/Downloads/screenshot.png"));
		
		driver.quit();

	}

}
