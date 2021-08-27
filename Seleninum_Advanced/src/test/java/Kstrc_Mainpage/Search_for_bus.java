package Kstrc_Mainpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search_for_bus {
	public static WebElement popup(WebDriver driver) {
		
		return driver.findElement(By.id("corover-close-btn"));
		}
	
	public static WebElement submit_button(WebDriver driver) {
		
		return driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		}

}
