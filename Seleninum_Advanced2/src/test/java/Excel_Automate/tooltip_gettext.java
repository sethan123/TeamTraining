package Excel_Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltip_gettext {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/tooltip.html");
	
	WebElement ele=	driver.findElement(By.id("age"));
	String tooltip=	ele.getAttribute("title");
	System.out.println(tooltip);
}
}
