package FirstPackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Ninja_Project {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/Raghu/Documents/Git_Jenkins/JenkinsPractice/Ninja_Project/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://http://tutorialsninja.com/demo/");
		driver.quit();
	}
}
