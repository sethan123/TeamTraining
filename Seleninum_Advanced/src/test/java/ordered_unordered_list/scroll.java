package ordered_unordered_list;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scroll {
	@Test
	public void orderlist() throws InterruptedException 
{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		// scroll page
		//js.executeScript("scroll(0,240)");
		//driver.findElement(By.xpath("//a[@class='link facebook']")).click();
		
		//scroll with in the page
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		WebElement elememt1=driver.findElement(By.xpath("//textarea[contains(text(),'textarea')]"));
		js1.executeScript("arguments[0].scrollIntoView(true);",elememt1);
		
		elememt1.sendKeys("chethanjesi");
		
}
}
