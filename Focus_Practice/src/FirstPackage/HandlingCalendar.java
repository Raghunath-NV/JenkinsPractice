package FirstPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCalendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/Raghu/Documents/workspace2/Udemy1/geckodriver2");
		 FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.skyscanner.com");
		driver.findElement(By.xpath("//*[@id='depart-fsc-datepicker-button']/span")).click();
		
		
		//driver.findElement(By.xpath("//*[@id='depart-calendar__bpk_calendar_nav_select']")).click();
		Select s=new Select(driver.findElement(By.xpath("//*[@id='depart-calendar__bpk_calendar_nav_select']")));
		s.selectByVisibleText("May 2020");
        
		WebElement datesData =driver.findElement(By.xpath("//*[@class='BpkCalendarGrid_bpk-calendar-grid__sak14 FlightDatepicker_fsc-datepicker__list-size__1UX2a']/tbody"));
		
		for(int i=0;i< datesData.findElements(By.tagName("button")).size();i++)
		{
			
			WebElement w= datesData.findElements(By.tagName("button")).get(i);
			System.out.println("hello"+w.getText());
			if(w.getText().contains("15"))
			{
				System.out.println("hello123");	
				w.click();
				//w.click();
				System.out.print(w.getText());
				break;
			}
			
			
		}

	}

}
