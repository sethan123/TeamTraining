package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators {
	
	public static WebElement emailid(WebDriver driver) {
		
		return driver.findElement(By.id("ap_email"));
		
	}

	public static WebElement login_buttons(WebDriver driver) {
		
		return driver.findElement(By.id("continue"));
		
	}
	
}
