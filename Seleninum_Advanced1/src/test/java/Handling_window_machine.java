import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.read.biff.BiffException;

public class Handling_window_machine {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException, BiffException , IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		
		driver.findElement(By.id("pickfiles")).click();
		
		String file="C:\\Users\\sethan.g\\Downloads\\Training\\Selenium completed notes_Udemy.docx";
		
		StringSelection select1=new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
		
		Thread.sleep(4000);
		
		Robot robot1=new Robot();
		
		robot1.keyPress(KeyEvent.VK_CONTROL);
		
		robot1.keyPress(KeyEvent.VK_V);
		
		robot1.keyRelease(KeyEvent.VK_V);
		
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		
		robot1.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//button[@id='processTask']")).click();
		
		 }
	}