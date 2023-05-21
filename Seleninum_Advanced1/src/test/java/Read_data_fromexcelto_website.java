import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.read.biff.BiffException;

public class Read_data_fromexcelto_website {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException, BiffException , IOException {
	//System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	File file= new File("C:\\\\Users\\\\setha\\\\Downloads\\\\Book2.xls");
	
	FileInputStream inputStream = new FileInputStream(file);
	HSSFWorkbook wb=new HSSFWorkbook(inputStream);
    
    //creating a Sheet object
    HSSFSheet sheet=wb.getSheet("STUDENT_DATA");
    
    //get all rows in the sheet
    int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
    
   //Creating an object of ChromeDriver
    WebDriver driver1 = new ChromeDriver();
    
    //Navigate to the URL
    driver1.get("https://demoqa.com/automation-practice-form");
    driver.manage().window().maximize();


    //Identify the WebElements for the student registration form
    WebElement firstName=driver1.findElement(By.id("firstName"));
    WebElement lastName=driver1.findElement(By.id("lastName"));
    WebElement email=driver1.findElement(By.id("userEmail"));
    WebElement genderMale= driver1.findElement(By.id("gender-radio-1"));
    WebElement mobile=driver1.findElement(By.id("userNumber"));
    WebElement address=driver1.findElement(By.id("currentAddress"));
    WebElement submitBtn=driver1.findElement(By.id("submit"));



    //iterate over all the rows in Excel and put data in the form.
    for(int i=1;i<=rowCount;i++) {
        //Enter the values read from Excel in firstname,lastname,mobile,email,address
        firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
        lastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
        email.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
        mobile.sendKeys(sheet.getRow(i).getCell(4).toString());
        address.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
        
        //Click on the gender radio button using javascript
        JavascriptExecutor js = (JavascriptExecutor) driver1;
        js.executeScript("arguments[0].click();", genderMale);
        
        js.executeScript("arguments[0].scrollIntoView(true);",submitBtn);
        //Click on submit button
        submitBtn.click();
        
        //Verify the confirmation message
        WebElement confirmationMessage = driver1.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
        
        //create a new cell in the row at index 6
        HSSFCell cell = sheet.getRow(i).createCell(6);
        
        //check if confirmation message is displayed
        if (confirmationMessage.isDisplayed()) {
            // if the message is displayed , write PASS in the excel sheet
            cell.setCellValue("PASS");
            
        } else {
            //if the message is not displayed , write FAIL in the excel sheet
            cell.setCellValue("FAIL");
        }
        
        // Write the data back in the Excel file
        FileOutputStream outputStream = new FileOutputStream("");
        wb.write(outputStream);

        //close the confirmation popup
        WebElement closebtn = driver1.findElement(By.id("closeLargeModal"));
        closebtn.click();
        
        //wait for page to come back to registration page after close button is clicked
        driver1.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }
    
    //Close the workbook
    wb.close();
    
    //Quit the driver
    driver1.quit();
    
	
}
}

