package com.TestNg_project;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test(dataProvider="test_Data")
	private void credentails(String username,int password) {
	System.out.println("Username  "+username);
    System.out.println("password   "+password);
	}
	@DataProvider
	private Object[][] test_Data() {
		return new Object[][] {
			
			{"manoj",113},
			{"jeevi",6767},
			{"menaka",798}
			
			
			
		} ;
	
	}
	

}
