package Multiple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {

	
	public  WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	private WebElement signin;
	
	

	public Home_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getSignin() {
		return signin;
	}
}
