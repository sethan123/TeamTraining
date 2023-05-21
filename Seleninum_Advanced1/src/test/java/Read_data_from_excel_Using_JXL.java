import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;





public class Read_data_from_excel_Using_JXL {
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException, IOException, BiffException {
		//System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		Workbook w1= Workbook.getWorkbook(new File("C:\\Users\\setha\\Downloads\\Book1.xls"));	
		Sheet s1=w1.getSheet(0);

	
		

		

       for (int i=1;i <s1.getRows();i++) {
        	
        	
        String username=s1.getCell(0,i).getContents();
        String password=s1.getCell(1,i).getContents();
        
        driver.get("https://ksrtc.in/oprs-web/login/show.do");
        
        driver.findElement(By.id("userName")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        
        WebElement s=driver.findElement(By.xpath("//input[@id='TermsConditions']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", s);
        
        driver.findElement(By.id("submitBtn")).click();
        System.out.println("Successfully clicked");
        driver.close();
        }

		


}
}