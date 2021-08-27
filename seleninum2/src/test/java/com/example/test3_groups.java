package com.example;

import org.testng.annotations.Test;

public class test3_groups {
	@Test(groups = {"Electronics"})
	public static void laptopSearch() {

		System.out.println("laptop search");

	}

	@Test(groups = {"Electronics"})
	public static void earphonesSearch() {

		System.out.println("earphones search");
	}

	@Test(groups = {"Electronics"})
	public static void mobileSearch() {

		System.out.println("Mobile Search");

	}

	@Test(groups = {"Books"})
	public static void bookSearch() {

		System.out.println("Book search");

	}

	@Test(groups = {"Books"})
	public static void novelSearch() {

		System.out.println("novels");

	}


}
