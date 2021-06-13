package com.PersonalLoan;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTwo {
	
	@BeforeTest
	public void beforeTestPLoan()
	{
		System.out.println(" Before Test :PersonalLoan:PracticeTwo:beforeTestPLoan");
	}
	@Test
	public void pLoan()
	{
		System.out.println("   pLoan");
	}

	@AfterSuite
	public void afterSuiteTest()
	{
		System.out.println(" afterSuiteTest:PersonalLoan:PracticeTwo");
	}
	
	@Test(groups = {"Smoke"})
	public void smokeTestPLoan2()
	{
		System.out.println(" smokeTestPLoan2 :PersonalLoan:PracticeOne:SmokeGroup");
	}
	
	

}
