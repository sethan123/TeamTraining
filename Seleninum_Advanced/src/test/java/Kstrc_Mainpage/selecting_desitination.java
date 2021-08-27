package Kstrc_Mainpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selecting_desitination {
	 

			public static WebElement destination(WebDriver driver) {
			
			return driver.findElement(By.xpath("//a[normalize-space()='Ballari - Bengaluru']"));
			}

			public static WebElement from_date(WebDriver driver) {
			
			return driver.findElement(By.xpath("//a[normalize-space()='16']"));
			}
			public static WebElement select_todate(WebDriver driver) {
				
				return driver.findElement(By.id("txtReturnJourneyDate"));
				}
			public static WebElement todate(WebDriver driver) {
				
				return driver.findElement(By.xpath("//a[normalize-space()='24']"));
				}
				
			
			
}

