package com.TestNg_project;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;


public class SimpleAnnotation {
	
	@BeforeSuite
	private void browserlanuch() {
System.out.println("browser lanuch");
	}
	@BeforeSuite
	private void url() {
		System.out.println("url");
		

	}
	@Test
	@Parameters({"name","mj"})
	private void login(@Optional("jeevi")String name,@Optional("jeevi1")String mj) {
		System.out.println("login credentials\n"+name+"\n"+mj);
	

	}
	@Test(priority = -1)
	private void username() {
	System.out.println("username");

	}
	@Test(priority = 0)
	private void password() {
	System.out.println("password");

	}
	@Test(priority = 4,timeOut = 3000)
	private void women() throws Throwable {
	System.out.println("women");
    //Thread.sleep(50000);
	}
	@Test(invocationCount = 3)
	private void refresh() {
	System.out.println("refreshed");
	}
	@Test(expectedExceptions = ArithmeticException.class)
	private void Excepction() {
	System.out.println("a/10");

	}
	@Ignore
	@Test
	private void booking() {
	System.out.println("booking");

	}
	@Test(enabled = false)
	private void order() {
	System.out.println("order");

	}
	@AfterTest
	private void logout() {
	System.out.println("logout");

	}
	@AfterSuite
	private void quit() {
	System.out.println("quit");

	}
	
	
	
	
	
}
