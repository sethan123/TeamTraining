package seleninum3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radio_button {
	
	
	@Test
	public void f() 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/radio.html");
		//yes/no
		driver.findElement(By.id("yes")).click();		
		//checked and unchecked		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/section[1]/div[2]/div[1]/div[1]/label[3]/input[1]")).click();
		//age group
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/section[1]/div[3]/div[1]/div[1]/input[3]")).click();		
	}

}
