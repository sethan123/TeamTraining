package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {
//defining loggers
	public static Logger Log= LogManager.getLogger(assignment1.class.getName());
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./WebDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//opening website     
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Log.trace("Site opened");
		Thread.sleep(2000);
//checking the first checkbox
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Log.error("Is option selected?");
		driver.findElement(By.id("checkBoxOption1")).click();
		Log.info("Option selected");
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//getting number of all the checkboxes	
		System.out.println((driver.findElements(By.xpath("//input[@type='checkbox']"))).size());
		Log.fatal("Close all");
		driver.close();
	
	}

}
