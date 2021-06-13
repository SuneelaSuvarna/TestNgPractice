package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("");
		System.out.println("T E S T  L I S T E N E R : T E S T  IS  S U C E S S : "+result.getName());
		System.out.println("");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("");
		System.out.println("T E S T  L I S T E N E R : T E S T  IS  F A I L U R E : "+ result.getName());
		System.out.println("");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("");
		System.out.println("T E S T  L I S T E N E R : T E S T  IS  S K I P P E D : "+ result.getName());
		System.out.println("");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

	

}
