package Kstrc_Mainpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ksrtc_Main_Sign_in {
	
public static WebElement emailid(WebDriver driver) {
		
		return driver.findElement(By.id("email"));
		
	}

	public static WebElement fullname(WebDriver driver) {
		
		return driver.findElement(By.id("fullName"));
	}
		
		public static WebElement mobileNo(WebDriver driver) {
			
			return driver.findElement(By.id("mobileNo"));
		}
		public static WebElement SaveBtn(WebDriver driver) {
			
			return driver.findElement(By.xpath("//input[@type='button']"));
		}
		
		
		
		
}
