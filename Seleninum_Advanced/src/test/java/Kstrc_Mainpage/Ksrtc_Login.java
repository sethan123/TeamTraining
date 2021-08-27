package Kstrc_Mainpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ksrtc_Login {

	public static WebElement signin(WebDriver driver) {
	
	return driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
	}

	
	public static WebElement username(WebDriver driver) {
		
		return driver.findElement(By.id("userName"));
	}
	public static WebElement password(WebDriver driver) {
	
	return driver.findElement(By.id("password"));
	}
	public static WebElement submitBtn(WebDriver driver) {
		
		return driver.findElement(By.id("submitBtn"));
		}
}
