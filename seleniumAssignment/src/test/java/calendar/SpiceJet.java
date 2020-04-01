package calendar;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {

	@Test
	public void SelectSpiceJetDate() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		WebElement element=driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
		String dateString = "30-Sep-2029";
		selectDate(dateString, driver,element );
		

	}

	public void selectDate(String date, WebDriver driver, WebElement element) throws Exception {
		Thread.sleep(2000);
		element.click();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date inputDate = simpleDateFormat.parse(date);
		Date today = new Date();
		int days = inputDate.compareTo(today);
		if (!(days > 0)) {
			System.out.println("Past Date");
		} else {
			int year = inputDate.getYear();
			int inputYear = year + 1900; // checking leap year
			int uiyear = Integer
					.parseInt(driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText());
			int A = inputYear - uiyear;
			if (A == 0 || A == 1) {
				int month = inputDate.getMonth();
				String uiMonth = convertMonth(month);
				for (int i = 0; i < 11; i++) {
					try {
						driver.findElement(By.xpath("//span[text()='" + uiMonth + "']"));
						break;
					} catch (Exception e) {
						// TODO: handle exception
						driver.findElement(By.xpath("//span[text()='Next']")).click();
						continue;
					}
				}
				SimpleDateFormat format_Today_date = new SimpleDateFormat("dd");
				String currentDate = format_Today_date.format(inputDate);

				driver.findElement(By.xpath("//*[@data-month=" + month + "and @data-year = " + inputYear
						+ "]/a[text()='" + currentDate + "']")).click();
			}
			else{
				System.out.println("Not a valid input");
			}
		}
	}

	public static String convertMonth(int month) {
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		return monthNames[month];
	}
}
