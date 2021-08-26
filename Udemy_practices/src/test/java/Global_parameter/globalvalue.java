//Used as common file and used to run globallly


package Global_parameter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class globalvalue {
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();

		FileInputStream fis =new FileInputStream("C:\\Users\\sethan.g\\workspace\\Udemy_practices\\src\\test\\java\\Global_parameter\\data.properties");

		prop.load(fis);

		System.out.println(prop.getProperty("browser"));

		System.out.println(prop.getProperty("url"));

		prop.setProperty("browser", "firefox");

		System.out.println(prop.getProperty("browser"));

		FileOutputStream fos =new FileOutputStream("C:\\Users\\sethan.g\\workspace\\Udemy_practices\\src\\test\\java\\Global_parameter\\data.properties");

		prop.store(fos, null);
	}
	
	
}
