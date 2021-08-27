package ordered_unordered_list;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class date_picker {
	@Test
	public void orderlist() throws InterruptedException 
{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('datepicker1').value='29/08/2021'");
		js.executeScript("document.getElementById('datepicker2').value='29/08/2021'");
}
}