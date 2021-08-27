package seleninum3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windowhandle {
	@Test
	public void f() 
{
	
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/home.html");
	driver.findElement(By.xpath("//img[@alt='Windows']")).click();
	driver.findElement(By.id("home")).click();
	
	 Set<String> window_values=  driver.getWindowHandles();
	Iterator<String> it1= window_values.iterator();
	
	String w1=it1.next();
	System.out.println(w1);
	
	String w2=it1.next();
	System.out.println(w2);
	
	driver.switchTo().window(w2);
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	

}
}