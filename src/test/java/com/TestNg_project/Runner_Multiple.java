package com.TestNg_project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.helper.File_Reader_Manager;

import Multiple.Baseclass;
import Multiple.Page_object_model;

@Test(priority = -1)
public class Runner_Multiple extends Baseclass {
	
	public static WebDriver driver = browser("chrome"); 
	public static Page_object_model pom = new Page_object_model(driver);
	
@Test(priority =1,dataProvider = "test_Data")
    private void credentials(String username,String password) throws Throwable {
	String url =File_Reader_Manager.getInstance().getInstanceC().getUrl();
	getUrl(url);
	
	clickOnElement(pom.getInstanceHP().getSignin());
    Thread.sleep(2000);

    
	inputValue(pom.getInstanceSP().getEmail(),username);
	inputValue(pom.getInstanceSP().getPassword(),password);
	}

@DataProvider(name="test_Data")
 private Object[][] getData() {
	
	return new Object[][] {
		{"manojmj11@gmail.com","ABC"},{"manojboss883@gmail.com","manoj143"}
	
	};
	
}

@Test(priority = 2)
private void Login() {
clickOnElement(pom.getInstanceSP().getSingin_btn());

}




}
