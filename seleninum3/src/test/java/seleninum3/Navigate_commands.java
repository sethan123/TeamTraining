package seleninum3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigate_commands {
	@Test
	public void f() throws InterruptedException 
{

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/home.html");
	driver.manage().window().maximize();
	Thread.sleep(200);
	
	driver.findElement(By.xpath("//img[@alt='Windows']")).click();
	
	Dimension dm=new Dimension(100, 240);
	driver.manage().window().setSize(dm);
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.navigate().to("https://www.google.com/");
	
}
}