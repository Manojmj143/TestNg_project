package com.TestNg_project;

import org.testng.annotations.Test;

public class TimeOut {
	
	
	@Test(timeOut=2000)
	private void login() throws Throwable {
		
	System.out.println("username");
	System.out.println("password");
	System.out.println("login button");
	
	Thread.sleep(4000000);
	System.out.println("Navigate to homepage");
	
	}

}
