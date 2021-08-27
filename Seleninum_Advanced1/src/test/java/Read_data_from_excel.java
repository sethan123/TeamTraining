import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class Read_data_from_excel {
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException, BiffException , IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		Workbook w1= Workbook.getWorkbook(new File("C:\\Users\\sethan.g\\Downloads\\data1.xls"));
		Sheet s1=w1.getSheet(0);

        for (int i=1;i <s1.getRows();i++) {
        String username=s1.getCell(0,i).getContents();
        String password=s1.getCell(1,i).getContents();
        
        driver.get("https://ksrtc.in/oprs-web/login/show.do");
        
        driver.findElement(By.id("userName")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        
        driver.findElement(By.id("submitBtn")).click();
        }

		


}
}