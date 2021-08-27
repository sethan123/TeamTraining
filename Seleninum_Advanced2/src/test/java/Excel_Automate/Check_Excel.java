//After downloading excel check whether it is donwloaded or not in the required file


package Excel_Automate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Check_Excel {
	
	
	@Test
	public void  download() throws IOException, InterruptedException
	{
		FileInputStream st=new FileInputStream("src\\test\\java\\Excel_Automate\\config.properties");
		
		Properties pro=new Properties();
		pro.load(st);
		
		String browser_name=pro.getProperty("browser");
		String Driver_path=pro.getProperty("driver_path");
		WebDriver driver;
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",Driver_path);
			 driver=new ChromeDriver();
		}
		else if(browser_name.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",Driver_path);
			 driver=new FirefoxDriver();
		}
		
		else
		{
			System.setProperty("webdriver.ie.driver",Driver_path);
			 driver=new InternetExplorerDriver();
		}
		
		

		Thread.sleep(9000);	
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/download.html");
		driver.findElement(By.linkText("Download Excel")).click();
		Thread.sleep(9000);
		
		File flocation =new File("C:\\Users\\sethan.g\\Downloads");
		File[] total_files=	flocation.listFiles();
		
		for(File file:total_files)
		{
			if(file.getName().equalsIgnoreCase("testleaf.xlsx"))
			{
				
				
			System.out.println("File is downloaded");
			break;
		}
		}	
}
}