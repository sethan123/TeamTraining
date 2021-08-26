package task3_Ignore;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class Program1Test {

	public String message = "Chethanjesi";                            

	 

	Program1 junitMessage = new Program1(message);
    
    @Ignore
    @Test        
    public void testJUnitMessage() {                    

 

        System.out.println("Junit Message is printing");                    
        assertEquals(message, junitMessage.printMessage());                    

 

    }        

 

    @Test        
    public void testJUnitHiMessage() {                    
        message="Hi!" +message;                            
        System.out.println("Junit Hi Message is printing ");                    
        assertEquals(message, junitMessage.printHiMessage());    

 

}}
 

