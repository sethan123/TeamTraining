import java.awt.AWTException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.read.biff.BiffException;

public class write_data_from_excel {
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException, BiffException , IOException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();

		String filepath=("C:\\Users\\sethan.g\\Downloads\\data2.xlsx");
		
		File f1=new File(filepath);
		
		FileOutputStream fos=new FileOutputStream(f1);
		
		XSSFWorkbook w1=new XSSFWorkbook();
		
		XSSFSheet  s1=w1.createSheet("Selenium");
		
		Row r1=s1.createRow(6);
		
		Cell c1=r1.createCell(5);
		
		c1.setCellType(CellType.STRING);
		
		c1.setCellValue("Passed");
		
		w1.write(fos);
        }
	
}
