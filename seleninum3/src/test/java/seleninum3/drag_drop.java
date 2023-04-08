package seleninum3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class drag_drop {
	
	
	@Test
	public void f() 
{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.leafground.com/pages/drop.html");
		
		//WebElement element = driver.findElement(By.id("draggable"));
		//WebElement element1 = driver.findElement(By.id("droppable"));
		//Actions act=new Actions(driver);
		//act.dragAndDrop(element, element1).build().perform();
		
		
		//driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Draggable']")).click();
		WebElement element3 = driver.findElement(By.id("draggable"));
		Actions act1=new Actions(driver);
		act1.dragAndDropBy(element3, 250, 350).build().perform();//if we dont know the droable location, we can use dimestion
		
}
}