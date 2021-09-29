//https://medium.com/analytics-vidhya/web-scraping-instagram-with-selenium-b6b1f27b885

package instgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class unfollowers {
	@Test (invocationCount = 10)
	public void unfollow() throws InterruptedException 
{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	        driver.findElement(By.name("username")).sendKeys("tedykeerthi@gmail.com");
	        Thread.sleep(2000);
	        driver.findElement(By.name("password")).sendKeys("Chethanjo@1501");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//body/div[@id='react-root']/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]")).click();
	        Thread.sleep(2000);
	     
	        
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div/section/div/button")).click();
	     
	         Thread.sleep(3000);
	     
	        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/button[2]")).click();
	          System.out.println("success1");  
	          Thread.sleep(3000);
	          
	          
	          driver.findElement(By.className("gmFkV")).click();
	          
	          Thread.sleep(3000);
	          
	          
	          driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/header[1]/section[1]/ul[1]/li[3]/a[1]")).click();
	          
	          Thread.sleep(3000);
	          
	          
	          driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[3]/ul[1]/div[1]/li[1]/div[1]/div[3]/button[1]")).click();
	          Thread.sleep(3000);
	          driver.findElement(By.xpath("//button[contains(text(),'Unfollow')]")).click();	
	          Thread.sleep(3000);
	          driver.close();
	          System.out.println("One unfollow completed");
	          
	                 
	        }}

