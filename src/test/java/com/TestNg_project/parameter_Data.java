package com.TestNg_project;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter_Data {
	
	@Test
	@Parameters({"username","password"})
private void credentails(@Optional("manoj")String username,String password) {
 System.out.println("username----->"+username);
 System.out.println("password----->"+password);
}
}
