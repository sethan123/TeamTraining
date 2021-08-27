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

public class Alert_screenshot {
	@Test
	public void f() throws AWTException, IOException 
{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		
		Robot r1=new Robot();
		java.awt.Dimension sc_size=  Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect1= new Rectangle(sc_size);
		BufferedImage source=r1.createScreenCapture(rect1);
		File Desitination = new File("C:\\Users\\sethan.g\\OneDrive - HCL Technologies Ltd\\Desktop\\reports\\screen4.jpg");
			ImageIO.write(source, "jpg",Desitination);
			
			driver.switchTo().alert().accept();
			

}
}