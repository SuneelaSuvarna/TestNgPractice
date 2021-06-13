package com.CarLoan;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeThree {

	@BeforeClass
	public void beforeClassTest() {
		System.out.println(" beforeClassTest:CarLoan:PracticeThree");
	}
	
	@Test
	public void webLoginCarLoan() {
		System.out.println("   webLoginCarLoan");
	}

	@Test
	public void mobileLoginCarLoan() {
		System.out.println("   mobileLoginCarLoan");
	}

	@Test
	public void mobileNavigationCarLoan() {
		System.out.println("   mobileNavigationCarLoan");
	}

	@Test
	public void mobileLogoutCarLoan() {
		System.out.println("   mobileLogoutCarLoan");
	}

	@Test
	public void apiLoginCarLoan() {
		System.out.println("   apiLoginCarLoan");
	}

	@BeforeMethod
	public void beforeMethodCarLoan() {
		System.out.println("  beforeMethodCarLoan executed before car loan test methods");
	}
	
	@AfterMethod
	public void afterMethodCarLoan() {
		System.out.println("  afterMethodCarLoan excuted after every car loan test methods");
	}

}
