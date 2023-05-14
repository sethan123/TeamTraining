package ordered_unordered_list;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice2_unorderedlist {
	
	
	@Test
	public void orderlist() throws InterruptedException, AWTException, IOException 
{
//		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Selectable.html");
		
		
		List<WebElement> element1=driver.findElements(By.xpath("//ul[@class='deaultFunc']/li"));		
		int length=element1.size();
		System.out.println(length);
		
		Actions act1= new Actions(driver);
		 act1.keyDown(Keys.CONTROL)
		 	.click(element1.get(0))
		 	.click(element1.get(2))
		 	.click(element1.get(4))
		 	.click(element1.get(6)).build().perform();
		 

			Robot r1=new Robot();
		java.awt.Dimension sc_size=  Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect1= new Rectangle(sc_size);
		BufferedImage source=r1.createScreenCapture(rect1);
		File Desitination = new File("C:\\Users\\sethan.g\\OneDrive - HCL Technologies Ltd\\Desktop\\reports\\screen3.jpg");
			ImageIO.write(source, "jpg",Desitination);

}
}