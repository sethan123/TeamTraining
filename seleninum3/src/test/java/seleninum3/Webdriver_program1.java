package seleninum3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_program1 {
	
	@Test
	public void f()  {
		
		//System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("email")).sendKeys("chethanjesi");
		driver.findElement(By.cssSelector("input[value='Append ']")).sendKeys("good morning");
		driver.findElement(By.name("username")).sendKeys("good afternoon");
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("good night");
		driver.findElement(By.cssSelector("input[style='width:350px;background-color:LightGrey;']")).click();

		
	}
	

}
