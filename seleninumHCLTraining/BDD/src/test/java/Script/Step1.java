package Script;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When; 

public class Step1 {
    WebDriver d1;
    
    @Given("Open Chrome browser and url of the application")
    public void open_chrome_browser_and_url_of_the_application() {
    System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        d1=new ChromeDriver();        
         d1.get("https://ksrtc.in/oprs-web/login/show.do");        
        System.out.println("given done");
    }
    @When("Enter username and password and click Submit button")
    public void enter_username_and_password_and_click_submit_button() throws InterruptedException {
        d1.findElement(By.id("userName")).sendKeys("pritsbidwai@gmail.com");
        d1.findElement(By.id("password")).sendKeys("Pritee@123");
        System.out.println("when done");
    }
    
     @And("Successfully sign in")
     public void Successfully_sign_in1() {
     d1.findElement(By.id("submitBtn")).click();
     System.out.println("And1 done");
    }
        
    
     @And("Select two cities")
     public void select_two_cities() {        
        WebElement element1 = d1.findElement(By.id("fromPlaceName"));
        WebElement element2 = d1.findElement(By.id("toPlaceName"));
        element1.sendKeys("Bengaluru");
        element1.sendKeys(Keys.ARROW_DOWN);
        element1.sendKeys(Keys.ENTER);
        element2.sendKeys("HYDERABAD");
        //element2.sendKeys(Keys.ARROW_DOWN);
        element2.sendKeys(Keys.ENTER);

       d1.switchTo().defaultContent();

 

 

 

        //Thread.sleep(10000);
        System.out.println("And2 done");
    }
    
     
     
     
    
     
     @And("Select two dates")
     public void select_two_dates() {
        d1.findElement(By.id("txtJourneyDate")).click();
        d1.findElement(By.linkText("26")).click();
        
        d1.findElement(By.id("txtReturnJourneyDate")).click();
        d1.findElement(By.linkText("27")).click();
        System.out.println("And3 Done");
     }
     
    
     @And("Select the Checkbox")
     public void Select_the_Checkbox() {
         
         d1.findElement(By.id("corover-close-btn")).click(); 
         System.out.println("And4 Done");
     }
     
     
     
    
    
      @Then("Click on search button")
     public void click_on_search_button()  throws InterruptedException {
         
         
        d1.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();
    
        System.out.println("then done");
        //Thread.sleep(10000);
     }}