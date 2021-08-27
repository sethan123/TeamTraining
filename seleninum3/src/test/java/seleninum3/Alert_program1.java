package seleninum3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_program1 {
	

	@Test
	public void f() 
{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[9]/a[1]")).click();
		//Normal alert.
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		String msg =driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		
		
		//confirm alert
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		driver.switchTo().alert().accept();
		
		//confirm prompt()
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();		
		driver.switchTo().alert().sendKeys("chethanjesi");
		driver.switchTo().alert().accept();
		
		//lineBreaks
		driver.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();
		driver.switchTo().alert().accept();
		
		//Sweet alert
		driver.findElement(By.xpath("//button[@onclick='sweetalert()']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		
	}
}