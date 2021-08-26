package Extend_Report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class Extend_Report {
	ExtentReports extent;



	@BeforeTest

	public void config()

	{

	// ExtentReports , ExtentSparkReporter

	String path =System.getProperty("user.dir")+"\\reports\\index.html";

	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("We Automation Result");
	reporter.config().setDocumentTitle("Test Results");

	extent =new ExtentReports();

	extent.attachReporter(reporter);

	extent.setSystemInfo("Tester", "chethan");

	}

	@Test

	public void initialDemo()

	{

	extent.createTest("Initial Demo");

	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

	WebDriver driver =new ChromeDriver();

	driver.get("https://rahulshettyacademy.com");

	System.out.println(driver.getTitle());

	driver.close();

	//test.fail("Result do not match");

	extent.flush();
	}
}
