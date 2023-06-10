package StepDefinition;
//Test
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class steps {				

	 WebDriver driver;			
		
	@Given("Open the chrome and launch the application")
	public void open_the_chrome_and_launch_the_application() {
		WebDriverManager.chromedriver().setup();					
	       driver= new ChromeDriver();					
	       driver.manage().window().maximize();			
	       driver.get("http://demo.guru99.com/v4");		
	}
	@When("Enter the below credits username {string}  and password {string}")
	public void enter_the_below_credits_username_and_password(String username, String password) {
		
		
		driver.findElement(By.name("uid")).sendKeys(username);	
        System.out.println("User name is succesfuuly ");
	       driver.findElement(By.name("password")).sendKeys(password);	
	      System.out.println("password name is succesfuuly ");
	    
	}
	
	@Then("Reset the credential")
	public void reset_the_credential() {
		driver.findElement(By.name("btnReset")).click();	
		driver.close();
	}



	}		

