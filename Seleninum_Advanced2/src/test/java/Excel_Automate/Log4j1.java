	package Excel_Automate;
	
	
	import org.apache.log4j.BasicConfigurator;
	import org.apache.log4j.Logger;
	import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
	
	public class Log4j1 {
	static final Logger logger1=Logger.getLogger(Log4j1.class);
	
	public static void main(String[] args) {
	//BasicConfigurator.configure();
	//PropertyConfigurator.configure("src\\test\\java\\Excel_Automate\\Log4j1.properties");
		DOMConfigurator.configure("src\\test\\java\\Excel_Automate\\Log4j1.xml");
		
	logger1.debug("Example for debug msg");
	logger1.info("Example for info msg");
	logger1.warn("Example for warn msg");
	logger1.error("Example for error msg");
	logger1.fatal("Example for fatal msg");
	}
	
	}