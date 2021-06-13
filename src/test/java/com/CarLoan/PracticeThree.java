package com.CarLoan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
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
		assertTrue(false);
	}

	@Test(timeOut = 4000)
	public void mobileNavigationCarLoan() {
		System.out.println("   mobileNavigationCarLoan");
	}

	@Parameters(value={"URL","Type"})
	@Test
	public void mobileLogoutCarLoan(String url,String type) {
		System.out.println("   mobileLogoutCarLoan");
		System.out.println(url);
		System.out.println(type);
	}

	@Test(dependsOnMethods ={"mobileLoginCarLoan"})
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

	@Test(groups = {"Smoke"})
	public void smokeTestCarLoan()
	{
		System.out.println(" smokeTestCarLoan :CarLoan:PracticeThree:SmokeGroup");
		assertTrue(false);
	}
	
	@Test(dataProvider = "TestData")
	public void CarLoanDataProviderTest(String userName,String password)
	{
		System.out.println("Username :"+userName +"| Password :"+password);
	}
	
	@DataProvider(name="TestData")
	public Object testData()
	{
		Object data[][]=new Object[3][2];
		
		data[0][0]="username1";
		data[0][1]="password1";
		
		data[1][0]="username2";
		data[1][1]="password2";
		
		data[2][0]="username3";
		data[2][1]="password3";
		
		return data;
	}
}
