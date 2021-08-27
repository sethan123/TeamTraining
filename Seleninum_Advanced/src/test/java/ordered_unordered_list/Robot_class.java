package ordered_unordered_list;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Robot_class {	

		@Test
		public void f() throws AWTException, IOException 
	{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.leafground.com/home.html");
			driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[9]/a[1]")).click();
			//Normal alert.
			driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
			String msg =driver.switchTo().alert().getText();
			System.out.println(msg);
			//driver.switchTo().alert().accept();
			
			
			Robot r1=new Robot();
		java.awt.Dimension sc_size=  Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect1= new Rectangle(sc_size);
		BufferedImage source=r1.createScreenCapture(rect1);
		File Desitination = new File("C:\\Users\\sethan.g\\OneDrive - HCL Technologies Ltd\\Desktop\\reports\\screen2.jpg");
			ImageIO.write(source, "jpg",Desitination);
			
			
			
	}}
