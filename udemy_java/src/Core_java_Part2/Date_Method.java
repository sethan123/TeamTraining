package Core_java_Part2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Method {

	public static void main(String[] args) {
		Date d=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/YYYY");
		System.out.println(sdf.format(d));
		
		System.out.println(d.toString());

	}

}
