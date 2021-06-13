package com.PersonalLoan;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PracticeOne {

	@BeforeSuite
	public void beforeSuiteTest()
	{
		System.out.println("beforeSuiteTest:PersonalLoan:PracticeOne");
	}
	
	
	@Test
	public void Demo()
	{
		System.out.println("   Demo Method");
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("   secondTest");
	}

	@AfterTest
	public void afterTestPLoan()
	{
		System.out.println(" After Test :PersonalLoan:PracticeOne:afterTestPLoan");
	}
	
	@Test(groups = {"Smoke"})
	public void smokeTestPLoan1()
	{
		System.out.println(" smokeTestPLoan1 :PersonalLoan:PracticeOne:SmokeGroup");
	}
	
}
