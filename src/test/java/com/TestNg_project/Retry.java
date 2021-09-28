package com.TestNg_project;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import net.bytebuddy.asm.Advice.Return;

public class Retry implements IRetryAnalyzer {
	
	
	int count =1;
	int limit =5;
	public boolean retry(ITestResult result) {
		
		if(count <=limit) {
			count++;
		
		return true;
	}
	
	return false;
}

}