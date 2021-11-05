import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class jdbcconnection {
	
	public static void main(String[] args) throws SQLException {
		
		 
		String host="localhost";
		String port ="3306";
		
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/Qadbt", "root", "root123");
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from credentials where Scenario='Zerobalanced'");  
	
	while(rs.next())
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sethan.g\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		
		driver.findElement(By.id("username")).sendKeys(rs.getString("username"));
		driver.findElement(By.id("password")).sendKeys(rs.getString("password"));
		driver.findElement(By.id("Login")).click();
		

	
	}

}}
