package com.TestNg_project;


import org.testng.annotations.Test;

public class Priority_Concept {
	
	@Test(priority = 2)
	private void login() {
	System.out.println("Login Button");

	}
	@Test(priority = -1)
	private void setProperty() {
		// TODO Auto-generated method stub
System.out.println("Browser launch");
	}
	@Test(priority = 1)
 private void password() {
	// TODO Auto-generated method stub
 System.out.println("password");
}
 @Test(priority = 0)
 private void username() {
	// TODO Auto-generated method stub
System.out.println("Username");
}
}
