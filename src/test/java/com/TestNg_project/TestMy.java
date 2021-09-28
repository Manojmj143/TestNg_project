package com.TestNg_project;

import org.testng.Assert;
import org.testng.annotations.Test;





public class TestMy {
	
	@Test
	private void username() {
	
		String expected_username = "manoj";
		String actual_username   ="manoj12";
		
		Assert.assertEquals(actual_username, expected_username);

	}

	@Test
	private void password() {
		String expected_password = "menaka";
	String actual_password   ="menaka2";
	
	Assert.assertEquals(actual_password, expected_password);

}
}
