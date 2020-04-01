package com.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWaitLibrary {
	
	public static void dynamic_wait (WebDriver driver, WebElement element,int timeout) {
		new WebDriverWait(driver, timeout)
		.until(ExpectedConditions.visibilityOf(element));
		
		
	}

}
