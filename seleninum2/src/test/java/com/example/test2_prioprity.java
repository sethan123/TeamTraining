package com.example;

import org.testng.annotations.Test;

public class test2_prioprity {
	@Test(priority = -1)
	public static void laptopSearch() {
		
		System.out.println("laptop search");
		
	}
	
	@Test(priority = 1)
	public static void earphonesSearch() {
		
		System.out.println("earphones search");
	}
	
	@Test(priority = 0)
	public static void musicSearch() {
		
		System.out.println("Music Search");
		
	}
	
	@Test(priority = 2)
	public static void mobileSearch() {
		
		System.out.println("Mobile Search");
		
	}
	


}
