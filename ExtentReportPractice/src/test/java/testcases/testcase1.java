package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class testcase1 {

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest
	public void setReport() {
		htmlReporter = new ExtentHtmlReporter("./Reports/extentReport.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Extent Report Automation");
		htmlReporter.config().setReportName("Automation Report");
		htmlReporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@AfterTest
	public void Report() {
		extent.flush();
	}

	@Test
	public void loginPassTest() {
		test = extent.createTest("Login Pass Test");

	}

	@Test
	public void loginFailTest() {
		test = extent.createTest("Login Fail Test");
		AssertJUnit.fail();
	}

	@Test
	public void loginSkipTest() {
		test = extent.createTest("Login Skip Test");
		throw new SkipException("skipping test case");
	}

	@AfterMethod
	public void TearDown(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		String logText = "</b>" + "TEST CASE : - " + methodName.toUpperCase();
		Markup m;
		if (result.getStatus() == ITestResult.SUCCESS) {

			logText = logText + "   PASSED" + "</b>";
			m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			test.pass(m);
		} else if (result.getStatus() == ITestResult.FAILURE) {
			logText = logText + "   FAILED" + "</b>";
			m = MarkupHelper.createLabel(logText, ExtentColor.RED);
			test.fail(m);
		} else if (result.getStatus() == ITestResult.SKIP) {
			logText = logText + "   SKIPPED" + "</b>";
			m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
			test.skip(m);
		}
	}

}
