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
	@Test
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
	        Thread.sleep(1000);	
	        
	        WebDriverWait var1=new WebDriverWait(driver, 20);
			var1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/button[1]")));

	        
	        
	        
	      // WebElement a = driver.findElement(By.cssSelector("div[class='cmbtv'] button[type='button']"));
	        	//	a.click();
	        		//  Thread.sleep(2000);	
	        		 
	      
	         
	     
}
}