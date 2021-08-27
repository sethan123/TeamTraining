package seleninum3;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actionsclass {
	
	@Test
	public void f() 
{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		
		WebElement element = driver.findElement(By.id("email"));
		Actions act=new Actions(driver);
		
		act.sendKeys(element, "chethanjesi")
		.doubleClick()
		.contextClick().build().perform();
		
		
		
		
		

}}

