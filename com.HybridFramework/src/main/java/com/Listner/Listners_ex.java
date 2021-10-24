package com.Listner;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners_ex implements ITestListener {
	
	private Logger log = Logger.getLogger(Listners_ex.class);
	
	public void onFinish(ITestContext result) {
		log.info("Test case is finished");
		
	}

	public void onStart(ITestContext result) {
		log.info("Test case is executed ");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		log.info("Test case is passed: "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		log.info("Test case is failed: "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		log.info("Test case is skipped "+result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		log.info("Test case is started with name: "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		log.info("Test case is passed: "+result.getName());
		
	}

}
