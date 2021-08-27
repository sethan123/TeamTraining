package seleninum3;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.google.inject.spi.Element;

public class drag_drop_task {
	@Test
	public void f_drag() 
{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("chethanjesi");		
		WebElement element1 = driver.findElement(By.id("email"));		
		WebElement element = driver.findElement(By.cssSelector("input[value='Append ']"));
		Actions act = new Actions(driver);
	      act.doubleClick(element1).build().perform();
	      act.keyDown(Keys.CONTROL).sendKeys("x").build().perform();
	      act.click(element).keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	  
		
//Action dragAndDrop = act.clickAndHold(element)
//				.moveToElement(element1)
//				.release(element1)
//				.dragAndDrop(element, element1)
//				.release(element1)
//				.build();
//				dragAndDrop.perform();//doubt
//				
				//	act.sendKeys(element, "chethanjesi")
				//.doubleClick()
				//.contextClick().build().perform();
		
		//(new Actions(driver)).dragAndDrop(element, element1).perform();
				
				
//				Robot rob = new Robot();			 
//
//		         act.sendKeys(email, "Sathish").doubleClick().build().perform();	 
//
//		         rob.keyPress(KeyEvent.VK_CONTROL);
//		         rob.keyPress(KeyEvent.VK_C);	 
//
//		         act.moveToElement(append).click().build().perform();	 
//
//		        rob.keyPress(KeyEvent.VK_CONTROL);
//		         rob.keyPress(KeyEvent.VK_V);
}

	
}