package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.redifflogin;

public class login {

	
	
	@Test
	public void loginref()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediffmailpro.com/cgi-bin/login.cgi");
		redifflogin rd=new redifflogin(driver);
		rd.Email().sendKeys("chethanjesi@gmail.com");
		rd.pwd().sendKeys("password");
		rd.go().click();
	}
	
}
