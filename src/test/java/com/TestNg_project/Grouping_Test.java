package com.TestNg_project;

import org.testng.annotations.Test;

public class Grouping_Test {
	
@Test(groups = "social Media")
private void facebook() {
 System.out.println("fb...");

 
}
@Test(groups = "E-com") 
 private void amzon() {
	System.out.println("Amazon");

}
@Test(groups = "social Media")
private void whatsapp() {
System.out.println("whatapps");

}
	@Test(groups = "E-com")
	private void Filpcark() {
	System.out.println("filpcark");

	}
	@Test(groups = "social Media")
	private void Instagram() {
	System.out.println("instagram");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
