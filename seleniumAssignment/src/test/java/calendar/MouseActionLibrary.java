package calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionLibrary {

	public static void clickMouse(WebDriver driver,WebElement elementToClick)
	{
		System.out.println("action");
		Actions actions=new Actions(driver);
		actions.click(elementToClick).build().perform();
	}
}
