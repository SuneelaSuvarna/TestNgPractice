package com.HomeLoan;

import org.testng.annotations.Test;

public class PracticeFour {

	@Test(enabled = false)
	public void webLoginHomeLoan()
	{
		System.out.println("   webLoginHomeLoan");
	}
	@Test
	public void mobileLoginHomeLoan()
	{
		System.out.println("   mobileLoginHomeLoan");
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
