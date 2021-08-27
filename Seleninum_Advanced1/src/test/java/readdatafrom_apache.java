import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class readdatafrom_apache {
	
	public class Read_apache {
		  @Test
		  public void f() throws Exception {
		      
			  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				 File file =    new File("C:\\Users\\sethan.g\\Downloads\\data.xlsx");
			      
			      FileInputStream fs = new FileInputStream(file);
			      
			      XSSFWorkbook workbook = new XSSFWorkbook(fs);
			      
			      XSSFSheet sheet = workbook.getSheetAt(0);
			            
			      int lastRownum = sheet.getLastRowNum();
			    
			      System.out.println("Last row- "+lastRownum);
			      
			      for(int i=1;i <= lastRownum;i++)
			      {
			          
			             String username= sheet.getRow(i).getCell(0).toString();
			             String password= sheet.getRow(i).getCell(1).toString();
			             
			             System.out.println("username:"+username);
			             System.out.println("password:"+password); 
			             
			             driver.get("https://ksrtc.in/oprs-web/login/show.do");
			              
			             driver.findElement(By.id("userName")).sendKeys(username);
			             driver.findElement(By.id("password")).sendKeys(password);
			              
			             driver.findElement(By.id("submitBtn")).click();
			              
			          
			      }
			          
		  }
	}
}
