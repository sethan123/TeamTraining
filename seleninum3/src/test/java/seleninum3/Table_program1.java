package seleninum3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table_program1 {
	@Test
	public void f() throws InterruptedException 
{

	//System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/table.html");	
	String str=driver.findElement(By.xpath("//body/div[@id='content']/div[@id='wrapper']/div[1]/div[3]/section[1]/div[2]/div[1]/div[1]")).getText();
	System.out.println(str);
	
	
}
}