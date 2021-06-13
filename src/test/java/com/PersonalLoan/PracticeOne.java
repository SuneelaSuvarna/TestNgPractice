package com.PersonalLoan;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PracticeOne {

	
	@Test
	public void Demo()
	{
		System.out.println("Demo Method");
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("secondTest");
	}

	@AfterTest
	public void afterTestPLoan()
	{
		System.out.println("After Test :PersonalLoan:PracticeOne:afterTestPLoan");
	}
	
}
