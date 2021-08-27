package ordered_unordered_list;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practice1_unordered {
	@Test
	public void orderlist() throws InterruptedException 
{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/AutoComplete.html");
		driver.findElement(By.id("searchbox")).sendKeys("i");
		Thread.sleep(2000);
		List<WebElement> element2=  driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));	
		int lenth=element2.size();
		System.out.println(lenth);
		driver.manage().deleteAllCookies();
		Thread.sleep(6000);
		
		for(WebElement list_values:element2)
		{
			if(list_values.getText().equalsIgnoreCase("india"))
			{
				list_values.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.id("searchbox")).sendKeys("fren");
	Thread.sleep(2000);
	//driver.navigate().back();
		List<WebElement> element3=  driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));	
		int lenth1=element3.size();
		System.out.println(lenth);
		Thread.sleep(6000);
		for(WebElement list_values:element3)
		{
			if(list_values.getText().equalsIgnoreCase("French Guiana"))
			{
				list_values.click();
				break;
			}
}
		
		
}
}
