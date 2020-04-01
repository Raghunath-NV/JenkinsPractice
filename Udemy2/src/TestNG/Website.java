package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Website {
	@AfterClass
	public void WebsiteLogin()
	{
		System.out.println("Website Login");
	}
	
	@Test
	public void WebsitePurchase()
	{
		System.out.println("Website Purchase");
	}
	
	@Test
	public void WebsiteReturn()
	{
		System.out.println("Website Return");
	}
	
	@Test(dependsOnMethods = {"WebsitePurchase"})
	public void WebsiteLogout()
	{
		System.out.println("Website Logout");
	}
}
