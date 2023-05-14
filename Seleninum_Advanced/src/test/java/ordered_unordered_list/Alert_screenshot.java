package ordered_unordered_list;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_screenshot {
	@Test
	public void f() throws AWTException, IOException, InterruptedException 
{
		//System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		
		Robot r1=new Robot();
		java.awt.Dimension sc_size=  Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect1= new Rectangle(sc_size);
		BufferedImage source=r1.createScreenCapture(rect1);
		File Desitination = new File("F:\\Practice\\screen.jpg");
			ImageIO.write(source, "jpg",Desitination);
			
			
			Thread.sleep(5000);
			
			driver.switchTo().alert().accept();
			
			driver.close();
			
			

}
}