package com.TestNg_project;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
	
	
	
	@Test
	private void data_Validation() {
	String expected_Username ="manoj";
	String actual_Username ="manoj12";
	
	
	SoftAssert s = new SoftAssert();
	s.assertEquals(actual_Username, expected_Username);
System.out.println("Data validation");
	}

}
