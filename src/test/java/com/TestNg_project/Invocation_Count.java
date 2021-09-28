package com.TestNg_project;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	

	@Test(priority = -2)
	private void browserlaunch() {
	System.out.println("Browser Launch");

	}
	@Test(priority = 0,invocationCount = 4)
	private void refresh() {
		// TODO Auto-generated method stub
System.out.println("Refresh");
	}
	@Test(priority = 1)
 private void nextpage() {
	// TODO Auto-generated method stub
 System.out.println("next page");
}
}
