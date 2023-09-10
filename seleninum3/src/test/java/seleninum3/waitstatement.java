package seleninum3;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitstatement {
	
	@Test
	public void f() 
{
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Implict wait --> through the script we can porvide a wait statement
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.leafground.com/home.html");
		
		
		// Explict wait--> it is to specific element is tested , only for that element will be wait.
		
		
		// for text--> table value//
		WebDriverWait var=new WebDriverWait(driver,Duration.ofSeconds(20));
		var.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='wrapper']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[9]/a[1]")));
		
		// for the position of clickable, we can procedure the action(eg--> radio button, check box, buttons)
		WebDriverWait var1=new WebDriverWait(driver, Duration.ofSeconds(20));
		var1.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='wrapper']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[9]/a[1]")));
		
		//for the position of selectable, we can procedure the action(eg-->dropdown)
		WebDriverWait var2=new WebDriverWait(driver, Duration.ofSeconds(20));
		var2.until(ExpectedConditions.elementToBeSelected(By.xpath("//body/div[@id='wrapper']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[9]/a[1]")));
		
		//for the position of frame, we can procedure the action(eg-->frame)
				WebDriverWait var3=new WebDriverWait(driver, Duration.ofSeconds(20));
				var3.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//body/div[@id='wrapper']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[9]/a[1]")));
				
				//for the position of alert, we can procedure the action(eg-->frame)
				WebDriverWait var4=new WebDriverWait(driver, Duration.ofSeconds(20));
				var4.until(ExpectedConditions.alertIsPresent());
				
				
		
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[9]/a[1]")).click();
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		String msg =driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();

}
}