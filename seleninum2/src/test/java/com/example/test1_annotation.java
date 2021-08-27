// More anotation

 


//After completing refresh the project.
// new test-output will be display
// open test-output -->right click on emailable-report.html--> open with --> web browser(You will get the report of testng)
// right click on index.html--> open with-->web browser(you will get test suite report)

 

//1. Test report generation
//2.priority to the method
//3.groups the methods.
//4.parallel testing -concurrently testing(method, class)'
//5.depends on methods.
//6.testng--> using mAVEN
//7.moree annotation in testing
//8.@dataprovider-data driven testing

 

//Paralle --> pareallelly in method level will be happen, eg: login in chrome browswer, login in firfox. 
package com.example;

 

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

public class test1_annotation {
    
    @BeforeSuite
    public void BeforeSuite1()
    {
        System.out.println("Before suite file");
    }
    
    @org.testng.annotations.BeforeClass
    public void BeforeClass()
    {
        System.out.println("BeforeClass");
    }
    
    
    @BeforeMethod
    public void before_method1()
    {
        System.out.println("Before method");
    }
    
    @BeforeTest
    public void before_test1()
    {
        System.out.println("Before test");
    }    
    
    //giving priority
    //@Test(priority = 2)
    //@Test (groups = {"smoke test"})
    @Test(dependsOnMethods = {"b"})// it will display the mentioned dependsonmethods
    
    public void a() {
        System.out.println("first1 test method");
        System.out.println(Thread.currentThread().getId());
            
    }
    //@Test(priority = 1)    
    @Test (groups = {"Functional test"})
    public void b() {
        System.out.println("second test method");
        System.out.println(Thread.currentThread().getId());
}
    @Test (groups = {"smoke test"})
    public void c() {
        System.out.println("Third test method");
    }
    
    
    @AfterMethod
    public void AfterMethod1()
    {
        System.out.println("After method");
    }
    
    @AfterTest
    public void AfterTest1()
    {
        System.out.println("After test");
    }
    
    @org.testng.annotations.AfterClass
    public void AfterClass()
    {
        System.out.println("AfterClass");
    }
    
    @AfterSuite
    public void AfterSuite1()
    {
        System.out.println("After suite file");
    }
    
    
}