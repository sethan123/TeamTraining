package KSRTC_pagefactory_values;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class pagefactory_values {    
    @FindBy(name="email")
    public static WebElement registration;
  
    @FindBy(id="fullName")
    public static WebElement fullName;
    
    @FindBy(name="mobileNo")
    public static WebElement mobileNo;
    
    @FindBy(name="SaveBtn")
    public static WebElement SaveBtn;
    
    @FindBy(id="userName")
    public static WebElement Sign;
    
    @FindBy(name="password")
    public static WebElement password;
   

 

    @FindBy(id="submitBtn")
    public static WebElement submitBtn;
   
    @FindBy(id="fromPlaceName")
    public static WebElement fromPlaceName;
   

 

    @FindBy(id="toPlaceName")
    public static WebElement toPlaceName;

 

    @FindBy(id="toPlaceName")
    public static WebElement date;    
    
    @FindBy(id="txtJourneyDate")
    public static WebElement JourneyDate;    
    
      @Test
      public static WebElement txtJourneyDate(WebDriver d1) {//3.Date Selection
      JavascriptExecutor jse= (JavascriptExecutor)d1;
      return (WebElement) jse.executeScript("document.getElementById('txtJourneyDate').value='18/08/2021'");
    }
    

 

    @Test
 public static WebElement returndate(WebDriver d1) {
    //4.return date
     JavascriptExecutor jse1= (JavascriptExecutor)d1;
      return (WebElement) jse1.executeScript("document.getElementById('txtReturnJourneyDate').value='15/09/2021'");
  }

    @FindBy(id="corover-close-btn")
    public static WebElement popup; 

    //@FindBy(xpath="//input[@name='singleLady']")
   // public static WebElement singleLady;    

 

    @FindBy(xpath=("/html/body/main/form/div[1]/div/div[2]/div[3]/button"))
  public static WebElement searchbus;
  

}

