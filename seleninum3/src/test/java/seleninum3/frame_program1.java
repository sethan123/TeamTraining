package seleninum3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame_program1 {
	@Test
	public void f() 
{
	
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/home.html");
	driver.findElement(By.xpath("//img[@alt='Frame']")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.id("Click")).click();
	
	driver.switchTo().defaultContent();//it will come to base screen, after that it wil go desired frame.
	//driver.switchTo().parentFrame();//first frame
	driver.switchTo().frame(1);
	driver.switchTo().frame("frame2");
	driver.findElement(By.id("Click1")).click();

	

}
}
