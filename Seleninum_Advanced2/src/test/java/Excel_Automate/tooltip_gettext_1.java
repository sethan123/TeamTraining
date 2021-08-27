package Excel_Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip_gettext_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		 String baseUrl = "http://demo.guru99.com/test/tooltip.html";
		 String expectedTooltip = "What's new in 3.2";					
	        driver.get(baseUrl);					
	        		
	        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));							
	        Actions builder = new Actions (driver);							

	        builder.clickAndHold().moveToElement(download);					
	        builder.moveToElement(download).build().perform(); 	
	        
	        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));							
	        String actualTooltip = toolTipElement.getText();			
	        
	        System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
	        if(actualTooltip.equals(expectedTooltip)) {							
	            System.out.println("Test Case Passed");					
	        }
	        
	        Thread.sleep(6000);
	        driver.close();	

}
}