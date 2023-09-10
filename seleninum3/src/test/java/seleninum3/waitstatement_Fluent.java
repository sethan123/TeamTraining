package seleninum3;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitstatement_Fluent {
	
	//fluent wait--> Every second you are looking for the element to be reach on the appln-thread
	//appln-multiple (data transfer, large amount)-->deadlock.
	//20 secs
	//cycle-0-5(sleep) 5th -> search -elemet is reahced --> perform actions
			//6-10(sleep)-10th --> search --> element is reahced --> perform actions
			//11-15(sleep)-15th --> search --> element is reached --> perform actions
	// 4 cycle--> we can specifiy the period sec--> every 5 sec it will sleep
	//--> exception to be handled
	
	@Test
	public void f() 
{
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
//		FluentWait var= new FluentWait(driver);		
//		var.withTimeout(Duration.ofSeconds(30))
//		.pollingEvery(Duration.ofSeconds(30));

		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		driver.get("http://www.leafground.com/home.html");
		
}

}
