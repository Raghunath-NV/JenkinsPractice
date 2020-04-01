package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mobile {
	@BeforeTest
	@Parameters("myName")
	public void MobileLogin(String name)
	{
		System.out.println("Mobile Login Welcome "+name);
	}
	
	@Test
	public void MobilePurchase()
	{
		System.out.println("Mobile Purchase");
	}
	
	@Test
	public void MobileReturn()
	{
		System.out.println("Mobile Return");
	}
	
	@Test(enabled=false)
	public void MobileLogout()
	{
		System.out.println("Mobile Logout");
	}
}

