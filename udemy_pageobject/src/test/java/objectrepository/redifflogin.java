package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class redifflogin {
	WebDriver driver;
	
	
	public  redifflogin(WebDriver driver)
	{
		this.driver=driver;
	}
	By username=By.xpath("//input[@id='useremail']");
	By password=By.name("passwd");
	By go=By.xpath("//body/div[1]/div[3]/div[1]/div[2]/div[3]/div[5]/div[1]/form[1]/input[7]");
	
	
	public WebElement Email()
	{
		return driver.findElement(username);
	}
	public WebElement pwd()
	{
		return driver.findElement(password);
	}
	public WebElement go()
	{
		return driver.findElement(go);
	}
}
