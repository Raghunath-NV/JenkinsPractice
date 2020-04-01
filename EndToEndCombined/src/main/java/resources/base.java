package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

/*public class base {

	public WebDriver driver;

	public WebDriver intializeDriver() throws IOException {
		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"/Users/Raghu/Documents/Git_Jenkins/JenkinsPractice/EndToEndCombined/src/main/java/resources/data.properties");
		prop.load(fis);
		System.setProperty("webdriver.gecko.driver", "/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		if (prop.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (prop.getProperty("browser").equals("chrome")) {
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("IE")) {
			driver = new InternetExplorerDriver();
		} else {
			driver = new SafariDriver();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
} */


public class base {

	public static WebDriver driver;

	public Properties prop;

	public WebDriver initializeDriver() throws IOException

	{

		prop = new Properties();

		FileInputStream fis = new FileInputStream("src/main/java/resources/data.properties");

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		System.out.println(browserName);

		if (browserName.equals("chrome"))

		{

			//System.setProperty("webdriver.chrome.driver", "src/main/java/WebDrivers/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");

			ChromeOptions options = new ChromeOptions();

			if (browserName.contains("headless")) {

				options.addArguments("headless");

			}

			driver = new ChromeDriver(options);

			// execute in chrome driver

		}

		else if (browserName.equals("firefox"))

		{

			driver = new FirefoxDriver();

			// firefox code

		}

		else if (browserName.equals("IE"))

		{

			driver = new InternetExplorerDriver();

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}

}
