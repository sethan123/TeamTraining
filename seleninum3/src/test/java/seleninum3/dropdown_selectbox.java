package seleninum3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown_selectbox {
	
	@Test
	public void f() 
{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]/img[1]")).click();
		Select dropdown =new Select(driver.findElement(By.id("dropdown1")));
		dropdown.selectByVisibleText("Selenium");
		dropdown.selectByValue("2");
		dropdown.selectByIndex(4);
		
		
		boolean msg = dropdown.isMultiple();
		System.out.println(msg);
		

		
		
		//driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[2]/select[1]")).click();
		//Select dropdown1 =new Select(driver.findElement(By.id("dropdown2")));
		//dropdown1.selectByIndex(3);
		
		
		
		
		
		
		
		
}
}

