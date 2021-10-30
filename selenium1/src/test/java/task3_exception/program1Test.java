package task3_exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class program1Test {    

    @Test(expected = ArithmeticException.class )
    public void testTest() 
    {
    	int a,b,c;
        a=10;b=0;c=0;
        c=a/b;
        System.out.println(c);  
    }
        
    @Test(expected=NullPointerException.class)
    public void test1()
    {  
   
    String str=null;
    System.out.println (str.length());  
    }
    
    
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void test2()
    {  
   
    int d[]={1,2,3,4};
    System.out.println(d[5]);
    }
    
    /*@Test (expected = IllegalArgumentException.class)
    //public void throwsExceptionWhenNegativeNumbersAreGiven() {
    public void test3()  
    // act
    {
    	int a,b;
		float add;
		float c;
    	a=10;b=5;c=6.0f;
    	add=a+b+c;
    	System.out.println(add);
    	
    }*/

}
