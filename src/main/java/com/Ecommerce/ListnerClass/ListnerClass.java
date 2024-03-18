package com.Ecommerce.ListnerClass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+ "Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+ "Test is Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+ "Test is failed");
	}

	
}
