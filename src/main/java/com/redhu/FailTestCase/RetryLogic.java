package com.redhu.FailTestCase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {
	
	
	// This logic we will use in FailTestCase Handling class. 

	int counter = 0;
	int RetryLimit = 0;

	public boolean retry(ITestResult result) {
		if (counter < RetryLimit) {
			counter++;
			return true;
		} else {
			return false;
		}

	}

}
