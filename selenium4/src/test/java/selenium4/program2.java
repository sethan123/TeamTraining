//website :http://the-internet.herokuapp.com/

package selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class program2 {
	@Test
	public void fablous() 
{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/abtest']")).click();
		
		//driver.findElement(By.xpath("//a[@href='/abtest']")).click();
		//driver.findElement(By.partialLinkText("A/B Testi")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='A/B Testing']")).click();
		
}
}
