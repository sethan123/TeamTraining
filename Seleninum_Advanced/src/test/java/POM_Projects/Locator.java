package POM_Projects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locator {
	

	@FindBy(id="ap_email")
	public static WebElement emailid;
	
	
	@FindBy(id="continue")
	public static WebElement login_button;

	

}
