package com.exampledemo1;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class test1_annotation {
	
	
	
	@BeforeSuite
	public void demo3()
	{
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void demo1()
	{
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("AfterMethod");
	}

	
	
	
	@Test 
	public void demo()
	{
		System.out.println("@Test");
	}

	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("@AfterClass");
	}
	
	@AfterTest
	public void demo2()
	{
		System.out.println("@AfterTest");
	}
	@AfterSuite
	public void demo4()
	{
		System.out.println("@AfterSuite");
	}
	
	
	
	

}
