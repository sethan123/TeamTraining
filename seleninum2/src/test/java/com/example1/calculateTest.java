package com.example1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class calculateTest {

public class calcTest {
	calculate ab=new calculate();
	
	
	
	
  @Test(dataProvider="dpaddd")
  public void mulTest(int exp ,int a, int b)
  {
   //Assert.assertEquals(10,ab.mul(2, 5));
      Assert.assertEquals(exp,ab.mul(a, b));
  }
  

 
//Ignore method
  @Test(enabled = false)
  
  public void subTest() {
      Assert.assertEquals(10,ab.sub(15, 5));
  }
  
  
  //exception handling 
 
  @Test(expectedExceptions = ArithmeticException.class )
  public void testTest() 
  {
  	int a,b,c;
      a=10;b=0;c=0;
      c=a/b;
      System.out.println(c);  
  }
  
  
  	@Test(expectedExceptions=NullPointerException.class)
  		public void test1()
  		{ 
  		String str=null;
  		System.out.println (str.length());  
  		}
  
  
  	@Test(expectedExceptions=ArrayIndexOutOfBoundsException.class)
  		public void test2()
  		{   
  			int d[]={1,2,3,4};
  			System.out.println(d[5]);
  		}
  
  
  	@Test (expectedExceptions = IllegalArgumentException.class)
  		public void throwsExceptionWhenNegativeNumbersAreGiven() {
  		
  	
  			int a,b,c, add;
  				a=-10;b=-5;c=6;
  					add=a+b+c;
  						System.out.println(add);
  	
  			}
  
  
  
  
  //data provider
  
  
  	@DataProvider(name="dpaddd")
  		public Object[][] getData()
  		{
  			Object[][] table_values =new Object[][]
  					{
  						{25,5,5},
  						{20,5,4},
  						{10,3,3}
  					};
          
          return table_values;
}
}

}

