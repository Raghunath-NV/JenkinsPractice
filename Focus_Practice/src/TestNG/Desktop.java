package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Desktop {

	@AfterSuite
	public void DesktopLogin()
	{
		System.out.println("Desktop Login");
	}
	
	@Test
	public void DesktopPurchase()
	{
		System.out.println("Desktop Purchase");
	}
	
	@Test
	public void DesktopReturn()
	{
		System.out.println("Desktop Return");
	}
	
	@Test
	public void DesktopLogout()
	{
		System.out.println("Desktop Logout");
	}
}
