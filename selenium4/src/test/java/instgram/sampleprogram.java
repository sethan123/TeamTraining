
package instgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class sampleprogram {

	 @Test
	    public void test() throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/");
			driver.findElement(By.cssSelector("a[href*='/nested_frames']")).click();
			driver.switchTo().frame("frame-top");
			driver.switchTo().frame("frame-middle");
			System.out.println(driver.findElement(By.id("content")).getText());
			

}
}