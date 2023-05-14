package Ksrtc_Value_page;

import java.awt.AWTException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Kstrc_Mainpage.Ksrtc_Login;
import Kstrc_Mainpage.Ksrtc_Main_Sign_in;
import Kstrc_Mainpage.Search_for_bus;
import Kstrc_Mainpage.selecting_desitination;
import elements.locators;
import fuctionality.login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KSRTC_Value {

	@Test
	public void f() throws AWTException, IOException, InterruptedException 
{
	

	//System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://ksrtc.in/oprs-web/user/add.do");
	driver.manage().window().maximize();

	Ksrtc_Main_Sign_in.emailid(driver).sendKeys("sethanjo1501@gmail.com");
	Ksrtc_Main_Sign_in.fullname(driver).sendKeys("chethanjesi");
	Ksrtc_Main_Sign_in.mobileNo(driver).sendKeys("9488392845");
	Ksrtc_Main_Sign_in.SaveBtn(driver).click();
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	
			// Login the KSRTC by using creadtials.
			
			Ksrtc_Login.signin(driver).click();
			driver.manage().window().maximize();
			Ksrtc_Login.username(driver).sendKeys("sethanjo1501@gmail.com");
			Ksrtc_Login.password(driver).sendKeys("Chethanjesi@143");
			Ksrtc_Login.submitBtn(driver).click();
			
			//selecting location
			selecting_desitination.destination(driver).click();
			selecting_desitination.from_date(driver).click();
			selecting_desitination.select_todate(driver).click();
			selecting_desitination.todate(driver).click();
			
			
			//selecting the check box.
			Search_for_bus.popup(driver).click();
			Search_for_bus.submit_button(driver).click();
}
}