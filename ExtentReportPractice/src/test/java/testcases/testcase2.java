package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class testcase2 {

	@Test
	public void loginPassTest() {

		System.out.println("Pass Test");
	}

	@Test
	public void loginFailTest() {

		AssertJUnit.fail();
	}

	@Test
	public void loginSkipTest() {
		throw new SkipException("skipping test case");
	}
}
