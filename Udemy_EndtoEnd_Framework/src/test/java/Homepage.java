import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resource.base;


public class Homepage extends base{
	
	
	@Test
	public void basepageNavigation() throws IOException
	{
		driver =initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		
		
		
		
		
	}
		
		
		
	
 

}
