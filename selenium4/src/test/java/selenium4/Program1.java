//Website::http://book.theautomatedtester.co.uk/

package selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program1 {

	@Test
	public void f() 
{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://book.theautomatedtester.co.uk/");
		driver.findElement(By.id("q")).sendKeys("chethanjesi");
		//driver.findElement(By.cssSelector("body:nth-child(2) div.mainbody:nth-child(2) ul:nth-child(1) li:nth-child(1) > a:nth-child(1)")).click();
		driver.findElement(By.linkText("Chapter1")).click();
		
		driver.findElement(By.id("radiobutton")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Selenium RC')]")).click();		
		driver.findElement(By.name("selected(1234)")).click();
		//driver.findElement(By.linkText("Home Page")).click();
		
		driver.findElement(By.id("secondajaxbutton")).click();
		driver.findElement(By.className("multiplewindow")).click();
		driver.findElement(By.className("multiplewindow2")).click();
		driver.findElement(By.id("loadajax")).click();
		driver.findElement(By.id("verifybutton")).click();
		driver.findElement(By.id("storeinput")).sendKeys("chethanjesi");
		
		String str=driver.findElement(By.cssSelector("#html5div")).getText();
		System.out.println(str);
		
		
		
}
}