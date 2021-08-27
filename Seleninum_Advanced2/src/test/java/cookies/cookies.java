package cookies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class cookies {

    @Test
    public void itime() throws IOException 
    {
    	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Cookie ckk = new Cookie("Cookie_1", "12");
        Cookie cekk = new Cookie("Cookie_2", "21");
        // Add Cookies
        driver.manage().addCookie(ckk);
        driver.manage().addCookie(cekk);
        // Delete Cookies
        driver.manage().deleteCookieNamed("Network-Type");
        File f = new File("Cookies.data");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

 

        for (Cookie c : driver.manage().getCookies()) {
            bw.write((c.getName() + ";" + c.getDomain() + ";" + c.getPath() + ";" + c.getExpiry() + ";" + c.isSecure()
                    + ";" + c.getValue()));

 

            bw.newLine();

 

            System.out.println(c.getName() + ";" + c.getDomain() + ";" + c.getPath() + ";" + c.getExpiry() + ";"
                    + c.isSecure() + ";" + c.getValue());
        }

 

        bw.close();

 

        fw.close();

 

    

}
}
 

























		