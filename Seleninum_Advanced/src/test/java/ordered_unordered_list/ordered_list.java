package ordered_unordered_list;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ordered_list {
	
	@Test
	public void orderlist() throws InterruptedException 
{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		//used to select the entire select options
		List<WebElement> element1=driver.findElements(By.xpath("//ol[@class='ui-selectable']/li"));		
		int length=element1.size();
		System.out.println(length);
		
		Actions act1= new Actions(driver);
		 act1.keyDown(Keys.CONTROL)
		 	.click(element1.get(0))
		 	.click(element1.get(2))
		 	.click(element1.get(4))
		 	.click(element1.get(6)).build().perform();
		
		

}
}