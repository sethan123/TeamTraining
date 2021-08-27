package seleninum3;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class webdriver_buttons {
	
	@Test
	public void f() 
{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
		
		//driver.findElement(By.id("home")).click();
		//driver.findElement(By.id("position")).click();
		//driver.findElement(By.id("color")).click();				
		driver.findElement(By.cssSelector("#size")).click();
		
}
	

}
