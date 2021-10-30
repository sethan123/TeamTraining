package seleninum3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class check_box {
	

	@Test
	public void f() 
	{
		System.setProperty("webdriver.chrome.driver", "./software1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/home.html");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/section[1]/div[1]/div[3]/input[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/section[1]/div[2]/div[1]/input[1]")).click();
		driver.findElement(By.cssSelector("body.page.page-id-153.page-template.page-template-page-keyword-category.page-template-page-keyword-category-php:nth-child(2) div.wrapper-outer div.w560:nth-child(3) section.innerblock div.example:nth-child(9) div:nth-child(4) > input:nth-child(1)")).click();
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[3]/section[1]/div[4]/div[3]/input[1]")).click();

}}
