package com.HomeLoan;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeFour {

	@Test(enabled = false)
	public void webLoginHomeLoan()
	{
		System.out.println("   webLoginHomeLoan");
	}
	
	@Parameters(value={"URL","Type"})
	
	@Test
	public void mobileLoginHomeLoan(String url,String type)
	{
		System.out.println("   mobileLoginHomeLoan");
		System.out.println(url);
		System.out.println(type);
	}
	@Test
	public void apiLoginHomeLoan()
	{
		System.out.println("   apiLoginHomeLoan");
	}
	
	@Test(groups = {"Smoke"})
	public void smokeTestHomeLoan()
	{
		System.out.println(" smokeTestHomeLoan :HomeLoan:PracticeFour:SmokeGroup");
	}
	
}
