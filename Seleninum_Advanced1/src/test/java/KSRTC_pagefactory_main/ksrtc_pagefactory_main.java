package KSRTC_pagefactory_main;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import KSRTC_pagefactory_values.pagefactory_values;



public class ksrtc_pagefactory_main {
	
	public class login {
		  @Test
		  public void f() throws InterruptedException {
		      
			  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		 

				driver.get("https://ksrtc.in/oprs-web/user/add.do");
				driver.manage().window().maximize();
		      
		      
		      PageFactory.initElements(driver, pagefactory_values.class);
		      //Scroll down the page
		      JavascriptExecutor js = (JavascriptExecutor) driver; /// Scroll down
		      js.executeScript("window.scrollBy(0,200)");
		      
		     //Registration page/
		     
		     pagefactory_values.registration.sendKeys("lalitaapawar2803@gmail.com");
		     pagefactory_values.fullName.sendKeys("Lalita Ajinath PAwar");
		     pagefactory_values.mobileNo.sendKeys("9763337404");
		     pagefactory_values.SaveBtn.click();
		     driver.switchTo().alert().accept();
			Thread.sleep(2000);
		     
		     
		     driver.get("https://ksrtc.in/oprs-web/login/show.do");

		 

		     driver.manage().window().maximize();
		  
		      PageFactory.initElements(driver, pagefactory_values.class);
		      
		      pagefactory_values.Sign.sendKeys("lalitaapawar2803@gmail.com");
		      pagefactory_values.password.sendKeys("Lalita@1234");
		      pagefactory_values.submitBtn.click();
		      pagefactory_values.fromPlaceName.sendKeys("PUNE"+Keys.ARROW_DOWN+Keys.ENTER);
		      pagefactory_values.toPlaceName.sendKeys("PUNE"+Keys.ARROW_DOWN+Keys.ENTER);
		      pagefactory_values.txtJourneyDate(driver);
		      pagefactory_values.returndate(driver);
		      pagefactory_values.popup.click();
		      //pagefactory_values.singleLady.click();
		      pagefactory_values.searchbus.click();

		  
		  
		  }
		}
		 

}
