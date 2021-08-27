package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {
	private static Logger Log= LogManager.getLogger(Assignment3.class.getName());
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./WebDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//getting url		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		Log.info("Site opened");
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		Log.error("Is option clicked?");
		WebDriverWait w1 = new WebDriverWait(driver,5);
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results")));
		System.out.println("Message : "+ driver.findElement(By.cssSelector("#results")).getText());
		Log.fatal("Close all");
		driver.close();
	}
}