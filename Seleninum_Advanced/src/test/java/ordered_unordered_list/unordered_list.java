package ordered_unordered_list;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class unordered_list {
	@Test
	public void orderlist() throws InterruptedException 
{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.findElement(By.id("tags")).sendKeys("A");
		Thread.sleep(4000);		
		List<WebElement> element1=  driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));		  
		int len=element1.size();		
		System.out.println(len);
		
		for(WebElement list_values:element1)
		{
			if(list_values.getText().equalsIgnoreCase("soap"))
			{
				list_values.click();
				break;
			}
		}
		
		
		
		

}
}